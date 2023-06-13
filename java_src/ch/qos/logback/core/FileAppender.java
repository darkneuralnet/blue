package ch.qos.logback.core;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Map;
/* loaded from: classes.dex */
public class FileAppender<E> extends OutputStreamAppender<E> {
    protected static String COLLISION_WITH_EARLIER_APPENDER_URL = "http://logback.qos.ch/codes.html#earlier_fa_collision";
    public static final long DEFAULT_BUFFER_SIZE = 8192;
    protected boolean append = true;
    protected String fileName = null;
    private boolean prudent = false;
    private boolean initialized = false;
    private boolean lazyInit = false;
    private FileSize bufferSize = new FileSize(DEFAULT_BUFFER_SIZE);

    private String getAbsoluteFilePath(String str) {
        return !new File(str).isAbsolute() ? FileUtil.prefixRelativePath(this.context.getProperty(CoreConstants.DATA_DIR_KEY), str) : str;
    }

    private void safeWrite(E e) throws IOException {
        ResilientFileOutputStream resilientFileOutputStream = (ResilientFileOutputStream) getOutputStream();
        FileChannel channel = resilientFileOutputStream.getChannel();
        if (channel == null) {
            return;
        }
        boolean interrupted = Thread.interrupted();
        FileLock fileLock = null;
        try {
            try {
                fileLock = channel.lock();
                long position = channel.position();
                long size = channel.size();
                if (size != position) {
                    channel.position(size);
                }
                super.writeOut(e);
                if (fileLock != null && fileLock.isValid()) {
                    fileLock.release();
                }
                if (!interrupted) {
                    return;
                }
            } catch (IOException e2) {
                resilientFileOutputStream.postIOFailure(e2);
                if (fileLock != null && fileLock.isValid()) {
                    fileLock.release();
                }
                if (!interrupted) {
                    return;
                }
            }
            Thread.currentThread().interrupt();
        } catch (Throwable th) {
            if (fileLock != null && fileLock.isValid()) {
                fileLock.release();
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public void addErrorForCollision(String str, String str2, String str3) {
        addError("'" + str + "' option has the same value \"" + str2 + "\" as that given for appender [" + str3 + "] defined earlier.");
    }

    public boolean checkForFileCollisionInPreviousFileAppenders() {
        Map map;
        boolean z = false;
        if (this.fileName == null || (map = (Map) this.context.getObject(CoreConstants.FA_FILENAME_COLLISION_MAP)) == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (this.fileName.equals(entry.getValue())) {
                addErrorForCollision("File", (String) entry.getValue(), (String) entry.getKey());
                z = true;
            }
        }
        if (this.name != null) {
            map.put(getName(), this.fileName);
        }
        return z;
    }

    public String getFile() {
        return this.fileName;
    }

    public boolean getLazy() {
        return this.lazyInit;
    }

    public boolean isAppend() {
        return this.append;
    }

    public boolean isPrudent() {
        return this.prudent;
    }

    public boolean openFile(String str) throws IOException {
        String absoluteFilePath = getAbsoluteFilePath(str);
        this.lock.lock();
        try {
            File file = new File(absoluteFilePath);
            if (!FileUtil.createMissingParentDirectories(file)) {
                addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
            }
            ResilientFileOutputStream resilientFileOutputStream = new ResilientFileOutputStream(file, this.append, this.bufferSize.getSize());
            resilientFileOutputStream.setContext(this.context);
            setOutputStream(resilientFileOutputStream);
            this.lock.unlock();
            return true;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public final String rawFileProperty() {
        return this.fileName;
    }

    public void setAppend(boolean z) {
        this.append = z;
    }

    public void setBufferSize(FileSize fileSize) {
        addInfo("Setting bufferSize to [" + fileSize.toString() + "]");
        this.bufferSize = fileSize;
    }

    public void setFile(String str) {
        this.fileName = str == null ? null : str.trim();
    }

    public void setLazy(boolean z) {
        this.lazyInit = z;
    }

    public void setPrudent(boolean z) {
        this.prudent = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void start() {
        String str;
        String file = getFile();
        boolean z = true;
        if (file != null) {
            String absoluteFilePath = getAbsoluteFilePath(file);
            addInfo("File property is set to [" + absoluteFilePath + "]");
            if (this.prudent && !isAppend()) {
                setAppend(true);
                addWarn("Setting \"Append\" property to true on account of \"Prudent\" mode");
            }
            if (this.lazyInit) {
                setOutputStream(new NOPOutputStream());
            } else if (checkForFileCollisionInPreviousFileAppenders()) {
                addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
                str = COLLISION_WITH_EARLIER_APPENDER_URL;
            } else {
                try {
                    openFile(absoluteFilePath);
                } catch (IOException e) {
                    addError("openFile(" + absoluteFilePath + "," + this.append + ") failed", e);
                }
            }
            z = false;
            if (z) {
                super.start();
                return;
            }
            return;
        }
        str = "\"File\" property not set for appender named [" + this.name + "]";
        addError(str);
        if (z) {
        }
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        super.stop();
        Map<String, String> filenameCollisionMap = ContextUtil.getFilenameCollisionMap(this.context);
        if (filenameCollisionMap == null || getName() == null) {
            return;
        }
        filenameCollisionMap.remove(getName());
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    public void subAppend(E e) {
        if (!this.initialized && this.lazyInit) {
            this.initialized = true;
            if (checkForFileCollisionInPreviousFileAppenders()) {
                addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
                addError(COLLISION_WITH_EARLIER_APPENDER_URL);
            } else {
                try {
                    openFile(getFile());
                    super.start();
                } catch (IOException e2) {
                    this.started = false;
                    addError("openFile(" + this.fileName + "," + this.append + ") failed", e2);
                }
            }
        }
        super.subAppend(e);
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    public void writeOut(E e) throws IOException {
        if (this.prudent) {
            safeWrite(e);
        } else {
            super.writeOut(e);
        }
    }
}

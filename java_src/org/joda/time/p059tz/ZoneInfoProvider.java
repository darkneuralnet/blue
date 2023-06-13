package org.joda.time.p059tz;

import com.fasterxml.jackson.core.JsonPointer;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;
/* renamed from: org.joda.time.tz.ZoneInfoProvider */
/* loaded from: classes8.dex */
public class ZoneInfoProvider implements Provider {
    private final File iFileDir;
    private final ClassLoader iLoader;
    private final String iResourcePath;
    private final Set<String> iZoneInfoKeys;
    private final Map<String, Object> iZoneInfoMap;

    public ZoneInfoProvider() throws IOException {
        this(DateTimeZone.DEFAULT_TZ_DATA_PATH);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001a: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:9:0x001a */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DateTimeZone loadZoneData(String str) {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3 = null;
        try {
            try {
                inputStream = openResource(str);
                try {
                    DateTimeZone readFrom = DateTimeZoneBuilder.readFrom(inputStream, str);
                    this.iZoneInfoMap.put(str, new SoftReference(readFrom));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return readFrom;
                } catch (IOException e) {
                    e = e;
                    uncaughtException(e);
                    this.iZoneInfoMap.remove(str);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream3 = inputStream2;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream3 != null) {
            }
            throw th;
        }
    }

    private static Map<String, Object> loadZoneInfoMap(InputStream inputStream) throws IOException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            readZoneInfoMap(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
            return concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private InputStream openResource(String str) throws IOException {
        String str2;
        if (this.iFileDir != null) {
            return new FileInputStream(new File(this.iFileDir, str));
        }
        final String concat = this.iResourcePath.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: org.joda.time.tz.ZoneInfoProvider.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public InputStream run() {
                if (ZoneInfoProvider.this.iLoader != null) {
                    return ZoneInfoProvider.this.iLoader.getResourceAsStream(concat);
                }
                return ClassLoader.getSystemResourceAsStream(concat);
            }
        });
        if (inputStream == null) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Resource not found: \"");
            sb.append(concat);
            sb.append("\" ClassLoader: ");
            ClassLoader classLoader = this.iLoader;
            if (classLoader != null) {
                str2 = classLoader.toString();
            } else {
                str2 = "system";
            }
            sb.append(str2);
            throw new IOException(sb.toString());
        }
        return inputStream;
    }

    private static void readZoneInfoMap(DataInputStream dataInputStream, Map<String, Object> map) throws IOException {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            strArr[i] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i2 = 0; i2 < readUnsignedShort2; i2++) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    @Override // org.joda.time.p059tz.Provider
    public Set<String> getAvailableIDs() {
        return this.iZoneInfoKeys;
    }

    @Override // org.joda.time.p059tz.Provider
    public DateTimeZone getZone(String str) {
        Object obj;
        if (str == null || (obj = this.iZoneInfoMap.get(str)) == null) {
            return null;
        }
        if (obj instanceof SoftReference) {
            DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
            if (dateTimeZone != null) {
                return dateTimeZone;
            }
            return loadZoneData(str);
        } else if (str.equals(obj)) {
            return loadZoneData(str);
        } else {
            return getZone((String) obj);
        }
    }

    public void uncaughtException(Exception exc) {
        exc.printStackTrace();
    }

    public ZoneInfoProvider(File file) throws IOException {
        if (file != null) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    this.iFileDir = file;
                    this.iResourcePath = null;
                    this.iLoader = null;
                    Map<String, Object> loadZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
                    this.iZoneInfoMap = loadZoneInfoMap;
                    this.iZoneInfoKeys = Collections.unmodifiableSortedSet(new TreeSet(loadZoneInfoMap.keySet()));
                    return;
                }
                throw new IOException("File doesn't refer to a directory: " + file);
            }
            throw new IOException("File directory doesn't exist: " + file);
        }
        throw new IllegalArgumentException("No file directory provided");
    }

    public ZoneInfoProvider(String str) throws IOException {
        this(str, null, false);
    }

    public ZoneInfoProvider(String str, ClassLoader classLoader) throws IOException {
        this(str, classLoader, true);
    }

    private ZoneInfoProvider(String str, ClassLoader classLoader, boolean z) throws IOException {
        if (str != null) {
            if (!str.endsWith("/")) {
                str = str + JsonPointer.SEPARATOR;
            }
            this.iFileDir = null;
            this.iResourcePath = str;
            if (classLoader == null && !z) {
                classLoader = getClass().getClassLoader();
            }
            this.iLoader = classLoader;
            Map<String, Object> loadZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
            this.iZoneInfoMap = loadZoneInfoMap;
            this.iZoneInfoKeys = Collections.unmodifiableSortedSet(new TreeSet(loadZoneInfoMap.keySet()));
            return;
        }
        throw new IllegalArgumentException("No resource path provided");
    }
}

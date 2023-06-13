package p000;

import android.annotation.SuppressLint;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0007B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0019"}, m28432d2 = {"LO64;", "", "", "processLock", "", "b", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "Z", "Ljava/io/File;", "Ljava/io/File;", "lockFile", "Ljava/util/concurrent/locks/Lock;", "c", "Ljava/util/concurrent/locks/Lock;", "threadLock", "Ljava/nio/channels/FileChannel;", "Ljava/nio/channels/FileChannel;", "lockChannel", "", "name", "lockDir", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", "e", "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: O64 */
/* loaded from: classes.dex */
public final class O64 {

    /* renamed from: e */
    public static final C5823a f25894e = new C5823a(null);

    /* renamed from: f */
    public static final Map<String, Lock> f25895f = new HashMap();

    /* renamed from: a */
    public final boolean f25896a;

    /* renamed from: b */
    public final File f25897b;
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: c */
    public final Lock f25898c;

    /* renamed from: d */
    public FileChannel f25899d;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"LO64$a;", "", "", "key", "Ljava/util/concurrent/locks/Lock;", "b", "TAG", "Ljava/lang/String;", "", "threadLocksMap", "Ljava/util/Map;", "<init>", "()V", "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: O64$a */
    /* loaded from: classes.dex */
    public static final class C5823a {
        public /* synthetic */ C5823a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final Lock m92905b(String str) {
            Lock lock;
            synchronized (O64.f25895f) {
                Map map = O64.f25895f;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    map.put(str, obj);
                }
                lock = (Lock) obj;
            }
            return lock;
        }

        private C5823a() {
        }
    }

    public O64(String name, File file, boolean z) {
        File file2;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f25896a = z;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f25897b = file2;
        this.f25898c = f25894e.m92905b(name);
    }

    /* renamed from: c */
    public static /* synthetic */ void m92908c(O64 o64, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = o64.f25896a;
        }
        o64.m92909b(z);
    }

    /* renamed from: b */
    public final void m92909b(boolean z) {
        this.f25898c.lock();
        if (z) {
            try {
                File file = this.f25897b;
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(this.f25897b).getChannel();
                    channel.lock();
                    this.f25899d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e) {
                this.f25899d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    /* renamed from: d */
    public final void m92907d() {
        try {
            FileChannel fileChannel = this.f25899d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f25898c.unlock();
    }
}

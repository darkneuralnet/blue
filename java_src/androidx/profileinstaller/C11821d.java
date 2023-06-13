package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import net.danlew.android.joda.DateUtils;
/* renamed from: androidx.profileinstaller.d */
/* loaded from: classes.dex */
public final class C11821d {

    /* renamed from: a */
    public static final NL4<C11824c> f55136a = NL4.m94048t();

    /* renamed from: b */
    public static final Object f55137b = new Object();

    /* renamed from: c */
    public static C11824c f55138c = null;

    /* renamed from: androidx.profileinstaller.d$a */
    /* loaded from: classes.dex */
    public static class C11822a {
        private C11822a() {
        }

        /* renamed from: a */
        public static PackageInfo m66782a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            PackageManager.PackageInfoFlags of;
            PackageInfo packageInfo;
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
            return packageInfo;
        }
    }

    /* renamed from: androidx.profileinstaller.d$b */
    /* loaded from: classes.dex */
    public static class C11823b {

        /* renamed from: a */
        public final int f55139a;

        /* renamed from: b */
        public final int f55140b;

        /* renamed from: c */
        public final long f55141c;

        /* renamed from: d */
        public final long f55142d;

        public C11823b(int i, int i2, long j, long j2) {
            this.f55139a = i;
            this.f55140b = i2;
            this.f55141c = j;
            this.f55142d = j2;
        }

        /* renamed from: a */
        public static C11823b m66781a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                C11823b c11823b = new C11823b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return c11823b;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        /* renamed from: b */
        public void m66780b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f55139a);
                dataOutputStream.writeInt(this.f55140b);
                dataOutputStream.writeLong(this.f55141c);
                dataOutputStream.writeLong(this.f55142d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C11823b)) {
                return false;
            }
            C11823b c11823b = (C11823b) obj;
            if (this.f55140b == c11823b.f55140b && this.f55141c == c11823b.f55141c && this.f55139a == c11823b.f55139a && this.f55142d == c11823b.f55142d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f55140b), Long.valueOf(this.f55141c), Integer.valueOf(this.f55139a), Long.valueOf(this.f55142d));
        }
    }

    /* renamed from: androidx.profileinstaller.d$c */
    /* loaded from: classes.dex */
    public static class C11824c {

        /* renamed from: a */
        public final int f55143a;

        /* renamed from: b */
        public final boolean f55144b;

        /* renamed from: c */
        public final boolean f55145c;

        public C11824c(int i, boolean z, boolean z2) {
            this.f55143a = i;
            this.f55145c = z2;
            this.f55144b = z;
        }
    }

    private C11821d() {
    }

    /* renamed from: a */
    public static long m66785a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return C11822a.m66782a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static C11824c m66784b(int i, boolean z, boolean z2) {
        C11824c c11824c = new C11824c(i, z, z2);
        f55138c = c11824c;
        f55136a.mo37215p(c11824c);
        return f55138c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:78)(1:18)|19|(1:77)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cc, code lost:
        r3 = com.google.p034ar.core.ImageMetadata.EDGE_MODE;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C11824c m66783c(Context context, boolean z) {
        boolean z2;
        boolean z3;
        C11823b m66781a;
        C11823b c11823b;
        int i;
        C11824c c11824c;
        if (!z && (c11824c = f55138c) != null) {
            return c11824c;
        }
        synchronized (f55137b) {
            if (!z) {
                C11824c c11824c2 = f55138c;
                if (c11824c2 != null) {
                    return c11824c2;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 0;
            if (i2 >= 28 && i2 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                if (file.exists() && length > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                if (file2.exists() && length2 > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                try {
                    long m66785a = m66785a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            m66781a = C11823b.m66781a(file3);
                        } catch (IOException unused) {
                            return m66784b(DateUtils.FORMAT_NUMERIC_DATE, z2, z3);
                        }
                    } else {
                        m66781a = null;
                    }
                    if (m66781a != null && m66781a.f55141c == m66785a && (i = m66781a.f55140b) != 2) {
                        i3 = i;
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        if (m66781a != null && m66781a.f55140b == 2 && i3 == 1 && length < m66781a.f55142d) {
                            i3 = 3;
                        }
                        c11823b = new C11823b(1, i3, m66785a, length2);
                        if (m66781a != null || !m66781a.equals(c11823b)) {
                            c11823b.m66780b(file3);
                        }
                        return m66784b(i3, z2, z3);
                    }
                    if (z3) {
                        i3 = 2;
                    }
                    if (z) {
                        i3 = 2;
                    }
                    if (m66781a != null) {
                        i3 = 3;
                    }
                    c11823b = new C11823b(1, i3, m66785a, length2);
                    if (m66781a != null) {
                    }
                    c11823b.m66780b(file3);
                    return m66784b(i3, z2, z3);
                } catch (PackageManager.NameNotFoundException unused2) {
                    return m66784b(65536, z2, z3);
                }
            }
            return m66784b(DateUtils.FORMAT_ABBREV_RELATIVE, false, false);
        }
    }
}

package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: iM6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42672iM6 {

    /* renamed from: a */
    public final long f87199a;

    /* renamed from: b */
    public final Context f87200b;

    /* renamed from: c */
    public File f87201c;

    public C42672iM6(Context context) throws PackageManager.NameNotFoundException {
        this.f87200b = context;
        this.f87199a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: o */
    public static void m34107o(File file) throws IOException {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m34107o(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    /* renamed from: u */
    public static File m34101u(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: v */
    public static String m34100v(String str) {
        return String.valueOf(str).concat(".apk");
    }

    /* renamed from: w */
    public static void m34099w(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
            return;
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return;
        }
        String valueOf = String.valueOf(file.getAbsolutePath());
        throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
    }

    /* renamed from: a */
    public final void m34121a() throws IOException {
        File m34104r = m34104r();
        String[] list = m34104r.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f87199a))) {
                    File file = new File(m34104r, str);
                    String valueOf = String.valueOf(file);
                    long j = this.f87199a;
                    StringBuilder sb = new StringBuilder(valueOf.length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(valueOf);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    Log.d("SplitCompat", sb.toString());
                    m34107o(file);
                }
            }
        }
    }

    /* renamed from: b */
    public final File m34120b(String str) throws IOException {
        return m34101u(m34115g(), m34100v(str));
    }

    /* renamed from: c */
    public final File m34119c(String str) throws IOException {
        return m34101u(m34106p(), m34100v(str));
    }

    /* renamed from: d */
    public final File m34118d(File file) throws IOException {
        return m34101u(m34106p(), file.getName());
    }

    /* renamed from: e */
    public final File m34117e(String str, String str2) throws IOException {
        return m34101u(m34102t(str), str2);
    }

    /* renamed from: f */
    public final File m34116f() throws IOException {
        return new File(m34105q(), "lock.tmp");
    }

    /* renamed from: g */
    public final File m34115g() throws IOException {
        File file = new File(m34105q(), "unverified-splits");
        m34099w(file);
        return file;
    }

    /* renamed from: h */
    public final File m34114h(String str) throws IOException {
        File file = new File(m34105q(), "dex");
        m34099w(file);
        File m34101u = m34101u(file, str);
        m34099w(m34101u);
        return m34101u;
    }

    /* renamed from: i */
    public final Set<VO6> m34113i() throws IOException {
        String name;
        File m34106p = m34106p();
        HashSet hashSet = new HashSet();
        File[] listFiles = m34106p.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    hashSet.add(new VO6(file, file.getName().substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: j */
    public final List<String> m34112j() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = m34103s().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public final void m34111k(String str) throws IOException {
        m34107o(m34102t(str));
    }

    /* renamed from: l */
    public final void m34110l(File file) throws IOException {
        MK6.m95439c(file.getParentFile().getParentFile().equals(m34103s()), "File to remove is not a native library");
        m34107o(file);
    }

    /* renamed from: m */
    public final Set<File> m34109m(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] listFiles = m34102t(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: n */
    public final void m34108n(String str) throws IOException {
        m34107o(m34119c(str));
    }

    /* renamed from: p */
    public final File m34106p() throws IOException {
        File file = new File(m34105q(), "verified-splits");
        m34099w(file);
        return file;
    }

    /* renamed from: q */
    public final File m34105q() throws IOException {
        File file = new File(m34104r(), Long.toString(this.f87199a));
        m34099w(file);
        return file;
    }

    /* renamed from: r */
    public final File m34104r() throws IOException {
        if (this.f87201c == null) {
            Context context = this.f87200b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.f87201c = context.getFilesDir();
        }
        File file = new File(this.f87201c, "splitcompat");
        m34099w(file);
        return file;
    }

    /* renamed from: s */
    public final File m34103s() throws IOException {
        File file = new File(m34105q(), "native-libraries");
        m34099w(file);
        return file;
    }

    /* renamed from: t */
    public final File m34102t(String str) throws IOException {
        File m34101u = m34101u(m34103s(), str);
        m34099w(m34101u);
        return m34101u;
    }
}

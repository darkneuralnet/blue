package p000;

import android.content.Context;
import android.support.annotation.Nullable;
import co.bird.android.model.AssetTaskKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
/* renamed from: HK6 */
/* loaded from: classes6.dex */
public final class HK6 {

    /* renamed from: c */
    public static final C42061hK6 f13279c = new C42061hK6("AssetPackStorage");

    /* renamed from: d */
    public static final long f13280d;

    /* renamed from: e */
    public static final long f13281e;

    /* renamed from: a */
    public final Context f13282a;

    /* renamed from: b */
    public final MM6 f13283b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f13280d = timeUnit.toMillis(14L);
        f13281e = timeUnit.toMillis(28L);
    }

    public HK6(Context context, MM6 mm6) {
        this.f13282a = context;
        this.f13283b = mm6;
    }

    /* renamed from: g */
    public static void m104011g(File file) {
        File[] listFiles;
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long m104008j = m104008j(file);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(m104008j)) && !file2.getName().equals("stale.tmp")) {
                m104003o(file2);
            }
        }
    }

    /* renamed from: h */
    public static long m104010h(File file) {
        return m104009i(file, true);
    }

    /* renamed from: i */
    public static long m104009i(File file, boolean z) {
        File[] listFiles;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            if (z && file.listFiles().length > 1) {
                f13279c.m36534e("Multiple pack versions found, using highest version code.", new Object[0]);
            }
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e) {
                f13279c.m36536c(e, "Corrupt asset pack directories.", new Object[0]);
            }
            if (arrayList.isEmpty()) {
                return -1L;
            }
            Collections.sort(arrayList);
            return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
        }
        return -1L;
    }

    /* renamed from: j */
    public static long m104008j(File file) {
        return m104009i(file, false);
    }

    /* renamed from: o */
    public static boolean m104003o(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                z &= m104003o(file2);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    /* renamed from: A */
    public final File m104028A(String str, int i, long j, String str2) {
        return new File(m104026C(str, i, j, str2), "checkpoint.dat");
    }

    /* renamed from: B */
    public final File m104027B(String str, int i, long j, String str2) {
        return new File(m104026C(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* renamed from: C */
    public final File m104026C(String str, int i, long j, String str2) {
        return new File(m104025D(str, i, j), str2);
    }

    /* renamed from: D */
    public final File m104025D(String str, int i, long j) {
        return new File(new File(m104006l(str, i, j), "_slices"), "_metadata");
    }

    /* renamed from: E */
    public final void m104024E(String str, int i, long j) {
        File[] listFiles;
        File[] listFiles2;
        File m104013e = m104013e(str);
        if (m104013e.exists()) {
            for (File file : m104013e.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    m104003o(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            m104003o(file2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public final void m104023F() {
        for (File file : m104007k()) {
            if (file.listFiles() != null) {
                m104011g(file);
                long m104008j = m104008j(file);
                if (this.f13283b.m95397a() != m104008j) {
                    try {
                        new File(new File(file, String.valueOf(m104008j)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f13279c.m36537b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    m104011g(file2);
                }
            }
        }
    }

    /* renamed from: G */
    public final int m104022G(String str) {
        return (int) m104010h(m104013e(str));
    }

    /* renamed from: H */
    public final long m104021H(String str) {
        return m104010h(m104014d(str, m104022G(str)));
    }

    /* renamed from: I */
    public final void m104020I() {
        File[] listFiles;
        for (File file : m104007k()) {
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    File file3 = new File(file2, "stale.tmp");
                    if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > f13281e) {
                        m104003o(file2);
                    }
                }
            }
        }
    }

    /* renamed from: J */
    public final void m104019J() {
        File[] listFiles;
        if (m104005m().exists()) {
            for (File file : m104005m().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f13280d) {
                    m104003o(file);
                } else {
                    m104011g(file);
                }
            }
        }
    }

    /* renamed from: K */
    public final void m104018K() {
        m104003o(m104004n());
    }

    /* renamed from: a */
    public final void m104017a(List<String> list) {
        int m95397a = this.f13283b.m95397a();
        for (File file : m104007k()) {
            if (!list.contains(file.getName()) && m104010h(file) != m95397a) {
                m104003o(file);
            }
        }
    }

    /* renamed from: b */
    public final void m104016b(String str, int i, long j) {
        if (m104006l(str, i, j).exists()) {
            m104003o(m104006l(str, i, j));
        }
    }

    /* renamed from: c */
    public final void m104015c(String str, int i, long j) {
        if (m103998t(str, i, j).exists()) {
            m104003o(m103998t(str, i, j));
        }
    }

    /* renamed from: d */
    public final File m104014d(String str, int i) {
        return new File(m104013e(str), String.valueOf(i));
    }

    /* renamed from: e */
    public final File m104013e(String str) {
        return new File(m104004n(), str);
    }

    /* renamed from: f */
    public final File m104012f(String str, int i, long j) {
        return new File(m103994x(str, i, j), "merge.tmp");
    }

    /* renamed from: k */
    public final List<File> m104007k() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e) {
            f13279c.m36537b("Could not process directory while scanning installed packs. %s", e);
        }
        if (m104004n().exists() && m104004n().listFiles() != null) {
            for (File file : m104004n().listFiles()) {
                if (!file.getCanonicalPath().equals(m104005m().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: l */
    public final File m104006l(String str, int i, long j) {
        return new File(new File(new File(m104005m(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: m */
    public final File m104005m() {
        return new File(m104004n(), "_tmp");
    }

    /* renamed from: n */
    public final File m104004n() {
        return new File(this.f13282a.getFilesDir(), "assetpacks");
    }

    /* renamed from: p */
    public final Map<String, AbstractC7276Ro> m104002p() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : m104007k()) {
                AbstractC7276Ro m104000r = m104000r(file.getName());
                if (m104000r != null) {
                    hashMap.put(file.getName(), m104000r);
                }
            }
        } catch (IOException e) {
            f13279c.m36537b("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* renamed from: q */
    public final Map<String, Long> m104001q() {
        HashMap hashMap = new HashMap();
        for (String str : m104002p().keySet()) {
            hashMap.put(str, Long.valueOf(m104021H(str)));
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: r */
    public final AbstractC7276Ro m104000r(String str) throws IOException {
        String m103999s = m103999s(str);
        if (m103999s == null) {
            return null;
        }
        File file = new File(m103999s, AssetTaskKt.ASSET_PATH);
        if (file.isDirectory()) {
            return AbstractC7276Ro.m86288b(m103999s, file.getCanonicalPath());
        }
        f13279c.m36537b("Failed to find assets directory: %s", file);
        return null;
    }

    @Nullable
    /* renamed from: s */
    public final String m103999s(String str) throws IOException {
        int length;
        File file = new File(m104004n(), str);
        if (!file.exists()) {
            f13279c.m36538a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f13283b.m95397a()));
        if (!file2.exists()) {
            f13279c.m36538a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f13283b.m95397a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f13279c.m36538a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f13283b.m95397a()));
            return null;
        } else if (length > 1) {
            f13279c.m36537b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f13283b.m95397a()));
            return null;
        } else {
            return listFiles[0].getCanonicalPath();
        }
    }

    /* renamed from: t */
    public final File m103998t(String str, int i, long j) {
        return new File(m104014d(str, i), String.valueOf(j));
    }

    /* renamed from: u */
    public final File m103997u(String str, int i, long j) {
        return new File(m103998t(str, i, j), "_metadata");
    }

    /* renamed from: v */
    public final File m103996v(String str, int i, long j, String str2) {
        return new File(new File(new File(m104006l(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* renamed from: w */
    public final File m103995w(String str, int i, long j, String str2) {
        return new File(new File(new File(m104006l(str, i, j), "_slices"), "_verified"), str2);
    }

    /* renamed from: x */
    public final File m103994x(String str, int i, long j) {
        return new File(m104006l(str, i, j), "_packs");
    }

    /* renamed from: y */
    public final int m103993y(String str, int i, long j) throws IOException {
        File m104012f = m104012f(str, i, j);
        if (m104012f.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(m104012f);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("numberOfMerges") != null) {
                    try {
                        return Integer.parseInt(properties.getProperty("numberOfMerges"));
                    } catch (NumberFormatException e) {
                        throw new C49185tL6("Merge checkpoint file corrupt.", e);
                    }
                }
                throw new C49185tL6("Merge checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    RL6.m86831a(th, th2);
                }
                throw th;
            }
        }
        return 0;
    }

    /* renamed from: z */
    public final void m103992z(String str, int i, long j, int i2) throws IOException {
        File m104012f = m104012f(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        m104012f.getParentFile().mkdirs();
        m104012f.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(m104012f);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }
}

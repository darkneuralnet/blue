package p000;

import java.io.File;
import java.io.IOException;
/* renamed from: FM6 */
/* loaded from: classes6.dex */
public final class FM6 {

    /* renamed from: b */
    public static final C42061hK6 f9250b = new C42061hK6("MergeSliceTaskHandler");

    /* renamed from: a */
    public final HK6 f9251a;

    public FM6(HK6 hk6) {
        this.f9251a = hk6;
    }

    /* renamed from: b */
    public static void m107275b(File file, File file2) {
        File[] listFiles;
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String valueOf = String.valueOf(file2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 51);
                sb.append("File clashing with existing file from other slice: ");
                sb.append(valueOf);
                throw new C49185tL6(sb.toString());
            } else if (file.renameTo(file2)) {
                return;
            } else {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 21);
                sb2.append("Unable to move file: ");
                sb2.append(valueOf2);
                throw new C49185tL6(sb2.toString());
            }
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            m107275b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String valueOf3 = String.valueOf(file);
        StringBuilder sb3 = new StringBuilder(valueOf3.length() + 28);
        sb3.append("Unable to delete directory: ");
        sb3.append(valueOf3);
        throw new C49185tL6(sb3.toString());
    }

    /* renamed from: a */
    public final void m107276a(EM6 em6) {
        File m103995w = this.f9251a.m103995w(em6.f110336b, em6.f7352c, em6.f7353d, em6.f7354e);
        if (!m103995w.exists()) {
            throw new C49185tL6(String.format("Cannot find verified files for slice %s.", em6.f7354e), em6.f110335a);
        }
        File m103994x = this.f9251a.m103994x(em6.f110336b, em6.f7352c, em6.f7353d);
        if (!m103994x.exists()) {
            m103994x.mkdirs();
        }
        m107275b(m103995w, m103994x);
        try {
            this.f9251a.m103992z(em6.f110336b, em6.f7352c, em6.f7353d, this.f9251a.m103993y(em6.f110336b, em6.f7352c, em6.f7353d) + 1);
        } catch (IOException e) {
            f9250b.m36537b("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new C49185tL6("Writing merge checkpoint failed.", e, em6.f110335a);
        }
    }
}

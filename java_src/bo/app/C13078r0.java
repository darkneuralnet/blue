package bo.app;

import bo.app.C12861l0;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bo.app.r0 */
/* loaded from: classes.dex */
public final class C13078r0 {

    /* renamed from: a */
    final String f59200a;

    /* renamed from: b */
    final long[] f59201b;

    /* renamed from: c */
    boolean f59202c;

    /* renamed from: d */
    C12861l0.C12864c f59203d;

    /* renamed from: e */
    long f59204e;

    /* renamed from: f */
    private final int f59205f;

    /* renamed from: g */
    private final File f59206g;

    public C13078r0(String str, int i, File file) {
        this.f59200a = str;
        this.f59205f = i;
        this.f59206g = file;
        this.f59201b = new long[i];
    }

    /* renamed from: a */
    public String m63043a() {
        long[] jArr;
        StringBuilder sb = new StringBuilder();
        for (long j : this.f59201b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public void m63039b(String[] strArr) {
        if (strArr.length == this.f59205f) {
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f59201b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m63041a(strArr);
                }
            }
            return;
        }
        throw m63041a(strArr);
    }

    /* renamed from: a */
    public IOException m63041a(String[] strArr) {
        throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
    }

    /* renamed from: a */
    public File m63042a(int i) {
        File file = this.f59206g;
        return new File(file, this.f59200a + InstructionFileId.DOT + i);
    }

    /* renamed from: b */
    public File m63040b(int i) {
        File file = this.f59206g;
        return new File(file, this.f59200a + InstructionFileId.DOT + i + ".tmp");
    }
}

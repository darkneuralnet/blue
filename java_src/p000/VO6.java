package p000;

import android.support.annotation.NonNull;
import java.io.File;
/* renamed from: VO6 */
/* loaded from: classes6.dex */
public final class VO6 {

    /* renamed from: a */
    public final File f39055a;

    /* renamed from: b */
    public final String f39056b;

    public VO6() {
    }

    public VO6(File file, String str) {
        this();
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.f39055a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f39056b = str;
    }

    @NonNull
    /* renamed from: a */
    public File m79887a() {
        return this.f39055a;
    }

    @NonNull
    /* renamed from: b */
    public String m79886b() {
        return this.f39056b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VO6) {
            VO6 vo6 = (VO6) obj;
            if (this.f39055a.equals(vo6.m79887a()) && this.f39056b.equals(vo6.m79886b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f39055a.hashCode() ^ 1000003) * 1000003) ^ this.f39056b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f39055a);
        String str = this.f39056b;
        StringBuilder sb = new StringBuilder(valueOf.length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

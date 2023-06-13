package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.io.Serializable;
import java.text.ParseException;
/* renamed from: Fg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32839Fg2 implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public C50367vL3 f9944b = null;

    /* renamed from: c */
    public C3824Iy[] f9945c = null;

    /* renamed from: e */
    public static C3824Iy[] m106752e(String str) throws ParseException {
        String trim = str.trim();
        int indexOf = trim.indexOf(InstructionFileId.DOT);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = trim.indexOf(InstructionFileId.DOT, i);
            if (indexOf2 != -1) {
                int i2 = indexOf2 + 1;
                int indexOf3 = trim.indexOf(InstructionFileId.DOT, i2);
                if (indexOf3 == -1) {
                    return new C3824Iy[]{new C3824Iy(trim.substring(0, indexOf)), new C3824Iy(trim.substring(i, indexOf2)), new C3824Iy(trim.substring(i2))};
                }
                int i3 = indexOf3 + 1;
                int indexOf4 = trim.indexOf(InstructionFileId.DOT, i3);
                if (indexOf4 != -1) {
                    if (indexOf4 == -1 || trim.indexOf(InstructionFileId.DOT, indexOf4 + 1) == -1) {
                        return new C3824Iy[]{new C3824Iy(trim.substring(0, indexOf)), new C3824Iy(trim.substring(i, indexOf2)), new C3824Iy(trim.substring(i2, indexOf3)), new C3824Iy(trim.substring(i3, indexOf4)), new C3824Iy(trim.substring(indexOf4 + 1))};
                    }
                    throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
                }
                throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
            }
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
    }

    /* renamed from: a */
    public String m106755a() {
        C3824Iy[] c3824IyArr;
        if (this.f9945c == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (C3824Iy c3824Iy : this.f9945c) {
            if (sb.length() > 0) {
                sb.append(CoreConstants.DOT);
            }
            if (c3824Iy != null) {
                sb.append(c3824Iy);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public C50367vL3 m106754b() {
        return this.f9944b;
    }

    /* renamed from: c */
    public void m106753c(C3824Iy... c3824IyArr) {
        this.f9945c = c3824IyArr;
    }

    /* renamed from: d */
    public void mo97635d(C50367vL3 c50367vL3) {
        this.f9944b = c50367vL3;
    }
}

package p000;
/* renamed from: hM2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42075hM2 {

    /* renamed from: a */
    public final String f85034a;

    /* renamed from: b */
    public final float f85035b;

    /* renamed from: c */
    public final float f85036c;

    public C42075hM2(String str, float f, float f2) {
        this.f85034a = str;
        this.f85036c = f2;
        this.f85035b = f;
    }

    /* renamed from: a */
    public boolean m36527a(String str) {
        if (this.f85034a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f85034a.endsWith("\r")) {
            String str2 = this.f85034a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}

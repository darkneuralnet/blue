package p000;
/* renamed from: Bi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31919Bi0 {

    /* renamed from: a */
    public final C52951zi0 f2702a;

    /* renamed from: b */
    public final String[][] f2703b;

    public C31919Bi0(C52951zi0 c52951zi0, String[][] strArr) {
        this.f2702a = c52951zi0;
        this.f2703b = strArr;
    }

    /* renamed from: a */
    public boolean m113662a() {
        boolean z = true;
        for (String[] strArr : this.f2703b) {
            z &= this.f2702a.m534a(strArr);
        }
        return z;
    }
}

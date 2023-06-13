package p000;
/* renamed from: vi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50579vi0 {

    /* renamed from: a */
    public final C52951zi0 f114524a;

    /* renamed from: b */
    public final String[][] f114525b;

    public C50579vi0(C52951zi0 c52951zi0, String[][] strArr) {
        this.f114524a = c52951zi0;
        this.f114525b = strArr;
    }

    /* renamed from: a */
    public boolean m8247a() {
        boolean z = true;
        for (String[] strArr : this.f114525b) {
            z &= this.f114524a.m534a(strArr);
        }
        return z;
    }
}

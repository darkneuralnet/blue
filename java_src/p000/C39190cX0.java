package p000;
/* renamed from: cX0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39190cX0 implements InterfaceC48022rO1 {
    @Override // p000.InterfaceC48022rO1
    /* renamed from: a */
    public float mo16015a(MO1 mo1, InterfaceC44743lr2 interfaceC44743lr2) {
        float mo28586h = interfaceC44743lr2.mo28586h();
        float mo28587g = interfaceC44743lr2.mo28587g();
        C44150kr2 mo26738k = interfaceC44743lr2.mo26738k();
        if (mo1.mo21240U() > 0.0f && mo1.mo21239Y() < 0.0f) {
            return 0.0f;
        }
        if (mo26738k.m33545n() > 0.0f) {
            mo28586h = 0.0f;
        }
        if (mo26738k.m33543p() < 0.0f) {
            mo28587g = 0.0f;
        }
        if (mo1.mo21239Y() >= 0.0f) {
            return mo28587g;
        }
        return mo28586h;
    }
}

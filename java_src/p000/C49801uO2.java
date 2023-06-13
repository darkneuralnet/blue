package p000;
/* renamed from: uO2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49801uO2 {

    /* renamed from: a */
    public float f112292a;

    /* renamed from: b */
    public int f112293b;

    /* renamed from: a */
    public void m10360a(float f) {
        float f2 = this.f112292a + f;
        this.f112292a = f2;
        int i = this.f112293b + 1;
        this.f112293b = i;
        if (i == Integer.MAX_VALUE) {
            this.f112292a = f2 / 2.0f;
            this.f112293b = i / 2;
        }
    }
}

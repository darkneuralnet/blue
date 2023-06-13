package p000;
/* renamed from: qm0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47656qm0 {

    /* renamed from: a */
    public float f105765a;

    /* renamed from: b */
    public float f105766b;

    /* renamed from: c */
    public float f105767c;

    /* renamed from: d */
    public float f105768d;

    public C47656qm0() {
        m17109c();
    }

    /* renamed from: a */
    public void m17111a(float f, float f2, float f3) {
        m17110b(f, f2, f3, 1.0f);
    }

    /* renamed from: b */
    public void m17110b(float f, float f2, float f3, float f4) {
        this.f105765a = Math.max(0.0f, Math.min(1.0f, f));
        this.f105766b = Math.max(0.0f, Math.min(1.0f, f2));
        this.f105767c = Math.max(0.0f, Math.min(1.0f, f3));
        this.f105768d = Math.max(0.0f, Math.min(1.0f, f4));
    }

    /* renamed from: c */
    public final void m17109c() {
        m17111a(1.0f, 1.0f, 1.0f);
    }
}

package p000;

import com.android.volley.VolleyError;
/* renamed from: uY0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49889uY0 implements QN4 {

    /* renamed from: a */
    public int f112596a;

    /* renamed from: b */
    public int f112597b;

    /* renamed from: c */
    public final int f112598c;

    /* renamed from: d */
    public final float f112599d;

    public C49889uY0() {
        this(2500, 1, 1.0f);
    }

    @Override // p000.QN4
    /* renamed from: a */
    public int mo10096a() {
        return this.f112597b;
    }

    @Override // p000.QN4
    /* renamed from: b */
    public void mo10095b(VolleyError volleyError) throws VolleyError {
        this.f112597b++;
        int i = this.f112596a;
        this.f112596a = i + ((int) (i * this.f112599d));
        if (m10093d()) {
            return;
        }
        throw volleyError;
    }

    @Override // p000.QN4
    /* renamed from: c */
    public int mo10094c() {
        return this.f112596a;
    }

    /* renamed from: d */
    public boolean m10093d() {
        return this.f112597b <= this.f112598c;
    }

    public C49889uY0(int i, int i2, float f) {
        this.f112596a = i;
        this.f112598c = i2;
        this.f112599d = f;
    }
}

package p000;

import android.animation.Animator;
/* renamed from: p12  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC46621p12<T extends Animator> {

    /* renamed from: a */
    public C47214q12 f102949a;

    /* renamed from: b */
    public final float[] f102950b;

    /* renamed from: c */
    public final int[] f102951c;

    public AbstractC46621p12(int i) {
        this.f102950b = new float[i * 2];
        this.f102951c = new int[i];
    }

    /* renamed from: a */
    public abstract void mo20155a();

    /* renamed from: b */
    public float m20154b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    /* renamed from: c */
    public abstract void mo20153c();

    /* renamed from: d */
    public abstract void mo20152d(AbstractC27016oe abstractC27016oe);

    /* renamed from: e */
    public void m20151e(C47214q12 c47214q12) {
        this.f102949a = c47214q12;
    }

    /* renamed from: f */
    public abstract void mo20150f();

    /* renamed from: g */
    public abstract void mo20149g();

    /* renamed from: h */
    public abstract void mo20148h();
}

package p000;

import android.graphics.drawable.Drawable;
/* renamed from: AA */
/* loaded from: classes5.dex */
public abstract class AbstractC0045AA {

    /* renamed from: b */
    public float f222b;

    /* renamed from: c */
    public Object f223c;

    /* renamed from: d */
    public Drawable f224d;

    public AbstractC0045AA() {
        this.f222b = 0.0f;
        this.f223c = null;
        this.f224d = null;
    }

    /* renamed from: a */
    public Object m116048a() {
        return this.f223c;
    }

    /* renamed from: b */
    public Drawable m116047b() {
        return this.f224d;
    }

    /* renamed from: c */
    public float mo51938c() {
        return this.f222b;
    }

    /* renamed from: d */
    public void m116046d(Object obj) {
        this.f223c = obj;
    }

    /* renamed from: e */
    public void m116045e(float f) {
        this.f222b = f;
    }

    public AbstractC0045AA(float f) {
        this.f223c = null;
        this.f224d = null;
        this.f222b = f;
    }

    public AbstractC0045AA(float f, Drawable drawable) {
        this(f);
        this.f224d = drawable;
    }
}

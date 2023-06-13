package p000;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import p000.AbstractC46690p81;
/* renamed from: eO5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40317eO5 extends AbstractC46690p81<C40317eO5> {

    /* renamed from: A */
    public C41503gO5 f78323A;

    /* renamed from: B */
    public float f78324B;

    /* renamed from: C */
    public boolean f78325C;

    public <K> C40317eO5(K k, AbstractC48330ru1<K> abstractC48330ru1) {
        super(k, abstractC48330ru1);
        this.f78323A = null;
        this.f78324B = Float.MAX_VALUE;
        this.f78325C = false;
    }

    @Override // p000.AbstractC46690p81
    /* renamed from: i */
    public void mo19921i() {
        m42940o();
        this.f78323A.m39503g(m19926d());
        super.mo19921i();
    }

    @Override // p000.AbstractC46690p81
    /* renamed from: k */
    public boolean mo19919k(long j) {
        if (this.f78325C) {
            float f = this.f78324B;
            if (f != Float.MAX_VALUE) {
                this.f78323A.m39505e(f);
                this.f78324B = Float.MAX_VALUE;
            }
            this.f103170b = this.f78323A.m39509a();
            this.f103169a = 0.0f;
            this.f78325C = false;
            return true;
        }
        if (this.f78324B != Float.MAX_VALUE) {
            this.f78323A.m39509a();
            long j2 = j / 2;
            AbstractC46690p81.C27167o m39502h = this.f78323A.m39502h(this.f103170b, this.f103169a, j2);
            this.f78323A.m39505e(this.f78324B);
            this.f78324B = Float.MAX_VALUE;
            AbstractC46690p81.C27167o m39502h2 = this.f78323A.m39502h(m39502h.f103181a, m39502h.f103182b, j2);
            this.f103170b = m39502h2.f103181a;
            this.f103169a = m39502h2.f103182b;
        } else {
            AbstractC46690p81.C27167o m39502h3 = this.f78323A.m39502h(this.f103170b, this.f103169a, j);
            this.f103170b = m39502h3.f103181a;
            this.f103169a = m39502h3.f103182b;
        }
        float max = Math.max(this.f103170b, this.f103176h);
        this.f103170b = max;
        float min = Math.min(max, this.f103175g);
        this.f103170b = min;
        if (!m42941n(min, this.f103169a)) {
            return false;
        }
        this.f103170b = this.f78323A.m39509a();
        this.f103169a = 0.0f;
        return true;
    }

    /* renamed from: l */
    public void m42943l(float f) {
        if (m19925e()) {
            this.f78324B = f;
            return;
        }
        if (this.f78323A == null) {
            this.f78323A = new C41503gO5(f);
        }
        this.f78323A.m39505e(f);
        mo19921i();
    }

    /* renamed from: m */
    public boolean m42942m() {
        return this.f78323A.f82120b > 0.0d;
    }

    /* renamed from: n */
    public boolean m42941n(float f, float f2) {
        return this.f78323A.m39507c(f, f2);
    }

    /* renamed from: o */
    public final void m42940o() {
        C41503gO5 c41503gO5 = this.f78323A;
        if (c41503gO5 != null) {
            double m39509a = c41503gO5.m39509a();
            if (m39509a <= this.f103175g) {
                if (m39509a >= this.f103176h) {
                    return;
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    /* renamed from: p */
    public C40317eO5 m42939p(C41503gO5 c41503gO5) {
        this.f78323A = c41503gO5;
        return this;
    }

    /* renamed from: q */
    public void m42938q() {
        if (m42942m()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f103174f) {
                    this.f78325C = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}

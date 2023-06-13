package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: Os6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35057Os6 {

    /* renamed from: c */
    public Interpolator f27503c;

    /* renamed from: d */
    public InterfaceC35291Ps6 f27504d;

    /* renamed from: e */
    public boolean f27505e;

    /* renamed from: b */
    public long f27502b = -1;

    /* renamed from: f */
    public final C35525Qs6 f27506f = new C6197a();

    /* renamed from: a */
    public final ArrayList<C34823Ns6> f27501a = new ArrayList<>();

    /* renamed from: Os6$a */
    /* loaded from: classes.dex */
    public class C6197a extends C35525Qs6 {

        /* renamed from: a */
        public boolean f27507a = false;

        /* renamed from: b */
        public int f27508b = 0;

        public C6197a() {
        }

        @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            int i = this.f27508b + 1;
            this.f27508b = i;
            if (i == C35057Os6.this.f27501a.size()) {
                InterfaceC35291Ps6 interfaceC35291Ps6 = C35057Os6.this.f27504d;
                if (interfaceC35291Ps6 != null) {
                    interfaceC35291Ps6.mo4254b(null);
                }
                m91235d();
            }
        }

        @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            if (this.f27507a) {
                return;
            }
            this.f27507a = true;
            InterfaceC35291Ps6 interfaceC35291Ps6 = C35057Os6.this.f27504d;
            if (interfaceC35291Ps6 != null) {
                interfaceC35291Ps6.mo4253c(null);
            }
        }

        /* renamed from: d */
        public void m91235d() {
            this.f27508b = 0;
            this.f27507a = false;
            C35057Os6.this.m91242b();
        }
    }

    /* renamed from: a */
    public void m91243a() {
        if (!this.f27505e) {
            return;
        }
        Iterator<C34823Ns6> it = this.f27501a.iterator();
        while (it.hasNext()) {
            it.next().m93247c();
        }
        this.f27505e = false;
    }

    /* renamed from: b */
    public void m91242b() {
        this.f27505e = false;
    }

    /* renamed from: c */
    public C35057Os6 m91241c(C34823Ns6 c34823Ns6) {
        if (!this.f27505e) {
            this.f27501a.add(c34823Ns6);
        }
        return this;
    }

    /* renamed from: d */
    public C35057Os6 m91240d(C34823Ns6 c34823Ns6, C34823Ns6 c34823Ns62) {
        this.f27501a.add(c34823Ns6);
        c34823Ns62.m93240j(c34823Ns6.m93246d());
        this.f27501a.add(c34823Ns62);
        return this;
    }

    /* renamed from: e */
    public C35057Os6 m91239e(long j) {
        if (!this.f27505e) {
            this.f27502b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C35057Os6 m91238f(Interpolator interpolator) {
        if (!this.f27505e) {
            this.f27503c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C35057Os6 m91237g(InterfaceC35291Ps6 interfaceC35291Ps6) {
        if (!this.f27505e) {
            this.f27504d = interfaceC35291Ps6;
        }
        return this;
    }

    /* renamed from: h */
    public void m91236h() {
        if (this.f27505e) {
            return;
        }
        Iterator<C34823Ns6> it = this.f27501a.iterator();
        while (it.hasNext()) {
            C34823Ns6 next = it.next();
            long j = this.f27502b;
            if (j >= 0) {
                next.m93244f(j);
            }
            Interpolator interpolator = this.f27503c;
            if (interpolator != null) {
                next.m93243g(interpolator);
            }
            if (this.f27504d != null) {
                next.m93242h(this.f27506f);
            }
            next.m93238l();
        }
        this.f27505e = true;
    }
}

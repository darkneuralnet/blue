package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.KF4;
/* renamed from: oP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46251oP0 {

    /* renamed from: oP0$a */
    /* loaded from: classes3.dex */
    public static final class C26931a implements KF4.InterfaceC4385a.InterfaceC4386a {
        @Override // p000.KF4.InterfaceC4385a.InterfaceC4386a
        /* renamed from: a */
        public KF4.InterfaceC4385a mo21223a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C50740vy1 c50740vy1, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c50740vy1);
            C51679xZ3.m5005b(dq3);
            return new C26932b(interfaceC44393lG2, baseActivity, scopeProvider, c50740vy1, dq3);
        }

        private C26931a() {
        }
    }

    /* renamed from: oP0$b */
    /* loaded from: classes3.dex */
    public static final class C26932b implements KF4.InterfaceC4385a {

        /* renamed from: a */
        public final BaseActivity f101878a;

        /* renamed from: b */
        public final C50740vy1 f101879b;

        /* renamed from: c */
        public final ScopeProvider f101880c;

        /* renamed from: d */
        public final InterfaceC44393lG2 f101881d;

        /* renamed from: e */
        public final DQ3 f101882e;

        /* renamed from: f */
        public final C26932b f101883f;

        @Override // p000.KF4.InterfaceC4385a
        /* renamed from: a */
        public void mo21222a(KF4 kf4) {
            m21221b(kf4);
        }

        /* renamed from: b */
        public final KF4 m21221b(KF4 kf4) {
            LF4.m97504b(kf4, m21220c());
            return kf4;
        }

        /* renamed from: c */
        public final QF4 m21220c() {
            return new QF4(m21219d(), this.f101880c, (InterfaceC40099e13) C51679xZ3.m5003d(this.f101881d.mo27461w2()), (InterfaceC48265rn6) C51679xZ3.m5003d(this.f101881d.mo27515e3()), this.f101882e);
        }

        /* renamed from: d */
        public final SF4 m21219d() {
            return new SF4(this.f101878a, this.f101879b);
        }

        public C26932b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C50740vy1 c50740vy1, DQ3 dq3) {
            this.f101883f = this;
            this.f101878a = baseActivity;
            this.f101879b = c50740vy1;
            this.f101880c = scopeProvider;
            this.f101881d = interfaceC44393lG2;
            this.f101882e = dq3;
        }
    }

    private C46251oP0() {
    }

    /* renamed from: a */
    public static KF4.InterfaceC4385a.InterfaceC4386a m21224a() {
        return new C26931a();
    }
}

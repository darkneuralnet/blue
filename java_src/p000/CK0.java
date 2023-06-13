package p000;

import android.content.Context;
import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C40295eM1;
/* renamed from: CK0 */
/* loaded from: classes3.dex */
public final class CK0 {

    /* renamed from: CK0$a */
    /* loaded from: classes3.dex */
    public static final class C1014a implements C40295eM1.InterfaceC20009b.InterfaceC20010a {
        @Override // p000.C40295eM1.InterfaceC20009b.InterfaceC20010a
        /* renamed from: a */
        public C40295eM1.InterfaceC20009b mo43004a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C40679f00 c40679f00, DialogInterface dialogInterface, InterfaceC39953dm5 interfaceC39953dm5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c40679f00);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(interfaceC39953dm5);
            return new C1015b(interfaceC44393lG2, baseActivity, scopeProvider, c40679f00, dialogInterface, interfaceC39953dm5);
        }

        private C1014a() {
        }
    }

    /* renamed from: CK0$b */
    /* loaded from: classes3.dex */
    public static final class C1015b implements C40295eM1.InterfaceC20009b {

        /* renamed from: a */
        public final BaseActivity f3933a;

        /* renamed from: b */
        public final C40679f00 f3934b;

        /* renamed from: c */
        public final DialogInterface f3935c;

        /* renamed from: d */
        public final InterfaceC39953dm5 f3936d;

        /* renamed from: e */
        public final ScopeProvider f3937e;

        /* renamed from: f */
        public final InterfaceC44393lG2 f3938f;

        /* renamed from: g */
        public final C1015b f3939g;

        @Override // p000.C40295eM1.InterfaceC20009b
        /* renamed from: a */
        public void mo43005a(C40295eM1 c40295eM1) {
            m112338e(c40295eM1);
        }

        /* renamed from: b */
        public final C41481gM1 m112341b() {
            return new C41481gM1((Context) C51679xZ3.m5003d(this.f3938f.mo27552R1()));
        }

        /* renamed from: c */
        public final C50374vM1 m112340c() {
            return new C50374vM1(m112339d(), this.f3936d, this.f3937e, (C36207Tq4) C51679xZ3.m5003d(this.f3938f.mo27595B1()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f3938f.mo27584F0()), (InterfaceC10636aM) C51679xZ3.m5003d(this.f3938f.mo27460x()), (InterfaceC20340fF) C51679xZ3.m5003d(this.f3938f.mo27591C1()), (InterfaceC36149Tk0) C51679xZ3.m5003d(this.f3938f.mo27490n()), (InterfaceC48164rd5) C51679xZ3.m5003d(this.f3938f.mo27463w()), (InterfaceC31654Ae5) C51679xZ3.m5003d(this.f3938f.mo27528Z2()), m112341b(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f3938f.mo27461w2()));
        }

        /* renamed from: d */
        public final FM1 m112339d() {
            return new FM1(this.f3933a, this.f3934b, this.f3935c);
        }

        /* renamed from: e */
        public final C40295eM1 m112338e(C40295eM1 c40295eM1) {
            C40888fM1.m41534b(c40295eM1, m112340c());
            return c40295eM1;
        }

        public C1015b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C40679f00 c40679f00, DialogInterface dialogInterface, InterfaceC39953dm5 interfaceC39953dm5) {
            this.f3939g = this;
            this.f3933a = baseActivity;
            this.f3934b = c40679f00;
            this.f3935c = dialogInterface;
            this.f3936d = interfaceC39953dm5;
            this.f3937e = scopeProvider;
            this.f3938f = interfaceC44393lG2;
        }
    }

    private CK0() {
    }

    /* renamed from: a */
    public static C40295eM1.InterfaceC20009b.InterfaceC20010a m112342a() {
        return new C1014a();
    }
}

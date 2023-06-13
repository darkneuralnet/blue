package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.AbstractC24569h;
import p000.C45672nQ5;
/* renamed from: KQ0 */
/* loaded from: classes4.dex */
public final class KQ0 {

    /* renamed from: KQ0$a */
    /* loaded from: classes4.dex */
    public static final class C4420a implements C45672nQ5.InterfaceC26505c.InterfaceC26506a {
        @Override // p000.C45672nQ5.InterfaceC26505c.InterfaceC26506a
        /* renamed from: a */
        public C45672nQ5.InterfaceC26505c mo23787a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, C45672nQ5 c45672nQ5, ScopeProvider scopeProvider, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier, DialogInterface dialogInterface, G31 g31, AbstractC24569h<C45672nQ5.EnumC26504b> abstractC24569h) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(c45672nQ5);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(viewHolderSupplier);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(g31);
            C51679xZ3.m5005b(abstractC24569h);
            return new C4421b(interfaceC44393lG2, baseActivity, c45672nQ5, scopeProvider, viewHolderSupplier, dialogInterface, g31, abstractC24569h);
        }

        private C4420a() {
        }
    }

    /* renamed from: KQ0$b */
    /* loaded from: classes4.dex */
    public static final class C4421b implements C45672nQ5.InterfaceC26505c {

        /* renamed from: a */
        public final C4421b f19541a;

        /* renamed from: b */
        public Y94<ScopeProvider> f19542b;

        /* renamed from: c */
        public Y94<InterfaceC40099e13> f19543c;

        /* renamed from: d */
        public Y94<BaseActivity> f19544d;

        /* renamed from: e */
        public Y94<ViewHolderSupplier<AbstractC40357eT0>> f19545e;

        /* renamed from: f */
        public Y94<G31> f19546f;

        /* renamed from: g */
        public Y94<DialogInterface> f19547g;

        /* renamed from: h */
        public Y94<AQ5> f19548h;

        /* renamed from: i */
        public Y94<InterfaceC51600xQ5> f19549i;

        /* renamed from: j */
        public Y94<AbstractC24569h<C45672nQ5.EnumC26504b>> f19550j;

        /* renamed from: k */
        public Y94<C50414vQ5> f19551k;

        /* renamed from: l */
        public Y94<InterfaceC46265oQ5> f19552l;

        /* renamed from: KQ0$b$a */
        /* loaded from: classes4.dex */
        public static final class C4422a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f19553a;

            public C4422a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f19553a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f19553a.mo27461w2());
            }
        }

        @Override // p000.C45672nQ5.InterfaceC26505c
        /* renamed from: a */
        public void mo23788a(C45672nQ5 c45672nQ5) {
            m98907c(c45672nQ5);
        }

        /* renamed from: b */
        public final void m98908b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, C45672nQ5 c45672nQ5, ScopeProvider scopeProvider, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier, DialogInterface dialogInterface, G31 g31, AbstractC24569h<C45672nQ5.EnumC26504b> abstractC24569h) {
            this.f19542b = C39546d52.m44621a(scopeProvider);
            this.f19543c = new C4422a(interfaceC44393lG2);
            this.f19544d = C39546d52.m44621a(baseActivity);
            this.f19545e = C39546d52.m44621a(viewHolderSupplier);
            this.f19546f = C39546d52.m44621a(g31);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(dialogInterface);
            this.f19547g = m44621a;
            BQ5 m114043a = BQ5.m114043a(this.f19544d, this.f19545e, this.f19546f, m44621a);
            this.f19548h = m114043a;
            this.f19549i = V51.m80429b(m114043a);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(abstractC24569h);
            this.f19550j = m44621a2;
            C51007wQ5 m6851a = C51007wQ5.m6851a(this.f19542b, this.f19543c, this.f19549i, m44621a2);
            this.f19551k = m6851a;
            this.f19552l = V51.m80429b(m6851a);
        }

        /* renamed from: c */
        public final C45672nQ5 m98907c(C45672nQ5 c45672nQ5) {
            CQ5.m112235b(c45672nQ5, this.f19552l.get());
            CQ5.m112234c(c45672nQ5, this.f19549i.get());
            return c45672nQ5;
        }

        public C4421b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, C45672nQ5 c45672nQ5, ScopeProvider scopeProvider, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier, DialogInterface dialogInterface, G31 g31, AbstractC24569h<C45672nQ5.EnumC26504b> abstractC24569h) {
            this.f19541a = this;
            m98908b(interfaceC44393lG2, baseActivity, c45672nQ5, scopeProvider, viewHolderSupplier, dialogInterface, g31, abstractC24569h);
        }
    }

    private KQ0() {
    }

    /* renamed from: a */
    public static C45672nQ5.InterfaceC26505c.InterfaceC26506a m98909a() {
        return new C4420a();
    }
}

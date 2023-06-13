package p000;

import android.content.Context;
import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.QCAutoCheck;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.AbstractC24569h;
import java.util.List;
import p000.C35595Ra4;
/* renamed from: qO0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47428qO0 {

    /* renamed from: qO0$a */
    /* loaded from: classes4.dex */
    public static final class C27591a implements C35595Ra4.InterfaceC7207b.InterfaceC7208a {
        @Override // p000.C35595Ra4.InterfaceC7207b.InterfaceC7208a
        /* renamed from: a */
        public C35595Ra4.InterfaceC7207b mo17578a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C35595Ra4 c35595Ra4, E31 e31, DialogInterface dialogInterface, AbstractC24569h<List<QCAutoCheck>> abstractC24569h) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c35595Ra4);
            C51679xZ3.m5005b(e31);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(abstractC24569h);
            return new C27592b(interfaceC44393lG2, baseActivity, scopeProvider, c35595Ra4, e31, dialogInterface, abstractC24569h);
        }

        private C27591a() {
        }
    }

    /* renamed from: qO0$b */
    /* loaded from: classes4.dex */
    public static final class C27592b implements C35595Ra4.InterfaceC7207b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f105231a;

        /* renamed from: b */
        public final BaseActivity f105232b;

        /* renamed from: c */
        public final DialogInterface f105233c;

        /* renamed from: d */
        public final E31 f105234d;

        /* renamed from: e */
        public final ScopeProvider f105235e;

        /* renamed from: f */
        public final AbstractC24569h<List<QCAutoCheck>> f105236f;

        /* renamed from: g */
        public final C27592b f105237g;

        @Override // p000.C35595Ra4.InterfaceC7207b
        /* renamed from: a */
        public void mo17577a(C35595Ra4 c35595Ra4) {
            m17576b(c35595Ra4);
        }

        /* renamed from: b */
        public final C35595Ra4 m17576b(C35595Ra4 c35595Ra4) {
            C35829Sa4.m85218b(c35595Ra4, m17574d());
            return c35595Ra4;
        }

        /* renamed from: c */
        public final C36531Va4 m17575c() {
            return new C36531Va4((Context) C51679xZ3.m5003d(this.f105231a.mo27552R1()));
        }

        /* renamed from: d */
        public final C41620gb4 m17574d() {
            return new C41620gb4((InterfaceC37857aG6) C51679xZ3.m5003d(this.f105231a.mo27549T2()), m17573e(), this.f105235e, m17575c(), this.f105236f, (InterfaceC31626Ab4) C51679xZ3.m5003d(this.f105231a.mo27557P1()));
        }

        /* renamed from: e */
        public final C42806ib4 m17573e() {
            return new C42806ib4(this.f105232b, this.f105233c, this.f105234d);
        }

        public C27592b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C35595Ra4 c35595Ra4, E31 e31, DialogInterface dialogInterface, AbstractC24569h<List<QCAutoCheck>> abstractC24569h) {
            this.f105237g = this;
            this.f105231a = interfaceC44393lG2;
            this.f105232b = baseActivity;
            this.f105233c = dialogInterface;
            this.f105234d = e31;
            this.f105235e = scopeProvider;
            this.f105236f = abstractC24569h;
        }
    }

    private C47428qO0() {
    }

    /* renamed from: a */
    public static C35595Ra4.InterfaceC7207b.InterfaceC7208a m17579a() {
        return new C27591a();
    }
}

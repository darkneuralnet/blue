package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WirePart;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.C24556c;
import p000.C43226jI3;
/* renamed from: pN0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46826pN0 {

    /* renamed from: pN0$a */
    /* loaded from: classes4.dex */
    public static final class C27278a implements C43226jI3.InterfaceC24800b.InterfaceC24801a {
        @Override // p000.C43226jI3.InterfaceC24800b.InterfaceC24801a
        /* renamed from: a */
        public C43226jI3.InterfaceC24800b mo19393a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C40679f00 c40679f00, DialogInterface dialogInterface, C24556c<WirePart> c24556c, InterfaceC39953dm5 interfaceC39953dm5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c40679f00);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(c24556c);
            C51679xZ3.m5005b(interfaceC39953dm5);
            return new C27279b(interfaceC44393lG2, baseActivity, scopeProvider, c40679f00, dialogInterface, c24556c, interfaceC39953dm5);
        }

        private C27278a() {
        }
    }

    /* renamed from: pN0$b */
    /* loaded from: classes4.dex */
    public static final class C27279b implements C43226jI3.InterfaceC24800b {

        /* renamed from: a */
        public final BaseActivity f103582a;

        /* renamed from: b */
        public final C40679f00 f103583b;

        /* renamed from: c */
        public final DialogInterface f103584c;

        /* renamed from: d */
        public final InterfaceC39953dm5 f103585d;

        /* renamed from: e */
        public final ScopeProvider f103586e;

        /* renamed from: f */
        public final C24556c<WirePart> f103587f;

        /* renamed from: g */
        public final InterfaceC44393lG2 f103588g;

        /* renamed from: h */
        public final C27279b f103589h;

        @Override // p000.C43226jI3.InterfaceC24800b
        /* renamed from: a */
        public void mo19392a(C43226jI3 c43226jI3) {
            m19390c(c43226jI3);
        }

        /* renamed from: b */
        public final C24739jE m19391b() {
            return new C24739jE(this.f103582a, this.f103583b, this.f103584c);
        }

        /* renamed from: c */
        public final C43226jI3 m19390c(C43226jI3 c43226jI3) {
            C43819kI3.m29085b(c43226jI3, m19389d());
            return c43226jI3;
        }

        /* renamed from: d */
        public final C47377qI3 m19389d() {
            return new C47377qI3(m19391b(), this.f103585d, this.f103586e, this.f103587f, (NQ5) C51679xZ3.m5003d(this.f103588g.mo27533Y0()), (InterfaceC7381SM) C51679xZ3.m5003d(this.f103588g.mo27592C0()), (C36207Tq4) C51679xZ3.m5003d(this.f103588g.mo27595B1()));
        }

        public C27279b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C40679f00 c40679f00, DialogInterface dialogInterface, C24556c<WirePart> c24556c, InterfaceC39953dm5 interfaceC39953dm5) {
            this.f103589h = this;
            this.f103582a = baseActivity;
            this.f103583b = c40679f00;
            this.f103584c = dialogInterface;
            this.f103585d = interfaceC39953dm5;
            this.f103586e = scopeProvider;
            this.f103587f = c24556c;
            this.f103588g = interfaceC44393lG2;
        }
    }

    private C46826pN0() {
    }

    /* renamed from: a */
    public static C43226jI3.InterfaceC24800b.InterfaceC24801a m19394a() {
        return new C27278a();
    }
}

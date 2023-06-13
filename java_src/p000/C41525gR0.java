package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.C24556c;
import p000.X86;
/* renamed from: gR0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41525gR0 {

    /* renamed from: gR0$a */
    /* loaded from: classes4.dex */
    public static final class C20848a implements X86.InterfaceC9331b.InterfaceC9332a {
        @Override // p000.X86.InterfaceC9331b.InterfaceC9332a
        /* renamed from: a */
        public X86.InterfaceC9331b mo39479a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C40679f00 c40679f00, DialogInterface dialogInterface, C24556c<String> c24556c, InterfaceC39953dm5 interfaceC39953dm5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c40679f00);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(c24556c);
            C51679xZ3.m5005b(interfaceC39953dm5);
            return new C20849b(interfaceC44393lG2, baseActivity, scopeProvider, c40679f00, dialogInterface, c24556c, interfaceC39953dm5);
        }

        private C20848a() {
        }
    }

    /* renamed from: gR0$b */
    /* loaded from: classes4.dex */
    public static final class C20849b implements X86.InterfaceC9331b {

        /* renamed from: a */
        public final C24556c<String> f82180a;

        /* renamed from: b */
        public final BaseActivity f82181b;

        /* renamed from: c */
        public final C40679f00 f82182c;

        /* renamed from: d */
        public final DialogInterface f82183d;

        /* renamed from: e */
        public final InterfaceC39953dm5 f82184e;

        /* renamed from: f */
        public final ScopeProvider f82185f;

        /* renamed from: g */
        public final C20849b f82186g;

        @Override // p000.X86.InterfaceC9331b
        /* renamed from: a */
        public void mo39478a(X86 x86) {
            m39476c(x86);
        }

        /* renamed from: b */
        public final C24739jE m39477b() {
            return new C24739jE(this.f82181b, this.f82182c, this.f82183d);
        }

        /* renamed from: c */
        public final X86 m39476c(X86 x86) {
            Y86.m75542b(x86, m39475d());
            return x86;
        }

        /* renamed from: d */
        public final C40775f96 m39475d() {
            return new C40775f96(this.f82180a, m39477b(), this.f82184e, this.f82185f);
        }

        public C20849b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C40679f00 c40679f00, DialogInterface dialogInterface, C24556c<String> c24556c, InterfaceC39953dm5 interfaceC39953dm5) {
            this.f82186g = this;
            this.f82180a = c24556c;
            this.f82181b = baseActivity;
            this.f82182c = c40679f00;
            this.f82183d = dialogInterface;
            this.f82184e = interfaceC39953dm5;
            this.f82185f = scopeProvider;
        }
    }

    private C41525gR0() {
    }

    /* renamed from: a */
    public static X86.InterfaceC9331b.InterfaceC9332a m39480a() {
        return new C20848a();
    }
}

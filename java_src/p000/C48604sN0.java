package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.C24567g;
import p000.C50933wI3;
/* renamed from: sN0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48604sN0 {

    /* renamed from: sN0$a */
    /* loaded from: classes3.dex */
    public static final class C28294a implements C50933wI3.InterfaceC29857b.InterfaceC29858a {
        @Override // p000.C50933wI3.InterfaceC29857b.InterfaceC29858a
        /* renamed from: a */
        public C50933wI3.InterfaceC29857b mo7030a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C38290b00 c38290b00, DialogInterface dialogInterface, C24567g<DialogResponse> c24567g) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c38290b00);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(c24567g);
            return new C28295b(interfaceC44393lG2, baseActivity, scopeProvider, c38290b00, dialogInterface, c24567g);
        }

        private C28294a() {
        }
    }

    /* renamed from: sN0$b */
    /* loaded from: classes3.dex */
    public static final class C28295b implements C50933wI3.InterfaceC29857b {

        /* renamed from: a */
        public final C24567g<DialogResponse> f108683a;

        /* renamed from: b */
        public final BaseActivity f108684b;

        /* renamed from: c */
        public final C38290b00 f108685c;

        /* renamed from: d */
        public final DialogInterface f108686d;

        /* renamed from: e */
        public final ScopeProvider f108687e;

        /* renamed from: f */
        public final C28295b f108688f;

        @Override // p000.C50933wI3.InterfaceC29857b
        /* renamed from: a */
        public void mo7031a(C50933wI3 c50933wI3) {
            m14261b(c50933wI3);
        }

        /* renamed from: b */
        public final C50933wI3 m14261b(C50933wI3 c50933wI3) {
            C51526xI3.m5565b(c50933wI3, m14260c());
            return c50933wI3;
        }

        /* renamed from: c */
        public final BI3 m14260c() {
            return new BI3(this.f108683a, m14259d(), this.f108687e);
        }

        /* renamed from: d */
        public final CI3 m14259d() {
            return new CI3(this.f108684b, this.f108685c, this.f108686d);
        }

        public C28295b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C38290b00 c38290b00, DialogInterface dialogInterface, C24567g<DialogResponse> c24567g) {
            this.f108688f = this;
            this.f108683a = c24567g;
            this.f108684b = baseActivity;
            this.f108685c = c38290b00;
            this.f108686d = dialogInterface;
            this.f108687e = scopeProvider;
        }
    }

    private C48604sN0() {
    }

    /* renamed from: a */
    public static C50933wI3.InterfaceC29857b.InterfaceC29858a m14262a() {
        return new C28294a();
    }
}

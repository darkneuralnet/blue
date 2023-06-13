package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.NonRepair;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.C24556c;
import p000.C40179e93;
/* renamed from: AM0 */
/* loaded from: classes3.dex */
public final class AM0 {

    /* renamed from: AM0$a */
    /* loaded from: classes3.dex */
    public static final class C0072a implements C40179e93.InterfaceC19973b.InterfaceC19974a {
        @Override // p000.C40179e93.InterfaceC19973b.InterfaceC19974a
        /* renamed from: a */
        public C40179e93.InterfaceC19973b mo43170a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7204RZ c7204rz, C24556c<NonRepair> c24556c, DialogInterface dialogInterface) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c7204rz);
            C51679xZ3.m5005b(c24556c);
            C51679xZ3.m5005b(dialogInterface);
            return new C0073b(interfaceC44393lG2, baseActivity, scopeProvider, c7204rz, c24556c, dialogInterface);
        }

        private C0072a() {
        }
    }

    /* renamed from: AM0$b */
    /* loaded from: classes3.dex */
    public static final class C0073b implements C40179e93.InterfaceC19973b {

        /* renamed from: a */
        public final C24556c<NonRepair> f413a;

        /* renamed from: b */
        public final BaseActivity f414b;

        /* renamed from: c */
        public final C7204RZ f415c;

        /* renamed from: d */
        public final DialogInterface f416d;

        /* renamed from: e */
        public final ScopeProvider f417e;

        /* renamed from: f */
        public final C0073b f418f;

        @Override // p000.C40179e93.InterfaceC19973b
        /* renamed from: a */
        public void mo43171a(C40179e93 c40179e93) {
            m115899b(c40179e93);
        }

        /* renamed from: b */
        public final C40179e93 m115899b(C40179e93 c40179e93) {
            C40772f93.m41946b(c40179e93, m115898c());
            return c40179e93;
        }

        /* renamed from: c */
        public final C48480s93 m115898c() {
            return new C48480s93(this.f413a, new C41365g93(), m115897d(), this.f417e);
        }

        /* renamed from: d */
        public final G93 m115897d() {
            return new G93(this.f414b, this.f415c, this.f416d);
        }

        public C0073b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7204RZ c7204rz, C24556c<NonRepair> c24556c, DialogInterface dialogInterface) {
            this.f418f = this;
            this.f413a = c24556c;
            this.f414b = baseActivity;
            this.f415c = c7204rz;
            this.f416d = dialogInterface;
            this.f417e = scopeProvider;
        }
    }

    private AM0() {
    }

    /* renamed from: a */
    public static C40179e93.InterfaceC19973b.InterfaceC19974a m115900a() {
        return new C0072a();
    }
}

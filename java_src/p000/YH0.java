package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C46480on0;
/* renamed from: YH0 */
/* loaded from: classes2.dex */
public final class YH0 {

    /* renamed from: YH0$a */
    /* loaded from: classes2.dex */
    public static final class C9752a implements C46480on0.InterfaceC27060a {

        /* renamed from: a */
        public final ScopeProvider f44928a;

        /* renamed from: b */
        public final BaseActivity f44929b;

        /* renamed from: c */
        public final C45454n31 f44930c;

        /* renamed from: d */
        public final DialogInterface f44931d;

        /* renamed from: e */
        public final C9752a f44932e;

        @Override // p000.C46480on0.InterfaceC27060a
        /* renamed from: a */
        public void mo20500a(C46480on0 c46480on0) {
            m75282d(c46480on0);
        }

        /* renamed from: b */
        public final C48259rn0 m75284b() {
            return new C48259rn0(this.f44928a, m75283c());
        }

        /* renamed from: c */
        public final C48851sn0 m75283c() {
            return new C48851sn0(this.f44929b, this.f44930c, this.f44931d);
        }

        /* renamed from: d */
        public final C46480on0 m75282d(C46480on0 c46480on0) {
            C47073pn0.m18708b(c46480on0, m75284b());
            return c46480on0;
        }

        public C9752a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C45454n31 c45454n31, DialogInterface dialogInterface) {
            this.f44932e = this;
            this.f44928a = scopeProvider;
            this.f44929b = baseActivity;
            this.f44930c = c45454n31;
            this.f44931d = dialogInterface;
        }
    }

    /* renamed from: YH0$b */
    /* loaded from: classes2.dex */
    public static final class C9753b implements C46480on0.InterfaceC27060a.InterfaceC27061a {
        @Override // p000.C46480on0.InterfaceC27060a.InterfaceC27061a
        /* renamed from: a */
        public C46480on0.InterfaceC27060a mo20499a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C45454n31 c45454n31, DialogInterface dialogInterface) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c45454n31);
            C51679xZ3.m5005b(dialogInterface);
            return new C9752a(interfaceC44393lG2, baseActivity, scopeProvider, c45454n31, dialogInterface);
        }

        private C9753b() {
        }
    }

    private YH0() {
    }

    /* renamed from: a */
    public static C46480on0.InterfaceC27060a.InterfaceC27061a m75285a() {
        return new C9753b();
    }
}

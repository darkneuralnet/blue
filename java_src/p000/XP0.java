package p000;

import android.content.DialogInterface;
import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C42334hn5;
/* renamed from: XP0 */
/* loaded from: classes3.dex */
public final class XP0 {

    /* renamed from: XP0$a */
    /* loaded from: classes3.dex */
    public static final class C9410a implements C42334hn5.InterfaceC22724b.InterfaceC22725a {
        @Override // p000.C42334hn5.InterfaceC22724b.InterfaceC22725a
        /* renamed from: a */
        public C42334hn5.InterfaceC22724b mo35865a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, Button button, DialogInterface dialogInterface) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(button);
            C51679xZ3.m5005b(dialogInterface);
            return new C9411b(interfaceC44393lG2, baseActivity, scopeProvider, button, dialogInterface);
        }

        private C9410a() {
        }
    }

    /* renamed from: XP0$b */
    /* loaded from: classes3.dex */
    public static final class C9411b implements C42334hn5.InterfaceC22724b {

        /* renamed from: a */
        public final BaseActivity f43129a;

        /* renamed from: b */
        public final Button f43130b;

        /* renamed from: c */
        public final DialogInterface f43131c;

        /* renamed from: d */
        public final ScopeProvider f43132d;

        /* renamed from: e */
        public final C9411b f43133e;

        @Override // p000.C42334hn5.InterfaceC22724b
        /* renamed from: a */
        public void mo35866a(C42334hn5 c42334hn5) {
            m77024b(c42334hn5);
        }

        /* renamed from: b */
        public final C42334hn5 m77024b(C42334hn5 c42334hn5) {
            C42927in5.m33483b(c42334hn5, m77023c());
            return c42334hn5;
        }

        /* renamed from: c */
        public final C44706ln5 m77023c() {
            return new C44706ln5(m77022d(), this.f43132d);
        }

        /* renamed from: d */
        public final C45892nn5 m77022d() {
            return new C45892nn5(this.f43129a, this.f43130b, this.f43131c);
        }

        public C9411b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, Button button, DialogInterface dialogInterface) {
            this.f43133e = this;
            this.f43129a = baseActivity;
            this.f43130b = button;
            this.f43131c = dialogInterface;
            this.f43132d = scopeProvider;
        }
    }

    private XP0() {
    }

    /* renamed from: a */
    public static C42334hn5.InterfaceC22724b.InterfaceC22725a m77025a() {
        return new C9410a();
    }
}

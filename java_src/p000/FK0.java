package p000;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C38535bQ1;
/* renamed from: FK0 */
/* loaded from: classes3.dex */
public final class FK0 {

    /* renamed from: FK0$a */
    /* loaded from: classes3.dex */
    public static final class C2222a implements C38535bQ1.InterfaceC12387b.InterfaceC12388a {
        @Override // p000.C38535bQ1.InterfaceC12387b.InterfaceC12388a
        /* renamed from: a */
        public C38535bQ1.InterfaceC12387b mo64548a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, TextView textView, TextView textView2, Button button, DialogInterface dialogInterface) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(textView);
            C51679xZ3.m5005b(textView2);
            C51679xZ3.m5005b(button);
            C51679xZ3.m5005b(dialogInterface);
            return new C2223b(interfaceC44393lG2, baseActivity, scopeProvider, textView, textView2, button, dialogInterface);
        }

        private C2222a() {
        }
    }

    /* renamed from: FK0$b */
    /* loaded from: classes3.dex */
    public static final class C2223b implements C38535bQ1.InterfaceC12387b {

        /* renamed from: a */
        public final BaseActivity f9188a;

        /* renamed from: b */
        public final TextView f9189b;

        /* renamed from: c */
        public final TextView f9190c;

        /* renamed from: d */
        public final Button f9191d;

        /* renamed from: e */
        public final DialogInterface f9192e;

        /* renamed from: f */
        public final ScopeProvider f9193f;

        /* renamed from: g */
        public final C2223b f9194g;

        @Override // p000.C38535bQ1.InterfaceC12387b
        /* renamed from: a */
        public void mo64549a(C38535bQ1 c38535bQ1) {
            m107306d(c38535bQ1);
        }

        /* renamed from: b */
        public final C40924fQ1 m107308b() {
            return new C40924fQ1(m107307c(), this.f9193f);
        }

        /* renamed from: c */
        public final C42110hQ1 m107307c() {
            return new C42110hQ1(this.f9188a, this.f9189b, this.f9190c, this.f9191d, this.f9192e);
        }

        /* renamed from: d */
        public final C38535bQ1 m107306d(C38535bQ1 c38535bQ1) {
            C39128cQ1.m61420b(c38535bQ1, m107308b());
            return c38535bQ1;
        }

        public C2223b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, TextView textView, TextView textView2, Button button, DialogInterface dialogInterface) {
            this.f9194g = this;
            this.f9188a = baseActivity;
            this.f9189b = textView;
            this.f9190c = textView2;
            this.f9191d = button;
            this.f9192e = dialogInterface;
            this.f9193f = scopeProvider;
        }
    }

    private FK0() {
    }

    /* renamed from: a */
    public static C38535bQ1.InterfaceC12387b.InterfaceC12388a m107309a() {
        return new C2222a();
    }
}

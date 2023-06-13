package p000;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.AbstractC24569h;
import p000.C43641jz6;
/* renamed from: KR0 */
/* loaded from: classes4.dex */
public final class KR0 {

    /* renamed from: KR0$a */
    /* loaded from: classes4.dex */
    public static final class C4434a implements C43641jz6.InterfaceC25069b.InterfaceC25070a {
        @Override // p000.C43641jz6.InterfaceC25069b.InterfaceC25070a
        /* renamed from: a */
        public C43641jz6.InterfaceC25069b mo29513a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, TextView textView, Button button, Button button2, DialogInterface dialogInterface, AbstractC24569h<DialogResponse> abstractC24569h) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(textView);
            C51679xZ3.m5005b(button);
            C51679xZ3.m5005b(button2);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(abstractC24569h);
            return new C4435b(interfaceC44393lG2, baseActivity, scopeProvider, textView, button, button2, dialogInterface, abstractC24569h);
        }

        private C4434a() {
        }
    }

    /* renamed from: KR0$b */
    /* loaded from: classes4.dex */
    public static final class C4435b implements C43641jz6.InterfaceC25069b {

        /* renamed from: a */
        public final AbstractC24569h<DialogResponse> f19582a;

        /* renamed from: b */
        public final BaseActivity f19583b;

        /* renamed from: c */
        public final TextView f19584c;

        /* renamed from: d */
        public final Button f19585d;

        /* renamed from: e */
        public final Button f19586e;

        /* renamed from: f */
        public final DialogInterface f19587f;

        /* renamed from: g */
        public final ScopeProvider f19588g;

        /* renamed from: h */
        public final C4435b f19589h;

        @Override // p000.C43641jz6.InterfaceC25069b
        /* renamed from: a */
        public void mo29514a(C43641jz6 c43641jz6) {
            m98888b(c43641jz6);
        }

        /* renamed from: b */
        public final C43641jz6 m98888b(C43641jz6 c43641jz6) {
            C44234kz6.m28040b(c43641jz6, m98887c());
            return c43641jz6;
        }

        /* renamed from: c */
        public final C46606oz6 m98887c() {
            return new C46606oz6(this.f19582a, m98886d(), this.f19588g);
        }

        /* renamed from: d */
        public final C48977sz6 m98886d() {
            return new C48977sz6(this.f19583b, this.f19584c, this.f19585d, this.f19586e, this.f19587f);
        }

        public C4435b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, TextView textView, Button button, Button button2, DialogInterface dialogInterface, AbstractC24569h<DialogResponse> abstractC24569h) {
            this.f19589h = this;
            this.f19582a = abstractC24569h;
            this.f19583b = baseActivity;
            this.f19584c = textView;
            this.f19585d = button;
            this.f19586e = button2;
            this.f19587f = dialogInterface;
            this.f19588g = scopeProvider;
        }
    }

    private KR0() {
    }

    /* renamed from: a */
    public static C43641jz6.InterfaceC25069b.InterfaceC25070a m98889a() {
        return new C4434a();
    }
}

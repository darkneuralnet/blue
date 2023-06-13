package p000;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.AbstractC24569h;
import p000.C32437Dn5;
/* renamed from: jQ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43295jQ0 {

    /* renamed from: jQ0$a */
    /* loaded from: classes3.dex */
    public static final class C24837a implements C32437Dn5.InterfaceC1602b.InterfaceC1603a {
        @Override // p000.C32437Dn5.InterfaceC1602b.InterfaceC1603a
        /* renamed from: a */
        public C32437Dn5.InterfaceC1602b mo30647a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, TextView textView, Button button, Button button2, DialogInterface dialogInterface, AbstractC24569h<DialogResponse> abstractC24569h) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(textView);
            C51679xZ3.m5005b(button);
            C51679xZ3.m5005b(button2);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(abstractC24569h);
            return new C24838b(interfaceC44393lG2, baseActivity, scopeProvider, textView, button, button2, dialogInterface, abstractC24569h);
        }

        private C24837a() {
        }
    }

    /* renamed from: jQ0$b */
    /* loaded from: classes3.dex */
    public static final class C24838b implements C32437Dn5.InterfaceC1602b {

        /* renamed from: a */
        public final BaseActivity f92694a;

        /* renamed from: b */
        public final TextView f92695b;

        /* renamed from: c */
        public final Button f92696c;

        /* renamed from: d */
        public final Button f92697d;

        /* renamed from: e */
        public final DialogInterface f92698e;

        /* renamed from: f */
        public final ScopeProvider f92699f;

        /* renamed from: g */
        public final AbstractC24569h<DialogResponse> f92700g;

        /* renamed from: h */
        public final C24838b f92701h;

        @Override // p000.C32437Dn5.InterfaceC1602b
        /* renamed from: a */
        public void mo30646a(C32437Dn5 c32437Dn5) {
            m30645b(c32437Dn5);
        }

        /* renamed from: b */
        public final C32437Dn5 m30645b(C32437Dn5 c32437Dn5) {
            C32671En5.m108359b(c32437Dn5, m30644c());
            return c32437Dn5;
        }

        /* renamed from: c */
        public final C33607In5 m30644c() {
            return new C33607In5(m30643d(), this.f92699f, this.f92700g);
        }

        /* renamed from: d */
        public final C34543Mn5 m30643d() {
            return new C34543Mn5(this.f92694a, this.f92695b, this.f92696c, this.f92697d, this.f92698e);
        }

        public C24838b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, TextView textView, Button button, Button button2, DialogInterface dialogInterface, AbstractC24569h<DialogResponse> abstractC24569h) {
            this.f92701h = this;
            this.f92694a = baseActivity;
            this.f92695b = textView;
            this.f92696c = button;
            this.f92697d = button2;
            this.f92698e = dialogInterface;
            this.f92699f = scopeProvider;
            this.f92700g = abstractC24569h;
        }
    }

    private C43295jQ0() {
    }

    /* renamed from: a */
    public static C32437Dn5.InterfaceC1602b.InterfaceC1603a m30648a() {
        return new C24837a();
    }
}

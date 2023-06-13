package p000;

import android.content.Context;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C35352Pz4;
/* renamed from: NO0 */
/* loaded from: classes3.dex */
public final class NO0 {

    /* renamed from: NO0$a */
    /* loaded from: classes3.dex */
    public static final class C5565a implements C35352Pz4.InterfaceC6613b.InterfaceC6614a {
        @Override // p000.C35352Pz4.InterfaceC6613b.InterfaceC6614a
        /* renamed from: a */
        public C35352Pz4.InterfaceC6613b mo89177a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC34875Ny4 interfaceC34875Ny4, BaseActivity baseActivity, C35352Pz4 c35352Pz4, ScopeProvider scopeProvider, RecyclerView recyclerView, Button button, Button button2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(interfaceC34875Ny4);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(c35352Pz4);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(recyclerView);
            C51679xZ3.m5005b(button);
            C51679xZ3.m5005b(button2);
            return new C5566b(interfaceC44393lG2, interfaceC34875Ny4, baseActivity, c35352Pz4, scopeProvider, recyclerView, button, button2);
        }

        private C5565a() {
        }
    }

    /* renamed from: NO0$b */
    /* loaded from: classes3.dex */
    public static final class C5566b implements C35352Pz4.InterfaceC6613b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f24512a;

        /* renamed from: b */
        public final InterfaceC34875Ny4 f24513b;

        /* renamed from: c */
        public final BaseActivity f24514c;

        /* renamed from: d */
        public final RecyclerView f24515d;

        /* renamed from: e */
        public final Button f24516e;

        /* renamed from: f */
        public final Button f24517f;

        /* renamed from: g */
        public final ScopeProvider f24518g;

        /* renamed from: h */
        public final C5566b f24519h;

        @Override // p000.C35352Pz4.InterfaceC6613b
        /* renamed from: a */
        public void mo89178a(C35352Pz4 c35352Pz4) {
            m93981b(c35352Pz4);
        }

        /* renamed from: b */
        public final C35352Pz4 m93981b(C35352Pz4 c35352Pz4) {
            C35586Qz4.m87440b(c35352Pz4, m93978e());
            return c35352Pz4;
        }

        /* renamed from: c */
        public final C34182Kz4 m93980c() {
            return new C34182Kz4((InterfaceC48923su2) C51679xZ3.m5003d(this.f24512a.mo27505j0()));
        }

        /* renamed from: d */
        public final C35118Oz4 m93979d() {
            return new C35118Oz4((Context) C51679xZ3.m5003d(this.f24512a.mo27552R1()));
        }

        /* renamed from: e */
        public final C52048yA4 m93978e() {
            return new C52048yA4((InterfaceC37857aG6) C51679xZ3.m5003d(this.f24512a.mo27549T2()), (InterfaceC32301Cy4) C51679xZ3.m5003d(this.f24513b.mo93097a()), m93977f(), this.f24518g, (InterfaceC40099e13) C51679xZ3.m5003d(this.f24512a.mo27461w2()), m93979d(), (C36207Tq4) C51679xZ3.m5003d(this.f24512a.mo27595B1()));
        }

        /* renamed from: f */
        public final CA4 m93977f() {
            return new CA4(this.f24514c, this.f24515d, m93980c(), this.f24516e, this.f24517f);
        }

        public C5566b(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC34875Ny4 interfaceC34875Ny4, BaseActivity baseActivity, C35352Pz4 c35352Pz4, ScopeProvider scopeProvider, RecyclerView recyclerView, Button button, Button button2) {
            this.f24519h = this;
            this.f24512a = interfaceC44393lG2;
            this.f24513b = interfaceC34875Ny4;
            this.f24514c = baseActivity;
            this.f24515d = recyclerView;
            this.f24516e = button;
            this.f24517f = button2;
            this.f24518g = scopeProvider;
        }
    }

    private NO0() {
    }

    /* renamed from: a */
    public static C35352Pz4.InterfaceC6613b.InterfaceC6614a m93982a() {
        return new C5565a();
    }
}

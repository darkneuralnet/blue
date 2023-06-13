package co.bird.android.feature.commandcenter.routing;

import android.content.Context;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.commandcenter.routing.C14717b;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.commandcenter.routing.a */
/* loaded from: classes3.dex */
public final class C14714a {

    /* renamed from: co.bird.android.feature.commandcenter.routing.a$a */
    /* loaded from: classes3.dex */
    public static final class C14715a implements C14717b.InterfaceC14719b.InterfaceC14720a {
        @Override // co.bird.android.feature.commandcenter.routing.C14717b.InterfaceC14719b.InterfaceC14720a
        /* renamed from: a */
        public C14717b.InterfaceC14719b mo58461a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView, Button button) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(recyclerView);
            C51679xZ3.m5005b(button);
            return new C14716b(interfaceC44393lG2, baseActivity, scopeProvider, recyclerView, button);
        }

        private C14715a() {
        }
    }

    /* renamed from: co.bird.android.feature.commandcenter.routing.a$b */
    /* loaded from: classes3.dex */
    public static final class C14716b implements C14717b.InterfaceC14719b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63671a;

        /* renamed from: b */
        public final BaseActivity f63672b;

        /* renamed from: c */
        public final RecyclerView f63673c;

        /* renamed from: d */
        public final Button f63674d;

        /* renamed from: e */
        public final ScopeProvider f63675e;

        /* renamed from: f */
        public final C14716b f63676f;

        @Override // co.bird.android.feature.commandcenter.routing.C14717b.InterfaceC14719b
        /* renamed from: a */
        public void mo58462a(C14717b c14717b) {
            m58469b(c14717b);
        }

        /* renamed from: b */
        public final C14717b m58469b(C14717b c14717b) {
            C48746sc5.m13943b(c14717b, m58467d());
            return c14717b;
        }

        /* renamed from: c */
        public final C47561qc5 m58468c() {
            return new C47561qc5((Context) C51679xZ3.m5003d(this.f63671a.mo27552R1()));
        }

        /* renamed from: d */
        public final C34912Oc5 m58467d() {
            return new C34912Oc5((InterfaceC49339tc5) C51679xZ3.m5003d(this.f63671a.mo27576I1()), (InterfaceC37857aG6) C51679xZ3.m5003d(this.f63671a.mo27549T2()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63671a.mo27519d0()), (C36207Tq4) C51679xZ3.m5003d(this.f63671a.mo27595B1()), m58466e(), this.f63675e, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63671a.mo27461w2()), m58468c());
        }

        /* renamed from: e */
        public final C36082Tc5 m58466e() {
            return new C36082Tc5(this.f63672b, this.f63673c, this.f63674d);
        }

        public C14716b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView, Button button) {
            this.f63676f = this;
            this.f63671a = interfaceC44393lG2;
            this.f63672b = baseActivity;
            this.f63673c = recyclerView;
            this.f63674d = button;
            this.f63675e = scopeProvider;
        }
    }

    private C14714a() {
    }

    /* renamed from: a */
    public static C14717b.InterfaceC14719b.InterfaceC14720a m58470a() {
        return new C14715a();
    }
}

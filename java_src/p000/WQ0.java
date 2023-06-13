package p000;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C50804w46;
/* renamed from: WQ0 */
/* loaded from: classes3.dex */
public final class WQ0 {

    /* renamed from: WQ0$a */
    /* loaded from: classes3.dex */
    public static final class C9018a implements C50804w46.InterfaceC29755b.InterfaceC29756a {
        @Override // p000.C50804w46.InterfaceC29755b.InterfaceC29756a
        /* renamed from: a */
        public C50804w46.InterfaceC29755b mo7464a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(recyclerView);
            return new C9019b(interfaceC44393lG2, baseActivity, scopeProvider, recyclerView);
        }

        private C9018a() {
        }
    }

    /* renamed from: WQ0$b */
    /* loaded from: classes3.dex */
    public static final class C9019b implements C50804w46.InterfaceC29755b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f40986a;

        /* renamed from: b */
        public final BaseActivity f40987b;

        /* renamed from: c */
        public final RecyclerView f40988c;

        /* renamed from: d */
        public final ScopeProvider f40989d;

        /* renamed from: e */
        public final C9019b f40990e;

        @Override // p000.C50804w46.InterfaceC29755b
        /* renamed from: a */
        public void mo7465a(C50804w46 c50804w46) {
            m78482b(c50804w46);
        }

        /* renamed from: b */
        public final C50804w46 m78482b(C50804w46 c50804w46) {
            C51397x46.m5873b(c50804w46, m78480d());
            return c50804w46;
        }

        /* renamed from: c */
        public final C50211v46 m78481c() {
            return new C50211v46((Context) C51679xZ3.m5003d(this.f40986a.mo27552R1()));
        }

        /* renamed from: d */
        public final G46 m78480d() {
            return new G46((InterfaceC10636aM) C51679xZ3.m5003d(this.f40986a.mo27460x()), (InterfaceC49339tc5) C51679xZ3.m5003d(this.f40986a.mo27576I1()), m78479e(), this.f40989d, m78481c());
        }

        /* renamed from: e */
        public final I46 m78479e() {
            return new I46(this.f40987b, this.f40988c);
        }

        public C9019b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView) {
            this.f40990e = this;
            this.f40986a = interfaceC44393lG2;
            this.f40987b = baseActivity;
            this.f40988c = recyclerView;
            this.f40989d = scopeProvider;
        }
    }

    private WQ0() {
    }

    /* renamed from: a */
    public static C50804w46.InterfaceC29755b.InterfaceC29756a m78483a() {
        return new C9018a();
    }
}

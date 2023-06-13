package co.bird.android.foregroundservice;

import co.bird.android.foregroundservice.ForegroundService;
import com.uber.autodispose.ScopeProvider;
import java.util.Set;
/* renamed from: co.bird.android.foregroundservice.a */
/* loaded from: classes3.dex */
public final class C15986a {

    /* renamed from: co.bird.android.foregroundservice.a$a */
    /* loaded from: classes3.dex */
    public static final class C15987a implements ForegroundService.InterfaceC15970b.InterfaceC15971a {
        @Override // co.bird.android.foregroundservice.ForegroundService.InterfaceC15970b.InterfaceC15971a
        /* renamed from: a */
        public ForegroundService.InterfaceC15970b mo56165a(InterfaceC44393lG2 interfaceC44393lG2, ScopeProvider scopeProvider) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(scopeProvider);
            return new C15988b(interfaceC44393lG2, scopeProvider);
        }

        private C15987a() {
        }
    }

    /* renamed from: co.bird.android.foregroundservice.a$b */
    /* loaded from: classes3.dex */
    public static final class C15988b implements ForegroundService.InterfaceC15970b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f66022a;

        /* renamed from: b */
        public final C15988b f66023b;

        @Override // co.bird.android.foregroundservice.ForegroundService.InterfaceC15970b
        /* renamed from: a */
        public void mo56164a(ForegroundService foregroundService) {
            m56163b(foregroundService);
        }

        /* renamed from: b */
        public final ForegroundService m56163b(ForegroundService foregroundService) {
            C48360rx1.m14987c(foregroundService, (Set) C51679xZ3.m5003d(this.f66022a.mo27537X0()));
            C48360rx1.m14989a(foregroundService, (InterfaceC6097Oh) C51679xZ3.m5003d(this.f66022a.mo27470t0()));
            return foregroundService;
        }

        public C15988b(InterfaceC44393lG2 interfaceC44393lG2, ScopeProvider scopeProvider) {
            this.f66023b = this;
            this.f66022a = interfaceC44393lG2;
        }
    }

    private C15986a() {
    }

    /* renamed from: a */
    public static ForegroundService.InterfaceC15970b.InterfaceC15971a m56166a() {
        return new C15987a();
    }
}

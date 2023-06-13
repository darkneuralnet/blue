package p000;

import android.content.DialogInterface;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.identification.IdentificationManualEntryFormData;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import p000.C41553gU1;
/* renamed from: RK0 */
/* loaded from: classes3.dex */
public final class RK0 {

    /* renamed from: RK0$a */
    /* loaded from: classes3.dex */
    public static final class C7111a implements C41553gU1.InterfaceC20883b.InterfaceC20884a {
        @Override // p000.C41553gU1.InterfaceC20883b.InterfaceC20884a
        /* renamed from: a */
        public C41553gU1.InterfaceC20883b mo39287a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DialogInterface dialogInterface, Observable<Optional<IdentificationManualEntryFormData>> observable) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(observable);
            return new C7112b(interfaceC44393lG2, baseActivity, scopeProvider, dialogInterface, observable);
        }

        private C7111a() {
        }
    }

    /* renamed from: RK0$b */
    /* loaded from: classes3.dex */
    public static final class C7112b implements C41553gU1.InterfaceC20883b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f31835a;

        /* renamed from: b */
        public final C7112b f31836b;

        @Override // p000.C41553gU1.InterfaceC20883b
        /* renamed from: a */
        public void mo39288a(C41553gU1 c41553gU1) {
            m86955b(c41553gU1);
        }

        /* renamed from: b */
        public final C41553gU1 m86955b(C41553gU1 c41553gU1) {
            C44518lU1.m27244b(c41553gU1, (InterfaceC40099e13) C51679xZ3.m5003d(this.f31835a.mo27461w2()));
            return c41553gU1;
        }

        public C7112b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DialogInterface dialogInterface, Observable<Optional<IdentificationManualEntryFormData>> observable) {
            this.f31836b = this;
            this.f31835a = interfaceC44393lG2;
        }
    }

    private RK0() {
    }

    /* renamed from: a */
    public static C41553gU1.InterfaceC20883b.InterfaceC20884a m86956a() {
        return new C7111a();
    }
}

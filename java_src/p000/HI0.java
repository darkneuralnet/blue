package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.identification.IdentificationDocumentType;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24507p;
import p000.Q51;
/* renamed from: HI0 */
/* loaded from: classes3.dex */
public final class HI0 {

    /* renamed from: HI0$a */
    /* loaded from: classes3.dex */
    public static final class C3124a implements Q51.InterfaceC6676b {

        /* renamed from: a */
        public final C3124a f13239a;

        @Override // p000.Q51.InterfaceC6676b
        /* renamed from: a */
        public void mo88943a(Q51 q51) {
        }

        public C3124a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DialogInterface dialogInterface, AbstractC24507p<IdentificationDocumentType> abstractC24507p) {
            this.f13239a = this;
        }
    }

    /* renamed from: HI0$b */
    /* loaded from: classes3.dex */
    public static final class C3125b implements Q51.InterfaceC6676b.InterfaceC6677a {
        @Override // p000.Q51.InterfaceC6676b.InterfaceC6677a
        /* renamed from: a */
        public Q51.InterfaceC6676b mo88942a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DialogInterface dialogInterface, AbstractC24507p<IdentificationDocumentType> abstractC24507p) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(abstractC24507p);
            return new C3124a(interfaceC44393lG2, baseActivity, scopeProvider, dialogInterface, abstractC24507p);
        }

        private C3125b() {
        }
    }

    private HI0() {
    }

    /* renamed from: a */
    public static Q51.InterfaceC6676b.InterfaceC6677a m104045a() {
        return new C3125b();
    }
}

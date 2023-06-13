package p000;

import android.content.DialogInterface;
import android.os.Parcelable;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24507p;
import p000.C40009ds2;
/* renamed from: ML0 */
/* loaded from: classes3.dex */
public final class ML0 {

    /* renamed from: ML0$a */
    /* loaded from: classes3.dex */
    public static final class C5271a implements C40009ds2.InterfaceC19878b.InterfaceC19879a {
        @Override // p000.C40009ds2.InterfaceC19878b.InterfaceC19879a
        /* renamed from: a */
        public C40009ds2.InterfaceC19878b mo43576a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DialogInterface dialogInterface, AbstractC24507p<?> abstractC24507p) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(abstractC24507p);
            return new C5272b(interfaceC44393lG2, baseActivity, scopeProvider, dialogInterface, abstractC24507p);
        }

        private C5271a() {
        }
    }

    /* renamed from: ML0$b */
    /* loaded from: classes3.dex */
    public static final class C5272b implements C40009ds2.InterfaceC19878b {

        /* renamed from: a */
        public final C5272b f22984a;

        @Override // p000.C40009ds2.InterfaceC19878b
        /* renamed from: a */
        public void mo43577a(C40009ds2<Parcelable> c40009ds2) {
        }

        public C5272b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DialogInterface dialogInterface, AbstractC24507p<?> abstractC24507p) {
            this.f22984a = this;
        }
    }

    private ML0() {
    }

    /* renamed from: a */
    public static C40009ds2.InterfaceC19878b.InterfaceC19879a m95436a() {
        return new C5271a();
    }
}

package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24507p;
import java.util.Locale;
import p000.C51478xD0;
/* renamed from: sI0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48559sI0 {

    /* renamed from: sI0$a */
    /* loaded from: classes3.dex */
    public static final class C28252a implements C51478xD0.InterfaceC30065b {

        /* renamed from: a */
        public final C28252a f108540a;

        @Override // p000.C51478xD0.InterfaceC30065b
        /* renamed from: a */
        public void mo5661a(C51478xD0 c51478xD0) {
        }

        public C28252a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DialogInterface dialogInterface, AbstractC24507p<Locale> abstractC24507p) {
            this.f108540a = this;
        }
    }

    /* renamed from: sI0$b */
    /* loaded from: classes3.dex */
    public static final class C28253b implements C51478xD0.InterfaceC30065b.InterfaceC30066a {
        @Override // p000.C51478xD0.InterfaceC30065b.InterfaceC30066a
        /* renamed from: a */
        public C51478xD0.InterfaceC30065b mo5660a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DialogInterface dialogInterface, AbstractC24507p<Locale> abstractC24507p) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(abstractC24507p);
            return new C28252a(interfaceC44393lG2, baseActivity, scopeProvider, dialogInterface, abstractC24507p);
        }

        private C28253b() {
        }
    }

    private C48559sI0() {
    }

    /* renamed from: a */
    public static C51478xD0.InterfaceC30065b.InterfaceC30066a m14479a() {
        return new C28253b();
    }
}

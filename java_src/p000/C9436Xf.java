package p000;

import android.app.Activity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: Xf */
/* loaded from: classes2.dex */
public final class C9436Xf {

    /* renamed from: a */
    public final Y94<InterfaceC27649qg> f43501a;

    /* renamed from: b */
    public final Y94<NV0> f43502b;

    public C9436Xf(Y94<InterfaceC27649qg> y94, Y94<NV0> y942) {
        this.f43501a = y94;
        this.f43502b = y942;
    }

    /* renamed from: a */
    public static C9436Xf m76734a(Y94<InterfaceC27649qg> y94, Y94<NV0> y942) {
        return new C9436Xf(y94, y942);
    }

    /* renamed from: c */
    public static C6421Pf m76732c(InterfaceC27649qg interfaceC27649qg, NV0 nv0, C9883Yf c9883Yf, ScopeProvider scopeProvider, Activity activity) {
        return new C6421Pf(interfaceC27649qg, nv0, c9883Yf, scopeProvider, activity);
    }

    /* renamed from: b */
    public C6421Pf m76733b(C9883Yf c9883Yf, ScopeProvider scopeProvider, Activity activity) {
        return m76732c(this.f43501a.get(), this.f43502b.get(), c9883Yf, scopeProvider, activity);
    }
}

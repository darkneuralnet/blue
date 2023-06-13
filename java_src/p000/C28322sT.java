package p000;

import android.content.res.Resources;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: sT */
/* loaded from: classes2.dex */
public final class C28322sT {

    /* renamed from: a */
    public final Y94<InterfaceC36675Vq4> f108835a;

    /* renamed from: b */
    public final Y94<FO2> f108836b;

    /* renamed from: c */
    public final Y94<InterfaceC32604Eg1> f108837c;

    /* renamed from: d */
    public final Y94<C22454gl> f108838d;

    public C28322sT(Y94<InterfaceC36675Vq4> y94, Y94<FO2> y942, Y94<InterfaceC32604Eg1> y943, Y94<C22454gl> y944) {
        this.f108835a = y94;
        this.f108836b = y942;
        this.f108837c = y943;
        this.f108838d = y944;
    }

    /* renamed from: a */
    public static C28322sT m14173a(Y94<InterfaceC36675Vq4> y94, Y94<FO2> y942, Y94<InterfaceC32604Eg1> y943, Y94<C22454gl> y944) {
        return new C28322sT(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C27296pT m14171c(InterfaceC36675Vq4 interfaceC36675Vq4, FO2 fo2, InterfaceC32604Eg1 interfaceC32604Eg1, C22454gl c22454gl, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, Resources resources, InterfaceC28719tT interfaceC28719tT, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return new C27296pT(interfaceC36675Vq4, fo2, interfaceC32604Eg1, c22454gl, lifecycleScopeProvider, resources, interfaceC28719tT, interfaceC40099e13, dq3);
    }

    /* renamed from: b */
    public C27296pT m14172b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, Resources resources, InterfaceC28719tT interfaceC28719tT, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return m14171c(this.f108835a.get(), this.f108836b.get(), this.f108837c.get(), this.f108838d.get(), lifecycleScopeProvider, resources, interfaceC28719tT, interfaceC40099e13, dq3);
    }
}

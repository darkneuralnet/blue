package p000;

import android.content.Context;
import co.bird.android.app.feature.ridertutorial.widget.BeginnerModeBottomView;
import com.uber.autodispose.ScopeProvider;
/* renamed from: uG */
/* loaded from: classes2.dex */
public final class C29163uG {

    /* renamed from: a */
    public final Y94<InterfaceC41018fa5> f112100a;

    /* renamed from: b */
    public final Y94<Context> f112101b;

    public C29163uG(Y94<InterfaceC41018fa5> y94, Y94<Context> y942) {
        this.f112100a = y94;
        this.f112101b = y942;
    }

    /* renamed from: a */
    public static C29163uG m10495a(Y94<InterfaceC41018fa5> y94, Y94<Context> y942) {
        return new C29163uG(y94, y942);
    }

    /* renamed from: c */
    public static C27204pG m10493c(InterfaceC41018fa5 interfaceC41018fa5, Context context, InterfaceC37468Za5 interfaceC37468Za5, BeginnerModeBottomView beginnerModeBottomView, ScopeProvider scopeProvider) {
        return new C27204pG(interfaceC41018fa5, context, interfaceC37468Za5, beginnerModeBottomView, scopeProvider);
    }

    /* renamed from: b */
    public C27204pG m10494b(InterfaceC37468Za5 interfaceC37468Za5, BeginnerModeBottomView beginnerModeBottomView, ScopeProvider scopeProvider) {
        return m10493c(this.f112100a.get(), this.f112101b.get(), interfaceC37468Za5, beginnerModeBottomView, scopeProvider);
    }
}

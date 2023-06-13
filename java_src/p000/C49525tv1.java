package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"Ltv1;", "Lvv1;", "LgV2$c;", "LWv1;", "focusState", "", "F", "Lkotlin/Function1;", "l", "Lkotlin/jvm/functions/Function1;", "getOnFocusChanged", "()Lkotlin/jvm/functions/Function1;", "e0", "(Lkotlin/jvm/functions/Function1;)V", "onFocusChanged", "m", "LWv1;", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49525tv1 extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC50710vv1 {

    /* renamed from: l */
    public Function1<? super InterfaceC36951Wv1, Unit> f111371l;

    /* renamed from: m */
    public InterfaceC36951Wv1 f111372m;

    public C49525tv1(Function1<? super InterfaceC36951Wv1, Unit> onFocusChanged) {
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        this.f111371l = onFocusChanged;
    }

    @Override // p000.InterfaceC50710vv1
    /* renamed from: F */
    public void mo7774F(InterfaceC36951Wv1 focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (!Intrinsics.areEqual(this.f111372m, focusState)) {
            this.f111372m = focusState;
            this.f111371l.invoke(focusState);
        }
    }

    /* renamed from: e0 */
    public final void m11221e0(Function1<? super InterfaceC36951Wv1, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f111371l = function1;
    }
}

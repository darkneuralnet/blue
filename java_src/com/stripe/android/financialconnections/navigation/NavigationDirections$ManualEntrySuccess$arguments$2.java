package com.stripe.android.financialconnections.navigation;

import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.WY2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LzY2;", "", "invoke", "(LzY2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class NavigationDirections$ManualEntrySuccess$arguments$2 extends Lambda implements Function1<C52855zY2, Unit> {
    public static final NavigationDirections$ManualEntrySuccess$arguments$2 INSTANCE = new NavigationDirections$ManualEntrySuccess$arguments$2();

    public NavigationDirections$ManualEntrySuccess$arguments$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C52855zY2 c52855zY2) {
        invoke2(c52855zY2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C52855zY2 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.m1178b(new WY2.C9096m(LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.class));
    }
}

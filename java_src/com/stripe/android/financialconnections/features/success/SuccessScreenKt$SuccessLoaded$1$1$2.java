package com.stripe.android.financialconnections.features.success;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SuccessScreenKt$SuccessLoaded$1$1$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ String $disconnectUrl;
    final /* synthetic */ Function0<Unit> $onDisconnectLinkClick;
    final /* synthetic */ InterfaceC32366Df6 $uriHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessScreenKt$SuccessLoaded$1$1$2(Function0<Unit> function0, InterfaceC32366Df6 interfaceC32366Df6, String str) {
        super(1);
        this.$onDisconnectLinkClick = function0;
        this.$uriHandler = interfaceC32366Df6;
        this.$disconnectUrl = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onDisconnectLinkClick.invoke();
        this.$uriHandler.openUri(this.$disconnectUrl);
    }
}

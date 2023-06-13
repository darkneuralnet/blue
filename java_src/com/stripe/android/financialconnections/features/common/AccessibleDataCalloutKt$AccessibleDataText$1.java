package com.stripe.android.financialconnections.features.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccessibleDataCalloutKt$AccessibleDataText$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ AccessibleDataCalloutModel $model;
    final /* synthetic */ Function0<Unit> $onLearnMoreClick;
    final /* synthetic */ InterfaceC32366Df6 $uriHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibleDataCalloutKt$AccessibleDataText$1(InterfaceC32366Df6 interfaceC32366Df6, AccessibleDataCalloutModel accessibleDataCalloutModel, Function0<Unit> function0) {
        super(1);
        this.$uriHandler = interfaceC32366Df6;
        this.$model = accessibleDataCalloutModel;
        this.$onLearnMoreClick = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$uriHandler.openUri(this.$model.getDataPolicyUrl());
        this.$onLearnMoreClick.invoke();
    }
}

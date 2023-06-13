package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.features.manualentrysuccess.ComposableSingletons$ManualEntrySuccessScreenKt$lambda-5$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ManualEntrySuccessScreenKt$lambda5$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$ManualEntrySuccessScreenKt$lambda5$1 INSTANCE = new ComposableSingletons$ManualEntrySuccessScreenKt$lambda5$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentrysuccess.ComposableSingletons$ManualEntrySuccessScreenKt$lambda-5$1$1 */
    /* loaded from: classes7.dex */
    public static final class C188461 extends Lambda implements Function0<Unit> {
        public static final C188461 INSTANCE = new C188461();

        public C188461() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentrysuccess.ComposableSingletons$ManualEntrySuccessScreenKt$lambda-5$1$2 */
    /* loaded from: classes7.dex */
    public static final class C188472 extends Lambda implements Function0<Unit> {
        public static final C188472 INSTANCE = new C188472();

        public C188472() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$ManualEntrySuccessScreenKt$lambda5$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1721125294, i, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.ComposableSingletons$ManualEntrySuccessScreenKt.lambda-5.<anonymous> (ManualEntrySuccessScreen.kt:334)");
        }
        ManualEntrySuccessScreenKt.ManualEntrySuccessContent(LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.DESCRIPTOR_CODE, null, false, C188461.INSTANCE, C188472.INSTANCE, interfaceC32720Et0, 28086);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}

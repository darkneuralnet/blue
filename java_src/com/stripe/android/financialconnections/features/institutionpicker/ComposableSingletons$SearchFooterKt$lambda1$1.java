package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.features.institutionpicker.ComposableSingletons$SearchFooterKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$SearchFooterKt$lambda1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$SearchFooterKt$lambda1$1 INSTANCE = new ComposableSingletons$SearchFooterKt$lambda1$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.ComposableSingletons$SearchFooterKt$lambda-1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C187521 extends Lambda implements Function0<Unit> {
        public static final C187521 INSTANCE = new C187521();

        public C187521() {
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

    public ComposableSingletons$SearchFooterKt$lambda1$1() {
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
            C35528Qt0.m87816Z(-2130296234, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.ComposableSingletons$SearchFooterKt.lambda-1.<anonymous> (SearchFooter.kt:107)");
        }
        SearchFooterKt.SearchFooter(C187521.INSTANCE, false, interfaceC32720Et0, 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}

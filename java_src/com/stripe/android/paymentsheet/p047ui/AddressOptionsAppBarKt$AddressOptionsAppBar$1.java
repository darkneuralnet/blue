package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.AddressOptionsAppBarKt$AddressOptionsAppBar$1 */
/* loaded from: classes7.dex */
public final class AddressOptionsAppBarKt$AddressOptionsAppBar$1 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isRootScreen;
    final /* synthetic */ Function0<Unit> $onButtonClick;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.AddressOptionsAppBarKt$AddressOptionsAppBar$1$1 */
    /* loaded from: classes7.dex */
    public static final class C192941 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ boolean $isRootScreen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192941(boolean z) {
            super(2);
            this.$isRootScreen = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            int i3;
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(782248533, i, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous>.<anonymous> (AddressOptionsAppBar.kt:27)");
            }
            if (this.$isRootScreen) {
                i2 = C19159R.C19160drawable.stripe_ic_paymentsheet_close;
            } else {
                i2 = C19159R.C19160drawable.stripe_ic_paymentsheet_back;
            }
            AbstractC45562nE3 m19793d = C46748pE3.m19793d(i2, interfaceC32720Et0, 0);
            if (this.$isRootScreen) {
                i3 = C19159R.string.stripe_paymentsheet_close;
            } else {
                i3 = C19159R.string.back;
            }
            DP1.m110533b(m19793d, C40946fS5.m41310c(i3, interfaceC32720Et0, 0), null, StripeThemeKt.getStripeColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116694getAppBarIcon0d7_KjU(), interfaceC32720Et0, 8, 4);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressOptionsAppBarKt$AddressOptionsAppBar$1(Function0<Unit> function0, int i, boolean z) {
        super(3);
        this.$onButtonClick = function0;
        this.$$dirty = i;
        this.$isRootScreen = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC37486Zc5 TopAppBar, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(663677113, i, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous> (AddressOptionsAppBar.kt:24)");
        }
        C47438qP1.m17541a(this.$onButtonClick, null, false, null, C43575jt0.m29791b(interfaceC32720Et0, 782248533, true, new C192941(this.$isRootScreen)), interfaceC32720Et0, ((this.$$dirty >> 3) & 14) | 24576, 14);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}

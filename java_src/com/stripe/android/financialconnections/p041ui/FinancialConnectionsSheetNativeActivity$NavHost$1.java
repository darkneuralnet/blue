package com.stripe.android.financialconnections.p041ui;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenKt;
import com.stripe.android.financialconnections.features.consent.ConsentScreenKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessScreenKt;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenKt;
import com.stripe.android.financialconnections.features.reset.ResetScreenKt;
import com.stripe.android.financialconnections.features.success.SuccessScreenKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1 */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeActivity$NavHost$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ String $initialDestination;
    final /* synthetic */ OY2 $navController;
    final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1$1 */
    /* loaded from: classes7.dex */
    public static final class C189121 extends Lambda implements Function1<KY2, Unit> {
        final /* synthetic */ OY2 $navController;
        final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1$1$1 */
        /* loaded from: classes7.dex */
        public static final class C189131 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ OY2 $navController;
            final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C189131(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
                super(3);
                this.this$0 = financialConnectionsSheetNativeActivity;
                this.$navController = oy2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(ay2, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1907206597, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:155)");
                }
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.CONSENT;
                financialConnectionsSheetNativeActivity.LaunchedPane(pane, interfaceC32720Et0, 70);
                this.this$0.BackHandler(this.$navController, pane, interfaceC32720Et0, 568);
                ConsentScreenKt.ConsentScreen(interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1$1$2 */
        /* loaded from: classes7.dex */
        public static final class C189142 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ OY2 $navController;
            final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C189142(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
                super(3);
                this.this$0 = financialConnectionsSheetNativeActivity;
                this.$navController = oy2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(ay2, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1561035580, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:160)");
                }
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY;
                financialConnectionsSheetNativeActivity.LaunchedPane(pane, interfaceC32720Et0, 70);
                this.this$0.BackHandler(this.$navController, pane, interfaceC32720Et0, 568);
                ManualEntryScreenKt.ManualEntryScreen(interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1$1$3 */
        /* loaded from: classes7.dex */
        public static final class C189153 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ OY2 $navController;
            final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C189153(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
                super(3);
                this.this$0 = financialConnectionsSheetNativeActivity;
                this.$navController = oy2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(ay2, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-789959811, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:168)");
                }
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS;
                financialConnectionsSheetNativeActivity.LaunchedPane(pane, interfaceC32720Et0, 70);
                this.this$0.BackHandler(this.$navController, pane, interfaceC32720Et0, 568);
                ManualEntrySuccessScreenKt.ManualEntrySuccessScreen(it, interfaceC32720Et0, 8);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1$1$4 */
        /* loaded from: classes7.dex */
        public static final class C189164 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ OY2 $navController;
            final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C189164(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
                super(3);
                this.this$0 = financialConnectionsSheetNativeActivity;
                this.$navController = oy2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(ay2, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1154012094, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:173)");
                }
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
                financialConnectionsSheetNativeActivity.LaunchedPane(pane, interfaceC32720Et0, 70);
                this.this$0.BackHandler(this.$navController, pane, interfaceC32720Et0, 568);
                InstitutionPickerScreenKt.InstitutionPickerScreen(interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1$1$5 */
        /* loaded from: classes7.dex */
        public static final class C189175 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ OY2 $navController;
            final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C189175(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
                super(3);
                this.this$0 = financialConnectionsSheetNativeActivity;
                this.$navController = oy2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(ay2, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1196983297, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:178)");
                }
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH;
                financialConnectionsSheetNativeActivity.LaunchedPane(pane, interfaceC32720Et0, 70);
                this.this$0.BackHandler(this.$navController, pane, interfaceC32720Et0, 568);
                PartnerAuthScreenKt.PartnerAuthScreen(interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1$1$6 */
        /* loaded from: classes7.dex */
        public static final class C189186 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ OY2 $navController;
            final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C189186(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
                super(3);
                this.this$0 = financialConnectionsSheetNativeActivity;
                this.$navController = oy2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(ay2, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(746988608, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:183)");
                }
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER;
                financialConnectionsSheetNativeActivity.LaunchedPane(pane, interfaceC32720Et0, 70);
                this.this$0.BackHandler(this.$navController, pane, interfaceC32720Et0, 568);
                AccountPickerScreenKt.AccountPickerScreen(interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1$1$7 */
        /* loaded from: classes7.dex */
        public static final class C189197 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ OY2 $navController;
            final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C189197(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
                super(3);
                this.this$0 = financialConnectionsSheetNativeActivity;
                this.$navController = oy2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(ay2, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1604006783, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:188)");
                }
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.SUCCESS;
                financialConnectionsSheetNativeActivity.LaunchedPane(pane, interfaceC32720Et0, 70);
                this.this$0.BackHandler(this.$navController, pane, interfaceC32720Et0, 568);
                SuccessScreenKt.SuccessScreen(interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1$1$8 */
        /* loaded from: classes7.dex */
        public static final class C189208 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ OY2 $navController;
            final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C189208(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
                super(3);
                this.this$0 = financialConnectionsSheetNativeActivity;
                this.$navController = oy2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(ay2, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(339965122, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:193)");
                }
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.RESET;
                financialConnectionsSheetNativeActivity.LaunchedPane(pane, interfaceC32720Et0, 70);
                this.this$0.BackHandler(this.$navController, pane, interfaceC32720Et0, 568);
                ResetScreenKt.ResetScreen(interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$1$1$9 */
        /* loaded from: classes7.dex */
        public static final class C189219 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ OY2 $navController;
            final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C189219(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
                super(3);
                this.this$0 = financialConnectionsSheetNativeActivity;
                this.$navController = oy2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(ay2, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-2011030269, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:198)");
                }
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT;
                financialConnectionsSheetNativeActivity.LaunchedPane(pane, interfaceC32720Et0, 70);
                this.this$0.BackHandler(this.$navController, pane, interfaceC32720Et0, 568);
                AttachPaymentScreenKt.AttachPaymentScreen(interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189121(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2) {
            super(1);
            this.this$0 = financialConnectionsSheetNativeActivity;
            this.$navController = oy2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KY2 ky2) {
            invoke2(ky2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(KY2 NavHost) {
            Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
            NavigationDirections navigationDirections = NavigationDirections.INSTANCE;
            MY2.m95170b(NavHost, navigationDirections.getConsent().getDestination(), null, null, C43575jt0.m29790c(1907206597, true, new C189131(this.this$0, this.$navController)), 6, null);
            MY2.m95170b(NavHost, navigationDirections.getManualEntry().getDestination(), null, null, C43575jt0.m29790c(1561035580, true, new C189142(this.this$0, this.$navController)), 6, null);
            MY2.m95170b(NavHost, NavigationDirections.ManualEntrySuccess.route, NavigationDirections.ManualEntrySuccess.INSTANCE.getArguments(), null, C43575jt0.m29790c(-789959811, true, new C189153(this.this$0, this.$navController)), 4, null);
            MY2.m95170b(NavHost, navigationDirections.getInstitutionPicker().getDestination(), null, null, C43575jt0.m29790c(1154012094, true, new C189164(this.this$0, this.$navController)), 6, null);
            MY2.m95170b(NavHost, navigationDirections.getPartnerAuth().getDestination(), null, null, C43575jt0.m29790c(-1196983297, true, new C189175(this.this$0, this.$navController)), 6, null);
            MY2.m95170b(NavHost, navigationDirections.getAccountPicker().getDestination(), null, null, C43575jt0.m29790c(746988608, true, new C189186(this.this$0, this.$navController)), 6, null);
            MY2.m95170b(NavHost, navigationDirections.getSuccess().getDestination(), null, null, C43575jt0.m29790c(-1604006783, true, new C189197(this.this$0, this.$navController)), 6, null);
            MY2.m95170b(NavHost, navigationDirections.getReset().getDestination(), null, null, C43575jt0.m29790c(339965122, true, new C189208(this.this$0, this.$navController)), 6, null);
            MY2.m95170b(NavHost, navigationDirections.getAttachLinkedPaymentAccount().getDestination(), null, null, C43575jt0.m29790c(-2011030269, true, new C189219(this.this$0, this.$navController)), 6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeActivity$NavHost$1(OY2 oy2, String str, FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
        super(2);
        this.$navController = oy2;
        this.$initialDestination = str;
        this.this$0 = financialConnectionsSheetNativeActivity;
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
            C35528Qt0.m87816Z(-789697280, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:153)");
        }
        OY2 oy2 = this.$navController;
        RY2.m86626b(oy2, this.$initialDestination, null, null, new C189121(this.this$0, oy2), interfaceC32720Et0, 8, 12);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}

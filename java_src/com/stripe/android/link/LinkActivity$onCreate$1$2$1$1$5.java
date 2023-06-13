package com.stripe.android.link;

import android.os.Bundle;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.LinkActivity$onCreate$1;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.p042ui.cardedit.CardEditScreenKt;
import com.stripe.android.link.p042ui.paymentmethod.PaymentMethodBodyKt;
import com.stripe.android.link.p042ui.signup.SignUpScreenKt;
import com.stripe.android.link.p042ui.verification.VerificationScreenKt;
import com.stripe.android.link.p042ui.wallet.WalletScreenKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class LinkActivity$onCreate$1$2$1$1$5 extends Lambda implements Function1<KY2, Unit> {
    final /* synthetic */ EX2<Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit>> $bottomSheetContent$delegate;
    final /* synthetic */ ZC0 $coroutineScope;
    final /* synthetic */ InterfaceC48627sP5<LinkAccount> $linkAccount$delegate;
    final /* synthetic */ GU2 $sheetState;
    final /* synthetic */ LinkActivity this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$5$1 */
    /* loaded from: classes7.dex */
    public static final class C189631 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ LinkActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189631(LinkActivity linkActivity) {
            super(3);
            this.this$0 = linkActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(ay2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            LinkActivityViewModel viewModel;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(666856301, i, -1, "com.stripe.android.link.LinkActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkActivity.kt:152)");
            }
            viewModel = this.this$0.getViewModel();
            SignUpScreenKt.SignUpBody(viewModel.getInjector(), interfaceC32720Et0, 8);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$5$2 */
    /* loaded from: classes7.dex */
    public static final class C189642 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ InterfaceC48627sP5<LinkAccount> $linkAccount$delegate;
        final /* synthetic */ LinkActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189642(InterfaceC48627sP5<LinkAccount> interfaceC48627sP5, LinkActivity linkActivity) {
            super(3);
            this.$linkAccount$delegate = interfaceC48627sP5;
            this.this$0 = linkActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(ay2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            LinkAccount invoke$lambda$3$lambda$0;
            LinkActivityViewModel viewModel;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-244023442, i, -1, "com.stripe.android.link.LinkActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkActivity.kt:156)");
            }
            invoke$lambda$3$lambda$0 = LinkActivity$onCreate$1.C189602.C189611.invoke$lambda$3$lambda$0(this.$linkAccount$delegate);
            if (invoke$lambda$3$lambda$0 != null) {
                viewModel = this.this$0.getViewModel();
                VerificationScreenKt.VerificationBodyFullFlow(invoke$lambda$3$lambda$0, viewModel.getInjector(), interfaceC32720Et0, 72);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$5$3 */
    /* loaded from: classes7.dex */
    public static final class C189653 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ EX2<Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit>> $bottomSheetContent$delegate;
        final /* synthetic */ ZC0 $coroutineScope;
        final /* synthetic */ InterfaceC48627sP5<LinkAccount> $linkAccount$delegate;
        final /* synthetic */ GU2 $sheetState;
        final /* synthetic */ LinkActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189653(InterfaceC48627sP5<LinkAccount> interfaceC48627sP5, LinkActivity linkActivity, ZC0 zc0, GU2 gu2, EX2<Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit>> ex2) {
            super(3);
            this.$linkAccount$delegate = interfaceC48627sP5;
            this.this$0 = linkActivity;
            this.$coroutineScope = zc0;
            this.$sheetState = gu2;
            this.$bottomSheetContent$delegate = ex2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(ay2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            LinkAccount invoke$lambda$3$lambda$0;
            LinkActivityViewModel viewModel;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1154903185, i, -1, "com.stripe.android.link.LinkActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkActivity.kt:165)");
            }
            invoke$lambda$3$lambda$0 = LinkActivity$onCreate$1.C189602.C189611.invoke$lambda$3$lambda$0(this.$linkAccount$delegate);
            if (invoke$lambda$3$lambda$0 != null) {
                LinkActivity linkActivity = this.this$0;
                ZC0 zc0 = this.$coroutineScope;
                GU2 gu2 = this.$sheetState;
                EX2<Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit>> ex2 = this.$bottomSheetContent$delegate;
                viewModel = linkActivity.getViewModel();
                WalletScreenKt.WalletBody(invoke$lambda$3$lambda$0, viewModel.getInjector(), new LinkActivity$onCreate$1$2$1$1$5$3$1$1(zc0, gu2, ex2), interfaceC32720Et0, 72);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$5$4 */
    /* loaded from: classes7.dex */
    public static final class C189664 extends Lambda implements Function1<C52855zY2, Unit> {
        public static final C189664 INSTANCE = new C189664();

        public C189664() {
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
            navArgument.m1178b(WY2.f41278k);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$5$5 */
    /* loaded from: classes7.dex */
    public static final class C189675 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ InterfaceC48627sP5<LinkAccount> $linkAccount$delegate;
        final /* synthetic */ LinkActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189675(InterfaceC48627sP5<LinkAccount> interfaceC48627sP5, LinkActivity linkActivity) {
            super(3);
            this.$linkAccount$delegate = interfaceC48627sP5;
            this.this$0 = linkActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(ay2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AY2 backStackEntry, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            LinkAccount invoke$lambda$3$lambda$0;
            LinkActivityViewModel viewModel;
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2065782928, i, -1, "com.stripe.android.link.LinkActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkActivity.kt:190)");
            }
            Bundle m115584d = backStackEntry.m115584d();
            boolean z = m115584d != null ? m115584d.getBoolean(LinkScreen.PaymentMethod.loadArg) : false;
            invoke$lambda$3$lambda$0 = LinkActivity$onCreate$1.C189602.C189611.invoke$lambda$3$lambda$0(this.$linkAccount$delegate);
            if (invoke$lambda$3$lambda$0 != null) {
                viewModel = this.this$0.getViewModel();
                PaymentMethodBodyKt.PaymentMethodBody(invoke$lambda$3$lambda$0, viewModel.getInjector(), z, interfaceC32720Et0, 72);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$5$6 */
    /* loaded from: classes7.dex */
    public static final class C189686 extends Lambda implements Function1<C52855zY2, Unit> {
        public static final C189686 INSTANCE = new C189686();

        public C189686() {
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
            navArgument.m1178b(WY2.f41280m);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$5$7 */
    /* loaded from: classes7.dex */
    public static final class C189697 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ InterfaceC48627sP5<LinkAccount> $linkAccount$delegate;
        final /* synthetic */ LinkActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189697(InterfaceC48627sP5<LinkAccount> interfaceC48627sP5, LinkActivity linkActivity) {
            super(3);
            this.$linkAccount$delegate = interfaceC48627sP5;
            this.this$0 = linkActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(ay2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AY2 backStackEntry, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            LinkAccount invoke$lambda$3$lambda$0;
            LinkActivityViewModel viewModel;
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1318304625, i, -1, "com.stripe.android.link.LinkActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkActivity.kt:209)");
            }
            Bundle m115584d = backStackEntry.m115584d();
            String string = m115584d != null ? m115584d.getString("id") : null;
            invoke$lambda$3$lambda$0 = LinkActivity$onCreate$1.C189602.C189611.invoke$lambda$3$lambda$0(this.$linkAccount$delegate);
            if (invoke$lambda$3$lambda$0 != null) {
                viewModel = this.this$0.getViewModel();
                NonFallbackInjector injector = viewModel.getInjector();
                if (string != null) {
                    CardEditScreenKt.CardEditBody(invoke$lambda$3$lambda$0, injector, string, interfaceC32720Et0, 72);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivity$onCreate$1$2$1$1$5(LinkActivity linkActivity, InterfaceC48627sP5<LinkAccount> interfaceC48627sP5, ZC0 zc0, GU2 gu2, EX2<Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit>> ex2) {
        super(1);
        this.this$0 = linkActivity;
        this.$linkAccount$delegate = interfaceC48627sP5;
        this.$coroutineScope = zc0;
        this.$sheetState = gu2;
        this.$bottomSheetContent$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KY2 ky2) {
        invoke2(ky2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(KY2 NavHost) {
        List listOf;
        List listOf2;
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        MY2.m95170b(NavHost, LinkScreen.Loading.INSTANCE.getRoute(), null, null, ComposableSingletons$LinkActivityKt.INSTANCE.m116482getLambda2$link_release(), 6, null);
        MY2.m95170b(NavHost, LinkScreen.SignUp.INSTANCE.getRoute(), null, null, C43575jt0.m29790c(666856301, true, new C189631(this.this$0)), 6, null);
        MY2.m95170b(NavHost, LinkScreen.Verification.INSTANCE.getRoute(), null, null, C43575jt0.m29790c(-244023442, true, new C189642(this.$linkAccount$delegate, this.this$0)), 6, null);
        MY2.m95170b(NavHost, LinkScreen.Wallet.INSTANCE.getRoute(), null, null, C43575jt0.m29790c(-1154903185, true, new C189653(this.$linkAccount$delegate, this.this$0, this.$coroutineScope, this.$sheetState, this.$bottomSheetContent$delegate)), 6, null);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(C45741nY2.m23553a(LinkScreen.PaymentMethod.loadArg, C189664.INSTANCE));
        MY2.m95170b(NavHost, LinkScreen.PaymentMethod.route, listOf, null, C43575jt0.m29790c(-2065782928, true, new C189675(this.$linkAccount$delegate, this.this$0)), 4, null);
        listOf2 = CollectionsKt__CollectionsJVMKt.listOf(C45741nY2.m23553a("id", C189686.INSTANCE));
        MY2.m95170b(NavHost, LinkScreen.CardEdit.route, listOf2, null, C43575jt0.m29790c(1318304625, true, new C189697(this.$linkAccount$delegate, this.this$0)), 4, null);
    }
}

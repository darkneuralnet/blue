package com.stripe.android.link.p042ui.verification;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.injection.LinkPaymentLauncherComponent;
import com.stripe.android.link.model.LinkAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.verification.VerificationDialogKt$LinkVerificationDialog$1 */
/* loaded from: classes7.dex */
public final class VerificationDialogKt$LinkVerificationDialog$1 extends Lambda implements Function1<KY2, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ LinkPaymentLauncher $linkLauncher;
    final /* synthetic */ OY2 $navController;
    final /* synthetic */ Function1<Boolean, Unit> $onResult;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nVerificationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationDialog.kt\ncom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,124:1\n1057#2,6:125\n76#3:131\n102#3,2:132\n76#3:134\n*S KotlinDebug\n*F\n+ 1 VerificationDialog.kt\ncom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1\n*L\n58#1:125,6\n58#1:131\n58#1:132,2\n70#1:134\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.verification.VerificationDialogKt$LinkVerificationDialog$1$1 */
    /* loaded from: classes7.dex */
    public static final class C190561 extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ LinkPaymentLauncher $linkLauncher;
        final /* synthetic */ OY2 $navController;
        final /* synthetic */ Function1<Boolean, Unit> $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C190561(LinkPaymentLauncher linkPaymentLauncher, OY2 oy2, Function1<? super Boolean, Unit> function1, int i) {
            super(3);
            this.$linkLauncher = linkPaymentLauncher;
            this.$navController = oy2;
            this.$onResult = function1;
            this.$$dirty = i;
        }

        private static final boolean invoke$lambda$1(EX2<Boolean> ex2) {
            return ex2.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(EX2<Boolean> ex2, boolean z) {
            ex2.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AY2 invoke$lambda$3(InterfaceC48627sP5<AY2> interfaceC48627sP5) {
            return interfaceC48627sP5.getValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(ay2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1264008798, i, -1, "com.stripe.android.link.ui.verification.LinkVerificationDialog.<anonymous>.<anonymous> (VerificationDialog.kt:56)");
            }
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = LM5.m97025e(Boolean.TRUE, null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            EX2 ex2 = (EX2) mo89635G;
            LinkPaymentLauncherComponent component$link_release = this.$linkLauncher.getComponent$link_release();
            if (component$link_release != null) {
                InterfaceC48627sP5 m105205b = GM5.m105205b(component$link_release.getLinkAccountManager().getLinkAccount(), null, interfaceC32720Et0, 8, 1);
                VerificationDialogKt$LinkVerificationDialog$1$1$onDismiss$1 verificationDialogKt$LinkVerificationDialog$1$1$onDismiss$1 = new VerificationDialogKt$LinkVerificationDialog$1$1$onDismiss$1(component$link_release.getLinkEventsReporter(), this.$onResult, ex2);
                InterfaceC48627sP5<AY2> m90123d = PY2.m90123d(this.$navController, interfaceC32720Et0, 8);
                LinkAccount linkAccount = (LinkAccount) m105205b.getValue();
                if (linkAccount != null) {
                    Function1<Boolean, Unit> function1 = this.$onResult;
                    int i2 = this.$$dirty;
                    if (invoke$lambda$1(ex2)) {
                        C1556Dc.m110114a(verificationDialogKt$LinkVerificationDialog$1$1$onDismiss$1, new D31(false, false, null, false, false, 23, null), C43575jt0.m29791b(interfaceC32720Et0, -290686910, true, new VerificationDialogKt$LinkVerificationDialog$1$1$1$1(linkAccount, verificationDialogKt$LinkVerificationDialog$1$1$onDismiss$1, component$link_release, ex2, function1, i2, m90123d)), interfaceC32720Et0, 432, 0);
                    }
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VerificationDialogKt$LinkVerificationDialog$1(LinkPaymentLauncher linkPaymentLauncher, OY2 oy2, Function1<? super Boolean, Unit> function1, int i) {
        super(1);
        this.$linkLauncher = linkPaymentLauncher;
        this.$navController = oy2;
        this.$onResult = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KY2 ky2) {
        invoke2(ky2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(KY2 NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        MY2.m95170b(NavHost, LinkScreen.VerificationDialog.INSTANCE.getRoute(), null, null, C43575jt0.m29790c(-1264008798, true, new C190561(this.$linkLauncher, this.$navController, this.$onResult, this.$$dirty)), 6, null);
    }
}

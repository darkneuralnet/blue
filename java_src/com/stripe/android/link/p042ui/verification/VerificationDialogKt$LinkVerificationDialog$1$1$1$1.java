package com.stripe.android.link.p042ui.verification;

import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.injection.LinkPaymentLauncherComponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.p042ui.LinkAppBarKt;
import com.stripe.android.link.p042ui.LinkAppBarStateKt;
import com.stripe.android.link.p042ui.verification.VerificationDialogKt$LinkVerificationDialog$1;
import com.stripe.android.link.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.verification.VerificationDialogKt$LinkVerificationDialog$1$1$1$1 */
/* loaded from: classes7.dex */
public final class VerificationDialogKt$LinkVerificationDialog$1$1$1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ LinkAccount $account;
    final /* synthetic */ InterfaceC48627sP5<AY2> $backStackEntry$delegate;
    final /* synthetic */ LinkPaymentLauncherComponent $component;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<Boolean, Unit> $onResult;
    final /* synthetic */ EX2<Boolean> $openDialog$delegate;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nVerificationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationDialog.kt\ncom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,124:1\n154#2:125\n*S KotlinDebug\n*F\n+ 1 VerificationDialog.kt\ncom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1\n*L\n82#1:125\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.verification.VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C190571 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ LinkAccount $account;
        final /* synthetic */ InterfaceC48627sP5<AY2> $backStackEntry$delegate;
        final /* synthetic */ LinkPaymentLauncherComponent $component;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function1<Boolean, Unit> $onResult;
        final /* synthetic */ EX2<Boolean> $openDialog$delegate;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nVerificationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationDialog.kt\ncom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n73#2,7:125\n80#2:158\n84#2:171\n75#3:132\n76#3,11:134\n89#3:170\n76#4:133\n460#5,13:145\n50#5:159\n49#5:160\n473#5,3:167\n1057#6,6:161\n*S KotlinDebug\n*F\n+ 1 VerificationDialog.kt\ncom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1$1\n*L\n85#1:125,7\n85#1:158\n85#1:171\n85#1:132\n85#1:134,11\n85#1:170\n85#1:133\n85#1:145,13\n110#1:159\n110#1:160\n85#1:167,3\n110#1:161,6\n*E\n"})
        /* renamed from: com.stripe.android.link.ui.verification.VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1$1 */
        /* loaded from: classes7.dex */
        public static final class C190581 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ LinkAccount $account;
            final /* synthetic */ InterfaceC48627sP5<AY2> $backStackEntry$delegate;
            final /* synthetic */ LinkPaymentLauncherComponent $component;
            final /* synthetic */ Function0<Unit> $onDismiss;
            final /* synthetic */ Function1<Boolean, Unit> $onResult;
            final /* synthetic */ EX2<Boolean> $openDialog$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C190581(LinkAccount linkAccount, Function0<Unit> function0, LinkPaymentLauncherComponent linkPaymentLauncherComponent, EX2<Boolean> ex2, Function1<? super Boolean, Unit> function1, int i, InterfaceC48627sP5<AY2> interfaceC48627sP5) {
                super(2);
                this.$account = linkAccount;
                this.$onDismiss = function0;
                this.$component = linkPaymentLauncherComponent;
                this.$openDialog$delegate = ex2;
                this.$onResult = function1;
                this.$$dirty = i;
                this.$backStackEntry$delegate = interfaceC48627sP5;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                AY2 invoke$lambda$3;
                HY2 m115582f;
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(638861194, i, -1, "com.stripe.android.link.ui.verification.LinkVerificationDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationDialog.kt:83)");
                }
                LinkAccount linkAccount = this.$account;
                Function0<Unit> function0 = this.$onDismiss;
                LinkPaymentLauncherComponent linkPaymentLauncherComponent = this.$component;
                EX2<Boolean> ex2 = this.$openDialog$delegate;
                Function1<Boolean, Unit> function1 = this.$onResult;
                InterfaceC48627sP5<AY2> interfaceC48627sP5 = this.$backStackEntry$delegate;
                interfaceC32720Et0.mo89638F(-483455358);
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
                if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                interfaceC32720Et0.mo89557h();
                if (interfaceC32720Et0.mo89521t()) {
                    interfaceC32720Et0.mo89617M(m113415a);
                } else {
                    interfaceC32720Et0.mo89566e();
                }
                interfaceC32720Et0.mo89620L();
                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
                C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                interfaceC32720Et0.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89638F(2058660585);
                interfaceC32720Et0.mo89638F(-1163856341);
                C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
                interfaceC32720Et0.mo89638F(694627072);
                invoke$lambda$3 = VerificationDialogKt$LinkVerificationDialog$1.C190561.invoke$lambda$3(interfaceC48627sP5);
                LinkAppBarKt.LinkAppBar(LinkAppBarStateKt.rememberLinkAppBarState(true, (invoke$lambda$3 == null || (m115582f = invoke$lambda$3.m115582f()) == null) ? null : m115582f.m103771w(), linkAccount.getEmail(), linkAccount.getAccountStatus(), interfaceC32720Et0, 6), function0, VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1$1$1$1.INSTANCE, VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1$1$1$2.INSTANCE, interfaceC32720Et0, 3456);
                int i2 = C18975R.string.verification_header_prefilled;
                int i3 = C18975R.string.verification_message;
                NonFallbackInjector injector = linkPaymentLauncherComponent.getInjector();
                interfaceC32720Et0.mo89638F(511388516);
                boolean mo89539n = interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(function1);
                Object mo89635G = interfaceC32720Et0.mo89635G();
                if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1$1$1$3$1(function1, ex2);
                    interfaceC32720Et0.mo89503z(mo89635G);
                }
                interfaceC32720Et0.mo89605Q();
                VerificationScreenKt.VerificationBody(i2, i3, false, linkAccount, injector, (Function0) mo89635G, interfaceC32720Et0, 37248, 0);
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89563f();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C190571(LinkAccount linkAccount, Function0<Unit> function0, LinkPaymentLauncherComponent linkPaymentLauncherComponent, EX2<Boolean> ex2, Function1<? super Boolean, Unit> function1, int i, InterfaceC48627sP5<AY2> interfaceC48627sP5) {
            super(2);
            this.$account = linkAccount;
            this.$onDismiss = function0;
            this.$component = linkPaymentLauncherComponent;
            this.$openDialog$delegate = ex2;
            this.$onResult = function1;
            this.$$dirty = i;
            this.$backStackEntry$delegate = interfaceC48627sP5;
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
                C35528Qt0.m87816Z(-10344634, i, -1, "com.stripe.android.link.ui.verification.LinkVerificationDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationDialog.kt:77)");
            }
            NV5.m93838a(ND3.m94184i(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), C43705k61.m29303g(16)), ThemeKt.getLinkShapes(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).getMedium(), 0L, 0L, null, 0.0f, C43575jt0.m29791b(interfaceC32720Et0, 638861194, true, new C190581(this.$account, this.$onDismiss, this.$component, this.$openDialog$delegate, this.$onResult, this.$$dirty, this.$backStackEntry$delegate)), interfaceC32720Et0, 1572870, 60);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VerificationDialogKt$LinkVerificationDialog$1$1$1$1(LinkAccount linkAccount, Function0<Unit> function0, LinkPaymentLauncherComponent linkPaymentLauncherComponent, EX2<Boolean> ex2, Function1<? super Boolean, Unit> function1, int i, InterfaceC48627sP5<AY2> interfaceC48627sP5) {
        super(2);
        this.$account = linkAccount;
        this.$onDismiss = function0;
        this.$component = linkPaymentLauncherComponent;
        this.$openDialog$delegate = ex2;
        this.$onResult = function1;
        this.$$dirty = i;
        this.$backStackEntry$delegate = interfaceC48627sP5;
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
            C35528Qt0.m87816Z(-290686910, i, -1, "com.stripe.android.link.ui.verification.LinkVerificationDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationDialog.kt:76)");
        }
        ThemeKt.DefaultLinkTheme(false, C43575jt0.m29791b(interfaceC32720Et0, -10344634, true, new C190571(this.$account, this.$onDismiss, this.$component, this.$openDialog$delegate, this.$onResult, this.$$dirty, this.$backStackEntry$delegate)), interfaceC32720Et0, 48, 1);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}

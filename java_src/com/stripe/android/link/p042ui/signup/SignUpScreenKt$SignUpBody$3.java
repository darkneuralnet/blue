package com.stripe.android.link.p042ui.signup;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorTextKt;
import com.stripe.android.link.p042ui.PrimaryButtonKt;
import com.stripe.android.link.p042ui.PrimaryButtonState;
import com.stripe.android.link.theme.ColorKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.TextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C47801r06;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,240:1\n154#2:241\n154#2:242\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3\n*L\n115#1:241\n124#1:242\n*E\n"})
/* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$3 */
/* loaded from: classes7.dex */
public final class SignUpScreenKt$SignUpBody$3 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ boolean $isReadyToSignUp;
    final /* synthetic */ InterfaceC45645nN5 $keyboardController;
    final /* synthetic */ String $merchantName;
    final /* synthetic */ TextFieldController $nameController;
    final /* synthetic */ Function0<Unit> $onSignUpClick;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ boolean $requiresNameCollection;
    final /* synthetic */ SignUpState $signUpState;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$3$1 */
    /* loaded from: classes7.dex */
    public static final class C190371 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ TextFieldController $emailController;
        final /* synthetic */ SignUpState $signUpState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190371(TextFieldController textFieldController, SignUpState signUpState, int i) {
            super(2);
            this.$emailController = textFieldController;
            this.$signUpState = signUpState;
            this.$$dirty = i;
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
                C35528Qt0.m87816Z(1970950630, i, -1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous> (SignUpScreen.kt:128)");
            }
            SignUpScreenKt.EmailCollectionSection(true, this.$emailController, this.$signUpState, null, interfaceC32720Et0, ((this.$$dirty >> 6) & 896) | 70, 8);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,240:1\n76#2:241\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$2\n*L\n141#1:241\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$3$2 */
    /* loaded from: classes7.dex */
    public static final class C190382 extends Lambda implements Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ ErrorMessage $errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190382(ErrorMessage errorMessage) {
            super(3);
            this.$errorMessage = errorMessage;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC7907Te, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC7907Te AnimatedVisibility, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            String str;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1023644002, i, -1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous> (SignUpScreen.kt:138)");
            }
            ErrorMessage errorMessage = this.$errorMessage;
            if (errorMessage != null) {
                Resources resources = ((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
                str = errorMessage.getMessage(resources);
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            ErrorTextKt.ErrorText(str, BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), null, interfaceC32720Et0, 48, 4);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,240:1\n74#2,6:241\n80#2:273\n84#2:286\n75#3:247\n76#3,11:249\n89#3:285\n76#4:248\n460#5,13:260\n50#5:274\n49#5:275\n473#5,3:282\n1057#6,6:276\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3\n*L\n146#1:241,6\n146#1:273\n146#1:286\n146#1:247\n146#1:249,11\n146#1:285\n146#1:248\n146#1:260,13\n187#1:274\n187#1:275\n146#1:282,3\n187#1:276,6\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$3$3 */
    /* loaded from: classes7.dex */
    public static final class C190393 extends Lambda implements Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ ErrorMessage $errorMessage;
        final /* synthetic */ boolean $isReadyToSignUp;
        final /* synthetic */ InterfaceC45645nN5 $keyboardController;
        final /* synthetic */ TextFieldController $nameController;
        final /* synthetic */ Function0<Unit> $onSignUpClick;
        final /* synthetic */ PhoneNumberController $phoneNumberController;
        final /* synthetic */ boolean $requiresNameCollection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190393(ErrorMessage errorMessage, boolean z, Function0<Unit> function0, InterfaceC45645nN5 interfaceC45645nN5, int i, PhoneNumberController phoneNumberController, boolean z2, TextFieldController textFieldController) {
            super(3);
            this.$errorMessage = errorMessage;
            this.$isReadyToSignUp = z;
            this.$onSignUpClick = function0;
            this.$keyboardController = interfaceC45645nN5;
            this.$$dirty = i;
            this.$phoneNumberController = phoneNumberController;
            this.$requiresNameCollection = z2;
            this.$nameController = textFieldController;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC7907Te, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC7907Te AnimatedVisibility, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            PrimaryButtonState primaryButtonState;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(177955147, i, -1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous> (SignUpScreen.kt:144)");
            }
            InterfaceC41563gV2 m114255n = BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
            ErrorMessage errorMessage = this.$errorMessage;
            boolean z = this.$isReadyToSignUp;
            Function0<Unit> function0 = this.$onSignUpClick;
            InterfaceC45645nN5 interfaceC45645nN5 = this.$keyboardController;
            int i2 = this.$$dirty;
            PhoneNumberController phoneNumberController = this.$phoneNumberController;
            boolean z2 = this.$requiresNameCollection;
            TextFieldController textFieldController = this.$nameController;
            interfaceC32720Et0.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114255n);
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
            interfaceC32720Et0.mo89638F(-1759394155);
            ColorKt.StripeThemeForLink(C43575jt0.m29791b(interfaceC32720Et0, 1543024705, true, new SignUpScreenKt$SignUpBody$3$3$1$1(phoneNumberController, z2, i2, textFieldController)), interfaceC32720Et0, 6);
            C7489Se.m85173b(c35465Qm0, errorMessage != null, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, -240369475, true, new SignUpScreenKt$SignUpBody$3$3$1$2(errorMessage)), interfaceC32720Et0, 1572870, 30);
            String m41310c = C40946fS5.m41310c(C18975R.string.sign_up, interfaceC32720Et0, 0);
            if (z) {
                primaryButtonState = PrimaryButtonState.Enabled;
            } else {
                primaryButtonState = PrimaryButtonState.Disabled;
            }
            PrimaryButtonState primaryButtonState2 = primaryButtonState;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(function0) | interfaceC32720Et0.mo89539n(interfaceC45645nN5);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new SignUpScreenKt$SignUpBody$3$3$1$3$1(function0, interfaceC45645nN5);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            PrimaryButtonKt.PrimaryButton(m41310c, primaryButtonState2, (Function0) mo89635G, null, null, interfaceC32720Et0, 0, 24);
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
    public SignUpScreenKt$SignUpBody$3(String str, SignUpState signUpState, ErrorMessage errorMessage, TextFieldController textFieldController, int i, boolean z, Function0<Unit> function0, InterfaceC45645nN5 interfaceC45645nN5, PhoneNumberController phoneNumberController, boolean z2, TextFieldController textFieldController2) {
        super(3);
        this.$merchantName = str;
        this.$signUpState = signUpState;
        this.$errorMessage = errorMessage;
        this.$emailController = textFieldController;
        this.$$dirty = i;
        this.$isReadyToSignUp = z;
        this.$onSignUpClick = function0;
        this.$keyboardController = interfaceC45645nN5;
        this.$phoneNumberController = phoneNumberController;
        this.$requiresNameCollection = z2;
        this.$nameController = textFieldController2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC35231Pm0 ScrollableTopLevelColumn, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        if ((i & 14) == 0) {
            i2 = i | (interfaceC32720Et0.mo89539n(ScrollableTopLevelColumn) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(484846906, i2, -1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous> (SignUpScreen.kt:110)");
        }
        String m41310c = C40946fS5.m41310c(C18975R.string.sign_up_header, interfaceC32720Et0, 0);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        float f = 4;
        InterfaceC41563gV2 m94182k = ND3.m94182k(c20912a, 0.0f, C43705k61.m29303g(f), 1, null);
        C47801r06.C27748a c27748a = C47801r06.f106195b;
        int m16678a = c27748a.m16678a();
        TM2 tm2 = TM2.f35372a;
        int i3 = TM2.f35373b;
        C38909c26.m62000e(m41310c, m94182k, tm2.m83731a(interfaceC32720Et0, i3).m94903g(), 0L, null, null, null, 0L, null, C47801r06.m16685g(m16678a), 0L, 0, false, 0, null, tm2.m83729c(interfaceC32720Et0, i3).m104961g(), interfaceC32720Et0, 48, 0, 32248);
        C38909c26.m62000e(C40946fS5.m41309d(C18975R.string.sign_up_message, new Object[]{this.$merchantName}, interfaceC32720Et0, 64), ND3.m94180m(BB5.m114255n(c20912a, 0.0f, 1, null), 0.0f, C43705k61.m29303g(f), 0.0f, C43705k61.m29303g(30), 5, null), tm2.m83731a(interfaceC32720Et0, i3).m94902h(), 0L, null, null, null, 0L, null, C47801r06.m16685g(c27748a.m16678a()), 0L, 0, false, 0, null, tm2.m83729c(interfaceC32720Et0, i3).m104965c(), interfaceC32720Et0, 48, 0, 32248);
        ColorKt.StripeThemeForLink(C43575jt0.m29791b(interfaceC32720Et0, 1970950630, true, new C190371(this.$emailController, this.$signUpState, this.$$dirty)), interfaceC32720Et0, 6);
        SignUpState signUpState = this.$signUpState;
        SignUpState signUpState2 = SignUpState.InputtingPhoneOrName;
        int i4 = 1572864 | (i2 & 14);
        C7489Se.m85173b(ScrollableTopLevelColumn, (signUpState == signUpState2 || this.$errorMessage == null) ? false : true, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 1023644002, true, new C190382(this.$errorMessage)), interfaceC32720Et0, i4, 30);
        C7489Se.m85173b(ScrollableTopLevelColumn, this.$signUpState == signUpState2, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 177955147, true, new C190393(this.$errorMessage, this.$isReadyToSignUp, this.$onSignUpClick, this.$keyboardController, this.$$dirty, this.$phoneNumberController, this.$requiresNameCollection, this.$nameController)), interfaceC32720Et0, i4, 30);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}

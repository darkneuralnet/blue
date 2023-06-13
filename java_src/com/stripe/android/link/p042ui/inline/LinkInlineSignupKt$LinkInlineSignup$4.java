package com.stripe.android.link.p042ui.inline;

import androidx.compose.p003ui.focus.C11309h;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.signup.SignUpState;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.menu.CheckboxKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$4 */
/* loaded from: classes7.dex */
public final class LinkInlineSignupKt$LinkInlineSignup$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ C11309h $focusRequester;
    final /* synthetic */ String $merchantName;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ TextFieldController $nameController;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ boolean $requiresNameCollection;
    final /* synthetic */ SignUpState $signUpState;
    final /* synthetic */ Function0<Unit> $toggleExpanded;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLinkInlineSignup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,299:1\n67#2,6:300\n73#2:332\n77#2:464\n75#3:306\n76#3,11:308\n75#3:346\n76#3,11:348\n75#3:380\n76#3,11:382\n75#3:415\n76#3,11:417\n89#3:448\n89#3:453\n89#3:458\n89#3:463\n76#4:307\n76#4:347\n76#4:381\n76#4:416\n76#4:442\n76#4:444\n460#5,13:319\n36#5:333\n460#5,13:359\n460#5,13:393\n460#5,13:428\n473#5,3:445\n473#5,3:450\n473#5,3:455\n473#5,3:460\n1057#6,6:334\n74#7,6:340\n80#7:372\n73#7,7:408\n80#7:441\n84#7:449\n84#7:459\n154#8:373\n154#8:407\n154#8:443\n75#9,6:374\n81#9:406\n85#9:454\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1\n*L\n157#1:300,6\n157#1:332\n157#1:464\n157#1:306\n157#1:308,11\n168#1:346\n168#1:348,11\n176#1:380\n176#1:382,11\n186#1:415\n186#1:417,11\n186#1:448\n176#1:453\n168#1:458\n157#1:463\n157#1:307\n168#1:347\n176#1:381\n186#1:416\n191#1:442\n200#1:444\n157#1:319,13\n172#1:333\n168#1:359,13\n176#1:393,13\n186#1:428,13\n186#1:445,3\n176#1:450,3\n168#1:455,3\n157#1:460,3\n172#1:334,6\n168#1:340,6\n168#1:372\n186#1:408,7\n186#1:441\n186#1:449\n168#1:459\n178#1:373\n183#1:407\n197#1:443\n176#1:374,6\n176#1:406\n176#1:454\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$4$1 */
    /* loaded from: classes7.dex */
    public static final class C190271 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ TextFieldController $emailController;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ ErrorMessage $errorMessage;
        final /* synthetic */ boolean $expanded;
        final /* synthetic */ C11309h $focusRequester;
        final /* synthetic */ String $merchantName;
        final /* synthetic */ InterfaceC41563gV2 $modifier;
        final /* synthetic */ TextFieldController $nameController;
        final /* synthetic */ PhoneNumberController $phoneNumberController;
        final /* synthetic */ boolean $requiresNameCollection;
        final /* synthetic */ SignUpState $signUpState;
        final /* synthetic */ Function0<Unit> $toggleExpanded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190271(InterfaceC41563gV2 interfaceC41563gV2, Function0<Unit> function0, int i, boolean z, boolean z2, String str, TextFieldController textFieldController, SignUpState signUpState, C11309h c11309h, ErrorMessage errorMessage, PhoneNumberController phoneNumberController, boolean z3, TextFieldController textFieldController2) {
            super(2);
            this.$modifier = interfaceC41563gV2;
            this.$toggleExpanded = function0;
            this.$$dirty = i;
            this.$expanded = z;
            this.$enabled = z2;
            this.$merchantName = str;
            this.$emailController = textFieldController;
            this.$signUpState = signUpState;
            this.$focusRequester = c11309h;
            this.$errorMessage = errorMessage;
            this.$phoneNumberController = phoneNumberController;
            this.$requiresNameCollection = z3;
            this.$nameController = textFieldController2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r67v0, types: [Et0, java.lang.Object] */
        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            G26 m105921d;
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1812071959, i, -1, "com.stripe.android.link.ui.inline.LinkInlineSignup.<anonymous>.<anonymous> (LinkInlineSignup.kt:155)");
            }
            InterfaceC41563gV2 interfaceC41563gV2 = this.$modifier;
            TM2 tm2 = TM2.f35372a;
            int i2 = TM2.f35373b;
            InterfaceC41563gV2 m62125c = C13342bw.m62125c(C19783dZ.m44156f(interfaceC41563gV2, StripeThemeKt.getBorderStroke(tm2, false, interfaceC32720Et0, i2 | 48), ThemeKt.getLinkShapes(tm2, interfaceC32720Et0, i2).getSmall()), StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i2).m116695getComponent0d7_KjU(), ThemeKt.getLinkShapes(tm2, interfaceC32720Et0, i2).getSmall());
            Function0<Unit> function0 = this.$toggleExpanded;
            int i3 = this.$$dirty;
            boolean z = this.$expanded;
            boolean z2 = this.$enabled;
            String str = this.$merchantName;
            TextFieldController textFieldController = this.$emailController;
            SignUpState signUpState = this.$signUpState;
            C11309h c11309h = this.$focusRequester;
            ErrorMessage errorMessage = this.$errorMessage;
            PhoneNumberController phoneNumberController = this.$phoneNumberController;
            boolean z3 = this.$requiresNameCollection;
            TextFieldController textFieldController2 = this.$nameController;
            interfaceC32720Et0.mo89638F(733328855);
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m62125c);
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
            C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(2058660585);
            interfaceC32720Et0.mo89638F(-2137368960);
            C40689f10 c40689f10 = C40689f10.f79291a;
            interfaceC32720Et0.mo89638F(1812022353);
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m88106a = C35447Qk0.m88106a(BB5.m114255n(c20912a, 0.0f, 1, null), ThemeKt.getLinkShapes(tm2, interfaceC32720Et0, i2).getSmall());
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(function0);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new LinkInlineSignupKt$LinkInlineSignup$4$1$1$1$1(function0);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m70814e = C38131ak0.m70814e(m88106a, false, null, null, mo89635G, 7, null);
            interfaceC32720Et0.mo89638F(-483455358);
            C25777lo c25777lo = C25777lo.f96729a;
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m70814e);
            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et0.mo89557h();
            if (interfaceC32720Et0.mo89521t()) {
                interfaceC32720Et0.mo89617M(m113415a2);
            } else {
                interfaceC32720Et0.mo89566e();
            }
            interfaceC32720Et0.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(interfaceC32720Et0);
            C38680bf6.m64191b(m64192a2, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(2058660585);
            interfaceC32720Et0.mo89638F(-1163856341);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            interfaceC32720Et0.mo89638F(163985051);
            InterfaceC41563gV2 m94184i = ND3.m94184i(c20912a, C43705k61.m29303g(16));
            interfaceC32720Et0.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(c25777lo.m26803f(), c4361a.m99135k(), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m94184i);
            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et0.mo89557h();
            if (interfaceC32720Et0.mo89521t()) {
                interfaceC32720Et0.mo89617M(m113415a3);
            } else {
                interfaceC32720Et0.mo89566e();
            }
            interfaceC32720Et0.mo89620L();
            InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(interfaceC32720Et0);
            C38680bf6.m64191b(m64192a3, m74813a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
            C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
            C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a3.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(2058660585);
            interfaceC32720Et0.mo89638F(-678309503);
            C38066ad5 c38066ad5 = C38066ad5.f50835a;
            interfaceC32720Et0.mo89638F(-1970330953);
            CheckboxKt.Checkbox(z, null, ND3.m94180m(c20912a, 0.0f, 0.0f, C43705k61.m29303g(8), 0.0f, 11, null), z2, interfaceC32720Et0, ((i3 >> 18) & 14) | 432 | ((i3 >> 6) & 7168), 0);
            interfaceC32720Et0.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g014 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm24 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq64 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a4 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a4 = C31723Am2.m115273a(c20912a);
            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et0.mo89557h();
            if (interfaceC32720Et0.mo89521t()) {
                interfaceC32720Et0.mo89617M(m113415a4);
            } else {
                interfaceC32720Et0.mo89566e();
            }
            interfaceC32720Et0.mo89620L();
            InterfaceC32720Et0 m64192a4 = C38680bf6.m64192a(interfaceC32720Et0);
            C38680bf6.m64191b(m64192a4, m91546a2, c0757a.m113412d());
            C38680bf6.m64191b(m64192a4, interfaceC41273g014, c0757a.m113414b());
            C38680bf6.m64191b(m64192a4, enumC47065pm24, c0757a.m113413c());
            C38680bf6.m64191b(m64192a4, interfaceC33869Jq64, c0757a.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a4.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(2058660585);
            interfaceC32720Et0.mo89638F(-1163856341);
            interfaceC32720Et0.mo89638F(-2116308351);
            String m41310c = C40946fS5.m41310c(C18975R.string.inline_sign_up_header, interfaceC32720Et0, 0);
            m105921d = r38.m105921d((r42 & 1) != 0 ? r38.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? r38.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r38.f10827a.m105161n() : C33918Jw1.f18784c.m99543a(), (r42 & 8) != 0 ? r38.f10827a.m105163l() : null, (r42 & 16) != 0 ? r38.f10827a.m105162m() : null, (r42 & 32) != 0 ? r38.f10827a.m105166i() : null, (r42 & 64) != 0 ? r38.f10827a.m105165j() : null, (r42 & 128) != 0 ? r38.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r38.f10827a.m105170e() : null, (r42 & 512) != 0 ? r38.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r38.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r38.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r38.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r38.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r38.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r38.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r38.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? tm2.m83729c(interfaceC32720Et0, i2).m104965c().f10828b.m110649m() : null);
            C38909c26.m62000e(m41310c, null, C47063pm0.m18743m(tm2.m83731a(interfaceC32720Et0, i2).m94901i(), ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, m105921d, interfaceC32720Et0, 0, 0, 32762);
            C38909c26.m62000e(C40946fS5.m41309d(C18975R.string.sign_up_message, new Object[]{str}, interfaceC32720Et0, 64), ND3.m94180m(BB5.m114255n(c20912a, 0.0f, 1, null), 0.0f, C43705k61.m29303g(4), 0.0f, 0.0f, 13, null), C47063pm0.m18743m(tm2.m83731a(interfaceC32720Et0, i2).m94901i(), ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm2.m83729c(interfaceC32720Et0, i2).m104965c(), interfaceC32720Et0, 48, 0, 32760);
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            C7489Se.m85173b(c35465Qm0, z, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 414278851, true, new LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2(z2, textFieldController, signUpState, c11309h, i3, errorMessage, phoneNumberController, z3, textFieldController2)), interfaceC32720Et0, 1572870 | ((i3 >> 15) & 112), 30);
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
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
    public LinkInlineSignupKt$LinkInlineSignup$4(InterfaceC41563gV2 interfaceC41563gV2, Function0<Unit> function0, int i, boolean z, boolean z2, String str, TextFieldController textFieldController, SignUpState signUpState, C11309h c11309h, ErrorMessage errorMessage, PhoneNumberController phoneNumberController, boolean z3, TextFieldController textFieldController2) {
        super(2);
        this.$modifier = interfaceC41563gV2;
        this.$toggleExpanded = function0;
        this.$$dirty = i;
        this.$expanded = z;
        this.$enabled = z2;
        this.$merchantName = str;
        this.$emailController = textFieldController;
        this.$signUpState = signUpState;
        this.$focusRequester = c11309h;
        this.$errorMessage = errorMessage;
        this.$phoneNumberController = phoneNumberController;
        this.$requiresNameCollection = z3;
        this.$nameController = textFieldController2;
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
            C35528Qt0.m87816Z(-686933911, i, -1, "com.stripe.android.link.ui.inline.LinkInlineSignup.<anonymous> (LinkInlineSignup.kt:154)");
        }
        StripeThemeKt.StripeTheme(null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 1812071959, true, new C190271(this.$modifier, this.$toggleExpanded, this.$$dirty, this.$expanded, this.$enabled, this.$merchantName, this.$emailController, this.$signUpState, this.$focusRequester, this.$errorMessage, this.$phoneNumberController, this.$requiresNameCollection, this.$nameController)), interfaceC32720Et0, 3072, 7);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}

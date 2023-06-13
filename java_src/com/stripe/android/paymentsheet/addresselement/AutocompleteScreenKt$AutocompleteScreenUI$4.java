package com.stripe.android.paymentsheet.addresselement;

import android.text.SpannableString;
import androidx.compose.p003ui.focus.C11309h;
import androidx.compose.p003ui.focus.C11312i;
import com.stripe.android.p049ui.core.elements.autocomplete.model.AutocompletePrediction;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.text.HtmlKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AutocompleteScreenKt$AutocompleteScreenUI$4 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ Integer $attributionDrawable;
    final /* synthetic */ C11309h $focusRequester;
    final /* synthetic */ InterfaceC48627sP5<Boolean> $loading$delegate;
    final /* synthetic */ InterfaceC48627sP5<List<AutocompletePrediction>> $predictions$delegate;
    final /* synthetic */ InterfaceC48627sP5<String> $query;
    final /* synthetic */ AutocompleteViewModel $viewModel;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAutocompleteScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,235:1\n74#2,6:236\n80#2:268\n74#2,6:346\n80#2:378\n74#2,6:382\n80#2:414\n84#2:428\n84#2:435\n74#2,6:437\n80#2:469\n84#2:474\n84#2:481\n75#3:242\n76#3,11:244\n75#3:276\n76#3,11:278\n89#3:306\n75#3:313\n76#3,11:315\n89#3:343\n75#3:352\n76#3,11:354\n75#3:388\n76#3,11:390\n89#3:427\n89#3:434\n75#3:443\n76#3,11:445\n89#3:473\n89#3:480\n76#4:243\n76#4:277\n76#4:314\n76#4:353\n76#4:389\n76#4:444\n460#5,13:255\n460#5,13:289\n473#5,3:303\n460#5,13:326\n473#5,3:340\n460#5,13:365\n460#5,13:401\n473#5,3:424\n473#5,3:431\n460#5,13:456\n473#5,3:470\n473#5,3:477\n154#6:269\n154#6:345\n154#6:380\n154#6:381\n154#6:429\n154#6:436\n154#6:475\n154#6:476\n67#7,6:270\n73#7:302\n77#7:307\n76#8,5:308\n81#8:339\n85#8:344\n1855#9:379\n1549#9:415\n1620#9,3:416\n766#9:419\n857#9,2:420\n1855#9,2:422\n1856#9:430\n*S KotlinDebug\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1\n*L\n126#1:236,6\n126#1:268\n156#1:346,6\n156#1:378\n162#1:382,6\n162#1:414\n162#1:428\n156#1:435\n201#1:437,6\n201#1:469\n201#1:474\n126#1:481\n126#1:242\n126#1:244,11\n129#1:276\n129#1:278,11\n129#1:306\n144#1:313\n144#1:315,11\n144#1:343\n156#1:352\n156#1:354,11\n162#1:388\n162#1:390,11\n162#1:427\n156#1:434\n201#1:443\n201#1:445,11\n201#1:473\n126#1:480\n126#1:243\n129#1:277\n144#1:314\n156#1:353\n162#1:389\n201#1:444\n126#1:255,13\n129#1:289,13\n129#1:303,3\n144#1:326,13\n144#1:340,3\n156#1:365,13\n162#1:401,13\n162#1:424,3\n156#1:431,3\n201#1:456,13\n201#1:470,3\n126#1:477,3\n132#1:269\n154#1:345\n169#1:380\n170#1:381\n196#1:429\n204#1:436\n223#1:475\n224#1:476\n129#1:270,6\n129#1:302\n129#1:307\n144#1:308,5\n144#1:339\n144#1:344\n159#1:379\n177#1:415\n177#1:416,3\n179#1:419\n179#1:420,2\n181#1:422,2\n159#1:430\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$AutocompleteScreenUI$4$1 */
    /* loaded from: classes7.dex */
    public static final class C191781 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ Integer $attributionDrawable;
        final /* synthetic */ C11309h $focusRequester;
        final /* synthetic */ InterfaceC48627sP5<Boolean> $loading$delegate;
        final /* synthetic */ InterfaceC48627sP5<List<AutocompletePrediction>> $predictions$delegate;
        final /* synthetic */ InterfaceC48627sP5<String> $query;
        final /* synthetic */ AutocompleteViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C191781(InterfaceC48627sP5<String> interfaceC48627sP5, AutocompleteViewModel autocompleteViewModel, C11309h c11309h, InterfaceC48627sP5<Boolean> interfaceC48627sP52, InterfaceC48627sP5<? extends List<AutocompletePrediction>> interfaceC48627sP53, Integer num) {
            super(3);
            this.$query = interfaceC48627sP5;
            this.$viewModel = autocompleteViewModel;
            this.$focusRequester = c11309h;
            this.$loading$delegate = interfaceC48627sP52;
            this.$predictions$delegate = interfaceC48627sP53;
            this.$attributionDrawable = num;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC35231Pm0 ScrollableColumn, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            boolean AutocompleteScreenUI$lambda$1;
            boolean isBlank;
            List<AutocompletePrediction> AutocompleteScreenUI$lambda$0;
            float f;
            InterfaceC32720Et0 interfaceC32720Et02;
            String replace$default;
            List list;
            int collectionSizeOrDefault;
            boolean isBlank2;
            InterfaceC32720Et0 interfaceC32720Et03 = interfaceC32720Et0;
            Intrinsics.checkNotNullParameter(ScrollableColumn, "$this$ScrollableColumn");
            if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(186630339, i, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous>.<anonymous> (AutocompleteScreen.kt:124)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
            InterfaceC48627sP5<String> interfaceC48627sP5 = this.$query;
            AutocompleteViewModel autocompleteViewModel = this.$viewModel;
            C11309h c11309h = this.$focusRequester;
            InterfaceC48627sP5<Boolean> interfaceC48627sP52 = this.$loading$delegate;
            InterfaceC48627sP5<List<AutocompletePrediction>> interfaceC48627sP53 = this.$predictions$delegate;
            Integer num = this.$attributionDrawable;
            interfaceC32720Et03.mo89638F(-483455358);
            C25777lo c25777lo = C25777lo.f96729a;
            C25777lo.InterfaceC25789l m26802g = c25777lo.m26802g();
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26802g, c4361a.m99136j(), interfaceC32720Et03, 0);
            interfaceC32720Et03.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et03.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et03.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et03.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114255n);
            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et0.mo89557h();
            if (interfaceC32720Et0.mo89521t()) {
                interfaceC32720Et03.mo89617M(m113415a);
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
            m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et03, 0);
            interfaceC32720Et03.mo89638F(2058660585);
            interfaceC32720Et03.mo89638F(-1163856341);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            interfaceC32720Et03.mo89638F(1843296185);
            float f2 = 16;
            InterfaceC41563gV2 m94182k = ND3.m94182k(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(f2), 0.0f, 2, null);
            interfaceC32720Et03.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, interfaceC32720Et03, 0);
            interfaceC32720Et03.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et03.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et03.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et03.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94182k);
            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et0.mo89557h();
            if (interfaceC32720Et0.mo89521t()) {
                interfaceC32720Et03.mo89617M(m113415a2);
            } else {
                interfaceC32720Et0.mo89566e();
            }
            interfaceC32720Et0.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(interfaceC32720Et0);
            C38680bf6.m64191b(m64192a2, m44729h, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et03, 0);
            interfaceC32720Et03.mo89638F(2058660585);
            interfaceC32720Et03.mo89638F(-2137368960);
            C40689f10 c40689f10 = C40689f10.f79291a;
            interfaceC32720Et03.mo89638F(-1267175617);
            AutocompleteViewModel autocompleteViewModel2 = autocompleteViewModel;
            TextFieldUIKt.m116751TextFieldSectionuGujYS0(autocompleteViewModel.getTextFieldController(), FY1.f9619b.m107002b(), true, C11312i.m68775a(BB5.m114255n(c20912a, 0.0f, 1, null), c11309h), null, null, interfaceC32720Et0, SimpleTextFieldController.$stable | 384, 48);
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            AutocompleteScreenUI$lambda$1 = AutocompleteScreenKt.AutocompleteScreenUI$lambda$1(interfaceC48627sP52);
            if (AutocompleteScreenUI$lambda$1) {
                interfaceC32720Et03.mo89638F(78720437);
                C25777lo.InterfaceC25782e m26807b = c25777lo.m26807b();
                InterfaceC41563gV2 m114255n2 = BB5.m114255n(c20912a, 0.0f, 1, null);
                interfaceC32720Et03.mo89638F(693286680);
                InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26807b, c4361a.m99135k(), interfaceC32720Et03, 6);
                interfaceC32720Et03.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) interfaceC32720Et03.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) interfaceC32720Et03.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) interfaceC32720Et03.mo89572c(C42399hu0.m35602q());
                Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m114255n2);
                if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                interfaceC32720Et0.mo89557h();
                if (interfaceC32720Et0.mo89521t()) {
                    interfaceC32720Et03.mo89617M(m113415a3);
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
                m115273a3.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et03, 0);
                interfaceC32720Et03.mo89638F(2058660585);
                interfaceC32720Et03.mo89638F(-678309503);
                C38066ad5 c38066ad5 = C38066ad5.f50835a;
                interfaceC32720Et03.mo89638F(-2105237448);
                K74.m99208b(null, 0L, 0.0f, interfaceC32720Et0, 0, 7);
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89563f();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
            } else {
                int i2 = -1323940314;
                isBlank = StringsKt__StringsJVMKt.isBlank(interfaceC48627sP5.getValue());
                if (!isBlank) {
                    interfaceC32720Et03.mo89638F(78720742);
                    AutocompleteScreenUI$lambda$0 = AutocompleteScreenKt.AutocompleteScreenUI$lambda$0(interfaceC48627sP53);
                    if (AutocompleteScreenUI$lambda$0 != null) {
                        if (!AutocompleteScreenUI$lambda$0.isEmpty()) {
                            interfaceC32720Et03.mo89638F(-1024813347);
                            float f3 = 8;
                            L51.m97795a(ND3.m94182k(c20912a, 0.0f, C43705k61.m29303g(f3), 1, null), 0L, 0.0f, 0.0f, interfaceC32720Et0, 6, 14);
                            InterfaceC41563gV2 m114255n3 = BB5.m114255n(c20912a, 0.0f, 1, null);
                            int i3 = -483455358;
                            interfaceC32720Et03.mo89638F(-483455358);
                            int i4 = 0;
                            InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), interfaceC32720Et03, 0);
                            interfaceC32720Et03.mo89638F(-1323940314);
                            InterfaceC41273g01 interfaceC41273g014 = (InterfaceC41273g01) interfaceC32720Et03.mo89572c(C42399hu0.m35612g());
                            EnumC47065pm2 enumC47065pm24 = (EnumC47065pm2) interfaceC32720Et03.mo89572c(C42399hu0.m35607l());
                            InterfaceC33869Jq6 interfaceC33869Jq64 = (InterfaceC33869Jq6) interfaceC32720Et03.mo89572c(C42399hu0.m35602q());
                            Function0<InterfaceC32018Bt0> m113415a4 = c0757a.m113415a();
                            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a4 = C31723Am2.m115273a(m114255n3);
                            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                                C52468yt0.m2335c();
                            }
                            interfaceC32720Et0.mo89557h();
                            if (interfaceC32720Et0.mo89521t()) {
                                interfaceC32720Et03.mo89617M(m113415a4);
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
                            m115273a4.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et03, 0);
                            interfaceC32720Et03.mo89638F(2058660585);
                            interfaceC32720Et03.mo89638F(-1163856341);
                            interfaceC32720Et03.mo89638F(1872367771);
                            for (AutocompletePrediction autocompletePrediction : AutocompleteScreenUI$lambda$0) {
                                SpannableString primaryText = autocompletePrediction.getPrimaryText();
                                SpannableString secondaryText = autocompletePrediction.getSecondaryText();
                                InterfaceC41563gV2 m94183j = ND3.m94183j(C38131ak0.m70814e(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), false, null, null, new AutocompleteScreenKt$AutocompleteScreenUI$4$1$1$3$1$1$1(autocompleteViewModel2, autocompletePrediction), 7, null), C43705k61.m29303g(f2), C43705k61.m29303g(f3));
                                interfaceC32720Et03.mo89638F(i3);
                                InterfaceC51579xO2 m91546a3 = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et03, i4);
                                interfaceC32720Et03.mo89638F(i2);
                                InterfaceC41273g01 interfaceC41273g015 = (InterfaceC41273g01) interfaceC32720Et03.mo89572c(C42399hu0.m35612g());
                                EnumC47065pm2 enumC47065pm25 = (EnumC47065pm2) interfaceC32720Et03.mo89572c(C42399hu0.m35607l());
                                InterfaceC33869Jq6 interfaceC33869Jq65 = (InterfaceC33869Jq6) interfaceC32720Et03.mo89572c(C42399hu0.m35602q());
                                InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
                                Function0<InterfaceC32018Bt0> m113415a5 = c0757a2.m113415a();
                                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a5 = C31723Am2.m115273a(m94183j);
                                if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                                    C52468yt0.m2335c();
                                }
                                interfaceC32720Et0.mo89557h();
                                if (interfaceC32720Et0.mo89521t()) {
                                    interfaceC32720Et03.mo89617M(m113415a5);
                                } else {
                                    interfaceC32720Et0.mo89566e();
                                }
                                interfaceC32720Et0.mo89620L();
                                InterfaceC32720Et0 m64192a5 = C38680bf6.m64192a(interfaceC32720Et0);
                                C38680bf6.m64191b(m64192a5, m91546a3, c0757a2.m113412d());
                                C38680bf6.m64191b(m64192a5, interfaceC41273g015, c0757a2.m113414b());
                                C38680bf6.m64191b(m64192a5, enumC47065pm25, c0757a2.m113413c());
                                C38680bf6.m64191b(m64192a5, interfaceC33869Jq65, c0757a2.m113410f());
                                interfaceC32720Et0.mo89530q();
                                m115273a5.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et03, Integer.valueOf(i4));
                                interfaceC32720Et03.mo89638F(2058660585);
                                interfaceC32720Et03.mo89638F(-1163856341);
                                C35465Qm0 c35465Qm02 = C35465Qm0.f30887a;
                                interfaceC32720Et03.mo89638F(627772795);
                                replace$default = StringsKt__StringsJVMKt.replace$default(interfaceC48627sP5.getValue(), " ", "|", false, 4, (Object) null);
                                list = SequencesKt___SequencesKt.toList(Regex.findAll$default(new Regex(replace$default, RegexOption.IGNORE_CASE), primaryText, i4, 2, null));
                                List<MatchResult> list2 = list;
                                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                for (MatchResult matchResult : list2) {
                                    arrayList.add(matchResult.getValue());
                                }
                                ArrayList<String> arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    isBlank2 = StringsKt__StringsJVMKt.isBlank((String) obj);
                                    if (!isBlank2) {
                                        arrayList2.add(obj);
                                    }
                                }
                                String spannableString = primaryText.toString();
                                Intrinsics.checkNotNullExpressionValue(spannableString, "primaryText.toString()");
                                String str = spannableString;
                                for (String str2 : arrayList2) {
                                    str = StringsKt__StringsJVMKt.replace$default(str, str2, "<b>" + str2 + "</b>", false, 4, (Object) null);
                                }
                                C1577Df annotatedStringResource = HtmlKt.annotatedStringResource(str, null, null, interfaceC32720Et0, 0, 6);
                                TM2 tm2 = TM2.f35372a;
                                int i5 = TM2.f35373b;
                                float f4 = f2;
                                InterfaceC32720Et0 interfaceC32720Et04 = interfaceC32720Et03;
                                C38909c26.m62003b(annotatedStringResource, null, StripeThemeKt.getStripeColors(tm2, interfaceC32720Et03, i5).m116698getOnComponent0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, tm2.m83729c(interfaceC32720Et04, i5).m104965c(), interfaceC32720Et0, 0, 0, 65530);
                                String spannableString2 = secondaryText.toString();
                                Intrinsics.checkNotNullExpressionValue(spannableString2, "secondaryText.toString()");
                                C38909c26.m62000e(spannableString2, null, StripeThemeKt.getStripeColors(tm2, interfaceC32720Et04, i5).m116698getOnComponent0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm2.m83729c(interfaceC32720Et04, i5).m104965c(), interfaceC32720Et0, 0, 0, 32762);
                                interfaceC32720Et0.mo89605Q();
                                interfaceC32720Et0.mo89605Q();
                                interfaceC32720Et0.mo89605Q();
                                interfaceC32720Et0.mo89563f();
                                interfaceC32720Et0.mo89605Q();
                                interfaceC32720Et0.mo89605Q();
                                L51.m97795a(ND3.m94182k(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(f4), 0.0f, 2, null), 0L, 0.0f, 0.0f, interfaceC32720Et0, 6, 14);
                                interfaceC32720Et03 = interfaceC32720Et04;
                                interfaceC48627sP5 = interfaceC48627sP5;
                                f2 = f4;
                                autocompleteViewModel2 = autocompleteViewModel2;
                                i4 = 0;
                                i2 = -1323940314;
                                i3 = -483455358;
                            }
                            f = f2;
                            interfaceC32720Et02 = interfaceC32720Et03;
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89563f();
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89605Q();
                        } else {
                            f = f2;
                            interfaceC32720Et02 = interfaceC32720Et03;
                            interfaceC32720Et02.mo89638F(-1024810488);
                            InterfaceC41563gV2 m94182k2 = ND3.m94182k(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(f), 0.0f, 2, null);
                            interfaceC32720Et02.mo89638F(-483455358);
                            InterfaceC51579xO2 m91546a4 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), interfaceC32720Et02, 0);
                            interfaceC32720Et02.mo89638F(-1323940314);
                            InterfaceC41273g01 interfaceC41273g016 = (InterfaceC41273g01) interfaceC32720Et02.mo89572c(C42399hu0.m35612g());
                            EnumC47065pm2 enumC47065pm26 = (EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l());
                            InterfaceC33869Jq6 interfaceC33869Jq66 = (InterfaceC33869Jq6) interfaceC32720Et02.mo89572c(C42399hu0.m35602q());
                            Function0<InterfaceC32018Bt0> m113415a6 = c0757a.m113415a();
                            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a6 = C31723Am2.m115273a(m94182k2);
                            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                                C52468yt0.m2335c();
                            }
                            interfaceC32720Et0.mo89557h();
                            if (interfaceC32720Et0.mo89521t()) {
                                interfaceC32720Et02.mo89617M(m113415a6);
                            } else {
                                interfaceC32720Et0.mo89566e();
                            }
                            interfaceC32720Et0.mo89620L();
                            InterfaceC32720Et0 m64192a6 = C38680bf6.m64192a(interfaceC32720Et0);
                            C38680bf6.m64191b(m64192a6, m91546a4, c0757a.m113412d());
                            C38680bf6.m64191b(m64192a6, interfaceC41273g016, c0757a.m113414b());
                            C38680bf6.m64191b(m64192a6, enumC47065pm26, c0757a.m113413c());
                            C38680bf6.m64191b(m64192a6, interfaceC33869Jq66, c0757a.m113410f());
                            interfaceC32720Et0.mo89530q();
                            m115273a6.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et02, 0);
                            interfaceC32720Et02.mo89638F(2058660585);
                            interfaceC32720Et02.mo89638F(-1163856341);
                            interfaceC32720Et02.mo89638F(320363122);
                            String m41310c = C40946fS5.m41310c(C19159R.string.stripe_paymentsheet_autocomplete_no_results_found, interfaceC32720Et02, 0);
                            TM2 tm22 = TM2.f35372a;
                            int i6 = TM2.f35373b;
                            C38909c26.m62000e(m41310c, null, StripeThemeKt.getStripeColors(tm22, interfaceC32720Et02, i6).m116698getOnComponent0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm22.m83729c(interfaceC32720Et02, i6).m104965c(), interfaceC32720Et0, 0, 0, 32762);
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89563f();
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89605Q();
                            interfaceC32720Et0.mo89605Q();
                        }
                        if (num != null) {
                            C51659xX1.m5069a(C46748pE3.m19793d(num.intValue(), interfaceC32720Et02, 0), null, C46022o06.m22000a(ND3.m94183j(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(f), C43705k61.m29303g(f)), AutocompleteScreenKt.TEST_TAG_ATTRIBUTION_DRAWABLE), null, null, 0.0f, null, interfaceC32720Et0, 56, 120);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    interfaceC32720Et0.mo89605Q();
                } else {
                    interfaceC32720Et03.mo89638F(78725135);
                    interfaceC32720Et0.mo89605Q();
                }
            }
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
    public AutocompleteScreenKt$AutocompleteScreenUI$4(InterfaceC48627sP5<String> interfaceC48627sP5, AutocompleteViewModel autocompleteViewModel, C11309h c11309h, InterfaceC48627sP5<Boolean> interfaceC48627sP52, InterfaceC48627sP5<? extends List<AutocompletePrediction>> interfaceC48627sP53, Integer num) {
        super(3);
        this.$query = interfaceC48627sP5;
        this.$viewModel = autocompleteViewModel;
        this.$focusRequester = c11309h;
        this.$loading$delegate = interfaceC48627sP52;
        this.$predictions$delegate = interfaceC48627sP53;
        this.$attributionDrawable = num;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PD3 paddingValues, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        if ((i & 14) == 0) {
            i2 = (interfaceC32720Et0.mo89539n(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-927416248, i, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:117)");
        }
        AddressUtilsKt.ScrollableColumn(ND3.m94185h(C47326qC6.m17906c(BB5.m114259j(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), 0.0f, 1, null)), paddingValues), C43575jt0.m29791b(interfaceC32720Et0, 186630339, true, new C191781(this.$query, this.$viewModel, this.$focusRequester, this.$loading$delegate, this.$predictions$delegate, this.$attributionDrawable)), interfaceC32720Et0, 48, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}

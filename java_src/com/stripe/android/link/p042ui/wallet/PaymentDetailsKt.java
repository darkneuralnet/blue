package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.ErrorTextKt;
import com.stripe.android.link.p042ui.ErrorTextStyle;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u00020\b*\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0012\u001a\u00020\b*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0016\u001a\u00020\b*\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "paymentDetails", "", "enabled", "isSupported", "isSelected", "isUpdating", "Lkotlin/Function0;", "", "onClick", "onMenuButtonClick", "PaymentDetailsListItem", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "LZc5;", "PaymentDetails", "(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLEt0;I)V", "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;", "card", "CardInfo", "(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$Card;ZLEt0;I)V", "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "bankAccount", "BankAccountInfo", "(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;ZLEt0;I)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentDetails.kt\ncom/stripe/android/link/ui/wallet/PaymentDetailsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,251:1\n154#2:252\n154#2:286\n154#2:287\n154#2:386\n154#2:392\n154#2:398\n154#2:404\n154#2:437\n154#2:438\n154#2:449\n154#2:450\n75#3,6:253\n81#3:285\n75#3,6:321\n81#3:353\n85#3:397\n85#3:448\n75#4:259\n76#4,11:261\n75#4:294\n76#4,11:296\n75#4:327\n76#4,11:329\n75#4:359\n76#4,11:361\n89#4:390\n89#4:396\n89#4:402\n75#4:410\n76#4,11:412\n89#4:442\n89#4:447\n76#5:260\n76#5:295\n76#5:328\n76#5:360\n76#5:411\n460#6,13:272\n460#6,13:307\n460#6,13:340\n460#6,13:372\n473#6,3:387\n473#6,3:393\n473#6,3:399\n460#6,13:423\n473#6,3:439\n473#6,3:444\n74#7,6:288\n80#7:320\n84#7:403\n68#8,5:354\n73#8:385\n77#8:391\n68#8,5:405\n73#8:436\n77#8:443\n*S KotlinDebug\n*F\n+ 1 PaymentDetails.kt\ncom/stripe/android/link/ui/wallet/PaymentDetailsKt\n*L\n60#1:252\n67#1:286\n75#1:287\n95#1:386\n108#1:392\n117#1:398\n126#1:404\n130#1:437\n131#1:438\n149#1:449\n151#1:450\n57#1:253,6\n57#1:285\n78#1:321,6\n78#1:353\n78#1:397\n57#1:448\n57#1:259\n57#1:261,11\n73#1:294\n73#1:296,11\n78#1:327\n78#1:329,11\n85#1:359\n85#1:361,11\n85#1:390\n78#1:396\n73#1:402\n122#1:410\n122#1:412,11\n122#1:442\n57#1:447\n57#1:260\n73#1:295\n78#1:328\n85#1:360\n122#1:411\n57#1:272,13\n73#1:307,13\n78#1:340,13\n85#1:372,13\n85#1:387,3\n78#1:393,3\n73#1:399,3\n122#1:423,13\n122#1:439,3\n57#1:444,3\n73#1:288,6\n73#1:320\n73#1:403\n85#1:354,5\n85#1:385\n85#1:391\n122#1:405,5\n122#1:436\n122#1:443\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.PaymentDetailsKt */
/* loaded from: classes7.dex */
public final class PaymentDetailsKt {
    public static final void BankAccountInfo(InterfaceC37486Zc5 interfaceC37486Zc5, ConsumerPaymentDetails.BankAccount bankAccount, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(interfaceC37486Zc5, "<this>");
        Intrinsics.checkNotNullParameter(bankAccount, "bankAccount");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1607257160);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC37486Zc5)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(bankAccount)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89536o(z)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1607257160, i, -1, "com.stripe.android.link.ui.wallet.BankAccountInfo (PaymentDetails.kt:204)");
            }
            W94[] w94Arr = new W94[1];
            U94<Float> m75931a = C37220Xz0.m75931a();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            w94Arr[0] = m75931a.m81907c(Float.valueOf(f));
            C41806gu0.m37353a(w94Arr, C43575jt0.m29791b(mo89518u, -852381816, true, new PaymentDetailsKt$BankAccountInfo$1(interfaceC37486Zc5, bankAccount)), mo89518u, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentDetailsKt$BankAccountInfo$2(interfaceC37486Zc5, bankAccount, z, i));
        }
    }

    public static final void CardInfo(InterfaceC37486Zc5 interfaceC37486Zc5, ConsumerPaymentDetails.Card card, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(interfaceC37486Zc5, "<this>");
        Intrinsics.checkNotNullParameter(card, "card");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-977488806);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC37486Zc5)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(card)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89536o(z)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-977488806, i, -1, "com.stripe.android.link.ui.wallet.CardInfo (PaymentDetails.kt:170)");
            }
            W94[] w94Arr = new W94[1];
            U94<Float> m75931a = C37220Xz0.m75931a();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            w94Arr[0] = m75931a.m81907c(Float.valueOf(f));
            C41806gu0.m37353a(w94Arr, C43575jt0.m29791b(mo89518u, 646203290, true, new PaymentDetailsKt$CardInfo$1(interfaceC37486Zc5, card)), mo89518u, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentDetailsKt$CardInfo$2(interfaceC37486Zc5, card, z, i));
        }
    }

    public static final void PaymentDetails(InterfaceC37486Zc5 interfaceC37486Zc5, ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(interfaceC37486Zc5, "<this>");
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-779604120);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC37486Zc5)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(paymentDetails)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89536o(z)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-779604120, i2, -1, "com.stripe.android.link.ui.wallet.PaymentDetails (PaymentDetails.kt:155)");
            }
            if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
                mo89518u.mo89638F(440776828);
                CardInfo(interfaceC37486Zc5, (ConsumerPaymentDetails.Card) paymentDetails, z, mo89518u, (i2 & 896) | (i2 & 14) | (ConsumerPaymentDetails.Card.$stable << 3));
                mo89518u.mo89605Q();
            } else if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
                mo89518u.mo89638F(440776952);
                BankAccountInfo(interfaceC37486Zc5, (ConsumerPaymentDetails.BankAccount) paymentDetails, z, mo89518u, (i2 & 896) | (i2 & 14) | (ConsumerPaymentDetails.BankAccount.$stable << 3));
                mo89518u.mo89605Q();
            } else {
                mo89518u.mo89638F(440777046);
                mo89518u.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentDetailsKt$PaymentDetails$1(interfaceC37486Zc5, paymentDetails, z, i));
        }
    }

    public static final void PaymentDetailsListItem(ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, boolean z2, boolean z3, boolean z4, Function0<Unit> onClick, Function0<Unit> onMenuButtonClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2.C20912a c20912a;
        ConsumerPaymentDetails.Card card;
        int i3;
        int i4;
        InterfaceC41563gV2.C20912a c20912a2;
        InterfaceC32720Et0 interfaceC32720Et03;
        int i5;
        TM2 tm2;
        int i6;
        int i7;
        TM2 tm22;
        InterfaceC41563gV2.C20912a c20912a3;
        InterfaceC32720Et0 interfaceC32720Et04;
        int i8;
        InterfaceC32720Et0 interfaceC32720Et05;
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onMenuButtonClick, "onMenuButtonClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1820643685);
        if ((i & 14) == 0) {
            i2 = (mo89518u.mo89539n(paymentDetails) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo89518u.mo89536o(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= mo89518u.mo89536o(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= mo89518u.mo89536o(z3) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= mo89518u.mo89536o(z4) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= mo89518u.mo89539n(onClick) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= mo89518u.mo89539n(onMenuButtonClick) ? 1048576 : 524288;
        }
        int i9 = i2;
        if ((2995931 & i9) == 599186 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et05 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1820643685, i9, -1, "com.stripe.android.link.ui.wallet.PaymentDetailsListItem (PaymentDetails.kt:47)");
            }
            InterfaceC41563gV2.C20912a c20912a4 = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m70814e = C38131ak0.m70814e(BB5.m114261h(BB5.m114255n(c20912a4, 0.0f, 1, null), 0.0f, C43705k61.m29303g(56), 1, null), z && z2, null, null, onClick, 6, null);
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC4360K9.InterfaceC4363c m99138h = c4361a.m99138h();
            mo89518u.mo89638F(693286680);
            C25777lo c25777lo = C25777lo.f96729a;
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(c25777lo.m26803f(), m99138h, mo89518u, 48);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m70814e);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            C38066ad5 c38066ad5 = C38066ad5.f50835a;
            mo89518u.mo89638F(-234800129);
            float f = 20;
            InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a4, C43705k61.m29303g(f), 0.0f, C43705k61.m29303g(6), 0.0f, 10, null);
            C36405Um4 c36405Um4 = C36405Um4.f37975a;
            TM2 tm23 = TM2.f35372a;
            int i10 = TM2.f35373b;
            C36639Vm4.m79429a(z3, null, m94180m, false, null, c36405Um4.m80876a(ThemeKt.getLinkColors(tm23, mo89518u, i10).m116529getActionLabelLight0d7_KjU(), ThemeKt.getLinkColors(tm23, mo89518u, i10).m116535getDisabledText0d7_KjU(), 0L, mo89518u, C36405Um4.f37976b << 9, 4), mo89518u, ((i9 >> 9) & 14) | 432, 24);
            float f2 = 8;
            InterfaceC41563gV2 m72851b = InterfaceC37486Zc5.m72851b(c38066ad5, ND3.m94182k(c20912a4, 0.0f, C43705k61.m29303g(f2), 1, null), 1.0f, false, 2, null);
            mo89518u.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m72851b);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a2);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-1163856341);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            mo89518u.mo89638F(820733557);
            InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a4, 0.0f, 1, null);
            InterfaceC4360K9.InterfaceC4363c m99138h2 = c4361a.m99138h();
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(c25777lo.m26803f(), m99138h2, mo89518u, 48);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m114255n);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a3);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a3, m74813a2, c0757a.m113412d());
            C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
            C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
            C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            mo89518u.mo89638F(-1283196199);
            PaymentDetails(c38066ad5, paymentDetails, z2, mo89518u, (ConsumerPaymentDetails.PaymentDetails.$stable << 3) | 6 | ((i9 << 3) & 112) | (i9 & 896));
            mo89518u.mo89638F(-1772402485);
            if (paymentDetails.isDefault()) {
                InterfaceC41563gV2 m62125c = C13342bw.m62125c(c20912a4, tm23.m83731a(mo89518u, i10).m94898l(), ThemeKt.getLinkShapes(tm23, mo89518u, i10).getExtraSmall());
                InterfaceC4360K9 m99141e = c4361a.m99141e();
                mo89518u.mo89638F(733328855);
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, 6);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g014 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm24 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq64 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                Function0<InterfaceC32018Bt0> m113415a4 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a4 = C31723Am2.m115273a(m62125c);
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a4);
                } else {
                    mo89518u.mo89566e();
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a4 = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a4, m44729h, c0757a.m113412d());
                C38680bf6.m64191b(m64192a4, interfaceC41273g014, c0757a.m113414b());
                C38680bf6.m64191b(m64192a4, enumC47065pm24, c0757a.m113413c());
                C38680bf6.m64191b(m64192a4, interfaceC33869Jq64, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a4.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-2137368960);
                C40689f10 c40689f10 = C40689f10.f79291a;
                mo89518u.mo89638F(627771514);
                String m41310c = C40946fS5.m41310c(C18975R.string.wallet_default, mo89518u, 0);
                InterfaceC41563gV2 m94183j = ND3.m94183j(c20912a4, C43705k61.m29303g(4), C43705k61.m29303g(2));
                interfaceC32720Et02 = mo89518u;
                card = null;
                c20912a = c20912a4;
                i3 = -1323940314;
                C38909c26.m62000e(m41310c, m94183j, ThemeKt.getLinkColors(tm23, interfaceC32720Et02, i10).m116535getDisabledText0d7_KjU(), N26.m94414f(12), null, C33918Jw1.f18784c.m99541c(), null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et02, 199728, 0, 65488);
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89563f();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
            } else {
                interfaceC32720Et02 = mo89518u;
                c20912a = c20912a4;
                card = null;
                i3 = -1323940314;
            }
            interfaceC32720Et02.mo89605Q();
            ConsumerPaymentDetails.Card card2 = paymentDetails instanceof ConsumerPaymentDetails.Card ? (ConsumerPaymentDetails.Card) paymentDetails : card;
            boolean isExpired = card2 != null ? card2.isExpired() : false;
            interfaceC32720Et02.mo89638F(-108845086);
            if (isExpired && !z3) {
                DP1.m110533b(C46748pE3.m19793d(C18975R.C18976drawable.ic_link_error, interfaceC32720Et02, 0), null, BB5.m114246w(c20912a, C43705k61.m29303g(f)), ThemeKt.getLinkColors(tm23, interfaceC32720Et02, i10).m116537getErrorText0d7_KjU(), interfaceC32720Et02, 440, 0);
            }
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89638F(-1710630086);
            if (z2) {
                i4 = i10;
                c20912a2 = c20912a;
                interfaceC32720Et03 = interfaceC32720Et02;
                i5 = 12;
                tm2 = tm23;
                i6 = i3;
                i7 = 6;
            } else {
                i4 = i10;
                c20912a2 = c20912a;
                interfaceC32720Et03 = interfaceC32720Et02;
                i5 = 12;
                tm2 = tm23;
                i6 = i3;
                i7 = 6;
                ErrorTextKt.ErrorText(C40946fS5.m41310c(C18975R.string.wallet_unavailable, interfaceC32720Et02, 0), ND3.m94180m(c20912a, C43705k61.m29303g(f2), C43705k61.m29303g(f2), C43705k61.m29303g(f2), 0.0f, 8, null), ErrorTextStyle.Small.INSTANCE, interfaceC32720Et02, 432, 0);
            }
            interfaceC32720Et03.mo89605Q();
            interfaceC32720Et03.mo89605Q();
            interfaceC32720Et03.mo89605Q();
            interfaceC32720Et03.mo89605Q();
            interfaceC32720Et03.mo89563f();
            interfaceC32720Et03.mo89605Q();
            interfaceC32720Et03.mo89605Q();
            InterfaceC4360K9 m99141e2 = c4361a.m99141e();
            InterfaceC41563gV2 m94180m2 = ND3.m94180m(BB5.m114246w(c20912a2, ThemeKt.getMinimumTouchTargetSize()), 0.0f, 0.0f, C43705k61.m29303g(i5), 0.0f, 11, null);
            InterfaceC32720Et0 interfaceC32720Et06 = interfaceC32720Et03;
            interfaceC32720Et06.mo89638F(733328855);
            InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(m99141e2, false, interfaceC32720Et06, i7);
            interfaceC32720Et06.mo89638F(i6);
            InterfaceC41273g01 interfaceC41273g015 = (InterfaceC41273g01) interfaceC32720Et06.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm25 = (EnumC47065pm2) interfaceC32720Et06.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq65 = (InterfaceC33869Jq6) interfaceC32720Et06.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a5 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a5 = C31723Am2.m115273a(m94180m2);
            if (!(interfaceC32720Et06.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et06.mo89557h();
            if (interfaceC32720Et06.mo89521t()) {
                interfaceC32720Et06.mo89617M(m113415a5);
            } else {
                interfaceC32720Et06.mo89566e();
            }
            interfaceC32720Et06.mo89620L();
            InterfaceC32720Et0 m64192a5 = C38680bf6.m64192a(interfaceC32720Et06);
            C38680bf6.m64191b(m64192a5, m44729h2, c0757a.m113412d());
            C38680bf6.m64191b(m64192a5, interfaceC41273g015, c0757a.m113414b());
            C38680bf6.m64191b(m64192a5, enumC47065pm25, c0757a.m113413c());
            C38680bf6.m64191b(m64192a5, interfaceC33869Jq65, c0757a.m113410f());
            interfaceC32720Et06.mo89530q();
            m115273a5.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et06)), interfaceC32720Et06, 0);
            interfaceC32720Et06.mo89638F(2058660585);
            interfaceC32720Et06.mo89638F(-2137368960);
            C40689f10 c40689f102 = C40689f10.f79291a;
            interfaceC32720Et06.mo89638F(-675794427);
            if (z4) {
                interfaceC32720Et06.mo89638F(-108844188);
                tm22 = tm2;
                K74.m99208b(BB5.m114246w(c20912a2, C43705k61.m29303g(24)), 0L, C43705k61.m29303g(2), interfaceC32720Et06, 390, 2);
                interfaceC32720Et06.mo89605Q();
                c20912a3 = c20912a2;
                interfaceC32720Et04 = interfaceC32720Et06;
                i8 = 2;
            } else {
                tm22 = tm2;
                interfaceC32720Et06.mo89638F(-108844014);
                c20912a3 = c20912a2;
                interfaceC32720Et04 = interfaceC32720Et06;
                i8 = 2;
                C47438qP1.m17541a(onMenuButtonClick, null, z, null, ComposableSingletons$PaymentDetailsKt.INSTANCE.m116570getLambda1$link_release(), interfaceC32720Et06, ((i9 >> 18) & 14) | 24576 | ((i9 << 3) & 896), 10);
                interfaceC32720Et04.mo89605Q();
            }
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89563f();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89563f();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            C47523qY5 c47523qY5 = C47523qY5.f105393a;
            InterfaceC41563gV2 m94182k = ND3.m94182k(c20912a3, C43705k61.m29303g(20), 0.0f, i8, null);
            long m116534getComponentDivider0d7_KjU = ThemeKt.getLinkColors(tm22, interfaceC32720Et04, i4).m116534getComponentDivider0d7_KjU();
            interfaceC32720Et05 = interfaceC32720Et04;
            c47523qY5.m17461a(m94182k, C43705k61.m29303g(1), m116534getComponentDivider0d7_KjU, interfaceC32720Et05, (C47523qY5.f105397e << 9) | 54, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et05.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PaymentDetailsKt$PaymentDetailsListItem$2(paymentDetails, z, z2, z3, z4, onClick, onMenuButtonClick, i));
    }
}

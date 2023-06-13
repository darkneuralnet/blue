package com.stripe.android.paymentsheet.addresselement;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000\u001a2\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28432d2 = {"", LegacyRepairType.OTHER_KEY, "", "levenshtein", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "otherAddress", "editDistance", "LgV2;", "modifier", "Lkotlin/Function1;", "LPm0;", "", "Lkotlin/ExtensionFunctionType;", "content", "ScrollableColumn", "(LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressUtils.kt\ncom/stripe/android/paymentsheet/addresselement/AddressUtilsKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,72:1\n67#2,6:73\n73#2:105\n77#2:148\n75#3:79\n76#3,11:81\n75#3:112\n76#3,11:114\n89#3:142\n89#3:147\n76#4:80\n76#4:113\n460#5,13:92\n460#5,13:125\n473#5,3:139\n473#5,3:144\n74#6,6:106\n80#6:138\n84#6:143\n*S KotlinDebug\n*F\n+ 1 AddressUtils.kt\ncom/stripe/android/paymentsheet/addresselement/AddressUtilsKt\n*L\n63#1:73,6\n63#1:105\n63#1:148\n63#1:79\n63#1:81,11\n66#1:112\n66#1:114,11\n66#1:142\n63#1:147\n63#1:80\n66#1:113\n63#1:92,13\n66#1:125,13\n66#1:139,3\n63#1:144,3\n66#1:106,6\n66#1:138\n66#1:143\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressUtilsKt {
    public static final void ScrollableColumn(InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        int i5;
        InterfaceC41563gV2 interfaceC41563gV22;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(249772746);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            obj = interfaceC41563gV2;
        } else if ((i & 14) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = interfaceC41563gV2;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(content)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC41563gV22 = obj;
        } else {
            if (i6 != 0) {
                interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
            } else {
                interfaceC41563gV22 = obj;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(249772746, i3, -1, "com.stripe.android.paymentsheet.addresselement.ScrollableColumn (AddressUtils.kt:58)");
            }
            InterfaceC41563gV2 m80787d = C36433Up5.m80787d(InterfaceC41563gV2.f82354b0, C36433Up5.m80790a(0, mo89518u, 0, 1), false, null, false, 14, null);
            mo89518u.mo89638F(733328855);
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m80787d);
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
            C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-2137368960);
            C40689f10 c40689f10 = C40689f10.f79291a;
            mo89518u.mo89638F(1732561412);
            int i7 = (i3 & 14) | ((i3 << 6) & 7168);
            mo89518u.mo89638F(-483455358);
            C25777lo.InterfaceC25789l m26802g = C25777lo.f96729a.m26802g();
            InterfaceC4360K9.InterfaceC4362b m99136j = c4361a.m99136j();
            int i8 = i7 >> 3;
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26802g, m99136j, mo89518u, (i8 & 112) | (i8 & 14));
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(interfaceC41563gV22);
            int i9 = ((((i7 << 3) & 112) << 9) & 7168) | 6;
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
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i9 >> 3) & 112));
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-1163856341);
            if (((i9 >> 9) & 14 & 11) == 2 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
            } else {
                content.invoke(C35465Qm0.f30887a, mo89518u, Integer.valueOf(((i7 >> 6) & 112) | 6));
            }
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AddressUtilsKt$ScrollableColumn$2(interfaceC41563gV22, content, i, i2));
        }
    }

    public static final int editDistance(AddressDetails addressDetails, AddressDetails addressDetails2) {
        PaymentSheet.Address address;
        String state;
        Intrinsics.checkNotNullParameter(addressDetails, "<this>");
        if (addressDetails2 != null) {
            address = addressDetails2.getAddress();
        } else {
            address = null;
        }
        PaymentSheet.Address address2 = addressDetails.getAddress();
        String str = "";
        int levenshtein = 0 + levenshtein((address2 == null || (r0 = address2.getCity()) == null) ? "" : "", (address == null || (r2 = address.getCity()) == null) ? "" : "");
        PaymentSheet.Address address3 = addressDetails.getAddress();
        int levenshtein2 = levenshtein + levenshtein((address3 == null || (r0 = address3.getCountry()) == null) ? "" : "", (address == null || (r3 = address.getCountry()) == null) ? "" : "");
        PaymentSheet.Address address4 = addressDetails.getAddress();
        int levenshtein3 = levenshtein2 + levenshtein((address4 == null || (r0 = address4.getLine1()) == null) ? "" : "", (address == null || (r3 = address.getLine1()) == null) ? "" : "");
        PaymentSheet.Address address5 = addressDetails.getAddress();
        int levenshtein4 = levenshtein3 + levenshtein((address5 == null || (r0 = address5.getLine2()) == null) ? "" : "", (address == null || (r3 = address.getLine2()) == null) ? "" : "");
        PaymentSheet.Address address6 = addressDetails.getAddress();
        int levenshtein5 = levenshtein4 + levenshtein((address6 == null || (r0 = address6.getPostalCode()) == null) ? "" : "", (address == null || (r3 = address.getPostalCode()) == null) ? "" : "");
        PaymentSheet.Address address7 = addressDetails.getAddress();
        String str2 = (address7 == null || (str2 = address7.getState()) == null) ? "" : "";
        if (address != null && (state = address.getState()) != null) {
            str = state;
        }
        return levenshtein5 + levenshtein(str2, str);
    }

    public static final int levenshtein(CharSequence charSequence, CharSequence other) {
        boolean z;
        boolean z2;
        int i;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.areEqual(charSequence, other)) {
            return 0;
        }
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return other.length();
        }
        if (other.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return charSequence.length();
        }
        int length = charSequence.length() + 1;
        int length2 = other.length() + 1;
        Integer[] numArr = new Integer[length];
        for (int i2 = 0; i2 < length; i2++) {
            numArr[i2] = Integer.valueOf(i2);
        }
        Integer[] numArr2 = new Integer[length];
        for (int i3 = 0; i3 < length; i3++) {
            numArr2[i3] = 0;
        }
        int i4 = 1;
        while (i4 < length2) {
            numArr2[0] = Integer.valueOf(i4);
            for (int i5 = 1; i5 < length; i5++) {
                int i6 = i5 - 1;
                if (charSequence.charAt(i6) == other.charAt(i4 - 1)) {
                    i = 0;
                } else {
                    i = 1;
                }
                numArr2[i5] = Integer.valueOf(Math.min(Math.min(numArr[i5].intValue() + 1, numArr2[i6].intValue() + 1), numArr[i6].intValue() + i));
            }
            i4++;
            Integer[] numArr3 = numArr2;
            numArr2 = numArr;
            numArr = numArr3;
        }
        return numArr[length - 1].intValue();
    }
}

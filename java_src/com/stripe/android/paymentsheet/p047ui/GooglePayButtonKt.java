package com.stripe.android.paymentsheet.p047ui;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", TransferTable.COLUMN_STATE, "", "isEnabled", "Lkotlin/Function0;", "", "onPressed", "LgV2;", "modifier", "GooglePayButton", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGooglePayButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayButton.kt\ncom/stripe/android/paymentsheet/ui/GooglePayButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,106:1\n67#2,3:107\n66#2:110\n1057#3,6:111\n*S KotlinDebug\n*F\n+ 1 GooglePayButton.kt\ncom/stripe/android/paymentsheet/ui/GooglePayButtonKt\n*L\n24#1:107,3\n24#1:110\n24#1:111,6\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.GooglePayButtonKt */
/* loaded from: classes7.dex */
public final class GooglePayButtonKt {
    public static final void GooglePayButton(PrimaryButton.State state, boolean z, Function0<Unit> onPressed, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(onPressed, "onPressed");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1981905488);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(state)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onPressed)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i8 != 0) {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1981905488, i3, -1, "com.stripe.android.paymentsheet.ui.GooglePayButton (GooglePayButton.kt:15)");
            }
            InterfaceC41563gV2 m22000a = C46022o06.m22000a(interfaceC41563gV2, GooglePayButton.TEST_TAG);
            GooglePayButtonKt$GooglePayButton$1 googlePayButtonKt$GooglePayButton$1 = GooglePayButtonKt$GooglePayButton$1.INSTANCE;
            Boolean valueOf = Boolean.valueOf(z);
            mo89518u.mo89638F(1618982084);
            boolean mo89539n = mo89518u.mo89539n(valueOf) | mo89518u.mo89539n(state) | mo89518u.mo89539n(onPressed);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new GooglePayButtonKt$GooglePayButton$2$1(z, state, onPressed);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C24963je.m30175a(googlePayButtonKt$GooglePayButton$1, m22000a, (Function1) mo89635G, mo89518u, 6, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC41563gV2 interfaceC41563gV22 = interfaceC41563gV2;
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new GooglePayButtonKt$GooglePayButton$3(state, z, onPressed, interfaceC41563gV22, i, i2));
        }
    }
}

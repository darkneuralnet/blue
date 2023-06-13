package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.PaymentOptionUiKt;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.PaymentOptionsState;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001as\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0005\u0010\u0015\u001a\u001d\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u007f\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001a=\u0010%\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001aM\u0010(\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001aM\u0010*\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010'\u001aq\u0010/\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "viewModel", "LgV2;", "modifier", "", "PaymentOptions", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;II)V", "Lcom/stripe/android/paymentsheet/PaymentOptionsState;", TransferTable.COLUMN_STATE, "", "isEditing", "isProcessing", "Lkotlin/Function0;", "onAddCardPressed", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "onItemSelected", "Lcom/stripe/android/model/PaymentMethod;", "onItemRemoved", "LCo2;", "scrollState", "(Lcom/stripe/android/paymentsheet/PaymentOptionsState;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LCo2;LEt0;II)V", "Lk61;", "maxWidth", "rememberItemWidth-8Feqmps", "(FLEt0;I)F", "rememberItemWidth", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "item", "width", "isEnabled", "isSelected", "PaymentOption-iWtaglI", "(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V", "PaymentOption", "AddCard-AjpBEmI", "(FZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V", "AddCard", "GooglePay-PBTpf3Q", "(FZZLkotlin/jvm/functions/Function1;LgV2;LEt0;II)V", "GooglePay", "Link-PBTpf3Q", "Link", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;", "paymentMethod", "SavedPaymentMethod-Uww-Ezs", "(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V", "SavedPaymentMethod", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentOptionsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,269:1\n1057#2,3:270\n1060#2,3:282\n1057#2,6:286\n1057#2,6:293\n1057#2,6:300\n154#3:273\n154#3:276\n92#4:274\n58#4:275\n92#4:277\n51#4:278\n92#4:279\n81#4:280\n71#4:281\n36#5:285\n36#5:292\n36#5:299\n76#6:306\n76#7:307\n76#7:308\n76#7:309\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt\n*L\n93#1:270,3\n93#1:282,3\n197#1:286,6\n211#1:293,6\n228#1:300,6\n94#1:273\n95#1:276\n94#1:274\n94#1:275\n95#1:277\n95#1:278\n97#1:279\n97#1:280\n98#1:281\n197#1:285\n211#1:292\n228#1:299\n244#1:306\n38#1:307\n39#1:308\n40#1:309\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsUIKt */
/* loaded from: classes7.dex */
public final class PaymentOptionsUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: AddCard-AjpBEmI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116640AddCardAjpBEmI(float f, boolean z, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        int i8;
        InterfaceC41563gV2.C20912a c20912a;
        int i9;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1775784262);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89533p(f)) {
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
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (mo89518u.mo89539n(function0)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
            i7 = i2 & 8;
            if (i7 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                obj = interfaceC41563gV2;
                if (mo89518u.mo89539n(obj)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
                if ((i3 & 5851) != 1170 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                } else {
                    if (i7 != 0) {
                        c20912a = InterfaceC41563gV2.f82354b0;
                    } else {
                        c20912a = obj;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(1775784262, i3, -1, "com.stripe.android.paymentsheet.ui.AddCard (PaymentOptionsUI.kt:155)");
                    }
                    if (StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116695getComponent0d7_KjU())) {
                        i9 = C19159R.C19160drawable.stripe_ic_paymentsheet_add_dark;
                    } else {
                        i9 = C19159R.C19160drawable.stripe_ic_paymentsheet_add_light;
                    }
                    int i10 = i3 << 6;
                    PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(f, false, false, z, i9, c20912a, null, null, C40946fS5.m41310c(C19159R.string.stripe_paymentsheet_add_payment_method_button_label, mo89518u, 0), null, C40946fS5.m41310c(C19159R.string.add_new_payment_method, mo89518u, 0), null, null, function0, mo89518u, (i3 & 14) | 432 | (i10 & 7168) | (i10 & ImageMetadata.JPEG_GPS_COORDINATES), (i3 << 3) & 7168, 6848);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    obj = c20912a;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new PaymentOptionsUIKt$AddCard$1(f, z, function0, obj, i, i2));
                    return;
                }
                return;
            }
            obj = interfaceC41563gV2;
            if ((i3 & 5851) != 1170) {
            }
            if (i7 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            if (StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116695getComponent0d7_KjU())) {
            }
            int i102 = i3 << 6;
            PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(f, false, false, z, i9, c20912a, null, null, C40946fS5.m41310c(C19159R.string.stripe_paymentsheet_add_payment_method_button_label, mo89518u, 0), null, C40946fS5.m41310c(C19159R.string.add_new_payment_method, mo89518u, 0), null, null, function0, mo89518u, (i3 & 14) | 432 | (i102 & 7168) | (i102 & ImageMetadata.JPEG_GPS_COORDINATES), (i3 << 3) & 7168, 6848);
            if (C35528Qt0.m87827O()) {
            }
            obj = c20912a;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i7 = i2 & 8;
        if (i7 == 0) {
        }
        obj = interfaceC41563gV2;
        if ((i3 & 5851) != 1170) {
        }
        if (i7 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        if (StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116695getComponent0d7_KjU())) {
        }
        int i1022 = i3 << 6;
        PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(f, false, false, z, i9, c20912a, null, null, C40946fS5.m41310c(C19159R.string.stripe_paymentsheet_add_payment_method_button_label, mo89518u, 0), null, C40946fS5.m41310c(C19159R.string.add_new_payment_method, mo89518u, 0), null, null, function0, mo89518u, (i3 & 14) | 432 | (i1022 & 7168) | (i1022 & ImageMetadata.JPEG_GPS_COORDINATES), (i3 << 3) & 7168, 6848);
        if (C35528Qt0.m87827O()) {
        }
        obj = c20912a;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: GooglePay-PBTpf3Q  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116641GooglePayPBTpf3Q(float f, boolean z, boolean z2, Function1<? super PaymentSelection, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj;
        int i9;
        InterfaceC41563gV2.C20912a c20912a;
        boolean mo89539n;
        Object mo89635G;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1641925051);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89533p(f)) {
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
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (mo89518u.mo89536o(z2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (mo89518u.mo89539n(function1)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj = interfaceC41563gV2;
                if (mo89518u.mo89539n(obj)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
                if ((46811 & i3) != 9362 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                } else {
                    if (i8 != 0) {
                        c20912a = InterfaceC41563gV2.f82354b0;
                    } else {
                        c20912a = obj;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-1641925051, i3, -1, "com.stripe.android.paymentsheet.ui.GooglePay (PaymentOptionsUI.kt:181)");
                    }
                    int i10 = C19159R.C19160drawable.stripe_google_pay_mark;
                    int i11 = C19159R.string.google_pay;
                    String m41310c = C40946fS5.m41310c(i11, mo89518u, 0);
                    String m41310c2 = C40946fS5.m41310c(i11, mo89518u, 0);
                    mo89518u.mo89638F(1157296644);
                    mo89539n = mo89518u.mo89539n(function1);
                    mo89635G = mo89518u.mo89635G();
                    if (!mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G = new PaymentOptionsUIKt$GooglePay$1$1(function1);
                        mo89518u.mo89503z(mo89635G);
                    }
                    mo89518u.mo89605Q();
                    PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(f, z2, false, z, i10, c20912a, null, null, m41310c, null, m41310c2, null, null, (Function0) mo89635G, mo89518u, (i3 & 14) | 384 | ((i3 >> 3) & 112) | ((i3 << 6) & 7168) | ((i3 << 3) & ImageMetadata.JPEG_GPS_COORDINATES), 0, 6848);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    obj = c20912a;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new PaymentOptionsUIKt$GooglePay$2(f, z, z2, function1, obj, i, i2));
                    return;
                }
                return;
            }
            obj = interfaceC41563gV2;
            if ((46811 & i3) != 9362) {
            }
            if (i8 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            int i102 = C19159R.C19160drawable.stripe_google_pay_mark;
            int i112 = C19159R.string.google_pay;
            String m41310c3 = C40946fS5.m41310c(i112, mo89518u, 0);
            String m41310c22 = C40946fS5.m41310c(i112, mo89518u, 0);
            mo89518u.mo89638F(1157296644);
            mo89539n = mo89518u.mo89539n(function1);
            mo89635G = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G = new PaymentOptionsUIKt$GooglePay$1$1(function1);
            mo89518u.mo89503z(mo89635G);
            mo89518u.mo89605Q();
            PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(f, z2, false, z, i102, c20912a, null, null, m41310c3, null, m41310c22, null, null, (Function0) mo89635G, mo89518u, (i3 & 14) | 384 | ((i3 >> 3) & 112) | ((i3 << 6) & 7168) | ((i3 << 3) & ImageMetadata.JPEG_GPS_COORDINATES), 0, 6848);
            if (C35528Qt0.m87827O()) {
            }
            obj = c20912a;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i8 = i2 & 16;
        if (i8 == 0) {
        }
        obj = interfaceC41563gV2;
        if ((46811 & i3) != 9362) {
        }
        if (i8 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        int i1022 = C19159R.C19160drawable.stripe_google_pay_mark;
        int i1122 = C19159R.string.google_pay;
        String m41310c32 = C40946fS5.m41310c(i1122, mo89518u, 0);
        String m41310c222 = C40946fS5.m41310c(i1122, mo89518u, 0);
        mo89518u.mo89638F(1157296644);
        mo89539n = mo89518u.mo89539n(function1);
        mo89635G = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G = new PaymentOptionsUIKt$GooglePay$1$1(function1);
        mo89518u.mo89503z(mo89635G);
        mo89518u.mo89605Q();
        PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(f, z2, false, z, i1022, c20912a, null, null, m41310c32, null, m41310c222, null, null, (Function0) mo89635G, mo89518u, (i3 & 14) | 384 | ((i3 >> 3) & 112) | ((i3 << 6) & 7168) | ((i3 << 3) & ImageMetadata.JPEG_GPS_COORDINATES), 0, 6848);
        if (C35528Qt0.m87827O()) {
        }
        obj = c20912a;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: Link-PBTpf3Q  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116642LinkPBTpf3Q(float f, boolean z, boolean z2, Function1<? super PaymentSelection, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj;
        int i9;
        InterfaceC41563gV2.C20912a c20912a;
        long m116695getComponent0d7_KjU;
        boolean mo89539n;
        Object mo89635G;
        long m18725h;
        boolean mo89539n2;
        Object mo89635G2;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2078405886);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89533p(f)) {
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
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (mo89518u.mo89536o(z2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (mo89518u.mo89539n(function1)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj = interfaceC41563gV2;
                if (mo89518u.mo89539n(obj)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
                if ((46811 & i3) != 9362 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                } else {
                    if (i8 != 0) {
                        c20912a = InterfaceC41563gV2.f82354b0;
                    } else {
                        c20912a = obj;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(2078405886, i3, -1, "com.stripe.android.paymentsheet.ui.Link (PaymentOptionsUI.kt:202)");
                    }
                    m116695getComponent0d7_KjU = StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116695getComponent0d7_KjU();
                    C47063pm0 m18747i = C47063pm0.m18747i(m116695getComponent0d7_KjU);
                    mo89518u.mo89638F(1157296644);
                    mo89539n = mo89518u.mo89539n(m18747i);
                    mo89635G = mo89518u.mo89635G();
                    if (!mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                        if (StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(m116695getComponent0d7_KjU)) {
                            m18725h = C47063pm0.f104050b.m18732a();
                        } else {
                            m18725h = C47063pm0.f104050b.m18725h();
                        }
                        mo89635G = C47063pm0.m18747i(m18725h);
                        mo89518u.mo89503z(mo89635G);
                    }
                    mo89518u.mo89605Q();
                    long m18733w = ((C47063pm0) mo89635G).m18733w();
                    int i10 = C19159R.C19160drawable.stripe_link_mark;
                    int i11 = C19159R.string.link;
                    String m41310c = C40946fS5.m41310c(i11, mo89518u, 0);
                    String m41310c2 = C40946fS5.m41310c(i11, mo89518u, 0);
                    C47063pm0 m18747i2 = C47063pm0.m18747i(m18733w);
                    mo89518u.mo89638F(1157296644);
                    mo89539n2 = mo89518u.mo89539n(function1);
                    mo89635G2 = mo89518u.mo89635G();
                    if (!mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G2 = new PaymentOptionsUIKt$Link$1$1(function1);
                        mo89518u.mo89503z(mo89635G2);
                    }
                    mo89518u.mo89605Q();
                    PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(f, z2, false, z, i10, c20912a, m18747i2, null, m41310c, null, m41310c2, null, null, (Function0) mo89635G2, mo89518u, (i3 & 14) | 384 | ((i3 >> 3) & 112) | ((i3 << 6) & 7168) | ((i3 << 3) & ImageMetadata.JPEG_GPS_COORDINATES), 0, 6784);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    obj = c20912a;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new PaymentOptionsUIKt$Link$2(f, z, z2, function1, obj, i, i2));
                    return;
                }
                return;
            }
            obj = interfaceC41563gV2;
            if ((46811 & i3) != 9362) {
            }
            if (i8 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            m116695getComponent0d7_KjU = StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116695getComponent0d7_KjU();
            C47063pm0 m18747i3 = C47063pm0.m18747i(m116695getComponent0d7_KjU);
            mo89518u.mo89638F(1157296644);
            mo89539n = mo89518u.mo89539n(m18747i3);
            mo89635G = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            if (StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(m116695getComponent0d7_KjU)) {
            }
            mo89635G = C47063pm0.m18747i(m18725h);
            mo89518u.mo89503z(mo89635G);
            mo89518u.mo89605Q();
            long m18733w2 = ((C47063pm0) mo89635G).m18733w();
            int i102 = C19159R.C19160drawable.stripe_link_mark;
            int i112 = C19159R.string.link;
            String m41310c3 = C40946fS5.m41310c(i112, mo89518u, 0);
            String m41310c22 = C40946fS5.m41310c(i112, mo89518u, 0);
            C47063pm0 m18747i22 = C47063pm0.m18747i(m18733w2);
            mo89518u.mo89638F(1157296644);
            mo89539n2 = mo89518u.mo89539n(function1);
            mo89635G2 = mo89518u.mo89635G();
            if (!mo89539n2) {
            }
            mo89635G2 = new PaymentOptionsUIKt$Link$1$1(function1);
            mo89518u.mo89503z(mo89635G2);
            mo89518u.mo89605Q();
            PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(f, z2, false, z, i102, c20912a, m18747i22, null, m41310c3, null, m41310c22, null, null, (Function0) mo89635G2, mo89518u, (i3 & 14) | 384 | ((i3 >> 3) & 112) | ((i3 << 6) & 7168) | ((i3 << 3) & ImageMetadata.JPEG_GPS_COORDINATES), 0, 6784);
            if (C35528Qt0.m87827O()) {
            }
            obj = c20912a;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i8 = i2 & 16;
        if (i8 == 0) {
        }
        obj = interfaceC41563gV2;
        if ((46811 & i3) != 9362) {
        }
        if (i8 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        m116695getComponent0d7_KjU = StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116695getComponent0d7_KjU();
        C47063pm0 m18747i32 = C47063pm0.m18747i(m116695getComponent0d7_KjU);
        mo89518u.mo89638F(1157296644);
        mo89539n = mo89518u.mo89539n(m18747i32);
        mo89635G = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        if (StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(m116695getComponent0d7_KjU)) {
        }
        mo89635G = C47063pm0.m18747i(m18725h);
        mo89518u.mo89503z(mo89635G);
        mo89518u.mo89605Q();
        long m18733w22 = ((C47063pm0) mo89635G).m18733w();
        int i1022 = C19159R.C19160drawable.stripe_link_mark;
        int i1122 = C19159R.string.link;
        String m41310c32 = C40946fS5.m41310c(i1122, mo89518u, 0);
        String m41310c222 = C40946fS5.m41310c(i1122, mo89518u, 0);
        C47063pm0 m18747i222 = C47063pm0.m18747i(m18733w22);
        mo89518u.mo89638F(1157296644);
        mo89539n2 = mo89518u.mo89539n(function1);
        mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n2) {
        }
        mo89635G2 = new PaymentOptionsUIKt$Link$1$1(function1);
        mo89518u.mo89503z(mo89635G2);
        mo89518u.mo89605Q();
        PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(f, z2, false, z, i1022, c20912a, m18747i222, null, m41310c32, null, m41310c222, null, null, (Function0) mo89635G2, mo89518u, (i3 & 14) | 384 | ((i3 >> 3) & 112) | ((i3 << 6) & 7168) | ((i3 << 3) & ImageMetadata.JPEG_GPS_COORDINATES), 0, 6784);
        if (C35528Qt0.m87827O()) {
        }
        obj = c20912a;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* renamed from: PaymentOption-iWtaglI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116643PaymentOptioniWtaglI(PaymentOptionsItem paymentOptionsItem, float f, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function1<? super PaymentSelection, Unit> function1, Function1<? super PaymentMethod, Unit> function12, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1790389895);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89539n(paymentOptionsItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= mo89518u.mo89533p(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= mo89518u.mo89536o(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= mo89518u.mo89536o(z2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            i3 |= mo89518u.mo89536o(z3) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ImageMetadata.EDGE_MODE;
        } else if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            i3 |= mo89518u.mo89539n(function0) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i3 |= mo89518u.mo89539n(function1) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i3 |= mo89518u.mo89539n(function12) ? 8388608 : 4194304;
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 100663296;
                obj = interfaceC41563gV2;
            } else {
                obj = interfaceC41563gV2;
                if ((i & 234881024) == 0) {
                    i3 |= mo89518u.mo89539n(obj) ? 67108864 : 33554432;
                }
            }
            if ((i3 & 191739611) != 38347922 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC41563gV22 = obj;
                interfaceC32720Et02 = mo89518u;
            } else {
                Object obj2 = i4 == 0 ? InterfaceC41563gV2.f82354b0 : obj;
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1790389895, i3, -1, "com.stripe.android.paymentsheet.ui.PaymentOption (PaymentOptionsUI.kt:101)");
                }
                if (!(paymentOptionsItem instanceof PaymentOptionsItem.AddCard)) {
                    mo89518u.mo89638F(1158923097);
                    int i5 = i3 >> 3;
                    m116640AddCardAjpBEmI(f, z, function0, obj2, mo89518u, (i5 & 112) | (i5 & 14) | ((i3 >> 9) & 896) | ((i3 >> 15) & 7168), 0);
                    mo89518u.mo89605Q();
                } else if (paymentOptionsItem instanceof PaymentOptionsItem.GooglePay) {
                    mo89518u.mo89638F(1158923347);
                    int i6 = i3 >> 3;
                    m116641GooglePayPBTpf3Q(f, z, z3, function1, obj2, mo89518u, (i6 & 112) | (i6 & 14) | ((i3 >> 6) & 896) | ((i3 >> 9) & 7168) | ((i3 >> 12) & 57344), 0);
                    mo89518u.mo89605Q();
                } else if (paymentOptionsItem instanceof PaymentOptionsItem.Link) {
                    mo89518u.mo89638F(1158923631);
                    int i7 = i3 >> 3;
                    m116642LinkPBTpf3Q(f, z, z3, function1, obj2, mo89518u, (i7 & 112) | (i7 & 14) | ((i3 >> 6) & 896) | ((i3 >> 9) & 7168) | ((i3 >> 12) & 57344), 0);
                    mo89518u.mo89605Q();
                } else {
                    if (paymentOptionsItem instanceof PaymentOptionsItem.SavedPaymentMethod) {
                        mo89518u.mo89638F(1158923924);
                        int i8 = i3 >> 3;
                        int i9 = PaymentMethod.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i8) | (3670016 & i8) | (i8 & 29360128);
                        interfaceC32720Et02 = mo89518u;
                        m116644SavedPaymentMethodUwwEzs((PaymentOptionsItem.SavedPaymentMethod) paymentOptionsItem, f, z, z2, z3, function1, function12, obj2, interfaceC32720Et02, i9, 0);
                        interfaceC32720Et02.mo89605Q();
                    } else {
                        interfaceC32720Et02 = mo89518u;
                        interfaceC32720Et02.mo89638F(1158924308);
                        interfaceC32720Et02.mo89605Q();
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    interfaceC41563gV22 = obj2;
                }
                interfaceC32720Et02 = mo89518u;
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV22 = obj2;
            }
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w != null) {
                return;
            }
            mo89512w.mo20405a(new PaymentOptionsUIKt$PaymentOption$1(paymentOptionsItem, f, z, z2, z3, function0, function1, function12, interfaceC41563gV22, i, i2));
            return;
        }
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        if ((i3 & 191739611) != 38347922) {
        }
        if (i4 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        if (!(paymentOptionsItem instanceof PaymentOptionsItem.AddCard)) {
        }
        interfaceC32720Et02 = mo89518u;
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = obj2;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
        }
    }

    public static final void PaymentOptions(BaseSheetViewModel viewModel, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-912990971);
        InterfaceC41563gV2.C20912a c20912a = (i2 & 2) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-912990971, i, -1, "com.stripe.android.paymentsheet.ui.PaymentOptions (PaymentOptionsUI.kt:33)");
        }
        InterfaceC41563gV2 interfaceC41563gV22 = c20912a;
        PaymentOptions(PaymentOptions$lambda$0(GM5.m105205b(viewModel.getPaymentOptionsState(), null, mo89518u, 8, 1)), PaymentOptions$lambda$1(GM5.m105205b(viewModel.getEditing$paymentsheet_release(), null, mo89518u, 8, 1)), PaymentOptions$lambda$2(GM5.m105205b(viewModel.getProcessing(), null, mo89518u, 8, 1)), new PaymentOptionsUIKt$PaymentOptions$1(viewModel), new PaymentOptionsUIKt$PaymentOptions$2(viewModel), new PaymentOptionsUIKt$PaymentOptions$3(viewModel), c20912a, null, mo89518u, ((i << 15) & 3670016) | 8, 128);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PaymentOptionsUIKt$PaymentOptions$4(viewModel, interfaceC41563gV22, i, i2));
    }

    private static final PaymentOptionsState PaymentOptions$lambda$0(InterfaceC48627sP5<PaymentOptionsState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final boolean PaymentOptions$lambda$1(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    private static final boolean PaymentOptions$lambda$2(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /* renamed from: SavedPaymentMethod-Uww-Ezs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116644SavedPaymentMethodUwwEzs(PaymentOptionsItem.SavedPaymentMethod savedPaymentMethod, float f, boolean z, boolean z2, boolean z3, Function1<? super PaymentSelection, Unit> function1, Function1<? super PaymentMethod, Unit> function12, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj;
        int i12;
        InterfaceC41563gV2.C20912a c20912a;
        String label;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1934423929);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(savedPaymentMethod)) {
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
            if (mo89518u.mo89533p(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (mo89518u.mo89536o(z)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (mo89518u.mo89536o(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        if (mo89518u.mo89536o(z3)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 32) == 0) {
                        i9 = ImageMetadata.EDGE_MODE;
                    } else {
                        if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                            if (mo89518u.mo89539n(function1)) {
                                i9 = DateUtils.FORMAT_NUMERIC_DATE;
                            } else {
                                i9 = 65536;
                            }
                        }
                        if ((i2 & 64) != 0) {
                            i10 = 1572864;
                        } else {
                            if ((3670016 & i) == 0) {
                                if (mo89518u.mo89539n(function12)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                            }
                            i11 = i2 & 128;
                            if (i11 == 0) {
                                i3 |= 12582912;
                            } else if ((29360128 & i) == 0) {
                                obj = interfaceC41563gV2;
                                if (mo89518u.mo89539n(obj)) {
                                    i12 = 8388608;
                                } else {
                                    i12 = 4194304;
                                }
                                i3 |= i12;
                                if ((23967451 & i3) != 4793490 && mo89518u.mo89575b()) {
                                    mo89518u.mo89548k();
                                } else {
                                    if (i11 != 0) {
                                        c20912a = InterfaceC41563gV2.f82354b0;
                                    } else {
                                        c20912a = obj;
                                    }
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87816Z(1934423929, i3, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethod (PaymentOptionsUI.kt:233)");
                                    }
                                    Context context = (Context) mo89518u.mo89572c(C11411h.m68324g());
                                    Integer labelIcon = PaymentMethodsUiExtensionKt.getLabelIcon(savedPaymentMethod.getPaymentMethod());
                                    PaymentMethod paymentMethod = savedPaymentMethod.getPaymentMethod();
                                    Resources resources = context.getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                                    label = PaymentMethodsUiExtensionKt.getLabel(paymentMethod, resources);
                                    if (label == null) {
                                        if (C35528Qt0.m87827O()) {
                                            C35528Qt0.m87817Y();
                                        }
                                        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
                                        if (mo89512w != null) {
                                            mo89512w.mo20405a(new PaymentOptionsUIKt$SavedPaymentMethod$labelText$1(savedPaymentMethod, f, z, z2, z3, function1, function12, c20912a, i, i2));
                                            return;
                                        }
                                        return;
                                    }
                                    int i13 = 0;
                                    String m41309d = C40946fS5.m41309d(C19159R.string.stripe_paymentsheet_remove_pm, new Object[]{savedPaymentMethod.getDisplayName()}, mo89518u, 64);
                                    Integer savedPaymentMethodIcon = PaymentMethodsUiExtensionKt.getSavedPaymentMethodIcon(savedPaymentMethod.getPaymentMethod());
                                    if (savedPaymentMethodIcon != null) {
                                        i13 = savedPaymentMethodIcon.intValue();
                                    }
                                    Resources resources2 = context.getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
                                    String description = savedPaymentMethod.getDescription(resources2);
                                    Resources resources3 = context.getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources3, "context.resources");
                                    String removeDescription = savedPaymentMethod.getRemoveDescription(resources3);
                                    int i14 = i3 >> 3;
                                    PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(f, z3, z2, z, i13, c20912a, null, labelIcon, label, m41309d, description, new PaymentOptionsUIKt$SavedPaymentMethod$1(function12, savedPaymentMethod), removeDescription, new PaymentOptionsUIKt$SavedPaymentMethod$2(function1, savedPaymentMethod), mo89518u, (i14 & 896) | (i14 & 14) | ((i3 >> 9) & 112) | ((i3 << 3) & 7168) | ((i3 >> 6) & ImageMetadata.JPEG_GPS_COORDINATES), 0, 64);
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87817Y();
                                    }
                                    obj = c20912a;
                                }
                                InterfaceC36874Wm5 mo89512w2 = mo89518u.mo89512w();
                                if (mo89512w2 != null) {
                                    mo89512w2.mo20405a(new PaymentOptionsUIKt$SavedPaymentMethod$3(savedPaymentMethod, f, z, z2, z3, function1, function12, obj, i, i2));
                                    return;
                                }
                                return;
                            }
                            obj = interfaceC41563gV2;
                            if ((23967451 & i3) != 4793490) {
                            }
                            if (i11 != 0) {
                            }
                            if (C35528Qt0.m87827O()) {
                            }
                            Context context2 = (Context) mo89518u.mo89572c(C11411h.m68324g());
                            Integer labelIcon2 = PaymentMethodsUiExtensionKt.getLabelIcon(savedPaymentMethod.getPaymentMethod());
                            PaymentMethod paymentMethod2 = savedPaymentMethod.getPaymentMethod();
                            Resources resources4 = context2.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources4, "context.resources");
                            label = PaymentMethodsUiExtensionKt.getLabel(paymentMethod2, resources4);
                            if (label == null) {
                            }
                        }
                        i3 |= i10;
                        i11 = i2 & 128;
                        if (i11 == 0) {
                        }
                        obj = interfaceC41563gV2;
                        if ((23967451 & i3) != 4793490) {
                        }
                        if (i11 != 0) {
                        }
                        if (C35528Qt0.m87827O()) {
                        }
                        Context context22 = (Context) mo89518u.mo89572c(C11411h.m68324g());
                        Integer labelIcon22 = PaymentMethodsUiExtensionKt.getLabelIcon(savedPaymentMethod.getPaymentMethod());
                        PaymentMethod paymentMethod22 = savedPaymentMethod.getPaymentMethod();
                        Resources resources42 = context22.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources42, "context.resources");
                        label = PaymentMethodsUiExtensionKt.getLabel(paymentMethod22, resources42);
                        if (label == null) {
                        }
                    }
                    i3 |= i9;
                    if ((i2 & 64) != 0) {
                    }
                    i3 |= i10;
                    i11 = i2 & 128;
                    if (i11 == 0) {
                    }
                    obj = interfaceC41563gV2;
                    if ((23967451 & i3) != 4793490) {
                    }
                    if (i11 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    Context context222 = (Context) mo89518u.mo89572c(C11411h.m68324g());
                    Integer labelIcon222 = PaymentMethodsUiExtensionKt.getLabelIcon(savedPaymentMethod.getPaymentMethod());
                    PaymentMethod paymentMethod222 = savedPaymentMethod.getPaymentMethod();
                    Resources resources422 = context222.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources422, "context.resources");
                    label = PaymentMethodsUiExtensionKt.getLabel(paymentMethod222, resources422);
                    if (label == null) {
                    }
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                i3 |= i9;
                if ((i2 & 64) != 0) {
                }
                i3 |= i10;
                i11 = i2 & 128;
                if (i11 == 0) {
                }
                obj = interfaceC41563gV2;
                if ((23967451 & i3) != 4793490) {
                }
                if (i11 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                Context context2222 = (Context) mo89518u.mo89572c(C11411h.m68324g());
                Integer labelIcon2222 = PaymentMethodsUiExtensionKt.getLabelIcon(savedPaymentMethod.getPaymentMethod());
                PaymentMethod paymentMethod2222 = savedPaymentMethod.getPaymentMethod();
                Resources resources4222 = context2222.getResources();
                Intrinsics.checkNotNullExpressionValue(resources4222, "context.resources");
                label = PaymentMethodsUiExtensionKt.getLabel(paymentMethod2222, resources4222);
                if (label == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i3 |= i9;
            if ((i2 & 64) != 0) {
            }
            i3 |= i10;
            i11 = i2 & 128;
            if (i11 == 0) {
            }
            obj = interfaceC41563gV2;
            if ((23967451 & i3) != 4793490) {
            }
            if (i11 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            Context context22222 = (Context) mo89518u.mo89572c(C11411h.m68324g());
            Integer labelIcon22222 = PaymentMethodsUiExtensionKt.getLabelIcon(savedPaymentMethod.getPaymentMethod());
            PaymentMethod paymentMethod22222 = savedPaymentMethod.getPaymentMethod();
            Resources resources42222 = context22222.getResources();
            Intrinsics.checkNotNullExpressionValue(resources42222, "context.resources");
            label = PaymentMethodsUiExtensionKt.getLabel(paymentMethod22222, resources42222);
            if (label == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i9;
        if ((i2 & 64) != 0) {
        }
        i3 |= i10;
        i11 = i2 & 128;
        if (i11 == 0) {
        }
        obj = interfaceC41563gV2;
        if ((23967451 & i3) != 4793490) {
        }
        if (i11 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        Context context222222 = (Context) mo89518u.mo89572c(C11411h.m68324g());
        Integer labelIcon222222 = PaymentMethodsUiExtensionKt.getLabelIcon(savedPaymentMethod.getPaymentMethod());
        PaymentMethod paymentMethod222222 = savedPaymentMethod.getPaymentMethod();
        Resources resources422222 = context222222.getResources();
        Intrinsics.checkNotNullExpressionValue(resources422222, "context.resources");
        label = PaymentMethodsUiExtensionKt.getLabel(paymentMethod222222, resources422222);
        if (label == null) {
        }
    }

    /* renamed from: rememberItemWidth-8Feqmps  reason: not valid java name */
    public static final float m116650rememberItemWidth8Feqmps(float f, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        float f2;
        float m29303g;
        interfaceC32720Et0.mo89638F(1318783772);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1318783772, i, -1, "com.stripe.android.paymentsheet.ui.rememberItemWidth (PaymentOptionsUI.kt:92)");
        }
        boolean mo89533p = interfaceC32720Et0.mo89533p(f);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89533p || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = C43705k61.m29306d(C43705k61.m29303g(C43705k61.m29303g(f - C43705k61.m29303g(C43705k61.m29303g(17) * 2)) / (((int) (C43705k61.m29303g(f2 * m29303g) / C43705k61.m29303g(C43705k61.m29303g(100) + C43705k61.m29303g(C43705k61.m29303g(6) * f2)))) / 2.0f)));
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        float m29298l = ((C43705k61) mo89635G).m29298l();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m29298l;
    }

    public static final void PaymentOptions(PaymentOptionsState state, boolean z, boolean z2, Function0<Unit> onAddCardPressed, Function1<? super PaymentSelection, Unit> onItemSelected, Function1<? super PaymentMethod, Unit> onItemRemoved, InterfaceC41563gV2 interfaceC41563gV2, C32209Co2 c32209Co2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        C32209Co2 c32209Co22;
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAddCardPressed, "onAddCardPressed");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        Intrinsics.checkNotNullParameter(onItemRemoved, "onItemRemoved");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-28759441);
        InterfaceC41563gV2.C20912a c20912a = (i2 & 64) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        if ((i2 & 128) != 0) {
            c32209Co22 = C32443Do2.m109920a(0, 0, mo89518u, 0, 3);
            i3 = i & (-29360129);
        } else {
            c32209Co22 = c32209Co2;
            i3 = i;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-28759441, i3, -1, "com.stripe.android.paymentsheet.ui.PaymentOptions (PaymentOptionsUI.kt:53)");
        }
        InterfaceC41563gV2 interfaceC41563gV22 = c20912a;
        C41282g10.m40327a(BB5.m114255n(c20912a, 0.0f, 1, null), null, false, C43575jt0.m29791b(mo89518u, 576170585, true, new PaymentOptionsUIKt$PaymentOptions$5(z2, c32209Co22, i3, state, z, onAddCardPressed, onItemSelected, onItemRemoved)), mo89518u, 3072, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PaymentOptionsUIKt$PaymentOptions$6(state, z, z2, onAddCardPressed, onItemSelected, onItemRemoved, interfaceC41563gV22, c32209Co22, i, i2));
    }
}

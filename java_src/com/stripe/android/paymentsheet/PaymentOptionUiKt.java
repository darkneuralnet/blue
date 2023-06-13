package com.stripe.android.paymentsheet;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.p049ui.core.elements.SimpleDialogElementUIKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.SectionUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C48841sm0;
import p000.EP1;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\u001a¥\u0001\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aW\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\t\u001a\u00020\bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\u0012H\u0003¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0012H\u0003¢\u0006\u0004\b#\u0010\"\"\u001a\u0010$\u001a\u00020\r8\u0006X\u0087T¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, m28432d2 = {"Lk61;", "viewWidth", "", "isSelected", "isEditing", "isEnabled", "", "iconRes", "LgV2;", "modifier", "Lpm0;", "iconTint", "labelIcon", "", "labelText", "removePmDialogTitle", "description", "Lkotlin/Function0;", "", "onRemoveListener", "onRemoveAccessibilityDescription", "onItemSelectedListener", "PaymentOptionUi-VPtddqc", "(FZZZILgV2;Lpm0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;III)V", "PaymentOptionUi", "PaymentOptionCard-flo8M7A", "(ZZILpm0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V", "PaymentOptionCard", "onPressed", "RemoveBadge", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V", "SelectedBadge", "(LgV2;LEt0;II)V", "PaymentOptionUi_Selected", "(LEt0;I)V", "PaymentOptionUi_Editing", PaymentOptionUiKt.PAYMENT_OPTION_CARD_TEST_TAG, "Ljava/lang/String;", "getPAYMENT_OPTION_CARD_TEST_TAG$annotations", "()V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentOptionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,258:1\n154#2:259\n154#2:260\n154#2:261\n154#2:262\n154#2:263\n154#2:296\n68#3,5:264\n73#3:295\n77#3:301\n75#4:269\n76#4,11:271\n89#4:300\n76#5:270\n460#6,13:282\n473#6,3:297\n*S KotlinDebug\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt\n*L\n115#1:259\n145#1:260\n146#1:261\n192#1:262\n213#1:263\n220#1:296\n209#1:264,5\n209#1:295\n209#1:301\n209#1:269\n209#1:271,11\n209#1:300\n209#1:270\n209#1:282,13\n209#1:297,3\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentOptionUiKt {
    public static final String PAYMENT_OPTION_CARD_TEST_TAG = "PAYMENT_OPTION_CARD_TEST_TAG";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: PaymentOptionCard-flo8M7A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116598PaymentOptionCardflo8M7A(boolean z, boolean z2, int i, C47063pm0 c47063pm0, String str, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
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
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1708223322);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (mo89518u.mo89536o(z2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 896) == 0) {
                if (mo89518u.mo89527r(i)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i4 |= i7;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 7168) == 0) {
                    if (mo89518u.mo89539n(c47063pm0)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else if ((57344 & i2) == 0) {
                        if (mo89518u.mo89539n(str)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i4 |= i9;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= ImageMetadata.EDGE_MODE;
                    } else if ((458752 & i2) == 0) {
                        if (mo89518u.mo89539n(function0)) {
                            i10 = DateUtils.FORMAT_NUMERIC_DATE;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 64;
                    if (i11 == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        obj = interfaceC41563gV2;
                        if (mo89518u.mo89539n(obj)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i4 |= i12;
                        if ((2995931 & i4) != 599186 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                        } else {
                            if (i11 != 0) {
                                c20912a = InterfaceC41563gV2.f82354b0;
                            } else {
                                c20912a = obj;
                            }
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(-1708223322, i4, -1, "com.stripe.android.paymentsheet.PaymentOptionCard (PaymentOptionUi.kt:132)");
                            }
                            InterfaceC41563gV2 interfaceC41563gV22 = c20912a;
                            SectionUIKt.m116748SectionCardT042LqI(BB5.m114255n(ND3.m94182k(BB5.m114254o(c20912a, C43705k61.m29303g(64)), C43705k61.m29303g(6), 0.0f, 2, null), 0.0f, 1, null), z, 0L, null, C43575jt0.m29791b(mo89518u, 1394573824, true, new PaymentOptionUiKt$PaymentOptionCard$1(str, z, z2, function0, i, i4, c47063pm0)), mo89518u, ((i4 << 3) & 112) | 24576, 12);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            obj = interfaceC41563gV22;
                        }
                        mo89512w = mo89518u.mo89512w();
                        if (mo89512w != null) {
                            mo89512w.mo20405a(new PaymentOptionUiKt$PaymentOptionCard$2(z, z2, i, c47063pm0, str, function0, obj, i2, i3));
                            return;
                        }
                        return;
                    }
                    obj = interfaceC41563gV2;
                    if ((2995931 & i4) != 599186) {
                    }
                    if (i11 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    InterfaceC41563gV2 interfaceC41563gV222 = c20912a;
                    SectionUIKt.m116748SectionCardT042LqI(BB5.m114255n(ND3.m94182k(BB5.m114254o(c20912a, C43705k61.m29303g(64)), C43705k61.m29303g(6), 0.0f, 2, null), 0.0f, 1, null), z, 0L, null, C43575jt0.m29791b(mo89518u, 1394573824, true, new PaymentOptionUiKt$PaymentOptionCard$1(str, z, z2, function0, i, i4, c47063pm0)), mo89518u, ((i4 << 3) & 112) | 24576, 12);
                    if (C35528Qt0.m87827O()) {
                    }
                    obj = interfaceC41563gV222;
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w != null) {
                    }
                }
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                i11 = i3 & 64;
                if (i11 == 0) {
                }
                obj = interfaceC41563gV2;
                if ((2995931 & i4) != 599186) {
                }
                if (i11 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                InterfaceC41563gV2 interfaceC41563gV2222 = c20912a;
                SectionUIKt.m116748SectionCardT042LqI(BB5.m114255n(ND3.m94182k(BB5.m114254o(c20912a, C43705k61.m29303g(64)), C43705k61.m29303g(6), 0.0f, 2, null), 0.0f, 1, null), z, 0L, null, C43575jt0.m29791b(mo89518u, 1394573824, true, new PaymentOptionUiKt$PaymentOptionCard$1(str, z, z2, function0, i, i4, c47063pm0)), mo89518u, ((i4 << 3) & 112) | 24576, 12);
                if (C35528Qt0.m87827O()) {
                }
                obj = interfaceC41563gV2222;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) == 0) {
            }
            i11 = i3 & 64;
            if (i11 == 0) {
            }
            obj = interfaceC41563gV2;
            if ((2995931 & i4) != 599186) {
            }
            if (i11 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            InterfaceC41563gV2 interfaceC41563gV22222 = c20912a;
            SectionUIKt.m116748SectionCardT042LqI(BB5.m114255n(ND3.m94182k(BB5.m114254o(c20912a, C43705k61.m29303g(64)), C43705k61.m29303g(6), 0.0f, 2, null), 0.0f, 1, null), z, 0L, null, C43575jt0.m29791b(mo89518u, 1394573824, true, new PaymentOptionUiKt$PaymentOptionCard$1(str, z, z2, function0, i, i4, c47063pm0)), mo89518u, ((i4 << 3) & 112) | 24576, 12);
            if (C35528Qt0.m87827O()) {
            }
            obj = interfaceC41563gV22222;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i11 = i3 & 64;
        if (i11 == 0) {
        }
        obj = interfaceC41563gV2;
        if ((2995931 & i4) != 599186) {
        }
        if (i11 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        InterfaceC41563gV2 interfaceC41563gV222222 = c20912a;
        SectionUIKt.m116748SectionCardT042LqI(BB5.m114255n(ND3.m94182k(BB5.m114254o(c20912a, C43705k61.m29303g(64)), C43705k61.m29303g(6), 0.0f, 2, null), 0.0f, 1, null), z, 0L, null, C43575jt0.m29791b(mo89518u, 1394573824, true, new PaymentOptionUiKt$PaymentOptionCard$1(str, z, z2, function0, i, i4, c47063pm0)), mo89518u, ((i4 << 3) & 112) | 24576, 12);
        if (C35528Qt0.m87827O()) {
        }
        obj = interfaceC41563gV222222;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    /* renamed from: PaymentOptionUi-VPtddqc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116599PaymentOptionUiVPtddqc(float f, boolean z, boolean z2, boolean z3, int i, InterfaceC41563gV2 interfaceC41563gV2, C47063pm0 c47063pm0, Integer num, String str, String str2, String description, Function0<Unit> function0, String str3, Function0<Unit> onItemSelectedListener, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Integer num2;
        String str4;
        Function0<Unit> function02;
        EX2 ex2;
        int i15;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV22;
        C47063pm0 c47063pm02;
        String str5;
        String str6;
        Function0<Unit> function03;
        String str7;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "onItemSelectedListener");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-701176832);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (mo89518u.mo89533p(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= mo89518u.mo89536o(z) ? 32 : 16;
            if ((i4 & 4) == 0) {
                i5 |= 384;
            } else if ((i2 & 896) == 0) {
                i5 |= mo89518u.mo89536o(z2) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= mo89518u.mo89536o(z3) ? 2048 : 1024;
            }
            if ((i4 & 16) == 0) {
                i5 |= 24576;
            } else if ((57344 & i2) == 0) {
                i5 |= mo89518u.mo89527r(i) ? 16384 : 8192;
                i6 = i4 & 32;
                if (i6 != 0) {
                    i5 |= ImageMetadata.EDGE_MODE;
                } else if ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    i5 |= mo89518u.mo89539n(interfaceC41563gV2) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                }
                i7 = i4 & 64;
                if (i7 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= mo89518u.mo89539n(c47063pm0) ? 1048576 : 524288;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= mo89518u.mo89539n(num) ? 8388608 : 4194304;
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= mo89518u.mo89539n(str) ? 67108864 : 33554432;
                }
                i10 = i4 & 512;
                if (i10 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= mo89518u.mo89539n(str2) ? 536870912 : 268435456;
                }
                if ((i4 & 1024) != 0) {
                    i11 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i11 = i3 | (mo89518u.mo89539n(description) ? 4 : 2);
                } else {
                    i11 = i3;
                }
                i12 = i4 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i3 & 112) == 0) {
                    i11 |= mo89518u.mo89539n(function0) ? 32 : 16;
                }
                i13 = i4 & 4096;
                if (i13 != 0) {
                    i11 |= 384;
                } else if ((i3 & 896) == 0) {
                    i11 |= mo89518u.mo89539n(str3) ? 256 : 128;
                    if ((i4 & 8192) == 0) {
                        i11 |= 3072;
                    } else if ((i3 & 7168) == 0) {
                        i11 |= mo89518u.mo89539n(onItemSelectedListener) ? 2048 : 1024;
                    }
                    i14 = i11;
                    if ((1533916891 & i5) != 306783378 && (i14 & 5851) == 1170 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV22 = interfaceC41563gV2;
                        c47063pm02 = c47063pm0;
                        num2 = num;
                        str5 = str;
                        function03 = function0;
                        str7 = str3;
                        interfaceC32720Et02 = mo89518u;
                        str6 = str2;
                    } else {
                        InterfaceC41563gV2.C20912a c20912a = i6 == 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                        C47063pm0 c47063pm03 = i7 == 0 ? null : c47063pm0;
                        num2 = i8 == 0 ? null : num;
                        String str8 = i9 == 0 ? "" : str;
                        str4 = i10 == 0 ? "" : str2;
                        function02 = i12 == 0 ? null : function0;
                        String str9 = i13 == 0 ? "" : str3;
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(-701176832, i5, i14, "com.stripe.android.paymentsheet.PaymentOptionUi (PaymentOptionUi.kt:52)");
                        }
                        ex2 = (EX2) C35550Qv4.m87571b(new Object[0], null, null, PaymentOptionUiKt$PaymentOptionUi$openRemoveDialog$1.INSTANCE, mo89518u, 3080, 6);
                        i15 = i5;
                        interfaceC32720Et02 = mo89518u;
                        C5430Mw.m94558a(C43575jt0.m29791b(mo89518u, -408712072, true, new PaymentOptionUiKt$PaymentOptionUi$1(z2, str9, ex2, i14, z)), C8203U9.m81909a(BB5.m114247v(ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(12), 0.0f, 0.0f, 13, null), f), !z3 ? 1.0f : 0.6f), C43575jt0.m29791b(interfaceC32720Et02, -124726534, true, new PaymentOptionUiKt$PaymentOptionUi$2(z, z3, i, c47063pm03, str8, onItemSelectedListener, i15, i14, description, num2)), interfaceC32720Et02, 390, 0);
                        if (z2 && function02 != null) {
                            SimpleDialogElementUIKt.SimpleDialogElementUI(ex2, str4, description, C40946fS5.m41310c(C19159R.string.remove, interfaceC32720Et02, 0), C40946fS5.m41310c(C19159R.string.cancel, interfaceC32720Et02, 0), function02, null, interfaceC32720Et02, ((i15 >> 24) & 112) | ((i14 << 6) & 896) | ((i14 << 12) & ImageMetadata.JPEG_GPS_COORDINATES), 64);
                        }
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC41563gV22 = c20912a;
                        c47063pm02 = c47063pm03;
                        str5 = str8;
                        str6 = str4;
                        function03 = function02;
                        str7 = str9;
                    }
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w != null) {
                        return;
                    }
                    mo89512w.mo20405a(new PaymentOptionUiKt$PaymentOptionUi$3(f, z, z2, z3, i, interfaceC41563gV22, c47063pm02, num2, str5, str6, description, function03, str7, onItemSelectedListener, i2, i3, i4));
                    return;
                }
                if ((i4 & 8192) == 0) {
                }
                i14 = i11;
                if ((1533916891 & i5) != 306783378) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                ex2 = (EX2) C35550Qv4.m87571b(new Object[0], null, null, PaymentOptionUiKt$PaymentOptionUi$openRemoveDialog$1.INSTANCE, mo89518u, 3080, 6);
                i15 = i5;
                interfaceC32720Et02 = mo89518u;
                C5430Mw.m94558a(C43575jt0.m29791b(mo89518u, -408712072, true, new PaymentOptionUiKt$PaymentOptionUi$1(z2, str9, ex2, i14, z)), C8203U9.m81909a(BB5.m114247v(ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(12), 0.0f, 0.0f, 13, null), f), !z3 ? 1.0f : 0.6f), C43575jt0.m29791b(interfaceC32720Et02, -124726534, true, new PaymentOptionUiKt$PaymentOptionUi$2(z, z3, i, c47063pm03, str8, onItemSelectedListener, i15, i14, description, num2)), interfaceC32720Et02, 390, 0);
                if (z2) {
                    SimpleDialogElementUIKt.SimpleDialogElementUI(ex2, str4, description, C40946fS5.m41310c(C19159R.string.remove, interfaceC32720Et02, 0), C40946fS5.m41310c(C19159R.string.cancel, interfaceC32720Et02, 0), function02, null, interfaceC32720Et02, ((i15 >> 24) & 112) | ((i14 << 6) & 896) | ((i14 << 12) & ImageMetadata.JPEG_GPS_COORDINATES), 64);
                }
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV22 = c20912a;
                c47063pm02 = c47063pm03;
                str5 = str8;
                str6 = str4;
                function03 = function02;
                str7 = str9;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w != null) {
                }
            }
            i6 = i4 & 32;
            if (i6 != 0) {
            }
            i7 = i4 & 64;
            if (i7 != 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            i9 = i4 & 256;
            if (i9 != 0) {
            }
            i10 = i4 & 512;
            if (i10 != 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            i12 = i4 & 2048;
            if (i12 != 0) {
            }
            i13 = i4 & 4096;
            if (i13 != 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            i14 = i11;
            if ((1533916891 & i5) != 306783378) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            ex2 = (EX2) C35550Qv4.m87571b(new Object[0], null, null, PaymentOptionUiKt$PaymentOptionUi$openRemoveDialog$1.INSTANCE, mo89518u, 3080, 6);
            i15 = i5;
            interfaceC32720Et02 = mo89518u;
            C5430Mw.m94558a(C43575jt0.m29791b(mo89518u, -408712072, true, new PaymentOptionUiKt$PaymentOptionUi$1(z2, str9, ex2, i14, z)), C8203U9.m81909a(BB5.m114247v(ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(12), 0.0f, 0.0f, 13, null), f), !z3 ? 1.0f : 0.6f), C43575jt0.m29791b(interfaceC32720Et02, -124726534, true, new PaymentOptionUiKt$PaymentOptionUi$2(z, z3, i, c47063pm03, str8, onItemSelectedListener, i15, i14, description, num2)), interfaceC32720Et02, 390, 0);
            if (z2) {
            }
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV22 = c20912a;
            c47063pm02 = c47063pm03;
            str5 = str8;
            str6 = str4;
            function03 = function02;
            str7 = str9;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w != null) {
            }
        }
        if ((i4 & 4) == 0) {
        }
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        i6 = i4 & 32;
        if (i6 != 0) {
        }
        i7 = i4 & 64;
        if (i7 != 0) {
        }
        i8 = i4 & 128;
        if (i8 != 0) {
        }
        i9 = i4 & 256;
        if (i9 != 0) {
        }
        i10 = i4 & 512;
        if (i10 != 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        i12 = i4 & 2048;
        if (i12 != 0) {
        }
        i13 = i4 & 4096;
        if (i13 != 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        i14 = i11;
        if ((1533916891 & i5) != 306783378) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        ex2 = (EX2) C35550Qv4.m87571b(new Object[0], null, null, PaymentOptionUiKt$PaymentOptionUi$openRemoveDialog$1.INSTANCE, mo89518u, 3080, 6);
        i15 = i5;
        interfaceC32720Et02 = mo89518u;
        C5430Mw.m94558a(C43575jt0.m29791b(mo89518u, -408712072, true, new PaymentOptionUiKt$PaymentOptionUi$1(z2, str9, ex2, i14, z)), C8203U9.m81909a(BB5.m114247v(ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(12), 0.0f, 0.0f, 13, null), f), !z3 ? 1.0f : 0.6f), C43575jt0.m29791b(interfaceC32720Et02, -124726534, true, new PaymentOptionUiKt$PaymentOptionUi$2(z, z3, i, c47063pm03, str8, onItemSelectedListener, i15, i14, description, num2)), interfaceC32720Et02, 390, 0);
        if (z2) {
        }
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = c20912a;
        c47063pm02 = c47063pm03;
        str5 = str8;
        str6 = str4;
        function03 = function02;
        str7 = str9;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaymentOptionUi_Editing(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2064599707);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2064599707, i, -1, "com.stripe.android.paymentsheet.PaymentOptionUi_Editing (PaymentOptionUi.kt:243)");
            }
            StripeThemeKt.StripeTheme(null, null, null, ComposableSingletons$PaymentOptionUiKt.INSTANCE.m116590getLambda2$paymentsheet_release(), mo89518u, 3072, 7);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentOptionUiKt$PaymentOptionUi_Editing$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaymentOptionUi_Selected(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(857903204);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(857903204, i, -1, "com.stripe.android.paymentsheet.PaymentOptionUi_Selected (PaymentOptionUi.kt:226)");
            }
            StripeThemeKt.StripeTheme(null, null, null, ComposableSingletons$PaymentOptionUiKt.INSTANCE.m116589getLambda1$paymentsheet_release(), mo89518u, 3072, 7);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentOptionUiKt$PaymentOptionUi_Selected$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RemoveBadge(String str, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        InterfaceC41563gV2.C20912a c20912a;
        long m94906d;
        long m18725h;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-425221084);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(str)) {
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
            if (mo89518u.mo89539n(function0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            if ((i3 & 731) != 146 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC41563gV22 = obj;
            } else {
                if (i7 == 0) {
                    c20912a = InterfaceC41563gV2.f82354b0;
                } else {
                    c20912a = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-425221084, i3, -1, "com.stripe.android.paymentsheet.RemoveBadge (PaymentOptionUi.kt:173)");
                }
                m94906d = TM2.f35372a.m83731a(mo89518u, TM2.f35373b).m94906d();
                if (!StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(m94906d)) {
                    m18725h = C47063pm0.f104050b.m18732a();
                } else {
                    m18725h = C47063pm0.f104050b.m18725h();
                }
                InterfaceC41563gV2 interfaceC41563gV23 = c20912a;
                C51659xX1.m5069a(C46748pE3.m19793d(C19159R.C19160drawable.stripe_ic_delete_symbol, mo89518u, 0), str, C38131ak0.m70814e(C13342bw.m62124d(C35447Qk0.m88106a(BB5.m114246w(c20912a, C43705k61.m29303g(20)), C39242cc5.m61171e()), m94906d, null, 2, null), false, null, null, function0, 7, null), null, null, 0.0f, C48841sm0.C28383a.m13699b(C48841sm0.f109227b, m18725h, 0, 2, null), mo89518u, ((i3 << 3) & 112) | 8, 56);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC41563gV22 = interfaceC41563gV23;
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new PaymentOptionUiKt$RemoveBadge$1(str, function0, interfaceC41563gV22, i, i2));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        if ((i3 & 731) != 146) {
        }
        if (i7 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        m94906d = TM2.f35372a.m83731a(mo89518u, TM2.f35373b).m94906d();
        if (!StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(m94906d)) {
        }
        InterfaceC41563gV2 interfaceC41563gV232 = c20912a;
        C51659xX1.m5069a(C46748pE3.m19793d(C19159R.C19160drawable.stripe_ic_delete_symbol, mo89518u, 0), str, C38131ak0.m70814e(C13342bw.m62124d(C35447Qk0.m88106a(BB5.m114246w(c20912a, C43705k61.m29303g(20)), C39242cc5.m61171e()), m94906d, null, 2, null), false, null, null, function0, 7, null), null, null, 0.0f, C48841sm0.C28383a.m13699b(C48841sm0.f109227b, m18725h, 0, 2, null), mo89518u, ((i3 << 3) & 112) | 8, 56);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = interfaceC41563gV232;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectedBadge(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        InterfaceC41563gV2.C20912a c20912a;
        long m18725h;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-21285810);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
        if ((i3 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            c20912a = obj;
        } else {
            if (i5 != 0) {
                c20912a = InterfaceC41563gV2.f82354b0;
            } else {
                c20912a = obj;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-21285810, i, -1, "com.stripe.android.paymentsheet.SelectedBadge (PaymentOptionUi.kt:199)");
            }
            TM2 tm2 = TM2.f35372a;
            int i6 = TM2.f35373b;
            if (StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(tm2.m83731a(mo89518u, i6).m94900j())) {
                m18725h = C47063pm0.f104050b.m18732a();
            } else {
                m18725h = C47063pm0.f104050b.m18725h();
            }
            long j = m18725h;
            InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
            InterfaceC41563gV2 m62124d = C13342bw.m62124d(BB5.m114246w(C35447Qk0.m88106a(c20912a, C39242cc5.m61171e()), C43705k61.m29303g(24)), tm2.m83731a(mo89518u, i6).m94900j(), null, 2, null);
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, 6);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m62124d);
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
            mo89518u.mo89638F(-1284601900);
            DP1.m110534a(C45837ni0.m23289a(EP1.C1822a.f7416a), null, BB5.m114246w(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(12)), j, mo89518u, 432, 0);
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
            mo89512w.mo20405a(new PaymentOptionUiKt$SelectedBadge$2(c20912a, i, i2));
        }
    }

    public static /* synthetic */ void getPAYMENT_OPTION_CARD_TEST_TAG$annotations() {
    }
}

package com.stripe.android.paymentsheet;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C48841sm0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u001a]\u0010\u0010\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\"\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001a}\u0010-\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a?\u00102\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010/\u001a\u00020.H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\"\u001a\u00103\u001a\u00020%8\u0006X\u0087T¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, m28432d2 = {"", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "paymentMethods", "", "selectedIndex", "", "isEnabled", "Lkotlin/Function1;", "", "onItemSelectedListener", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "imageLoader", "LgV2;", "modifier", "LCo2;", TransferTable.COLUMN_STATE, "PaymentMethodsUI", "(Ljava/util/List;IZLkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/image/StripeImageLoader;LgV2;LCo2;LEt0;II)V", "Lk61;", "maxWidth", "numberOfPaymentMethods", "rememberViewWidth-kHDZbjc", "(FILEt0;I)F", "rememberViewWidth", "calculateViewWidth-D5KLDUw", "(FI)F", "calculateViewWidth", "availableWidth", "minItemWidth", "spacing", "", "lastCardPeekAmount", "computeItemWidthWhenExceedingMaxWidth-DRUOcmI", "(FFFF)F", "computeItemWidthWhenExceedingMaxWidth", "minViewWidth", "iconRes", "", "iconUrl", "title", "isSelected", "tintOnSelected", "itemIndex", "PaymentMethodUI-jFuDa88", "(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZILgV2;Lkotlin/jvm/functions/Function1;LEt0;III)V", "PaymentMethodUI", "Lpm0;", "color", "PaymentMethodIconUi-qFjXxE8", "(ILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZJLEt0;I)V", "PaymentMethodIconUi", "TEST_TAG_LIST", "Ljava/lang/String;", "getTEST_TAG_LIST$annotations", "()V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentMethodsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/PaymentMethodsUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,274:1\n76#2:275\n67#3,3:276\n66#3:279\n1057#4,6:280\n1057#4,6:286\n1057#4,6:310\n92#5:292\n58#5:293\n92#5:295\n92#5:296\n51#5:297\n58#5:298\n75#5:299\n51#5:300\n58#5:302\n81#5:303\n92#5:304\n58#5:305\n154#6:294\n174#6:301\n174#6:306\n154#6:307\n164#6:308\n154#6:309\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/PaymentMethodsUIKt\n*L\n65#1:275\n67#1:276,3\n67#1:279\n67#1:280,6\n122#1:286,6\n251#1:310,6\n130#1:292\n130#1:293\n133#1:295\n134#1:296\n135#1:297\n139#1:298\n139#1:299\n160#1:300\n163#1:302\n164#1:303\n167#1:304\n169#1:305\n131#1:294\n162#1:301\n169#1:306\n195#1:307\n200#1:308\n200#1:309\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentMethodsUIKt {
    public static final String TEST_TAG_LIST = "PaymentMethodsUITestTag";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PaymentMethodIconUi-qFjXxE8  reason: not valid java name */
    public static final void m116591PaymentMethodIconUiqFjXxE8(int i, String str, StripeImageLoader stripeImageLoader, boolean z, long j, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        C48841sm0 c48841sm0;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-728567836);
        if ((i2 & 14) == 0) {
            if (mo89518u.mo89527r(i)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (mo89518u.mo89539n(str)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 896) == 0) {
            if (mo89518u.mo89539n(stripeImageLoader)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 7168) == 0) {
            if (mo89518u.mo89536o(z)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((57344 & i2) == 0) {
            if (mo89518u.mo89524s(j)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((46811 & i9) == 9362 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-728567836, i9, -1, "com.stripe.android.paymentsheet.PaymentMethodIconUi (PaymentMethodsUI.kt:243)");
            }
            boolean mo89536o = mo89518u.mo89536o(z) | mo89518u.mo89524s(j);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89536o || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                if (z) {
                    c48841sm0 = C48841sm0.C28383a.m13699b(C48841sm0.f109227b, j, 0, 2, null);
                } else {
                    c48841sm0 = null;
                }
                mo89635G = c48841sm0;
                mo89518u.mo89503z(mo89635G);
            }
            C48841sm0 c48841sm02 = (C48841sm0) mo89635G;
            if (str != null) {
                mo89518u.mo89638F(-1361599569);
                int i10 = i9 >> 3;
                StripeImageKt.StripeImage(str, stripeImageLoader, null, null, BA0.f1929a.m114316b(), null, null, null, null, mo89518u, (i10 & 14) | 24960 | (StripeImageLoader.$stable << 3) | (i10 & 112), 488);
                mo89518u.mo89605Q();
                interfaceC32720Et02 = mo89518u;
            } else {
                interfaceC32720Et02 = mo89518u;
                interfaceC32720Et02.mo89638F(-1361599375);
                C51659xX1.m5069a(C46748pE3.m19793d(i, interfaceC32720Et02, i9 & 14), null, null, null, null, 0.0f, c48841sm02, interfaceC32720Et02, 56, 60);
                interfaceC32720Et02.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentMethodsUIKt$PaymentMethodIconUi$1(i, str, stripeImageLoader, z, j, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /* renamed from: PaymentMethodUI-jFuDa88  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116592PaymentMethodUIjFuDa88(float f, int i, String str, StripeImageLoader imageLoader, String title, boolean z, boolean z2, boolean z3, int i2, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super Integer, Unit> onItemSelectedListener, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long m116698getOnComponent0d7_KjU;
        float m29303g;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "onItemSelectedListener");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(420627920);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (mo89518u.mo89533p(f) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= mo89518u.mo89527r(i) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= mo89518u.mo89539n(str) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i6 |= mo89518u.mo89539n(imageLoader) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i6 |= 24576;
        } else if ((57344 & i3) == 0) {
            i6 |= mo89518u.mo89539n(title) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i7 = ImageMetadata.EDGE_MODE;
        } else {
            if ((458752 & i3) == 0) {
                i7 = mo89518u.mo89536o(z) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
            }
            if ((i5 & 64) == 0) {
                i8 = 1572864;
            } else {
                if ((3670016 & i3) == 0) {
                    i8 = mo89518u.mo89536o(z2) ? 1048576 : 524288;
                }
                if ((i5 & 128) != 0) {
                    i6 |= 12582912;
                } else if ((29360128 & i3) == 0) {
                    i6 |= mo89518u.mo89536o(z3) ? 8388608 : 4194304;
                    if ((i5 & 256) == 0) {
                        i6 |= 100663296;
                    } else if ((234881024 & i3) == 0) {
                        i6 |= mo89518u.mo89527r(i2) ? 67108864 : 33554432;
                        i9 = i5 & 512;
                        if (i9 != 0) {
                            i6 |= 805306368;
                        } else if ((i3 & 1879048192) == 0) {
                            i6 |= mo89518u.mo89539n(interfaceC41563gV2) ? 536870912 : 268435456;
                        }
                        if ((i5 & 1024) != 0) {
                            i10 = i4 | 6;
                        } else if ((i4 & 14) == 0) {
                            i10 = i4 | (mo89518u.mo89539n(onItemSelectedListener) ? 4 : 2);
                        } else {
                            i10 = i4;
                        }
                        if ((i6 & 1533916891) != 306783378 && (i10 & 11) == 2 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            interfaceC41563gV22 = interfaceC41563gV2;
                            interfaceC32720Et02 = mo89518u;
                        } else {
                            InterfaceC41563gV2.C20912a c20912a = i9 != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(420627920, i6, i10, "com.stripe.android.paymentsheet.PaymentMethodUI (PaymentMethodsUI.kt:172)");
                            }
                            if (z) {
                                mo89518u.mo89638F(-1803485132);
                                m116698getOnComponent0d7_KjU = TM2.f35372a.m83731a(mo89518u, TM2.f35373b).m94900j();
                                mo89518u.mo89605Q();
                            } else {
                                mo89518u.mo89638F(-1803485082);
                                m116698getOnComponent0d7_KjU = StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116698getOnComponent0d7_KjU();
                                mo89518u.mo89605Q();
                            }
                            InterfaceC41563gV2 interfaceC41563gV23 = c20912a;
                            InterfaceC41563gV2 m114271C = BB5.m114271C(BB5.m114254o(C8203U9.m81909a(c20912a, z2 ? 1.0f : 0.6f), C43705k61.m29303g(60)), f, 0.0f, 2, null);
                            TM2 tm2 = TM2.f35372a;
                            int i11 = TM2.f35373b;
                            KC0 m109565d = tm2.m83730b(mo89518u, i11).m109565d();
                            long m116695getComponent0d7_KjU = StripeThemeKt.getStripeColors(tm2, mo89518u, i11).m116695getComponent0d7_KjU();
                            C20064eZ borderStroke = StripeThemeKt.getBorderStroke(tm2, z, mo89518u, i11 | ((i6 >> 12) & 112));
                            if (z) {
                                m29303g = C43705k61.m29303g((float) 1.5d);
                            } else {
                                m29303g = C43705k61.m29303g(0);
                            }
                            int i12 = i10;
                            interfaceC32720Et02 = mo89518u;
                            C35168Pf0.m90018a(m114271C, m109565d, m116695getComponent0d7_KjU, 0L, borderStroke, m29303g, C43575jt0.m29791b(interfaceC32720Et02, -434634125, true, new PaymentMethodsUIKt$PaymentMethodUI$1(z, z2, onItemSelectedListener, i2, i12, i6, title, m116698getOnComponent0d7_KjU, i, str, imageLoader, z3)), interfaceC32720Et02, 1572864, 8);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            interfaceC41563gV22 = interfaceC41563gV23;
                        }
                        mo89512w = interfaceC32720Et02.mo89512w();
                        if (mo89512w == null) {
                            return;
                        }
                        mo89512w.mo20405a(new PaymentMethodsUIKt$PaymentMethodUI$2(f, i, str, imageLoader, title, z, z2, z3, i2, interfaceC41563gV22, onItemSelectedListener, i3, i4, i5));
                        return;
                    }
                    i9 = i5 & 512;
                    if (i9 != 0) {
                    }
                    if ((i5 & 1024) != 0) {
                    }
                    if ((i6 & 1533916891) != 306783378) {
                    }
                    if (i9 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    if (z) {
                    }
                    InterfaceC41563gV2 interfaceC41563gV232 = c20912a;
                    InterfaceC41563gV2 m114271C2 = BB5.m114271C(BB5.m114254o(C8203U9.m81909a(c20912a, z2 ? 1.0f : 0.6f), C43705k61.m29303g(60)), f, 0.0f, 2, null);
                    TM2 tm22 = TM2.f35372a;
                    int i112 = TM2.f35373b;
                    KC0 m109565d2 = tm22.m83730b(mo89518u, i112).m109565d();
                    long m116695getComponent0d7_KjU2 = StripeThemeKt.getStripeColors(tm22, mo89518u, i112).m116695getComponent0d7_KjU();
                    C20064eZ borderStroke2 = StripeThemeKt.getBorderStroke(tm22, z, mo89518u, i112 | ((i6 >> 12) & 112));
                    if (z) {
                    }
                    int i122 = i10;
                    interfaceC32720Et02 = mo89518u;
                    C35168Pf0.m90018a(m114271C2, m109565d2, m116695getComponent0d7_KjU2, 0L, borderStroke2, m29303g, C43575jt0.m29791b(interfaceC32720Et02, -434634125, true, new PaymentMethodsUIKt$PaymentMethodUI$1(z, z2, onItemSelectedListener, i2, i122, i6, title, m116698getOnComponent0d7_KjU, i, str, imageLoader, z3)), interfaceC32720Et02, 1572864, 8);
                    if (C35528Qt0.m87827O()) {
                    }
                    interfaceC41563gV22 = interfaceC41563gV232;
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                if ((i5 & 256) == 0) {
                }
                i9 = i5 & 512;
                if (i9 != 0) {
                }
                if ((i5 & 1024) != 0) {
                }
                if ((i6 & 1533916891) != 306783378) {
                }
                if (i9 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                if (z) {
                }
                InterfaceC41563gV2 interfaceC41563gV2322 = c20912a;
                InterfaceC41563gV2 m114271C22 = BB5.m114271C(BB5.m114254o(C8203U9.m81909a(c20912a, z2 ? 1.0f : 0.6f), C43705k61.m29303g(60)), f, 0.0f, 2, null);
                TM2 tm222 = TM2.f35372a;
                int i1122 = TM2.f35373b;
                KC0 m109565d22 = tm222.m83730b(mo89518u, i1122).m109565d();
                long m116695getComponent0d7_KjU22 = StripeThemeKt.getStripeColors(tm222, mo89518u, i1122).m116695getComponent0d7_KjU();
                C20064eZ borderStroke22 = StripeThemeKt.getBorderStroke(tm222, z, mo89518u, i1122 | ((i6 >> 12) & 112));
                if (z) {
                }
                int i1222 = i10;
                interfaceC32720Et02 = mo89518u;
                C35168Pf0.m90018a(m114271C22, m109565d22, m116695getComponent0d7_KjU22, 0L, borderStroke22, m29303g, C43575jt0.m29791b(interfaceC32720Et02, -434634125, true, new PaymentMethodsUIKt$PaymentMethodUI$1(z, z2, onItemSelectedListener, i2, i1222, i6, title, m116698getOnComponent0d7_KjU, i, str, imageLoader, z3)), interfaceC32720Et02, 1572864, 8);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV22 = interfaceC41563gV2322;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                }
            }
            i6 |= i8;
            if ((i5 & 128) != 0) {
            }
            if ((i5 & 256) == 0) {
            }
            i9 = i5 & 512;
            if (i9 != 0) {
            }
            if ((i5 & 1024) != 0) {
            }
            if ((i6 & 1533916891) != 306783378) {
            }
            if (i9 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            if (z) {
            }
            InterfaceC41563gV2 interfaceC41563gV23222 = c20912a;
            InterfaceC41563gV2 m114271C222 = BB5.m114271C(BB5.m114254o(C8203U9.m81909a(c20912a, z2 ? 1.0f : 0.6f), C43705k61.m29303g(60)), f, 0.0f, 2, null);
            TM2 tm2222 = TM2.f35372a;
            int i11222 = TM2.f35373b;
            KC0 m109565d222 = tm2222.m83730b(mo89518u, i11222).m109565d();
            long m116695getComponent0d7_KjU222 = StripeThemeKt.getStripeColors(tm2222, mo89518u, i11222).m116695getComponent0d7_KjU();
            C20064eZ borderStroke222 = StripeThemeKt.getBorderStroke(tm2222, z, mo89518u, i11222 | ((i6 >> 12) & 112));
            if (z) {
            }
            int i12222 = i10;
            interfaceC32720Et02 = mo89518u;
            C35168Pf0.m90018a(m114271C222, m109565d222, m116695getComponent0d7_KjU222, 0L, borderStroke222, m29303g, C43575jt0.m29791b(interfaceC32720Et02, -434634125, true, new PaymentMethodsUIKt$PaymentMethodUI$1(z, z2, onItemSelectedListener, i2, i12222, i6, title, m116698getOnComponent0d7_KjU, i, str, imageLoader, z3)), interfaceC32720Et02, 1572864, 8);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV22 = interfaceC41563gV23222;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        i6 |= i7;
        if ((i5 & 64) == 0) {
        }
        i6 |= i8;
        if ((i5 & 128) != 0) {
        }
        if ((i5 & 256) == 0) {
        }
        i9 = i5 & 512;
        if (i9 != 0) {
        }
        if ((i5 & 1024) != 0) {
        }
        if ((i6 & 1533916891) != 306783378) {
        }
        if (i9 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        if (z) {
        }
        InterfaceC41563gV2 interfaceC41563gV232222 = c20912a;
        InterfaceC41563gV2 m114271C2222 = BB5.m114271C(BB5.m114254o(C8203U9.m81909a(c20912a, z2 ? 1.0f : 0.6f), C43705k61.m29303g(60)), f, 0.0f, 2, null);
        TM2 tm22222 = TM2.f35372a;
        int i112222 = TM2.f35373b;
        KC0 m109565d2222 = tm22222.m83730b(mo89518u, i112222).m109565d();
        long m116695getComponent0d7_KjU2222 = StripeThemeKt.getStripeColors(tm22222, mo89518u, i112222).m116695getComponent0d7_KjU();
        C20064eZ borderStroke2222 = StripeThemeKt.getBorderStroke(tm22222, z, mo89518u, i112222 | ((i6 >> 12) & 112));
        if (z) {
        }
        int i122222 = i10;
        interfaceC32720Et02 = mo89518u;
        C35168Pf0.m90018a(m114271C2222, m109565d2222, m116695getComponent0d7_KjU2222, 0L, borderStroke2222, m29303g, C43575jt0.m29791b(interfaceC32720Et02, -434634125, true, new PaymentMethodsUIKt$PaymentMethodUI$1(z, z2, onItemSelectedListener, i2, i122222, i6, title, m116698getOnComponent0d7_KjU, i, str, imageLoader, z3)), interfaceC32720Et02, 1572864, 8);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = interfaceC41563gV232222;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    public static final void PaymentMethodsUI(List<LpmRepository.SupportedPaymentMethod> paymentMethods, int i, boolean z, Function1<? super LpmRepository.SupportedPaymentMethod, Unit> onItemSelectedListener, StripeImageLoader imageLoader, InterfaceC41563gV2 interfaceC41563gV2, C32209Co2 c32209Co2, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
        InterfaceC41563gV2.C20912a c20912a;
        C32209Co2 c32209Co22;
        int i4;
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "onItemSelectedListener");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1035131671);
        if ((i3 & 32) != 0) {
            c20912a = InterfaceC41563gV2.f82354b0;
        } else {
            c20912a = interfaceC41563gV2;
        }
        if ((i3 & 64) != 0) {
            c32209Co22 = C32443Do2.m109920a(0, 0, mo89518u, 0, 3);
            i4 = i2 & (-3670017);
        } else {
            c32209Co22 = c32209Co2;
            i4 = i2;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1035131671, i4, -1, "com.stripe.android.paymentsheet.PaymentMethodsUI (PaymentMethodsUI.kt:52)");
        }
        boolean booleanValue = ((Boolean) mo89518u.mo89572c(T32.m84395a())).booleanValue();
        Integer valueOf = Integer.valueOf(i);
        Boolean valueOf2 = Boolean.valueOf(booleanValue);
        Integer valueOf3 = Integer.valueOf(i);
        mo89518u.mo89638F(1618982084);
        boolean mo89539n = mo89518u.mo89539n(valueOf2) | mo89518u.mo89539n(c32209Co22) | mo89518u.mo89539n(valueOf3);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new PaymentMethodsUIKt$PaymentMethodsUI$1$1(booleanValue, c32209Co22, i, null);
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        Y91.m75533f(valueOf, (Function2) mo89635G, mo89518u, ((i4 >> 3) & 14) | 64);
        C41282g10.m40327a(C46022o06.m22000a(c20912a, "PaymentMethodsUITestTag1"), null, false, C43575jt0.m29791b(mo89518u, 657223763, true, new PaymentMethodsUIKt$PaymentMethodsUI$2(paymentMethods, c32209Co22, z, i4, i, imageLoader, onItemSelectedListener)), mo89518u, 3072, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentMethodsUIKt$PaymentMethodsUI$3(paymentMethods, i, z, onItemSelectedListener, imageLoader, c20912a, c32209Co22, i2, i3));
        }
    }

    /* renamed from: calculateViewWidth-D5KLDUw  reason: not valid java name */
    public static final float m116595calculateViewWidthD5KLDUw(float f, int i) {
        List listOf;
        Spacing spacing = Spacing.INSTANCE;
        float m29303g = C43705k61.m29303g(f - C43705k61.m29303g(spacing.m116604getCarouselOuterPaddingD9Ej5fM() * 2));
        float m29303g2 = C43705k61.m29303g(90);
        float f2 = i;
        float m29303g3 = C43705k61.m29303g(m29303g2 * f2);
        float m29303g4 = C43705k61.m29303g(spacing.m116603getCarouselInnerPaddingD9Ej5fM() * (i - 1));
        if (C43705k61.m29304f(C43705k61.m29303g(m29303g3 + m29303g4), m29303g) > 0) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.3f), Float.valueOf(0.4f), Float.valueOf(0.5f)});
            Iterator it = listOf.iterator();
            if (it.hasNext()) {
                C43705k61 m29306d = C43705k61.m29306d(m116596computeItemWidthWhenExceedingMaxWidthDRUOcmI(m29303g, m29303g2, spacing.m116603getCarouselInnerPaddingD9Ej5fM(), ((Number) it.next()).floatValue()));
                while (it.hasNext()) {
                    C43705k61 m29306d2 = C43705k61.m29306d(m116596computeItemWidthWhenExceedingMaxWidthDRUOcmI(m29303g, m29303g2, Spacing.INSTANCE.m116603getCarouselInnerPaddingD9Ej5fM(), ((Number) it.next()).floatValue()));
                    if (m29306d.compareTo(m29306d2) > 0) {
                        m29306d = m29306d2;
                    }
                }
                return m29306d.m29298l();
            }
            throw new NoSuchElementException();
        }
        return C43705k61.m29303g(C43705k61.m29303g(m29303g - m29303g4) / f2);
    }

    /* renamed from: computeItemWidthWhenExceedingMaxWidth-DRUOcmI  reason: not valid java name */
    private static final float m116596computeItemWidthWhenExceedingMaxWidthDRUOcmI(float f, float f2, float f3, float f4) {
        int m29303g = (int) (C43705k61.m29303g(C43705k61.m29303g(f - f2) - C43705k61.m29303g(f2 * f4)) / C43705k61.m29303g(f2 + f3));
        return C43705k61.m29303g(C43705k61.m29303g(f - C43705k61.m29303g(f3 * m29303g)) / ((m29303g + 1) + f4));
    }

    public static /* synthetic */ void getTEST_TAG_LIST$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rememberViewWidth-kHDZbjc  reason: not valid java name */
    public static final float m116597rememberViewWidthkHDZbjc(float f, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        interfaceC32720Et0.mo89638F(-1097408203);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1097408203, i2, -1, "com.stripe.android.paymentsheet.rememberViewWidth (PaymentMethodsUI.kt:118)");
        }
        boolean mo89533p = interfaceC32720Et0.mo89533p(f) | interfaceC32720Et0.mo89527r(i);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89533p || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = C43705k61.m29306d(m116595calculateViewWidthD5KLDUw(f, i));
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        float m29298l = ((C43705k61) mo89635G).m29298l();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m29298l;
    }
}

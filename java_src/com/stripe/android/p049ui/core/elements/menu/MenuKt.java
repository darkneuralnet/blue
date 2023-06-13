package com.stripe.android.p049ui.core.elements.menu;

import androidx.compose.p003ui.graphics.C11327b;
import androidx.compose.p003ui.graphics.C11333f;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.F96;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u001aY\u0010\u000f\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a^\u0010\u0019\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\"\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0017\u0010!\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\"\"\u001d\u0010#\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010%\"\u001d\u0010&\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010%\"\u001d\u0010(\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010%\"\u001d\u0010*\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010%\"\u001d\u0010,\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010%\"\u001d\u0010.\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010%\"\u0014\u00100\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00102\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, m28432d2 = {"LKX2;", "", "expandedStates", "LEX2;", "Landroidx/compose/ui/graphics/f;", "transformOriginState", "", "initialFirstVisibleItemIndex", "LgV2;", "modifier", "Lkotlin/Function1;", "Lyo2;", "", "Lkotlin/ExtensionFunctionType;", "content", "DropdownMenuContent", "(LKX2;LEX2;ILgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V", "Lkotlin/Function0;", "onClick", "enabled", "LPD3;", "contentPadding", "LrX2;", "interactionSource", "LZc5;", "DropdownMenuItemContent", "(Lkotlin/jvm/functions/Function0;LgV2;ZLPD3;LrX2;Lkotlin/jvm/functions/Function3;LEt0;II)V", "LD52;", "parentBounds", "menuBounds", "calculateTransformOrigin", "(LD52;LD52;)J", "Lk61;", "MenuElevation", "F", "MenuVerticalMargin", "getMenuVerticalMargin", "()F", "DropdownMenuItemHorizontalPadding", "getDropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "getDropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "getDropdownMenuItemDefaultMaxWidth", "DropdownMenuItemDefaultMinHeight", "getDropdownMenuItemDefaultMinHeight", "InTransitionDuration", "I", "OutTransitionDuration", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\ncom/stripe/android/ui/core/elements/menu/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,317:1\n926#2:318\n844#2,5:319\n926#2:324\n844#2,5:325\n174#3:330\n154#3:387\n154#3:388\n154#3:389\n154#3:390\n154#3:391\n154#3:392\n154#3:393\n67#4,3:331\n66#4:334\n460#4,13:366\n473#4,3:380\n1057#5,6:335\n1057#5,6:341\n75#6,6:347\n81#6:379\n85#6:384\n75#7:353\n76#7,11:355\n89#7:383\n76#8:354\n76#9:385\n76#9:386\n*S KotlinDebug\n*F\n+ 1 Menu.kt\ncom/stripe/android/ui/core/elements/menu/MenuKt\n*L\n79#1:318\n79#1:319,5\n106#1:324\n106#1:325,5\n130#1:330\n206#1:387\n207#1:388\n208#1:389\n209#1:390\n210#1:391\n211#1:392\n212#1:393\n133#1:331,3\n133#1:334\n164#1:366,13\n164#1:380,3\n133#1:335,6\n160#1:341,6\n164#1:347,6\n164#1:379\n164#1:384\n164#1:353\n164#1:355,11\n164#1:383\n164#1:354\n79#1:385\n106#1:386\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.menu.MenuKt */
/* loaded from: classes7.dex */
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMinHeight;
    private static final float DropdownMenuVerticalPadding;
    public static final int InTransitionDuration = 120;
    private static final float MenuElevation;
    private static final float MenuVerticalMargin;
    public static final int OutTransitionDuration = 75;
    private static final float DropdownMenuItemHorizontalPadding = C43705k61.m29303g(16);
    private static final float DropdownMenuItemDefaultMinWidth = C43705k61.m29303g(112);
    private static final float DropdownMenuItemDefaultMaxWidth = C43705k61.m29303g(280);

    static {
        float f = 8;
        MenuElevation = C43705k61.m29303g(f);
        float f2 = 48;
        MenuVerticalMargin = C43705k61.m29303g(f2);
        DropdownMenuVerticalPadding = C43705k61.m29303g(f);
        DropdownMenuItemDefaultMinHeight = C43705k61.m29303g(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuContent(KX2<Boolean> expandedStates, EX2<C11333f> transformOriginState, int i, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super InterfaceC52420yo2, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        int i8;
        int i9;
        int i10;
        InterfaceC41563gV2.C20912a c20912a;
        boolean booleanValue;
        float f;
        boolean booleanValue2;
        boolean booleanValue3;
        int i11;
        float f2;
        boolean booleanValue4;
        boolean mo89539n;
        Object mo89635G;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(expandedStates, "expandedStates");
        Intrinsics.checkNotNullParameter(transformOriginState, "transformOriginState");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(375313548);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (mo89518u.mo89539n(expandedStates)) {
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
            if (mo89518u.mo89539n(transformOriginState)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (mo89518u.mo89527r(i)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                if (mo89518u.mo89539n(content)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i4 |= i9;
            }
            i10 = i4;
            if ((46811 & i10) != 9362 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
            } else {
                if (i12 == 0) {
                    c20912a = InterfaceC41563gV2.f82354b0;
                } else {
                    c20912a = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(375313548, i10, -1, "com.stripe.android.ui.core.elements.menu.DropdownMenuContent (Menu.kt:68)");
                }
                F96 m101072d = J96.m101072d(expandedStates, "DropDownMenu", mo89518u, KX2.f19719d | 48 | (i10 & 14), 0);
                MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = MenuKt$DropdownMenuContent$scale$2.INSTANCE;
                mo89518u.mo89638F(1399891485);
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                InterfaceC51108wb6<Float, C28366sf> m76516i = C37082Xj6.m76516i(floatCompanionObject);
                mo89518u.mo89638F(1847725064);
                booleanValue = ((Boolean) m101072d.m107535g()).booleanValue();
                mo89518u.mo89638F(-571980816);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-571980816, 0, -1, "com.stripe.android.ui.core.elements.menu.DropdownMenuContent.<anonymous> (Menu.kt:95)");
                }
                float f3 = 0.8f;
                float f4 = 1.0f;
                if (!booleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                mo89518u.mo89605Q();
                Float valueOf = Float.valueOf(f);
                booleanValue2 = ((Boolean) m101072d.m107529m()).booleanValue();
                mo89518u.mo89638F(-571980816);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-571980816, 0, -1, "com.stripe.android.ui.core.elements.menu.DropdownMenuContent.<anonymous> (Menu.kt:95)");
                }
                if (booleanValue2) {
                    f3 = 1.0f;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                mo89518u.mo89605Q();
                InterfaceC41563gV2 interfaceC41563gV22 = c20912a;
                InterfaceC48627sP5 m101073c = J96.m101073c(m101072d, valueOf, Float.valueOf(f3), menuKt$DropdownMenuContent$scale$2.invoke((MenuKt$DropdownMenuContent$scale$2) m101072d.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i, "menu-scale", mo89518u, ImageMetadata.EDGE_MODE);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = MenuKt$DropdownMenuContent$alpha$2.INSTANCE;
                mo89518u.mo89638F(1399891485);
                InterfaceC51108wb6<Float, C28366sf> m76516i2 = C37082Xj6.m76516i(floatCompanionObject);
                mo89518u.mo89638F(1847725064);
                booleanValue3 = ((Boolean) m101072d.m107535g()).booleanValue();
                mo89518u.mo89638F(-1020629156);
                if (!C35528Qt0.m87827O()) {
                    i11 = 0;
                    C35528Qt0.m87816Z(-1020629156, 0, -1, "com.stripe.android.ui.core.elements.menu.DropdownMenuContent.<anonymous> (Menu.kt:116)");
                } else {
                    i11 = 0;
                }
                if (!booleanValue3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                mo89518u.mo89605Q();
                Float valueOf2 = Float.valueOf(f2);
                booleanValue4 = ((Boolean) m101072d.m107529m()).booleanValue();
                mo89518u.mo89638F(-1020629156);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1020629156, i11, -1, "com.stripe.android.ui.core.elements.menu.DropdownMenuContent.<anonymous> (Menu.kt:116)");
                }
                if (!booleanValue4) {
                    f4 = 0.0f;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                mo89518u.mo89605Q();
                InterfaceC48627sP5 m101073c2 = J96.m101073c(m101072d, valueOf2, Float.valueOf(f4), menuKt$DropdownMenuContent$alpha$2.invoke((MenuKt$DropdownMenuContent$alpha$2) m101072d.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) Integer.valueOf(i11)), m76516i2, "menu-alpha", mo89518u, ImageMetadata.EDGE_MODE);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                TM2 tm2 = TM2.f35372a;
                int i13 = TM2.f35373b;
                C20064eZ m41178a = C20466fZ.m41178a(C43705k61.m29303g(StripeThemeKt.getStripeShapes(tm2, mo89518u, i13).getBorderStrokeWidth()), StripeThemeKt.getStripeColors(tm2, mo89518u, i13).m116696getComponentBorder0d7_KjU());
                InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
                mo89518u.mo89638F(1618982084);
                mo89539n = mo89518u.mo89539n(m101073c) | mo89518u.mo89539n(m101073c2) | mo89518u.mo89539n(transformOriginState);
                mo89635G = mo89518u.mo89635G();
                if (!mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new MenuKt$DropdownMenuContent$1$1(transformOriginState, m101073c, m101073c2);
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                C35168Pf0.m90018a(C11327b.m68714a(c20912a2, (Function1) mo89635G), null, 0L, 0L, m41178a, MenuElevation, C43575jt0.m29791b(mo89518u, 1322882799, true, new MenuKt$DropdownMenuContent$2(i, i10, interfaceC41563gV22, content)), mo89518u, 1769472, 14);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                obj = interfaceC41563gV22;
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new MenuKt$DropdownMenuContent$3(expandedStates, transformOriginState, i, obj, content, i2, i3));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        if ((i3 & 16) == 0) {
        }
        i10 = i4;
        if ((46811 & i10) != 9362) {
        }
        if (i12 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        F96 m101072d2 = J96.m101072d(expandedStates, "DropDownMenu", mo89518u, KX2.f19719d | 48 | (i10 & 14), 0);
        MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$22 = MenuKt$DropdownMenuContent$scale$2.INSTANCE;
        mo89518u.mo89638F(1399891485);
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        InterfaceC51108wb6<Float, C28366sf> m76516i3 = C37082Xj6.m76516i(floatCompanionObject2);
        mo89518u.mo89638F(1847725064);
        booleanValue = ((Boolean) m101072d2.m107535g()).booleanValue();
        mo89518u.mo89638F(-571980816);
        if (C35528Qt0.m87827O()) {
        }
        float f32 = 0.8f;
        float f42 = 1.0f;
        if (!booleanValue) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89605Q();
        Float valueOf3 = Float.valueOf(f);
        booleanValue2 = ((Boolean) m101072d2.m107529m()).booleanValue();
        mo89518u.mo89638F(-571980816);
        if (C35528Qt0.m87827O()) {
        }
        if (booleanValue2) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89605Q();
        InterfaceC41563gV2 interfaceC41563gV222 = c20912a;
        InterfaceC48627sP5 m101073c3 = J96.m101073c(m101072d2, valueOf3, Float.valueOf(f32), menuKt$DropdownMenuContent$scale$22.invoke((MenuKt$DropdownMenuContent$scale$2) m101072d2.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) 0), m76516i3, "menu-scale", mo89518u, ImageMetadata.EDGE_MODE);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$22 = MenuKt$DropdownMenuContent$alpha$2.INSTANCE;
        mo89518u.mo89638F(1399891485);
        InterfaceC51108wb6<Float, C28366sf> m76516i22 = C37082Xj6.m76516i(floatCompanionObject2);
        mo89518u.mo89638F(1847725064);
        booleanValue3 = ((Boolean) m101072d2.m107535g()).booleanValue();
        mo89518u.mo89638F(-1020629156);
        if (!C35528Qt0.m87827O()) {
        }
        if (!booleanValue3) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89605Q();
        Float valueOf22 = Float.valueOf(f2);
        booleanValue4 = ((Boolean) m101072d2.m107529m()).booleanValue();
        mo89518u.mo89638F(-1020629156);
        if (C35528Qt0.m87827O()) {
        }
        if (!booleanValue4) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89605Q();
        InterfaceC48627sP5 m101073c22 = J96.m101073c(m101072d2, valueOf22, Float.valueOf(f42), menuKt$DropdownMenuContent$alpha$22.invoke((MenuKt$DropdownMenuContent$alpha$2) m101072d2.m107531k(), (F96.InterfaceC2189b) mo89518u, (InterfaceC32720Et0) Integer.valueOf(i11)), m76516i22, "menu-alpha", mo89518u, ImageMetadata.EDGE_MODE);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        TM2 tm22 = TM2.f35372a;
        int i132 = TM2.f35373b;
        C20064eZ m41178a2 = C20466fZ.m41178a(C43705k61.m29303g(StripeThemeKt.getStripeShapes(tm22, mo89518u, i132).getBorderStrokeWidth()), StripeThemeKt.getStripeColors(tm22, mo89518u, i132).m116696getComponentBorder0d7_KjU());
        InterfaceC41563gV2.C20912a c20912a22 = InterfaceC41563gV2.f82354b0;
        mo89518u.mo89638F(1618982084);
        mo89539n = mo89518u.mo89539n(m101073c3) | mo89518u.mo89539n(m101073c22) | mo89518u.mo89539n(transformOriginState);
        mo89635G = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G = new MenuKt$DropdownMenuContent$1$1(transformOriginState, m101073c3, m101073c22);
        mo89518u.mo89503z(mo89635G);
        mo89518u.mo89605Q();
        C35168Pf0.m90018a(C11327b.m68714a(c20912a22, (Function1) mo89635G), null, 0L, 0L, m41178a2, MenuElevation, C43575jt0.m29791b(mo89518u, 1322882799, true, new MenuKt$DropdownMenuContent$2(i, i10, interfaceC41563gV222, content)), mo89518u, 1769472, 14);
        if (C35528Qt0.m87827O()) {
        }
        obj = interfaceC41563gV222;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$1(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$3(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItemContent(Function0<Unit> onClick, InterfaceC41563gV2 interfaceC41563gV2, boolean z, PD3 pd3, InterfaceC48104rX2 interfaceC48104rX2, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        Object obj2;
        int i9;
        int i10;
        Object obj3;
        int i11;
        int i12;
        int i13;
        InterfaceC41563gV2.C20912a c20912a;
        boolean z3;
        PD3 pd32;
        InterfaceC48104rX2 interfaceC48104rX22;
        InterfaceC41563gV2 interfaceC41563gV22;
        boolean z4;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1126462477);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(onClick)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                if (mo89518u.mo89536o(z2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                i8 = i2 & 8;
                if (i8 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    obj2 = pd3;
                    if (mo89518u.mo89539n(obj2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i3 |= i9;
                    i10 = i2 & 16;
                    if (i10 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        obj3 = interfaceC48104rX2;
                        if (mo89518u.mo89539n(obj3)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i3 |= i11;
                        if ((i2 & 32) != 0) {
                            i12 = ImageMetadata.EDGE_MODE;
                        } else {
                            if ((458752 & i) == 0) {
                                if (mo89518u.mo89539n(content)) {
                                    i12 = DateUtils.FORMAT_NUMERIC_DATE;
                                } else {
                                    i12 = 65536;
                                }
                            }
                            i13 = i3;
                            if ((374491 & i13) != 74898 && mo89518u.mo89575b()) {
                                mo89518u.mo89548k();
                                interfaceC41563gV22 = obj;
                                z4 = z2;
                                pd32 = obj2;
                                interfaceC48104rX22 = obj3;
                            } else {
                                if (i14 == 0) {
                                    c20912a = InterfaceC41563gV2.f82354b0;
                                } else {
                                    c20912a = obj;
                                }
                                if (i6 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    obj2 = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                }
                                if (i10 != 0) {
                                    Object mo89635G = mo89518u.mo89635G();
                                    if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                        mo89635G = C40741f62.m42091a();
                                        mo89518u.mo89503z(mo89635G);
                                    }
                                    obj3 = (InterfaceC48104rX2) mo89635G;
                                }
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(-1126462477, i13, -1, "com.stripe.android.ui.core.elements.menu.DropdownMenuItemContent (Menu.kt:154)");
                                }
                                PD3 pd33 = obj2;
                                InterfaceC41563gV2 m114255n = BB5.m114255n(C38131ak0.m70816c(c20912a, obj3, C51107wb5.m6605e(true, 0.0f, 0L, mo89518u, 6, 6), z3, null, null, onClick, 24, null), 0.0f, 1, null);
                                float f = DropdownMenuItemDefaultMaxWidth;
                                InterfaceC41563gV2 m94185h = ND3.m94185h(BB5.m114243z(m114255n, f, DropdownMenuItemDefaultMinHeight, f, 0.0f, 8, null), pd33);
                                InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
                                mo89518u.mo89638F(693286680);
                                InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, mo89518u, 48);
                                mo89518u.mo89638F(-1323940314);
                                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94185h);
                                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                                    C52468yt0.m2335c();
                                }
                                mo89518u.mo89557h();
                                if (!mo89518u.mo89521t()) {
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
                                mo89518u.mo89638F(517105167);
                                C38909c26.m62004a(TM2.f35372a.m83729c(mo89518u, TM2.f35373b).m104957k(), C43575jt0.m29791b(mo89518u, -1663902978, true, new MenuKt$DropdownMenuItemContent$2$1(z3, content, c38066ad5, 6, i13)), mo89518u, 48);
                                mo89518u.mo89605Q();
                                mo89518u.mo89605Q();
                                mo89518u.mo89605Q();
                                mo89518u.mo89563f();
                                mo89518u.mo89605Q();
                                mo89518u.mo89605Q();
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                pd32 = pd33;
                                interfaceC48104rX22 = obj3;
                                interfaceC41563gV22 = c20912a;
                                z4 = z3;
                            }
                            mo89512w = mo89518u.mo89512w();
                            if (mo89512w == null) {
                                mo89512w.mo20405a(new MenuKt$DropdownMenuItemContent$3(onClick, interfaceC41563gV22, z4, pd32, interfaceC48104rX22, content, i, i2));
                                return;
                            }
                            return;
                        }
                        i3 |= i12;
                        i13 = i3;
                        if ((374491 & i13) != 74898) {
                        }
                        if (i14 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (C35528Qt0.m87827O()) {
                        }
                        PD3 pd332 = obj2;
                        InterfaceC41563gV2 m114255n2 = BB5.m114255n(C38131ak0.m70816c(c20912a, obj3, C51107wb5.m6605e(true, 0.0f, 0L, mo89518u, 6, 6), z3, null, null, onClick, 24, null), 0.0f, 1, null);
                        float f2 = DropdownMenuItemDefaultMaxWidth;
                        InterfaceC41563gV2 m94185h2 = ND3.m94185h(BB5.m114243z(m114255n2, f2, DropdownMenuItemDefaultMinHeight, f2, 0.0f, 8, null), pd332);
                        InterfaceC4360K9.InterfaceC4363c m99138h2 = InterfaceC4360K9.f19170a.m99138h();
                        mo89518u.mo89638F(693286680);
                        InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h2, mo89518u, 48);
                        mo89518u.mo89638F(-1323940314);
                        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
                        Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
                        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94185h2);
                        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                        }
                        mo89518u.mo89557h();
                        if (!mo89518u.mo89521t()) {
                        }
                        mo89518u.mo89620L();
                        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
                        C38680bf6.m64191b(m64192a2, m74813a2, c0757a2.m113412d());
                        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
                        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
                        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
                        mo89518u.mo89530q();
                        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                        mo89518u.mo89638F(2058660585);
                        mo89518u.mo89638F(-678309503);
                        C38066ad5 c38066ad52 = C38066ad5.f50835a;
                        mo89518u.mo89638F(517105167);
                        C38909c26.m62004a(TM2.f35372a.m83729c(mo89518u, TM2.f35373b).m104957k(), C43575jt0.m29791b(mo89518u, -1663902978, true, new MenuKt$DropdownMenuItemContent$2$1(z3, content, c38066ad52, 6, i13)), mo89518u, 48);
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        mo89518u.mo89563f();
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        if (C35528Qt0.m87827O()) {
                        }
                        pd32 = pd332;
                        interfaceC48104rX22 = obj3;
                        interfaceC41563gV22 = c20912a;
                        z4 = z3;
                        mo89512w = mo89518u.mo89512w();
                        if (mo89512w == null) {
                        }
                    }
                    obj3 = interfaceC48104rX2;
                    if ((i2 & 32) != 0) {
                    }
                    i3 |= i12;
                    i13 = i3;
                    if ((374491 & i13) != 74898) {
                    }
                    if (i14 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    PD3 pd3322 = obj2;
                    InterfaceC41563gV2 m114255n22 = BB5.m114255n(C38131ak0.m70816c(c20912a, obj3, C51107wb5.m6605e(true, 0.0f, 0L, mo89518u, 6, 6), z3, null, null, onClick, 24, null), 0.0f, 1, null);
                    float f22 = DropdownMenuItemDefaultMaxWidth;
                    InterfaceC41563gV2 m94185h22 = ND3.m94185h(BB5.m114243z(m114255n22, f22, DropdownMenuItemDefaultMinHeight, f22, 0.0f, 8, null), pd3322);
                    InterfaceC4360K9.InterfaceC4363c m99138h22 = InterfaceC4360K9.f19170a.m99138h();
                    mo89518u.mo89638F(693286680);
                    InterfaceC51579xO2 m74813a22 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h22, mo89518u, 48);
                    mo89518u.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a22 = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a22 = c0757a22.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(m94185h22);
                    if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    }
                    mo89518u.mo89557h();
                    if (!mo89518u.mo89521t()) {
                    }
                    mo89518u.mo89620L();
                    InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
                    C38680bf6.m64191b(m64192a22, m74813a22, c0757a22.m113412d());
                    C38680bf6.m64191b(m64192a22, interfaceC41273g0122, c0757a22.m113414b());
                    C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a22.m113413c());
                    C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a22.m113410f());
                    mo89518u.mo89530q();
                    m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                    mo89518u.mo89638F(2058660585);
                    mo89518u.mo89638F(-678309503);
                    C38066ad5 c38066ad522 = C38066ad5.f50835a;
                    mo89518u.mo89638F(517105167);
                    C38909c26.m62004a(TM2.f35372a.m83729c(mo89518u, TM2.f35373b).m104957k(), C43575jt0.m29791b(mo89518u, -1663902978, true, new MenuKt$DropdownMenuItemContent$2$1(z3, content, c38066ad522, 6, i13)), mo89518u, 48);
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    mo89518u.mo89563f();
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                    }
                    pd32 = pd3322;
                    interfaceC48104rX22 = obj3;
                    interfaceC41563gV22 = c20912a;
                    z4 = z3;
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                obj2 = pd3;
                i10 = i2 & 16;
                if (i10 == 0) {
                }
                obj3 = interfaceC48104rX2;
                if ((i2 & 32) != 0) {
                }
                i3 |= i12;
                i13 = i3;
                if ((374491 & i13) != 74898) {
                }
                if (i14 == 0) {
                }
                if (i6 == 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                PD3 pd33222 = obj2;
                InterfaceC41563gV2 m114255n222 = BB5.m114255n(C38131ak0.m70816c(c20912a, obj3, C51107wb5.m6605e(true, 0.0f, 0L, mo89518u, 6, 6), z3, null, null, onClick, 24, null), 0.0f, 1, null);
                float f222 = DropdownMenuItemDefaultMaxWidth;
                InterfaceC41563gV2 m94185h222 = ND3.m94185h(BB5.m114243z(m114255n222, f222, DropdownMenuItemDefaultMinHeight, f222, 0.0f, 8, null), pd33222);
                InterfaceC4360K9.InterfaceC4363c m99138h222 = InterfaceC4360K9.f19170a.m99138h();
                mo89518u.mo89638F(693286680);
                InterfaceC51579xO2 m74813a222 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h222, mo89518u, 48);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6222 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a222 = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a222 = c0757a222.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a222 = C31723Am2.m115273a(m94185h222);
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                }
                mo89518u.mo89557h();
                if (!mo89518u.mo89521t()) {
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a222 = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a222, m74813a222, c0757a222.m113412d());
                C38680bf6.m64191b(m64192a222, interfaceC41273g01222, c0757a222.m113414b());
                C38680bf6.m64191b(m64192a222, enumC47065pm2222, c0757a222.m113413c());
                C38680bf6.m64191b(m64192a222, interfaceC33869Jq6222, c0757a222.m113410f());
                mo89518u.mo89530q();
                m115273a222.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-678309503);
                C38066ad5 c38066ad5222 = C38066ad5.f50835a;
                mo89518u.mo89638F(517105167);
                C38909c26.m62004a(TM2.f35372a.m83729c(mo89518u, TM2.f35373b).m104957k(), C43575jt0.m29791b(mo89518u, -1663902978, true, new MenuKt$DropdownMenuItemContent$2$1(z3, content, c38066ad5222, 6, i13)), mo89518u, 48);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                if (C35528Qt0.m87827O()) {
                }
                pd32 = pd33222;
                interfaceC48104rX22 = obj3;
                interfaceC41563gV22 = c20912a;
                z4 = z3;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                }
            }
            z2 = z;
            i8 = i2 & 8;
            if (i8 != 0) {
            }
            obj2 = pd3;
            i10 = i2 & 16;
            if (i10 == 0) {
            }
            obj3 = interfaceC48104rX2;
            if ((i2 & 32) != 0) {
            }
            i3 |= i12;
            i13 = i3;
            if ((374491 & i13) != 74898) {
            }
            if (i14 == 0) {
            }
            if (i6 == 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            PD3 pd332222 = obj2;
            InterfaceC41563gV2 m114255n2222 = BB5.m114255n(C38131ak0.m70816c(c20912a, obj3, C51107wb5.m6605e(true, 0.0f, 0L, mo89518u, 6, 6), z3, null, null, onClick, 24, null), 0.0f, 1, null);
            float f2222 = DropdownMenuItemDefaultMaxWidth;
            InterfaceC41563gV2 m94185h2222 = ND3.m94185h(BB5.m114243z(m114255n2222, f2222, DropdownMenuItemDefaultMinHeight, f2222, 0.0f, 8, null), pd332222);
            InterfaceC4360K9.InterfaceC4363c m99138h2222 = InterfaceC4360K9.f19170a.m99138h();
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a2222 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h2222, mo89518u, 48);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62222 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a2222 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a2222 = c0757a2222.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2222 = C31723Am2.m115273a(m94185h2222);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            }
            mo89518u.mo89557h();
            if (!mo89518u.mo89521t()) {
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2222 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2222, m74813a2222, c0757a2222.m113412d());
            C38680bf6.m64191b(m64192a2222, interfaceC41273g012222, c0757a2222.m113414b());
            C38680bf6.m64191b(m64192a2222, enumC47065pm22222, c0757a2222.m113413c());
            C38680bf6.m64191b(m64192a2222, interfaceC33869Jq62222, c0757a2222.m113410f());
            mo89518u.mo89530q();
            m115273a2222.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            C38066ad5 c38066ad52222 = C38066ad5.f50835a;
            mo89518u.mo89638F(517105167);
            C38909c26.m62004a(TM2.f35372a.m83729c(mo89518u, TM2.f35373b).m104957k(), C43575jt0.m29791b(mo89518u, -1663902978, true, new MenuKt$DropdownMenuItemContent$2$1(z3, content, c38066ad52222, 6, i13)), mo89518u, 48);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
            pd32 = pd332222;
            interfaceC48104rX22 = obj3;
            interfaceC41563gV22 = c20912a;
            z4 = z3;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        obj = interfaceC41563gV2;
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        z2 = z;
        i8 = i2 & 8;
        if (i8 != 0) {
        }
        obj2 = pd3;
        i10 = i2 & 16;
        if (i10 == 0) {
        }
        obj3 = interfaceC48104rX2;
        if ((i2 & 32) != 0) {
        }
        i3 |= i12;
        i13 = i3;
        if ((374491 & i13) != 74898) {
        }
        if (i14 == 0) {
        }
        if (i6 == 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        PD3 pd3322222 = obj2;
        InterfaceC41563gV2 m114255n22222 = BB5.m114255n(C38131ak0.m70816c(c20912a, obj3, C51107wb5.m6605e(true, 0.0f, 0L, mo89518u, 6, 6), z3, null, null, onClick, 24, null), 0.0f, 1, null);
        float f22222 = DropdownMenuItemDefaultMaxWidth;
        InterfaceC41563gV2 m94185h22222 = ND3.m94185h(BB5.m114243z(m114255n22222, f22222, DropdownMenuItemDefaultMinHeight, f22222, 0.0f, 8, null), pd3322222);
        InterfaceC4360K9.InterfaceC4363c m99138h22222 = InterfaceC4360K9.f19170a.m99138h();
        mo89518u.mo89638F(693286680);
        InterfaceC51579xO2 m74813a22222 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h22222, mo89518u, 48);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g0122222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm222222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq622222 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a22222 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a22222 = c0757a22222.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22222 = C31723Am2.m115273a(m94185h22222);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a22222 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a22222, m74813a22222, c0757a22222.m113412d());
        C38680bf6.m64191b(m64192a22222, interfaceC41273g0122222, c0757a22222.m113414b());
        C38680bf6.m64191b(m64192a22222, enumC47065pm222222, c0757a22222.m113413c());
        C38680bf6.m64191b(m64192a22222, interfaceC33869Jq622222, c0757a22222.m113410f());
        mo89518u.mo89530q();
        m115273a22222.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        C38066ad5 c38066ad522222 = C38066ad5.f50835a;
        mo89518u.mo89638F(517105167);
        C38909c26.m62004a(TM2.f35372a.m83729c(mo89518u, TM2.f35373b).m104957k(), C43575jt0.m29791b(mo89518u, -1663902978, true, new MenuKt$DropdownMenuItemContent$2$1(z3, content, c38066ad522222, 6, i13)), mo89518u, 48);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        pd32 = pd3322222;
        interfaceC48104rX22 = obj3;
        interfaceC41563gV22 = c20912a;
        z4 = z3;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long calculateTransformOrigin(D52 parentBounds, D52 menuBounds) {
        float max;
        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
        float f = 1.0f;
        if (menuBounds.m110922c() < parentBounds.m110921d()) {
            if (menuBounds.m110921d() <= parentBounds.m110922c()) {
                max = 1.0f;
            } else if (menuBounds.m110919f() != 0) {
                max = (((Math.max(parentBounds.m110922c(), menuBounds.m110922c()) + Math.min(parentBounds.m110921d(), menuBounds.m110921d())) / 2) - menuBounds.m110922c()) / menuBounds.m110919f();
            }
            if (menuBounds.m110920e() < parentBounds.m110924a()) {
                if (menuBounds.m110924a() > parentBounds.m110920e()) {
                    if (menuBounds.m110923b() != 0) {
                        f = (((Math.max(parentBounds.m110920e(), menuBounds.m110920e()) + Math.min(parentBounds.m110924a(), menuBounds.m110924a())) / 2) - menuBounds.m110920e()) / menuBounds.m110923b();
                    }
                }
                return C45519n96.m24273a(max, f);
            }
            f = 0.0f;
            return C45519n96.m24273a(max, f);
        }
        max = 0.0f;
        if (menuBounds.m110920e() < parentBounds.m110924a()) {
        }
        f = 0.0f;
        return C45519n96.m24273a(max, f);
    }

    public static final float getDropdownMenuItemDefaultMaxWidth() {
        return DropdownMenuItemDefaultMaxWidth;
    }

    public static final float getDropdownMenuItemDefaultMinHeight() {
        return DropdownMenuItemDefaultMinHeight;
    }

    public static final float getDropdownMenuItemDefaultMinWidth() {
        return DropdownMenuItemDefaultMinWidth;
    }

    public static final float getDropdownMenuItemHorizontalPadding() {
        return DropdownMenuItemHorizontalPadding;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}

package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.C11298b;
import androidx.compose.p003ui.focus.C11299c;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C47063pm0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0002\u001a[\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ac\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u001d\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010!\u001a\u00020 2\b\b\u0002\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\bH\u0001¢\u0006\u0004\b$\u0010%\",\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00000&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, m28432d2 = {"Lkotlin/Function1;", "", "", "defaultAutofillEventReporter", "Lcom/stripe/android/uicore/elements/TextFieldController;", "textFieldController", "LFY1;", "imeAction", "", "enabled", "LgV2;", "modifier", "", "sectionTitle", "Lcom/stripe/android/uicore/elements/TextFieldState;", "onTextStateChanged", "TextFieldSection-uGujYS0", "(Lcom/stripe/android/uicore/elements/TextFieldController;IZLgV2;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;LEt0;II)V", "TextFieldSection", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "TextField-ndPIYpw", "(Lcom/stripe/android/uicore/elements/TextFieldController;ZILgV2;Lkotlin/jvm/functions/Function1;IILEt0;II)V", "TextField", "", "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;", "icons", "loading", "AnimatedIcons", "(Ljava/util/List;ZLEt0;I)V", "shouldShowError", "Ld16;", "TextFieldColors", "(ZLEt0;II)Ld16;", "trailingIcon", "TrailingIcon", "(Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;ZLEt0;I)V", "LU94;", "LocalAutofillEventReporter", "LU94;", "getLocalAutofillEventReporter", "()LU94;", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldUI.kt\ncom/stripe/android/uicore/elements/TextFieldUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,346:1\n76#2:347\n76#2:348\n76#2:356\n76#2:357\n25#3:349\n36#3:358\n25#3:369\n36#3:380\n36#3:387\n1057#4,6:350\n1057#4,6:359\n1057#4,3:370\n1060#4,3:376\n1057#4,6:381\n1057#4,6:388\n474#5,4:365\n478#5,2:373\n482#5:379\n474#6:375\n76#7:394\n76#7:395\n76#7:396\n76#7:397\n76#7:398\n76#7:399\n76#7:400\n76#7:401\n102#7,2:402\n76#7:404\n76#7:405\n76#7:406\n*S KotlinDebug\n*F\n+ 1 TextFieldUI.kt\ncom/stripe/android/uicore/elements/TextFieldUIKt\n*L\n126#1:347\n148#1:348\n161#1:356\n162#1:357\n150#1:349\n211#1:358\n279#1:369\n330#1:380\n340#1:387\n150#1:350,6\n211#1:359,6\n279#1:370,3\n279#1:376,3\n330#1:381,6\n340#1:388,6\n279#1:365,4\n279#1:373,2\n279#1:379\n279#1:375\n84#1:394\n127#1:395\n128#1:396\n129#1:397\n130#1:398\n131#1:399\n132#1:400\n134#1:401\n134#1:402,2\n136#1:404\n139#1:405\n281#1:406\n*E\n"})
/* loaded from: classes7.dex */
public final class TextFieldUIKt {
    private static final U94<Function1<String, Unit>> LocalAutofillEventReporter = C41806gu0.m37350d(TextFieldUIKt$LocalAutofillEventReporter$1.INSTANCE);

    public static final void AnimatedIcons(List<TextFieldIcon.Trailing> icons, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Object first;
        Intrinsics.checkNotNullParameter(icons, "icons");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2067380269);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2067380269, i, -1, "com.stripe.android.uicore.elements.AnimatedIcons (TextFieldUI.kt:272)");
        }
        if (icons.isEmpty()) {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
                mo89512w.mo20405a(new TextFieldUIKt$AnimatedIcons$1(icons, z, i));
                return;
            }
            return;
        }
        mo89518u.mo89638F(773894976);
        mo89518u.mo89638F(-492369756);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            C42992iu0 c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, mo89518u));
            mo89518u.mo89503z(c42992iu0);
            mo89635G = c42992iu0;
        }
        mo89518u.mo89605Q();
        ZC0 m31665a = ((C42992iu0) mo89635G).m31665a();
        mo89518u.mo89605Q();
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) icons);
        SE0.m85819b(AnimatedIcons$lambda$18(GM5.m105195l(first, new TextFieldUIKt$AnimatedIcons$target$2(m31665a, icons, null), mo89518u, 64)), null, null, C43575jt0.m29791b(mo89518u, -1381873623, true, new TextFieldUIKt$AnimatedIcons$2(z, i)), mo89518u, 3072, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w2 = mo89518u.mo89512w();
        if (mo89512w2 != null) {
            mo89512w2.mo20405a(new TextFieldUIKt$AnimatedIcons$3(icons, z, i));
        }
    }

    private static final TextFieldIcon.Trailing AnimatedIcons$lambda$18(InterfaceC48627sP5<TextFieldIcon.Trailing> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /* renamed from: TextField-ndPIYpw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116750TextFieldndPIYpw(TextFieldController textFieldController, boolean z, int i, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super TextFieldState, Unit> function1, int i2, int i3, InterfaceC32720Et0 interfaceC32720Et0, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        InterfaceC41563gV2.C20912a c20912a;
        int i11;
        int i12;
        TextFieldUIKt$TextField$1 textFieldUIKt$TextField$1;
        int i13;
        int i14;
        int i15;
        int m68802f;
        Function1<? super TextFieldState, Unit> function12;
        int i16;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        boolean mo89539n;
        Object mo89635G2;
        boolean z2;
        Integer TextField_ndPIYpw$lambda$12;
        boolean z3;
        InterfaceC42389ht0 interfaceC42389ht0;
        String TextField_ndPIYpw$lambda$8;
        InterfaceC42389ht0 interfaceC42389ht02;
        TextFieldIcon TextField_ndPIYpw$lambda$4;
        InterfaceC42389ht0 interfaceC42389ht03;
        int i17;
        Function1<? super TextFieldState, Unit> function13;
        InterfaceC41563gV2 interfaceC41563gV22;
        int i18;
        List listOfNotNull;
        InterfaceC36874Wm5 mo89512w;
        int i19;
        int i20;
        Intrinsics.checkNotNullParameter(textFieldController, "textFieldController");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1555546723);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            if (mo89518u.mo89539n(textFieldController)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            if (mo89518u.mo89527r(i)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
            i10 = i5 & 8;
            if (i10 == 0) {
                i6 |= 3072;
            } else if ((i4 & 7168) == 0) {
                c20912a = interfaceC41563gV2;
                if (mo89518u.mo89539n(c20912a)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i6 |= i11;
                i12 = i5 & 16;
                if (i12 != 0) {
                    i6 |= 24576;
                } else if ((57344 & i4) == 0) {
                    textFieldUIKt$TextField$1 = function1;
                    if (mo89518u.mo89539n(textFieldUIKt$TextField$1)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i6 |= i13;
                    if ((458752 & i4) != 0) {
                        if ((i5 & 32) == 0) {
                            i14 = i2;
                            if (mo89518u.mo89527r(i14)) {
                                i20 = DateUtils.FORMAT_NUMERIC_DATE;
                                i6 |= i20;
                            }
                        } else {
                            i14 = i2;
                        }
                        i20 = 65536;
                        i6 |= i20;
                    } else {
                        i14 = i2;
                    }
                    if ((3670016 & i4) != 0) {
                        if ((i5 & 64) == 0) {
                            i15 = i3;
                            if (mo89518u.mo89527r(i15)) {
                                i19 = 1048576;
                                i6 |= i19;
                            }
                        } else {
                            i15 = i3;
                        }
                        i19 = 524288;
                        i6 |= i19;
                    } else {
                        i15 = i3;
                    }
                    if ((i6 & 2995931) != 599186 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV22 = c20912a;
                        function13 = textFieldUIKt$TextField$1;
                        i17 = i14;
                        i18 = i15;
                    } else {
                        mo89518u.mo89626J();
                        if ((i4 & 1) == 0 && !mo89518u.mo89545l()) {
                            mo89518u.mo89548k();
                        } else {
                            if (i10 != 0) {
                                c20912a = InterfaceC41563gV2.f82354b0;
                            }
                            if (i12 != 0) {
                                textFieldUIKt$TextField$1 = TextFieldUIKt$TextField$1.INSTANCE;
                            }
                            if ((i5 & 32) != 0) {
                                i14 = C11299c.f52961b.m68803e();
                            }
                            if ((i5 & 64) != 0) {
                                m68802f = C11299c.f52961b.m68802f();
                                function12 = textFieldUIKt$TextField$1;
                                i16 = i14;
                                mo89518u.mo89650B();
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87816Z(1555546723, i4, -1, "com.stripe.android.uicore.elements.TextField (TextFieldUI.kt:116)");
                                }
                                InterfaceC32037Bv1 interfaceC32037Bv1 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
                                InterfaceC48627sP5 m105206a = GM5.m105206a(textFieldController.getFieldValue(), "", null, mo89518u, 56, 2);
                                InterfaceC48627sP5 m105206a2 = GM5.m105206a(textFieldController.getTrailingIcon(), null, null, mo89518u, 56, 2);
                                InterfaceC32730Eu1<Boolean> visibleError = textFieldController.getVisibleError();
                                Boolean bool = Boolean.FALSE;
                                InterfaceC48627sP5 m105206a3 = GM5.m105206a(visibleError, bool, null, mo89518u, 56, 2);
                                InterfaceC48627sP5 m105206a4 = GM5.m105206a(textFieldController.getLoading(), bool, null, mo89518u, 56, 2);
                                InterfaceC48627sP5 m105206a5 = GM5.m105206a(textFieldController.getContentDescription(), "", null, mo89518u, 56, 2);
                                InterfaceC48627sP5 m105206a6 = GM5.m105206a(textFieldController.getPlaceHolder(), null, null, mo89518u, 56, 2);
                                int i21 = m68802f;
                                EX2 ex2 = (EX2) C35550Qv4.m87571b(new Object[0], null, null, TextFieldUIKt$TextField$hasFocus$2.INSTANCE, mo89518u, 3080, 6);
                                InterfaceC39510d16 TextFieldColors = TextFieldColors(TextField_ndPIYpw$lambda$5(m105206a3), mo89518u, 0, 0);
                                InterfaceC48627sP5 m105206a7 = GM5.m105206a(textFieldController.getFieldState(), TextFieldStateConstants.Error.Blank.INSTANCE, null, mo89518u, 56, 2);
                                InterfaceC48627sP5 m105206a8 = GM5.m105206a(textFieldController.getLabel(), null, null, mo89518u, 56, 2);
                                int i22 = i16;
                                Y91.m75533f(TextField_ndPIYpw$lambda$11(m105206a7), new TextFieldUIKt$TextField$2(interfaceC32037Bv1, i16, m105206a7, ex2, null), mo89518u, 64);
                                Function1 function14 = (Function1) mo89518u.mo89572c(LocalAutofillEventReporter);
                                mo89518u.mo89638F(-492369756);
                                mo89635G = mo89518u.mo89635G();
                                c2012a = InterfaceC32720Et0.f8257a;
                                if (mo89635G == c2012a.m108267a()) {
                                    listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(textFieldController.getAutofillType());
                                    mo89635G = new C6560Pu(listOfNotNull, null, new TextFieldUIKt$TextField$autofillNode$1$1(textFieldController, function14), 2, null);
                                    mo89518u.mo89503z(mo89635G);
                                }
                                mo89518u.mo89605Q();
                                C6560Pu c6560Pu = (C6560Pu) mo89635G;
                                Y91.m75533f(c6560Pu, new TextFieldUIKt$TextField$3((C6975Qu) mo89518u.mo89572c(C42399hu0.m35614e()), c6560Pu, null), mo89518u, 64 | C6560Pu.f29358f);
                                String TextField_ndPIYpw$lambda$3 = TextField_ndPIYpw$lambda$3(m105206a);
                                TextFieldUIKt$TextField$4 textFieldUIKt$TextField$4 = new TextFieldUIKt$TextField$4(textFieldController, function12, m105206a7, m105206a);
                                InterfaceC41563gV2 m68823a = C11298b.m68823a(C36116Tg3.m83186a(C47638qk2.m17172b(BB5.m114255n(c20912a, 0.0f, 1, null), new TextFieldUIKt$TextField$5(interfaceC32037Bv1, i21, m105206a)), new TextFieldUIKt$TextField$6(c6560Pu)), new TextFieldUIKt$TextField$7(textFieldController, (InterfaceC31588zu) mo89518u.mo89572c(C42399hu0.m35615d()), c6560Pu, ex2));
                                mo89518u.mo89638F(1157296644);
                                mo89539n = mo89518u.mo89539n(m105206a5);
                                mo89635G2 = mo89518u.mo89635G();
                                if (!mo89539n || mo89635G2 == c2012a.m108267a()) {
                                    mo89635G2 = new TextFieldUIKt$TextField$8$1(m105206a5);
                                    mo89518u.mo89503z(mo89635G2);
                                }
                                mo89518u.mo89605Q();
                                z2 = false;
                                InterfaceC41563gV2 m40620b = C41198fs5.m40620b(m68823a, false, (Function1) mo89635G2, 1, null);
                                if (z && textFieldController.getEnabled()) {
                                    z2 = true;
                                }
                                TextField_ndPIYpw$lambda$12 = TextField_ndPIYpw$lambda$12(m105206a8);
                                if (TextField_ndPIYpw$lambda$12 != null) {
                                    z3 = true;
                                    interfaceC42389ht0 = C43575jt0.m29791b(mo89518u, 411029665, true, new TextFieldUIKt$TextField$9$1(textFieldController, TextField_ndPIYpw$lambda$12.intValue()));
                                } else {
                                    z3 = true;
                                    interfaceC42389ht0 = null;
                                }
                                TextField_ndPIYpw$lambda$8 = TextField_ndPIYpw$lambda$8(m105206a6);
                                if (TextField_ndPIYpw$lambda$8 != null) {
                                    interfaceC42389ht02 = C43575jt0.m29791b(mo89518u, -1446340848, z3, new TextFieldUIKt$TextField$10$1(TextField_ndPIYpw$lambda$8));
                                } else {
                                    interfaceC42389ht02 = null;
                                }
                                TextField_ndPIYpw$lambda$4 = TextField_ndPIYpw$lambda$4(m105206a2);
                                if (TextField_ndPIYpw$lambda$4 != null) {
                                    interfaceC42389ht03 = C43575jt0.m29791b(mo89518u, 878505101, z3, new TextFieldUIKt$TextField$11$1(TextField_ndPIYpw$lambda$4, m105206a4));
                                } else {
                                    interfaceC42389ht03 = null;
                                }
                                C47218q16.m18303b(TextField_ndPIYpw$lambda$3, textFieldUIKt$TextField$4, m40620b, z2, false, null, interfaceC42389ht0, interfaceC42389ht02, null, interfaceC42389ht03, TextField_ndPIYpw$lambda$5(m105206a3), textFieldController.getVisualTransformation(), new C38736bl2(textFieldController.mo116661getCapitalizationIUNYP9k(), false, textFieldController.mo116662getKeyboardTypePjHm6EE(), i, 2, null), new C37555Zk2(new TextFieldUIKt$TextField$12(interfaceC32037Bv1), null, new TextFieldUIKt$TextField$13(interfaceC32037Bv1, i22), null, null, null, 58, null), true, 0, null, null, TextFieldColors, mo89518u, 0, (C37555Zk2.f49151h << 9) | 24576, 229680);
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                                i17 = i22;
                                function13 = function12;
                                interfaceC41563gV22 = c20912a;
                                i18 = i21;
                            }
                        }
                        function12 = textFieldUIKt$TextField$1;
                        i16 = i14;
                        m68802f = i15;
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                        }
                        InterfaceC32037Bv1 interfaceC32037Bv12 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
                        InterfaceC48627sP5 m105206a9 = GM5.m105206a(textFieldController.getFieldValue(), "", null, mo89518u, 56, 2);
                        InterfaceC48627sP5 m105206a22 = GM5.m105206a(textFieldController.getTrailingIcon(), null, null, mo89518u, 56, 2);
                        InterfaceC32730Eu1<Boolean> visibleError2 = textFieldController.getVisibleError();
                        Boolean bool2 = Boolean.FALSE;
                        InterfaceC48627sP5 m105206a32 = GM5.m105206a(visibleError2, bool2, null, mo89518u, 56, 2);
                        InterfaceC48627sP5 m105206a42 = GM5.m105206a(textFieldController.getLoading(), bool2, null, mo89518u, 56, 2);
                        InterfaceC48627sP5 m105206a52 = GM5.m105206a(textFieldController.getContentDescription(), "", null, mo89518u, 56, 2);
                        InterfaceC48627sP5 m105206a62 = GM5.m105206a(textFieldController.getPlaceHolder(), null, null, mo89518u, 56, 2);
                        int i212 = m68802f;
                        EX2 ex22 = (EX2) C35550Qv4.m87571b(new Object[0], null, null, TextFieldUIKt$TextField$hasFocus$2.INSTANCE, mo89518u, 3080, 6);
                        InterfaceC39510d16 TextFieldColors2 = TextFieldColors(TextField_ndPIYpw$lambda$5(m105206a32), mo89518u, 0, 0);
                        InterfaceC48627sP5 m105206a72 = GM5.m105206a(textFieldController.getFieldState(), TextFieldStateConstants.Error.Blank.INSTANCE, null, mo89518u, 56, 2);
                        InterfaceC48627sP5 m105206a82 = GM5.m105206a(textFieldController.getLabel(), null, null, mo89518u, 56, 2);
                        int i222 = i16;
                        Y91.m75533f(TextField_ndPIYpw$lambda$11(m105206a72), new TextFieldUIKt$TextField$2(interfaceC32037Bv12, i16, m105206a72, ex22, null), mo89518u, 64);
                        Function1 function142 = (Function1) mo89518u.mo89572c(LocalAutofillEventReporter);
                        mo89518u.mo89638F(-492369756);
                        mo89635G = mo89518u.mo89635G();
                        c2012a = InterfaceC32720Et0.f8257a;
                        if (mo89635G == c2012a.m108267a()) {
                        }
                        mo89518u.mo89605Q();
                        C6560Pu c6560Pu2 = (C6560Pu) mo89635G;
                        Y91.m75533f(c6560Pu2, new TextFieldUIKt$TextField$3((C6975Qu) mo89518u.mo89572c(C42399hu0.m35614e()), c6560Pu2, null), mo89518u, 64 | C6560Pu.f29358f);
                        String TextField_ndPIYpw$lambda$32 = TextField_ndPIYpw$lambda$3(m105206a9);
                        TextFieldUIKt$TextField$4 textFieldUIKt$TextField$42 = new TextFieldUIKt$TextField$4(textFieldController, function12, m105206a72, m105206a9);
                        InterfaceC41563gV2 m68823a2 = C11298b.m68823a(C36116Tg3.m83186a(C47638qk2.m17172b(BB5.m114255n(c20912a, 0.0f, 1, null), new TextFieldUIKt$TextField$5(interfaceC32037Bv12, i212, m105206a9)), new TextFieldUIKt$TextField$6(c6560Pu2)), new TextFieldUIKt$TextField$7(textFieldController, (InterfaceC31588zu) mo89518u.mo89572c(C42399hu0.m35615d()), c6560Pu2, ex22));
                        mo89518u.mo89638F(1157296644);
                        mo89539n = mo89518u.mo89539n(m105206a52);
                        mo89635G2 = mo89518u.mo89635G();
                        if (!mo89539n) {
                        }
                        mo89635G2 = new TextFieldUIKt$TextField$8$1(m105206a52);
                        mo89518u.mo89503z(mo89635G2);
                        mo89518u.mo89605Q();
                        z2 = false;
                        InterfaceC41563gV2 m40620b2 = C41198fs5.m40620b(m68823a2, false, (Function1) mo89635G2, 1, null);
                        if (z) {
                            z2 = true;
                        }
                        TextField_ndPIYpw$lambda$12 = TextField_ndPIYpw$lambda$12(m105206a82);
                        if (TextField_ndPIYpw$lambda$12 != null) {
                        }
                        TextField_ndPIYpw$lambda$8 = TextField_ndPIYpw$lambda$8(m105206a62);
                        if (TextField_ndPIYpw$lambda$8 != null) {
                        }
                        TextField_ndPIYpw$lambda$4 = TextField_ndPIYpw$lambda$4(m105206a22);
                        if (TextField_ndPIYpw$lambda$4 != null) {
                        }
                        C47218q16.m18303b(TextField_ndPIYpw$lambda$32, textFieldUIKt$TextField$42, m40620b2, z2, false, null, interfaceC42389ht0, interfaceC42389ht02, null, interfaceC42389ht03, TextField_ndPIYpw$lambda$5(m105206a32), textFieldController.getVisualTransformation(), new C38736bl2(textFieldController.mo116661getCapitalizationIUNYP9k(), false, textFieldController.mo116662getKeyboardTypePjHm6EE(), i, 2, null), new C37555Zk2(new TextFieldUIKt$TextField$12(interfaceC32037Bv12), null, new TextFieldUIKt$TextField$13(interfaceC32037Bv12, i222), null, null, null, 58, null), true, 0, null, null, TextFieldColors2, mo89518u, 0, (C37555Zk2.f49151h << 9) | 24576, 229680);
                        if (C35528Qt0.m87827O()) {
                        }
                        i17 = i222;
                        function13 = function12;
                        interfaceC41563gV22 = c20912a;
                        i18 = i212;
                    }
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                        mo89512w.mo20405a(new TextFieldUIKt$TextField$14(textFieldController, z, i, interfaceC41563gV22, function13, i17, i18, i4, i5));
                        return;
                    }
                    return;
                }
                textFieldUIKt$TextField$1 = function1;
                if ((458752 & i4) != 0) {
                }
                if ((3670016 & i4) != 0) {
                }
                if ((i6 & 2995931) != 599186) {
                }
                mo89518u.mo89626J();
                if ((i4 & 1) == 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i5 & 32) != 0) {
                }
                if ((i5 & 64) != 0) {
                }
                function12 = textFieldUIKt$TextField$1;
                i16 = i14;
                m68802f = i15;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                InterfaceC32037Bv1 interfaceC32037Bv122 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
                InterfaceC48627sP5 m105206a92 = GM5.m105206a(textFieldController.getFieldValue(), "", null, mo89518u, 56, 2);
                InterfaceC48627sP5 m105206a222 = GM5.m105206a(textFieldController.getTrailingIcon(), null, null, mo89518u, 56, 2);
                InterfaceC32730Eu1<Boolean> visibleError22 = textFieldController.getVisibleError();
                Boolean bool22 = Boolean.FALSE;
                InterfaceC48627sP5 m105206a322 = GM5.m105206a(visibleError22, bool22, null, mo89518u, 56, 2);
                InterfaceC48627sP5 m105206a422 = GM5.m105206a(textFieldController.getLoading(), bool22, null, mo89518u, 56, 2);
                InterfaceC48627sP5 m105206a522 = GM5.m105206a(textFieldController.getContentDescription(), "", null, mo89518u, 56, 2);
                InterfaceC48627sP5 m105206a622 = GM5.m105206a(textFieldController.getPlaceHolder(), null, null, mo89518u, 56, 2);
                int i2122 = m68802f;
                EX2 ex222 = (EX2) C35550Qv4.m87571b(new Object[0], null, null, TextFieldUIKt$TextField$hasFocus$2.INSTANCE, mo89518u, 3080, 6);
                InterfaceC39510d16 TextFieldColors22 = TextFieldColors(TextField_ndPIYpw$lambda$5(m105206a322), mo89518u, 0, 0);
                InterfaceC48627sP5 m105206a722 = GM5.m105206a(textFieldController.getFieldState(), TextFieldStateConstants.Error.Blank.INSTANCE, null, mo89518u, 56, 2);
                InterfaceC48627sP5 m105206a822 = GM5.m105206a(textFieldController.getLabel(), null, null, mo89518u, 56, 2);
                int i2222 = i16;
                Y91.m75533f(TextField_ndPIYpw$lambda$11(m105206a722), new TextFieldUIKt$TextField$2(interfaceC32037Bv122, i16, m105206a722, ex222, null), mo89518u, 64);
                Function1 function1422 = (Function1) mo89518u.mo89572c(LocalAutofillEventReporter);
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                c2012a = InterfaceC32720Et0.f8257a;
                if (mo89635G == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                C6560Pu c6560Pu22 = (C6560Pu) mo89635G;
                Y91.m75533f(c6560Pu22, new TextFieldUIKt$TextField$3((C6975Qu) mo89518u.mo89572c(C42399hu0.m35614e()), c6560Pu22, null), mo89518u, 64 | C6560Pu.f29358f);
                String TextField_ndPIYpw$lambda$322 = TextField_ndPIYpw$lambda$3(m105206a92);
                TextFieldUIKt$TextField$4 textFieldUIKt$TextField$422 = new TextFieldUIKt$TextField$4(textFieldController, function12, m105206a722, m105206a92);
                InterfaceC41563gV2 m68823a22 = C11298b.m68823a(C36116Tg3.m83186a(C47638qk2.m17172b(BB5.m114255n(c20912a, 0.0f, 1, null), new TextFieldUIKt$TextField$5(interfaceC32037Bv122, i2122, m105206a92)), new TextFieldUIKt$TextField$6(c6560Pu22)), new TextFieldUIKt$TextField$7(textFieldController, (InterfaceC31588zu) mo89518u.mo89572c(C42399hu0.m35615d()), c6560Pu22, ex222));
                mo89518u.mo89638F(1157296644);
                mo89539n = mo89518u.mo89539n(m105206a522);
                mo89635G2 = mo89518u.mo89635G();
                if (!mo89539n) {
                }
                mo89635G2 = new TextFieldUIKt$TextField$8$1(m105206a522);
                mo89518u.mo89503z(mo89635G2);
                mo89518u.mo89605Q();
                z2 = false;
                InterfaceC41563gV2 m40620b22 = C41198fs5.m40620b(m68823a22, false, (Function1) mo89635G2, 1, null);
                if (z) {
                }
                TextField_ndPIYpw$lambda$12 = TextField_ndPIYpw$lambda$12(m105206a822);
                if (TextField_ndPIYpw$lambda$12 != null) {
                }
                TextField_ndPIYpw$lambda$8 = TextField_ndPIYpw$lambda$8(m105206a622);
                if (TextField_ndPIYpw$lambda$8 != null) {
                }
                TextField_ndPIYpw$lambda$4 = TextField_ndPIYpw$lambda$4(m105206a222);
                if (TextField_ndPIYpw$lambda$4 != null) {
                }
                C47218q16.m18303b(TextField_ndPIYpw$lambda$322, textFieldUIKt$TextField$422, m40620b22, z2, false, null, interfaceC42389ht0, interfaceC42389ht02, null, interfaceC42389ht03, TextField_ndPIYpw$lambda$5(m105206a322), textFieldController.getVisualTransformation(), new C38736bl2(textFieldController.mo116661getCapitalizationIUNYP9k(), false, textFieldController.mo116662getKeyboardTypePjHm6EE(), i, 2, null), new C37555Zk2(new TextFieldUIKt$TextField$12(interfaceC32037Bv122), null, new TextFieldUIKt$TextField$13(interfaceC32037Bv122, i2222), null, null, null, 58, null), true, 0, null, null, TextFieldColors22, mo89518u, 0, (C37555Zk2.f49151h << 9) | 24576, 229680);
                if (C35528Qt0.m87827O()) {
                }
                i17 = i2222;
                function13 = function12;
                interfaceC41563gV22 = c20912a;
                i18 = i2122;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                }
            }
            c20912a = interfaceC41563gV2;
            i12 = i5 & 16;
            if (i12 != 0) {
            }
            textFieldUIKt$TextField$1 = function1;
            if ((458752 & i4) != 0) {
            }
            if ((3670016 & i4) != 0) {
            }
            if ((i6 & 2995931) != 599186) {
            }
            mo89518u.mo89626J();
            if ((i4 & 1) == 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i5 & 32) != 0) {
            }
            if ((i5 & 64) != 0) {
            }
            function12 = textFieldUIKt$TextField$1;
            i16 = i14;
            m68802f = i15;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            InterfaceC32037Bv1 interfaceC32037Bv1222 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
            InterfaceC48627sP5 m105206a922 = GM5.m105206a(textFieldController.getFieldValue(), "", null, mo89518u, 56, 2);
            InterfaceC48627sP5 m105206a2222 = GM5.m105206a(textFieldController.getTrailingIcon(), null, null, mo89518u, 56, 2);
            InterfaceC32730Eu1<Boolean> visibleError222 = textFieldController.getVisibleError();
            Boolean bool222 = Boolean.FALSE;
            InterfaceC48627sP5 m105206a3222 = GM5.m105206a(visibleError222, bool222, null, mo89518u, 56, 2);
            InterfaceC48627sP5 m105206a4222 = GM5.m105206a(textFieldController.getLoading(), bool222, null, mo89518u, 56, 2);
            InterfaceC48627sP5 m105206a5222 = GM5.m105206a(textFieldController.getContentDescription(), "", null, mo89518u, 56, 2);
            InterfaceC48627sP5 m105206a6222 = GM5.m105206a(textFieldController.getPlaceHolder(), null, null, mo89518u, 56, 2);
            int i21222 = m68802f;
            EX2 ex2222 = (EX2) C35550Qv4.m87571b(new Object[0], null, null, TextFieldUIKt$TextField$hasFocus$2.INSTANCE, mo89518u, 3080, 6);
            InterfaceC39510d16 TextFieldColors222 = TextFieldColors(TextField_ndPIYpw$lambda$5(m105206a3222), mo89518u, 0, 0);
            InterfaceC48627sP5 m105206a7222 = GM5.m105206a(textFieldController.getFieldState(), TextFieldStateConstants.Error.Blank.INSTANCE, null, mo89518u, 56, 2);
            InterfaceC48627sP5 m105206a8222 = GM5.m105206a(textFieldController.getLabel(), null, null, mo89518u, 56, 2);
            int i22222 = i16;
            Y91.m75533f(TextField_ndPIYpw$lambda$11(m105206a7222), new TextFieldUIKt$TextField$2(interfaceC32037Bv1222, i16, m105206a7222, ex2222, null), mo89518u, 64);
            Function1 function14222 = (Function1) mo89518u.mo89572c(LocalAutofillEventReporter);
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            C6560Pu c6560Pu222 = (C6560Pu) mo89635G;
            Y91.m75533f(c6560Pu222, new TextFieldUIKt$TextField$3((C6975Qu) mo89518u.mo89572c(C42399hu0.m35614e()), c6560Pu222, null), mo89518u, 64 | C6560Pu.f29358f);
            String TextField_ndPIYpw$lambda$3222 = TextField_ndPIYpw$lambda$3(m105206a922);
            TextFieldUIKt$TextField$4 textFieldUIKt$TextField$4222 = new TextFieldUIKt$TextField$4(textFieldController, function12, m105206a7222, m105206a922);
            InterfaceC41563gV2 m68823a222 = C11298b.m68823a(C36116Tg3.m83186a(C47638qk2.m17172b(BB5.m114255n(c20912a, 0.0f, 1, null), new TextFieldUIKt$TextField$5(interfaceC32037Bv1222, i21222, m105206a922)), new TextFieldUIKt$TextField$6(c6560Pu222)), new TextFieldUIKt$TextField$7(textFieldController, (InterfaceC31588zu) mo89518u.mo89572c(C42399hu0.m35615d()), c6560Pu222, ex2222));
            mo89518u.mo89638F(1157296644);
            mo89539n = mo89518u.mo89539n(m105206a5222);
            mo89635G2 = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G2 = new TextFieldUIKt$TextField$8$1(m105206a5222);
            mo89518u.mo89503z(mo89635G2);
            mo89518u.mo89605Q();
            z2 = false;
            InterfaceC41563gV2 m40620b222 = C41198fs5.m40620b(m68823a222, false, (Function1) mo89635G2, 1, null);
            if (z) {
            }
            TextField_ndPIYpw$lambda$12 = TextField_ndPIYpw$lambda$12(m105206a8222);
            if (TextField_ndPIYpw$lambda$12 != null) {
            }
            TextField_ndPIYpw$lambda$8 = TextField_ndPIYpw$lambda$8(m105206a6222);
            if (TextField_ndPIYpw$lambda$8 != null) {
            }
            TextField_ndPIYpw$lambda$4 = TextField_ndPIYpw$lambda$4(m105206a2222);
            if (TextField_ndPIYpw$lambda$4 != null) {
            }
            C47218q16.m18303b(TextField_ndPIYpw$lambda$3222, textFieldUIKt$TextField$4222, m40620b222, z2, false, null, interfaceC42389ht0, interfaceC42389ht02, null, interfaceC42389ht03, TextField_ndPIYpw$lambda$5(m105206a3222), textFieldController.getVisualTransformation(), new C38736bl2(textFieldController.mo116661getCapitalizationIUNYP9k(), false, textFieldController.mo116662getKeyboardTypePjHm6EE(), i, 2, null), new C37555Zk2(new TextFieldUIKt$TextField$12(interfaceC32037Bv1222), null, new TextFieldUIKt$TextField$13(interfaceC32037Bv1222, i22222), null, null, null, 58, null), true, 0, null, null, TextFieldColors222, mo89518u, 0, (C37555Zk2.f49151h << 9) | 24576, 229680);
            if (C35528Qt0.m87827O()) {
            }
            i17 = i22222;
            function13 = function12;
            interfaceC41563gV22 = c20912a;
            i18 = i21222;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        i10 = i5 & 8;
        if (i10 == 0) {
        }
        c20912a = interfaceC41563gV2;
        i12 = i5 & 16;
        if (i12 != 0) {
        }
        textFieldUIKt$TextField$1 = function1;
        if ((458752 & i4) != 0) {
        }
        if ((3670016 & i4) != 0) {
        }
        if ((i6 & 2995931) != 599186) {
        }
        mo89518u.mo89626J();
        if ((i4 & 1) == 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i5 & 32) != 0) {
        }
        if ((i5 & 64) != 0) {
        }
        function12 = textFieldUIKt$TextField$1;
        i16 = i14;
        m68802f = i15;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        InterfaceC32037Bv1 interfaceC32037Bv12222 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
        InterfaceC48627sP5 m105206a9222 = GM5.m105206a(textFieldController.getFieldValue(), "", null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a22222 = GM5.m105206a(textFieldController.getTrailingIcon(), null, null, mo89518u, 56, 2);
        InterfaceC32730Eu1<Boolean> visibleError2222 = textFieldController.getVisibleError();
        Boolean bool2222 = Boolean.FALSE;
        InterfaceC48627sP5 m105206a32222 = GM5.m105206a(visibleError2222, bool2222, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a42222 = GM5.m105206a(textFieldController.getLoading(), bool2222, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a52222 = GM5.m105206a(textFieldController.getContentDescription(), "", null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a62222 = GM5.m105206a(textFieldController.getPlaceHolder(), null, null, mo89518u, 56, 2);
        int i212222 = m68802f;
        EX2 ex22222 = (EX2) C35550Qv4.m87571b(new Object[0], null, null, TextFieldUIKt$TextField$hasFocus$2.INSTANCE, mo89518u, 3080, 6);
        InterfaceC39510d16 TextFieldColors2222 = TextFieldColors(TextField_ndPIYpw$lambda$5(m105206a32222), mo89518u, 0, 0);
        InterfaceC48627sP5 m105206a72222 = GM5.m105206a(textFieldController.getFieldState(), TextFieldStateConstants.Error.Blank.INSTANCE, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a82222 = GM5.m105206a(textFieldController.getLabel(), null, null, mo89518u, 56, 2);
        int i222222 = i16;
        Y91.m75533f(TextField_ndPIYpw$lambda$11(m105206a72222), new TextFieldUIKt$TextField$2(interfaceC32037Bv12222, i16, m105206a72222, ex22222, null), mo89518u, 64);
        Function1 function142222 = (Function1) mo89518u.mo89572c(LocalAutofillEventReporter);
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        C6560Pu c6560Pu2222 = (C6560Pu) mo89635G;
        Y91.m75533f(c6560Pu2222, new TextFieldUIKt$TextField$3((C6975Qu) mo89518u.mo89572c(C42399hu0.m35614e()), c6560Pu2222, null), mo89518u, 64 | C6560Pu.f29358f);
        String TextField_ndPIYpw$lambda$32222 = TextField_ndPIYpw$lambda$3(m105206a9222);
        TextFieldUIKt$TextField$4 textFieldUIKt$TextField$42222 = new TextFieldUIKt$TextField$4(textFieldController, function12, m105206a72222, m105206a9222);
        InterfaceC41563gV2 m68823a2222 = C11298b.m68823a(C36116Tg3.m83186a(C47638qk2.m17172b(BB5.m114255n(c20912a, 0.0f, 1, null), new TextFieldUIKt$TextField$5(interfaceC32037Bv12222, i212222, m105206a9222)), new TextFieldUIKt$TextField$6(c6560Pu2222)), new TextFieldUIKt$TextField$7(textFieldController, (InterfaceC31588zu) mo89518u.mo89572c(C42399hu0.m35615d()), c6560Pu2222, ex22222));
        mo89518u.mo89638F(1157296644);
        mo89539n = mo89518u.mo89539n(m105206a52222);
        mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G2 = new TextFieldUIKt$TextField$8$1(m105206a52222);
        mo89518u.mo89503z(mo89635G2);
        mo89518u.mo89605Q();
        z2 = false;
        InterfaceC41563gV2 m40620b2222 = C41198fs5.m40620b(m68823a2222, false, (Function1) mo89635G2, 1, null);
        if (z) {
        }
        TextField_ndPIYpw$lambda$12 = TextField_ndPIYpw$lambda$12(m105206a82222);
        if (TextField_ndPIYpw$lambda$12 != null) {
        }
        TextField_ndPIYpw$lambda$8 = TextField_ndPIYpw$lambda$8(m105206a62222);
        if (TextField_ndPIYpw$lambda$8 != null) {
        }
        TextField_ndPIYpw$lambda$4 = TextField_ndPIYpw$lambda$4(m105206a22222);
        if (TextField_ndPIYpw$lambda$4 != null) {
        }
        C47218q16.m18303b(TextField_ndPIYpw$lambda$32222, textFieldUIKt$TextField$42222, m40620b2222, z2, false, null, interfaceC42389ht0, interfaceC42389ht02, null, interfaceC42389ht03, TextField_ndPIYpw$lambda$5(m105206a32222), textFieldController.getVisualTransformation(), new C38736bl2(textFieldController.mo116661getCapitalizationIUNYP9k(), false, textFieldController.mo116662getKeyboardTypePjHm6EE(), i, 2, null), new C37555Zk2(new TextFieldUIKt$TextField$12(interfaceC32037Bv12222), null, new TextFieldUIKt$TextField$13(interfaceC32037Bv12222, i222222), null, null, null, 58, null), true, 0, null, null, TextFieldColors2222, mo89518u, 0, (C37555Zk2.f49151h << 9) | 24576, 229680);
        if (C35528Qt0.m87827O()) {
        }
        i17 = i222222;
        function13 = function12;
        interfaceC41563gV22 = c20912a;
        i18 = i212222;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    public static final InterfaceC39510d16 TextFieldColors(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        boolean z2;
        long m116698getOnComponent0d7_KjU;
        interfaceC32720Et0.mo89638F(-1455690364);
        if ((i2 & 1) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1455690364, i, -1, "com.stripe.android.uicore.elements.TextFieldColors (TextFieldUI.kt:298)");
        }
        C41288g16 c41288g16 = C41288g16.f81350a;
        if (z2) {
            interfaceC32720Et0.mo89638F(-826527164);
            m116698getOnComponent0d7_KjU = TM2.f35372a.m83731a(interfaceC32720Et0, TM2.f35373b).m94906d();
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-826527116);
            m116698getOnComponent0d7_KjU = StripeThemeKt.getStripeColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116698getOnComponent0d7_KjU();
            interfaceC32720Et0.mo89605Q();
        }
        long j = m116698getOnComponent0d7_KjU;
        TM2 tm2 = TM2.f35372a;
        int i3 = TM2.f35373b;
        long m116699getPlaceholderText0d7_KjU = StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i3).m116699getPlaceholderText0d7_KjU();
        long m116699getPlaceholderText0d7_KjU2 = StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i3).m116699getPlaceholderText0d7_KjU();
        long m116699getPlaceholderText0d7_KjU3 = StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i3).m116699getPlaceholderText0d7_KjU();
        long m116695getComponent0d7_KjU = StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i3).m116695getComponent0d7_KjU();
        C47063pm0.C27386a c27386a = C47063pm0.f104050b;
        long m18727f = c27386a.m18727f();
        long m18727f2 = c27386a.m18727f();
        InterfaceC39510d16 m40288l = c41288g16.m40288l(j, 0L, m116695getComponent0d7_KjU, StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i3).m116701getTextCursor0d7_KjU(), 0L, m18727f, c27386a.m18727f(), m18727f2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, m116699getPlaceholderText0d7_KjU2, m116699getPlaceholderText0d7_KjU, 0L, 0L, m116699getPlaceholderText0d7_KjU3, 0L, interfaceC32720Et0, 14352384, 0, 48, 1474322);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m40288l;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0171  */
    /* renamed from: TextFieldSection-uGujYS0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116751TextFieldSectionuGujYS0(TextFieldController textFieldController, int i, boolean z, InterfaceC41563gV2 interfaceC41563gV2, Integer num, Function1<? super TextFieldState, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        int i8;
        int i9;
        Object obj2;
        int i10;
        int i11;
        Object obj3;
        int i12;
        int i13;
        InterfaceC41563gV2.C20912a c20912a;
        Integer num2;
        TextFieldUIKt$TextFieldSection$1 textFieldUIKt$TextFieldSection$1;
        FieldError TextFieldSection_uGujYS0$lambda$0;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV22;
        Function1<? super TextFieldState, Unit> function12;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(textFieldController, "textFieldController");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(510951455);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (mo89518u.mo89539n(textFieldController)) {
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
            if (mo89518u.mo89527r(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (mo89518u.mo89536o(z)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i14 = i3 & 8;
        if (i14 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
            i9 = i3 & 16;
            if (i9 == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                obj2 = num;
                if (mo89518u.mo89539n(obj2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= ImageMetadata.EDGE_MODE;
                } else if ((458752 & i2) == 0) {
                    obj3 = function1;
                    if (mo89518u.mo89539n(obj3)) {
                        i12 = DateUtils.FORMAT_NUMERIC_DATE;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                    i13 = i4;
                    if ((374491 & i13) != 74898 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV22 = obj;
                        function12 = obj3;
                        interfaceC32720Et02 = mo89518u;
                    } else {
                        if (i14 == 0) {
                            c20912a = InterfaceC41563gV2.f82354b0;
                        } else {
                            c20912a = obj;
                        }
                        String str = null;
                        if (i9 == 0) {
                            num2 = null;
                        } else {
                            num2 = obj2;
                        }
                        if (i11 == 0) {
                            textFieldUIKt$TextFieldSection$1 = TextFieldUIKt$TextFieldSection$1.INSTANCE;
                        } else {
                            textFieldUIKt$TextFieldSection$1 = obj3;
                        }
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(510951455, i13, -1, "com.stripe.android.uicore.elements.TextFieldSection (TextFieldUI.kt:75)");
                        }
                        TextFieldSection_uGujYS0$lambda$0 = TextFieldSection_uGujYS0$lambda$0(GM5.m105206a(textFieldController.getError(), null, null, mo89518u, 56, 2));
                        mo89518u.mo89638F(1723875433);
                        if (TextFieldSection_uGujYS0$lambda$0 != null) {
                            Object[] formatArgs = TextFieldSection_uGujYS0$lambda$0.getFormatArgs();
                            mo89518u.mo89638F(1723875462);
                            if (formatArgs != null) {
                                str = C40946fS5.m41309d(TextFieldSection_uGujYS0$lambda$0.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), mo89518u, 64);
                            }
                            mo89518u.mo89605Q();
                            if (str == null) {
                                str = C40946fS5.m41310c(TextFieldSection_uGujYS0$lambda$0.getErrorMessage(), mo89518u, 0);
                            }
                        }
                        mo89518u.mo89605Q();
                        interfaceC32720Et02 = mo89518u;
                        SectionUIKt.Section(num2, str, null, C43575jt0.m29791b(mo89518u, -1407454986, true, new TextFieldUIKt$TextFieldSection$2(textFieldController, z, i, c20912a, textFieldUIKt$TextFieldSection$1, i13)), mo89518u, ((i13 >> 12) & 14) | 3072, 4);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC41563gV22 = c20912a;
                        obj2 = num2;
                        function12 = textFieldUIKt$TextFieldSection$1;
                    }
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w == null) {
                        mo89512w.mo20405a(new TextFieldUIKt$TextFieldSection$3(textFieldController, i, z, interfaceC41563gV22, obj2, function12, i2, i3));
                        return;
                    }
                    return;
                }
                obj3 = function1;
                i13 = i4;
                if ((374491 & i13) != 74898) {
                }
                if (i14 == 0) {
                }
                String str2 = null;
                if (i9 == 0) {
                }
                if (i11 == 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                TextFieldSection_uGujYS0$lambda$0 = TextFieldSection_uGujYS0$lambda$0(GM5.m105206a(textFieldController.getError(), null, null, mo89518u, 56, 2));
                mo89518u.mo89638F(1723875433);
                if (TextFieldSection_uGujYS0$lambda$0 != null) {
                }
                mo89518u.mo89605Q();
                interfaceC32720Et02 = mo89518u;
                SectionUIKt.Section(num2, str2, null, C43575jt0.m29791b(mo89518u, -1407454986, true, new TextFieldUIKt$TextFieldSection$2(textFieldController, z, i, c20912a, textFieldUIKt$TextFieldSection$1, i13)), mo89518u, ((i13 >> 12) & 14) | 3072, 4);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV22 = c20912a;
                obj2 = num2;
                function12 = textFieldUIKt$TextFieldSection$1;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                }
            }
            obj2 = num;
            i11 = i3 & 32;
            if (i11 != 0) {
            }
            obj3 = function1;
            i13 = i4;
            if ((374491 & i13) != 74898) {
            }
            if (i14 == 0) {
            }
            String str22 = null;
            if (i9 == 0) {
            }
            if (i11 == 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            TextFieldSection_uGujYS0$lambda$0 = TextFieldSection_uGujYS0$lambda$0(GM5.m105206a(textFieldController.getError(), null, null, mo89518u, 56, 2));
            mo89518u.mo89638F(1723875433);
            if (TextFieldSection_uGujYS0$lambda$0 != null) {
            }
            mo89518u.mo89605Q();
            interfaceC32720Et02 = mo89518u;
            SectionUIKt.Section(num2, str22, null, C43575jt0.m29791b(mo89518u, -1407454986, true, new TextFieldUIKt$TextFieldSection$2(textFieldController, z, i, c20912a, textFieldUIKt$TextFieldSection$1, i13)), mo89518u, ((i13 >> 12) & 14) | 3072, 4);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV22 = c20912a;
            obj2 = num2;
            function12 = textFieldUIKt$TextFieldSection$1;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        obj = interfaceC41563gV2;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        obj2 = num;
        i11 = i3 & 32;
        if (i11 != 0) {
        }
        obj3 = function1;
        i13 = i4;
        if ((374491 & i13) != 74898) {
        }
        if (i14 == 0) {
        }
        String str222 = null;
        if (i9 == 0) {
        }
        if (i11 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        TextFieldSection_uGujYS0$lambda$0 = TextFieldSection_uGujYS0$lambda$0(GM5.m105206a(textFieldController.getError(), null, null, mo89518u, 56, 2));
        mo89518u.mo89638F(1723875433);
        if (TextFieldSection_uGujYS0$lambda$0 != null) {
        }
        mo89518u.mo89605Q();
        interfaceC32720Et02 = mo89518u;
        SectionUIKt.Section(num2, str222, null, C43575jt0.m29791b(mo89518u, -1407454986, true, new TextFieldUIKt$TextFieldSection$2(textFieldController, z, i, c20912a, textFieldUIKt$TextFieldSection$1, i13)), mo89518u, ((i13 >> 12) & 14) | 3072, 4);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = c20912a;
        obj2 = num2;
        function12 = textFieldUIKt$TextFieldSection$1;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    private static final FieldError TextFieldSection_uGujYS0$lambda$0(InterfaceC48627sP5<FieldError> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextField_ndPIYpw$lambda$10(EX2<Boolean> ex2, boolean z) {
        ex2.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldState TextField_ndPIYpw$lambda$11(InterfaceC48627sP5<? extends TextFieldState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final Integer TextField_ndPIYpw$lambda$12(InterfaceC48627sP5<Integer> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TextField_ndPIYpw$lambda$3(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final TextFieldIcon TextField_ndPIYpw$lambda$4(InterfaceC48627sP5<? extends TextFieldIcon> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final boolean TextField_ndPIYpw$lambda$5(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TextField_ndPIYpw$lambda$6(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TextField_ndPIYpw$lambda$7(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final String TextField_ndPIYpw$lambda$8(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TextField_ndPIYpw$lambda$9(EX2<Boolean> ex2) {
        return ex2.getValue().booleanValue();
    }

    public static final void TrailingIcon(TextFieldIcon.Trailing trailingIcon, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(trailingIcon, "trailingIcon");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1479598071);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(trailingIcon)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1479598071, i2, -1, "com.stripe.android.uicore.elements.TrailingIcon (TextFieldUI.kt:317)");
            }
            if (z) {
                mo89518u.mo89638F(-1232883867);
                K74.m99208b(null, 0L, 0.0f, mo89518u, 0, 7);
                mo89518u.mo89605Q();
            } else {
                String str = null;
                if (trailingIcon.isTintable()) {
                    mo89518u.mo89638F(-1232883789);
                    AbstractC45562nE3 m19793d = C46748pE3.m19793d(trailingIcon.getIdRes(), mo89518u, 0);
                    Integer contentDescription = trailingIcon.getContentDescription();
                    if (contentDescription != null) {
                        mo89518u.mo89638F(-1232883643);
                        contentDescription.intValue();
                        str = C40946fS5.m41310c(trailingIcon.getContentDescription().intValue(), mo89518u, 0);
                        mo89518u.mo89605Q();
                    }
                    InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                    mo89518u.mo89638F(1157296644);
                    boolean mo89539n = mo89518u.mo89539n(trailingIcon);
                    Object mo89635G = mo89518u.mo89635G();
                    if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G = new TextFieldUIKt$TrailingIcon$2$1(trailingIcon);
                        mo89518u.mo89503z(mo89635G);
                    }
                    mo89518u.mo89605Q();
                    DP1.m110533b(m19793d, str, C38131ak0.m70814e(c20912a, false, null, null, (Function0) mo89635G, 7, null), 0L, mo89518u, 8, 8);
                    mo89518u.mo89605Q();
                } else {
                    mo89518u.mo89638F(-1232883432);
                    AbstractC45562nE3 m19793d2 = C46748pE3.m19793d(trailingIcon.getIdRes(), mo89518u, 0);
                    Integer contentDescription2 = trailingIcon.getContentDescription();
                    if (contentDescription2 != null) {
                        mo89518u.mo89638F(-1232883285);
                        contentDescription2.intValue();
                        str = C40946fS5.m41310c(trailingIcon.getContentDescription().intValue(), mo89518u, 0);
                        mo89518u.mo89605Q();
                    }
                    InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
                    mo89518u.mo89638F(1157296644);
                    boolean mo89539n2 = mo89518u.mo89539n(trailingIcon);
                    Object mo89635G2 = mo89518u.mo89635G();
                    if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G2 = new TextFieldUIKt$TrailingIcon$4$1(trailingIcon);
                        mo89518u.mo89503z(mo89635G2);
                    }
                    mo89518u.mo89605Q();
                    C51659xX1.m5069a(m19793d2, str, C38131ak0.m70814e(c20912a2, false, null, null, (Function0) mo89635G2, 7, null), null, null, 0.0f, null, mo89518u, 8, 120);
                    mo89518u.mo89605Q();
                }
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new TextFieldUIKt$TrailingIcon$5(trailingIcon, z, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<String, Unit> defaultAutofillEventReporter() {
        return TextFieldUIKt$defaultAutofillEventReporter$1.INSTANCE;
    }

    public static final U94<Function1<String, Unit>> getLocalAutofillEventReporter() {
        return LocalAutofillEventReporter;
    }
}

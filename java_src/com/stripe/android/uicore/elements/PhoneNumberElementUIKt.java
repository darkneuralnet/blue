package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.C11298b;
import androidx.compose.p003ui.focus.C11309h;
import androidx.compose.p003ui.focus.C11312i;
import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.elements.PhoneNumberController;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001aE\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"", "PhoneNumberCollectionPreview", "(LEt0;I)V", "", "enabled", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "phoneNumberController", "", "sectionTitle", "requestFocusWhenShown", "LFY1;", "imeAction", "PhoneNumberCollectionSection-a7tNSiQ", "(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;ZILEt0;II)V", "PhoneNumberCollectionSection", "controller", "PhoneNumberElementUI-rvJmuoc", "(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZILEt0;II)V", "PhoneNumberElementUI", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhoneNumberElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberElementUI.kt\ncom/stripe/android/uicore/elements/PhoneNumberElementUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,146:1\n76#2:147\n25#3:148\n1057#4,6:149\n76#5:155\n76#5:156\n76#5:157\n76#5:158\n76#5:159\n76#5:160\n76#5:161\n76#5:162\n102#5,2:163\n*S KotlinDebug\n*F\n+ 1 PhoneNumberElementUI.kt\ncom/stripe/android/uicore/elements/PhoneNumberElementUIKt\n*L\n76#1:147\n85#1:148\n85#1:149,6\n52#1:155\n77#1:156\n79#1:157\n80#1:158\n81#1:159\n82#1:160\n83#1:161\n86#1:162\n86#1:163,2\n*E\n"})
/* loaded from: classes7.dex */
public final class PhoneNumberElementUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void PhoneNumberCollectionPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2068137235);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2068137235, i, -1, "com.stripe.android.uicore.elements.PhoneNumberCollectionPreview (PhoneNumberElementUI.kt:35)");
            }
            m116743PhoneNumberCollectionSectiona7tNSiQ(true, PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.Companion, "6508989787", null, 2, null), null, false, 0, mo89518u, 70, 28);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PhoneNumberElementUIKt$PhoneNumberCollectionPreview$1(i));
        }
    }

    /* renamed from: PhoneNumberCollectionSection-a7tNSiQ  reason: not valid java name */
    public static final void m116743PhoneNumberCollectionSectiona7tNSiQ(boolean z, PhoneNumberController phoneNumberController, Integer num, boolean z2, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
        Integer num2;
        boolean z3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(phoneNumberController, "phoneNumberController");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(655524875);
        String str = null;
        if ((i3 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i3 & 8) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        if ((i3 & 16) != 0) {
            i4 = FY1.f9619b.m107002b();
            i5 = i2 & (-57345);
        } else {
            i4 = i;
            i5 = i2;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(655524875, i5, -1, "com.stripe.android.uicore.elements.PhoneNumberCollectionSection (PhoneNumberElementUI.kt:44)");
        }
        FieldError PhoneNumberCollectionSection_a7tNSiQ$lambda$0 = PhoneNumberCollectionSection_a7tNSiQ$lambda$0(GM5.m105206a(phoneNumberController.getError(), null, null, mo89518u, 56, 2));
        mo89518u.mo89638F(-350833272);
        if (PhoneNumberCollectionSection_a7tNSiQ$lambda$0 != null) {
            Object[] formatArgs = PhoneNumberCollectionSection_a7tNSiQ$lambda$0.getFormatArgs();
            mo89518u.mo89638F(-350833243);
            if (formatArgs != null) {
                str = C40946fS5.m41309d(PhoneNumberCollectionSection_a7tNSiQ$lambda$0.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), mo89518u, 64);
            }
            mo89518u.mo89605Q();
            if (str == null) {
                str = C40946fS5.m41310c(PhoneNumberCollectionSection_a7tNSiQ$lambda$0.getErrorMessage(), mo89518u, 0);
            }
        }
        String str2 = str;
        mo89518u.mo89605Q();
        SectionUIKt.Section(num2, str2, null, C43575jt0.m29791b(mo89518u, 354183778, true, new PhoneNumberElementUIKt$PhoneNumberCollectionSection$1(z, phoneNumberController, z3, i4, i5)), mo89518u, ((i5 >> 6) & 14) | 3072, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PhoneNumberElementUIKt$PhoneNumberCollectionSection$2(z, phoneNumberController, num2, z3, i4, i2, i3));
        }
    }

    private static final FieldError PhoneNumberCollectionSection_a7tNSiQ$lambda$0(InterfaceC48627sP5<FieldError> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* renamed from: PhoneNumberElementUI-rvJmuoc  reason: not valid java name */
    public static final void m116744PhoneNumberElementUIrvJmuoc(boolean z, PhoneNumberController controller, boolean z2, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        Intrinsics.checkNotNullParameter(controller, "controller");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1223977851);
        if ((i3 & 4) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        if ((i3 & 8) != 0) {
            i4 = FY1.f9619b.m107002b();
            i5 = i2 & (-7169);
        } else {
            i4 = i;
            i5 = i2;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1223977851, i5, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI (PhoneNumberElementUI.kt:69)");
        }
        InterfaceC32037Bv1 interfaceC32037Bv1 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
        controller.onSelectedCountryIndex(PhoneNumberElementUI_rvJmuoc$lambda$3(GM5.m105206a(controller.getCountryDropdownController().getSelectedIndex(), 0, null, mo89518u, 56, 2)));
        InterfaceC48627sP5 m105206a = GM5.m105206a(controller.getFieldValue(), "", null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a2 = GM5.m105206a(controller.getError(), null, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a3 = GM5.m105206a(controller.getLabel(), Integer.valueOf(C19423R.string.address_label_phone_number), null, mo89518u, 8, 2);
        InterfaceC48627sP5 m105206a4 = GM5.m105206a(controller.getPlaceholder(), "", null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a5 = GM5.m105206a(controller.getVisualTransformation(), InterfaceC32735Eu6.f8291a.m108216a(), null, mo89518u, 56, 2);
        if (PhoneNumberElementUI_rvJmuoc$lambda$5(m105206a2) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        InterfaceC39510d16 TextFieldColors = TextFieldUIKt.TextFieldColors(z4, mo89518u, 0, 0);
        mo89518u.mo89638F(-492369756);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C11309h();
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        C11309h c11309h = (C11309h) mo89635G;
        C47218q16.m18303b(PhoneNumberElementUI_rvJmuoc$lambda$4(m105206a), new PhoneNumberElementUIKt$PhoneNumberElementUI$1(controller), C11298b.m68823a(C11312i.m68775a(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), c11309h), new PhoneNumberElementUIKt$PhoneNumberElementUI$2(controller, (EX2) C35550Qv4.m87571b(new Object[0], null, null, PhoneNumberElementUIKt$PhoneNumberElementUI$hasFocus$2.INSTANCE, mo89518u, 3080, 6))), z, false, null, C43575jt0.m29791b(mo89518u, -1127523231, true, new PhoneNumberElementUIKt$PhoneNumberElementUI$3(controller, m105206a3)), C43575jt0.m29791b(mo89518u, -842387328, true, new PhoneNumberElementUIKt$PhoneNumberElementUI$4(m105206a4)), C43575jt0.m29791b(mo89518u, -557251425, true, new PhoneNumberElementUIKt$PhoneNumberElementUI$5(controller, z, i5)), null, false, PhoneNumberElementUI_rvJmuoc$lambda$8(m105206a5), new C38736bl2(0, false, C39329cl2.f61189b.m60909g(), i4, 3, null), new C37555Zk2(new PhoneNumberElementUIKt$PhoneNumberElementUI$6(interfaceC32037Bv1), null, new PhoneNumberElementUIKt$PhoneNumberElementUI$7(interfaceC32037Bv1), null, null, null, 58, null), true, 0, null, null, TextFieldColors, mo89518u, ((i5 << 9) & 7168) | 114819072, (C37555Zk2.f49151h << 9) | 24576, 230960);
        if (z3) {
            Y91.m75533f(Unit.INSTANCE, new PhoneNumberElementUIKt$PhoneNumberElementUI$8(c11309h, null), mo89518u, 70);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PhoneNumberElementUIKt$PhoneNumberElementUI$9(z, controller, z3, i4, i2, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PhoneNumberElementUI_rvJmuoc$lambda$10(EX2<Boolean> ex2) {
        return ex2.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PhoneNumberElementUI_rvJmuoc$lambda$11(EX2<Boolean> ex2, boolean z) {
        ex2.setValue(Boolean.valueOf(z));
    }

    private static final int PhoneNumberElementUI_rvJmuoc$lambda$3(InterfaceC48627sP5<Integer> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().intValue();
    }

    private static final String PhoneNumberElementUI_rvJmuoc$lambda$4(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final FieldError PhoneNumberElementUI_rvJmuoc$lambda$5(InterfaceC48627sP5<FieldError> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PhoneNumberElementUI_rvJmuoc$lambda$6(InterfaceC48627sP5<Integer> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PhoneNumberElementUI_rvJmuoc$lambda$7(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final InterfaceC32735Eu6 PhoneNumberElementUI_rvJmuoc$lambda$8(InterfaceC48627sP5<? extends InterfaceC32735Eu6> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }
}

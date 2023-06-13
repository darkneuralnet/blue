package com.stripe.android.p049ui.core;

import com.stripe.android.p049ui.core.elements.AffirmElementUIKt;
import com.stripe.android.p049ui.core.elements.AffirmHeaderElement;
import com.stripe.android.p049ui.core.elements.AfterpayClearpayElementUIKt;
import com.stripe.android.p049ui.core.elements.AfterpayClearpayHeaderElement;
import com.stripe.android.p049ui.core.elements.AuBecsDebitMandateElementUIKt;
import com.stripe.android.p049ui.core.elements.AuBecsDebitMandateTextElement;
import com.stripe.android.p049ui.core.elements.BsbElement;
import com.stripe.android.p049ui.core.elements.BsbElementUIKt;
import com.stripe.android.p049ui.core.elements.CardDetailsSectionElement;
import com.stripe.android.p049ui.core.elements.CardDetailsSectionElementUIKt;
import com.stripe.android.p049ui.core.elements.EmptyFormElement;
import com.stripe.android.p049ui.core.elements.MandateTextElement;
import com.stripe.android.p049ui.core.elements.MandateTextUIKt;
import com.stripe.android.p049ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.p049ui.core.elements.SaveForFutureUseElementUIKt;
import com.stripe.android.p049ui.core.elements.StaticTextElement;
import com.stripe.android.p049ui.core.elements.StaticTextElementUIKt;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.elements.OTPElementUIKt;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SectionElementUIKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u001a_\u0010\r\u001a\u00020\f2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00002\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00002\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u0013¨\u0006\u0014"}, m28432d2 = {"LEu1;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiersFlow", "", "enabledFlow", "", "Lcom/stripe/android/uicore/elements/FormElement;", "elementsFlow", "lastTextFieldIdentifierFlow", "LgV2;", "modifier", "", "FormUI", "(LEu1;LEu1;LEu1;LEu1;LgV2;LEt0;II)V", "hiddenIdentifiers", "enabled", "elements", "lastTextFieldIdentifier", "(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFormUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormUI.kt\ncom/stripe/android/ui/core/FormUIKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,102:1\n74#2,6:103\n80#2:135\n84#2:143\n75#3:109\n76#3,11:111\n89#3:142\n76#4:110\n460#5,13:122\n473#5,3:139\n1864#6,3:136\n76#7:144\n76#7:145\n76#7:146\n76#7:147\n*S KotlinDebug\n*F\n+ 1 FormUI.kt\ncom/stripe/android/ui/core/FormUIKt\n*L\n67#1:103,6\n67#1:135\n67#1:143\n67#1:109\n67#1:111,11\n67#1:142\n67#1:110\n67#1:122,13\n67#1:139,3\n70#1:136,3\n44#1:144\n45#1:145\n46#1:146\n47#1:147\n*E\n"})
/* renamed from: com.stripe.android.ui.core.FormUIKt */
/* loaded from: classes7.dex */
public final class FormUIKt {
    public static final void FormUI(InterfaceC32730Eu1<? extends Set<IdentifierSpec>> hiddenIdentifiersFlow, InterfaceC32730Eu1<Boolean> enabledFlow, InterfaceC32730Eu1<? extends List<? extends FormElement>> elementsFlow, InterfaceC32730Eu1<IdentifierSpec> lastTextFieldIdentifierFlow, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Set emptySet;
        List emptyList;
        Intrinsics.checkNotNullParameter(hiddenIdentifiersFlow, "hiddenIdentifiersFlow");
        Intrinsics.checkNotNullParameter(enabledFlow, "enabledFlow");
        Intrinsics.checkNotNullParameter(elementsFlow, "elementsFlow");
        Intrinsics.checkNotNullParameter(lastTextFieldIdentifierFlow, "lastTextFieldIdentifierFlow");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1681652891);
        InterfaceC41563gV2.C20912a c20912a = (i2 & 16) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1681652891, i, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:36)");
        }
        emptySet = SetsKt__SetsKt.emptySet();
        InterfaceC48627sP5 m105206a = GM5.m105206a(hiddenIdentifiersFlow, emptySet, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a2 = GM5.m105206a(enabledFlow, Boolean.TRUE, null, mo89518u, 56, 2);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        FormUI(FormUI$lambda$0(m105206a), FormUI$lambda$1(m105206a2), FormUI$lambda$2(GM5.m105206a(elementsFlow, emptyList, null, mo89518u, 56, 2)), FormUI$lambda$3(GM5.m105206a(lastTextFieldIdentifierFlow, null, null, mo89518u, 56, 2)), c20912a, mo89518u, (IdentifierSpec.$stable << 9) | 520 | (57344 & i), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new FormUIKt$FormUI$1(hiddenIdentifiersFlow, enabledFlow, elementsFlow, lastTextFieldIdentifierFlow, c20912a, i, i2));
    }

    private static final Set<IdentifierSpec> FormUI$lambda$0(InterfaceC48627sP5<? extends Set<IdentifierSpec>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final boolean FormUI$lambda$1(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    private static final List<FormElement> FormUI$lambda$2(InterfaceC48627sP5<? extends List<? extends FormElement>> interfaceC48627sP5) {
        return (List) interfaceC48627sP5.getValue();
    }

    private static final IdentifierSpec FormUI$lambda$3(InterfaceC48627sP5<IdentifierSpec> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    public static final void FormUI(Set<IdentifierSpec> hiddenIdentifiers, boolean z, List<? extends FormElement> elements, IdentifierSpec identifierSpec, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        Intrinsics.checkNotNullParameter(elements, "elements");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1527302195);
        InterfaceC41563gV2.C20912a c20912a = (i2 & 16) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1527302195, i, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:59)");
        }
        InterfaceC41563gV2 m114256m = BB5.m114256m(c20912a, 1.0f);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114256m);
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
        C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        mo89518u.mo89638F(1247596157);
        int i3 = 0;
        for (Object obj : elements) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            FormElement formElement = (FormElement) obj;
            if (!hiddenIdentifiers.contains(formElement.getIdentifier())) {
                if (formElement instanceof SectionElement) {
                    mo89518u.mo89638F(541771547);
                    SectionElementUIKt.m116746SectionElementUIrgidl0k(z, (SectionElement) formElement, hiddenIdentifiers, identifierSpec, 0, 0, mo89518u, ((i >> 3) & 14) | 512 | (SectionElement.$stable << 3) | (IdentifierSpec.$stable << 9) | (i & 7168), 48);
                    mo89518u.mo89605Q();
                } else if (formElement instanceof StaticTextElement) {
                    mo89518u.mo89638F(541771788);
                    StaticTextElementUIKt.StaticTextElementUI((StaticTextElement) formElement, mo89518u, 8);
                    mo89518u.mo89605Q();
                } else if (formElement instanceof SaveForFutureUseElement) {
                    mo89518u.mo89638F(541771867);
                    SaveForFutureUseElementUIKt.SaveForFutureUseElementUI(z, (SaveForFutureUseElement) formElement, null, mo89518u, ((i >> 3) & 14) | 64, 4);
                    mo89518u.mo89605Q();
                } else if (formElement instanceof AfterpayClearpayHeaderElement) {
                    mo89518u.mo89638F(541771967);
                    AfterpayClearpayElementUIKt.AfterpayClearpayElementUI(z, (AfterpayClearpayHeaderElement) formElement, mo89518u, ((i >> 3) & 14) | 64);
                    mo89518u.mo89605Q();
                } else if (formElement instanceof AuBecsDebitMandateTextElement) {
                    mo89518u.mo89638F(541772137);
                    AuBecsDebitMandateElementUIKt.AuBecsDebitMandateElementUI((AuBecsDebitMandateTextElement) formElement, mo89518u, 8);
                    mo89518u.mo89605Q();
                } else if (formElement instanceof AffirmHeaderElement) {
                    mo89518u.mo89638F(541772220);
                    AffirmElementUIKt.AffirmElementUI(mo89518u, 0);
                    mo89518u.mo89605Q();
                } else if (formElement instanceof MandateTextElement) {
                    mo89518u.mo89638F(541772283);
                    MandateTextUIKt.MandateTextUI((MandateTextElement) formElement, mo89518u, 8);
                    mo89518u.mo89605Q();
                } else if (formElement instanceof CardDetailsSectionElement) {
                    mo89518u.mo89638F(541772358);
                    CardDetailsSectionElementUIKt.CardDetailsSectionElementUI(z, ((CardDetailsSectionElement) formElement).getController(), hiddenIdentifiers, identifierSpec, mo89518u, ((i >> 3) & 14) | 576 | (IdentifierSpec.$stable << 9) | (i & 7168));
                    mo89518u.mo89605Q();
                } else {
                    if (formElement instanceof BsbElement) {
                        mo89518u.mo89638F(541772614);
                        int i5 = i >> 3;
                        BsbElementUIKt.BsbElementUI(z, (BsbElement) formElement, identifierSpec, mo89518u, (i5 & 896) | (i5 & 14) | 64 | (IdentifierSpec.$stable << 6));
                        mo89518u.mo89605Q();
                    } else if (formElement instanceof OTPElement) {
                        mo89518u.mo89638F(541772707);
                        OTPElementUIKt.OTPElementUI(z, (OTPElement) formElement, null, null, null, mo89518u, ((i >> 3) & 14) | (OTPElement.$stable << 3), 28);
                        mo89518u.mo89605Q();
                    } else if (formElement instanceof EmptyFormElement) {
                        mo89518u.mo89638F(541772781);
                        mo89518u.mo89605Q();
                    } else {
                        mo89518u.mo89638F(541772801);
                        mo89518u.mo89605Q();
                    }
                    i3 = i4;
                }
            }
            i3 = i4;
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new FormUIKt$FormUI$3(hiddenIdentifiers, z, elements, identifierSpec, c20912a, i, i2));
    }
}

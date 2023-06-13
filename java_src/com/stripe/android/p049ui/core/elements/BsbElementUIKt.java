package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionUIKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"", "enabled", "Lcom/stripe/android/ui/core/elements/BsbElement;", "element", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "lastTextFieldIdentifier", "", "BsbElementUI", "(ZLcom/stripe/android/ui/core/elements/BsbElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBsbElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BsbElementUI.kt\ncom/stripe/android/ui/core/elements/BsbElementUIKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,60:1\n73#2,7:61\n80#2:94\n84#2:99\n75#3:68\n76#3,11:70\n89#3:98\n76#4:69\n460#5,13:81\n473#5,3:95\n76#6:100\n76#6:101\n*S KotlinDebug\n*F\n+ 1 BsbElementUI.kt\ncom/stripe/android/ui/core/elements/BsbElementUIKt\n*L\n34#1:61,7\n34#1:94\n34#1:99\n34#1:68\n34#1:70,11\n34#1:98\n34#1:69\n34#1:81,13\n34#1:95,3\n24#1:100\n25#1:101\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.BsbElementUIKt */
/* loaded from: classes7.dex */
public final class BsbElementUIKt {
    public static final void BsbElementUI(boolean z, BsbElement element, IdentifierSpec identifierSpec, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(element, "element");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1062029600);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1062029600, i, -1, "com.stripe.android.ui.core.elements.BsbElementUI (BsbElementUI.kt:18)");
        }
        InterfaceC48627sP5 m105206a = GM5.m105206a(element.getTextElement$payments_ui_core_release().getController().getError(), null, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a2 = GM5.m105206a(element.getBankName(), null, null, mo89518u, 56, 2);
        FieldError BsbElementUI$lambda$0 = BsbElementUI$lambda$0(m105206a);
        mo89518u.mo89638F(537895117);
        String str = null;
        if (BsbElementUI$lambda$0 != null) {
            Object[] formatArgs = BsbElementUI$lambda$0.getFormatArgs();
            mo89518u.mo89638F(537895146);
            if (formatArgs != null) {
                str = C40946fS5.m41309d(BsbElementUI$lambda$0.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), mo89518u, 64);
            }
            mo89518u.mo89605Q();
            if (str == null) {
                str = C40946fS5.m41310c(BsbElementUI$lambda$0.getErrorMessage(), mo89518u, 0);
            }
        }
        mo89518u.mo89605Q();
        mo89518u.mo89638F(-483455358);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
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
        mo89518u.mo89638F(1794175914);
        SectionUIKt.Section(null, str, C43575jt0.m29791b(mo89518u, -1564787790, true, new BsbElementUIKt$BsbElementUI$1$1(m105206a2)), C43575jt0.m29791b(mo89518u, -986021645, true, new BsbElementUIKt$BsbElementUI$1$2(element, z, identifierSpec, i)), mo89518u, 3462, 0);
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
        if (mo89512w != null) {
            mo89512w.mo20405a(new BsbElementUIKt$BsbElementUI$2(z, element, identifierSpec, i));
        }
    }

    private static final FieldError BsbElementUI$lambda$0(InterfaceC48627sP5<FieldError> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BsbElementUI$lambda$1(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }
}

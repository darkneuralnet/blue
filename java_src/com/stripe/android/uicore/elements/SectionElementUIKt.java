package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.C11299c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aQ\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"", "enabled", "Lcom/stripe/android/uicore/elements/SectionElement;", "element", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "", "SectionElementUI-rgidl0k", "(ZLcom/stripe/android/uicore/elements/SectionElement;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V", "SectionElementUI", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSectionElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,88:1\n766#2:89\n857#2,2:90\n766#2:92\n857#2,2:93\n76#3:95\n*S KotlinDebug\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt\n*L\n42#1:89\n42#1:90,2\n45#1:92\n45#1:93,2\n32#1:95\n*E\n"})
/* loaded from: classes7.dex */
public final class SectionElementUIKt {
    /* renamed from: SectionElementUI-rgidl0k  reason: not valid java name */
    public static final void m116746SectionElementUIrgidl0k(boolean z, SectionElement element, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-939762920);
        if ((i4 & 16) != 0) {
            i6 = i3 & (-57345);
            i5 = C11299c.f52961b.m68807a();
        } else {
            i5 = i;
            i6 = i3;
        }
        if ((i4 & 32) != 0) {
            i6 &= -458753;
            i7 = C11299c.f52961b.m68800h();
        } else {
            i7 = i2;
        }
        int i8 = i6;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-939762920, i8, -1, "com.stripe.android.uicore.elements.SectionElementUI (SectionElementUI.kt:20)");
        }
        if (!hiddenIdentifiers.contains(element.getIdentifier())) {
            SectionController controller = element.getController();
            FieldError SectionElementUI_rgidl0k$lambda$0 = SectionElementUI_rgidl0k$lambda$0(GM5.m105206a(controller.getError(), null, null, mo89518u, 56, 2));
            mo89518u.mo89638F(541633248);
            String str = null;
            if (SectionElementUI_rgidl0k$lambda$0 != null) {
                Object[] formatArgs = SectionElementUI_rgidl0k$lambda$0.getFormatArgs();
                mo89518u.mo89638F(541633281);
                if (formatArgs != null) {
                    str = C40946fS5.m41309d(SectionElementUI_rgidl0k$lambda$0.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), mo89518u, 64);
                }
                mo89518u.mo89605Q();
                if (str == null) {
                    str = C40946fS5.m41310c(SectionElementUI_rgidl0k$lambda$0.getErrorMessage(), mo89518u, 0);
                }
            }
            String str2 = str;
            mo89518u.mo89605Q();
            ArrayList arrayList = new ArrayList();
            for (Object obj : element.getFields()) {
                if (!((SectionFieldElement) obj).getShouldRenderOutsideCard()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : element.getFields()) {
                if (((SectionFieldElement) obj2).getShouldRenderOutsideCard()) {
                    arrayList2.add(obj2);
                }
            }
            int i9 = i5;
            int i10 = i7;
            SectionUIKt.Section(controller.getLabel(), str2, C43575jt0.m29791b(mo89518u, -1503495701, true, new SectionElementUIKt$SectionElementUI$1(arrayList2, z, hiddenIdentifiers, identifierSpec, i9, i10, i8)), C43575jt0.m29791b(mo89518u, 520003850, true, new SectionElementUIKt$SectionElementUI$2(arrayList, z, hiddenIdentifiers, identifierSpec, i9, i10, i8)), mo89518u, 3456, 0);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SectionElementUIKt$SectionElementUI$3(z, element, hiddenIdentifiers, identifierSpec, i5, i7, i3, i4));
        }
    }

    private static final FieldError SectionElementUI_rgidl0k$lambda$0(InterfaceC48627sP5<FieldError> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }
}

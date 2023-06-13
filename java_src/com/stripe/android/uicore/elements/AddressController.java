package com.stripe.android.uicore.elements;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00150\u0014¢\u0006\u0004\b\"\u0010#JU\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AddressController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "", "enabled", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "field", "LgV2;", "modifier", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "", "ComposeUI-MxjM1cc", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V", "ComposeUI", "LEu1;", "", "fieldsFlowable", "LEu1;", "getFieldsFlowable", "()LEu1;", "", "label", "Ljava/lang/Integer;", "getLabel", "()Ljava/lang/Integer;", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "getError", "<init>", "(LEu1;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressController.kt\ncom/stripe/android/uicore/elements/AddressController\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,50:1\n190#2:51\n*S KotlinDebug\n*F\n+ 1 AddressController.kt\ncom/stripe/android/uicore/elements/AddressController\n*L\n24#1:51\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressController implements SectionFieldErrorController, SectionFieldComposable {
    public static final int $stable = 8;
    private final InterfaceC32730Eu1<FieldError> error;
    private final InterfaceC32730Eu1<List<SectionFieldElement>> fieldsFlowable;
    private final Integer label;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressController(InterfaceC32730Eu1<? extends List<? extends SectionFieldElement>> fieldsFlowable) {
        Intrinsics.checkNotNullParameter(fieldsFlowable, "fieldsFlowable");
        this.fieldsFlowable = fieldsFlowable;
        this.error = C36708Vu1.m79271Q(fieldsFlowable, new AddressController$special$$inlined$flatMapLatest$1(null));
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldComposable
    /* renamed from: ComposeUI-MxjM1cc */
    public void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement field, InterfaceC41563gV2 modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(791653481);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(791653481, i3, -1, "com.stripe.android.uicore.elements.AddressController.ComposeUI (AddressController.kt:32)");
        }
        AddressElementUIKt.AddressElementUI(z, this, hiddenIdentifiers, identifierSpec, mo89518u, (i3 & 14) | 576 | ((i3 >> 3) & 7168));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AddressController$ComposeUI$1(this, z, field, modifier, hiddenIdentifiers, identifierSpec, i, i2, i3));
        }
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public InterfaceC32730Eu1<FieldError> getError() {
        return this.error;
    }

    public final InterfaceC32730Eu1<List<SectionFieldElement>> getFieldsFlowable() {
        return this.fieldsFlowable;
    }

    public final Integer getLabel() {
        return this.label;
    }
}

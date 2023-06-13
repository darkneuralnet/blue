package com.stripe.android.uicore.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016J\u001e\u0010\f\u001a\u00020\u000b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0016J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SameAsShippingElement;", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "", "", "rawValuesMap", "", "setRawValue", "component1", "Lcom/stripe/android/uicore/elements/SameAsShippingController;", "component2", "identifier", "controller", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/elements/SameAsShippingController;", "getController", "()Lcom/stripe/android/uicore/elements/SameAsShippingController;", "getShouldRenderOutsideCard", "()Z", "shouldRenderOutsideCard", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/SameAsShippingController;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSameAsShippingElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SameAsShippingElement.kt\ncom/stripe/android/uicore/elements/SameAsShippingElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,30:1\n47#2:31\n49#2:35\n50#3:32\n55#3:34\n106#4:33\n*S KotlinDebug\n*F\n+ 1 SameAsShippingElement.kt\ncom/stripe/android/uicore/elements/SameAsShippingElement\n*L\n17#1:31\n17#1:35\n17#1:32\n17#1:34\n17#1:33\n*E\n"})
/* loaded from: classes7.dex */
public final class SameAsShippingElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final SameAsShippingController controller;
    private final IdentifierSpec identifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SameAsShippingElement(IdentifierSpec identifier, SameAsShippingController controller) {
        super(identifier);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
    }

    public static /* synthetic */ SameAsShippingElement copy$default(SameAsShippingElement sameAsShippingElement, IdentifierSpec identifierSpec, SameAsShippingController sameAsShippingController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = sameAsShippingElement.getIdentifier();
        }
        if ((i & 2) != 0) {
            sameAsShippingController = sameAsShippingElement.getController();
        }
        return sameAsShippingElement.copy(identifierSpec, sameAsShippingController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final SameAsShippingController component2() {
        return getController();
    }

    public final SameAsShippingElement copy(IdentifierSpec identifier, SameAsShippingController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new SameAsShippingElement(identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SameAsShippingElement) {
            SameAsShippingElement sameAsShippingElement = (SameAsShippingElement) obj;
            return Intrinsics.areEqual(getIdentifier(), sameAsShippingElement.getIdentifier()) && Intrinsics.areEqual(getController(), sameAsShippingElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue = getController().getFormFieldValue();
        return new InterfaceC32730Eu1<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.uicore.elements.SameAsShippingElement$getFormFieldValueFlow$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SameAsShippingElement.kt\ncom/stripe/android/uicore/elements/SameAsShippingElement\n*L\n1#1,222:1\n48#2:223\n19#3:224\n18#3:225\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.SameAsShippingElement$getFormFieldValueFlow$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194782<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ SameAsShippingElement this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.SameAsShippingElement$getFormFieldValueFlow$$inlined$map$1$2", m28418f = "SameAsShippingElement.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SameAsShippingElement$getFormFieldValueFlow$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194791 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194791(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194782.this.emit(null, this);
                    }
                }

                public C194782(InterfaceC33198Gu1 interfaceC33198Gu1, SameAsShippingElement sameAsShippingElement) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = sameAsShippingElement;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194791 c194791;
                    Object coroutine_suspended;
                    int i;
                    List listOf;
                    if (continuation instanceof C194791) {
                        c194791 = (C194791) continuation;
                        int i2 = c194791.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194791.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194791.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194791.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(this.this$0.getIdentifier(), (FormFieldEntry) obj));
                                c194791.label = 1;
                                if (interfaceC33198Gu1.emit(listOf, c194791) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194791 = new C194791(continuation);
                    Object obj22 = c194791.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194791.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194782(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public boolean getShouldRenderOutsideCard() {
        return true;
    }

    public int hashCode() {
        return (getIdentifier().hashCode() * 31) + getController().hashCode();
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
        String str = rawValuesMap.get(getIdentifier());
        if (str != null) {
            getController().onRawValueChange(str);
        }
    }

    public String toString() {
        IdentifierSpec identifier = getIdentifier();
        SameAsShippingController controller = getController();
        return "SameAsShippingElement(identifier=" + identifier + ", controller=" + controller + ")";
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement
    public SameAsShippingController getController() {
        return this.controller;
    }
}

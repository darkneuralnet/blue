package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00050\u0004H\u0016J\u001e\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u0004H\u0016R\u001a\u0010\u0010\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "sectionFieldErrorController", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "", "", "rawValuesMap", "", "setRawValue", "getTextFieldIdentifiers", "identifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/elements/InputController;", "getController", "()Lcom/stripe/android/uicore/elements/InputController;", "controller", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSectionSingleFieldElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionSingleFieldElement.kt\ncom/stripe/android/uicore/elements/SectionSingleFieldElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n47#2:43\n49#2:47\n50#3:44\n55#3:46\n106#4:45\n1#5:48\n*S KotlinDebug\n*F\n+ 1 SectionSingleFieldElement.kt\ncom/stripe/android/uicore/elements/SectionSingleFieldElement\n*L\n27#1:43\n27#1:47\n27#1:44\n27#1:46\n27#1:45\n*E\n"})
/* loaded from: classes7.dex */
public abstract class SectionSingleFieldElement implements SectionFieldElement {
    public static final int $stable = 0;
    private final IdentifierSpec identifier;

    public SectionSingleFieldElement(IdentifierSpec identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
    }

    public abstract InputController getController();

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue = getController().getFormFieldValue();
        return new InterfaceC32730Eu1<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.uicore.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SectionSingleFieldElement.kt\ncom/stripe/android/uicore/elements/SectionSingleFieldElement\n*L\n1#1,222:1\n48#2:223\n28#3:224\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194862<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ SectionSingleFieldElement this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1$2", m28418f = "SectionSingleFieldElement.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194871 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194871(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194862.this.emit(null, this);
                    }
                }

                public C194862(InterfaceC33198Gu1 interfaceC33198Gu1, SectionSingleFieldElement sectionSingleFieldElement) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = sectionSingleFieldElement;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194871 c194871;
                    Object coroutine_suspended;
                    int i;
                    List listOf;
                    if (continuation instanceof C194871) {
                        c194871 = (C194871) continuation;
                        int i2 = c194871.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194871.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194871.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194871.label;
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
                                c194871.label = 1;
                                if (interfaceC33198Gu1.emit(listOf, c194871) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c194871 = new C194871(continuation);
                    Object obj22 = c194871.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194871.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194862(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public boolean getShouldRenderOutsideCard() {
        return SectionFieldElement.DefaultImpls.getShouldRenderOutsideCard(this);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        List listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(getIdentifier());
        if (!(getController() instanceof TextFieldController)) {
            listOf = null;
        }
        if (listOf == null) {
            listOf = CollectionsKt__CollectionsKt.emptyList();
        }
        return C50405vP5.m8742a(listOf);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public SectionFieldErrorController sectionFieldErrorController() {
        return getController();
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
        String str = rawValuesMap.get(getIdentifier());
        if (str != null) {
            getController().onRawValueChange(str);
        }
    }
}

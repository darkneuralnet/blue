package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001e\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0016R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/RowElement;", "Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "Lcom/stripe/android/uicore/elements/RowController;", "sectionFieldErrorController", "", "", "rawValuesMap", "", "setRawValue", "getTextFieldIdentifiers", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "fields", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "controller", "Lcom/stripe/android/uicore/elements/RowController;", "getController", "()Lcom/stripe/android/uicore/elements/RowController;", "_identifier", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/uicore/elements/RowController;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRowElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowElement.kt\ncom/stripe/android/uicore/elements/RowElement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,30:1\n1549#2:31\n1620#2,3:32\n1855#2,2:42\n1549#2:44\n1620#2,3:45\n287#3:35\n288#3:40\n37#4:36\n36#4,3:37\n106#5:41\n*S KotlinDebug\n*F\n+ 1 RowElement.kt\ncom/stripe/android/uicore/elements/RowElement\n*L\n15#1:31\n15#1:32,3\n22#1:42,2\n28#1:44\n28#1:45,3\n15#1:35\n15#1:40\n15#1:36\n15#1:37,3\n15#1:41\n*E\n"})
/* loaded from: classes7.dex */
public final class RowElement extends SectionMultiFieldElement {
    public static final int $stable = 8;
    private final RowController controller;
    private final List<SectionSingleFieldElement> fields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RowElement(IdentifierSpec _identifier, List<? extends SectionSingleFieldElement> fields, RowController controller) {
        super(_identifier);
        Intrinsics.checkNotNullParameter(_identifier, "_identifier");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.fields = fields;
        this.controller = controller;
    }

    public final RowController getController() {
        return this.controller;
    }

    public final List<SectionSingleFieldElement> getFields() {
        return this.fields;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        int collectionSizeOrDefault;
        List list;
        List<SectionSingleFieldElement> list2 = this.fields;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (SectionSingleFieldElement sectionSingleFieldElement : list2) {
            arrayList.add(sectionSingleFieldElement.getFormFieldValueFlow());
        }
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
        if (array != null) {
            final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
            return new InterfaceC32730Eu1<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.uicore.elements.RowElement$getFormFieldValueFlow$$inlined$combine$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.RowElement$getFormFieldValueFlow$$inlined$combine$1$2 */
                /* loaded from: classes7.dex */
                public static final class C194722 extends Lambda implements Function0<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]> {
                    final /* synthetic */ InterfaceC32730Eu1[] $flowArray;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C194722(InterfaceC32730Eu1[] interfaceC32730Eu1Arr) {
                        super(0);
                        this.$flowArray = interfaceC32730Eu1Arr;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                        return new List[this.$flowArray.length];
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.RowElement$getFormFieldValueFlow$$inlined$combine$1$3", m28418f = "RowElement.kt", m28417i = {}, m28416l = {292}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 RowElement.kt\ncom/stripe/android/uicore/elements/RowElement\n*L\n1#1,332:1\n16#2:333\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.RowElement$getFormFieldValueFlow$$inlined$combine$1$3 */
                /* loaded from: classes7.dex */
                public static final class C194733 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C194733(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(InterfaceC33198Gu1<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] listArr, Continuation<? super Unit> continuation) {
                        C194733 c194733 = new C194733(continuation);
                        c194733.L$0 = interfaceC33198Gu1;
                        c194733.L$1 = listArr;
                        return c194733.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        List list;
                        List flatten;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i != 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            list = ArraysKt___ArraysKt.toList((List[]) ((Object[]) this.L$1));
                            flatten = CollectionsKt__IterablesKt.flatten(list);
                            this.label = 1;
                            if (((InterfaceC33198Gu1) this.L$0).emit(flatten, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    InterfaceC32730Eu1[] interfaceC32730Eu1Arr2 = interfaceC32730Eu1Arr;
                    Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, interfaceC32730Eu1Arr2, new C194722(interfaceC32730Eu1Arr2), new C194733(null), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (m86325a == coroutine_suspended) {
                        return m86325a;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        int collectionSizeOrDefault;
        Object last;
        List<SectionSingleFieldElement> list = this.fields;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (SectionSingleFieldElement sectionSingleFieldElement : list) {
            arrayList.add(sectionSingleFieldElement.getTextFieldIdentifiers());
        }
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList);
        return (InterfaceC32730Eu1) last;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
        for (SectionSingleFieldElement sectionSingleFieldElement : this.fields) {
            sectionSingleFieldElement.setRawValue(rawValuesMap);
        }
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public RowController sectionFieldErrorController() {
        return this.controller;
    }
}

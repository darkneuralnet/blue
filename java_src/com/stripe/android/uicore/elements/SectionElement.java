package com.stripe.android.uicore.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B%\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b#\u0010$B!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b#\u0010&J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0016J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"¨\u0006("}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SectionElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "getTextFieldIdentifiers", "component1", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "component2", "Lcom/stripe/android/uicore/elements/SectionController;", "component3", "identifier", "fields", "controller", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "Lcom/stripe/android/uicore/elements/SectionController;", "getController", "()Lcom/stripe/android/uicore/elements/SectionController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/uicore/elements/SectionController;)V", "field", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/SectionFieldElement;Lcom/stripe/android/uicore/elements/SectionController;)V", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSectionElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionElement.kt\ncom/stripe/android/uicore/elements/SectionElement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,66:1\n1549#2:67\n1620#2,3:68\n1549#2:78\n1620#2,3:79\n287#3:71\n288#3:76\n287#3:82\n288#3:87\n37#4:72\n36#4,3:73\n37#4:83\n36#4,3:84\n106#5:77\n106#5:88\n*S KotlinDebug\n*F\n+ 1 SectionElement.kt\ncom/stripe/android/uicore/elements/SectionElement\n*L\n21#1:67\n21#1:68,3\n28#1:78\n28#1:79,3\n21#1:71\n21#1:76\n26#1:82\n26#1:87\n21#1:72\n21#1:73,3\n26#1:83\n26#1:84,3\n21#1:77\n26#1:88\n*E\n"})
/* loaded from: classes7.dex */
public final class SectionElement implements FormElement {
    private final SectionController controller;
    private final List<SectionFieldElement> fields;
    private final IdentifierSpec identifier;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ%\u0010\u0003\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\f¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SectionElement$Companion;", "", "()V", "wrap", "Lcom/stripe/android/uicore/elements/SectionElement;", "sectionFieldElement", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "label", "", "(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;", "sectionFieldElements", "", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSectionElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionElement.kt\ncom/stripe/android/uicore/elements/SectionElement$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1549#2:67\n1620#2,3:68\n*S KotlinDebug\n*F\n+ 1 SectionElement.kt\ncom/stripe/android/uicore/elements/SectionElement$Companion\n*L\n52#1:67\n52#1:68,3\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SectionElement wrap$default(Companion companion, SectionFieldElement sectionFieldElement, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.wrap(sectionFieldElement, num);
        }

        public final SectionElement wrap(SectionFieldElement sectionFieldElement, Integer num) {
            List<? extends SectionFieldElement> listOf;
            Intrinsics.checkNotNullParameter(sectionFieldElement, "sectionFieldElement");
            listOf = CollectionsKt__CollectionsJVMKt.listOf(sectionFieldElement);
            return wrap(listOf, num);
        }

        private Companion() {
        }

        public static /* synthetic */ SectionElement wrap$default(Companion companion, List list, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.wrap(list, num);
        }

        public final SectionElement wrap(List<? extends SectionFieldElement> sectionFieldElements, Integer num) {
            int collectionSizeOrDefault;
            Object first;
            Intrinsics.checkNotNullParameter(sectionFieldElements, "sectionFieldElements");
            List<? extends SectionFieldElement> list = sectionFieldElements;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (SectionFieldElement sectionFieldElement : list) {
                arrayList.add(sectionFieldElement.sectionFieldErrorController());
            }
            IdentifierSpec.Companion companion = IdentifierSpec.Companion;
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) sectionFieldElements);
            String v1 = ((SectionFieldElement) first).getIdentifier().getV1();
            return new SectionElement(companion.Generic(v1 + "_section"), sectionFieldElements, new SectionController(num, arrayList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionElement(IdentifierSpec identifier, List<? extends SectionFieldElement> fields, SectionController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.identifier = identifier;
        this.fields = fields;
        this.controller = controller;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionElement copy$default(SectionElement sectionElement, IdentifierSpec identifierSpec, List list, SectionController sectionController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = sectionElement.getIdentifier();
        }
        if ((i & 2) != 0) {
            list = sectionElement.fields;
        }
        if ((i & 4) != 0) {
            sectionController = sectionElement.getController();
        }
        return sectionElement.copy(identifierSpec, list, sectionController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final List<SectionFieldElement> component2() {
        return this.fields;
    }

    public final SectionController component3() {
        return getController();
    }

    public final SectionElement copy(IdentifierSpec identifier, List<? extends SectionFieldElement> fields, SectionController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new SectionElement(identifier, fields, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SectionElement) {
            SectionElement sectionElement = (SectionElement) obj;
            return Intrinsics.areEqual(getIdentifier(), sectionElement.getIdentifier()) && Intrinsics.areEqual(this.fields, sectionElement.fields) && Intrinsics.areEqual(getController(), sectionElement.getController());
        }
        return false;
    }

    public final List<SectionFieldElement> getFields() {
        return this.fields;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        int collectionSizeOrDefault;
        List list;
        List<SectionFieldElement> list2 = this.fields;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (SectionFieldElement sectionFieldElement : list2) {
            arrayList.add(sectionFieldElement.getFormFieldValueFlow());
        }
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
        if (array != null) {
            final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
            return new InterfaceC32730Eu1<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.uicore.elements.SectionElement$getFormFieldValueFlow$$inlined$combine$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SectionElement$getFormFieldValueFlow$$inlined$combine$1$2 */
                /* loaded from: classes7.dex */
                public static final class C194822 extends Lambda implements Function0<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]> {
                    final /* synthetic */ InterfaceC32730Eu1[] $flowArray;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C194822(InterfaceC32730Eu1[] interfaceC32730Eu1Arr) {
                        super(0);
                        this.$flowArray = interfaceC32730Eu1Arr;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                        return new List[this.$flowArray.length];
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.SectionElement$getFormFieldValueFlow$$inlined$combine$1$3", m28418f = "SectionElement.kt", m28417i = {}, m28416l = {292}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 SectionElement.kt\ncom/stripe/android/uicore/elements/SectionElement\n*L\n1#1,332:1\n22#2:333\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SectionElement$getFormFieldValueFlow$$inlined$combine$1$3 */
                /* loaded from: classes7.dex */
                public static final class C194833 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C194833(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(InterfaceC33198Gu1<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] listArr, Continuation<? super Unit> continuation) {
                        C194833 c194833 = new C194833(continuation);
                        c194833.L$0 = interfaceC33198Gu1;
                        c194833.L$1 = listArr;
                        return c194833.invokeSuspend(Unit.INSTANCE);
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
                    Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, interfaceC32730Eu1Arr2, new C194822(interfaceC32730Eu1Arr2), new C194833(null), continuation);
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

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        int collectionSizeOrDefault;
        List list;
        List<SectionFieldElement> list2 = this.fields;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (SectionFieldElement sectionFieldElement : list2) {
            arrayList.add(sectionFieldElement.getTextFieldIdentifiers());
        }
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
        if (array != null) {
            final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
            return new InterfaceC32730Eu1<List<? extends IdentifierSpec>>() { // from class: com.stripe.android.uicore.elements.SectionElement$getTextFieldIdentifiers$$inlined$combine$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SectionElement$getTextFieldIdentifiers$$inlined$combine$1$2 */
                /* loaded from: classes7.dex */
                public static final class C194842 extends Lambda implements Function0<List<? extends IdentifierSpec>[]> {
                    final /* synthetic */ InterfaceC32730Eu1[] $flowArray;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C194842(InterfaceC32730Eu1[] interfaceC32730Eu1Arr) {
                        super(0);
                        this.$flowArray = interfaceC32730Eu1Arr;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends IdentifierSpec>[] invoke() {
                        return new List[this.$flowArray.length];
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.SectionElement$getTextFieldIdentifiers$$inlined$combine$1$3", m28418f = "SectionElement.kt", m28417i = {}, m28416l = {292}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 SectionElement.kt\ncom/stripe/android/uicore/elements/SectionElement\n*L\n1#1,332:1\n32#2:333\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SectionElement$getTextFieldIdentifiers$$inlined$combine$1$3 */
                /* loaded from: classes7.dex */
                public static final class C194853 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super List<? extends IdentifierSpec>>, List<? extends IdentifierSpec>[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C194853(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(InterfaceC33198Gu1<? super List<? extends IdentifierSpec>> interfaceC33198Gu1, List<? extends IdentifierSpec>[] listArr, Continuation<? super Unit> continuation) {
                        C194853 c194853 = new C194853(continuation);
                        c194853.L$0 = interfaceC33198Gu1;
                        c194853.L$1 = listArr;
                        return c194853.invokeSuspend(Unit.INSTANCE);
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
                public Object collect(InterfaceC33198Gu1<? super List<? extends IdentifierSpec>> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    InterfaceC32730Eu1[] interfaceC32730Eu1Arr2 = interfaceC32730Eu1Arr;
                    Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, interfaceC32730Eu1Arr2, new C194842(interfaceC32730Eu1Arr2), new C194853(null), continuation);
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

    public int hashCode() {
        return (((getIdentifier().hashCode() * 31) + this.fields.hashCode()) * 31) + getController().hashCode();
    }

    public String toString() {
        IdentifierSpec identifier = getIdentifier();
        List<SectionFieldElement> list = this.fields;
        SectionController controller = getController();
        return "SectionElement(identifier=" + identifier + ", fields=" + list + ", controller=" + controller + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public SectionController getController() {
        return this.controller;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SectionElement(IdentifierSpec identifier, SectionFieldElement field, SectionController controller) {
        this(identifier, r3, controller);
        List listOf;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(controller, "controller");
        listOf = CollectionsKt__CollectionsJVMKt.listOf(field);
    }
}

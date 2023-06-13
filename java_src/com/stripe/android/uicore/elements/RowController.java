package com.stripe.android.uicore.elements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
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
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b \u0010!JU\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/uicore/elements/RowController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "", "enabled", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "field", "LgV2;", "modifier", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "", "ComposeUI-MxjM1cc", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V", "ComposeUI", "", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "fields", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "LEu1;", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "LEu1;", "getError", "()LEu1;", "<init>", "(Ljava/util/List;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRowController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowController.kt\ncom/stripe/android/uicore/elements/RowController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,38:1\n1549#2:39\n1620#2,3:40\n287#3:43\n288#3:48\n37#4:44\n36#4,3:45\n106#5:49\n*S KotlinDebug\n*F\n+ 1 RowController.kt\ncom/stripe/android/uicore/elements/RowController\n*L\n15#1:39\n15#1:40,3\n14#1:43\n14#1:48\n14#1:44\n14#1:45,3\n14#1:49\n*E\n"})
/* loaded from: classes7.dex */
public final class RowController implements SectionFieldErrorController, SectionFieldComposable {
    public static final int $stable = 8;
    private final InterfaceC32730Eu1<FieldError> error;
    private final List<SectionSingleFieldElement> fields;

    /* JADX WARN: Multi-variable type inference failed */
    public RowController(List<? extends SectionSingleFieldElement> fields) {
        int collectionSizeOrDefault;
        List list;
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.fields = fields;
        List<? extends SectionSingleFieldElement> list2 = fields;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (SectionSingleFieldElement sectionSingleFieldElement : list2) {
            arrayList.add(sectionSingleFieldElement.sectionFieldErrorController().getError());
        }
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
        if (array != null) {
            final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
            this.error = new InterfaceC32730Eu1<FieldError>() { // from class: com.stripe.android.uicore.elements.RowController$special$$inlined$combine$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.RowController$special$$inlined$combine$1$2 */
                /* loaded from: classes7.dex */
                public static final class C194702 extends Lambda implements Function0<FieldError[]> {
                    final /* synthetic */ InterfaceC32730Eu1[] $flowArray;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C194702(InterfaceC32730Eu1[] interfaceC32730Eu1Arr) {
                        super(0);
                        this.$flowArray = interfaceC32730Eu1Arr;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final FieldError[] invoke() {
                        return new FieldError[this.$flowArray.length];
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.RowController$special$$inlined$combine$1$3", m28418f = "RowController.kt", m28417i = {}, m28416l = {292}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 RowController.kt\ncom/stripe/android/uicore/elements/RowController\n*L\n1#1,332:1\n17#2:333\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.RowController$special$$inlined$combine$1$3 */
                /* loaded from: classes7.dex */
                public static final class C194713 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super FieldError>, FieldError[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C194713(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(InterfaceC33198Gu1<? super FieldError> interfaceC33198Gu1, FieldError[] fieldErrorArr, Continuation<? super Unit> continuation) {
                        C194713 c194713 = new C194713(continuation);
                        c194713.L$0 = interfaceC33198Gu1;
                        c194713.L$1 = fieldErrorArr;
                        return c194713.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        List filterNotNull;
                        Object firstOrNull;
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
                            filterNotNull = ArraysKt___ArraysKt.filterNotNull((FieldError[]) ((Object[]) this.L$1));
                            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) filterNotNull);
                            this.label = 1;
                            if (((InterfaceC33198Gu1) this.L$0).emit(firstOrNull, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super FieldError> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    InterfaceC32730Eu1[] interfaceC32730Eu1Arr2 = interfaceC32730Eu1Arr;
                    Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, interfaceC32730Eu1Arr2, new C194702(interfaceC32730Eu1Arr2), new C194713(null), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (m86325a == coroutine_suspended) {
                        return m86325a;
                    }
                    return Unit.INSTANCE;
                }
            };
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldComposable
    /* renamed from: ComposeUI-MxjM1cc */
    public void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement field, InterfaceC41563gV2 modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-55811811);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-55811811, i3, -1, "com.stripe.android.uicore.elements.RowController.ComposeUI (RowController.kt:20)");
        }
        RowElementUIKt.RowElementUI(z, this, hiddenIdentifiers, identifierSpec, mo89518u, (i3 & 14) | 576 | ((i3 >> 3) & 7168));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new RowController$ComposeUI$1(this, z, field, modifier, hiddenIdentifiers, identifierSpec, i, i2, i3));
        }
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public InterfaceC32730Eu1<FieldError> getError() {
        return this.error;
    }

    public final List<SectionSingleFieldElement> getFields() {
        return this.fields;
    }
}

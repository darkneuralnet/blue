package com.stripe.android.uicore.elements;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SectionController;", "Lcom/stripe/android/uicore/elements/Controller;", "", "label", "Ljava/lang/Integer;", "getLabel", "()Ljava/lang/Integer;", "LEu1;", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "LEu1;", "getError", "()LEu1;", "", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "sectionFieldErrorControllers", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionController.kt\ncom/stripe/android/uicore/elements/SectionController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,24:1\n1549#2:25\n1620#2,3:26\n287#3:29\n288#3:34\n37#4:30\n36#4,3:31\n106#5:35\n*S KotlinDebug\n*F\n+ 1 SectionController.kt\ncom/stripe/android/uicore/elements/SectionController\n*L\n17#1:25\n17#1:26,3\n16#1:29\n16#1:34\n16#1:30\n16#1:31,3\n16#1:35\n*E\n"})
/* loaded from: classes7.dex */
public final class SectionController implements Controller {
    public static final int $stable = 8;
    private final InterfaceC32730Eu1<FieldError> error;
    private final Integer label;

    public SectionController(Integer num, List<? extends SectionFieldErrorController> sectionFieldErrorControllers) {
        int collectionSizeOrDefault;
        List list;
        Intrinsics.checkNotNullParameter(sectionFieldErrorControllers, "sectionFieldErrorControllers");
        this.label = num;
        List<? extends SectionFieldErrorController> list2 = sectionFieldErrorControllers;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (SectionFieldErrorController sectionFieldErrorController : list2) {
            arrayList.add(sectionFieldErrorController.getError());
        }
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
        if (array != null) {
            final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
            this.error = new InterfaceC32730Eu1<FieldError>() { // from class: com.stripe.android.uicore.elements.SectionController$special$$inlined$combine$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SectionController$special$$inlined$combine$1$2 */
                /* loaded from: classes7.dex */
                public static final class C194802 extends Lambda implements Function0<FieldError[]> {
                    final /* synthetic */ InterfaceC32730Eu1[] $flowArray;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C194802(InterfaceC32730Eu1[] interfaceC32730Eu1Arr) {
                        super(0);
                        this.$flowArray = interfaceC32730Eu1Arr;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final FieldError[] invoke() {
                        return new FieldError[this.$flowArray.length];
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.SectionController$special$$inlined$combine$1$3", m28418f = "SectionController.kt", m28417i = {}, m28416l = {292}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 SectionController.kt\ncom/stripe/android/uicore/elements/SectionController\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,332:1\n21#2:333\n1#3:334\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.SectionController$special$$inlined$combine$1$3 */
                /* loaded from: classes7.dex */
                public static final class C194813 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super FieldError>, FieldError[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C194813(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(InterfaceC33198Gu1<? super FieldError> interfaceC33198Gu1, FieldError[] fieldErrorArr, Continuation<? super Unit> continuation) {
                        C194813 c194813 = new C194813(continuation);
                        c194813.L$0 = interfaceC33198Gu1;
                        c194813.L$1 = fieldErrorArr;
                        return c194813.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        FieldError fieldError;
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
                            InterfaceC33198Gu1 interfaceC33198Gu1 = (InterfaceC33198Gu1) this.L$0;
                            FieldError[] fieldErrorArr = (FieldError[]) ((Object[]) this.L$1);
                            int length = fieldErrorArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    fieldError = fieldErrorArr[i2];
                                    if (fieldError != null) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    fieldError = null;
                                    break;
                                }
                            }
                            this.label = 1;
                            if (interfaceC33198Gu1.emit(fieldError, this) == coroutine_suspended) {
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
                    Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, interfaceC32730Eu1Arr2, new C194802(interfaceC32730Eu1Arr2), new C194813(null), continuation);
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

    public final InterfaceC32730Eu1<FieldError> getError() {
        return this.error;
    }

    public final Integer getLabel() {
        return this.label;
    }
}

package com.stripe.android.uicore.elements;

import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressController$special$$inlined$flatMapLatest$1", m28418f = "AddressController.kt", m28417i = {}, m28416l = {190}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 AddressController.kt\ncom/stripe/android/uicore/elements/AddressController\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,215:1\n26#2:216\n25#2:221\n1549#3:217\n1620#3,3:218\n287#4:222\n288#4:227\n37#5:223\n36#5,3:224\n106#6:228\n*S KotlinDebug\n*F\n+ 1 AddressController.kt\ncom/stripe/android/uicore/elements/AddressController\n*L\n26#1:217\n26#1:218,3\n25#1:222\n25#1:227\n25#1:223\n25#1:224,3\n25#1:228\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressController$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super FieldError>, List<? extends SectionFieldElement>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public AddressController$special$$inlined$flatMapLatest$1(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC33198Gu1<? super FieldError> interfaceC33198Gu1, List<? extends SectionFieldElement> list, Continuation<? super Unit> continuation) {
        AddressController$special$$inlined$flatMapLatest$1 addressController$special$$inlined$flatMapLatest$1 = new AddressController$special$$inlined$flatMapLatest$1(continuation);
        addressController$special$$inlined$flatMapLatest$1.L$0 = interfaceC33198Gu1;
        addressController$special$$inlined$flatMapLatest$1.L$1 = list;
        return addressController$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        int collectionSizeOrDefault;
        List list;
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
            List<SectionFieldElement> list2 = (List) this.L$1;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (SectionFieldElement sectionFieldElement : list2) {
                arrayList.add(sectionFieldElement.sectionFieldErrorController().getError());
            }
            list = CollectionsKt___CollectionsKt.toList(arrayList);
            Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
            if (array != null) {
                final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
                InterfaceC32730Eu1<FieldError> interfaceC32730Eu1 = new InterfaceC32730Eu1<FieldError>() { // from class: com.stripe.android.uicore.elements.AddressController$error$lambda$2$$inlined$combine$1

                    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
                    /* renamed from: com.stripe.android.uicore.elements.AddressController$error$lambda$2$$inlined$combine$1$2 */
                    /* loaded from: classes7.dex */
                    public static final class C194282 extends Lambda implements Function0<FieldError[]> {
                        final /* synthetic */ InterfaceC32730Eu1[] $flowArray;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C194282(InterfaceC32730Eu1[] interfaceC32730Eu1Arr) {
                            super(0);
                            this.$flowArray = interfaceC32730Eu1Arr;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final FieldError[] invoke() {
                            return new FieldError[this.$flowArray.length];
                        }
                    }

                    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressController$error$lambda$2$$inlined$combine$1$3", m28418f = "AddressController.kt", m28417i = {}, m28416l = {292}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                    @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 AddressController.kt\ncom/stripe/android/uicore/elements/AddressController\n*L\n1#1,332:1\n28#2:333\n*E\n"})
                    /* renamed from: com.stripe.android.uicore.elements.AddressController$error$lambda$2$$inlined$combine$1$3 */
                    /* loaded from: classes7.dex */
                    public static final class C194293 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super FieldError>, FieldError[], Continuation<? super Unit>, Object> {
                        private /* synthetic */ Object L$0;
                        /* synthetic */ Object L$1;
                        int label;

                        public C194293(Continuation continuation) {
                            super(3, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(InterfaceC33198Gu1<? super FieldError> interfaceC33198Gu1, FieldError[] fieldErrorArr, Continuation<? super Unit> continuation) {
                            C194293 c194293 = new C194293(continuation);
                            c194293.L$0 = interfaceC33198Gu1;
                            c194293.L$1 = fieldErrorArr;
                            return c194293.invokeSuspend(Unit.INSTANCE);
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
                    public Object collect(InterfaceC33198Gu1<? super FieldError> interfaceC33198Gu12, Continuation continuation) {
                        Object coroutine_suspended2;
                        InterfaceC32730Eu1[] interfaceC32730Eu1Arr2 = interfaceC32730Eu1Arr;
                        Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu12, interfaceC32730Eu1Arr2, new C194282(interfaceC32730Eu1Arr2), new C194293(null), continuation);
                        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (m86325a == coroutine_suspended2) {
                            return m86325a;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (C36708Vu1.m79252s(interfaceC33198Gu1, interfaceC32730Eu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        return Unit.INSTANCE;
    }
}

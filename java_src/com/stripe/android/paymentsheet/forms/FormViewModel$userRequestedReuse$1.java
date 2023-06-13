package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m28432d2 = {"", "Lcom/stripe/android/uicore/elements/FormElement;", "elementsList", "", "showCheckbox", "LEu1;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.FormViewModel$userRequestedReuse$1", m28418f = "FormViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel$userRequestedReuse$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,194:1\n1549#2:195\n1620#2,3:196\n287#3:199\n288#3:204\n37#4:200\n36#4,3:201\n106#5:205\n*S KotlinDebug\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel$userRequestedReuse$1\n*L\n143#1:195\n143#1:196,3\n142#1:199\n142#1:204\n142#1:200\n142#1:201,3\n142#1:205\n*E\n"})
/* loaded from: classes7.dex */
public final class FormViewModel$userRequestedReuse$1 extends SuspendLambda implements Function3<List<? extends FormElement>, Boolean, Continuation<? super InterfaceC32730Eu1<? extends PaymentSelection.CustomerRequestedSave>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public FormViewModel$userRequestedReuse$1(Continuation<? super FormViewModel$userRequestedReuse$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends FormElement> list, Boolean bool, Continuation<? super InterfaceC32730Eu1<? extends PaymentSelection.CustomerRequestedSave>> continuation) {
        return invoke(list, bool.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        List list;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final boolean z = this.Z$0;
            List<FormElement> list2 = (List) this.L$0;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (FormElement formElement : list2) {
                arrayList.add(formElement.getFormFieldValueFlow());
            }
            list = CollectionsKt___CollectionsKt.toList(arrayList);
            Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
            if (array != null) {
                final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
                return new InterfaceC32730Eu1<PaymentSelection.CustomerRequestedSave>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$userRequestedReuse$1$invokeSuspend$$inlined$combine$1

                    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
                    /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$userRequestedReuse$1$invokeSuspend$$inlined$combine$1$2 */
                    /* loaded from: classes7.dex */
                    public static final class C192162 extends Lambda implements Function0<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]> {
                        final /* synthetic */ InterfaceC32730Eu1[] $flowArray;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C192162(InterfaceC32730Eu1[] interfaceC32730Eu1Arr) {
                            super(0);
                            this.$flowArray = interfaceC32730Eu1Arr;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                            return new List[this.$flowArray.length];
                        }
                    }

                    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.FormViewModel$userRequestedReuse$1$invokeSuspend$$inlined$combine$1$3", m28418f = "FormViewModel.kt", m28417i = {}, m28416l = {292}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                    @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel$userRequestedReuse$1\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n145#2,2:333\n147#2:338\n148#2:343\n149#2,8:347\n159#2:356\n766#3:335\n857#3,2:336\n1549#3:339\n1620#3,3:340\n1549#3:344\n1620#3,2:345\n1622#3:355\n*S KotlinDebug\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel$userRequestedReuse$1\n*L\n146#1:335\n146#1:336,2\n147#1:339\n147#1:340,3\n148#1:344\n148#1:345,2\n148#1:355\n*E\n"})
                    /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$userRequestedReuse$1$invokeSuspend$$inlined$combine$1$3 */
                    /* loaded from: classes7.dex */
                    public static final class C192173 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super PaymentSelection.CustomerRequestedSave>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $showCheckbox$inlined;
                        private /* synthetic */ Object L$0;
                        /* synthetic */ Object L$1;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C192173(Continuation continuation, boolean z) {
                            super(3, continuation);
                            this.$showCheckbox$inlined = z;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(InterfaceC33198Gu1<? super PaymentSelection.CustomerRequestedSave> interfaceC33198Gu1, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] listArr, Continuation<? super Unit> continuation) {
                            C192173 c192173 = new C192173(continuation, this.$showCheckbox$inlined);
                            c192173.L$0 = interfaceC33198Gu1;
                            c192173.L$1 = listArr;
                            return c192173.invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended;
                            List list;
                            List flatten;
                            int collectionSizeOrDefault;
                            int collectionSizeOrDefault2;
                            Object firstOrNull;
                            PaymentSelection.CustomerRequestedSave customerRequestedSave;
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
                                list = ArraysKt___ArraysKt.toList((List[]) ((Object[]) this.L$1));
                                flatten = CollectionsKt__IterablesKt.flatten(list);
                                ArrayList<Pair> arrayList = new ArrayList();
                                for (Object obj2 : flatten) {
                                    if (Intrinsics.areEqual(((Pair) obj2).getFirst(), IdentifierSpec.Companion.getSaveForFutureUse())) {
                                        arrayList.add(obj2);
                                    }
                                }
                                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                ArrayList<Boolean> arrayList2 = new ArrayList(collectionSizeOrDefault);
                                for (Pair pair : arrayList) {
                                    arrayList2.add(Boxing.boxBoolean(Boolean.parseBoolean(((FormFieldEntry) pair.getSecond()).getValue())));
                                }
                                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                                for (Boolean bool : arrayList2) {
                                    boolean booleanValue = bool.booleanValue();
                                    if (this.$showCheckbox$inlined) {
                                        if (booleanValue) {
                                            customerRequestedSave = PaymentSelection.CustomerRequestedSave.RequestReuse;
                                        } else {
                                            customerRequestedSave = PaymentSelection.CustomerRequestedSave.RequestNoReuse;
                                        }
                                    } else {
                                        customerRequestedSave = PaymentSelection.CustomerRequestedSave.NoRequest;
                                    }
                                    arrayList3.add(customerRequestedSave);
                                }
                                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList3);
                                PaymentSelection.CustomerRequestedSave customerRequestedSave2 = (PaymentSelection.CustomerRequestedSave) firstOrNull;
                                if (customerRequestedSave2 == null) {
                                    customerRequestedSave2 = PaymentSelection.CustomerRequestedSave.NoRequest;
                                }
                                this.label = 1;
                                if (interfaceC33198Gu1.emit(customerRequestedSave2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // p000.InterfaceC32730Eu1
                    public Object collect(InterfaceC33198Gu1<? super PaymentSelection.CustomerRequestedSave> interfaceC33198Gu1, Continuation continuation) {
                        Object coroutine_suspended;
                        InterfaceC32730Eu1[] interfaceC32730Eu1Arr2 = interfaceC32730Eu1Arr;
                        Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, interfaceC32730Eu1Arr2, new C192162(interfaceC32730Eu1Arr2), new C192173(null, z), continuation);
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
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(List<? extends FormElement> list, boolean z, Continuation<? super InterfaceC32730Eu1<? extends PaymentSelection.CustomerRequestedSave>> continuation) {
        FormViewModel$userRequestedReuse$1 formViewModel$userRequestedReuse$1 = new FormViewModel$userRequestedReuse$1(continuation);
        formViewModel$userRequestedReuse$1.L$0 = list;
        formViewModel$userRequestedReuse$1.Z$0 = z;
        return formViewModel$userRequestedReuse$1.invokeSuspend(Unit.INSTANCE);
    }
}

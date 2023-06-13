package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.core.Logger;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "Lcom/stripe/android/model/PaymentMethod;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2", m28418f = "CustomerApiRepository.kt", m28417i = {}, m28416l = {52}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class CustomerApiRepository$getPaymentMethods$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super List<? extends PaymentMethod>>, Object> {
    final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
    final /* synthetic */ List<PaymentMethod.Type> $types;
    int label;
    final /* synthetic */ CustomerApiRepository this$0;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "Lcom/stripe/android/model/PaymentMethod;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2$1", m28418f = "CustomerApiRepository.kt", m28417i = {0, 0}, m28416l = {70}, m28415m = "invokeSuspend", m28414n = {"$this$supervisorScope", "destination$iv$iv"}, m28413s = {"L$0", "L$2"})
    @SourceDebugExtension({"SMAP\nCustomerApiRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerApiRepository.kt\ncom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1549#2:99\n1620#2,3:100\n1549#2:103\n1620#2,3:104\n*S KotlinDebug\n*F\n+ 1 CustomerApiRepository.kt\ncom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$2$1\n*L\n53#1:99\n53#1:100,3\n68#1:103\n68#1:104,3\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2$1 */
    /* loaded from: classes7.dex */
    public static final class C192911 extends SuspendLambda implements Function2<ZC0, Continuation<? super List<? extends PaymentMethod>>, Object> {
        final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
        final /* synthetic */ List<PaymentMethod.Type> $types;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ CustomerApiRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C192911(List<? extends PaymentMethod.Type> list, CustomerApiRepository customerApiRepository, PaymentSheet.CustomerConfiguration customerConfiguration, Continuation<? super C192911> continuation) {
            super(2, continuation);
            this.$types = list;
            this.this$0 = customerApiRepository;
            this.$customerConfig = customerConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C192911 c192911 = new C192911(this.$types, this.this$0, this.$customerConfig, continuation);
            c192911.L$0 = obj;
            return c192911;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super List<PaymentMethod>> continuation) {
            return ((C192911) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
        /* JADX WARN: Type inference failed for: r1v16, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00af -> B:44:0x00b7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c9 -> B:31:0x00d3). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            ZC0 zc0;
            CustomerApiRepository customerApiRepository;
            ArrayList arrayList;
            Iterator it;
            C192911 c192911;
            InterfaceC42190hZ0 m73802b;
            Throwable th;
            ZC0 zc02;
            CustomerApiRepository customerApiRepository2;
            ArrayList arrayList2;
            Iterator it2;
            ArrayList arrayList3;
            Object obj2;
            C192911 c1929112;
            Object m116783constructorimpl;
            List flatten;
            Throwable m116786exceptionOrNullimpl;
            List emptyList;
            boolean m116789isFailureimpl;
            Logger logger;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ?? r1 = (Collection) this.L$4;
                    Iterator it3 = (Iterator) this.L$3;
                    ?? r4 = (Collection) this.L$2;
                    CustomerApiRepository customerApiRepository3 = (CustomerApiRepository) this.L$1;
                    ZC0 zc03 = (ZC0) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        zc02 = zc03;
                        customerApiRepository2 = customerApiRepository3;
                        arrayList2 = r4;
                        it2 = it3;
                        arrayList3 = r1;
                        obj2 = coroutine_suspended;
                        c1929112 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        zc02 = zc03;
                        customerApiRepository2 = customerApiRepository3;
                        arrayList2 = r4;
                        it2 = it3;
                        arrayList3 = r1;
                        obj2 = coroutine_suspended;
                        c1929112 = this;
                        Result.Companion companion = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        emptyList = CollectionsKt__CollectionsKt.emptyList();
                        m116789isFailureimpl = Result.m116789isFailureimpl(m116783constructorimpl);
                        List list = m116783constructorimpl;
                        if (m116789isFailureimpl) {
                        }
                        arrayList3.add((List) list);
                        c192911 = c1929112;
                        coroutine_suspended = obj2;
                        it = it2;
                        arrayList = arrayList2;
                        customerApiRepository = customerApiRepository2;
                        zc0 = zc02;
                        if (!it.hasNext()) {
                        }
                    }
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        emptyList = CollectionsKt__CollectionsKt.emptyList();
                        m116789isFailureimpl = Result.m116789isFailureimpl(m116783constructorimpl);
                        List list2 = m116783constructorimpl;
                        if (m116789isFailureimpl) {
                        }
                        arrayList3.add((List) list2);
                        c192911 = c1929112;
                        coroutine_suspended = obj2;
                        it = it2;
                        arrayList = arrayList2;
                        customerApiRepository = customerApiRepository2;
                        zc0 = zc02;
                        if (!it.hasNext()) {
                        }
                    }
                    m116783constructorimpl = Result.m116783constructorimpl((List) obj);
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl != null) {
                        logger = customerApiRepository2.logger;
                        logger.error("Failed to retrieve payment methods.", m116786exceptionOrNullimpl);
                    }
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    m116789isFailureimpl = Result.m116789isFailureimpl(m116783constructorimpl);
                    List list22 = m116783constructorimpl;
                    if (m116789isFailureimpl) {
                        list22 = emptyList;
                    }
                    arrayList3.add((List) list22);
                    c192911 = c1929112;
                    coroutine_suspended = obj2;
                    it = it2;
                    arrayList = arrayList2;
                    customerApiRepository = customerApiRepository2;
                    zc0 = zc02;
                    if (!it.hasNext()) {
                        InterfaceC42190hZ0 interfaceC42190hZ0 = (InterfaceC42190hZ0) it.next();
                        try {
                        } catch (Throwable th4) {
                            zc02 = zc0;
                            customerApiRepository2 = customerApiRepository;
                            arrayList2 = arrayList;
                            obj2 = coroutine_suspended;
                            c1929112 = c192911;
                            th = th4;
                            it2 = it;
                            arrayList3 = arrayList2;
                            Result.Companion companion22 = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            emptyList = CollectionsKt__CollectionsKt.emptyList();
                            m116789isFailureimpl = Result.m116789isFailureimpl(m116783constructorimpl);
                            List list222 = m116783constructorimpl;
                            if (m116789isFailureimpl) {
                            }
                            arrayList3.add((List) list222);
                            c192911 = c1929112;
                            coroutine_suspended = obj2;
                            it = it2;
                            arrayList = arrayList2;
                            customerApiRepository = customerApiRepository2;
                            zc0 = zc02;
                            if (!it.hasNext()) {
                            }
                        }
                        Result.Companion companion3 = Result.Companion;
                        c192911.L$0 = zc0;
                        c192911.L$1 = customerApiRepository;
                        c192911.L$2 = arrayList;
                        c192911.L$3 = it;
                        c192911.L$4 = arrayList;
                        c192911.label = 1;
                        Object mo29821k = interfaceC42190hZ0.mo29821k(c192911);
                        if (mo29821k == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zc02 = zc0;
                        customerApiRepository2 = customerApiRepository;
                        arrayList2 = arrayList;
                        obj2 = coroutine_suspended;
                        c1929112 = c192911;
                        obj = mo29821k;
                        it2 = it;
                        arrayList3 = arrayList2;
                        m116783constructorimpl = Result.m116783constructorimpl((List) obj);
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        emptyList = CollectionsKt__CollectionsKt.emptyList();
                        m116789isFailureimpl = Result.m116789isFailureimpl(m116783constructorimpl);
                        List list2222 = m116783constructorimpl;
                        if (m116789isFailureimpl) {
                        }
                        arrayList3.add((List) list2222);
                        c192911 = c1929112;
                        coroutine_suspended = obj2;
                        it = it2;
                        arrayList = arrayList2;
                        customerApiRepository = customerApiRepository2;
                        zc0 = zc02;
                        if (!it.hasNext()) {
                            flatten = CollectionsKt__IterablesKt.flatten(arrayList);
                            return flatten;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc04 = (ZC0) this.L$0;
                List<PaymentMethod.Type> list3 = this.$types;
                CustomerApiRepository customerApiRepository4 = this.this$0;
                PaymentSheet.CustomerConfiguration customerConfiguration = this.$customerConfig;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
                for (PaymentMethod.Type type : list3) {
                    m73802b = Z30.m73802b(zc04, null, null, new CustomerApiRepository$getPaymentMethods$2$1$1$1(customerApiRepository4, customerConfiguration, type, null), 3, null);
                    arrayList4.add(m73802b);
                }
                CustomerApiRepository customerApiRepository5 = this.this$0;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
                zc0 = zc04;
                customerApiRepository = customerApiRepository5;
                arrayList = new ArrayList(collectionSizeOrDefault2);
                it = arrayList4.iterator();
                c192911 = this;
                if (!it.hasNext()) {
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super List<? extends PaymentMethod>> continuation) {
            return invoke2(zc0, (Continuation<? super List<PaymentMethod>>) continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomerApiRepository$getPaymentMethods$2(List<? extends PaymentMethod.Type> list, CustomerApiRepository customerApiRepository, PaymentSheet.CustomerConfiguration customerConfiguration, Continuation<? super CustomerApiRepository$getPaymentMethods$2> continuation) {
        super(2, continuation);
        this.$types = list;
        this.this$0 = customerApiRepository;
        this.$customerConfig = customerConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerApiRepository$getPaymentMethods$2(this.$types, this.this$0, this.$customerConfig, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super List<PaymentMethod>> continuation) {
        return ((CustomerApiRepository$getPaymentMethods$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
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
            C192911 c192911 = new C192911(this.$types, this.this$0, this.$customerConfig, null);
            this.label = 1;
            obj = XU5.m76945c(c192911, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super List<? extends PaymentMethod>> continuation) {
        return invoke2(zc0, (Continuation<? super List<PaymentMethod>>) continuation);
    }
}

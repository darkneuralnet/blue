package com.stripe.android.view;

import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LVs2;", "Lkotlin/Result;", "", "Lcom/stripe/android/model/ShippingMethod;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$1", m28418f = "PaymentFlowViewModel.kt", m28417i = {0}, m28416l = {71, 89}, m28415m = "invokeSuspend", m28414n = {"$this$liveData"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class PaymentFlowViewModel$validateShippingInformation$1 extends SuspendLambda implements Function2<InterfaceC36691Vs2<Result<? extends List<? extends ShippingMethod>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentSessionConfig.ShippingInformationValidator $shippingInfoValidator;
    final /* synthetic */ ShippingInformation $shippingInformation;
    final /* synthetic */ PaymentSessionConfig.ShippingMethodsFactory $shippingMethodsFactory;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentFlowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewModel$validateShippingInformation$1(PaymentFlowViewModel paymentFlowViewModel, PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, ShippingInformation shippingInformation, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, Continuation<? super PaymentFlowViewModel$validateShippingInformation$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentFlowViewModel;
        this.$shippingInfoValidator = shippingInformationValidator;
        this.$shippingInformation = shippingInformation;
        this.$shippingMethodsFactory = shippingMethodsFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentFlowViewModel$validateShippingInformation$1 paymentFlowViewModel$validateShippingInformation$1 = new PaymentFlowViewModel$validateShippingInformation$1(this.this$0, this.$shippingInfoValidator, this.$shippingInformation, this.$shippingMethodsFactory, continuation);
        paymentFlowViewModel$validateShippingInformation$1.L$0 = obj;
        return paymentFlowViewModel$validateShippingInformation$1;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC36691Vs2<Result<List<ShippingMethod>>> interfaceC36691Vs2, Continuation<? super Unit> continuation) {
        return ((PaymentFlowViewModel$validateShippingInformation$1) create(interfaceC36691Vs2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        InterfaceC36691Vs2 interfaceC36691Vs2;
        CoroutineContext coroutineContext;
        List<ShippingMethod> emptyList;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC36691Vs2 = (InterfaceC36691Vs2) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            interfaceC36691Vs2 = (InterfaceC36691Vs2) this.L$0;
            coroutineContext = this.this$0.workContext;
            PaymentFlowViewModel$validateShippingInformation$1$result$1 paymentFlowViewModel$validateShippingInformation$1$result$1 = new PaymentFlowViewModel$validateShippingInformation$1$result$1(this.$shippingInfoValidator, this.$shippingInformation, this.$shippingMethodsFactory, null);
            this.L$0 = interfaceC36691Vs2;
            this.label = 1;
            obj = X30.m77504g(coroutineContext, paymentFlowViewModel$validateShippingInformation$1$result$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Object m116792unboximpl = ((Result) obj).m116792unboximpl();
        PaymentFlowViewModel paymentFlowViewModel = this.this$0;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        if (!Result.m116789isFailureimpl(m116792unboximpl)) {
            emptyList = m116792unboximpl;
        }
        paymentFlowViewModel.setShippingMethods$payments_core_release(emptyList);
        Result m116782boximpl = Result.m116782boximpl(m116792unboximpl);
        this.L$0 = null;
        this.label = 2;
        if (interfaceC36691Vs2.emit(m116782boximpl, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC36691Vs2<Result<? extends List<? extends ShippingMethod>>> interfaceC36691Vs2, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC36691Vs2<Result<List<ShippingMethod>>>) interfaceC36691Vs2, continuation);
    }
}

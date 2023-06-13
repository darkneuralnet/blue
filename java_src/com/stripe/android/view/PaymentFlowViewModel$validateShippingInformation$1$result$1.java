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
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lkotlin/Result;", "", "Lcom/stripe/android/model/ShippingMethod;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$1$result$1", m28418f = "PaymentFlowViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PaymentFlowViewModel$validateShippingInformation$1$result$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Result<? extends List<? extends ShippingMethod>>>, Object> {
    final /* synthetic */ PaymentSessionConfig.ShippingInformationValidator $shippingInfoValidator;
    final /* synthetic */ ShippingInformation $shippingInformation;
    final /* synthetic */ PaymentSessionConfig.ShippingMethodsFactory $shippingMethodsFactory;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewModel$validateShippingInformation$1$result$1(PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, ShippingInformation shippingInformation, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, Continuation<? super PaymentFlowViewModel$validateShippingInformation$1$result$1> continuation) {
        super(2, continuation);
        this.$shippingInfoValidator = shippingInformationValidator;
        this.$shippingInformation = shippingInformation;
        this.$shippingMethodsFactory = shippingMethodsFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentFlowViewModel$validateShippingInformation$1$result$1 paymentFlowViewModel$validateShippingInformation$1$result$1 = new PaymentFlowViewModel$validateShippingInformation$1$result$1(this.$shippingInfoValidator, this.$shippingInformation, this.$shippingMethodsFactory, continuation);
        paymentFlowViewModel$validateShippingInformation$1$result$1.L$0 = obj;
        return paymentFlowViewModel$validateShippingInformation$1$result$1;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super Result<? extends List<ShippingMethod>>> continuation) {
        return ((PaymentFlowViewModel$validateShippingInformation$1$result$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m116783constructorimpl;
        Object m116783constructorimpl2;
        List<ShippingMethod> list;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            if (this.$shippingInfoValidator.isValid(this.$shippingInformation)) {
                PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory = this.$shippingMethodsFactory;
                ShippingInformation shippingInformation = this.$shippingInformation;
                try {
                    Result.Companion companion = Result.Companion;
                    if (shippingMethodsFactory != null) {
                        list = shippingMethodsFactory.create(shippingInformation);
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = CollectionsKt__CollectionsKt.emptyList();
                    }
                    m116783constructorimpl2 = Result.m116783constructorimpl(list);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m116783constructorimpl2 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator = this.$shippingInfoValidator;
                ShippingInformation shippingInformation2 = this.$shippingInformation;
                try {
                    Result.Companion companion3 = Result.Companion;
                    m116783constructorimpl = Result.m116783constructorimpl(shippingInformationValidator.getErrorMessage(shippingInformation2));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl == null) {
                    m116786exceptionOrNullimpl = new RuntimeException((String) m116783constructorimpl);
                }
                m116783constructorimpl2 = Result.m116783constructorimpl(ResultKt.createFailure(m116786exceptionOrNullimpl));
            }
            return Result.m116782boximpl(m116783constructorimpl2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Result<? extends List<? extends ShippingMethod>>> continuation) {
        return invoke2(zc0, (Continuation<? super Result<? extends List<ShippingMethod>>>) continuation);
    }
}

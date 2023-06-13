package com.stripe.android.view;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LVs2;", "Lcom/stripe/android/model/BankStatuses;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.view.FpxViewModel$getFpxBankStatues$1", m28418f = "FpxViewModel.kt", m28417i = {}, m28416l = {25, 23}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class FpxViewModel$getFpxBankStatues$1 extends SuspendLambda implements Function2<InterfaceC36691Vs2<BankStatuses>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FpxViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpxViewModel$getFpxBankStatues$1(FpxViewModel fpxViewModel, Continuation<? super FpxViewModel$getFpxBankStatues$1> continuation) {
        super(2, continuation);
        this.this$0 = fpxViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FpxViewModel$getFpxBankStatues$1 fpxViewModel$getFpxBankStatues$1 = new FpxViewModel$getFpxBankStatues$1(this.this$0, continuation);
        fpxViewModel$getFpxBankStatues$1.L$0 = obj;
        return fpxViewModel$getFpxBankStatues$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC36691Vs2<BankStatuses> interfaceC36691Vs2, Continuation<? super Unit> continuation) {
        return ((FpxViewModel$getFpxBankStatues$1) create(interfaceC36691Vs2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [Vs2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Vs2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [Vs2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        ?? r1;
        StripeRepository stripeRepository;
        String str;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            r1 = i;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r12 = (InterfaceC36691Vs2) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = r12;
        } else {
            ResultKt.throwOnFailure(obj);
            ?? r13 = (InterfaceC36691Vs2) this.L$0;
            FpxViewModel fpxViewModel = this.this$0;
            Result.Companion companion2 = Result.Companion;
            stripeRepository = fpxViewModel.stripeRepository;
            str = fpxViewModel.publishableKey;
            ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
            this.L$0 = r13;
            this.label = 1;
            obj = stripeRepository.getFpxBankStatus$payments_core_release(options, this);
            i = r13;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        m116783constructorimpl = Result.m116783constructorimpl((BankStatuses) obj);
        r1 = i;
        BankStatuses bankStatuses = new BankStatuses(null, 1, null);
        boolean m116789isFailureimpl = Result.m116789isFailureimpl(m116783constructorimpl);
        BankStatuses bankStatuses2 = m116783constructorimpl;
        if (m116789isFailureimpl) {
            bankStatuses2 = bankStatuses;
        }
        this.L$0 = null;
        this.label = 2;
        if (r1.emit(bankStatuses2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

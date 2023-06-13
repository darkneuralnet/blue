package com.stripe.android.stripe3ds2.views;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m28432d2 = {"LVs2;", "", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1", m28418f = "ChallengeActivityViewModel.kt", m28417i = {}, m28416l = {61, 60}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ChallengeActivityViewModel$getTimeout$1 extends SuspendLambda implements Function2<InterfaceC36691Vs2<Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChallengeActivityViewModel this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "isTimeout", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1", m28418f = "ChallengeActivityViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1 */
    /* loaded from: classes7.dex */
    public static final class C193471 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        public C193471(Continuation<? super C193471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C193471 c193471 = new C193471(continuation);
            c193471.Z$0 = ((Boolean) obj).booleanValue();
            return c193471;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
            return ((C193471) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivityViewModel$getTimeout$1(ChallengeActivityViewModel challengeActivityViewModel, Continuation<? super ChallengeActivityViewModel$getTimeout$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChallengeActivityViewModel$getTimeout$1 challengeActivityViewModel$getTimeout$1 = new ChallengeActivityViewModel$getTimeout$1(this.this$0, continuation);
        challengeActivityViewModel$getTimeout$1.L$0 = obj;
        return challengeActivityViewModel$getTimeout$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC36691Vs2<Boolean> interfaceC36691Vs2, Continuation<? super Unit> continuation) {
        return ((ChallengeActivityViewModel$getTimeout$1) create(interfaceC36691Vs2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        InterfaceC36691Vs2 interfaceC36691Vs2;
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
            InterfaceC32730Eu1<Boolean> timeout = this.this$0.transactionTimer.getTimeout();
            C193471 c193471 = new C193471(null);
            this.L$0 = interfaceC36691Vs2;
            this.label = 1;
            obj = C36708Vu1.m79245z(timeout, c193471, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.L$0 = null;
        this.label = 2;
        if (interfaceC36691Vs2.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

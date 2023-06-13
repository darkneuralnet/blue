package com.stripe.android.link.p042ui.verification;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.ui.verification.VerificationViewModel$init$1", m28418f = "VerificationViewModel.kt", m28417i = {}, m28416l = {78}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$init$1 */
/* loaded from: classes7.dex */
public final class VerificationViewModel$init$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ VerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationViewModel$init$1(VerificationViewModel verificationViewModel, Continuation<? super VerificationViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = verificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationViewModel$init$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((VerificationViewModel$init$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        InterfaceC49220tP5 interfaceC49220tP5;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            interfaceC49220tP5 = this.this$0.otpCode;
            final VerificationViewModel verificationViewModel = this.this$0;
            InterfaceC33198Gu1<String> interfaceC33198Gu1 = new InterfaceC33198Gu1<String>() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$init$1.1
                @Override // p000.InterfaceC33198Gu1
                public /* bridge */ /* synthetic */ Object emit(String str, Continuation continuation) {
                    return emit2(str, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(String str, Continuation<? super Unit> continuation) {
                    if (str != null) {
                        VerificationViewModel.this.onVerificationCodeEntered(str);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (interfaceC49220tP5.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}

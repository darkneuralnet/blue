package com.stripe.android.payments.bankaccount.p044ui;

import com.stripe.android.payments.bankaccount.p044ui.CollectBankAccountViewEffect;
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
@DebugMetadata(m28419c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$1", m28418f = "CollectBankAccountActivity.kt", m28417i = {}, m28416l = {35}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$1 */
/* loaded from: classes7.dex */
public final class CollectBankAccountActivity$onCreate$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CollectBankAccountActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountActivity$onCreate$1(CollectBankAccountActivity collectBankAccountActivity, Continuation<? super CollectBankAccountActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = collectBankAccountActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectBankAccountActivity$onCreate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((CollectBankAccountActivity$onCreate$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        CollectBankAccountViewModel viewModel;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            viewModel = this.this$0.getViewModel();
            InterfaceC36280Ty5<CollectBankAccountViewEffect> viewEffect = viewModel.getViewEffect();
            final CollectBankAccountActivity collectBankAccountActivity = this.this$0;
            InterfaceC33198Gu1<CollectBankAccountViewEffect> interfaceC33198Gu1 = new InterfaceC33198Gu1<CollectBankAccountViewEffect>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$1.1
                @Override // p000.InterfaceC33198Gu1
                public /* bridge */ /* synthetic */ Object emit(CollectBankAccountViewEffect collectBankAccountViewEffect, Continuation continuation) {
                    return emit2(collectBankAccountViewEffect, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(CollectBankAccountViewEffect collectBankAccountViewEffect, Continuation<? super Unit> continuation) {
                    if (collectBankAccountViewEffect instanceof CollectBankAccountViewEffect.OpenConnectionsFlow) {
                        CollectBankAccountActivity.this.launch((CollectBankAccountViewEffect.OpenConnectionsFlow) collectBankAccountViewEffect);
                    } else if (collectBankAccountViewEffect instanceof CollectBankAccountViewEffect.FinishWithResult) {
                        CollectBankAccountActivity.this.launch((CollectBankAccountViewEffect.FinishWithResult) collectBankAccountViewEffect);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (viewEffect.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}

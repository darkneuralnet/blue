package com.stripe.android.stripe3ds2.transaction;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ImmediateTimeoutTransactionTimer;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "", "start", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEu1;", "", "timeout", "LEu1;", "getTimeout", "()LEu1;", "<init>", "()V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class ImmediateTimeoutTransactionTimer implements TransactionTimer {
    private final InterfaceC32730Eu1<Boolean> timeout = C36708Vu1.m79281G(Boolean.TRUE);

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    public InterfaceC32730Eu1<Boolean> getTimeout() {
        return this.timeout;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    public Object start(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}

package com.stripe.android.stripe3ds2.transaction;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "", "", "start", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEu1;", "", "getTimeout", "()LEu1;", "timeout", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public interface TransactionTimer {
    InterfaceC32730Eu1<Boolean> getTimeout();

    Object start(Continuation<? super Unit> continuation);
}

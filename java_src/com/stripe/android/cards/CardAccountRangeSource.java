package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/cards/CardAccountRangeSource;", "", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getAccountRanges", "LEu1;", "", "getLoading", "()LEu1;", "loading", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public interface CardAccountRangeSource {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardAccountRangeSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardAccountRangeSource.kt\ncom/stripe/android/cards/CardAccountRangeSource$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n288#2,2:22\n*S KotlinDebug\n*F\n+ 1 CardAccountRangeSource.kt\ncom/stripe/android/cards/CardAccountRangeSource$DefaultImpls\n*L\n10#1:22,2\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object getAccountRange(CardAccountRangeSource cardAccountRangeSource, CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation) {
            CardAccountRangeSource$getAccountRange$1 cardAccountRangeSource$getAccountRange$1;
            Object coroutine_suspended;
            int i;
            List list;
            if (continuation instanceof CardAccountRangeSource$getAccountRange$1) {
                cardAccountRangeSource$getAccountRange$1 = (CardAccountRangeSource$getAccountRange$1) continuation;
                int i2 = cardAccountRangeSource$getAccountRange$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cardAccountRangeSource$getAccountRange$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = cardAccountRangeSource$getAccountRange$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cardAccountRangeSource$getAccountRange$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            unvalidated = (CardNumber.Unvalidated) cardAccountRangeSource$getAccountRange$1.L$0;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        cardAccountRangeSource$getAccountRange$1.L$0 = unvalidated;
                        cardAccountRangeSource$getAccountRange$1.label = 1;
                        obj = cardAccountRangeSource.getAccountRanges(unvalidated, cardAccountRangeSource$getAccountRange$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    list = (List) obj;
                    Object obj2 = null;
                    if (list != null) {
                        return null;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((AccountRange) next).component1().matches(unvalidated)) {
                            obj2 = next;
                            break;
                        }
                    }
                    return (AccountRange) obj2;
                }
            }
            cardAccountRangeSource$getAccountRange$1 = new CardAccountRangeSource$getAccountRange$1(continuation);
            Object obj3 = cardAccountRangeSource$getAccountRange$1.result;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = cardAccountRangeSource$getAccountRange$1.label;
            if (i == 0) {
            }
            list = (List) obj3;
            Object obj22 = null;
            if (list != null) {
            }
        }
    }

    Object getAccountRange(CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation);

    Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation);

    InterfaceC32730Eu1<Boolean> getLoading();
}

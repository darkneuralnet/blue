package com.stripe.android;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.PossibleBrands;
import com.stripe.android.networking.StripeRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/model/PossibleBrands;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.Stripe$retrievePossibleBrands$2", m28418f = "Stripe.kt", m28417i = {}, m28416l = {1820}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nStripe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stripe.kt\ncom/stripe/android/Stripe$retrievePossibleBrands$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1910:1\n1549#2:1911\n1620#2,3:1912\n*S KotlinDebug\n*F\n+ 1 Stripe.kt\ncom/stripe/android/Stripe$retrievePossibleBrands$2\n*L\n1828#1:1911\n1828#1:1912,3\n*E\n"})
/* loaded from: classes6.dex */
public final class Stripe$retrievePossibleBrands$2 extends SuspendLambda implements Function1<Continuation<? super PossibleBrands>, Object> {
    final /* synthetic */ String $cardNumber;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$retrievePossibleBrands$2(Stripe stripe, String str, Continuation<? super Stripe$retrievePossibleBrands$2> continuation) {
        super(1, continuation);
        this.this$0 = stripe;
        this.$cardNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new Stripe$retrievePossibleBrands$2(this.this$0, this.$cardNumber, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ArrayList arrayList;
        Set set;
        List list;
        List<AccountRange> accountRanges;
        int collectionSizeOrDefault;
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
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            String str = this.$cardNumber;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.this$0.getStripeAccountId$payments_core_release(), null, 4, null);
            this.label = 1;
            obj = stripeRepository$payments_core_release.retrieveCardMetadata(str, options, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CardMetadata cardMetadata = (CardMetadata) obj;
        if (cardMetadata != null && (accountRanges = cardMetadata.getAccountRanges()) != null) {
            List<AccountRange> list2 = accountRanges;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (AccountRange accountRange : list2) {
                arrayList.add(accountRange.getBrand());
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        list = CollectionsKt___CollectionsKt.toList(set);
        return new PossibleBrands(list);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super PossibleBrands> continuation) {
        return ((Stripe$retrievePossibleBrands$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

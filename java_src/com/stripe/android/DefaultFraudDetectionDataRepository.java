package com.stripe.android;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.networking.DefaultFraudDetectionDataRequestFactory;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.networking.FraudDetectionDataRequestFactory;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataRepository;", "Lcom/stripe/android/FraudDetectionDataRepository;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "localStore", "Lcom/stripe/android/FraudDetectionDataStore;", "fraudDetectionDataRequestFactory", "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "(Lcom/stripe/android/FraudDetectionDataStore;Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlin/coroutines/CoroutineContext;)V", "cachedFraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "getCached", "getLatest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "", "save", "fraudDetectionData", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class DefaultFraudDetectionDataRepository implements FraudDetectionDataRepository {
    private FraudDetectionData cachedFraudDetectionData;
    private final FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory;
    private final FraudDetectionDataStore localStore;
    private final StripeNetworkClient stripeNetworkClient;
    private final CoroutineContext workContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultFraudDetectionDataRepository(Context context) {
        this(context, (CoroutineContext) null, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public FraudDetectionData getCached() {
        FraudDetectionData fraudDetectionData = this.cachedFraudDetectionData;
        if (!Stripe.Companion.getAdvancedFraudSignalsEnabled()) {
            return null;
        }
        return fraudDetectionData;
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public Object getLatest(Continuation<? super FraudDetectionData> continuation) {
        return X30.m77504g(this.workContext, new DefaultFraudDetectionDataRepository$getLatest$2(this, null), continuation);
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public void refresh() {
        if (Stripe.Companion.getAdvancedFraudSignalsEnabled()) {
            X30.m77507d(C37824aD0.m71790a(this.workContext), null, null, new DefaultFraudDetectionDataRepository$refresh$1(this, null), 3, null);
        }
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public void save(FraudDetectionData fraudDetectionData) {
        Intrinsics.checkNotNullParameter(fraudDetectionData, "fraudDetectionData");
        this.cachedFraudDetectionData = fraudDetectionData;
        this.localStore.save(fraudDetectionData);
    }

    public DefaultFraudDetectionDataRepository(FraudDetectionDataStore localStore, FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory, StripeNetworkClient stripeNetworkClient, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(localStore, "localStore");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRequestFactory, "fraudDetectionDataRequestFactory");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.localStore = localStore;
        this.fraudDetectionDataRequestFactory = fraudDetectionDataRequestFactory;
        this.stripeNetworkClient = stripeNetworkClient;
        this.workContext = workContext;
    }

    public /* synthetic */ DefaultFraudDetectionDataRepository(Context context, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? T41.m84377b() : coroutineContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultFraudDetectionDataRepository(Context context, CoroutineContext workContext) {
        this(new DefaultFraudDetectionDataStore(context, workContext), new DefaultFraudDetectionDataRequestFactory(context), new DefaultStripeNetworkClient(workContext, null, null, 0, null, 30, null), workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }
}

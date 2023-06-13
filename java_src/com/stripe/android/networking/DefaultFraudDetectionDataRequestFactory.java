package com.stripe.android.networking;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;", "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "fraudDetectionDataRequestParamsFactory", "Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;", "(Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;)V", "create", "Lcom/stripe/android/networking/FraudDetectionDataRequest;", "arg", "Lcom/stripe/android/networking/FraudDetectionData;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultFraudDetectionDataRequestFactory implements FraudDetectionDataRequestFactory {
    private final FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory;

    public DefaultFraudDetectionDataRequestFactory(FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory) {
        Intrinsics.checkNotNullParameter(fraudDetectionDataRequestParamsFactory, "fraudDetectionDataRequestParamsFactory");
        this.fraudDetectionDataRequestParamsFactory = fraudDetectionDataRequestParamsFactory;
    }

    @Override // com.stripe.android.networking.FraudDetectionDataRequestFactory
    public FraudDetectionDataRequest create(FraudDetectionData fraudDetectionData) {
        String str;
        Map createParams$payments_core_release = this.fraudDetectionDataRequestParamsFactory.createParams$payments_core_release(fraudDetectionData);
        if (fraudDetectionData != null) {
            str = fraudDetectionData.getGuid$payments_core_release();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return new FraudDetectionDataRequest(createParams$payments_core_release, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRequestFactory(Context context) {
        this(new FraudDetectionDataRequestParamsFactory(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

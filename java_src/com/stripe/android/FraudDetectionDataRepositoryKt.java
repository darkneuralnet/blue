package com.stripe.android;

import com.stripe.android.core.networking.ResponseJsonKt;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.model.parsers.FraudDetectionDataJsonParser;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"fraudDetectionJsonParser", "Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;", "timestampSupplier", "Lkotlin/Function0;", "", "fraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "Lcom/stripe/android/core/networking/StripeResponse;", "", "payments-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nFraudDetectionDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FraudDetectionDataRepository.kt\ncom/stripe/android/FraudDetectionDataRepositoryKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
/* loaded from: classes6.dex */
public final class FraudDetectionDataRepositoryKt {
    private static final FraudDetectionDataJsonParser fraudDetectionJsonParser;
    private static final Function0<Long> timestampSupplier;

    static {
        FraudDetectionDataRepositoryKt$timestampSupplier$1 fraudDetectionDataRepositoryKt$timestampSupplier$1 = FraudDetectionDataRepositoryKt$timestampSupplier$1.INSTANCE;
        timestampSupplier = fraudDetectionDataRepositoryKt$timestampSupplier$1;
        fraudDetectionJsonParser = new FraudDetectionDataJsonParser(fraudDetectionDataRepositoryKt$timestampSupplier$1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FraudDetectionData fraudDetectionData(StripeResponse<String> stripeResponse) {
        if (!stripeResponse.isOk()) {
            stripeResponse = null;
        }
        if (stripeResponse != null) {
            return fraudDetectionJsonParser.parse(ResponseJsonKt.responseJson(stripeResponse));
        }
        return null;
    }
}

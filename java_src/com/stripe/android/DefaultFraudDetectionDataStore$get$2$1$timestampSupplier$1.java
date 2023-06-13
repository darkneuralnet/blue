package com.stripe.android;

import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class DefaultFraudDetectionDataStore$get$2$1$timestampSupplier$1 extends Lambda implements Function0<Long> {
    final /* synthetic */ JSONObject $json;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataStore$get$2$1$timestampSupplier$1(JSONObject jSONObject) {
        super(0);
        this.$json = jSONObject;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(this.$json.optLong(FraudDetectionData.KEY_TIMESTAMP, -1L));
    }
}

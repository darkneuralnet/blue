package com.stripe.android;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.ApiVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/GooglePayConfig;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "(Lcom/stripe/android/PaymentConfiguration;)V", "publishableKey", "", "connectedAccountId", "(Ljava/lang/String;Ljava/lang/String;)V", "apiVersion", "key", "getKey", "()Ljava/lang/String;", "tokenizationSpecification", "Lorg/json/JSONObject;", "getTokenizationSpecification", "()Lorg/json/JSONObject;", "validPublishableKey", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayConfig.kt\ncom/stripe/android/GooglePayConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
/* loaded from: classes6.dex */
public final class GooglePayConfig {
    public static final int $stable = 0;
    private final String apiVersion;
    private final String connectedAccountId;
    private final String validPublishableKey;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GooglePayConfig(String publishableKey) {
        this(publishableKey, null, 2, null);
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }

    private final String getKey() {
        String str = this.connectedAccountId;
        if (str != null) {
            String str2 = this.validPublishableKey + "/" + str;
            if (str2 != null) {
                return str2;
            }
        }
        return this.validPublishableKey;
    }

    public final JSONObject getTokenizationSpecification() throws JSONException {
        JSONObject put = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "stripe").put("stripe:version", this.apiVersion).put("stripe:publishableKey", getKey()));
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …eKey\", key)\n            )");
        return put;
    }

    @JvmOverloads
    public GooglePayConfig(String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        this.connectedAccountId = str;
        this.validPublishableKey = ApiKeyValidator.Companion.get().requireValid(publishableKey);
        this.apiVersion = ApiVersion.Companion.get().getCode();
    }

    public /* synthetic */ GooglePayConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayConfig(Context context) {
        this(PaymentConfiguration.Companion.getInstance(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private GooglePayConfig(PaymentConfiguration paymentConfiguration) {
        this(paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId());
    }
}

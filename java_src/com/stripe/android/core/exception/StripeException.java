package com.stripe.android.core.exception;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u0000 \u001d2\u00060\u0001j\u0002`\u0002:\u0001\u001dB?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0000H\u0002R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/core/exception/StripeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "stripeError", "Lcom/stripe/android/core/StripeError;", "requestId", "", "statusCode", "", "cause", "", "message", "(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V", "isClientError", "", "()Z", "getRequestId", "()Ljava/lang/String;", "getStatusCode", "()I", "getStripeError", "()Lcom/stripe/android/core/StripeError;", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "typedEquals", "ex", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nStripeException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeException.kt\ncom/stripe/android/core/exception/StripeException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes6.dex */
public abstract class StripeException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final boolean isClientError;
    private final String requestId;
    private final int statusCode;
    private final StripeError stripeError;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/core/exception/StripeException$Companion;", "", "()V", "create", "Lcom/stripe/android/core/exception/StripeException;", "throwable", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StripeException create(Throwable throwable) {
            StripeException aPIException;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (throwable instanceof StripeException) {
                return (StripeException) throwable;
            }
            if (throwable instanceof JSONException) {
                aPIException = new APIException(throwable);
            } else if (throwable instanceof IOException) {
                return APIConnectionException.Companion.create$default(APIConnectionException.Companion, (IOException) throwable, null, 2, null);
            } else {
                if (throwable instanceof IllegalArgumentException) {
                    aPIException = new InvalidRequestException(null, null, 0, throwable.getMessage(), throwable, 7, null);
                } else {
                    aPIException = new APIException(throwable);
                }
            }
            return aPIException;
        }

        private Companion() {
        }
    }

    public StripeException() {
        this(null, null, 0, null, null, 31, null);
    }

    private final boolean typedEquals(StripeException stripeException) {
        if (Intrinsics.areEqual(this.stripeError, stripeException.stripeError) && Intrinsics.areEqual(this.requestId, stripeException.requestId) && this.statusCode == stripeException.statusCode && Intrinsics.areEqual(getMessage(), stripeException.getMessage())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeException) {
            return typedEquals((StripeException) obj);
        }
        return false;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final StripeError getStripeError() {
        return this.stripeError;
    }

    public int hashCode() {
        return Objects.hash(this.stripeError, this.requestId, Integer.valueOf(this.statusCode), getMessage());
    }

    public final boolean isClientError() {
        return this.isClientError;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        List listOfNotNull;
        String joinToString$default;
        String[] strArr = new String[2];
        String str2 = this.requestId;
        if (str2 != null) {
            str = "Request-id: " + str2;
        } else {
            str = null;
        }
        strArr[0] = str;
        strArr[1] = super.toString();
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) strArr);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOfNotNull, "\n", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StripeException(StripeError stripeError, String str, int i, Throwable th, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r11, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : th, (i2 & 16) != 0 ? r11 != null ? r11.getMessage() : null : str2);
        StripeError stripeError2 = (i2 & 1) != 0 ? null : stripeError;
    }

    public StripeException(StripeError stripeError, String str, int i, Throwable th, String str2) {
        super(str2, th);
        this.stripeError = stripeError;
        this.requestId = str;
        this.statusCode = i;
        boolean z = false;
        if (400 <= i && i < 500) {
            z = true;
        }
        this.isClientError = z;
    }
}

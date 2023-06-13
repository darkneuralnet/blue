package com.stripe.android.stripe3ds2.transactions;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0011B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0000\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "protocolError", "Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;", "detail", "", "(Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;Ljava/lang/String;)V", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "description", "(ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "getDetail", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeResponseParseException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final int code;
    private final String description;
    private final String detail;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;", "", "()V", "createInvalidDataElementFormat", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "fieldName", "", "createRequiredDataElementMissing", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ChallengeResponseParseException createInvalidDataElementFormat(String fieldName) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            return new ChallengeResponseParseException(ProtocolError.InvalidDataElementFormat.getCode(), "Data element not in the required format or value is invalid as defined in Table A.1", fieldName);
        }

        @JvmStatic
        public final ChallengeResponseParseException createRequiredDataElementMissing(String fieldName) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            return new ChallengeResponseParseException(ProtocolError.RequiredDataElementMissing.getCode(), "A message element required as defined in Table A.1 is missing from the message.", fieldName);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(int i, String description, String detail) {
        super(i + " - " + description + " (" + detail + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.code = i;
        this.description = description;
        this.detail = detail;
    }

    @JvmStatic
    public static final ChallengeResponseParseException createInvalidDataElementFormat(String str) {
        return Companion.createInvalidDataElementFormat(str);
    }

    @JvmStatic
    public static final ChallengeResponseParseException createRequiredDataElementMissing(String str) {
        return Companion.createRequiredDataElementMissing(str);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetail() {
        return this.detail;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(ProtocolError protocolError, String detail) {
        this(protocolError.getCode(), protocolError.getDescription(), detail);
        Intrinsics.checkNotNullParameter(protocolError, "protocolError");
        Intrinsics.checkNotNullParameter(detail, "detail");
    }
}

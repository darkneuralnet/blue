package com.stripe.android.stripe3ds2.transactions;

import com.amazonaws.services.p026s3.internal.Constants;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "description", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "InvalidMessageReceived", "UnsupportedMessageVersion", "RequiredDataElementMissing", "UnrecognizedCriticalMessageExtensions", "InvalidDataElementFormat", "InvalidTransactionId", "DataDecryptionFailure", "TransactionTimedout", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum ProtocolError {
    InvalidMessageReceived(101, "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes"),
    UnsupportedMessageVersion(102, "Message Version Number received is not valid for the receiving component."),
    RequiredDataElementMissing(201, "A message element required as defined in Table A.1 is missing from the message."),
    UnrecognizedCriticalMessageExtensions(202, "Critical message extension not recognised."),
    InvalidDataElementFormat(203, "Data element not in the required format or value is invalid as defined in Table A.1"),
    InvalidTransactionId(Constants.BUCKET_REDIRECT_STATUS_CODE, "Transaction ID received is not valid for the receiving component."),
    DataDecryptionFailure(302, "Data could not be decrypted by the receiving system due to technical or other reason."),
    TransactionTimedout(402, "Transaction timed-out.");
    
    private final int code;
    private final String description;

    ProtocolError(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }
}

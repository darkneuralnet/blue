package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m28432d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "", "toString", "LWD1;", "c", "LWD1;", "getGraphResponse", "()LWD1;", "graphResponse", "errorMessage", "<init>", "(LWD1;Ljava/lang/String;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class FacebookGraphResponseException extends FacebookException {

    /* renamed from: c */
    public final WD1 f69358c;

    public FacebookGraphResponseException(WD1 wd1, String str) {
        super(str);
        this.f69358c = wd1;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        FacebookRequestError facebookRequestError;
        WD1 wd1 = this.f69358c;
        if (wd1 != null) {
            facebookRequestError = wd1.m78704b();
        } else {
            facebookRequestError = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().append(\"…raphResponseException: \")");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.m52861h());
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.m52866b());
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.m52864d());
            sb.append(", message: ");
            sb.append(facebookRequestError.m52865c());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}

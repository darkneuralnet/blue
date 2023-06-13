package com.facebook;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "", "toString", "Lcom/facebook/FacebookRequestError;", "c", "Lcom/facebook/FacebookRequestError;", C17296a.f69688o, "()Lcom/facebook/FacebookRequestError;", "requestError", "errorMessage", "<init>", "(Lcom/facebook/FacebookRequestError;Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class FacebookServiceException extends FacebookException {

    /* renamed from: d */
    public static final C17201a f69383d = new C17201a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: c */
    public final FacebookRequestError f69384c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lcom/facebook/FacebookServiceException$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.FacebookServiceException$a */
    /* loaded from: classes5.dex */
    public static final class C17201a {
        private C17201a() {
        }

        public /* synthetic */ C17201a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError requestError, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(requestError, "requestError");
        this.f69384c = requestError;
    }

    /* renamed from: a */
    public final FacebookRequestError m52853a() {
        return this.f69384c;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.f69384c.m52861h() + ", facebookErrorCode: " + this.f69384c.m52866b() + ", facebookErrorType: " + this.f69384c.m52864d() + ", message: " + this.f69384c.m52865c() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}

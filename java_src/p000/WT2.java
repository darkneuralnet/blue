package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m28432d2 = {"LWT2;", "", "", "b", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: WT2 */
/* loaded from: classes5.dex */
public enum WT2 {
    GET("GET"),
    HEAD("HEAD"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    OPTIONS("OPTIONS"),
    TRACE("TRACE"),
    PATCH("PATCH");
    

    /* renamed from: b */
    public final String f41122b;

    WT2(String str) {
        this.f41122b = str;
    }

    /* renamed from: a */
    public final String m78343a() {
        return this.f41122b;
    }
}

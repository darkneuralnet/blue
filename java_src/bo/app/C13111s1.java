package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "", "requestArgs", "", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/lang/String;", "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: bo.app.s1 */
/* loaded from: classes.dex */
public final class C13111s1 {
    /* renamed from: a */
    public static final String m62983a(Object... requestArgs) {
        Intrinsics.checkNotNullParameter(requestArgs, "requestArgs");
        int length = requestArgs.length;
        long j = 1;
        int i = 0;
        while (i < length) {
            Object obj = requestArgs[i];
            i++;
            j *= obj.hashCode();
        }
        String hexString = Long.toHexString(j);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n    request…lement.hashCode()\n    }\n)");
        return hexString;
    }
}

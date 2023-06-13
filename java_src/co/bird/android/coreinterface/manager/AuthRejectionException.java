package co.bird.android.coreinterface.manager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/coreinterface/manager/AuthRejectionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class AuthRejectionException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AuthRejectionException(Request request) {
        super(r0 + " " + r3 + " could not be performed due to: AuthError.Rejected");
        Intrinsics.checkNotNullParameter(request, "request");
        String method = request.method();
        HttpUrl url = request.url();
    }
}

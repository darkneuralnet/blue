package zendesk.core;

import android.content.Context;
import java.io.IOException;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class AcceptLanguageHeaderInterceptor implements Interceptor {
    private Context context;

    public AcceptLanguageHeaderInterceptor(Context context) {
        this.context = context;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Locale currentLocale = DeviceInfo.getCurrentLocale(this.context);
        if (C44504lS5.m27271d(request.header("Accept-Language")) && currentLocale != null) {
            return chain.proceed(request.newBuilder().addHeader("Accept-Language", C32272Cv2.m111342d(currentLocale)).build());
        }
        return chain.proceed(request);
    }
}

package zendesk.core;

import okhttp3.logging.HttpLoggingInterceptor;
/* loaded from: classes8.dex */
public final class ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory implements InterfaceC48812sj1<HttpLoggingInterceptor> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory INSTANCE = new ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return (HttpLoggingInterceptor) C51679xZ3.m5002e(ZendeskApplicationModule.provideHttpLoggingInterceptor());
    }

    @Override // p000.Y94
    public HttpLoggingInterceptor get() {
        return provideHttpLoggingInterceptor();
    }
}

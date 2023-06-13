package zendesk.support.request;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesAsyncMiddlewareFactory implements InterfaceC48812sj1<AsyncMiddleware> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final RequestModule_ProvidesAsyncMiddlewareFactory INSTANCE = new RequestModule_ProvidesAsyncMiddlewareFactory();

        private InstanceHolder() {
        }
    }

    public static RequestModule_ProvidesAsyncMiddlewareFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AsyncMiddleware providesAsyncMiddleware() {
        return (AsyncMiddleware) C51679xZ3.m5002e(RequestModule.providesAsyncMiddleware());
    }

    @Override // p000.Y94
    public AsyncMiddleware get() {
        return providesAsyncMiddleware();
    }
}

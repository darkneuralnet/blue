package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import zendesk.support.request.ComponentPersistence;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesDiskQueueFactory implements InterfaceC48812sj1<ComponentPersistence.PersistenceQueue> {
    private final Y94<ExecutorService> executorServiceProvider;

    public RequestModule_ProvidesDiskQueueFactory(Y94<ExecutorService> y94) {
        this.executorServiceProvider = y94;
    }

    public static RequestModule_ProvidesDiskQueueFactory create(Y94<ExecutorService> y94) {
        return new RequestModule_ProvidesDiskQueueFactory(y94);
    }

    public static ComponentPersistence.PersistenceQueue providesDiskQueue(ExecutorService executorService) {
        return (ComponentPersistence.PersistenceQueue) C51679xZ3.m5002e(RequestModule.providesDiskQueue(executorService));
    }

    @Override // p000.Y94
    public ComponentPersistence.PersistenceQueue get() {
        return providesDiskQueue(this.executorServiceProvider.get());
    }
}

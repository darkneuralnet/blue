package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.ComponentPersistence;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesPersistenceComponentFactory implements InterfaceC48812sj1<ComponentPersistence> {
    private final Y94<ExecutorService> executorServiceProvider;
    private final Y94<ComponentPersistence.PersistenceQueue> queueProvider;
    private final Y94<SupportUiStorage> supportUiStorageProvider;

    public RequestModule_ProvidesPersistenceComponentFactory(Y94<SupportUiStorage> y94, Y94<ComponentPersistence.PersistenceQueue> y942, Y94<ExecutorService> y943) {
        this.supportUiStorageProvider = y94;
        this.queueProvider = y942;
        this.executorServiceProvider = y943;
    }

    public static RequestModule_ProvidesPersistenceComponentFactory create(Y94<SupportUiStorage> y94, Y94<ComponentPersistence.PersistenceQueue> y942, Y94<ExecutorService> y943) {
        return new RequestModule_ProvidesPersistenceComponentFactory(y94, y942, y943);
    }

    public static ComponentPersistence providesPersistenceComponent(SupportUiStorage supportUiStorage, Object obj, ExecutorService executorService) {
        return (ComponentPersistence) C51679xZ3.m5002e(RequestModule.providesPersistenceComponent(supportUiStorage, (ComponentPersistence.PersistenceQueue) obj, executorService));
    }

    @Override // p000.Y94
    public ComponentPersistence get() {
        return providesPersistenceComponent(this.supportUiStorageProvider.get(), this.queueProvider.get(), this.executorServiceProvider.get());
    }
}

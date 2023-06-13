package zendesk.support.request;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import zendesk.belvedere.C31096a;
import zendesk.core.AuthenticationProvider;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesActionFactoryFactory implements InterfaceC48812sj1<ActionFactory> {
    private final Y94<AuthenticationProvider> authProvider;
    private final Y94<C31096a> belvedereProvider;
    private final Y94<SupportBlipsProvider> blipsProvider;
    private final Y94<ExecutorService> executorProvider;
    private final Y94<Executor> mainThreadExecutorProvider;
    private final Y94<RequestProvider> requestProvider;
    private final Y94<SupportSettingsProvider> settingsProvider;
    private final Y94<SupportUiStorage> supportUiStorageProvider;
    private final Y94<UploadProvider> uploadProvider;

    public RequestModule_ProvidesActionFactoryFactory(Y94<RequestProvider> y94, Y94<SupportSettingsProvider> y942, Y94<UploadProvider> y943, Y94<C31096a> y944, Y94<SupportUiStorage> y945, Y94<ExecutorService> y946, Y94<Executor> y947, Y94<AuthenticationProvider> y948, Y94<SupportBlipsProvider> y949) {
        this.requestProvider = y94;
        this.settingsProvider = y942;
        this.uploadProvider = y943;
        this.belvedereProvider = y944;
        this.supportUiStorageProvider = y945;
        this.executorProvider = y946;
        this.mainThreadExecutorProvider = y947;
        this.authProvider = y948;
        this.blipsProvider = y949;
    }

    public static RequestModule_ProvidesActionFactoryFactory create(Y94<RequestProvider> y94, Y94<SupportSettingsProvider> y942, Y94<UploadProvider> y943, Y94<C31096a> y944, Y94<SupportUiStorage> y945, Y94<ExecutorService> y946, Y94<Executor> y947, Y94<AuthenticationProvider> y948, Y94<SupportBlipsProvider> y949) {
        return new RequestModule_ProvidesActionFactoryFactory(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    public static ActionFactory providesActionFactory(RequestProvider requestProvider, SupportSettingsProvider supportSettingsProvider, UploadProvider uploadProvider, C31096a c31096a, SupportUiStorage supportUiStorage, ExecutorService executorService, Executor executor, AuthenticationProvider authenticationProvider, SupportBlipsProvider supportBlipsProvider) {
        return (ActionFactory) C51679xZ3.m5002e(RequestModule.providesActionFactory(requestProvider, supportSettingsProvider, uploadProvider, c31096a, supportUiStorage, executorService, executor, authenticationProvider, supportBlipsProvider));
    }

    @Override // p000.Y94
    public ActionFactory get() {
        return providesActionFactory(this.requestProvider.get(), this.settingsProvider.get(), this.uploadProvider.get(), this.belvedereProvider.get(), this.supportUiStorageProvider.get(), this.executorProvider.get(), this.mainThreadExecutorProvider.get(), this.authProvider.get(), this.blipsProvider.get());
    }
}

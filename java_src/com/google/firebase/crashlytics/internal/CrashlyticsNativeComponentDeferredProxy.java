package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p000.InterfaceC41597gZ0;
/* loaded from: classes6.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {
    private static final NativeSessionFileProvider MISSING_NATIVE_SESSION_FILE_PROVIDER = new MissingNativeSessionFileProvider();
    private final AtomicReference<CrashlyticsNativeComponent> availableNativeComponent = new AtomicReference<>(null);
    private final InterfaceC41597gZ0<CrashlyticsNativeComponent> deferredNativeComponent;

    /* loaded from: classes6.dex */
    public static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        private MissingNativeSessionFileProvider() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getAppFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public CrashlyticsReport.ApplicationExitInfo getApplicationExitInto() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getBinaryImagesFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getDeviceFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getMetadataFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getMinidumpFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getOsFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getSessionFile() {
            return null;
        }
    }

    public CrashlyticsNativeComponentDeferredProxy(InterfaceC41597gZ0<CrashlyticsNativeComponent> interfaceC41597gZ0) {
        this.deferredNativeComponent = interfaceC41597gZ0;
        interfaceC41597gZ0.mo16724a(new InterfaceC41597gZ0.InterfaceC20924a() { // from class: WD0
            @Override // p000.InterfaceC41597gZ0.InterfaceC20924a
            /* renamed from: a */
            public final void mo18368a(X94 x94) {
                CrashlyticsNativeComponentDeferredProxy.this.lambda$new$0(x94);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(X94 x94) {
        Logger.getLogger().m47341d("Crashlytics native component now available.");
        this.availableNativeComponent.set((CrashlyticsNativeComponent) x94.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareNativeSession$1(String str, String str2, long j, StaticSessionData staticSessionData, X94 x94) {
        ((CrashlyticsNativeComponent) x94.get()).prepareNativeSession(str, str2, j, staticSessionData);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public NativeSessionFileProvider getSessionFileProvider(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        if (crashlyticsNativeComponent == null) {
            return MISSING_NATIVE_SESSION_FILE_PROVIDER;
        }
        return crashlyticsNativeComponent.getSessionFileProvider(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        if (crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForCurrentSession()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        if (crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForSession(str)) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void prepareNativeSession(final String str, final String str2, final long j, final StaticSessionData staticSessionData) {
        Logger logger = Logger.getLogger();
        logger.m47335v("Deferring native open session: " + str);
        this.deferredNativeComponent.mo16724a(new InterfaceC41597gZ0.InterfaceC20924a() { // from class: XD0
            @Override // p000.InterfaceC41597gZ0.InterfaceC20924a
            /* renamed from: a */
            public final void mo18368a(X94 x94) {
                CrashlyticsNativeComponentDeferredProxy.lambda$prepareNativeSession$1(str, str2, j, staticSessionData, x94);
            }
        });
    }
}

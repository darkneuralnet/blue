package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
@Keep
/* loaded from: classes6.dex */
public class SessionManager extends AbstractC27053ol {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final C26577nl appStateMonitor;
    private final Set<WeakReference<InterfaceC43007iv5>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.m47053c(), C26577nl.m23239b());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.m47050g()) {
            this.gaugeManager.logGaugeMetadata(perfSession.m47048i(), EnumC23350im.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(EnumC23350im enumC23350im) {
        if (this.perfSession.m47050g()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.m47048i(), enumC23350im);
        }
    }

    private void startOrStopCollectingGauges(EnumC23350im enumC23350im) {
        if (this.perfSession.m47050g()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, enumC23350im);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        EnumC23350im enumC23350im = EnumC23350im.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(enumC23350im);
        startOrStopCollectingGauges(enumC23350im);
    }

    @Override // p000.AbstractC27053ol, p000.C26577nl.InterfaceC26579b
    public void onUpdateAppState(EnumC23350im enumC23350im) {
        super.onUpdateAppState(enumC23350im);
        if (this.appStateMonitor.m23235f()) {
            return;
        }
        if (enumC23350im == EnumC23350im.FOREGROUND) {
            updatePerfSession(enumC23350im);
        } else if (!updatePerfSessionIfExpired()) {
            startOrStopCollectingGauges(enumC23350im);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<InterfaceC43007iv5> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final PerfSession perfSession = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: xv5
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.this.lambda$setApplicationContext$0(context, perfSession);
            }
        });
    }

    @VisibleForTesting
    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void unregisterForSessionUpdates(WeakReference<InterfaceC43007iv5> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(EnumC23350im enumC23350im) {
        synchronized (this.clients) {
            this.perfSession = PerfSession.m47053c();
            Iterator<WeakReference<InterfaceC43007iv5>> it = this.clients.iterator();
            while (it.hasNext()) {
                InterfaceC43007iv5 interfaceC43007iv5 = it.next().get();
                if (interfaceC43007iv5 != null) {
                    interfaceC43007iv5.mo31643a(this.perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(enumC23350im);
        startOrStopCollectingGauges(enumC23350im);
    }

    public boolean updatePerfSessionIfExpired() {
        if (this.perfSession.m47051e()) {
            updatePerfSession(this.appStateMonitor.m23240a());
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, C26577nl c26577nl) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = c26577nl;
        registerForAppState();
    }
}

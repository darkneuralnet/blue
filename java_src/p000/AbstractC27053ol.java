package p000;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import p000.C26577nl;
/* renamed from: ol */
/* loaded from: classes6.dex */
public abstract class AbstractC27053ol implements C26577nl.InterfaceC26579b {
    private final WeakReference<C26577nl.InterfaceC26579b> appStateCallback;
    private final C26577nl appStateMonitor;
    private EnumC23350im currentAppState;
    private boolean isRegisteredForAppState;

    public AbstractC27053ol() {
        this(C26577nl.m23239b());
    }

    public EnumC23350im getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<C26577nl.InterfaceC26579b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.m23236e(i);
    }

    @Override // p000.C26577nl.InterfaceC26579b
    public void onUpdateAppState(EnumC23350im enumC23350im) {
        EnumC23350im enumC23350im2 = this.currentAppState;
        EnumC23350im enumC23350im3 = EnumC23350im.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (enumC23350im2 == enumC23350im3) {
            this.currentAppState = enumC23350im;
        } else if (enumC23350im2 != enumC23350im && enumC23350im != enumC23350im3) {
            this.currentAppState = EnumC23350im.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.m23240a();
        this.appStateMonitor.m23230k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (!this.isRegisteredForAppState) {
            return;
        }
        this.appStateMonitor.m23225p(this.appStateCallback);
        this.isRegisteredForAppState = false;
    }

    public AbstractC27053ol(C26577nl c26577nl) {
        this.isRegisteredForAppState = false;
        this.currentAppState = EnumC23350im.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = c26577nl;
        this.appStateCallback = new WeakReference<>(this);
    }
}

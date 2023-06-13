package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* renamed from: EM8 */
/* loaded from: classes6.dex */
public final class EM8 implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: b */
    public volatile boolean f7355b;

    /* renamed from: c */
    public volatile C32566Eb8 f7356c;

    /* renamed from: d */
    public final /* synthetic */ QM8 f7357d;

    public EM8(QM8 qm8) {
        this.f7357d = qm8;
    }

    /* renamed from: b */
    public final void m109108b(Intent intent) {
        EM8 em8;
        this.f7357d.mo19953e();
        Context mo22255z = this.f7357d.f100966a.mo22255z();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.f7355b) {
                this.f7357d.f100966a.mo22258a().m106889s().m42708a("Connection attempt already in progress");
                return;
            }
            this.f7357d.f100966a.mo22258a().m106889s().m42708a("Using local app measurement service");
            this.f7355b = true;
            em8 = this.f7357d.f30283c;
            connectionTracker.bindService(mo22255z, intent, em8, 129);
        }
    }

    /* renamed from: c */
    public final void m109107c() {
        this.f7357d.mo19953e();
        Context mo22255z = this.f7357d.f100966a.mo22255z();
        synchronized (this) {
            if (this.f7355b) {
                this.f7357d.f100966a.mo22258a().m106889s().m42708a("Connection attempt already in progress");
            } else if (this.f7356c != null && (this.f7356c.isConnecting() || this.f7356c.isConnected())) {
                this.f7357d.f100966a.mo22258a().m106889s().m42708a("Already awaiting connection attempt");
            } else {
                this.f7356c = new C32566Eb8(mo22255z, Looper.getMainLooper(), this, this);
                this.f7357d.f100966a.mo22258a().m106889s().m42708a("Connecting to remote service");
                this.f7355b = true;
                Preconditions.checkNotNull(this.f7356c);
                this.f7356c.checkAvailabilityAndConnect();
            }
        }
    }

    /* renamed from: d */
    public final void m109106d() {
        if (this.f7356c != null && (this.f7356c.isConnected() || this.f7356c.isConnecting())) {
            this.f7356c.disconnect();
        }
        this.f7356c = null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.f7356c);
                this.f7357d.f100966a.mo22257c().m43695w(new VL8(this, (V98) this.f7356c.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f7356c = null;
                this.f7355b = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        C32809Fc8 m89785E = this.f7357d.f100966a.m89785E();
        if (m89785E != null) {
            m89785E.m106888t().m42707b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f7355b = false;
            this.f7356c = null;
        }
        this.f7357d.f100966a.mo22257c().m43695w(new RunnableC49196tM8(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.f7357d.f100966a.mo22258a().m106894n().m42708a("Service connection suspended");
        this.f7357d.f100966a.mo22257c().m43695w(new RunnableC42081hM8(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        EM8 em8;
        V98 c47300q98;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f7355b = false;
                this.f7357d.f100966a.mo22258a().m106893o().m42708a("Service connected with null binder");
                return;
            }
            V98 v98 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof V98) {
                        c47300q98 = (V98) queryLocalInterface;
                    } else {
                        c47300q98 = new C47300q98(iBinder);
                    }
                    v98 = c47300q98;
                    this.f7357d.f100966a.mo22258a().m106889s().m42708a("Bound to IMeasurementService interface");
                } else {
                    this.f7357d.f100966a.mo22258a().m106893o().m42707b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f7357d.f100966a.mo22258a().m106893o().m42708a("Service connect failed to get IMeasurementService");
            }
            if (v98 == null) {
                this.f7355b = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context mo22255z = this.f7357d.f100966a.mo22255z();
                    em8 = this.f7357d.f30283c;
                    connectionTracker.unbindService(mo22255z, em8);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f7357d.f100966a.mo22257c().m43695w(new RunnableC51558xL8(this, v98));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.f7357d.f100966a.mo22258a().m106894n().m42708a("Service disconnected");
        this.f7357d.f100966a.mo22257c().m43695w(new JL8(this, componentName));
    }
}

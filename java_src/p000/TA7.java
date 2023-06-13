package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.zzbq;
import com.google.android.gms.location.zzu;
import java.util.List;
/* renamed from: TA7 */
/* loaded from: classes5.dex */
public final class TA7 extends LA8 {

    /* renamed from: d */
    public final C34401Lx7 f34866d;

    public TA7(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, ClientSettings clientSettings) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, clientSettings);
        this.f34866d = new C34401Lx7(context, this.f20871c);
    }

    /* renamed from: d */
    public final LocationAvailability m84259d() throws RemoteException {
        return this.f34866d.m96094c();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        synchronized (this.f34866d) {
            if (isConnected()) {
                try {
                    this.f34866d.m96083n();
                    this.f34866d.m96082o();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    /* renamed from: e */
    public final void m84258e(zzba zzbaVar, ListenerHolder<LocationCallback> listenerHolder, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        synchronized (this.f34866d) {
            this.f34866d.m96092e(zzbaVar, listenerHolder, interfaceC39354cn7);
        }
    }

    /* renamed from: f */
    public final void m84257f(LocationRequest locationRequest, ListenerHolder<LocationListener> listenerHolder, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        synchronized (this.f34866d) {
            this.f34866d.m96093d(locationRequest, listenerHolder, interfaceC39354cn7);
        }
    }

    /* renamed from: g */
    public final void m84256g(zzba zzbaVar, PendingIntent pendingIntent, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        this.f34866d.m96091f(zzbaVar, pendingIntent, interfaceC39354cn7);
    }

    /* renamed from: h */
    public final void m84255h(LocationRequest locationRequest, PendingIntent pendingIntent, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        this.f34866d.m96090g(locationRequest, pendingIntent, interfaceC39354cn7);
    }

    /* renamed from: i */
    public final void m84254i(ListenerHolder.ListenerKey<LocationListener> listenerKey, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        this.f34866d.m96089h(listenerKey, interfaceC39354cn7);
    }

    /* renamed from: j */
    public final void m84253j(PendingIntent pendingIntent, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        this.f34866d.m96087j(pendingIntent, interfaceC39354cn7);
    }

    /* renamed from: k */
    public final void m84252k(ListenerHolder.ListenerKey<LocationCallback> listenerKey, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        this.f34866d.m96088i(listenerKey, interfaceC39354cn7);
    }

    /* renamed from: l */
    public final void m84251l(boolean z) throws RemoteException {
        this.f34866d.m96086k(z);
    }

    /* renamed from: m */
    public final void m84250m(Location location) throws RemoteException {
        this.f34866d.m96085l(location);
    }

    /* renamed from: n */
    public final void m84249n(InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        this.f34866d.m96084m(interfaceC39354cn7);
    }

    /* renamed from: o */
    public final void m84248o(LocationSettingsRequest locationSettingsRequest, BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder, String str) throws RemoteException {
        boolean z;
        checkConnected();
        boolean z2 = true;
        if (locationSettingsRequest != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "locationSettingsRequest can't be null nor empty.");
        if (resultHolder == null) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "listener can't be null.");
        ((InterfaceC52445yq7) getService()).mo2392z1(locationSettingsRequest, new BinderC41379gA7(resultHolder), null);
    }

    /* renamed from: p */
    public final void m84247p(long j, PendingIntent pendingIntent) throws RemoteException {
        boolean z;
        checkConnected();
        Preconditions.checkNotNull(pendingIntent);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "detectionIntervalMillis must be >= 0");
        ((InterfaceC52445yq7) getService()).mo2395d1(j, true, pendingIntent);
    }

    /* renamed from: q */
    public final void m84246q(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        checkConnected();
        Preconditions.checkNotNull(activityTransitionRequest, "activityTransitionRequest must be specified.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((InterfaceC52445yq7) getService()).mo2394j3(activityTransitionRequest, pendingIntent, new StatusCallback(resultHolder));
    }

    /* renamed from: r */
    public final void m84245r(PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        checkConnected();
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((InterfaceC52445yq7) getService()).mo2393x(pendingIntent, new StatusCallback(resultHolder));
    }

    /* renamed from: s */
    public final void m84244s(PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        Preconditions.checkNotNull(pendingIntent);
        ((InterfaceC52445yq7) getService()).mo2403S0(pendingIntent);
    }

    /* renamed from: t */
    public final void m84243t(PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        checkConnected();
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((InterfaceC52445yq7) getService()).mo2402V(pendingIntent, new StatusCallback(resultHolder));
    }

    /* renamed from: u */
    public final void m84242u(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        checkConnected();
        Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((InterfaceC52445yq7) getService()).mo2409I3(geofencingRequest, pendingIntent, new BinderC32070By7(resultHolder));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* renamed from: v */
    public final void m84241v(zzbq zzbqVar, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        checkConnected();
        Preconditions.checkNotNull(zzbqVar, "removeGeofencingRequest can't be null.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((InterfaceC52445yq7) getService()).mo2408K0(zzbqVar, new BinderC47200pz7(resultHolder));
    }

    /* renamed from: w */
    public final void m84240w(PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        checkConnected();
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((InterfaceC52445yq7) getService()).mo2405P3(pendingIntent, new BinderC47200pz7(resultHolder), getContext().getPackageName());
    }

    /* renamed from: x */
    public final void m84239x(List<String> list, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        boolean z;
        checkConnected();
        if (list != null && list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "geofenceRequestIds can't be null nor empty.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((InterfaceC52445yq7) getService()).mo2406K3((String[]) list.toArray(new String[0]), new BinderC47200pz7(resultHolder), getContext().getPackageName());
    }

    /* renamed from: y */
    public final Location m84238y(String str) throws RemoteException {
        if (ArrayUtils.contains(getAvailableFeatures(), zzu.zzc)) {
            return this.f34866d.m96096a(str);
        }
        return this.f34866d.m96095b();
    }
}

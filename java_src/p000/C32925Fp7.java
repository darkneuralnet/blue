package p000;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzbq;
/* renamed from: Fp7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32925Fp7 extends C45211me7 implements InterfaceC52445yq7 {
    public C32925Fp7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: C */
    public final void mo2410C(zzbc zzbcVar) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, zzbcVar);
        zzx(59, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: I3 */
    public final void mo2409I3(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, InterfaceC35490Qo7 interfaceC35490Qo7) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, geofencingRequest);
        C51000wP7.m6863c(zza, pendingIntent);
        C51000wP7.m6862d(zza, interfaceC35490Qo7);
        zzx(57, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: K0 */
    public final void mo2408K0(zzbq zzbqVar, InterfaceC35490Qo7 interfaceC35490Qo7) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, zzbqVar);
        C51000wP7.m6862d(zza, interfaceC35490Qo7);
        zzx(74, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: K2 */
    public final void mo2407K2(zzl zzlVar) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, zzlVar);
        zzx(75, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: K3 */
    public final void mo2406K3(String[] strArr, InterfaceC35490Qo7 interfaceC35490Qo7, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        C51000wP7.m6862d(zza, interfaceC35490Qo7);
        zza.writeString(str);
        zzx(3, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: P3 */
    public final void mo2405P3(PendingIntent pendingIntent, InterfaceC35490Qo7 interfaceC35490Qo7, String str) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, pendingIntent);
        C51000wP7.m6862d(zza, interfaceC35490Qo7);
        zza.writeString(str);
        zzx(2, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: R2 */
    public final void mo2404R2(Location location) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, location);
        zzx(13, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: S0 */
    public final void mo2403S0(PendingIntent pendingIntent) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, pendingIntent);
        zzx(6, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: V */
    public final void mo2402V(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, pendingIntent);
        C51000wP7.m6862d(zza, iStatusCallback);
        zzx(69, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: W */
    public final Location mo2401W(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzw = zzw(80, zza);
        Location location = (Location) C51000wP7.m6864b(zzw, Location.CREATOR);
        zzw.recycle();
        return location;
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: Y3 */
    public final LocationAvailability mo2400Y3(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzw = zzw(34, zza);
        LocationAvailability locationAvailability = (LocationAvailability) C51000wP7.m6864b(zzw, LocationAvailability.CREATOR);
        zzw.recycle();
        return locationAvailability;
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: Z4 */
    public final void mo2399Z4(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, pendingIntent);
        C51000wP7.m6863c(zza, sleepSegmentRequest);
        C51000wP7.m6862d(zza, iStatusCallback);
        zzx(79, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: b */
    public final Location mo2398b() throws RemoteException {
        Parcel zzw = zzw(7, zza());
        Location location = (Location) C51000wP7.m6864b(zzw, Location.CREATOR);
        zzw.recycle();
        return location;
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: b1 */
    public final void mo2397b1(InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6862d(zza, interfaceC39354cn7);
        zzx(67, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: b2 */
    public final void mo2396b2(boolean z) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6865a(zza, z);
        zzx(12, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: d1 */
    public final void mo2395d1(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        C51000wP7.m6865a(zza, true);
        C51000wP7.m6863c(zza, pendingIntent);
        zzx(5, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: j3 */
    public final void mo2394j3(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, activityTransitionRequest);
        C51000wP7.m6863c(zza, pendingIntent);
        C51000wP7.m6862d(zza, iStatusCallback);
        zzx(72, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: x */
    public final void mo2393x(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, pendingIntent);
        C51000wP7.m6862d(zza, iStatusCallback);
        zzx(73, zza);
    }

    @Override // p000.InterfaceC52445yq7
    /* renamed from: z1 */
    public final void mo2392z1(LocationSettingsRequest locationSettingsRequest, InterfaceC41793gs7 interfaceC41793gs7, String str) throws RemoteException {
        Parcel zza = zza();
        C51000wP7.m6863c(zza, locationSettingsRequest);
        C51000wP7.m6862d(zza, interfaceC41793gs7);
        zza.writeString(null);
        zzx(63, zza);
    }
}

package p000;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
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
/* renamed from: yq7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC52445yq7 extends IInterface {
    /* renamed from: C */
    void mo2410C(zzbc zzbcVar) throws RemoteException;

    /* renamed from: I3 */
    void mo2409I3(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, InterfaceC35490Qo7 interfaceC35490Qo7) throws RemoteException;

    /* renamed from: K0 */
    void mo2408K0(zzbq zzbqVar, InterfaceC35490Qo7 interfaceC35490Qo7) throws RemoteException;

    /* renamed from: K2 */
    void mo2407K2(zzl zzlVar) throws RemoteException;

    /* renamed from: K3 */
    void mo2406K3(String[] strArr, InterfaceC35490Qo7 interfaceC35490Qo7, String str) throws RemoteException;

    /* renamed from: P3 */
    void mo2405P3(PendingIntent pendingIntent, InterfaceC35490Qo7 interfaceC35490Qo7, String str) throws RemoteException;

    /* renamed from: R2 */
    void mo2404R2(Location location) throws RemoteException;

    /* renamed from: S0 */
    void mo2403S0(PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: V */
    void mo2402V(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: W */
    Location mo2401W(String str) throws RemoteException;

    /* renamed from: Y3 */
    LocationAvailability mo2400Y3(String str) throws RemoteException;

    /* renamed from: Z4 */
    void mo2399Z4(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    /* renamed from: b */
    Location mo2398b() throws RemoteException;

    /* renamed from: b1 */
    void mo2397b1(InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException;

    /* renamed from: b2 */
    void mo2396b2(boolean z) throws RemoteException;

    /* renamed from: d1 */
    void mo2395d1(long j, boolean z, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: j3 */
    void mo2394j3(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: x */
    void mo2393x(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: z1 */
    void mo2392z1(LocationSettingsRequest locationSettingsRequest, InterfaceC41793gs7 interfaceC41793gs7, String str) throws RemoteException;
}

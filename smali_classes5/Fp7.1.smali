.class public final LFp7;
.super Lme7;
.source "SourceFile"

# interfaces
.implements Lyq7;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    invoke-direct {p0, p1, v0}, Lme7;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final C(Lcom/google/android/gms/internal/location/zzbc;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x3b

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final I3(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;LQo7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, LwP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x39

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final K0(Lcom/google/android/gms/location/zzbq;LQo7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LwP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x4a

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final K2(Lcom/google/android/gms/internal/location/zzl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x4b

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final K3([Ljava/lang/String;LQo7;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    invoke-static {v0, p2}, LwP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final P3(Landroid/app/PendingIntent;LQo7;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LwP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final R2(Landroid/location/Location;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0xd

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final S0(Landroid/app/PendingIntent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final V(Landroid/app/PendingIntent;Lcom/google/android/gms/common/api/internal/IStatusCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LwP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x45

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final W(Ljava/lang/String;)Landroid/location/Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 p1, 0x50

    invoke-virtual {p0, p1, v0}, Lme7;->zzw(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, LwP7;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final Y3(Ljava/lang/String;)Lcom/google/android/gms/location/LocationAvailability;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 p1, 0x22

    invoke-virtual {p0, p1, v0}, Lme7;->zzw(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/location/LocationAvailability;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, LwP7;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/LocationAvailability;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final Z4(Landroid/app/PendingIntent;Lcom/google/android/gms/location/SleepSegmentRequest;Lcom/google/android/gms/common/api/internal/IStatusCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, LwP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x4f

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final b()Landroid/location/Location;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x7

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lme7;->zzw(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    sget-object v1, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v1}, LwP7;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method

.method public final b1(Lcn7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x43

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final b2(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->a(Landroid/os/Parcel;Z)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final d1(JZLandroid/app/PendingIntent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    const/4 p1, 0x1

    invoke-static {p3, p1}, LwP7;->a(Landroid/os/Parcel;Z)V

    invoke-static {p3, p4}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, p3}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final j3(Lcom/google/android/gms/location/ActivityTransitionRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/common/api/internal/IStatusCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, LwP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x48

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final x(Landroid/app/PendingIntent;Lcom/google/android/gms/common/api/internal/IStatusCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LwP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x49

    invoke-virtual {p0, p1, v0}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final z1(Lcom/google/android/gms/location/LocationSettingsRequest;Lgs7;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lme7;->zza()Landroid/os/Parcel;

    move-result-object p3

    invoke-static {p3, p1}, LwP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p3, p2}, LwP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 p1, 0x3f

    invoke-virtual {p0, p1, p3}, Lme7;->zzx(ILandroid/os/Parcel;)V

    return-void
.end method

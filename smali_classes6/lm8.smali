.class public final Llm8;
.super Lne7;
.source "SourceFile"

# interfaces
.implements LtO1;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.maps.internal.IGoogleMapDelegate"

    invoke-direct {p0, p1, v0}, Lne7;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final A2(Lwl9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x62

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final E1(Lcom/google/android/gms/maps/model/PolylineOptions;)LCi7;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x9

    invoke-virtual {p0, p1, v0}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, LIh7;->d5(Landroid/os/IBinder;)LCi7;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final F1(Lcom/google/android/gms/maps/model/CircleOptions;)LQT8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x23

    invoke-virtual {p0, p1, v0}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, LRN8;->d5(Landroid/os/IBinder;)LQT8;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final G1(LAp7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x1c

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final G3(Ldw7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x1e

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final H1(LWO1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final H2(Lcom/google/android/gms/maps/model/GroundOverlayOptions;)LC99;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lf59;->d5(Landroid/os/IBinder;)LC99;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final I1()F
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.method public final J1(Lcom/google/android/gms/maps/model/MarkerOptions;)LEw9;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0xb

    invoke-virtual {p0, p1, v0}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, LAv9;->d5(Landroid/os/IBinder;)LEw9;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final K1(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->b(Landroid/os/Parcel;Z)V

    const/16 p1, 0x29

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final L1(LWO1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final L2(LSs7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x1d

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final M1()LmP1;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/16 v0, 0x19

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "com.google.android.gms.maps.internal.IUiSettingsDelegate"

    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    instance-of v3, v2, LmP1;

    if-eqz v3, :cond_1

    move-object v1, v2

    check-cast v1, LmP1;

    goto :goto_0

    :cond_1
    new-instance v2, LQO7;

    invoke-direct {v2, v1}, LQO7;-><init>(Landroid/os/IBinder;)V

    move-object v1, v2

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method

.method public final Q1(Lkd9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x63

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final R3(Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->b(Landroid/os/Parcel;Z)V

    const/16 p1, 0x14

    invoke-virtual {p0, p1, v0}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1}, LxP7;->f(Landroid/os/Parcel;)Z

    move-result v0

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return v0
.end method

.method public final U1(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->b(Landroid/os/Parcel;Z)V

    const/16 p1, 0x16

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final a4(Lxy9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x53

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final c0(Lcom/google/android/gms/maps/model/PolygonOptions;)LOf7;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0xa

    invoke-virtual {p0, p1, v0}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, LIy9;->d5(Landroid/os/IBinder;)LOf7;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final clear()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/16 v0, 0xe

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final g4(IIII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p1, 0x27

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final getProjection()LZO1;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/16 v0, 0x1a

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "com.google.android.gms.maps.internal.IProjectionDelegate"

    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    instance-of v3, v2, LZO1;

    if-eqz v3, :cond_1

    move-object v1, v2

    check-cast v1, LZO1;

    goto :goto_0

    :cond_1
    new-instance v2, LdN7;

    invoke-direct {v2, v1}, LdN7;-><init>(Landroid/os/IBinder;)V

    move-object v1, v2

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method

.method public final i3(LOt9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x60

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final k4(Lcom/google/android/gms/maps/model/MapStyleOptions;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x5b

    invoke-virtual {p0, p1, v0}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1}, LxP7;->f(Landroid/os/Parcel;)Z

    move-result v0

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return v0
.end method

.method public final o3(LUG7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x55

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final p2(LHx7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x1f

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final r3(LnA8;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x21

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final r4(LWO1;ILXX7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {v0, p3}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final s2(Ljk7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x56

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final u2(LDI7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x57

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final v2()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/maps/model/CameraPosition;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v1}, LxP7;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method

.method public final v3(Lti7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x20

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final w3(LGq9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x61

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

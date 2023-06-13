.class public final LHZ8;
.super Lne7;
.source "SourceFile"

# interfaces
.implements LC99;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate"

    invoke-direct {p0, p1, v0}, Lne7;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final A3(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->b(Landroid/os/Parcel;Z)V

    const/16 p1, 0xf

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final N1(LC99;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x13

    invoke-virtual {p0, p1, v0}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1}, LxP7;->f(Landroid/os/Parcel;)Z

    move-result v0

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return v0
.end method

.method public final P0(LWO1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x18

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final P2(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final c()LWO1;
    .locals 2
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

    invoke-static {v1}, LWO1$a;->c5(Landroid/os/IBinder;)LWO1;

    move-result-object v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method

.method public final e()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final g1(F)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeFloat(F)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final m()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/16 v0, 0x10

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0}, LxP7;->f(Landroid/os/Parcel;)Z

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.method public final n(LWO1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x15

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final p(F)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeFloat(F)V

    const/16 p1, 0xb

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final zzi()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/16 v0, 0x14

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lne7;->c5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.class public final LQO7;
.super Lne7;
.source "SourceFile"

# interfaces
.implements LmP1;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.maps.internal.IUiSettingsDelegate"

    invoke-direct {p0, p1, v0}, Lne7;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final M4(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->b(Landroid/os/Parcel;Z)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final S3(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->b(Landroid/os/Parcel;Z)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final W2(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->b(Landroid/os/Parcel;Z)V

    const/16 p1, 0x12

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final h2(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->b(Landroid/os/Parcel;Z)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final m4(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lne7;->d5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LxP7;->b(Landroid/os/Parcel;Z)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lne7;->e5(ILandroid/os/Parcel;)V

    return-void
.end method

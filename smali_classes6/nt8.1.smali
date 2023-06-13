.class public abstract Lnt8;
.super LKB7;
.source "SourceFile"

# interfaces
.implements LnA8;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.maps.internal.IInfoWindowAdapter"

    invoke-direct {p0, v0}, LKB7;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c5(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 p4, 0x1

    if-eq p1, p4, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LAv9;->d5(Landroid/os/IBinder;)LEw9;

    move-result-object p1

    invoke-interface {p0, p1}, LnA8;->a(LEw9;)LWO1;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LAv9;->d5(Landroid/os/IBinder;)LEw9;

    move-result-object p1

    invoke-interface {p0, p1}, LnA8;->r(LEw9;)LWO1;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, LxP7;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    :goto_0
    return p4
.end method

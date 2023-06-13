.class public final LpY7;
.super LXe7;
.source "SourceFile"

# interfaces
.implements LGe8;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.integrity.protocol.IIntegrityService"

    invoke-direct {p0, p1, v0}, LXe7;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final e1(Landroid/os/Bundle;Lut8;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, LXe7;->c5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LhQ7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LhQ7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, LXe7;->d5(ILandroid/os/Parcel;)V

    return-void
.end method

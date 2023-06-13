.class public final LlP6;
.super LiO6;
.source "SourceFile"

# interfaces
.implements LBP6;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"

    invoke-direct {p0, p1, v0}, LiO6;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final B1(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, LiO6;->c5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LrO6;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, LiO6;->d5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final k1(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, LiO6;->c5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LrO6;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LrO6;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, LiO6;->d5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final p1(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, LiO6;->c5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LrO6;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, LiO6;->d5(ILandroid/os/Parcel;)V

    return-void
.end method

.class public abstract Ldn7;
.super LKB7;
.source "SourceFile"

# interfaces
.implements LVn7;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.maps.model.internal.ITileProviderDelegate"

    invoke-direct {p0, v0}, LKB7;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static d5(Landroid/os/IBinder;)LVn7;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.maps.model.internal.ITileProviderDelegate"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LVn7;

    if-eqz v1, :cond_1

    check-cast v0, LVn7;

    return-object v0

    :cond_1
    new-instance v0, Ljm7;

    invoke-direct {v0, p0}, Ljm7;-><init>(Landroid/os/IBinder;)V

    return-object v0
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

    if-ne p1, p4, :cond_0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-interface {p0, p1, v0, p2}, LVn7;->Z2(III)Lcom/google/android/gms/maps/model/Tile;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, LxP7;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    return p4

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

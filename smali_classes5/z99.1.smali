.class public final Lz99;
.super Lie7;
.source "SourceFile"

# interfaces
.implements Lc59;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.clearcut.internal.IClearcutLoggerService"

    invoke-direct {p0, p1, v0}, Lie7;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final D(LOT8;Lcom/google/android/gms/clearcut/zze;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lie7;->c5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LzQ7;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, LzQ7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lie7;->d5(ILandroid/os/Parcel;)V

    return-void
.end method

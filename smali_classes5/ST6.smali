.class public final LST6;
.super LxQ6;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.identity.internal.ISignInService"

    invoke-direct {p0, p1, v0}, LxQ6;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c5(Ldd7;Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, LxQ6;->zba()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LtZ6;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, LtZ6;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, LxQ6;->zbb(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final d5(LdR6;Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, LxQ6;->zba()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LtZ6;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, LtZ6;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, LxQ6;->zbb(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final e5(Lcom/google/android/gms/common/api/internal/IStatusCallback;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, LxQ6;->zba()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LtZ6;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, LxQ6;->zbb(ILandroid/os/Parcel;)V

    return-void
.end method

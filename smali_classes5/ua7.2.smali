.class public final Lua7;
.super LxQ6;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    invoke-direct {p0, p1, v0}, LxQ6;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c5(LR97;Lcom/google/android/gms/internal/auth-api/zbp;)V
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

.method public final d5(LR97;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)V
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

.method public final e5(LR97;Lcom/google/android/gms/internal/auth-api/zbu;)V
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

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, LxQ6;->zbb(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final f5(LR97;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, LxQ6;->zba()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LtZ6;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, LxQ6;->zbb(ILandroid/os/Parcel;)V

    return-void
.end method

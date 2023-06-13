.class public final Lxd6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LmP1;


# direct methods
.method public constructor <init>(LmP1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd6;->a:LmP1;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lxd6;->a:LmP1;

    invoke-interface {v0, p1}, LmP1;->S3(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public b(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lxd6;->a:LmP1;

    invoke-interface {v0, p1}, LmP1;->W2(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public c(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lxd6;->a:LmP1;

    invoke-interface {v0, p1}, LmP1;->h2(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public d(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lxd6;->a:LmP1;

    invoke-interface {v0, p1}, LmP1;->M4(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public e(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lxd6;->a:LmP1;

    invoke-interface {v0, p1}, LmP1;->m4(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

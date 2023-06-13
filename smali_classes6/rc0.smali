.class public final Lrc0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LiO1;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/maps/model/CameraPosition;)Lqc0;
    .locals 2

    const-string v0, "cameraPosition must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lqc0;

    invoke-static {}, Lrc0;->g()LiO1;

    move-result-object v1

    invoke-interface {v1, p0}, LiO1;->Y2(Lcom/google/android/gms/maps/model/CameraPosition;)LWO1;

    move-result-object p0

    invoke-direct {v0, p0}, Lqc0;-><init>(LWO1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static b(Lcom/google/android/gms/maps/model/LatLng;)Lqc0;
    .locals 2

    const-string v0, "latLng must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lqc0;

    invoke-static {}, Lrc0;->g()LiO1;

    move-result-object v1

    invoke-interface {v1, p0}, LiO1;->i4(Lcom/google/android/gms/maps/model/LatLng;)LWO1;

    move-result-object p0

    invoke-direct {v0, p0}, Lqc0;-><init>(LWO1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static c(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lqc0;
    .locals 2

    const-string v0, "bounds must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lqc0;

    invoke-static {}, Lrc0;->g()LiO1;

    move-result-object v1

    invoke-interface {v1, p0, p1}, LiO1;->c2(Lcom/google/android/gms/maps/model/LatLngBounds;I)LWO1;

    move-result-object p0

    invoke-direct {v0, p0}, Lqc0;-><init>(LWO1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p1, p0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static d(Lcom/google/android/gms/maps/model/LatLngBounds;III)Lqc0;
    .locals 2

    const-string v0, "bounds must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lqc0;

    invoke-static {}, Lrc0;->g()LiO1;

    move-result-object v1

    invoke-interface {v1, p0, p1, p2, p3}, LiO1;->h0(Lcom/google/android/gms/maps/model/LatLngBounds;III)LWO1;

    move-result-object p0

    invoke-direct {v0, p0}, Lqc0;-><init>(LWO1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p1, p0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static e(Lcom/google/android/gms/maps/model/LatLng;F)Lqc0;
    .locals 2

    const-string v0, "latLng must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lqc0;

    invoke-static {}, Lrc0;->g()LiO1;

    move-result-object v1

    invoke-interface {v1, p0, p1}, LiO1;->u3(Lcom/google/android/gms/maps/model/LatLng;F)LWO1;

    move-result-object p0

    invoke-direct {v0, p0}, Lqc0;-><init>(LWO1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p1, p0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static f(LiO1;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LiO1;

    sput-object p0, Lrc0;->a:LiO1;

    return-void
.end method

.method public static g()LiO1;
    .locals 2

    sget-object v0, Lrc0;->a:LiO1;

    const-string v1, "CameraUpdateFactory is not initialized"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LiO1;

    return-object v0
.end method

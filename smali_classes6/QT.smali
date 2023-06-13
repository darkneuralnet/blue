.class public final LQT;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LMA8;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/graphics/Bitmap;)LPT;
    .locals 2

    const-string v0, "image must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, LPT;

    invoke-static {}, LQT;->d()LMA8;

    move-result-object v1

    invoke-interface {v1, p0}, LMA8;->K(Landroid/graphics/Bitmap;)LWO1;

    move-result-object p0

    invoke-direct {v0, p0}, LPT;-><init>(LWO1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static b(I)LPT;
    .locals 2

    :try_start_0
    new-instance v0, LPT;

    invoke-static {}, LQT;->d()LMA8;

    move-result-object v1

    invoke-interface {v1, p0}, LMA8;->i(I)LWO1;

    move-result-object p0

    invoke-direct {v0, p0}, LPT;-><init>(LWO1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static c(LMA8;)V
    .locals 1

    sget-object v0, LQT;->a:LMA8;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "delegate must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LMA8;

    sput-object p0, LQT;->a:LMA8;

    return-void
.end method

.method public static d()LMA8;
    .locals 2

    sget-object v0, LQT;->a:LMA8;

    const-string v1, "IBitmapDescriptorFactory is not initialized"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMA8;

    return-object v0
.end method

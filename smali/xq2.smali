.class public final Lxq2;
.super Ljb0;
.source "SourceFile"


# instance fields
.field public B:LLifecycleOwner;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Ljb0;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public J()Lna0;
    .locals 4

    iget-object v0, p0, Lxq2;->B:LLifecycleOwner;

    const-string v1, "CamLifecycleController"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string v0, "Lifecycle is not set."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_0
    iget-object v0, p0, Ljb0;->l:Lq64;

    if-nez v0, :cond_1

    const-string v0, "CameraProvider is not ready."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_1
    invoke-virtual {p0}, Ljb0;->g()LYf6;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v2

    :cond_2
    :try_start_0
    iget-object v1, p0, Ljb0;->l:Lq64;

    iget-object v2, p0, Lxq2;->B:LLifecycleOwner;

    iget-object v3, p0, Ljb0;->a:Lic0;

    invoke-interface {v1, v2, v3, v0}, Lq64;->d(LLifecycleOwner;Lic0;LYf6;)Lna0;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public T(LLifecycleOwner;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    iput-object p1, p0, Lxq2;->B:LLifecycleOwner;

    invoke-virtual {p0}, Ljb0;->K()V

    return-void
.end method

.method public U()V
    .locals 1

    invoke-static {}, LO36;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lxq2;->B:LLifecycleOwner;

    iput-object v0, p0, Ljb0;->k:Lna0;

    iget-object v0, p0, Ljb0;->l:Lq64;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lq64;->c()V

    :cond_0
    return-void
.end method

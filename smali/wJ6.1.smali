.class public final LwJ6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LsJ6;


# instance fields
.field public final a:LWa0;

.field public final b:LyJ6;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Landroidx/camera/core/n;

.field public h:Lpa0;

.field public i:Landroidx/camera/core/impl/DeferrableSurface;

.field public j:Landroid/media/ImageWriter;


# direct methods
.method public constructor <init>(LWa0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LwJ6;->c:Z

    iput-boolean v0, p0, LwJ6;->d:Z

    iput-boolean v0, p0, LwJ6;->e:Z

    iput-boolean v0, p0, LwJ6;->f:Z

    iput-object p1, p0, LwJ6;->a:LWa0;

    const/4 v1, 0x4

    invoke-static {p1, v1}, LzJ6;->a(LWa0;I)Z

    move-result p1

    iput-boolean p1, p0, LwJ6;->e:Z

    const-class p1, LxJ6;

    invoke-static {p1}, LS21;->a(Ljava/lang/Class;)LSe4;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, LwJ6;->f:Z

    new-instance p1, LyJ6;

    new-instance v0, LvJ6;

    invoke-direct {v0}, LvJ6;-><init>()V

    const/4 v1, 0x3

    invoke-direct {p1, v1, v0}, LyJ6;-><init>(ILmb5$a;)V

    iput-object p1, p0, LwJ6;->b:LyJ6;

    return-void
.end method

.method public static synthetic h(LwJ6;LKX1;)V
    .locals 0

    invoke-direct {p0, p1}, LwJ6;->m(LKX1;)V

    return-void
.end method

.method public static synthetic i(Landroidx/camera/core/i;)V
    .locals 0

    invoke-static {p0}, LwJ6;->n(Landroidx/camera/core/i;)V

    return-void
.end method

.method private synthetic m(LKX1;)V
    .locals 2

    :try_start_0
    invoke-interface {p1}, LKX1;->g()Landroidx/camera/core/i;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LwJ6;->b:LyJ6;

    invoke-virtual {v0, p1}, LyJ6;->c(Landroidx/camera/core/i;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to acquire latest image IllegalStateException = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ZslControlImpl"

    invoke-static {v0, p1}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public static synthetic n(Landroidx/camera/core/i;)V
    .locals 0

    invoke-interface {p0}, Landroidx/camera/core/i;->close()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/q$b;)V
    .locals 6

    invoke-virtual {p0}, LwJ6;->j()V

    iget-boolean v0, p0, LwJ6;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, LwJ6;->f:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LwJ6;->a:LWa0;

    invoke-virtual {p0, v0}, LwJ6;->k(LWa0;)Ljava/util/Map;

    move-result-object v0

    iget-boolean v1, p0, LwJ6;->e:Z

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, LwJ6;->a:LWa0;

    invoke-virtual {p0, v2, v1}, LwJ6;->l(LWa0;I)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    new-instance v2, Landroidx/camera/core/k;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    const/16 v4, 0x9

    invoke-direct {v2, v3, v0, v1, v4}, Landroidx/camera/core/k;-><init>(IIII)V

    invoke-virtual {v2}, Landroidx/camera/core/k;->n()Lpa0;

    move-result-object v0

    iput-object v0, p0, LwJ6;->h:Lpa0;

    new-instance v0, Landroidx/camera/core/n;

    invoke-direct {v0, v2}, Landroidx/camera/core/n;-><init>(LKX1;)V

    iput-object v0, p0, LwJ6;->g:Landroidx/camera/core/n;

    new-instance v0, LtJ6;

    invoke-direct {v0, p0}, LtJ6;-><init>(LwJ6;)V

    invoke-static {}, LAc0;->c()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroidx/camera/core/k;->d(LKX1$a;Ljava/util/concurrent/Executor;)V

    new-instance v0, LNY1;

    iget-object v2, p0, LwJ6;->g:Landroidx/camera/core/n;

    invoke-virtual {v2}, Landroidx/camera/core/n;->a()Landroid/view/Surface;

    move-result-object v2

    new-instance v3, Landroid/util/Size;

    iget-object v4, p0, LwJ6;->g:Landroidx/camera/core/n;

    invoke-virtual {v4}, Landroidx/camera/core/n;->getWidth()I

    move-result v4

    iget-object v5, p0, LwJ6;->g:Landroidx/camera/core/n;

    invoke-virtual {v5}, Landroidx/camera/core/n;->getHeight()I

    move-result v5

    invoke-direct {v3, v4, v5}, Landroid/util/Size;-><init>(II)V

    invoke-direct {v0, v2, v3, v1}, LNY1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v0, p0, LwJ6;->i:Landroidx/camera/core/impl/DeferrableSurface;

    iget-object v1, p0, LwJ6;->g:Landroidx/camera/core/n;

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LuJ6;

    invoke-direct {v2, v1}, LuJ6;-><init>(Landroidx/camera/core/n;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, LwJ6;->i:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/q$b;->k(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;

    iget-object v0, p0, LwJ6;->h:Lpa0;

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/q$b;->d(Lpa0;)Landroidx/camera/core/impl/q$b;

    new-instance v0, LwJ6$a;

    invoke-direct {v0, p0}, LwJ6$a;-><init>(LwJ6;)V

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/q$b;->j(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroidx/camera/core/impl/q$b;

    new-instance v0, Landroid/hardware/camera2/params/InputConfiguration;

    iget-object v1, p0, LwJ6;->g:Landroidx/camera/core/n;

    invoke-virtual {v1}, Landroidx/camera/core/n;->getWidth()I

    move-result v1

    iget-object v2, p0, LwJ6;->g:Landroidx/camera/core/n;

    invoke-virtual {v2}, Landroidx/camera/core/n;->getHeight()I

    move-result v2

    iget-object v3, p0, LwJ6;->g:Landroidx/camera/core/n;

    invoke-virtual {v3}, Landroidx/camera/core/n;->b()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Landroid/hardware/camera2/params/InputConfiguration;-><init>(III)V

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/q$b;->t(Landroid/hardware/camera2/params/InputConfiguration;)Landroidx/camera/core/impl/q$b;

    :cond_3
    :goto_0
    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LwJ6;->c:Z

    return v0
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, LwJ6;->d:Z

    return-void
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, LwJ6;->c:Z

    return-void
.end method

.method public e()Landroidx/camera/core/i;
    .locals 2

    :try_start_0
    iget-object v0, p0, LwJ6;->b:LyJ6;

    invoke-virtual {v0}, Lwo;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/i;
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "ZslControlImpl"

    const-string v1, "dequeueImageFromBuffer no such element"

    invoke-static {v0, v1}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public f(Landroidx/camera/core/i;)Z
    .locals 3

    invoke-interface {p1}, Landroidx/camera/core/i;->k3()Landroid/media/Image;

    move-result-object p1

    iget-object v0, p0, LwJ6;->j:Landroid/media/ImageWriter;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {v0, p1}, LDY1;->d(Landroid/media/ImageWriter;Landroid/media/Image;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enqueueImageToImageWriter throws IllegalStateException = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ZslControlImpl"

    invoke-static {v0, p1}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return v1
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, LwJ6;->d:Z

    return v0
.end method

.method public final j()V
    .locals 5

    iget-object v0, p0, LwJ6;->b:LyJ6;

    :goto_0
    invoke-virtual {v0}, Lwo;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lwo;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/i;

    invoke-interface {v1}, Landroidx/camera/core/i;->close()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LwJ6;->i:Landroidx/camera/core/impl/DeferrableSurface;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, LwJ6;->g:Landroidx/camera/core/n;

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v3

    new-instance v4, LuJ6;

    invoke-direct {v4, v2}, LuJ6;-><init>(Landroidx/camera/core/n;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iput-object v1, p0, LwJ6;->g:Landroidx/camera/core/n;

    :cond_1
    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->c()V

    iput-object v1, p0, LwJ6;->i:Landroidx/camera/core/impl/DeferrableSurface;

    :cond_2
    iget-object v0, p0, LwJ6;->j:Landroid/media/ImageWriter;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/media/ImageWriter;->close()V

    iput-object v1, p0, LwJ6;->j:Landroid/media/ImageWriter;

    :cond_3
    return-void
.end method

.method public final k(LWa0;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWa0;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    :try_start_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/params/StreamConfigurationMap;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to retrieve StreamConfigurationMap, error = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ZslControlImpl"

    invoke-static {v0, p1}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputFormats()[I

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputFormats()[I

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_2

    aget v5, v1, v4

    invoke-virtual {p1, v5}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputSizes(I)[Landroid/util/Size;

    move-result-object v6

    if-eqz v6, :cond_1

    new-instance v7, LTp0;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, LTp0;-><init>(Z)V

    invoke-static {v6, v7}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aget-object v6, v6, v3

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1
.end method

.method public final l(LWa0;I)Z
    .locals 4

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/params/StreamConfigurationMap;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getValidOutputFormatsForInput(I)[I

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    array-length p2, p1

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_3

    aget v2, p1, v1

    const/16 v3, 0x100

    if-ne v2, v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

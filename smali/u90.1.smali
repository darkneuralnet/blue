.class public final Lu90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFb0;


# instance fields
.field public final a:Lkb0;

.field public final b:Loc0;

.field public final c:Lnc0;

.field public final d:LRb0;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Li51;

.field public final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LJ90;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Loc0;Lic0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/InitializationException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu90;->g:Ljava/util/Map;

    iput-object p2, p0, Lu90;->b:Loc0;

    invoke-virtual {p2}, Loc0;->c()Landroid/os/Handler;

    move-result-object p2

    invoke-static {p1, p2}, LRb0;->b(Landroid/content/Context;Landroid/os/Handler;)LRb0;

    move-result-object p2

    iput-object p2, p0, Lu90;->d:LRb0;

    invoke-static {p1}, Li51;->b(Landroid/content/Context;)Li51;

    move-result-object p1

    iput-object p1, p0, Lu90;->f:Li51;

    invoke-static {p0, p3}, Lhc0;->b(Lu90;Lic0;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu90;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lu90;->e:Ljava/util/List;

    new-instance p1, Lt90;

    invoke-direct {p1, p2}, Lt90;-><init>(LRb0;)V

    iput-object p1, p0, Lu90;->a:Lkb0;

    new-instance p2, Lnc0;

    const/4 p3, 0x1

    invoke-direct {p2, p1, p3}, Lnc0;-><init>(Lkb0;I)V

    iput-object p2, p0, Lu90;->c:Lnc0;

    invoke-interface {p1, p2}, Lkb0;->a(Lkb0$a;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)LLb0;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/CameraUnavailableException;
        }
    .end annotation

    iget-object v0, p0, Lu90;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LF90;

    iget-object v2, p0, Lu90;->d:LRb0;

    invoke-virtual {p0, p1}, Lu90;->f(Ljava/lang/String;)LJ90;

    move-result-object v4

    iget-object v5, p0, Lu90;->a:Lkb0;

    iget-object v6, p0, Lu90;->c:Lnc0;

    iget-object v1, p0, Lu90;->b:Loc0;

    invoke-virtual {v1}, Loc0;->b()Ljava/util/concurrent/Executor;

    move-result-object v7

    iget-object v1, p0, Lu90;->b:Loc0;

    invoke-virtual {v1}, Loc0;->c()Landroid/os/Handler;

    move-result-object v8

    iget-object v9, p0, Lu90;->f:Li51;

    move-object v1, v0

    move-object v3, p1

    invoke-direct/range {v1 .. v9}, LF90;-><init>(LRb0;Ljava/lang/String;LJ90;Lkb0;Lnc0;Ljava/util/concurrent/Executor;Landroid/os/Handler;Li51;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The given camera id is not on the available camera id list."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashSet;

    iget-object v1, p0, Lu90;->e:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public c()Lkb0;
    .locals 1

    iget-object v0, p0, Lu90;->a:Lkb0;

    return-object v0
.end method

.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu90;->g()LRb0;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/InitializationException;
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, Lu90;->h(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Camera "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Camera2CameraFactory"

    invoke-static {v2, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    :goto_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public f(Ljava/lang/String;)LJ90;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/CameraUnavailableException;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lu90;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ90;

    if-nez v0, :cond_0

    new-instance v0, LJ90;

    iget-object v1, p0, Lu90;->d:LRb0;

    invoke-direct {v0, p1, v1}, LJ90;-><init>(Ljava/lang/String;LRb0;)V

    iget-object v1, p0, Lu90;->g:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lpc0;->a(Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;)Landroidx/camera/core/CameraUnavailableException;

    move-result-object p1

    throw p1
.end method

.method public g()LRb0;
    .locals 1

    iget-object v0, p0, Lu90;->d:LRb0;

    return-object v0
.end method

.method public final h(Ljava/lang/String;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/InitializationException;
        }
    .end annotation

    const-string v0, "robolectric"

    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lu90;->d:LRb0;

    invoke-virtual {v0, p1}, LRb0;->c(Ljava/lang/String;)LWa0;

    move-result-object p1

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I
    :try_end_0
    .catch Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    array-length v2, p1

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_2

    aget v4, p1, v3

    if-nez v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v0

    :catch_0
    move-exception p1

    new-instance v0, Landroidx/camera/core/InitializationException;

    invoke-static {p1}, Lpc0;->a(Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;)Landroidx/camera/core/CameraUnavailableException;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/camera/core/InitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

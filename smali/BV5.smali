.class public final LBV5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LCV5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LCV5;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/String;

.field public final d:LT80;

.field public final e:LWa0;

.field public final f:LVi1;

.field public final g:I

.field public h:Z

.field public i:Z

.field public j:LlW5;

.field public final k:Li51;

.field public final l:LKL4;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LRb0;LT80;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/CameraUnavailableException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LBV5;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LBV5;->b:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, LBV5;->h:Z

    iput-boolean v0, p0, LBV5;->i:Z

    new-instance v1, LKL4;

    invoke-direct {v1}, LKL4;-><init>()V

    iput-object v1, p0, LBV5;->l:LKL4;

    invoke-static {p2}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, LBV5;->c:Ljava/lang/String;

    invoke-static {p4}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LT80;

    iput-object p4, p0, LBV5;->d:LT80;

    new-instance p4, LVi1;

    invoke-direct {p4}, LVi1;-><init>()V

    iput-object p4, p0, LBV5;->f:LVi1;

    invoke-static {p1}, Li51;->b(Landroid/content/Context;)Li51;

    move-result-object p4

    iput-object p4, p0, LBV5;->k:Li51;

    :try_start_0
    invoke-virtual {p3, p2}, LRb0;->c(Ljava/lang/String;)LWa0;

    move-result-object p2

    iput-object p2, p0, LBV5;->e:LWa0;

    sget-object p3, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p2, p3}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    iput p3, p0, LBV5;->g:I
    :try_end_0
    .catch Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat; {:try_start_0 .. :try_end_0} :catch_0

    sget-object p3, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p2, p3}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    if-eqz p2, :cond_3

    array-length p3, p2

    :goto_1
    if-ge v0, p3, :cond_3

    aget p4, p2, v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-ne p4, v1, :cond_1

    iput-boolean v2, p0, LBV5;->h:Z

    goto :goto_2

    :cond_1
    const/4 v1, 0x6

    if-ne p4, v1, :cond_2

    iput-boolean v2, p0, LBV5;->i:Z

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, LBV5;->e()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string p2, "android.hardware.camera.concurrent"

    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, LBV5;->d()V

    :cond_4
    invoke-virtual {p0}, LBV5;->f()V

    invoke-virtual {p0}, LBV5;->a()V

    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, Lpc0;->a(Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;)Landroidx/camera/core/CameraUnavailableException;

    move-result-object p1

    throw p1
.end method

.method public static c(Landroid/util/Range;Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p0}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v0

    invoke-static {v0}, LBV5;->l(Landroid/util/Range;)I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p2, p0}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object p0

    invoke-static {p0}, LBV5;->l(Landroid/util/Range;)I

    move-result p0

    int-to-double v2, p0

    invoke-static {p2}, LBV5;->l(Landroid/util/Range;)I

    move-result p0

    int-to-double v4, p0

    div-double v4, v2, v4

    invoke-static {p1}, LBV5;->l(Landroid/util/Range;)I

    move-result p0

    int-to-double v6, p0

    div-double v6, v0, v6

    cmpl-double p0, v2, v0

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    if-lez p0, :cond_1

    cmpl-double p0, v4, v0

    if-gez p0, :cond_0

    cmpl-double p0, v4, v6

    if-ltz p0, :cond_4

    :cond_0
    return-object p2

    :cond_1
    if-nez p0, :cond_3

    cmpl-double p0, v4, v6

    if-lez p0, :cond_2

    return-object p2

    :cond_2
    if-nez p0, :cond_4

    invoke-virtual {p2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le p0, v0, :cond_4

    return-object p2

    :cond_3
    cmpg-double p0, v6, v0

    if-gez p0, :cond_4

    cmpl-double p0, v4, v6

    if-lez p0, :cond_4

    return-object p2

    :cond_4
    return-object p1
.end method

.method public static i(LWa0;ILandroid/util/Size;)I
    .locals 2

    :try_start_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v0}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    invoke-virtual {p0, p1, p2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-double p0, p0

    const-wide v0, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v0, p0

    double-to-int p0, v0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static k(Landroid/util/Range;Landroid/util/Range;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Ranges must not intersect"

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sub-int/2addr p0, p1

    return p0

    :cond_1
    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    sub-int/2addr p1, p0

    return p1
.end method

.method public static l(Landroid/util/Range;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    sub-int/2addr v0, p0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public b(ZLjava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "LDV5;",
            ">;)Z"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object p1, p0, LBV5;->b:Ljava/util/List;

    goto :goto_0

    :cond_0
    iget-object p1, p0, LBV5;->a:Ljava/util/List;

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCV5;

    invoke-virtual {v0, p2}, LCV5;->d(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_2
    return v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, LBV5;->b:Ljava/util/List;

    invoke-static {}, LuE1;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, LBV5;->a:Ljava/util/List;

    iget v1, p0, LBV5;->g:I

    iget-boolean v2, p0, LBV5;->h:Z

    iget-boolean v3, p0, LBV5;->i:Z

    invoke-static {v1, v2, v3}, LuE1;->a(IZZ)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, LBV5;->a:Ljava/util/List;

    iget-object v1, p0, LBV5;->f:LVi1;

    iget-object v2, p0, LBV5;->c:Ljava/lang/String;

    iget v3, p0, LBV5;->g:I

    invoke-virtual {v1, v2, v3}, LVi1;->a(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final f()V
    .locals 6

    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    new-instance v1, Landroid/util/Size;

    const/16 v2, 0x500

    const/16 v3, 0x2d0

    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    iget-object v2, p0, LBV5;->k:Li51;

    invoke-virtual {v2}, Li51;->d()Landroid/util/Size;

    move-result-object v2

    new-instance v3, Landroid/util/Size;

    const/16 v4, 0x780

    const/16 v5, 0x5a0

    invoke-direct {v3, v4, v5}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, LBV5;->m()Landroid/util/Size;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, LlW5;->a(Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;)LlW5;

    move-result-object v0

    iput-object v0, p0, LBV5;->j:LlW5;

    return-void
.end method

.method public final g(Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    mul-int/2addr v2, v3

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    div-int v4, v2, v4

    move v6, v2

    move v5, v3

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_4

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    move v8, v3

    :goto_3
    if-ge v8, v2, :cond_2

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    rem-int v10, v8, v6

    div-int/2addr v10, v4

    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/util/Size;

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v1

    if-ge v5, v7, :cond_3

    add-int/lit8 v6, v5, 0x1

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    div-int v6, v4, v6

    move v11, v6

    move v6, v4

    move v4, v11

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to find supported resolutions."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Landroid/util/Range;I)Landroid/util/Range;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;I)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, LBR5;->a:Landroid/util/Range;

    return-object p1

    :cond_0
    iget-object v0, p0, LBV5;->e:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/util/Range;

    if-nez v0, :cond_1

    sget-object p1, LBR5;->a:Landroid/util/Range;

    return-object p1

    :cond_1
    new-instance v1, Landroid/util/Range;

    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sget-object p1, LBR5;->a:Landroid/util/Range;

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_9

    aget-object v5, v0, v3

    invoke-virtual {v5}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-lt p2, v6, :cond_8

    sget-object v6, LBR5;->a:Landroid/util/Range;

    invoke-virtual {p1, v6}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object p1, v5

    :cond_2
    invoke-virtual {v5, v1}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move-object p1, v5

    goto :goto_2

    :cond_3
    :try_start_0
    invoke-virtual {v5, v1}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v6

    invoke-static {v6}, LBV5;->l(Landroid/util/Range;)I

    move-result v6

    if-nez v4, :cond_4

    move v4, v6

    goto :goto_1

    :cond_4
    if-lt v6, v4, :cond_5

    invoke-static {v1, p1, v5}, LBV5;->c(Landroid/util/Range;Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v6

    invoke-static {v6}, LBV5;->l(Landroid/util/Range;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    move-object v5, p1

    goto :goto_1

    :catch_0
    if-nez v4, :cond_8

    invoke-static {v5, v1}, LBV5;->k(Landroid/util/Range;Landroid/util/Range;)I

    move-result v6

    invoke-static {p1, v1}, LBV5;->k(Landroid/util/Range;Landroid/util/Range;)I

    move-result v7

    if-ge v6, v7, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v5, v1}, LBV5;->k(Landroid/util/Range;Landroid/util/Range;)I

    move-result v6

    invoke-static {p1, v1}, LBV5;->k(Landroid/util/Range;Landroid/util/Range;)I

    move-result v7

    if-ne v6, v7, :cond_8

    invoke-virtual {v5}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-le v6, v7, :cond_7

    goto :goto_1

    :cond_7
    invoke-static {v5}, LBV5;->l(Landroid/util/Range;)I

    move-result v6

    invoke-static {p1}, LBV5;->l(Landroid/util/Range;)I

    move-result v7

    if-ge v6, v7, :cond_8

    :goto_1
    move-object p1, v5

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_9
    :goto_2
    return-object p1
.end method

.method public j(I)Landroid/util/Size;
    .locals 2

    iget-object v0, p0, LBV5;->e:LWa0;

    invoke-virtual {v0}, LWa0;->b()LpR5;

    move-result-object v0

    invoke-virtual {v0}, LpR5;->c()Landroid/hardware/camera2/params/StreamConfigurationMap;

    move-result-object v0

    const/16 v1, 0x22

    if-ne p1, v1, :cond_0

    const-class p1, Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, LTp0;

    invoke-direct {v0}, LTp0;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Size;

    return-object p1
.end method

.method public final m()Landroid/util/Size;
    .locals 3

    :try_start_0
    iget-object v0, p0, LBV5;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, LBV5;->d:LT80;

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, LT80;->b(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LBV5;->d:LT80;

    invoke-interface {v1, v0, v2}, LT80;->a(II)Landroid/media/CamcorderProfile;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    new-instance v0, Landroid/util/Size;

    iget v2, v1, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget v1, v1, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    invoke-direct {v0, v2, v1}, Landroid/util/Size;-><init>(II)V

    return-object v0

    :cond_1
    invoke-virtual {p0, v0}, LBV5;->n(I)Landroid/util/Size;

    move-result-object v0

    return-object v0

    :catch_0
    invoke-virtual {p0}, LBV5;->o()Landroid/util/Size;

    move-result-object v0

    return-object v0
.end method

.method public final n(I)Landroid/util/Size;
    .locals 3

    sget-object v0, LIB5;->d:Landroid/util/Size;

    iget-object v1, p0, LBV5;->d:LT80;

    const/16 v2, 0xa

    invoke-interface {v1, p1, v2}, LT80;->b(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LBV5;->d:LT80;

    invoke-interface {v1, p1, v2}, LT80;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, LBV5;->d:LT80;

    const/16 v2, 0x8

    invoke-interface {v1, p1, v2}, LT80;->b(II)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LBV5;->d:LT80;

    invoke-interface {v1, p1, v2}, LT80;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LBV5;->d:LT80;

    const/16 v2, 0xc

    invoke-interface {v1, p1, v2}, LT80;->b(II)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LBV5;->d:LT80;

    invoke-interface {v1, p1, v2}, LT80;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object v1, p0, LBV5;->d:LT80;

    const/4 v2, 0x6

    invoke-interface {v1, p1, v2}, LT80;->b(II)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LBV5;->d:LT80;

    invoke-interface {v1, p1, v2}, LT80;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    :cond_3
    iget-object v1, p0, LBV5;->d:LT80;

    const/4 v2, 0x5

    invoke-interface {v1, p1, v2}, LT80;->b(II)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, LBV5;->d:LT80;

    invoke-interface {v1, p1, v2}, LT80;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    :cond_4
    iget-object v1, p0, LBV5;->d:LT80;

    const/4 v2, 0x4

    invoke-interface {v1, p1, v2}, LT80;->b(II)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, LBV5;->d:LT80;

    invoke-interface {v1, p1, v2}, LT80;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_6

    new-instance v0, Landroid/util/Size;

    iget v1, p1, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget p1, p1, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    invoke-direct {v0, v1, p1}, Landroid/util/Size;-><init>(II)V

    :cond_6
    return-object v0
.end method

.method public final o()Landroid/util/Size;
    .locals 7

    iget-object v0, p0, LBV5;->e:LWa0;

    invoke-virtual {v0}, LWa0;->b()LpR5;

    move-result-object v0

    invoke-virtual {v0}, LpR5;->c()Landroid/hardware/camera2/params/StreamConfigurationMap;

    move-result-object v0

    const-class v1, Landroid/media/MediaRecorder;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LIB5;->d:Landroid/util/Size;

    return-object v0

    :cond_0
    new-instance v1, LTp0;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, LTp0;-><init>(Z)V

    invoke-static {v0, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v4

    sget-object v5, LIB5;->f:Landroid/util/Size;

    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    move-result v6

    if-gt v4, v6, :cond_1

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    move-result v5

    if-gt v4, v5, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object v0, LIB5;->d:Landroid/util/Size;

    return-object v0
.end method

.method public p(ZLjava/util/List;Ljava/util/Map;)Ljava/util/Map;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lsp;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;)",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "LBR5;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual/range {p0 .. p0}, LBV5;->t()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lsp;

    invoke-virtual {v5}, Lsp;->d()LDV5;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface/range {p3 .. p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/camera/core/impl/s;

    if-eqz v1, :cond_1

    invoke-interface {v6}, Landroidx/camera/core/impl/j;->l()I

    move-result v7

    invoke-virtual {v0, v7}, LBV5;->j(I)Landroid/util/Size;

    move-result-object v7

    :cond_1
    invoke-interface {v6}, Landroidx/camera/core/impl/j;->l()I

    move-result v6

    new-instance v8, Landroid/util/Size;

    const/16 v9, 0x280

    const/16 v10, 0x1e0

    invoke-direct {v8, v9, v10}, Landroid/util/Size;-><init>(II)V

    iget-object v9, v0, LBV5;->j:LlW5;

    invoke-static {v1, v6, v8, v9, v7}, LDV5;->f(ZILandroid/util/Size;LlW5;Landroid/util/Size;)LDV5;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v1, v3}, LBV5;->b(ZLjava/util/List;)Z

    move-result v3

    const-string v5, " New configs: "

    const-string v6, "No supported surface combination is found for camera device - Id : "

    if-eqz v3, :cond_13

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v9, v7

    const v10, 0x7fffffff

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lsp;

    invoke-virtual {v11}, Lsp;->e()Landroid/util/Range;

    move-result-object v12

    invoke-virtual {v0, v12, v9}, LBV5;->r(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;

    move-result-object v9

    invoke-virtual {v11}, Lsp;->b()I

    move-result v12

    invoke-virtual {v11}, Lsp;->c()Landroid/util/Size;

    move-result-object v11

    invoke-virtual {v0, v10, v12, v11}, LBV5;->q(IILandroid/util/Size;)I

    move-result v10

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v4}, LBV5;->s(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/camera/core/impl/s;

    move-object/from16 v14, p3

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/List;

    iget-object v8, v0, LBV5;->l:LKL4;

    invoke-interface {v13}, Landroidx/camera/core/impl/j;->l()I

    move-result v13

    invoke-static {v13}, LDV5;->d(I)LDV5$b;

    move-result-object v13

    invoke-virtual {v8, v13, v15}, LKL4;->a(LDV5$b;Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v11, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {v0, v11}, LBV5;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/camera/core/impl/s;

    invoke-interface {v12, v7}, Landroidx/camera/core/impl/s;->M(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v12

    invoke-virtual {v0, v12, v9}, LBV5;->r(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;

    move-result-object v9

    goto :goto_4

    :cond_5
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v12, v7

    const v11, 0x7fffffff

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_6
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_6

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lsp;

    invoke-virtual/range {v16 .. v16}, Lsp;->d()LDV5;

    move-result-object v7

    invoke-interface {v14, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v16, v8

    move v7, v10

    const/4 v15, 0x0

    :goto_7
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v8

    if-ge v15, v8, :cond_8

    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/util/Size;

    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/Integer;

    move-object/from16 v18, v12

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/camera/core/impl/s;

    if-eqz v1, :cond_7

    move-object/from16 v17, v13

    invoke-interface {v12}, Landroidx/camera/core/impl/j;->l()I

    move-result v13

    invoke-virtual {v0, v13}, LBV5;->j(I)Landroid/util/Size;

    move-result-object v13

    move-object/from16 v19, v5

    goto :goto_8

    :cond_7
    move-object/from16 v17, v13

    move-object/from16 v19, v5

    const/4 v13, 0x0

    :goto_8
    invoke-interface {v12}, Landroidx/camera/core/impl/j;->l()I

    move-result v5

    iget-object v2, v0, LBV5;->j:LlW5;

    invoke-static {v1, v5, v8, v2, v13}, LDV5;->f(ZILandroid/util/Size;LlW5;Landroid/util/Size;)LDV5;

    move-result-object v2

    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v12}, Landroidx/camera/core/impl/j;->l()I

    move-result v2

    invoke-virtual {v0, v7, v2, v8}, LBV5;->q(IILandroid/util/Size;)I

    move-result v7

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, p2

    move-object/from16 v13, v17

    move-object/from16 v12, v18

    move-object/from16 v5, v19

    goto :goto_7

    :cond_8
    move-object/from16 v19, v5

    move-object/from16 v18, v12

    move-object/from16 v17, v13

    if-eqz v9, :cond_9

    if-le v10, v7, :cond_9

    invoke-virtual {v9}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ge v7, v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    const/4 v2, 0x1

    :goto_9
    invoke-virtual {v0, v1, v14}, LBV5;->b(ZLjava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_c

    const v5, 0x7fffffff

    if-ne v11, v5, :cond_a

    goto :goto_a

    :cond_a
    if-ge v11, v7, :cond_b

    :goto_a
    move v11, v7

    move-object/from16 v12, v17

    goto :goto_b

    :cond_b
    move-object/from16 v12, v18

    :goto_b
    if-eqz v2, :cond_d

    move v11, v7

    move-object/from16 v12, v17

    goto :goto_c

    :cond_c
    const v5, 0x7fffffff

    move-object/from16 v12, v18

    :cond_d
    move-object/from16 v2, p2

    move-object/from16 v8, v16

    move-object/from16 v5, v19

    const/4 v7, 0x0

    goto/16 :goto_5

    :cond_e
    move-object/from16 v19, v5

    move-object/from16 v18, v12

    :goto_c
    if-eqz v12, :cond_12

    if-eqz v9, :cond_f

    invoke-virtual {v0, v9, v11}, LBV5;->h(Landroid/util/Range;I)Landroid/util/Range;

    move-result-object v7

    goto :goto_d

    :cond_f
    const/4 v7, 0x0

    :goto_d
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/camera/core/impl/s;

    if-eqz v7, :cond_10

    invoke-interface {v4, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/util/Size;

    invoke-static {v6}, LBR5;->a(Landroid/util/Size;)LBR5$a;

    move-result-object v6

    invoke-virtual {v6, v7}, LBR5$a;->b(Landroid/util/Range;)LBR5$a;

    move-result-object v6

    invoke-virtual {v6}, LBR5$a;->a()LBR5;

    move-result-object v6

    goto :goto_f

    :cond_10
    invoke-interface {v4, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/util/Size;

    invoke-static {v6}, LBR5;->a(Landroid/util/Size;)LBR5$a;

    move-result-object v6

    invoke-virtual {v6}, LBR5$a;->a()LBR5;

    move-result-object v6

    :goto_f
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_11
    return-object v1

    :cond_12
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, LBV5;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " and Hardware level: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, LBV5;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ". May be the specified resolution is too large and not supported. Existing surfaces: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v19

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_13
    move-object v3, v2

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v0, LBV5;->c:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ".  May be attempting to bind too many use cases. Existing surfaces: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final q(IILandroid/util/Size;)I
    .locals 1

    iget-object v0, p0, LBV5;->e:LWa0;

    invoke-static {v0, p2, p3}, LBV5;->i(LWa0;ILandroid/util/Size;)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public final r(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p2, p1}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public final s(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/s<",
            "*>;>;)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/s;

    invoke-interface {v3, v4}, Landroidx/camera/core/impl/s;->r(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/camera/core/impl/s;

    invoke-interface {v5, v4}, Landroidx/camera/core/impl/s;->r(I)I

    move-result v6

    if-ne v2, v6, :cond_3

    invoke-interface {p1, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method public final t()V
    .locals 5

    iget-object v0, p0, LBV5;->k:Li51;

    invoke-virtual {v0}, Li51;->e()V

    iget-object v0, p0, LBV5;->j:LlW5;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LBV5;->f()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LBV5;->k:Li51;

    invoke-virtual {v0}, Li51;->d()Landroid/util/Size;

    move-result-object v0

    iget-object v1, p0, LBV5;->j:LlW5;

    invoke-virtual {v1}, LlW5;->b()Landroid/util/Size;

    move-result-object v1

    iget-object v2, p0, LBV5;->j:LlW5;

    invoke-virtual {v2}, LlW5;->f()Landroid/util/Size;

    move-result-object v2

    iget-object v3, p0, LBV5;->j:LlW5;

    invoke-virtual {v3}, LlW5;->e()Landroid/util/Size;

    move-result-object v3

    iget-object v4, p0, LBV5;->j:LlW5;

    invoke-virtual {v4}, LlW5;->d()Landroid/util/Size;

    move-result-object v4

    invoke-static {v1, v2, v0, v3, v4}, LlW5;->a(Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;)LlW5;

    move-result-object v0

    iput-object v0, p0, LBV5;->j:LlW5;

    :goto_0
    return-void
.end method

.method public u(ZILandroid/util/Size;)LDV5;
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, LBV5;->j(I)Landroid/util/Size;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LBV5;->j:LlW5;

    invoke-static {p1, p2, p3, v1, v0}, LDV5;->f(ZILandroid/util/Size;LlW5;Landroid/util/Size;)LDV5;

    move-result-object p1

    return-object p1
.end method

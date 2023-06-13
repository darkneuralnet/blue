.class public LW56;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, LV56;

    invoke-static {v0}, LS21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, LW56;->a:Z

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/d;)Landroidx/camera/core/impl/d;
    .locals 3

    new-instance v0, Landroidx/camera/core/impl/d$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/d$a;-><init>()V

    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->s(I)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v0, v2}, Landroidx/camera/core/impl/d$a;->f(Landroidx/camera/core/impl/DeferrableSurface;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    new-instance p1, Lja0$a;

    invoke-direct {p1}, Lja0$a;-><init>()V

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    invoke-virtual {p1}, Lja0$a;->a()Lja0;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/List;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CaptureRequest;",
            ">;Z)Z"
        }
    .end annotation

    iget-boolean v0, p0, LW56;->a:Z

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/camera2/CaptureRequest;

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p2, v0}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

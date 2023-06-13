.class public final Lfw5;
.super Landroidx/camera/core/d;
.source "SourceFile"


# instance fields
.field public final e:Ljava/lang/Object;

.field public final f:LwX1;

.field public g:Landroid/graphics/Rect;

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(Landroidx/camera/core/i;Landroid/util/Size;LwX1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/d;-><init>(Landroidx/camera/core/i;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfw5;->e:Ljava/lang/Object;

    if-nez p2, :cond_0

    invoke-super {p0}, Landroidx/camera/core/d;->getWidth()I

    move-result p1

    iput p1, p0, Lfw5;->h:I

    invoke-super {p0}, Landroidx/camera/core/d;->getHeight()I

    move-result p1

    iput p1, p0, Lfw5;->i:I

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p1

    iput p1, p0, Lfw5;->h:I

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p1

    iput p1, p0, Lfw5;->i:I

    :goto_0
    iput-object p3, p0, Lfw5;->f:LwX1;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/i;LwX1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lfw5;-><init>(Landroidx/camera/core/i;Landroid/util/Size;LwX1;)V

    return-void
.end method


# virtual methods
.method public getCropRect()Landroid/graphics/Rect;
    .locals 5

    iget-object v0, p0, Lfw5;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lfw5;->g:Landroid/graphics/Rect;

    if-nez v1, :cond_0

    new-instance v1, Landroid/graphics/Rect;

    invoke-virtual {p0}, Lfw5;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lfw5;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Landroid/graphics/Rect;

    iget-object v2, p0, Lfw5;->g:Landroid/graphics/Rect;

    invoke-direct {v1, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lfw5;->i:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lfw5;->h:I

    return v0
.end method

.method public i1()LwX1;
    .locals 1

    iget-object v0, p0, Lfw5;->f:LwX1;

    return-object v0
.end method

.method public setCropRect(Landroid/graphics/Rect;)V
    .locals 3

    if-eqz p1, :cond_1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Lfw5;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Lfw5;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, p1, v1}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    :cond_0
    move-object p1, v0

    :cond_1
    iget-object v0, p0, Lfw5;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lfw5;->g:Landroid/graphics/Rect;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

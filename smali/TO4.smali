.class public final LTO4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/i;


# instance fields
.field public final b:Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Landroid/graphics/Rect;

.field public f:[Landroidx/camera/core/i$a;

.field public final g:LwX1;


# direct methods
.method public constructor <init>(LMD3;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD3<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LMD3;->c()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-virtual {p1}, LMD3;->b()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {p1}, LMD3;->f()I

    move-result v4

    invoke-virtual {p1}, LMD3;->g()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-virtual {p1}, LMD3;->a()Lxa0;

    move-result-object p1

    invoke-interface {p1}, Lxa0;->getTimestamp()J

    move-result-wide v6

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, LTO4;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Rect;ILandroid/graphics/Matrix;J)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/graphics/Rect;ILandroid/graphics/Matrix;J)V
    .locals 10

    invoke-static {p1}, Landroidx/camera/core/internal/utils/ImageUtil;->d(Landroid/graphics/Bitmap;)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v0, p0

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    move-wide v8, p5

    invoke-direct/range {v0 .. v9}, LTO4;-><init>(Ljava/nio/ByteBuffer;IIILandroid/graphics/Rect;ILandroid/graphics/Matrix;J)V

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;IIILandroid/graphics/Rect;ILandroid/graphics/Matrix;J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LTO4;->b:Ljava/lang/Object;

    iput p3, p0, LTO4;->c:I

    iput p4, p0, LTO4;->d:I

    iput-object p5, p0, LTO4;->e:Landroid/graphics/Rect;

    invoke-static {p8, p9, p6, p7}, LTO4;->b(JILandroid/graphics/Matrix;)LwX1;

    move-result-object p4

    iput-object p4, p0, LTO4;->g:LwX1;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    const/4 p4, 0x1

    new-array p4, p4, [Landroidx/camera/core/i$a;

    mul-int/2addr p3, p2

    invoke-static {p1, p3, p2}, LTO4;->c(Ljava/nio/ByteBuffer;II)Landroidx/camera/core/i$a;

    move-result-object p1

    const/4 p2, 0x0

    aput-object p1, p4, p2

    iput-object p4, p0, LTO4;->f:[Landroidx/camera/core/i$a;

    return-void
.end method

.method public static b(JILandroid/graphics/Matrix;)LwX1;
    .locals 1

    new-instance v0, LTO4$b;

    invoke-direct {v0, p0, p1, p2, p3}, LTO4$b;-><init>(JILandroid/graphics/Matrix;)V

    return-object v0
.end method

.method public static c(Ljava/nio/ByteBuffer;II)Landroidx/camera/core/i$a;
    .locals 1

    new-instance v0, LTO4$a;

    invoke-direct {v0, p1, p2, p0}, LTO4$a;-><init>(IILjava/nio/ByteBuffer;)V

    return-object v0
.end method


# virtual methods
.method public A0()[Landroidx/camera/core/i$a;
    .locals 2

    iget-object v0, p0, LTO4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LTO4;->a()V

    iget-object v1, p0, LTO4;->f:[Landroidx/camera/core/i$a;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, [Landroidx/camera/core/i$a;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a()V
    .locals 3

    iget-object v0, p0, LTO4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LTO4;->f:[Landroidx/camera/core/i$a;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "The image is closed."

    invoke-static {v1, v2}, LHZ3;->j(ZLjava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, LTO4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LTO4;->a()V

    const/4 v1, 0x0

    iput-object v1, p0, LTO4;->f:[Landroidx/camera/core/i$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getCropRect()Landroid/graphics/Rect;
    .locals 2

    iget-object v0, p0, LTO4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LTO4;->a()V

    iget-object v1, p0, LTO4;->e:Landroid/graphics/Rect;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getFormat()I
    .locals 2

    iget-object v0, p0, LTO4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LTO4;->a()V

    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getHeight()I
    .locals 2

    iget-object v0, p0, LTO4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LTO4;->a()V

    iget v1, p0, LTO4;->d:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getWidth()I
    .locals 2

    iget-object v0, p0, LTO4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LTO4;->a()V

    iget v1, p0, LTO4;->c:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public i1()LwX1;
    .locals 2

    iget-object v0, p0, LTO4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LTO4;->a()V

    iget-object v1, p0, LTO4;->g:LwX1;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public k3()Landroid/media/Image;
    .locals 2

    iget-object v0, p0, LTO4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LTO4;->a()V

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public setCropRect(Landroid/graphics/Rect;)V
    .locals 2

    iget-object v0, p0, LTO4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LTO4;->a()V

    if-eqz p1, :cond_0

    iget-object v1, p0, LTO4;->e:Landroid/graphics/Rect;

    invoke-virtual {v1, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

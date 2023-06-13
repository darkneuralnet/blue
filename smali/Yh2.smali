.class public LYh2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZh3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LZh3<",
        "LMD3<",
        "[B>;",
        "LMD3<",
        "Landroidx/camera/core/i;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LMD3;)LMD3;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD3<",
            "[B>;)",
            "LMD3<",
            "Landroidx/camera/core/i;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    new-instance v0, Landroidx/camera/core/n;

    invoke-virtual {p1}, LMD3;->h()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, LMD3;->h()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    const/16 v3, 0x100

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, LMX1;->a(IIII)LKX1;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/core/n;-><init>(LKX1;)V

    invoke-virtual {p1}, LMD3;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v0, v1}, Landroidx/camera/core/ImageProcessingUtil;->e(LKX1;[B)Landroidx/camera/core/i;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/camera/core/n;->m()V

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Landroidx/camera/core/i;

    invoke-virtual {p1}, LMD3;->d()LUh1;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LMD3;->b()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {p1}, LMD3;->f()I

    move-result v5

    invoke-virtual {p1}, LMD3;->g()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-virtual {p1}, LMD3;->a()Lxa0;

    move-result-object v7

    invoke-static/range {v2 .. v7}, LMD3;->k(Landroidx/camera/core/i;LUh1;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    check-cast p1, LMD3;

    invoke-virtual {p0, p1}, LYh2;->a(LMD3;)LMD3;

    move-result-object p1

    return-object p1
.end method

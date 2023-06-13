.class public LUT;
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
        "Landroid/graphics/Bitmap;",
        ">;",
        "LMD3<",
        "Landroid/graphics/Bitmap;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Ls62;


# direct methods
.method public constructor <init>(Ls62;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUT;->a:Ls62;

    return-void
.end method


# virtual methods
.method public a(LMD3;)LMD3;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD3<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "LMD3<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    iget-object v0, p0, LUT;->a:Ls62;

    new-instance v1, LIX1;

    new-instance v2, LTO4;

    invoke-direct {v2, p1}, LTO4;-><init>(LMD3;)V

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, LIX1;-><init>(Landroidx/camera/core/i;I)V

    invoke-virtual {v0, v1}, Ls62;->e(LHX1$a;)LHX1$b;

    move-result-object v0

    invoke-interface {v0}, LHX1$b;->a()Landroidx/camera/core/i;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/camera/core/i;

    invoke-interface {v1}, Landroidx/camera/core/i;->A0()[Landroidx/camera/core/i$a;

    move-result-object v1

    invoke-interface {v0}, Landroidx/camera/core/i;->getWidth()I

    move-result v2

    invoke-interface {v0}, Landroidx/camera/core/i;->getHeight()I

    move-result v0

    invoke-static {v1, v2, v0}, Landroidx/camera/core/internal/utils/ImageUtil;->c([Landroidx/camera/core/i$a;II)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {p1}, LMD3;->d()LUh1;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LMD3;->b()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {p1}, LMD3;->f()I

    move-result v6

    invoke-virtual {p1}, LMD3;->g()Landroid/graphics/Matrix;

    move-result-object v7

    invoke-virtual {p1}, LMD3;->a()Lxa0;

    move-result-object v8

    invoke-static/range {v3 .. v8}, LMD3;->j(Landroid/graphics/Bitmap;LUh1;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;

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

    invoke-virtual {p0, p1}, LUT;->a(LMD3;)LMD3;

    move-result-object p1

    return-object p1
.end method

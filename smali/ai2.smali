.class public Lai2;
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
        "Landroidx/camera/core/i;",
        ">;",
        "Landroidx/camera/core/i;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LMD3;)Landroidx/camera/core/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD3<",
            "Landroidx/camera/core/i;",
            ">;)",
            "Landroidx/camera/core/i;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    invoke-virtual {p1}, LMD3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/i;

    invoke-interface {v0}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object v1

    invoke-interface {v1}, LwX1;->b()LxY5;

    move-result-object v1

    invoke-interface {v0}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object v2

    invoke-interface {v2}, LwX1;->getTimestamp()J

    move-result-wide v2

    invoke-virtual {p1}, LMD3;->f()I

    move-result v4

    invoke-virtual {p1}, LMD3;->g()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-static {v1, v2, v3, v4, v5}, LTY1;->d(LxY5;JILandroid/graphics/Matrix;)LwX1;

    move-result-object v1

    new-instance v2, Lfw5;

    invoke-virtual {p1}, LMD3;->h()Landroid/util/Size;

    move-result-object v3

    invoke-direct {v2, v0, v3, v1}, Lfw5;-><init>(Landroidx/camera/core/i;Landroid/util/Size;LwX1;)V

    invoke-virtual {p1}, LMD3;->b()Landroid/graphics/Rect;

    move-result-object p1

    invoke-interface {v2, p1}, Landroidx/camera/core/i;->setCropRect(Landroid/graphics/Rect;)V

    return-object v2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    check-cast p1, LMD3;

    invoke-virtual {p0, p1}, Lai2;->a(LMD3;)Landroidx/camera/core/i;

    move-result-object p1

    return-object p1
.end method

.class public final Lm80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll80;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0015\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\u0008J!\u0010\u000c\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ)\u0010\u0011\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0014R\u001d\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0016\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u001a"
    }
    d2 = {
        "Lm80;",
        "Ll80;",
        "Landroid/view/View;",
        "view",
        "LhN2;",
        "matrix",
        "",
        "a",
        "(Landroid/view/View;[F)V",
        "d",
        "Landroid/graphics/Matrix;",
        "other",
        "b",
        "([FLandroid/graphics/Matrix;)V",
        "",
        "x",
        "y",
        "c",
        "([FFF)V",
        "",
        "[I",
        "tmpLocation",
        "[F",
        "tmpMatrix",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:[I

.field public final b:[F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lm80;->a:[I

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, LhN2;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v0

    iput-object v0, p0, Lm80;->b:[F

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;[F)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LhN2;->h([F)V

    invoke-virtual {p0, p1, p2}, Lm80;->d(Landroid/view/View;[F)V

    return-void
.end method

.method public final b([FLandroid/graphics/Matrix;)V
    .locals 1

    iget-object v0, p0, Lm80;->b:[F

    invoke-static {v0, p2}, Lbd;->b([FLandroid/graphics/Matrix;)V

    iget-object p2, p0, Lm80;->b:[F

    invoke-static {p1, p2}, Lxc;->b([F[F)V

    return-void
.end method

.method public final c([FFF)V
    .locals 7

    iget-object v0, p0, Lm80;->b:[F

    invoke-static {v0}, LhN2;->h([F)V

    iget-object v1, p0, Lm80;->b:[F

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move v2, p2

    move v3, p3

    invoke-static/range {v1 .. v6}, LhN2;->m([FFFFILjava/lang/Object;)V

    iget-object p2, p0, Lm80;->b:[F

    invoke-static {p1, p2}, Lxc;->b([F[F)V

    return-void
.end method

.method public final d(Landroid/view/View;[F)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0, p2}, Lm80;->d(Landroid/view/View;[F)V

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v0

    int-to-float v0, v0

    neg-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v1

    int-to-float v1, v1

    neg-float v1, v1

    invoke-virtual {p0, p2, v0, v1}, Lm80;->c([FFF)V

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0, p2, v0, v1}, Lm80;->c([FFF)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm80;->a:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    neg-float v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v2

    int-to-float v2, v2

    neg-float v2, v2

    invoke-virtual {p0, p2, v1, v2}, Lm80;->c([FFF)V

    const/4 v1, 0x0

    aget v1, v0, v1

    int-to-float v1, v1

    const/4 v2, 0x1

    aget v0, v0, v2

    int-to-float v0, v0

    invoke-virtual {p0, p2, v1, v0}, Lm80;->c([FFF)V

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "viewMatrix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, Lm80;->b([FLandroid/graphics/Matrix;)V

    :cond_1
    return-void
.end method

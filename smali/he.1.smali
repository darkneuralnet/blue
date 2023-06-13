.class public final Lhe;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u000c\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u001a\u000c\u0010\u0008\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "Landroid/view/View;",
        "LJm2;",
        "layoutNode",
        "",
        "e",
        "",
        "",
        "f",
        "g",
        "type",
        "LH43;",
        "h",
        "(I)I",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final synthetic a(Landroid/view/View;LJm2;)V
    .locals 0

    invoke-static {p0, p1}, Lhe;->e(Landroid/view/View;LJm2;)V

    return-void
.end method

.method public static final synthetic b(I)F
    .locals 0

    invoke-static {p0}, Lhe;->f(I)F

    move-result p0

    return p0
.end method

.method public static final synthetic c(F)F
    .locals 0

    invoke-static {p0}, Lhe;->g(F)F

    move-result p0

    return p0
.end method

.method public static final synthetic d(I)I
    .locals 0

    invoke-static {p0}, Lhe;->h(I)I

    move-result p0

    return p0
.end method

.method public static final e(Landroid/view/View;LJm2;)V
    .locals 3

    invoke-virtual {p1}, LJm2;->h()Lnm2;

    move-result-object p1

    invoke-static {p1}, Lom2;->e(Lnm2;)J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->o(J)F

    move-result p1

    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p1

    invoke-static {v0, v1}, LCe3;->p(J)F

    move-result v0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public static final f(I)F
    .locals 1

    int-to-float p0, p0

    const/4 v0, -0x1

    int-to-float v0, v0

    mul-float/2addr p0, v0

    return p0
.end method

.method public static final g(F)F
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    mul-float/2addr p0, v0

    return p0
.end method

.method public static final h(I)I
    .locals 0

    if-nez p0, :cond_0

    sget-object p0, LH43;->a:LH43$a;

    invoke-virtual {p0}, LH43$a;->a()I

    move-result p0

    goto :goto_0

    :cond_0
    sget-object p0, LH43;->a:LH43$a;

    invoke-virtual {p0}, LH43$a;->b()I

    move-result p0

    :goto_0
    return p0
.end method

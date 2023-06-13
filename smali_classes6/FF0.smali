.class public LFF0;
.super LPM2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFF0$b;
    }
.end annotation


# instance fields
.field public final A:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Liy5;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Liy5;

    invoke-direct {p1}, Liy5;-><init>()V

    :goto_0
    invoke-direct {p0, p1}, LPM2;-><init>(Liy5;)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, LFF0;->A:Landroid/graphics/RectF;

    return-void
.end method

.method public synthetic constructor <init>(Liy5;LFF0$a;)V
    .locals 0

    invoke-direct {p0, p1}, LFF0;-><init>(Liy5;)V

    return-void
.end method

.method public static p0(Liy5;)LFF0;
    .locals 1

    new-instance v0, LFF0$b;

    invoke-direct {v0, p0}, LFF0$b;-><init>(Liy5;)V

    return-object v0
.end method


# virtual methods
.method public q0()Z
    .locals 1

    iget-object v0, p0, LFF0;->A:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public r0()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0, v0}, LFF0;->s0(FFFF)V

    return-void
.end method

.method public s0(FFFF)V
    .locals 2

    iget-object v0, p0, LFF0;->A:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    cmpl-float v1, p1, v1

    if-nez v1, :cond_0

    iget v1, v0, Landroid/graphics/RectF;->top:F

    cmpl-float v1, p2, v1

    if-nez v1, :cond_0

    iget v1, v0, Landroid/graphics/RectF;->right:F

    cmpl-float v1, p3, v1

    if-nez v1, :cond_0

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    cmpl-float v1, p4, v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, LPM2;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public t0(Landroid/graphics/RectF;)V
    .locals 3

    iget v0, p1, Landroid/graphics/RectF;->left:F

    iget v1, p1, Landroid/graphics/RectF;->top:F

    iget v2, p1, Landroid/graphics/RectF;->right:F

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0, v0, v1, v2, p1}, LFF0;->s0(FFFF)V

    return-void
.end method

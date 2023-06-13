.class public LnS3$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LnS3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final b:F

.field public final c:F

.field public final d:J

.field public final e:F

.field public final f:F

.field public final synthetic g:LnS3;


# direct methods
.method public constructor <init>(LnS3;FFFF)V
    .locals 0

    iput-object p1, p0, LnS3$e;->g:LnS3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, LnS3$e;->b:F

    iput p5, p0, LnS3$e;->c:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    iput-wide p4, p0, LnS3$e;->d:J

    iput p2, p0, LnS3$e;->e:F

    iput p3, p0, LnS3$e;->f:F

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, LnS3$e;->d:J

    sub-long/2addr v0, v2

    long-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v2, p0, LnS3$e;->g:LnS3;

    invoke-static {v2}, LnS3;->o(LnS3;)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget-object v1, p0, LnS3$e;->g:LnS3;

    invoke-static {v1}, LnS3;->p(LnS3;)Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v0

    return v0
.end method

.method public run()V
    .locals 5

    invoke-virtual {p0}, LnS3$e;->a()F

    move-result v0

    iget v1, p0, LnS3$e;->e:F

    iget v2, p0, LnS3$e;->f:F

    sub-float/2addr v2, v1

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    iget-object v2, p0, LnS3$e;->g:LnS3;

    invoke-virtual {v2}, LnS3;->K()F

    move-result v2

    div-float/2addr v1, v2

    iget-object v2, p0, LnS3$e;->g:LnS3;

    invoke-static {v2}, LnS3;->n(LnS3;)LQg3;

    move-result-object v2

    iget v3, p0, LnS3$e;->b:F

    iget v4, p0, LnS3$e;->c:F

    invoke-interface {v2, v1, v3, v4}, LQg3;->c(FFF)V

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget-object v0, p0, LnS3$e;->g:LnS3;

    invoke-static {v0}, LnS3;->r(LnS3;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v0, p0}, LUp0;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.class public LFj0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFj0;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LFj0$c;

.field public final synthetic b:LFj0;


# direct methods
.method public constructor <init>(LFj0;LFj0$c;)V
    .locals 0

    iput-object p1, p0, LFj0$b;->b:LFj0;

    iput-object p2, p0, LFj0$b;->a:LFj0$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 4

    iget-object v0, p0, LFj0$b;->b:LFj0;

    iget-object v1, p0, LFj0$b;->a:LFj0$c;

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v3, v1, v2}, LFj0;->b(FLFj0$c;Z)V

    iget-object v0, p0, LFj0$b;->a:LFj0$c;

    invoke-virtual {v0}, LFj0$c;->A()V

    iget-object v0, p0, LFj0$b;->a:LFj0$c;

    invoke-virtual {v0}, LFj0$c;->l()V

    iget-object v0, p0, LFj0$b;->b:LFj0;

    iget-boolean v1, v0, LFj0;->g:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, LFj0;->g:Z

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    const-wide/16 v2, 0x534

    invoke-virtual {p1, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    iget-object p1, p0, LFj0$b;->a:LFj0$c;

    invoke-virtual {p1, v1}, LFj0$c;->x(Z)V

    goto :goto_0

    :cond_0
    iget p1, v0, LFj0;->f:F

    add-float/2addr p1, v3

    iput p1, v0, LFj0;->f:F

    :goto_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LFj0$b;->b:LFj0;

    const/4 v0, 0x0

    iput v0, p1, LFj0;->f:F

    return-void
.end method

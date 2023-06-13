.class public LRD2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRD2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LRD2;


# direct methods
.method public constructor <init>(LRD2;)V
    .locals 0

    iput-object p1, p0, LRD2$a;->a:LRD2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object p1, p0, LRD2$a;->a:LRD2;

    invoke-static {p1}, LRD2;->p(LRD2;)Leu0;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LRD2$a;->a:LRD2;

    invoke-static {p1}, LRD2;->p(LRD2;)Leu0;

    move-result-object p1

    iget-object v0, p0, LRD2$a;->a:LRD2;

    invoke-static {v0}, LRD2;->q(LRD2;)LfE2;

    move-result-object v0

    invoke-virtual {v0}, LfE2;->n()F

    move-result v0

    invoke-virtual {p1, v0}, Leu0;->L(F)V

    :cond_0
    return-void
.end method

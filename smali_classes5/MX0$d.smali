.class public LMX0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMX0;->p(Z)Landroid/view/animation/Animation$AnimationListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LMX0;


# direct methods
.method public constructor <init>(LMX0;)V
    .locals 0

    iput-object p1, p0, LMX0$d;->b:LMX0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    iget-object p1, p0, LMX0$d;->b:LMX0;

    iget-object p1, p1, LMX0;->b:LwO1;

    invoke-interface {p1}, LwO1;->Z()LI41;

    move-result-object p1

    sget-object v0, LI41;->b:LI41;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LMX0$d;->b:LMX0;

    invoke-virtual {p1}, LMX0;->k()V

    :cond_0
    invoke-static {}, LMX0;->j()Ljava/lang/String;

    move-result-object p1

    const-string v0, "In-app message animated into view."

    invoke-static {p1, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LMX0$d;->b:LMX0;

    iget-object v0, p1, LMX0;->b:LwO1;

    iget-object v1, p1, LMX0;->a:Landroid/view/View;

    iget-object v2, p1, LMX0;->c:LGO1;

    invoke-virtual {p1, v0, v1, v2}, LMX0;->v(LwO1;Landroid/view/View;LGO1;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.class public final LiC1$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbj5$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiC1;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function2;LiC1$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "iC1$f",
        "Lbj5$b;",
        "Lbj5;",
        "detector",
        "Landroid/view/MotionEvent;",
        "e",
        "",
        "a",
        "c",
        "b",
        "LP83;",
        "LP83;",
        "getScaleBeginEvent",
        "()LP83;",
        "d",
        "(LP83;)V",
        "scaleBeginEvent",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public a:LP83;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroid/view/MotionEvent;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LP83;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:LiC1$b;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;LiC1$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/view/MotionEvent;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LP83;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "LiC1$b;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LiC1$f;->b:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, LiC1$f;->c:LiC1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lbj5;Landroid/view/MotionEvent;)V
    .locals 3

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LiC1$f;->b:Lkotlin/jvm/functions/Function2;

    new-instance v1, LiC1$f$a;

    iget-object v2, p0, LiC1$f;->c:LiC1$b;

    invoke-direct {v1, p0, p1, v2}, LiC1$f$a;-><init>(LiC1$f;Lbj5;LiC1$b;)V

    invoke-interface {v0, p2, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Lbj5;Landroid/view/MotionEvent;)V
    .locals 3

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LiC1$f;->a:LP83;

    if-eqz v0, :cond_1

    new-instance v1, LP83;

    invoke-virtual {v0}, LP83;->b()Lio/github/sceneview/node/Node;

    move-result-object v2

    invoke-virtual {v0}, LP83;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, p2, v2, v0}, LP83;-><init>(Landroid/view/MotionEvent;Lio/github/sceneview/node/Node;Ljava/lang/Integer;)V

    iget-object p2, p0, LiC1$f;->c:LiC1$b;

    invoke-virtual {v1}, LP83;->b()Lio/github/sceneview/node/Node;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, v1}, Lio/github/sceneview/node/Node;->k(Lbj5;LP83;)V

    :cond_0
    invoke-interface {p2, p1, v1}, LiC1$b;->k(Lbj5;LP83;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, LiC1$f;->a:LP83;

    return-void
.end method

.method public c(Lbj5;Landroid/view/MotionEvent;)V
    .locals 3

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LiC1$f;->a:LP83;

    if-eqz v0, :cond_1

    new-instance v1, LP83;

    invoke-virtual {v0}, LP83;->b()Lio/github/sceneview/node/Node;

    move-result-object v2

    invoke-virtual {v0}, LP83;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, p2, v2, v0}, LP83;-><init>(Landroid/view/MotionEvent;Lio/github/sceneview/node/Node;Ljava/lang/Integer;)V

    iget-object p2, p0, LiC1$f;->c:LiC1$b;

    invoke-virtual {v1}, LP83;->b()Lio/github/sceneview/node/Node;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, v1}, Lio/github/sceneview/node/Node;->u(Lbj5;LP83;)V

    :cond_0
    invoke-interface {p2, p1, v1}, LiC1$b;->u(Lbj5;LP83;)V

    :cond_1
    return-void
.end method

.method public final d(LP83;)V
    .locals 0

    iput-object p1, p0, LiC1$f;->a:LP83;

    return-void
.end method

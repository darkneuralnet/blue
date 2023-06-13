.class public final LiC1$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRb5$c;


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
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "iC1$e",
        "LRb5$c;",
        "LRb5;",
        "detector",
        "Landroid/view/MotionEvent;",
        "e",
        "",
        "a",
        "b",
        "",
        "c",
        "LP83;",
        "LP83;",
        "getRotateBeginEvent",
        "()LP83;",
        "d",
        "(LP83;)V",
        "rotateBeginEvent",
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

    iput-object p1, p0, LiC1$e;->b:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, LiC1$e;->c:LiC1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LRb5;Landroid/view/MotionEvent;)Z
    .locals 4

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LRb5$c$a;->b(LRb5$c;LRb5;Landroid/view/MotionEvent;)Z

    move-result v0

    iget-object v1, p0, LiC1$e;->b:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, LiC1$e;->c:LiC1$b;

    new-instance v3, LiC1$e$a;

    invoke-direct {v3, p0, p1, v2}, LiC1$e$a;-><init>(LiC1$e;LRb5;LiC1$b;)V

    invoke-interface {v1, p2, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v0
.end method

.method public b(LRb5;Landroid/view/MotionEvent;)Z
    .locals 5

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LRb5$c$a;->a(LRb5$c;LRb5;Landroid/view/MotionEvent;)Z

    move-result v0

    iget-object v1, p0, LiC1$e;->c:LiC1$b;

    iget-object v2, p0, LiC1$e;->a:LP83;

    if-eqz v2, :cond_1

    new-instance v3, LP83;

    invoke-virtual {v2}, LP83;->b()Lio/github/sceneview/node/Node;

    move-result-object v4

    invoke-virtual {v2}, LP83;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v3, p2, v4, v2}, LP83;-><init>(Landroid/view/MotionEvent;Lio/github/sceneview/node/Node;Ljava/lang/Integer;)V

    invoke-virtual {v3}, LP83;->b()Lio/github/sceneview/node/Node;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1, v3}, Lio/github/sceneview/node/Node;->j(LRb5;LP83;)V

    :cond_0
    invoke-interface {v1, p1, v3}, LiC1$b;->j(LRb5;LP83;)V

    :cond_1
    return v0
.end method

.method public c(LRb5;Landroid/view/MotionEvent;)V
    .locals 3

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LiC1$e;->a:LP83;

    if-eqz v0, :cond_1

    new-instance v1, LP83;

    invoke-virtual {v0}, LP83;->b()Lio/github/sceneview/node/Node;

    move-result-object v2

    invoke-virtual {v0}, LP83;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, p2, v2, v0}, LP83;-><init>(Landroid/view/MotionEvent;Lio/github/sceneview/node/Node;Ljava/lang/Integer;)V

    iget-object p2, p0, LiC1$e;->c:LiC1$b;

    invoke-virtual {v1}, LP83;->b()Lio/github/sceneview/node/Node;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, v1}, Lio/github/sceneview/node/Node;->w(LRb5;LP83;)V

    :cond_0
    invoke-interface {p2, p1, v1}, LiC1$b;->w(LRb5;LP83;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, LiC1$e;->a:LP83;

    return-void
.end method

.method public final d(LP83;)V
    .locals 0

    iput-object p1, p0, LiC1$e;->a:LP83;

    return-void
.end method

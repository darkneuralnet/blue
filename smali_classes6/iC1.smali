.class public LiC1;
.super Landroid/view/GestureDetector;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LiC1$b;,
        LiC1$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0017\u0018\u00002\u00020\u0001:\u0002\r\u0013B=\u0012\u0006\u0010 \u001a\u00020\u001f\u0012$\u0010%\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"\u0012\u0004\u0012\u00020$0!\u0012\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006*"
    }
    d2 = {
        "LiC1;",
        "Landroid/view/GestureDetector;",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "LkW2;",
        "a",
        "LkW2;",
        "getMoveGestureDetector",
        "()LkW2;",
        "moveGestureDetector",
        "LRb5;",
        "b",
        "LRb5;",
        "getRotateGestureDetector",
        "()LRb5;",
        "rotateGestureDetector",
        "Lbj5;",
        "c",
        "Lbj5;",
        "getScaleGestureDetector",
        "()Lbj5;",
        "scaleGestureDetector",
        "d",
        "Landroid/view/MotionEvent;",
        "getLastTouchEvent",
        "()Landroid/view/MotionEvent;",
        "setLastTouchEvent",
        "(Landroid/view/MotionEvent;)V",
        "lastTouchEvent",
        "Landroid/content/Context;",
        "context",
        "Lkotlin/Function2;",
        "Lkotlin/Function1;",
        "LP83;",
        "",
        "pickNode",
        "LiC1$b;",
        "listener",
        "<init>",
        "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;LiC1$b;)V",
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
.field public final a:LkW2;

.field public final b:LRb5;

.field public final c:Lbj5;

.field public d:Landroid/view/MotionEvent;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function2;LiC1$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
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

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pickNode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LiC1$a;

    invoke-direct {v0, p2, p3}, LiC1$a;-><init>(Lkotlin/jvm/functions/Function2;LiC1$b;)V

    invoke-direct {p0, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    new-instance v0, LkW2;

    new-instance v1, LiC1$d;

    invoke-direct {v1, p2, p3}, LiC1$d;-><init>(Lkotlin/jvm/functions/Function2;LiC1$b;)V

    invoke-direct {v0, p1, v1}, LkW2;-><init>(Landroid/content/Context;LkW2$a;)V

    iput-object v0, p0, LiC1;->a:LkW2;

    new-instance v0, LRb5;

    new-instance v1, LiC1$e;

    invoke-direct {v1, p2, p3}, LiC1$e;-><init>(Lkotlin/jvm/functions/Function2;LiC1$b;)V

    invoke-direct {v0, p1, v1}, LRb5;-><init>(Landroid/content/Context;LRb5$b;)V

    iput-object v0, p0, LiC1;->b:LRb5;

    new-instance v0, Lbj5;

    new-instance v1, LiC1$f;

    invoke-direct {v1, p2, p3}, LiC1$f;-><init>(Lkotlin/jvm/functions/Function2;LiC1$b;)V

    invoke-direct {v0, p1, v1}, Lbj5;-><init>(Landroid/content/Context;Lbj5$b;)V

    iput-object v0, p0, LiC1;->c:Lbj5;

    return-void
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    iput-object p1, p0, LiC1;->d:Landroid/view/MotionEvent;

    iget-object v1, p0, LiC1;->a:LkW2;

    invoke-virtual {v1, p1}, LkW2;->a(Landroid/view/MotionEvent;)Z

    iget-object v1, p0, LiC1;->b:LRb5;

    invoke-virtual {v1, p1}, LRb5;->c(Landroid/view/MotionEvent;)Z

    iget-object v1, p0, LiC1;->c:Lbj5;

    invoke-virtual {v1, p1}, Lbj5;->onTouchEvent(Landroid/view/MotionEvent;)Z

    return v0
.end method

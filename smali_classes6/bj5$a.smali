.class public final Lbj5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbj5;-><init>(Landroid/content/Context;Lbj5$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "bj5$a",
        "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;",
        "Landroid/view/ScaleGestureDetector;",
        "detector",
        "",
        "onScaleBegin",
        "onScale",
        "",
        "onScaleEnd",
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
.field public final synthetic a:Lbj5$b;


# direct methods
.method public constructor <init>(Lbj5$b;)V
    .locals 0

    iput-object p1, p0, Lbj5$a;->a:Lbj5$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 2

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lbj5;

    iget-object v0, p0, Lbj5$a;->a:Lbj5$b;

    invoke-virtual {p1}, Lbj5;->a()Landroid/view/MotionEvent;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lbj5$b;->c(Lbj5;Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 2

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lbj5;

    iget-object v0, p0, Lbj5$a;->a:Lbj5$b;

    invoke-virtual {p1}, Lbj5;->a()Landroid/view/MotionEvent;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lbj5$b;->a(Lbj5;Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 2

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lbj5;

    iget-object v0, p0, Lbj5$a;->a:Lbj5$b;

    invoke-virtual {p1}, Lbj5;->a()Landroid/view/MotionEvent;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lbj5$b;->b(Lbj5;Landroid/view/MotionEvent;)V

    return-void
.end method

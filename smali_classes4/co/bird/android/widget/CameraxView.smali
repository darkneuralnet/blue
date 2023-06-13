.class public final Lco/bird/android/widget/CameraxView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/CameraxView$a;,
        Lco/bird/android/widget/CameraxView$b;,
        Lco/bird/android/widget/CameraxView$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u0000 Q2\u00020\u0001:\u0003R\u001f#B\u0011\u0008\u0016\u0012\u0006\u0010J\u001a\u00020I\u00a2\u0006\u0004\u0008K\u0010LB\u0019\u0008\u0016\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008K\u0010MB!\u0008\u0016\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020N\u00a2\u0006\u0004\u0008K\u0010PJ\u0014\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0014\u0010\n\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0008\u0010\u000b\u001a\u00020\u0004H\u0002J\u0008\u0010\u000c\u001a\u00020\u0004H\u0002J\u0008\u0010\u000e\u001a\u00020\rH\u0002J\u0008\u0010\u000f\u001a\u00020\u0004H\u0002J\u0008\u0010\u0010\u001a\u00020\u0004H\u0014J\u0008\u0010\u0011\u001a\u00020\u0004H\u0014J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014J*\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00142\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0004R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R*\u0010.\u001a\u00020&2\u0006\u0010\'\u001a\u00020&8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R*\u00106\u001a\u00020/2\u0006\u0010\'\u001a\u00020/8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R*\u0010>\u001a\u0002072\u0006\u0010\'\u001a\u0002078\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R*\u0010E\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\r8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DR\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010G\u00a8\u0006S"
    }
    d2 = {
        "Lco/bird/android/widget/CameraxView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "o",
        "Lxq2;",
        "Ljava/lang/Runnable;",
        "runnable",
        "q",
        "r",
        "v",
        "m",
        "",
        "l",
        "u",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "y",
        "z",
        "Lio/reactivex/F;",
        "Landroid/graphics/Bitmap;",
        "A",
        "",
        "directory",
        "filePrefix",
        "fileExt",
        "Landroid/net/Uri;",
        "x",
        "B",
        "Landroidx/camera/view/PreviewView;",
        "b",
        "Landroidx/camera/view/PreviewView;",
        "cameraView",
        "Ljava/util/concurrent/Executor;",
        "c",
        "Ljava/util/concurrent/Executor;",
        "mainExecutor",
        "Lco/bird/android/widget/CameraxView$c;",
        "value",
        "d",
        "Lco/bird/android/widget/CameraxView$c;",
        "getSelectedCamera",
        "()Lco/bird/android/widget/CameraxView$c;",
        "setSelectedCamera",
        "(Lco/bird/android/widget/CameraxView$c;)V",
        "selectedCamera",
        "Lco/bird/android/widget/CameraxView$b;",
        "e",
        "Lco/bird/android/widget/CameraxView$b;",
        "n",
        "()Lco/bird/android/widget/CameraxView$b;",
        "setFlash",
        "(Lco/bird/android/widget/CameraxView$b;)V",
        "flash",
        "",
        "f",
        "F",
        "getZoomLevel",
        "()F",
        "setZoomLevel",
        "(F)V",
        "zoomLevel",
        "g",
        "Z",
        "getPinchToZoomEnabled",
        "()Z",
        "setPinchToZoomEnabled",
        "(Z)V",
        "pinchToZoomEnabled",
        "h",
        "Lxq2;",
        "cameraController",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyle",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "i",
        "a",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final i:Lco/bird/android/widget/CameraxView$a;


# instance fields
.field public final b:Landroidx/camera/view/PreviewView;

.field public final c:Ljava/util/concurrent/Executor;

.field public d:Lco/bird/android/widget/CameraxView$c;

.field public e:Lco/bird/android/widget/CameraxView$b;

.field public f:F

.field public g:Z

.field public final h:Lxq2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/widget/CameraxView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/widget/CameraxView$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/widget/CameraxView;->i:Lco/bird/android/widget/CameraxView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    const-string v1, "getMainExecutor(context)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->c:Ljava/util/concurrent/Executor;

    sget-object v0, Lco/bird/android/widget/CameraxView$c;->c:Lco/bird/android/widget/CameraxView$c;

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->d:Lco/bird/android/widget/CameraxView$c;

    sget-object v0, Lco/bird/android/widget/CameraxView$b;->b:Lco/bird/android/widget/CameraxView$b;

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->e:Lco/bird/android/widget/CameraxView$b;

    new-instance v0, Lxq2;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lxq2;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    new-instance v0, Landroidx/camera/view/PreviewView;

    invoke-direct {v0, p1}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->b:Landroidx/camera/view/PreviewView;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, Lco/bird/android/widget/CameraxView;->p(Lco/bird/android/widget/CameraxView;Landroid/util/AttributeSet;ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    const-string v1, "getMainExecutor(context)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->c:Ljava/util/concurrent/Executor;

    sget-object v0, Lco/bird/android/widget/CameraxView$c;->c:Lco/bird/android/widget/CameraxView$c;

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->d:Lco/bird/android/widget/CameraxView$c;

    sget-object v0, Lco/bird/android/widget/CameraxView$b;->b:Lco/bird/android/widget/CameraxView$b;

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->e:Lco/bird/android/widget/CameraxView$b;

    new-instance v0, Lxq2;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lxq2;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    new-instance v0, Landroidx/camera/view/PreviewView;

    invoke-direct {v0, p1, p2}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->b:Landroidx/camera/view/PreviewView;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/CameraxView;->o(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    const-string v1, "getMainExecutor(context)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->c:Ljava/util/concurrent/Executor;

    sget-object v0, Lco/bird/android/widget/CameraxView$c;->c:Lco/bird/android/widget/CameraxView$c;

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->d:Lco/bird/android/widget/CameraxView$c;

    sget-object v0, Lco/bird/android/widget/CameraxView$b;->b:Lco/bird/android/widget/CameraxView$b;

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->e:Lco/bird/android/widget/CameraxView$b;

    new-instance v0, Lxq2;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lxq2;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    new-instance v0, Landroidx/camera/view/PreviewView;

    invoke-direct {v0, p1, p2, p3}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Lco/bird/android/widget/CameraxView;->b:Landroidx/camera/view/PreviewView;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/CameraxView;->o(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/widget/CameraxView;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/CameraxView;->s(Lco/bird/android/widget/CameraxView;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final synthetic access$getCameraController$p(Lco/bird/android/widget/CameraxView;)Lxq2;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    return-object p0
.end method

.method public static final synthetic access$requestRebind(Lco/bird/android/widget/CameraxView;)V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/widget/CameraxView;->v()V

    return-void
.end method

.method public static synthetic b(Lco/bird/android/widget/CameraxView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/CameraxView;->j(Lco/bird/android/widget/CameraxView;)V

    return-void
.end method

.method public static synthetic c(Lco/bird/android/widget/CameraxView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/CameraxView;->w(Lco/bird/android/widget/CameraxView;)V

    return-void
.end method

.method public static synthetic d(Lco/bird/android/widget/CameraxView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/CameraxView;->i(Lco/bird/android/widget/CameraxView;)V

    return-void
.end method

.method public static synthetic e(Lco/bird/android/widget/CameraxView;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/CameraxView;->t(Lco/bird/android/widget/CameraxView;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic f(Lco/bird/android/widget/CameraxView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/CameraxView;->k(Lco/bird/android/widget/CameraxView;)V

    return-void
.end method

.method public static synthetic g(Lco/bird/android/widget/CameraxView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/CameraxView;->h(Lco/bird/android/widget/CameraxView;)V

    return-void
.end method

.method public static final h(Lco/bird/android/widget/CameraxView;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->e:Lco/bird/android/widget/CameraxView$b;

    invoke-virtual {v0}, Lco/bird/android/widget/CameraxView$b;->b()I

    move-result v0

    iget-object v1, p0, Lco/bird/android/widget/CameraxView;->e:Lco/bird/android/widget/CameraxView$b;

    invoke-virtual {v1}, Lco/bird/android/widget/CameraxView$b;->c()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setting flash mode to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {v2, v0}, Ljb0;->B(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setting torch enabled: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {v0, v1}, Ljb0;->h(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {v0}, Ljb0;->k()LJb0;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, LJb0;->f()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "zero shutter lag mode enabled"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljb0;->C(I)V

    goto :goto_1

    :cond_1
    const-string v0, "zero shutter lag is not available on this device, falling back to minimize latency."

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {p0, v1}, Ljb0;->C(I)V

    :goto_1
    return-void
.end method

.method public static final i(Lco/bird/android/widget/CameraxView;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/widget/CameraxView;->g:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setting pinch to zoom enabled: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    iget-boolean p0, p0, Lco/bird/android/widget/CameraxView;->g:Z

    invoke-virtual {v0, p0}, Ljb0;->E(Z)V

    return-void
.end method

.method public static final j(Lco/bird/android/widget/CameraxView;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->d:Lco/bird/android/widget/CameraxView$c;

    invoke-virtual {v0}, Lco/bird/android/widget/CameraxView$c;->b()Lic0;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {v1, v0}, Ljb0;->n(Lic0;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updating selected camera to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {p0, v0}, Ljb0;->A(Lic0;)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "selected camera ("

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ") is not available, not updating camera!!!"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final k(Lco/bird/android/widget/CameraxView;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lco/bird/android/widget/CameraxView;->f:F

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setting linear zoom to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    iget p0, p0, Lco/bird/android/widget/CameraxView;->f:F

    invoke-virtual {v0, p0}, Ljb0;->D(F)Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method

.method public static synthetic p(Lco/bird/android/widget/CameraxView;Landroid/util/AttributeSet;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/widget/CameraxView;->o(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final s(Lco/bird/android/widget/CameraxView;Ljava/lang/Runnable;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$runnable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {v0}, Ljb0;->k()LJb0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :cond_1
    new-instance v1, LHc0;

    invoke-direct {v1, p0, p1}, LHc0;-><init>(Lco/bird/android/widget/CameraxView;Ljava/lang/Runnable;)V

    const-wide/16 p0, 0xfa

    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method

.method public static synthetic savePicture$default(Lco/bird/android/widget/CameraxView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/photo"

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const-string p2, "bird_"

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const-string p3, ".jpg"

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/widget/CameraxView;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lco/bird/android/widget/CameraxView;Ljava/lang/Runnable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$runnable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {p0}, Ljb0;->k()LJb0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "Did not find a camera attached to camera controller after 250ms delay, not calling runnable in onInitializedWithCamera"

    invoke-static {p1, p0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final w(Lco/bird/android/widget/CameraxView;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "setting controller to preview view now"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->b:Landroidx/camera/view/PreviewView;

    iget-object v1, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {v0, v1}, Landroidx/camera/view/PreviewView;->setController(Ljb0;)V

    iget-object p0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljb0;->F(Z)V

    return-void
.end method


# virtual methods
.method public final A()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/widget/CameraxView$f;

    invoke-direct {v0, p0}, Lco/bird/android/widget/CameraxView$f;-><init>(Lco/bird/android/widget/CameraxView;)V

    invoke-static {v0}, Lnh5;->k(Lkotlin/jvm/functions/Function1;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final B()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->e:Lco/bird/android/widget/CameraxView$b;

    sget-object v1, Lco/bird/android/widget/CameraxView$b;->e:Lco/bird/android/widget/CameraxView$b;

    if-eq v0, v1, :cond_0

    sget-object v2, Lco/bird/android/widget/CameraxView$b;->c:Lco/bird/android/widget/CameraxView$b;

    if-ne v0, v2, :cond_1

    :cond_0
    sget-object v1, Lco/bird/android/widget/CameraxView$b;->b:Lco/bird/android/widget/CameraxView$b;

    :cond_1
    invoke-virtual {p0, v1}, Lco/bird/android/widget/CameraxView;->setFlash(Lco/bird/android/widget/CameraxView$b;)V

    return-void
.end method

.method public final l()Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.CAMERA"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final m()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/CameraxView;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/CameraxView;->v()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/widget/CameraxView;->u()V

    :goto_0
    return-void
.end method

.method public final n()Lco/bird/android/widget/CameraxView$b;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->e:Lco/bird/android/widget/CameraxView$b;

    return-object v0
.end method

.method public final o(Landroid/util/AttributeSet;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->b:Landroidx/camera/view/PreviewView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, LKl4;->CameraxView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "context.theme.obtainStyl\u2026raxView,\n      0, 0\n    )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LKl4;->CameraxView_allowZoom:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/CameraxView;->setPinchToZoomEnabled(Z)V

    invoke-static {}, Lco/bird/android/widget/CameraxView$b;->values()[Lco/bird/android/widget/CameraxView$b;

    move-result-object v0

    sget v1, LKl4;->CameraxView_cameraFlashType:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    aget-object p1, v0, p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/CameraxView;->setFlash(Lco/bird/android/widget/CameraxView$b;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Lco/bird/android/widget/CameraxView;->m()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {v0}, Lxq2;->U()V

    return-void
.end method

.method public final q(Lxq2;Ljava/lang/Runnable;)V
    .locals 1

    iget-object p1, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {p1}, Ljb0;->l()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2, v0}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final r(Lxq2;Ljava/lang/Runnable;)V
    .locals 1

    iget-object p1, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {p1}, Ljb0;->l()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance v0, LGc0;

    invoke-direct {v0, p0, p2}, LGc0;-><init>(Lco/bird/android/widget/CameraxView;Ljava/lang/Runnable;)V

    iget-object p2, p0, Lco/bird/android/widget/CameraxView;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0, p2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final setFlash(Lco/bird/android/widget/CameraxView$b;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/CameraxView;->e:Lco/bird/android/widget/CameraxView$b;

    iget-object p1, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    new-instance v0, LDc0;

    invoke-direct {v0, p0}, LDc0;-><init>(Lco/bird/android/widget/CameraxView;)V

    invoke-virtual {p0, p1, v0}, Lco/bird/android/widget/CameraxView;->r(Lxq2;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final setPinchToZoomEnabled(Z)V
    .locals 1

    iput-boolean p1, p0, Lco/bird/android/widget/CameraxView;->g:Z

    iget-object p1, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    new-instance v0, LEc0;

    invoke-direct {v0, p0}, LEc0;-><init>(Lco/bird/android/widget/CameraxView;)V

    invoke-virtual {p0, p1, v0}, Lco/bird/android/widget/CameraxView;->r(Lxq2;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final setSelectedCamera(Lco/bird/android/widget/CameraxView$c;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/CameraxView;->d:Lco/bird/android/widget/CameraxView$c;

    iget-object p1, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    new-instance v0, LBc0;

    invoke-direct {v0, p0}, LBc0;-><init>(Lco/bird/android/widget/CameraxView;)V

    invoke-virtual {p0, p1, v0}, Lco/bird/android/widget/CameraxView;->r(Lxq2;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final setZoomLevel(F)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/CameraxView;->f:F

    iget-object p1, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    new-instance v0, LFc0;

    invoke-direct {v0, p0}, LFc0;-><init>(Lco/bird/android/widget/CameraxView;)V

    invoke-virtual {p0, p1, v0}, Lco/bird/android/widget/CameraxView;->r(Lxq2;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final u()V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, Landroidx/appcompat/app/AppCompatActivity;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v1, Lco/bird/android/widget/CameraxView$a$a;

    invoke-direct {v1}, Lco/bird/android/widget/CameraxView$a$a;-><init>()V

    new-instance v2, Lco/bird/android/widget/CameraxView$d;

    invoke-direct {v2, v0, v1, p0}, Lco/bird/android/widget/CameraxView$d;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lco/bird/android/widget/CameraxView$a$a;Lco/bird/android/widget/CameraxView;)V

    invoke-virtual {v1, v2}, Lco/bird/android/widget/CameraxView$a$a;->a5(Lco/bird/android/widget/CameraxView$a$a$a;)V

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->q()Landroidx/fragment/app/m;

    move-result-object v0

    const-string v2, "CameraPermissionFragment"

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/m;->e(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/m;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/m;->j()I

    return-void
.end method

.method public final v()V
    .locals 4

    invoke-static {p0}, LQt6;->a(Landroid/view/View;)LLifecycleOwner;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "binding camera controller to lifecycle now"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    invoke-virtual {v2, v0}, Lxq2;->T(LLifecycleOwner;)V

    :cond_0
    const-string v0, "initializing camera controller"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/widget/CameraxView;->h:Lxq2;

    new-instance v1, LCc0;

    invoke-direct {v1, p0}, LCc0;-><init>(Lco/bird/android/widget/CameraxView;)V

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/CameraxView;->q(Lxq2;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    const-string v0, "directory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filePrefix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileExt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "Could not create directories for storing identification photo"

    invoke-static {p1, p3, p2}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "error(e)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    :goto_0
    invoke-static {p2, p3, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    new-instance p2, Landroidx/camera/core/h$n$a;

    invoke-direct {p2, p1}, Landroidx/camera/core/h$n$a;-><init>(Ljava/io/File;)V

    new-instance p1, Landroidx/camera/core/h$k;

    invoke-direct {p1}, Landroidx/camera/core/h$k;-><init>()V

    invoke-virtual {p2, p1}, Landroidx/camera/core/h$n$a;->b(Landroidx/camera/core/h$k;)Landroidx/camera/core/h$n$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/h$n$a;->a()Landroidx/camera/core/h$n;

    move-result-object p1

    const-string p2, "Builder(file)\n      .set\u2026()\n      )\n      .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lco/bird/android/widget/CameraxView$e;

    invoke-direct {p2, p0, p1}, Lco/bird/android/widget/CameraxView$e;-><init>(Lco/bird/android/widget/CameraxView;Landroidx/camera/core/h$n;)V

    invoke-static {p2}, Lnh5;->k(Lkotlin/jvm/functions/Function1;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final y()V
    .locals 0

    return-void
.end method

.method public final z()V
    .locals 0

    return-void
.end method

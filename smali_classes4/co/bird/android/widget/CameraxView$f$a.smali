.class public final Lco/bird/android/widget/CameraxView$f$a;
.super Landroidx/camera/core/h$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/CameraxView$f;->invoke(Lio/reactivex/H;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "co/bird/android/widget/CameraxView$f$a",
        "Landroidx/camera/core/h$l;",
        "Landroidx/camera/core/i;",
        "image",
        "",
        "a",
        "Landroidx/camera/core/ImageCaptureException;",
        "exception",
        "b",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lio/reactivex/H;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/H<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/H;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/widget/CameraxView$f$a;->a:Lio/reactivex/H;

    invoke-direct {p0}, Landroidx/camera/core/h$l;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/i;)V
    .locals 7

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/camera/core/h$l;->a(Landroidx/camera/core/i;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    move-object v1, p1

    :try_start_0
    invoke-static/range {v1 .. v6}, LlU;->getBitmapFromImageProxy$default(Landroidx/camera/core/i;Landroid/graphics/Rect;IIILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    iget-object p1, p0, Lco/bird/android/widget/CameraxView$f$a;->a:Lio/reactivex/H;

    invoke-interface {p1, v0}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception while parsing bitmap, erroring out"

    invoke-static {v0, v2, v1}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    iget-object p1, p0, Lco/bird/android/widget/CameraxView$f$a;->a:Lio/reactivex/H;

    invoke-interface {p1, v0}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Landroidx/camera/core/ImageCaptureException;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/camera/core/h$l;->b(Landroidx/camera/core/ImageCaptureException;)V

    iget-object v0, p0, Lco/bird/android/widget/CameraxView$f$a;->a:Lio/reactivex/H;

    invoke-interface {v0, p1}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

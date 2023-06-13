.class public final Lco/bird/android/widget/scan/IdentificationScanView$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/scan/IdentificationScanView;->B(Landroidx/camera/core/h$n;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/H<",
        "Landroidx/camera/core/h$o;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/H;",
        "Landroidx/camera/core/h$o;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/H;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/widget/scan/IdentificationScanView;

.field public final synthetic h:Landroidx/camera/core/h$n;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/scan/IdentificationScanView;Landroidx/camera/core/h$n;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/scan/IdentificationScanView$f;->g:Lco/bird/android/widget/scan/IdentificationScanView;

    iput-object p2, p0, Lco/bird/android/widget/scan/IdentificationScanView$f;->h:Landroidx/camera/core/h$n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/scan/IdentificationScanView$f;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "Landroidx/camera/core/h$o;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/scan/IdentificationScanView$f;->g:Lco/bird/android/widget/scan/IdentificationScanView;

    invoke-static {v0}, Lco/bird/android/widget/scan/IdentificationScanView;->access$getImageCapture(Lco/bird/android/widget/scan/IdentificationScanView;)Landroidx/camera/core/h;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/widget/scan/IdentificationScanView$f;->h:Landroidx/camera/core/h$n;

    iget-object v2, p0, Lco/bird/android/widget/scan/IdentificationScanView$f;->g:Lco/bird/android/widget/scan/IdentificationScanView;

    invoke-static {v2}, Lco/bird/android/widget/scan/IdentificationScanView;->access$getCapturePhotoExecutor(Lco/bird/android/widget/scan/IdentificationScanView;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lco/bird/android/widget/scan/IdentificationScanView$f$a;

    invoke-direct {v3, p1}, Lco/bird/android/widget/scan/IdentificationScanView$f$a;-><init>(Lio/reactivex/H;)V

    invoke-virtual {v0, v1, v2, v3}, Landroidx/camera/core/h;->R0(Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V

    return-void
.end method

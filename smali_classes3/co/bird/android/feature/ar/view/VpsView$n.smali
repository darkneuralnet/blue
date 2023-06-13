.class public final Lco/bird/android/feature/ar/view/VpsView$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/ar/view/VpsView;->onResume(LLifecycleOwner;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lrm;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lrm;",
        "kotlin.jvm.PlatformType",
        "arFrame",
        "",
        "a",
        "(Lrm;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/ar/view/VpsView;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/ar/view/VpsView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/ar/view/VpsView$n;->g:Lco/bird/android/feature/ar/view/VpsView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lrm;)V
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Lrm;->c()Lcom/google/ar/core/Frame;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/ar/core/Frame;->acquireCameraImage()Landroid/media/Image;

    move-result-object p1

    const-string v0, "arFrame.frame.acquireCameraImage()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/view/VpsView$n;->g:Lco/bird/android/feature/ar/view/VpsView;

    invoke-static {v0}, Lco/bird/android/feature/ar/view/VpsView;->access$getBarcodeAnalyzer$p(Lco/bird/android/feature/ar/view/VpsView;)LPx;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/ar/view/VpsView$n;->g:Lco/bird/android/feature/ar/view/VpsView;

    invoke-static {v1}, Lco/bird/android/feature/ar/view/VpsView;->access$getBackCameraRotationCompensation(Lco/bird/android/feature/ar/view/VpsView;)I

    move-result v1

    iget-object v2, p0, Lco/bird/android/feature/ar/view/VpsView$n;->g:Lco/bird/android/feature/ar/view/VpsView;

    invoke-virtual {v2}, Lco/bird/android/feature/ar/view/VpsView;->V0()Z

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, LPx;->r(Landroid/media/Image;IZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Exception while updating frame in vpsview: "

    invoke-static {p1, v1, v0}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrm;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ar/view/VpsView$n;->a(Lrm;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

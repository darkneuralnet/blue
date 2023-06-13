.class public final Lco/bird/android/widget/scan/IdentificationScanView$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/scan/IdentificationScanView;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Ljava/lang/Long;)V"
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


# direct methods
.method public constructor <init>(Lco/bird/android/widget/scan/IdentificationScanView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/scan/IdentificationScanView$d;->g:Lco/bird/android/widget/scan/IdentificationScanView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)V
    .locals 3

    iget-object p1, p0, Lco/bird/android/widget/scan/IdentificationScanView$d;->g:Lco/bird/android/widget/scan/IdentificationScanView;

    invoke-virtual {p1}, Lco/bird/android/widget/scan/ScanView;->l()Landroidx/camera/view/PreviewView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/view/PreviewView;->d()LST2;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/widget/scan/IdentificationScanView$d;->g:Lco/bird/android/widget/scan/IdentificationScanView;

    invoke-virtual {v0}, Lco/bird/android/widget/scan/ScanView;->l()Landroidx/camera/view/PreviewView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v2, p0, Lco/bird/android/widget/scan/IdentificationScanView$d;->g:Lco/bird/android/widget/scan/IdentificationScanView;

    invoke-virtual {v2}, Lco/bird/android/widget/scan/ScanView;->l()Landroidx/camera/view/PreviewView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    invoke-virtual {p1, v0, v2}, LST2;->b(FF)LRT2;

    move-result-object p1

    const-string v0, "previewView.meteringPoin\u2026ew.height.toFloat() / 2f)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/scan/IdentificationScanView$d;->g:Lco/bird/android/widget/scan/IdentificationScanView;

    invoke-virtual {v0}, Lco/bird/android/widget/scan/ScanView;->h()Lna0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lna0;->a()Landroidx/camera/core/CameraControl;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LCv1$a;

    invoke-direct {v1, p1}, LCv1$a;-><init>(LRT2;)V

    invoke-virtual {v1}, LCv1$a;->b()LCv1;

    move-result-object p1

    invoke-interface {v0, p1}, Landroidx/camera/core/CameraControl;->g(LCv1;)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/scan/IdentificationScanView$d;->a(Ljava/lang/Long;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

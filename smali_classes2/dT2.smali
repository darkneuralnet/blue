.class public final LdT2;
.super LxE;
.source "SourceFile"

# interfaces
.implements LcT2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0004H\u0016J\u0008\u0010\u0008\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0018"
    }
    d2 = {
        "LdT2;",
        "LcT2;",
        "LxE;",
        "Lio/reactivex/Observable;",
        "",
        "h0",
        "i",
        "n1",
        "a1",
        "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;",
        "resultHandler",
        "Z1",
        "Ln4;",
        "b",
        "Ln4;",
        "binding",
        "",
        "c",
        "Z",
        "flashOn",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Ln4;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Ln4;

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Ln4;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LdT2;->b:Ln4;

    return-void
.end method


# virtual methods
.method public Z1(Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;)V
    .locals 1

    const-string v0, "resultHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LdT2;->b:Ln4;

    iget-object v0, v0, Ln4;->k:Lco/bird/android/widget/QrCodeZXingScannerView;

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/zxing/ZXingScannerView;->setResultHandler(Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;)V

    return-void
.end method

.method public a1()V
    .locals 1

    iget-object v0, p0, LdT2;->b:Ln4;

    iget-object v0, v0, Ln4;->k:Lco/bird/android/widget/QrCodeZXingScannerView;

    invoke-virtual {v0}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->stopCamera()V

    return-void
.end method

.method public h0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LdT2;->b:Ln4;

    iget-object v0, v0, Ln4;->e:Landroid/widget/ImageView;

    const-string v1, "binding.flashButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public i()V
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    iget-boolean v1, p0, LdT2;->c:Z

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, LdT2;->c:Z

    iget-object v2, p0, LdT2;->b:Ln4;

    iget-object v2, v2, Ln4;->k:Lco/bird/android/widget/QrCodeZXingScannerView;

    invoke-virtual {v2, v1}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->setFlash(Z)V

    iget-boolean v1, p0, LdT2;->c:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, LdT2;->b:Ln4;

    iget-object v1, v1, Ln4;->e:Landroid/widget/ImageView;

    sget v2, LHg4;->frame_rectangle_border_rounded_button_enabled:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v1, p0, LdT2;->b:Ln4;

    iget-object v1, v1, Ln4;->e:Landroid/widget/ImageView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    sget v3, LDf4;->white:I

    invoke-static {v2, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, LdT2;->b:Ln4;

    iget-object v1, v1, Ln4;->e:Landroid/widget/ImageView;

    sget v2, LHg4;->frame_rectangle_border_rounded_button:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v1, p0, LdT2;->b:Ln4;

    iget-object v1, v1, Ln4;->e:Landroid/widget/ImageView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    sget v3, LDf4;->black:I

    invoke-static {v2, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setColorFilter(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    iget-boolean v2, p0, LdT2;->c:Z

    xor-int/2addr v0, v2

    iput-boolean v0, p0, LdT2;->c:Z

    invoke-static {v1}, Lg46;->e(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public n1()V
    .locals 1

    iget-object v0, p0, LdT2;->b:Ln4;

    iget-object v0, v0, Ln4;->k:Lco/bird/android/widget/QrCodeZXingScannerView;

    invoke-virtual {v0}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->startCamera()V

    return-void
.end method

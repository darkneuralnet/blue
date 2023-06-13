.class public final LuK5;
.super LxE;
.source "SourceFile"

# interfaces
.implements LtK5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LuK5;",
        "LtK5;",
        "LxE;",
        "",
        "fe",
        "i",
        "Lme/dm7/barcodescanner/core/BarcodeScannerView;",
        "b",
        "Lme/dm7/barcodescanner/core/BarcodeScannerView;",
        "scannerView",
        "",
        "c",
        "Z",
        "flashOn",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lme/dm7/barcodescanner/core/BarcodeScannerView;)V",
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
.field public final b:Lme/dm7/barcodescanner/core/BarcodeScannerView;

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lme/dm7/barcodescanner/core/BarcodeScannerView;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scannerView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LuK5;->b:Lme/dm7/barcodescanner/core/BarcodeScannerView;

    return-void
.end method


# virtual methods
.method public fe()V
    .locals 1

    sget v0, Lnl4;->smartlock_scan_qr_error:I

    invoke-virtual {p0, v0}, LXC;->error(I)V

    return-void
.end method

.method public i()V
    .locals 3

    const/4 v0, 0x1

    :try_start_0
    iget-boolean v1, p0, LuK5;->c:Z

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, LuK5;->c:Z

    iget-object v2, p0, LuK5;->b:Lme/dm7/barcodescanner/core/BarcodeScannerView;

    invoke-virtual {v2, v1}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->setFlash(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    iget-boolean v2, p0, LuK5;->c:Z

    xor-int/2addr v0, v2

    iput-boolean v0, p0, LuK5;->c:Z

    invoke-static {v1}, Lg46;->e(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

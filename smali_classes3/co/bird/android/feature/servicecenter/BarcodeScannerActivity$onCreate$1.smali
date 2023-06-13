.class public final Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$onCreate$1;
.super Lme/dm7/barcodescanner/zxing/ZXingScannerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014\u00a8\u0006\u0006"
    }
    d2 = {
        "co/bird/android/feature/servicecenter/BarcodeScannerActivity$onCreate$1",
        "Lme/dm7/barcodescanner/zxing/ZXingScannerView;",
        "createViewFinderView",
        "Lme/dm7/barcodescanner/core/IViewFinder;",
        "context",
        "Landroid/content/Context;",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;)V
    .locals 0

    invoke-direct {p0, p1}, Lme/dm7/barcodescanner/zxing/ZXingScannerView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public createViewFinderView(Landroid/content/Context;)Lme/dm7/barcodescanner/core/IViewFinder;
    .locals 1

    new-instance v0, Lco/bird/android/widget/QrCodeFinderView;

    invoke-direct {v0, p1}, Lco/bird/android/widget/QrCodeFinderView;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.class public Lcom/google/mlkit/vision/barcode/bundled/internal/ThickBarcodeScannerCreator;
.super LFL7;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LFL7;-><init>()V

    return-void
.end method


# virtual methods
.method public newBarcodeScanner(LWO1;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzbc;)LbL7;
    .locals 1

    new-instance v0, LBC7;

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {v0, p1, p2}, LBC7;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzbc;)V

    return-object v0
.end method

.class public Lme/dm7/barcodescanner/core/CameraHandlerThread;
.super Landroid/os/HandlerThread;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "CameraHandlerThread"


# instance fields
.field private mScannerView:Lme/dm7/barcodescanner/core/BarcodeScannerView;


# direct methods
.method public constructor <init>(Lme/dm7/barcodescanner/core/BarcodeScannerView;)V
    .locals 1

    const-string v0, "CameraHandlerThread"

    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lme/dm7/barcodescanner/core/CameraHandlerThread;->mScannerView:Lme/dm7/barcodescanner/core/BarcodeScannerView;

    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static synthetic access$000(Lme/dm7/barcodescanner/core/CameraHandlerThread;)Lme/dm7/barcodescanner/core/BarcodeScannerView;
    .locals 0

    iget-object p0, p0, Lme/dm7/barcodescanner/core/CameraHandlerThread;->mScannerView:Lme/dm7/barcodescanner/core/BarcodeScannerView;

    return-object p0
.end method


# virtual methods
.method public startCamera(I)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lme/dm7/barcodescanner/core/CameraHandlerThread$1;

    invoke-direct {v1, p0, p1}, Lme/dm7/barcodescanner/core/CameraHandlerThread$1;-><init>(Lme/dm7/barcodescanner/core/CameraHandlerThread;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

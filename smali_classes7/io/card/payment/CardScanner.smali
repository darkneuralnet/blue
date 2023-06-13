.class Lio/card/payment/CardScanner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;
.implements Landroid/hardware/Camera$PreviewCallback;
.implements Landroid/view/SurfaceHolder$Callback;


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final TAG:Ljava/lang/String; = "CardScanner"

.field private static manualFallbackForError:Z

.field private static processingInProgress:Z


# instance fields
.field private captureStart:J

.field private detectedBitmap:Landroid/graphics/Bitmap;

.field private isSurfaceValid:Z

.field private mAutoFocusCompletedAt:J

.field private mAutoFocusStartedAt:J

.field private mCamera:Landroid/hardware/Camera;

.field private mFirstPreviewFrame:Z

.field private mFrameOrientation:I

.field private mPreviewBuffer:[B

.field final mPreviewHeight:I

.field final mPreviewWidth:I

.field protected mScanActivityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lio/card/payment/CardIOActivity;",
            ">;"
        }
    .end annotation
.end field

.field private mScanExpiry:Z

.field private mSuppressScan:Z

.field private mUnblurDigits:I

.field private numAutoRefocus:I

.field private numFramesSkipped:I

.field private numManualRefocus:I

.field private numManualTorchChange:I

.field protected useCamera:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "card.io 5.5.1 03/17/2017 14:23:12 -0400"

    const-string v1, "card.io"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    :try_start_0
    const-string v2, "cardioDecider"

    invoke-static {v2}, Lio/card/payment/CardScanner;->loadLibrary(Ljava/lang/String;)V

    const-string v2, "Loaded card.io decider library."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    nUseNeon(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lio/card/payment/CardScanner;->nUseNeon()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    nUseTegra():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lio/card/payment/CardScanner;->nUseTegra()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    nUseX86():  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lio/card/payment/CardScanner;->nUseX86()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lio/card/payment/CardScanner;->usesSupportedProcessorArch()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "opencv_core"

    invoke-static {v2}, Lio/card/payment/CardScanner;->loadLibrary(Ljava/lang/String;)V

    const-string v2, "Loaded opencv core library"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v2, "opencv_imgproc"

    invoke-static {v2}, Lio/card/payment/CardScanner;->loadLibrary(Ljava/lang/String;)V

    const-string v2, "Loaded opencv imgproc library"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-static {}, Lio/card/payment/CardScanner;->nUseNeon()Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "cardioRecognizer"

    if-eqz v2, :cond_1

    :try_start_1
    invoke-static {v3}, Lio/card/payment/CardScanner;->loadLibrary(Ljava/lang/String;)V

    const-string v2, "Loaded card.io NEON library"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    invoke-static {}, Lio/card/payment/CardScanner;->nUseX86()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v3}, Lio/card/payment/CardScanner;->loadLibrary(Ljava/lang/String;)V

    const-string v2, "Loaded card.io x86 library"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    invoke-static {}, Lio/card/payment/CardScanner;->nUseTegra()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "cardioRecognizer_tegra2"

    invoke-static {v2}, Lio/card/payment/CardScanner;->loadLibrary(Ljava/lang/String;)V

    const-string v2, "Loaded card.io Tegra2 library"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_3
    const-string v2, "unsupported processor - card.io scanning requires ARMv7 or x86 architecture"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sput-boolean v0, Lio/card/payment/CardScanner;->manualFallbackForError:Z
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to load native library: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sput-boolean v0, Lio/card/payment/CardScanner;->manualFallbackForError:Z

    :goto_0
    const/4 v0, 0x0

    sput-boolean v0, Lio/card/payment/CardScanner;->processingInProgress:Z

    return-void
.end method

.method public constructor <init>(Lio/card/payment/CardIOActivity;I)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/card/payment/CardScanner;->mSuppressScan:Z

    const/4 v1, -0x1

    iput v1, p0, Lio/card/payment/CardScanner;->mUnblurDigits:I

    const/16 v2, 0x280

    iput v2, p0, Lio/card/payment/CardScanner;->mPreviewWidth:I

    const/16 v2, 0x1e0

    iput v2, p0, Lio/card/payment/CardScanner;->mPreviewHeight:I

    const/4 v2, 0x1

    iput v2, p0, Lio/card/payment/CardScanner;->mFrameOrientation:I

    iput-boolean v2, p0, Lio/card/payment/CardScanner;->mFirstPreviewFrame:Z

    iput-boolean v2, p0, Lio/card/payment/CardScanner;->useCamera:Z

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v4, "io.card.payment.suppressScan"

    invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, p0, Lio/card/payment/CardScanner;->mSuppressScan:Z

    const-string v4, "io.card.payment.requireExpiry"

    invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "io.card.payment.scanExpiry"

    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    move v0, v2

    :cond_0
    iput-boolean v0, p0, Lio/card/payment/CardScanner;->mScanExpiry:Z

    const-string v0, "io.card.payment.unblurDigits"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lio/card/payment/CardScanner;->mUnblurDigits:I

    :cond_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/card/payment/CardScanner;->mScanActivityRef:Ljava/lang/ref/WeakReference;

    iput p2, p0, Lio/card/payment/CardScanner;->mFrameOrientation:I

    iget-boolean p1, p0, Lio/card/payment/CardScanner;->mSuppressScan:Z

    const/high16 p2, 0x40c00000    # 6.0f

    iget v0, p0, Lio/card/payment/CardScanner;->mUnblurDigits:I

    invoke-direct {p0, p1, p2, v0}, Lio/card/payment/CardScanner;->nSetup(ZFI)V

    return-void
.end method

.method private connectToCamera(II)Landroid/hardware/Camera;
    .locals 7

    const-string v0, "card.io"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-boolean v3, p0, Lio/card/payment/CardScanner;->useCamera:Z

    if-eqz v3, :cond_1

    :cond_0
    :try_start_0
    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    const-string v3, "Unexpected exception. Please report it as a GitHub issue"

    invoke-static {v0, v3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p2, 0x0

    goto :goto_0

    :catch_1
    :try_start_1
    const-string v3, "Wasn\'t able to connect to camera service. Waiting and trying again..."

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    int-to-long v3, p1

    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    :catch_2
    move-exception v3

    const-string v4, "Interrupted while waiting for camera"

    invoke-static {v0, v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    int-to-long v5, p2

    cmp-long v3, v3, v5

    if-ltz v3, :cond_0

    :cond_1
    sget-object p1, Lio/card/payment/CardScanner;->TAG:Ljava/lang/String;

    const-string p2, "camera connect timeout"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method private static loadLibrary(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsatisfiedLinkError;
        }
    .end annotation

    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lio/card/payment/CardIONativeLibsConfig;->getAlternativeLibsPath()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadLibrary failed for library "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ". Trying "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "card.io"

    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    throw v0
.end method

.method private makePreviewGo(Landroid/view/SurfaceHolder;)Z
    .locals 4

    const-string v0, "card.io"

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/card/payment/CardScanner;->mFirstPreviewFrame:Z

    iget-boolean v2, p0, Lio/card/payment/CardScanner;->useCamera:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v3, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object p1, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->startPreview()V

    iget-object p1, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1, p0}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "startPreview failed on camera. Error: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v2

    :catch_1
    move-exception p1

    const-string v1, "can\'t set preview display"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v2

    :cond_0
    :goto_0
    return v1
.end method

.method private native nCleanup()V
.end method

.method private native nGetGuideFrame(IIILandroid/graphics/Rect;)V
.end method

.method private native nGetNumFramesScanned()I
.end method

.method private native nResetAnalytics()V
.end method

.method private native nScanFrame([BIIILio/card/payment/DetectionInfo;Landroid/graphics/Bitmap;Z)V
.end method

.method private native nSetup(ZF)V
.end method

.method private native nSetup(ZFI)V
.end method

.method public static native nUseNeon()Z
.end method

.method public static native nUseTegra()Z
.end method

.method public static native nUseX86()Z
.end method

.method public static processorSupported()Z
    .locals 1

    sget-boolean v0, Lio/card/payment/CardScanner;->manualFallbackForError:Z

    if-nez v0, :cond_0

    invoke-static {}, Lio/card/payment/CardScanner;->usesSupportedProcessorArch()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private setCameraDisplayOrientation(Landroid/hardware/Camera;)V
    .locals 2

    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    invoke-virtual {p0}, Lio/card/payment/CardScanner;->getRotationalOffset()I

    move-result v1

    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    sub-int/2addr v0, v1

    add-int/lit16 v0, v0, 0x168

    rem-int/lit16 v0, v0, 0x168

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    return-void
.end method

.method private static usesSupportedProcessorArch()Z
    .locals 1

    invoke-static {}, Lio/card/payment/CardScanner;->nUseNeon()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lio/card/payment/CardScanner;->nUseTegra()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lio/card/payment/CardScanner;->nUseX86()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method public endScanning()V
    .locals 1

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/card/payment/CardScanner;->pauseScanning()V

    :cond_0
    invoke-direct {p0}, Lio/card/payment/CardScanner;->nCleanup()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/card/payment/CardScanner;->mPreviewBuffer:[B

    return-void
.end method

.method public getGuideFrame(II)Landroid/graphics/Rect;
    .locals 1

    iget v0, p0, Lio/card/payment/CardScanner;->mFrameOrientation:I

    invoke-virtual {p0, v0, p1, p2}, Lio/card/payment/CardScanner;->getGuideFrame(III)Landroid/graphics/Rect;

    move-result-object p1

    return-object p1
.end method

.method public getGuideFrame(III)Landroid/graphics/Rect;
    .locals 1

    invoke-static {}, Lio/card/payment/CardScanner;->processorSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lio/card/payment/CardScanner;->nGetGuideFrame(IIILandroid/graphics/Rect;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getRotationalOffset()I
    .locals 3

    iget-object v0, p0, Lio/card/payment/CardScanner;->mScanActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/card/payment/CardIOActivity;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const/16 v1, 0x5a

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    const/16 v1, 0xb4

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    if-ne v0, v2, :cond_3

    const/16 v1, 0x10e

    :cond_3
    :goto_0
    return v1
.end method

.method public isAutoFocusing()Z
    .locals 4

    iget-wide v0, p0, Lio/card/payment/CardScanner;->mAutoFocusCompletedAt:J

    iget-wide v2, p0, Lio/card/payment/CardScanner;->mAutoFocusStartedAt:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isFlashOn()Z
    .locals 2

    iget-boolean v0, p0, Lio/card/payment/CardScanner;->useCamera:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v0

    const-string v1, "torch"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lio/card/payment/CardScanner;->mAutoFocusCompletedAt:J

    return-void
.end method

.method public onEdgeUpdate(Lio/card/payment/DetectionInfo;)V
    .locals 1

    iget-object v0, p0, Lio/card/payment/CardScanner;->mScanActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/card/payment/CardIOActivity;

    invoke-virtual {v0, p1}, Lio/card/payment/CardIOActivity;->onEdgeUpdate(Lio/card/payment/DetectionInfo;)V

    return-void
.end method

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 11

    if-nez p1, :cond_0

    sget-object p1, Lio/card/payment/CardScanner;->TAG:Ljava/lang/String;

    const-string p2, "frame is null! skipping"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    sget-boolean v0, Lio/card/payment/CardScanner;->processingInProgress:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    sget-object v0, Lio/card/payment/CardScanner;->TAG:Ljava/lang/String;

    const-string v2, "processing in progress.... dropping frame"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lio/card/payment/CardScanner;->numFramesSkipped:I

    add-int/2addr v0, v1

    iput v0, p0, Lio/card/payment/CardScanner;->numFramesSkipped:I

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    :cond_1
    return-void

    :cond_2
    sput-boolean v1, Lio/card/payment/CardScanner;->processingInProgress:Z

    iget-boolean v0, p0, Lio/card/payment/CardScanner;->mFirstPreviewFrame:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iput-boolean v2, p0, Lio/card/payment/CardScanner;->mFirstPreviewFrame:Z

    iput v1, p0, Lio/card/payment/CardScanner;->mFrameOrientation:I

    iget-object v0, p0, Lio/card/payment/CardScanner;->mScanActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/card/payment/CardIOActivity;

    invoke-virtual {v0, v1}, Lio/card/payment/CardIOActivity;->onFirstFrame(I)V

    :cond_3
    new-instance v0, Lio/card/payment/DetectionInfo;

    invoke-direct {v0}, Lio/card/payment/DetectionInfo;-><init>()V

    const/16 v5, 0x280

    const/16 v6, 0x1e0

    iget v7, p0, Lio/card/payment/CardScanner;->mFrameOrientation:I

    iget-object v9, p0, Lio/card/payment/CardScanner;->detectedBitmap:Landroid/graphics/Bitmap;

    iget-boolean v10, p0, Lio/card/payment/CardScanner;->mScanExpiry:Z

    move-object v3, p0

    move-object v4, p1

    move-object v8, v0

    invoke-direct/range {v3 .. v10}, Lio/card/payment/CardScanner;->nScanFrame([BIIILio/card/payment/DetectionInfo;Landroid/graphics/Bitmap;Z)V

    iget v3, v0, Lio/card/payment/DetectionInfo;->focusScore:F

    const/high16 v4, 0x40c00000    # 6.0f

    cmpl-float v3, v3, v4

    if-ltz v3, :cond_4

    goto :goto_0

    :cond_4
    move v1, v2

    :goto_0
    if-nez v1, :cond_5

    invoke-virtual {p0, v2}, Lio/card/payment/CardScanner;->triggerAutoFocus(Z)V

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lio/card/payment/DetectionInfo;->predicted()Z

    move-result v1

    if-nez v1, :cond_6

    iget-boolean v1, p0, Lio/card/payment/CardScanner;->mSuppressScan:Z

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lio/card/payment/DetectionInfo;->detected()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    iget-object v1, p0, Lio/card/payment/CardScanner;->mScanActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/card/payment/CardIOActivity;

    iget-object v3, p0, Lio/card/payment/CardScanner;->detectedBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v3, v0}, Lio/card/payment/CardIOActivity;->onCardDetected(Landroid/graphics/Bitmap;Lio/card/payment/DetectionInfo;)V

    :cond_7
    :goto_1
    if-eqz p2, :cond_8

    invoke-virtual {p2, p1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    :cond_8
    sput-boolean v2, Lio/card/payment/CardScanner;->processingInProgress:Z

    return-void
.end method

.method public pauseScanning()V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/card/payment/CardScanner;->setFlashOn(Z)Z

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "card.io"

    const-string v3, "can\'t stop preview display"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    iput-object v1, p0, Lio/card/payment/CardScanner;->mPreviewBuffer:[B

    iput-object v1, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    :cond_0
    return-void
.end method

.method public prepareScanner()V
    .locals 9

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/card/payment/CardScanner;->mFirstPreviewFrame:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lio/card/payment/CardScanner;->mAutoFocusStartedAt:J

    iput-wide v0, p0, Lio/card/payment/CardScanner;->mAutoFocusCompletedAt:J

    const/4 v0, 0x0

    iput v0, p0, Lio/card/payment/CardScanner;->numManualRefocus:I

    iput v0, p0, Lio/card/payment/CardScanner;->numAutoRefocus:I

    iput v0, p0, Lio/card/payment/CardScanner;->numManualTorchChange:I

    iput v0, p0, Lio/card/payment/CardScanner;->numFramesSkipped:I

    iget-boolean v1, p0, Lio/card/payment/CardScanner;->useCamera:Z

    if-eqz v1, :cond_4

    iget-object v2, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    if-nez v2, :cond_4

    const/16 v1, 0x32

    const/16 v2, 0x1388

    invoke-direct {p0, v1, v2}, Lio/card/payment/CardScanner;->connectToCamera(II)Landroid/hardware/Camera;

    move-result-object v1

    iput-object v1, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    const-string v2, "card.io"

    if-nez v1, :cond_0

    const-string v0, "prepare scanner couldn\'t connect to camera!"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-direct {p0, v1}, Lio/card/payment/CardScanner;->setCameraDisplayOrientation(Landroid/hardware/Camera;)V

    iget-object v1, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v3

    const/16 v4, 0x1e0

    const/16 v5, 0x280

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/hardware/Camera$Size;

    iget v8, v7, Landroid/hardware/Camera$Size;->width:I

    if-ne v8, v5, :cond_1

    iget v8, v7, Landroid/hardware/Camera$Size;->height:I

    if-ne v8, v4, :cond_1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    :goto_0
    if-nez v7, :cond_3

    const-string v6, "Didn\'t find a supported 640x480 resolution, so forcing"

    invoke-static {v2, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    iput v5, v0, Landroid/hardware/Camera$Size;->width:I

    iput v4, v0, Landroid/hardware/Camera$Size;->height:I

    :cond_3
    invoke-virtual {v1, v5, v4}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    goto :goto_1

    :cond_4
    if-nez v1, :cond_5

    sget-object v0, Lio/card/payment/CardScanner;->TAG:Ljava/lang/String;

    const-string v1, "useCamera is false!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_6

    sget-object v0, Lio/card/payment/CardScanner;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "we already have a camera instance: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    :goto_1
    iget-object v0, p0, Lio/card/payment/CardScanner;->detectedBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_7

    const/16 v0, 0x10e

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/16 v2, 0x1ac

    invoke-static {v2, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lio/card/payment/CardScanner;->detectedBitmap:Landroid/graphics/Bitmap;

    :cond_7
    return-void
.end method

.method public resumeScanning(Landroid/view/SurfaceHolder;)Z
    .locals 4

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/card/payment/CardScanner;->prepareScanner()V

    :cond_0
    iget-boolean v0, p0, Lio/card/payment/CardScanner;->useCamera:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    if-nez v2, :cond_1

    sget-object p1, Lio/card/payment/CardScanner;->TAG:Ljava/lang/String;

    const-string v0, "null camera. failure"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_1
    const/4 v2, 0x3

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/card/payment/CardScanner;->mPreviewBuffer:[B

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result v0

    invoke-static {v0}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    const v3, 0x4b000

    mul-int/2addr v0, v3

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    iput-object v0, p0, Lio/card/payment/CardScanner;->mPreviewBuffer:[B

    iget-object v3, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v3, v0}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    :cond_2
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-interface {p1, v2}, Landroid/view/SurfaceHolder;->setType(I)V

    iget-boolean v0, p0, Lio/card/payment/CardScanner;->useCamera:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    :cond_3
    iget-boolean v0, p0, Lio/card/payment/CardScanner;->isSurfaceValid:Z

    if-eqz v0, :cond_4

    invoke-direct {p0, p1}, Lio/card/payment/CardScanner;->makePreviewGo(Landroid/view/SurfaceHolder;)Z

    :cond_4
    invoke-virtual {p0, v1}, Lio/card/payment/CardScanner;->setFlashOn(Z)Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/card/payment/CardScanner;->captureStart:J

    invoke-direct {p0}, Lio/card/payment/CardScanner;->nResetAnalytics()V

    const/4 p1, 0x1

    return p1
.end method

.method public setDeviceOrientation(I)V
    .locals 0

    iput p1, p0, Lio/card/payment/CardScanner;->mFrameOrientation:I

    return-void
.end method

.method public setFlashOn(Z)Z
    .locals 3

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    if-eqz p1, :cond_0

    const-string p1, "torch"

    goto :goto_0

    :cond_0
    const-string p1, "off"

    :goto_0
    invoke-virtual {v0, p1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    iget-object p1, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    iget p1, p0, Lio/card/payment/CardScanner;->numManualTorchChange:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Lio/card/payment/CardScanner;->numManualTorchChange:I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception p1

    sget-object v0, Lio/card/payment/CardScanner;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not set flash mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 4

    sget-object v0, Lio/card/payment/CardScanner;->TAG:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v3

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    aput-object p1, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    const/4 p1, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, p1

    const/4 p1, 0x3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, p1

    const-string p1, "Preview.surfaceChanged(holder?:%b, f:%d, w:%d, h:%d )"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lio/card/payment/CardScanner;->useCamera:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "card.io"

    const-string v0, "CardScanner.surfaceCreated() - camera is null!"

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/card/payment/CardScanner;->isSurfaceValid:Z

    invoke-direct {p0, p1}, Lio/card/payment/CardScanner;->makePreviewGo(Landroid/view/SurfaceHolder;)Z

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    iget-object p1, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Landroid/hardware/Camera;->stopPreview()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "card.io"

    const-string v1, "error stopping camera"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/card/payment/CardScanner;->isSurfaceValid:Z

    return-void
.end method

.method public triggerAutoFocus(Z)V
    .locals 3

    iget-boolean v0, p0, Lio/card/payment/CardScanner;->useCamera:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/card/payment/CardScanner;->isAutoFocusing()Z

    move-result v0

    if-nez v0, :cond_1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/card/payment/CardScanner;->mAutoFocusStartedAt:J

    iget-object v0, p0, Lio/card/payment/CardScanner;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    if-eqz p1, :cond_0

    iget p1, p0, Lio/card/payment/CardScanner;->numManualRefocus:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lio/card/payment/CardScanner;->numManualRefocus:I

    goto :goto_0

    :cond_0
    iget p1, p0, Lio/card/payment/CardScanner;->numAutoRefocus:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lio/card/payment/CardScanner;->numAutoRefocus:I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lio/card/payment/CardScanner;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "could not trigger auto focus: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

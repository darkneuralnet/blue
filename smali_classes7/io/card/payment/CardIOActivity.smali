.class public final Lio/card/payment/CardIOActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field public static final EXTRA_CAPTURED_CARD_IMAGE:Ljava/lang/String; = "io.card.payment.capturedCardImage"

.field public static final EXTRA_GUIDE_COLOR:Ljava/lang/String; = "io.card.payment.guideColor"

.field public static final EXTRA_HIDE_CARDIO_LOGO:Ljava/lang/String; = "io.card.payment.hideLogo"

.field public static final EXTRA_KEEP_APPLICATION_THEME:Ljava/lang/String; = "io.card.payment.keepApplicationTheme"

.field public static final EXTRA_LANGUAGE_OR_LOCALE:Ljava/lang/String; = "io.card.payment.languageOrLocale"

.field public static final EXTRA_NO_CAMERA:Ljava/lang/String; = "io.card.payment.noCamera"

.field public static final EXTRA_REQUIRE_CARDHOLDER_NAME:Ljava/lang/String; = "io.card.payment.requireCardholderName"

.field public static final EXTRA_REQUIRE_CVV:Ljava/lang/String; = "io.card.payment.requireCVV"

.field public static final EXTRA_REQUIRE_EXPIRY:Ljava/lang/String; = "io.card.payment.requireExpiry"

.field public static final EXTRA_REQUIRE_POSTAL_CODE:Ljava/lang/String; = "io.card.payment.requirePostalCode"

.field public static final EXTRA_RESTRICT_POSTAL_CODE_TO_NUMERIC_ONLY:Ljava/lang/String; = "io.card.payment.restrictPostalCodeToNumericOnly"

.field public static final EXTRA_RETURN_CARD_IMAGE:Ljava/lang/String; = "io.card.payment.returnCardImage"

.field public static final EXTRA_SCAN_EXPIRY:Ljava/lang/String; = "io.card.payment.scanExpiry"

.field public static final EXTRA_SCAN_INSTRUCTIONS:Ljava/lang/String; = "io.card.payment.scanInstructions"

.field public static final EXTRA_SCAN_OVERLAY_LAYOUT_ID:Ljava/lang/String; = "io.card.payment.scanOverlayLayoutId"

.field public static final EXTRA_SCAN_RESULT:Ljava/lang/String; = "io.card.payment.scanResult"

.field public static final EXTRA_SUPPRESS_CONFIRMATION:Ljava/lang/String; = "io.card.payment.suppressConfirmation"

.field public static final EXTRA_SUPPRESS_MANUAL_ENTRY:Ljava/lang/String; = "io.card.payment.suppressManual"

.field public static final EXTRA_SUPPRESS_SCAN:Ljava/lang/String; = "io.card.payment.suppressScan"

.field public static final EXTRA_UNBLUR_DIGITS:Ljava/lang/String; = "io.card.payment.unblurDigits"

.field public static final EXTRA_USE_CARDIO_LOGO:Ljava/lang/String; = "io.card.payment.useCardIOLogo"

.field public static final EXTRA_USE_PAYPAL_ACTIONBAR_ICON:Ljava/lang/String; = "io.card.payment.intentSenderIsPayPal"

.field public static final RESULT_CARD_INFO:I = 0xca8d10

.field public static final RESULT_CONFIRMATION_SUPPRESSED:I

.field public static final RESULT_ENTRY_CANCELED:I

.field public static final RESULT_SCAN_NOT_AVAILABLE:I

.field public static final RESULT_SCAN_SUPPRESSED:I

.field private static final TAG:Ljava/lang/String; = "CardIOActivity"

.field private static final VIBRATE_PATTERN:[J

.field private static lastResult:I

.field static markedCardImage:Landroid/graphics/Bitmap;

.field private static numActivityAllocations:I


# instance fields
.field private customOverlayLayout:Landroid/widget/LinearLayout;

.field private mCardScanner:Lio/card/payment/CardScanner;

.field private mDetectOnly:Z

.field private mDetectedCard:Lio/card/payment/CreditCard;

.field private mFrameOrientation:I

.field private mGuideFrame:Landroid/graphics/Rect;

.field private mLastDegrees:I

.field private mMainLayout:Landroid/widget/FrameLayout;

.field private mOverlay:Lio/card/payment/OverlayView;

.field mPreview:Lio/card/payment/Preview;

.field private mUIBar:Landroid/widget/RelativeLayout;

.field private manualEntryFallbackOrForced:Z

.field private orientationListener:Landroid/view/OrientationEventListener;

.field private suppressManualEntry:Z

.field private useApplicationTheme:Z

.field private waitingForPermission:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const v0, 0xca8d10

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v0, 0x1

    sput v0, Lio/card/payment/CardIOActivity;->RESULT_ENTRY_CANCELED:I

    add-int/lit8 v0, v1, 0x1

    sput v1, Lio/card/payment/CardIOActivity;->RESULT_SCAN_NOT_AVAILABLE:I

    add-int/lit8 v1, v0, 0x1

    sput v0, Lio/card/payment/CardIOActivity;->RESULT_SCAN_SUPPRESSED:I

    add-int/lit8 v0, v1, 0x1

    sput v0, Lio/card/payment/CardIOActivity;->lastResult:I

    sput v1, Lio/card/payment/CardIOActivity;->RESULT_CONFIRMATION_SUPPRESSED:I

    const/4 v0, 0x4

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lio/card/payment/CardIOActivity;->VIBRATE_PATTERN:[J

    const/4 v0, 0x0

    sput-object v0, Lio/card/payment/CardIOActivity;->markedCardImage:Landroid/graphics/Bitmap;

    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0x46
        0xa
        0x28
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    return-void
.end method

.method public static synthetic access$000(Lio/card/payment/CardIOActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/card/payment/CardIOActivity;->doOrientationChange(I)V

    return-void
.end method

.method public static synthetic access$100(Lio/card/payment/CardIOActivity;)Lio/card/payment/OverlayView;
    .locals 0

    iget-object p0, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    return-object p0
.end method

.method public static synthetic access$200(Lio/card/payment/CardIOActivity;)Lio/card/payment/CreditCard;
    .locals 0

    iget-object p0, p0, Lio/card/payment/CardIOActivity;->mDetectedCard:Lio/card/payment/CreditCard;

    return-object p0
.end method

.method public static synthetic access$202(Lio/card/payment/CardIOActivity;Lio/card/payment/CreditCard;)Lio/card/payment/CreditCard;
    .locals 0

    iput-object p1, p0, Lio/card/payment/CardIOActivity;->mDetectedCard:Lio/card/payment/CreditCard;

    return-object p1
.end method

.method public static synthetic access$300(Lio/card/payment/CardIOActivity;)V
    .locals 0

    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->nextActivity()V

    return-void
.end method

.method private android22AndBelowHandleCamera()V
    .locals 1

    iget-boolean v0, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->finishIfSuppressManualEntry()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->requestWindowFeature(I)Z

    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->showCameraScannerOverlay()V

    :goto_0
    return-void
.end method

.method private android23AndAboveHandleCamera()V
    .locals 1

    iget-boolean v0, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->finishIfSuppressManualEntry()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->showCameraScannerOverlay()V

    :goto_0
    return-void
.end method

.method public static canReadCardWithCamera()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lio/card/payment/Util;->hardwareSupported()Z

    move-result v0
    :try_end_0
    .catch Lio/card/payment/CameraUnavailableException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    sget-object v1, Lio/card/payment/CardIOActivity;->TAG:Ljava/lang/String;

    const-string v2, "RuntimeException accessing Util.hardwareSupported()"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :catch_1
    return v0
.end method

.method private checkCamera()V
    .locals 6

    const-string v0, ": "

    const-string v1, "card.io"

    const/4 v2, 0x1

    :try_start_0
    invoke-static {}, Lio/card/payment/Util;->hardwareSupported()Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Lio/card/payment/i18n/StringKey;->ERROR_NO_DEVICE_SUPPORT:Lio/card/payment/i18n/StringKey;

    invoke-static {v3}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v2, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z
    :try_end_0
    .catch Lio/card/payment/CameraUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v3, Lio/card/payment/i18n/StringKey;->ERROR_CAMERA_CONNECT_FAIL:Lio/card/payment/i18n/StringKey;

    invoke-static {v3}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v4, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v3, -0x4b

    const/16 v4, 0x11

    invoke-virtual {v0, v4, v1, v3}, Landroid/widget/Toast;->setGravity(III)V

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iput-boolean v2, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    :cond_0
    :goto_0
    return-void
.end method

.method private doOrientationChange(I)V
    .locals 4

    if-ltz p1, :cond_9

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v0}, Lio/card/payment/CardScanner;->getRotationalOffset()I

    move-result v0

    add-int/2addr p1, v0

    const/16 v0, 0x168

    if-le p1, v0, :cond_1

    add-int/lit16 p1, p1, -0x168

    :cond_1
    const/16 v0, 0xf

    const/16 v1, 0x10e

    const/16 v2, 0x5a

    if-lt p1, v0, :cond_6

    const/16 v0, 0x159

    if-le p1, v0, :cond_2

    goto :goto_0

    :cond_2
    const/16 v0, 0x4b

    if-le p1, v0, :cond_3

    const/16 v0, 0x69

    if-ge p1, v0, :cond_3

    const/4 p1, 0x4

    iput p1, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    move p1, v2

    goto :goto_1

    :cond_3
    const/16 v0, 0xa5

    if-le p1, v0, :cond_4

    const/16 v0, 0xc3

    if-ge p1, v0, :cond_4

    const/4 p1, 0x2

    iput p1, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    const/16 p1, 0xb4

    goto :goto_1

    :cond_4
    const/16 v0, 0xff

    if-le p1, v0, :cond_5

    const/16 v0, 0x11d

    if-ge p1, v0, :cond_5

    const/4 p1, 0x3

    iput p1, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    move p1, v1

    goto :goto_1

    :cond_5
    const/4 p1, -0x1

    goto :goto_1

    :cond_6
    :goto_0
    const/4 p1, 0x1

    iput p1, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    const/4 p1, 0x0

    :goto_1
    if-ltz p1, :cond_9

    iget v0, p0, Lio/card/payment/CardIOActivity;->mLastDegrees:I

    if-eq p1, v0, :cond_9

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    iget v3, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    invoke-virtual {v0, v3}, Lio/card/payment/CardScanner;->setDeviceOrientation(I)V

    invoke-direct {p0, p1}, Lio/card/payment/CardIOActivity;->setDeviceDegrees(I)V

    if-ne p1, v2, :cond_7

    const/high16 p1, 0x43870000    # 270.0f

    invoke-direct {p0, p1}, Lio/card/payment/CardIOActivity;->rotateCustomOverlay(F)V

    goto :goto_2

    :cond_7
    if-ne p1, v1, :cond_8

    const/high16 p1, 0x42b40000    # 90.0f

    invoke-direct {p0, p1}, Lio/card/payment/CardIOActivity;->rotateCustomOverlay(F)V

    goto :goto_2

    :cond_8
    int-to-float p1, p1

    invoke-direct {p0, p1}, Lio/card/payment/CardIOActivity;->rotateCustomOverlay(F)V

    :cond_9
    :goto_2
    return-void
.end method

.method private finishIfSuppressManualEntry()V
    .locals 2

    iget-boolean v0, p0, Lio/card/payment/CardIOActivity;->suppressManualEntry:Z

    if-eqz v0, :cond_0

    const-string v0, "card.io"

    const-string v1, "Camera not available and manual entry suppressed."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget v0, Lio/card/payment/CardIOActivity;->RESULT_SCAN_NOT_AVAILABLE:I

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lio/card/payment/CardIOActivity;->setResultAndFinish(ILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public static getCapturedCardImage(Landroid/content/Intent;)Landroid/graphics/Bitmap;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const-string v1, "io.card.payment.capturedCardImage"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object p0

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    invoke-static {v1, v0, p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method private handleGeneralExceptionError(Ljava/lang/Exception;)V
    .locals 4

    sget-object v0, Lio/card/payment/i18n/StringKey;->ERROR_CAMERA_UNEXPECTED_FAIL:Lio/card/payment/i18n/StringKey;

    invoke-static {v0}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "card.io"

    const-string v2, "Unknown exception, please post the stack trace as a GitHub issue"

    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x1

    invoke-static {p0, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, -0x4b

    const/16 v3, 0x11

    invoke-virtual {v0, v3, v1, v2}, Landroid/widget/Toast;->setGravity(III)V

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iput-boolean p1, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    return-void
.end method

.method private nextActivity()V
    .locals 4

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "io.card.payment.suppressConfirmation"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lio/card/payment/DataEntryActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v2, p0, Lio/card/payment/CardIOActivity;->mDetectedCard:Lio/card/payment/CreditCard;

    if-eqz v2, :cond_0

    const-string v3, "io.card.payment.scanResult"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 v2, 0x0

    iput-object v2, p0, Lio/card/payment/CardIOActivity;->mDetectedCard:Lio/card/payment/CreditCard;

    :cond_0
    iget-object v2, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-static {v0, v1, v2}, Lio/card/payment/Util;->writeCapturedCardImageIfNecessary(Landroid/content/Intent;Landroid/content/Intent;Lio/card/payment/OverlayView;)V

    sget v0, Lio/card/payment/CardIOActivity;->RESULT_CONFIRMATION_SUPPRESSED:I

    invoke-direct {p0, v0, v1}, Lio/card/payment/CardIOActivity;->setResultAndFinish(ILandroid/content/Intent;)V

    goto :goto_0

    :cond_1
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lio/card/payment/CardIOActivity$2;

    invoke-direct {v2, p0, v0}, Lio/card/payment/CardIOActivity$2;-><init>(Lio/card/payment/CardIOActivity;Landroid/content/Intent;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method private restartPreview()Z
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lio/card/payment/CardIOActivity;->mDetectedCard:Lio/card/payment/CreditCard;

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mPreview:Lio/card/payment/Preview;

    invoke-virtual {v1}, Lio/card/payment/Preview;->getSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/card/payment/CardScanner;->resumeScanning(Landroid/view/SurfaceHolder;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mUIBar:Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return v0
.end method

.method private rotateCustomOverlay(F)V
    .locals 4

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->customOverlayLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->customOverlayLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    new-instance v2, Landroid/view/animation/RotateAnimation;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1, v0, v1}, Landroid/view/animation/RotateAnimation;-><init>(FFFF)V

    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    const/4 p1, 0x1

    invoke-virtual {v2, p1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    iget-object p1, p0, Lio/card/payment/CardIOActivity;->customOverlayLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method public static sdkBuildDate()Ljava/util/Date;
    .locals 2

    new-instance v0, Ljava/util/Date;

    const-string v1, "03/17/2017 14:23:12 -0400"

    invoke-direct {v0, v1}, Ljava/util/Date;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static sdkVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "5.5.1"

    return-object v0
.end method

.method private setDeviceDegrees(I)V
    .locals 4

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mPreview:Lio/card/payment/Preview;

    invoke-virtual {v0}, Lio/card/payment/Preview;->getSurfaceView()Landroid/view/SurfaceView;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "card.io"

    const-string v0, "surface view is null.. recovering... rotation might be weird."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/card/payment/CardScanner;->getGuideFrame(II)Landroid/graphics/Rect;

    move-result-object v1

    iput-object v1, p0, Lio/card/payment/CardIOActivity;->mGuideFrame:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->top:I

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mGuideFrame:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    add-int/2addr v2, v0

    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mGuideFrame:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, p1}, Lio/card/payment/OverlayView;->setGuideAndRotation(Landroid/graphics/Rect;I)V

    iput p1, p0, Lio/card/payment/CardIOActivity;->mLastDegrees:I

    return-void
.end method

.method private setPreviewLayout()V
    .locals 8

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lio/card/payment/CardIOActivity;->mMainLayout:Landroid/widget/FrameLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mMainLayout:Landroid/widget/FrameLayout;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    new-instance v2, Lio/card/payment/Preview;

    iget-object v4, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v4, 0x1e0

    const/4 v5, 0x0

    const/16 v6, 0x280

    invoke-direct {v2, p0, v5, v6, v4}, Lio/card/payment/Preview;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v2, p0, Lio/card/payment/CardIOActivity;->mPreview:Lio/card/payment/Preview;

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v6, 0x30

    invoke-direct {v4, v3, v3, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, p0, Lio/card/payment/CardIOActivity;->mPreview:Lio/card/payment/Preview;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Lio/card/payment/OverlayView;

    invoke-static {p0}, Lio/card/payment/Util;->deviceSupportsTorch(Landroid/content/Context;)Z

    move-result v4

    invoke-direct {v2, p0, v5, v4}, Lio/card/payment/OverlayView;-><init>(Lio/card/payment/CardIOActivity;Landroid/util/AttributeSet;Z)V

    iput-object v2, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v6, "io.card.payment.useCardIOLogo"

    invoke-virtual {v2, v6, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    iget-object v6, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-virtual {v6, v2}, Lio/card/payment/OverlayView;->setUseCardIOLogo(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v6, "io.card.payment.guideColor"

    invoke-virtual {v2, v6, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    if-eqz v2, :cond_1

    or-int/2addr v1, v2

    if-eq v2, v1, :cond_0

    const-string v2, "card.io"

    const-string v6, "Removing transparency from provided guide color."

    invoke-static {v2, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v2, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-virtual {v2, v1}, Lio/card/payment/OverlayView;->setGuideColor(I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    const v2, -0xff0100

    invoke-virtual {v1, v2}, Lio/card/payment/OverlayView;->setGuideColor(I)V

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "io.card.payment.hideLogo"

    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    iget-object v2, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-virtual {v2, v1}, Lio/card/payment/OverlayView;->setHideCardIOLogo(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "io.card.payment.scanInstructions"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-virtual {v2, v1}, Lio/card/payment/OverlayView;->setScanInstructions(Ljava/lang/String;)V

    :cond_2
    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v6, p0, Lio/card/payment/CardIOActivity;->mMainLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v6, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lio/card/payment/CardIOActivity;->mUIBar:Landroid/widget/RelativeLayout;

    const/16 v6, 0x50

    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setGravity(I)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {v0, v3, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0xc

    invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mUIBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mUIBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mUIBar:Landroid/widget/RelativeLayout;

    const/16 v1, 0x55

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setGravity(I)V

    iget-boolean v0, p0, Lio/card/payment/CardIOActivity;->suppressManualEntry:Z

    if-nez v0, :cond_4

    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    sget-object v1, Lio/card/payment/i18n/StringKey;->KEYBOARD:Lio/card/payment/i18n/StringKey;

    invoke-static {v1}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Lio/card/payment/CardIOActivity$3;

    invoke-direct {v1, p0}, Lio/card/payment/CardIOActivity$3;-><init>(Lio/card/payment/CardIOActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mUIBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v1, p0, Lio/card/payment/CardIOActivity;->useApplicationTheme:Z

    invoke-static {v0, v4, p0, v1}, Lio/card/payment/ui/ViewUtil;->styleAsButton(Landroid/widget/Button;ZLandroid/content/Context;Z)V

    iget-boolean v1, p0, Lio/card/payment/CardIOActivity;->useApplicationTheme:Z

    if-nez v1, :cond_3

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_3
    const-string v1, "42dip"

    invoke-static {v1, p0}, Lio/card/payment/ui/ViewUtil;->typedDimensionValueToPixelsInt(Ljava/lang/String;Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    iput v6, v1, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    iput v6, v1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const-string v1, "16dip"

    invoke-static {v0, v1, v5, v1, v5}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "4dip"

    invoke-static {v0, v1, v1, v1, v1}, Lio/card/payment/ui/ViewUtil;->setMargins(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v3, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x41700000    # 15.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v4, v1, v4, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mMainLayout:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lio/card/payment/CardIOActivity;->mUIBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->customOverlayLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mMainLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iput-object v5, p0, Lio/card/payment/CardIOActivity;->customOverlayLayout:Landroid/widget/LinearLayout;

    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "io.card.payment.scanOverlayLayoutId"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v3, :cond_6

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lio/card/payment/CardIOActivity;->customOverlayLayout:Landroid/widget/LinearLayout;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    iget-object v2, p0, Lio/card/payment/CardIOActivity;->customOverlayLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mMainLayout:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->customOverlayLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_6
    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mMainLayout:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method private setResultAndFinish(ILandroid/content/Intent;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    const/4 p1, 0x0

    sput-object p1, Lio/card/payment/CardIOActivity;->markedCardImage:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private showCameraScannerOverlay()V
    .locals 6

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/ActionBar;->hide()V

    :cond_0
    :try_start_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lio/card/payment/CardIOActivity;->mGuideFrame:Landroid/graphics/Rect;

    const/4 v0, 0x1

    iput v0, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "io.card.payment.cameraBypassTestMode"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v4, "io.card.development"

    invoke-virtual {v1, v4}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "io.card.payment.CardScannerTester"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    new-array v4, v2, [Ljava/lang/Class;

    const-class v5, Lio/card/payment/CardIOActivity;

    aput-object v5, v4, v3

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v0

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    new-array v4, v2, [Ljava/lang/Object;

    aput-object p0, v4, v3

    iget v3, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v0

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/card/payment/CardScanner;

    iput-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Illegal access of private extra"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lio/card/payment/CardScanner;

    iget v1, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    invoke-direct {v0, p0, v1}, Lio/card/payment/CardScanner;-><init>(Lio/card/payment/CardIOActivity;I)V

    iput-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    :goto_0
    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    invoke-virtual {v0}, Lio/card/payment/CardScanner;->prepareScanner()V

    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->setPreviewLayout()V

    new-instance v0, Lio/card/payment/CardIOActivity$1;

    invoke-direct {v0, p0, p0, v2}, Lio/card/payment/CardIOActivity$1;-><init>(Lio/card/payment/CardIOActivity;Landroid/content/Context;I)V

    iput-object v0, p0, Lio/card/payment/CardIOActivity;->orientationListener:Landroid/view/OrientationEventListener;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lio/card/payment/CardIOActivity;->handleGeneralExceptionError(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method private showErrorMessage(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "error display: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "card.io"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method


# virtual methods
.method public getTorchRect()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lio/card/payment/OverlayView;->getTorchRect()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    goto :goto_2

    :cond_0
    if-nez p2, :cond_1

    sget-object p1, Lio/card/payment/CardIOActivity;->TAG:Ljava/lang/String;

    const-string p2, "ignoring onActivityResult(RESULT_CANCELED) caused only when Camera Permissions are Denied in Android 23"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_1
    sget p1, Lio/card/payment/CardIOActivity;->RESULT_CARD_INFO:I

    if-eq p2, p1, :cond_3

    sget p1, Lio/card/payment/CardIOActivity;->RESULT_ENTRY_CANCELED:I

    if-eq p2, p1, :cond_3

    iget-boolean p1, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lio/card/payment/CardIOActivity;->mUIBar:Landroid/widget/RelativeLayout;

    if-eqz p1, :cond_5

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_3
    :goto_0
    if-eqz p3, :cond_4

    const-string p1, "io.card.payment.scanResult"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lio/card/payment/CardIOActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "EXTRA_SCAN_RESULT: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_4
    sget-object p1, Lio/card/payment/CardIOActivity;->TAG:Ljava/lang/String;

    const-string v0, "no data in EXTRA_SCAN_RESULT"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-direct {p0, p2, p3}, Lio/card/payment/CardIOActivity;->setResultAndFinish(ILandroid/content/Intent;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public onBackPressed()V
    .locals 4

    iget-boolean v0, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-virtual {v0}, Lio/card/payment/OverlayView;->isAnimating()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->restartPreview()Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lio/card/payment/CardIOActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "*** could not return to preview: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    if-eqz v0, :cond_1

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCardDetected(Landroid/graphics/Bitmap;Lio/card/payment/DetectionInfo;)V
    .locals 7

    const-string v0, "card.io"

    :try_start_0
    const-string v1, "vibrator"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Vibrator;

    sget-object v2, Lio/card/payment/CardIOActivity;->VIBRATE_PATTERN:[J

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/os/Vibrator;->vibrate([JI)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Exception while attempting to vibrate: "

    invoke-static {v0, v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    const-string v1, "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application\'s manifest."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    invoke-virtual {v0}, Lio/card/payment/CardScanner;->pauseScanning()V

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mUIBar:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p2}, Lio/card/payment/DetectionInfo;->predicted()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lio/card/payment/DetectionInfo;->creditCard()Lio/card/payment/CreditCard;

    move-result-object p2

    iput-object p2, p0, Lio/card/payment/CardIOActivity;->mDetectedCard:Lio/card/payment/CreditCard;

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-virtual {v0, p2}, Lio/card/payment/OverlayView;->setDetectedCard(Lio/card/payment/CreditCard;)V

    :cond_0
    iget p2, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    const/4 v0, 0x1

    const/high16 v1, 0x43d60000    # 428.0f

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lio/card/payment/CardIOActivity;->mGuideFrame:Landroid/graphics/Rect;

    iget p2, p2, Landroid/graphics/Rect;->right:I

    int-to-float p2, p2

    div-float/2addr p2, v1

    const v0, 0x3f933333    # 1.15f

    goto :goto_2

    :cond_2
    :goto_1
    iget-object p2, p0, Lio/card/payment/CardIOActivity;->mGuideFrame:Landroid/graphics/Rect;

    iget p2, p2, Landroid/graphics/Rect;->right:I

    int-to-float p2, p2

    div-float/2addr p2, v1

    const v0, 0x3f733333    # 0.95f

    :goto_2
    mul-float/2addr p2, v0

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v5, p2, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-virtual {p2, p1}, Lio/card/payment/OverlayView;->setBitmap(Landroid/graphics/Bitmap;)V

    iget-boolean p1, p0, Lio/card/payment/CardIOActivity;->mDetectOnly:Z

    if-eqz p1, :cond_3

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p2

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-static {p2, p1, v0}, Lio/card/payment/Util;->writeCapturedCardImageIfNecessary(Landroid/content/Intent;Landroid/content/Intent;Lio/card/payment/OverlayView;)V

    sget p2, Lio/card/payment/CardIOActivity;->RESULT_SCAN_SUPPRESSED:I

    invoke-direct {p0, p2, p1}, Lio/card/payment/CardIOActivity;->setResultAndFinish(ILandroid/content/Intent;)V

    goto :goto_3

    :cond_3
    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->nextActivity()V

    :goto_3
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    const-string v0, "android.permission.CAMERA"

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    sget v1, Lio/card/payment/CardIOActivity;->numActivityAllocations:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    sput v1, Lio/card/payment/CardIOActivity;->numActivityAllocations:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    sget-object v4, Lio/card/payment/CardIOActivity;->TAG:Ljava/lang/String;

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v3

    const-string v1, "INTERNAL WARNING: There are %d (not 1) CardIOActivity allocations!"

    invoke-static {v1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v5, "io.card.payment.keepApplicationTheme"

    invoke-virtual {v4, v5, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, p0, Lio/card/payment/CardIOActivity;->useApplicationTheme:Z

    invoke-static {p0, v4}, Lio/card/payment/ui/ActivityHelper;->setActivityTheme(Landroid/app/Activity;Z)V

    invoke-static {v1}, Lio/card/payment/i18n/LocalizedStrings;->setLanguage(Landroid/content/Intent;)V

    const-string v4, "io.card.payment.suppressScan"

    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, p0, Lio/card/payment/CardIOActivity;->mDetectOnly:Z

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    const/high16 v5, 0x10000

    invoke-virtual {v4, v1, v5}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v4

    const-class v5, Lio/card/payment/CardIOActivity;

    invoke-static {v4, v5}, Lio/card/payment/Util;->manifestHasConfigChange(Landroid/content/pm/ResolveInfo;Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    const-string v4, "io.card.payment.suppressManual"

    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, p0, Lio/card/payment/CardIOActivity;->suppressManualEntry:Z

    if-eqz p1, :cond_1

    const-string v4, "io.card.payment.waitingForPermission"

    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lio/card/payment/CardIOActivity;->waitingForPermission:Z

    :cond_1
    const-string p1, "io.card.payment.noCamera"

    invoke-virtual {v1, p1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    const-string v1, "card.io"

    if-eqz p1, :cond_2

    const-string p1, "EXTRA_NO_CAMERA set to true. Skipping camera."

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v2, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    goto :goto_0

    :cond_2
    invoke-static {}, Lio/card/payment/CardScanner;->processorSupported()Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "Processor not Supported. Skipping camera."

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v2, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    goto :goto_0

    :cond_3
    :try_start_0
    iget-boolean p1, p0, Lio/card/payment/CardIOActivity;->waitingForPermission:Z

    if-nez p1, :cond_5

    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_4

    sget-object p1, Lio/card/payment/CardIOActivity;->TAG:Ljava/lang/String;

    const-string v1, "permission denied to camera - requesting it"

    invoke-static {p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object p1

    iput-boolean v2, p0, Lio/card/payment/CardIOActivity;->waitingForPermission:Z

    const/16 v0, 0xb

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    :cond_4
    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->checkCamera()V

    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->android23AndAboveHandleCamera()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Lio/card/payment/CardIOActivity;->handleGeneralExceptionError(Ljava/lang/Exception;)V

    :cond_5
    :goto_0
    return-void

    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onDestroy()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    sget v1, Lio/card/payment/CardIOActivity;->numActivityAllocations:I

    add-int/lit8 v1, v1, -0x1

    sput v1, Lio/card/payment/CardIOActivity;->numActivityAllocations:I

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->orientationListener:Landroid/view/OrientationEventListener;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/OrientationEventListener;->disable()V

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lio/card/payment/CardIOActivity;->setFlashOn(Z)V

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/card/payment/CardScanner;->endScanning()V

    iput-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    :cond_1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method public onEdgeUpdate(Lio/card/payment/DetectionInfo;)V
    .locals 1

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-virtual {v0, p1}, Lio/card/payment/OverlayView;->setDetectionInfo(Lio/card/payment/DetectionInfo;)V

    return-void
.end method

.method public onFirstFrame(I)V
    .locals 6

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mPreview:Lio/card/payment/Preview;

    invoke-virtual {v0}, Lio/card/payment/Preview;->getSurfaceView()Landroid/view/SurfaceView;

    move-result-object v0

    iget-object v1, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    if-eqz v1, :cond_0

    new-instance v2, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-direct {v2, v3, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v1, v2}, Lio/card/payment/OverlayView;->setCameraPreviewRect(Landroid/graphics/Rect;)V

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/card/payment/CardIOActivity;->setDeviceDegrees(I)V

    iget v0, p0, Lio/card/payment/CardIOActivity;->mFrameOrientation:I

    if-eq p1, v0, :cond_1

    const-string p1, "card.io"

    const-string v0, "the orientation of the scanner doesn\'t match the orientation of the activity"

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    new-instance p1, Lio/card/payment/DetectionInfo;

    invoke-direct {p1}, Lio/card/payment/DetectionInfo;-><init>()V

    invoke-virtual {p0, p1}, Lio/card/payment/CardIOActivity;->onEdgeUpdate(Lio/card/payment/DetectionInfo;)V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->orientationListener:Landroid/view/OrientationEventListener;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/card/payment/CardIOActivity;->setFlashOn(Z)V

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/card/payment/CardScanner;->pauseScanning()V

    :cond_1
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    const/16 p2, 0xb

    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/card/payment/CardIOActivity;->waitingForPermission:Z

    array-length p2, p3

    if-lez p2, :cond_0

    aget p1, p3, p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->showCameraScannerOverlay()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    iget-boolean v0, p0, Lio/card/payment/CardIOActivity;->waitingForPermission:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lio/card/payment/CardIOActivity;->manualEntryFallbackOrForced:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->nextActivity()V

    return-void

    :cond_0
    invoke-static {}, Lio/card/payment/Util;->logNativeMemoryStats()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    invoke-static {p0}, Lio/card/payment/ui/ActivityHelper;->setFlagSecure(Landroid/app/Activity;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->orientationListener:Landroid/view/OrientationEventListener;

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->enable()V

    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->restartPreview()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lio/card/payment/CardIOActivity;->TAG:Ljava/lang/String;

    const-string v1, "Could not connect to camera."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lio/card/payment/i18n/StringKey;->ERROR_CAMERA_UNEXPECTED_FAIL:Lio/card/payment/i18n/StringKey;

    invoke-static {v0}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/card/payment/CardIOActivity;->showErrorMessage(Ljava/lang/String;)V

    invoke-direct {p0}, Lio/card/payment/CardIOActivity;->nextActivity()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/card/payment/CardIOActivity;->setFlashOn(Z)V

    :goto_0
    iget v0, p0, Lio/card/payment/CardIOActivity;->mLastDegrees:I

    invoke-direct {p0, v0}, Lio/card/payment/CardIOActivity;->doOrientationChange(I)V

    :cond_2
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "io.card.payment.waitingForPermission"

    iget-boolean v1, p0, Lio/card/payment/CardIOActivity;->waitingForPermission:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public setFlashOn(Z)V
    .locals 1

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mPreview:Lio/card/payment/Preview;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    invoke-virtual {v0, p1}, Lio/card/payment/CardScanner;->setFlashOn(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mOverlay:Lio/card/payment/OverlayView;

    invoke-virtual {v0, p1}, Lio/card/payment/OverlayView;->setTorchOn(Z)V

    :cond_1
    return-void
.end method

.method public toggleFlash()V
    .locals 1

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    invoke-virtual {v0}, Lio/card/payment/CardScanner;->isFlashOn()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lio/card/payment/CardIOActivity;->setFlashOn(Z)V

    return-void
.end method

.method public triggerAutoFocus()V
    .locals 2

    iget-object v0, p0, Lio/card/payment/CardIOActivity;->mCardScanner:Lio/card/payment/CardScanner;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lio/card/payment/CardScanner;->triggerAutoFocus(Z)V

    return-void
.end method

.class public Lme/dm7/barcodescanner/core/CameraWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final mCamera:Landroid/hardware/Camera;

.field public final mCameraId:I


# direct methods
.method private constructor <init>(Landroid/hardware/Camera;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lme/dm7/barcodescanner/core/CameraWrapper;->mCamera:Landroid/hardware/Camera;

    iput p2, p0, Lme/dm7/barcodescanner/core/CameraWrapper;->mCameraId:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Camera cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static getWrapper(Landroid/hardware/Camera;I)Lme/dm7/barcodescanner/core/CameraWrapper;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lme/dm7/barcodescanner/core/CameraWrapper;

    invoke-direct {v0, p0, p1}, Lme/dm7/barcodescanner/core/CameraWrapper;-><init>(Landroid/hardware/Camera;I)V

    return-object v0
.end method

.class public abstract Lme/dm7/barcodescanner/core/BarcodeScannerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# instance fields
.field private mAspectTolerance:F

.field private mAutofocusState:Z

.field private mBorderAlpha:F

.field private mBorderColor:I

.field private mBorderLength:I

.field private mBorderWidth:I

.field private mCameraHandlerThread:Lme/dm7/barcodescanner/core/CameraHandlerThread;

.field private mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

.field private mCornerRadius:I

.field private mFlashState:Ljava/lang/Boolean;

.field private mFramingRectInPreview:Landroid/graphics/Rect;

.field private mIsLaserEnabled:Z

.field private mLaserColor:I

.field private mMaskColor:I

.field private mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

.field private mRoundedCorner:Z

.field private mShouldScaleToFill:Z

.field private mSquaredFinder:Z

.field private mViewFinderOffset:I

.field private mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mAutofocusState:Z

    iput-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mShouldScaleToFill:Z

    iput-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mIsLaserEnabled:Z

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lme/dm7/barcodescanner/core/R$color;->viewfinder_laser:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mLaserColor:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lme/dm7/barcodescanner/core/R$color;->viewfinder_border:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderColor:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lme/dm7/barcodescanner/core/R$color;->viewfinder_mask:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mMaskColor:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lme/dm7/barcodescanner/core/R$integer;->viewfinder_border_width:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderWidth:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lme/dm7/barcodescanner/core/R$integer;->viewfinder_border_length:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderLength:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mRoundedCorner:Z

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCornerRadius:I

    iput-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mSquaredFinder:Z

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderAlpha:F

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderOffset:I

    const p1, 0x3dcccccd    # 0.1f

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mAspectTolerance:F

    invoke-direct {p0}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mAutofocusState:Z

    iput-boolean v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mShouldScaleToFill:Z

    iput-boolean v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mIsLaserEnabled:Z

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lme/dm7/barcodescanner/core/R$color;->viewfinder_laser:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mLaserColor:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lme/dm7/barcodescanner/core/R$color;->viewfinder_border:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderColor:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lme/dm7/barcodescanner/core/R$color;->viewfinder_mask:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mMaskColor:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lme/dm7/barcodescanner/core/R$integer;->viewfinder_border_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderWidth:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lme/dm7/barcodescanner/core/R$integer;->viewfinder_border_length:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderLength:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mRoundedCorner:Z

    iput v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCornerRadius:I

    iput-boolean v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mSquaredFinder:Z

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderAlpha:F

    iput v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderOffset:I

    const v2, 0x3dcccccd    # 0.1f

    iput v2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mAspectTolerance:F

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView:[I

    invoke-virtual {p1, p2, v2, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_0
    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_shouldScaleToFill:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->setShouldScaleToFill(Z)V

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_laserEnabled:I

    iget-boolean v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mIsLaserEnabled:Z

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mIsLaserEnabled:Z

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_laserColor:I

    iget v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mLaserColor:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mLaserColor:I

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_borderColor:I

    iget v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderColor:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderColor:I

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_maskColor:I

    iget v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mMaskColor:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mMaskColor:I

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_borderWidth:I

    iget v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderWidth:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderWidth:I

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_borderLength:I

    iget v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderLength:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderLength:I

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_roundedCorner:I

    iget-boolean v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mRoundedCorner:Z

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mRoundedCorner:Z

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_cornerRadius:I

    iget v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCornerRadius:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCornerRadius:I

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_squaredFinder:I

    iget-boolean v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mSquaredFinder:Z

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mSquaredFinder:Z

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_borderAlpha:I

    iget v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderAlpha:F

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderAlpha:F

    sget p2, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView_finderOffset:I

    iget v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderOffset:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderOffset:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-direct {p0}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->init()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method private init()V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->createViewFinderView(Landroid/content/Context;)Lme/dm7/barcodescanner/core/IViewFinder;

    move-result-object v0

    iput-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    return-void
.end method


# virtual methods
.method public createViewFinderView(Landroid/content/Context;)Lme/dm7/barcodescanner/core/IViewFinder;
    .locals 1

    new-instance v0, Lme/dm7/barcodescanner/core/ViewFinderView;

    invoke-direct {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;-><init>(Landroid/content/Context;)V

    iget p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderColor:I

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;->setBorderColor(I)V

    iget p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mLaserColor:I

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;->setLaserColor(I)V

    iget-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mIsLaserEnabled:Z

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;->setLaserEnabled(Z)V

    iget p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderWidth:I

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;->setBorderStrokeWidth(I)V

    iget p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderLength:I

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;->setBorderLineLength(I)V

    iget p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mMaskColor:I

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;->setMaskColor(I)V

    iget-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mRoundedCorner:Z

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;->setBorderCornerRounded(Z)V

    iget p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCornerRadius:I

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;->setBorderCornerRadius(I)V

    iget-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mSquaredFinder:Z

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;->setSquareViewFinder(Z)V

    iget p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderOffset:I

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/ViewFinderView;->setViewFinderOffset(I)V

    return-object v0
.end method

.method public getFlash()Z
    .locals 3

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lme/dm7/barcodescanner/core/CameraWrapper;->mCamera:Landroid/hardware/Camera;

    invoke-static {v0}, Lme/dm7/barcodescanner/core/CameraUtils;->isFlashSupported(Landroid/hardware/Camera;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    iget-object v0, v0, Lme/dm7/barcodescanner/core/CameraWrapper;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v0

    const-string v2, "torch"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public declared-synchronized getFramingRectInPreview(II)Landroid/graphics/Rect;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mFramingRectInPreview:Landroid/graphics/Rect;

    if-nez v0, :cond_4

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0}, Lme/dm7/barcodescanner/core/IViewFinder;->getFramingRect()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v1}, Lme/dm7/barcodescanner/core/IViewFinder;->getWidth()I

    move-result v1

    iget-object v2, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v2}, Lme/dm7/barcodescanner/core/IViewFinder;->getHeight()I

    move-result v2

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    if-ge p1, v1, :cond_1

    iget v0, v3, Landroid/graphics/Rect;->left:I

    mul-int/2addr v0, p1

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->left:I

    iget v0, v3, Landroid/graphics/Rect;->right:I

    mul-int/2addr v0, p1

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->right:I

    :cond_1
    if-ge p2, v2, :cond_2

    iget p1, v3, Landroid/graphics/Rect;->top:I

    mul-int/2addr p1, p2

    div-int/2addr p1, v2

    iput p1, v3, Landroid/graphics/Rect;->top:I

    iget p1, v3, Landroid/graphics/Rect;->bottom:I

    mul-int/2addr p1, p2

    div-int/2addr p1, v2

    iput p1, v3, Landroid/graphics/Rect;->bottom:I

    :cond_2
    iput-object v3, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mFramingRectInPreview:Landroid/graphics/Rect;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_3
    :goto_0
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_4
    :goto_1
    :try_start_1
    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mFramingRectInPreview:Landroid/graphics/Rect;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getRotatedData([BLandroid/hardware/Camera;)[B
    .locals 11

    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p2

    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object p2

    iget v0, p2, Landroid/hardware/Camera$Size;->width:I

    iget p2, p2, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {p0}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->getRotationCount()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    const/4 v3, 0x3

    if-ne v1, v3, :cond_3

    :cond_0
    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_3

    array-length v5, p1

    new-array v5, v5, [B

    move v6, v3

    :goto_1
    if-ge v6, p2, :cond_2

    move v7, v3

    :goto_2
    if-ge v7, v0, :cond_1

    mul-int v8, v7, p2

    add-int/2addr v8, p2

    sub-int/2addr v8, v6

    sub-int/2addr v8, v2

    mul-int v9, v6, v0

    add-int/2addr v9, v7

    aget-byte v9, p1, v9

    aput-byte v9, v5, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    move-object p1, v5

    move v10, v0

    move v0, p2

    move p2, v10

    goto :goto_0

    :cond_3
    return-object p1
.end method

.method public getRotationCount()I
    .locals 1

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

    invoke-virtual {v0}, Lme/dm7/barcodescanner/core/CameraPreview;->getDisplayOrientation()I

    move-result v0

    div-int/lit8 v0, v0, 0x5a

    return v0
.end method

.method public resumeCameraPreview()V
    .locals 1

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lme/dm7/barcodescanner/core/CameraPreview;->showCameraPreview()V

    :cond_0
    return-void
.end method

.method public setAspectTolerance(F)V
    .locals 0

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mAspectTolerance:F

    return-void
.end method

.method public setAutoFocus(Z)V
    .locals 1

    iput-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mAutofocusState:Z

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/CameraPreview;->setAutoFocus(Z)V

    :cond_0
    return-void
.end method

.method public setBorderAlpha(F)V
    .locals 1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderAlpha:F

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0, p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setBorderAlpha(F)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    return-void
.end method

.method public setBorderColor(I)V
    .locals 1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderColor:I

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0, p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setBorderColor(I)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    return-void
.end method

.method public setBorderCornerRadius(I)V
    .locals 1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCornerRadius:I

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0, p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setBorderCornerRadius(I)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    return-void
.end method

.method public setBorderLineLength(I)V
    .locals 1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderLength:I

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0, p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setBorderLineLength(I)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    return-void
.end method

.method public setBorderStrokeWidth(I)V
    .locals 1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mBorderWidth:I

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0, p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setBorderStrokeWidth(I)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    return-void
.end method

.method public setFlash(Z)V
    .locals 2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mFlashState:Ljava/lang/Boolean;

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lme/dm7/barcodescanner/core/CameraWrapper;->mCamera:Landroid/hardware/Camera;

    invoke-static {v0}, Lme/dm7/barcodescanner/core/CameraUtils;->isFlashSupported(Landroid/hardware/Camera;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    iget-object v0, v0, Lme/dm7/barcodescanner/core/CameraWrapper;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object p1

    const-string v1, "torch"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object p1

    const-string v1, "off"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    iget-object p1, p1, Lme/dm7/barcodescanner/core/CameraWrapper;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    :cond_3
    return-void
.end method

.method public setIsBorderCornerRounded(Z)V
    .locals 1

    iput-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mRoundedCorner:Z

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0, p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setBorderCornerRounded(Z)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    return-void
.end method

.method public setLaserColor(I)V
    .locals 1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mLaserColor:I

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0, p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setLaserColor(I)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    return-void
.end method

.method public setLaserEnabled(Z)V
    .locals 1

    iput-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mIsLaserEnabled:Z

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0, p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setLaserEnabled(Z)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    return-void
.end method

.method public setMaskColor(I)V
    .locals 1

    iput p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mMaskColor:I

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0, p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setMaskColor(I)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    return-void
.end method

.method public setShouldScaleToFill(Z)V
    .locals 0

    iput-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mShouldScaleToFill:Z

    return-void
.end method

.method public setSquareViewFinder(Z)V
    .locals 1

    iput-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mSquaredFinder:Z

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {v0, p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setSquareViewFinder(Z)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    return-void
.end method

.method public setupCameraPreview(Lme/dm7/barcodescanner/core/CameraWrapper;)V
    .locals 0

    iput-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->setupLayout(Lme/dm7/barcodescanner/core/CameraWrapper;)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    invoke-interface {p1}, Lme/dm7/barcodescanner/core/IViewFinder;->setupViewFinder()V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mFlashState:Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->setFlash(Z)V

    :cond_0
    iget-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mAutofocusState:Z

    invoke-virtual {p0, p1}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->setAutoFocus(Z)V

    :cond_1
    return-void
.end method

.method public final setupLayout(Lme/dm7/barcodescanner/core/CameraWrapper;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    new-instance v0, Lme/dm7/barcodescanner/core/CameraPreview;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lme/dm7/barcodescanner/core/CameraPreview;-><init>(Landroid/content/Context;Lme/dm7/barcodescanner/core/CameraWrapper;Landroid/hardware/Camera$PreviewCallback;)V

    iput-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

    iget p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mAspectTolerance:F

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/CameraPreview;->setAspectTolerance(F)V

    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

    iget-boolean v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mShouldScaleToFill:Z

    invoke-virtual {p1, v0}, Lme/dm7/barcodescanner/core/CameraPreview;->setShouldScaleToFill(Z)V

    iget-boolean p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mShouldScaleToFill:Z

    if-nez p1, :cond_0

    new-instance p1, Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x11

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setGravity(I)V

    const/high16 v0, -0x1000000

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :goto_0
    iget-object p1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mViewFinderView:Lme/dm7/barcodescanner/core/IViewFinder;

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "IViewFinder object returned by \'createViewFinderView()\' should be instance of android.view.View"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startCamera()V
    .locals 1

    invoke-static {}, Lme/dm7/barcodescanner/core/CameraUtils;->getDefaultCameraId()I

    move-result v0

    invoke-virtual {p0, v0}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->startCamera(I)V

    return-void
.end method

.method public startCamera(I)V
    .locals 1

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraHandlerThread:Lme/dm7/barcodescanner/core/CameraHandlerThread;

    if-nez v0, :cond_0

    new-instance v0, Lme/dm7/barcodescanner/core/CameraHandlerThread;

    invoke-direct {v0, p0}, Lme/dm7/barcodescanner/core/CameraHandlerThread;-><init>(Lme/dm7/barcodescanner/core/BarcodeScannerView;)V

    iput-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraHandlerThread:Lme/dm7/barcodescanner/core/CameraHandlerThread;

    :cond_0
    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraHandlerThread:Lme/dm7/barcodescanner/core/CameraHandlerThread;

    invoke-virtual {v0, p1}, Lme/dm7/barcodescanner/core/CameraHandlerThread;->startCamera(I)V

    return-void
.end method

.method public stopCamera()V
    .locals 2

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

    invoke-virtual {v0}, Lme/dm7/barcodescanner/core/CameraPreview;->stopCameraPreview()V

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

    invoke-virtual {v0, v1, v1}, Lme/dm7/barcodescanner/core/CameraPreview;->setCamera(Lme/dm7/barcodescanner/core/CameraWrapper;Landroid/hardware/Camera$PreviewCallback;)V

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    iget-object v0, v0, Lme/dm7/barcodescanner/core/CameraWrapper;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    iput-object v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    :cond_0
    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraHandlerThread:Lme/dm7/barcodescanner/core/CameraHandlerThread;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    iput-object v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraHandlerThread:Lme/dm7/barcodescanner/core/CameraHandlerThread;

    :cond_1
    return-void
.end method

.method public stopCameraPreview()V
    .locals 1

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mPreview:Lme/dm7/barcodescanner/core/CameraPreview;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lme/dm7/barcodescanner/core/CameraPreview;->stopCameraPreview()V

    :cond_0
    return-void
.end method

.method public toggleFlash()V
    .locals 3

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lme/dm7/barcodescanner/core/CameraWrapper;->mCamera:Landroid/hardware/Camera;

    invoke-static {v0}, Lme/dm7/barcodescanner/core/CameraUtils;->isFlashSupported(Landroid/hardware/Camera;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    iget-object v0, v0, Lme/dm7/barcodescanner/core/CameraWrapper;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v1

    const-string v2, "torch"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "off"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    :goto_0
    iget-object v1, p0, Lme/dm7/barcodescanner/core/BarcodeScannerView;->mCameraWrapper:Lme/dm7/barcodescanner/core/CameraWrapper;

    iget-object v1, v1, Lme/dm7/barcodescanner/core/CameraWrapper;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    :cond_1
    return-void
.end method

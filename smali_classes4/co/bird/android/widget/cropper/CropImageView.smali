.class public Lco/bird/android/widget/cropper/CropImageView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/cropper/CropImageView$i;,
        Lco/bird/android/widget/cropper/CropImageView$c;,
        Lco/bird/android/widget/cropper/CropImageView$d;,
        Lco/bird/android/widget/cropper/CropImageView$h;,
        Lco/bird/android/widget/cropper/CropImageView$e;,
        Lco/bird/android/widget/cropper/CropImageView$f;,
        Lco/bird/android/widget/cropper/CropImageView$g;,
        Lco/bird/android/widget/cropper/CropImageView$b;
    }
.end annotation


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:Landroid/graphics/RectF;

.field public E:I

.field public F:Z

.field public G:Landroid/net/Uri;

.field public H:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lco/bird/android/widget/cropper/b;",
            ">;"
        }
    .end annotation
.end field

.field public I:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lco/bird/android/widget/cropper/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/widget/ImageView;

.field public final c:Lco/bird/android/widget/cropper/CropOverlayView;

.field public final d:Landroid/graphics/Matrix;

.field public final e:Landroid/graphics/Matrix;

.field public final f:Landroid/widget/ProgressBar;

.field public final g:[F

.field public h:LME0;

.field public i:Landroid/graphics/Bitmap;

.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:Lco/bird/android/widget/cropper/CropImageView$i;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public w:Lco/bird/android/widget/cropper/CropImageView$g;

.field public x:Lco/bird/android/widget/cropper/CropImageView$e;

.field public y:Landroid/net/Uri;

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lco/bird/android/widget/cropper/CropImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->e:Landroid/graphics/Matrix;

    const/16 v0, 0x8

    new-array v0, v0, [F

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->r:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lco/bird/android/widget/cropper/CropImageView;->s:Z

    iput-boolean v1, p0, Lco/bird/android/widget/cropper/CropImageView;->t:Z

    iput-boolean v1, p0, Lco/bird/android/widget/cropper/CropImageView;->u:Z

    iput v1, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    instance-of v2, p1, Landroid/app/Activity;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_1

    const-string v4, "bundle"

    invoke-virtual {v2, v4}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "CROP_IMAGE_EXTRA_OPTIONS"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/widget/cropper/CropImageOptions;

    :cond_1
    if-nez v3, :cond_3

    new-instance v3, Lco/bird/android/widget/cropper/CropImageOptions;

    invoke-direct {v3}, Lco/bird/android/widget/cropper/CropImageOptions;-><init>()V

    if-eqz p2, :cond_3

    sget-object v2, LNl4;->CropImageView:[I

    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    :try_start_0
    sget v0, LNl4;->CropImageView_cropFixAspectRatio:I

    iget-boolean v2, v3, Lco/bird/android/widget/cropper/CropImageOptions;->m:Z

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, v3, Lco/bird/android/widget/cropper/CropImageOptions;->m:Z

    sget v2, LNl4;->CropImageView_cropAspectRatioX:I

    iget v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->n:I

    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->n:I

    sget v4, LNl4;->CropImageView_cropAspectRatioY:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->o:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->o:I

    invoke-static {}, Lco/bird/android/widget/cropper/CropImageView$i;->values()[Lco/bird/android/widget/cropper/CropImageView$i;

    move-result-object v4

    sget v5, LNl4;->CropImageView_cropScaleType:I

    iget-object v6, v3, Lco/bird/android/widget/cropper/CropImageOptions;->f:Lco/bird/android/widget/cropper/CropImageView$i;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    aget-object v4, v4, v5

    iput-object v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->f:Lco/bird/android/widget/cropper/CropImageView$i;

    sget v4, LNl4;->CropImageView_cropAutoZoomEnabled:I

    iget-boolean v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->i:Z

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->i:Z

    sget v4, LNl4;->CropImageView_cropMultiTouchEnabled:I

    iget-boolean v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->j:Z

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->j:Z

    sget v4, LNl4;->CropImageView_cropMaxZoom:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->k:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->k:I

    invoke-static {}, Lco/bird/android/widget/cropper/CropImageView$c;->values()[Lco/bird/android/widget/cropper/CropImageView$c;

    move-result-object v4

    sget v5, LNl4;->CropImageView_cropShape:I

    iget-object v6, v3, Lco/bird/android/widget/cropper/CropImageOptions;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    aget-object v4, v4, v5

    iput-object v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    invoke-static {}, Lco/bird/android/widget/cropper/CropImageView$d;->values()[Lco/bird/android/widget/cropper/CropImageView$d;

    move-result-object v4

    sget v5, LNl4;->CropImageView_cropGuidelines:I

    iget-object v6, v3, Lco/bird/android/widget/cropper/CropImageOptions;->e:Lco/bird/android/widget/cropper/CropImageView$d;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    aget-object v4, v4, v5

    iput-object v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->e:Lco/bird/android/widget/cropper/CropImageView$d;

    sget v4, LNl4;->CropImageView_cropSnapRadius:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->c:F

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->c:F

    sget v4, LNl4;->CropImageView_cropTouchRadius:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->d:F

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->d:F

    sget v4, LNl4;->CropImageView_cropInitialCropWindowPaddingRatio:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->l:F

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->l:F

    sget v4, LNl4;->CropImageView_cropBorderLineThickness:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->p:F

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->p:F

    sget v4, LNl4;->CropImageView_cropBorderLineColor:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->q:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->q:I

    sget v4, LNl4;->CropImageView_cropBorderCornerThickness:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->r:F

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    iput v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->r:F

    sget v5, LNl4;->CropImageView_cropBorderCornerOffset:I

    iget v6, v3, Lco/bird/android/widget/cropper/CropImageOptions;->s:F

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    iput v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->s:F

    sget v5, LNl4;->CropImageView_cropBorderCornerLength:I

    iget v6, v3, Lco/bird/android/widget/cropper/CropImageOptions;->t:F

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    iput v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->t:F

    sget v5, LNl4;->CropImageView_cropBorderCornerColor:I

    iget v6, v3, Lco/bird/android/widget/cropper/CropImageOptions;->u:I

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v5

    iput v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->u:I

    sget v5, LNl4;->CropImageView_cropGuidelinesThickness:I

    iget v6, v3, Lco/bird/android/widget/cropper/CropImageOptions;->v:F

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    iput v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->v:F

    sget v5, LNl4;->CropImageView_cropGuidelinesColor:I

    iget v6, v3, Lco/bird/android/widget/cropper/CropImageOptions;->w:I

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v5

    iput v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->w:I

    sget v5, LNl4;->CropImageView_cropBackgroundColor:I

    iget v6, v3, Lco/bird/android/widget/cropper/CropImageOptions;->x:I

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v5

    iput v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->x:I

    sget v5, LNl4;->CropImageView_cropShowCropOverlay:I

    iget-boolean v6, p0, Lco/bird/android/widget/cropper/CropImageView;->s:Z

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->g:Z

    sget v5, LNl4;->CropImageView_cropShowProgressBar:I

    iget-boolean v6, p0, Lco/bird/android/widget/cropper/CropImageView;->t:Z

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->h:Z

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->r:F

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->r:F

    sget v4, LNl4;->CropImageView_cropMinCropWindowWidth:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->y:I

    int-to-float v5, v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    float-to-int v4, v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->y:I

    sget v4, LNl4;->CropImageView_cropMinCropWindowHeight:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->z:I

    int-to-float v5, v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    float-to-int v4, v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->z:I

    sget v4, LNl4;->CropImageView_cropMinCropResultWidthPX:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->A:I

    int-to-float v5, v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    float-to-int v4, v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->A:I

    sget v4, LNl4;->CropImageView_cropMinCropResultHeightPX:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->B:I

    int-to-float v5, v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    float-to-int v4, v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->B:I

    sget v4, LNl4;->CropImageView_cropMaxCropResultWidthPX:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->C:I

    int-to-float v5, v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    float-to-int v4, v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->C:I

    sget v4, LNl4;->CropImageView_cropMaxCropResultHeightPX:I

    iget v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->D:I

    int-to-float v5, v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    float-to-int v4, v4

    iput v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->D:I

    sget v4, LNl4;->CropImageView_cropFlipHorizontally:I

    iget-boolean v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->Y:Z

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->Y:Z

    iget-boolean v5, v3, Lco/bird/android/widget/cropper/CropImageOptions;->Z:Z

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, v3, Lco/bird/android/widget/cropper/CropImageOptions;->Z:Z

    sget v4, LNl4;->CropImageView_cropSaveBitmapToInstanceState:I

    iget-boolean v5, p0, Lco/bird/android/widget/cropper/CropImageView;->r:Z

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lco/bird/android/widget/cropper/CropImageView;->r:Z

    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-nez v0, :cond_2

    iput-boolean v1, v3, Lco/bird/android/widget/cropper/CropImageOptions;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1

    :cond_3
    :goto_1
    invoke-virtual {v3}, Lco/bird/android/widget/cropper/CropImageOptions;->a()V

    iget-object p2, v3, Lco/bird/android/widget/cropper/CropImageOptions;->f:Lco/bird/android/widget/cropper/CropImageView$i;

    iput-object p2, p0, Lco/bird/android/widget/cropper/CropImageView;->q:Lco/bird/android/widget/cropper/CropImageView$i;

    iget-boolean p2, v3, Lco/bird/android/widget/cropper/CropImageOptions;->i:Z

    iput-boolean p2, p0, Lco/bird/android/widget/cropper/CropImageView;->u:Z

    iget p2, v3, Lco/bird/android/widget/cropper/CropImageOptions;->k:I

    iput p2, p0, Lco/bird/android/widget/cropper/CropImageView;->v:I

    iget-boolean p2, v3, Lco/bird/android/widget/cropper/CropImageOptions;->g:Z

    iput-boolean p2, p0, Lco/bird/android/widget/cropper/CropImageView;->s:Z

    iget-boolean p2, v3, Lco/bird/android/widget/cropper/CropImageOptions;->h:Z

    iput-boolean p2, p0, Lco/bird/android/widget/cropper/CropImageView;->t:Z

    iget-boolean p2, v3, Lco/bird/android/widget/cropper/CropImageOptions;->Y:Z

    iput-boolean p2, p0, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    iget-boolean p2, v3, Lco/bird/android/widget/cropper/CropImageOptions;->Z:Z

    iput-boolean p2, p0, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lpk4;->crop_image_view:I

    invoke-virtual {p1, p2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget p2, LDi4;->ImageView_image:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lco/bird/android/widget/cropper/CropImageView;->b:Landroid/widget/ImageView;

    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    sget p2, LDi4;->CropOverlayView:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lco/bird/android/widget/cropper/CropOverlayView;

    iput-object p2, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    new-instance v0, Lco/bird/android/widget/cropper/CropImageView$a;

    invoke-direct {v0, p0}, Lco/bird/android/widget/cropper/CropImageView$a;-><init>(Lco/bird/android/widget/cropper/CropImageView;)V

    invoke-virtual {p2, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->setCropWindowChangeListener(Lco/bird/android/widget/cropper/CropOverlayView$a;)V

    invoke-virtual {p2, v3}, Lco/bird/android/widget/cropper/CropOverlayView;->setInitialAttributeValues(Lco/bird/android/widget/cropper/CropImageOptions;)V

    sget p2, LDi4;->CropProgressBar:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->f:Landroid/widget/ProgressBar;

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->u()V

    return-void
.end method

.method public static bridge synthetic a(Lco/bird/android/widget/cropper/CropImageView;)Lco/bird/android/widget/cropper/CropImageView$f;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic b(Lco/bird/android/widget/cropper/CropImageView;ZZ)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/cropper/CropImageView;->m(ZZ)V

    return-void
.end method

.method public static j(III)I
    .locals 1

    const/high16 v0, 0x40000000    # 2.0f

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_1
    move p1, p2

    :goto_0
    return p1
.end method


# virtual methods
.method public final c(FFZZ)V
    .locals 8

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_a

    cmpl-float v1, p2, v0

    if-lez v1, :cond_a

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v1}, Lco/bird/android/widget/cropper/CropOverlayView;->m()Landroid/graphics/RectF;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    sub-float v3, p1, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    iget-object v5, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    sub-float v5, p2, v5

    div-float/2addr v5, v4

    invoke-virtual {v2, v3, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->n()V

    iget v2, p0, Lco/bird/android/widget/cropper/CropImageView;->k:I

    if-lez v2, :cond_0

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    int-to-float v2, v2

    iget-object v5, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v5}, Lco/bird/android/widget/cropper/c;->q([F)F

    move-result v5

    iget-object v6, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v6}, Lco/bird/android/widget/cropper/c;->r([F)F

    move-result v6

    invoke-virtual {v3, v2, v5, v6}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->n()V

    :cond_0
    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v2}, Lco/bird/android/widget/cropper/c;->x([F)F

    move-result v2

    div-float v2, p1, v2

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v3}, Lco/bird/android/widget/cropper/c;->t([F)F

    move-result v3

    div-float v3, p2, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->q:Lco/bird/android/widget/cropper/CropImageView$i;

    sget-object v5, Lco/bird/android/widget/cropper/CropImageView$i;->b:Lco/bird/android/widget/cropper/CropImageView$i;

    if-eq v3, v5, :cond_2

    sget-object v5, Lco/bird/android/widget/cropper/CropImageView$i;->e:Lco/bird/android/widget/cropper/CropImageView$i;

    const/high16 v6, 0x3f800000    # 1.0f

    if-ne v3, v5, :cond_1

    cmpg-float v3, v2, v6

    if-ltz v3, :cond_2

    :cond_1
    cmpl-float v3, v2, v6

    if-lez v3, :cond_3

    iget-boolean v3, p0, Lco/bird/android/widget/cropper/CropImageView;->u:Z

    if-eqz v3, :cond_3

    :cond_2
    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    iget-object v5, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v5}, Lco/bird/android/widget/cropper/c;->q([F)F

    move-result v5

    iget-object v6, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v6}, Lco/bird/android/widget/cropper/c;->r([F)F

    move-result v6

    invoke-virtual {v3, v2, v2, v5, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->n()V

    :cond_3
    iget-boolean v2, p0, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    if-eqz v2, :cond_4

    iget v2, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    neg-float v2, v2

    goto :goto_0

    :cond_4
    iget v2, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    :goto_0
    iget-boolean v3, p0, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    if-eqz v3, :cond_5

    iget v3, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    neg-float v3, v3

    goto :goto_1

    :cond_5
    iget v3, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    :goto_1
    iget-object v5, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    iget-object v6, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v6}, Lco/bird/android/widget/cropper/c;->q([F)F

    move-result v6

    iget-object v7, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v7}, Lco/bird/android/widget/cropper/c;->r([F)F

    move-result v7

    invoke-virtual {v5, v2, v3, v6, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->n()V

    iget-object v5, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v5, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    if-eqz p3, :cond_8

    iget-object p3, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {p3}, Lco/bird/android/widget/cropper/c;->x([F)F

    move-result p3

    cmpl-float p3, p1, p3

    if-lez p3, :cond_6

    move p1, v0

    goto :goto_2

    :cond_6
    div-float/2addr p1, v4

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result p3

    sub-float/2addr p1, p3

    iget-object p3, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {p3}, Lco/bird/android/widget/cropper/c;->u([F)F

    move-result p3

    neg-float p3, p3

    invoke-static {p1, p3}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    iget-object v5, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v5}, Lco/bird/android/widget/cropper/c;->v([F)F

    move-result v5

    sub-float/2addr p3, v5

    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    div-float/2addr p1, v2

    :goto_2
    iput p1, p0, Lco/bird/android/widget/cropper/CropImageView;->B:F

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {p1}, Lco/bird/android/widget/cropper/c;->t([F)F

    move-result p1

    cmpl-float p1, p2, p1

    if-lez p1, :cond_7

    goto :goto_3

    :cond_7
    div-float/2addr p2, v4

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    sub-float/2addr p2, p1

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {p1}, Lco/bird/android/widget/cropper/c;->w([F)F

    move-result p1

    neg-float p1, p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    iget-object p3, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {p3}, Lco/bird/android/widget/cropper/c;->p([F)F

    move-result p3

    sub-float/2addr p2, p3

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    div-float v0, p1, v3

    :goto_3
    iput v0, p0, Lco/bird/android/widget/cropper/CropImageView;->C:F

    goto :goto_4

    :cond_8
    iget p3, p0, Lco/bird/android/widget/cropper/CropImageView;->B:F

    mul-float/2addr p3, v2

    iget v0, v1, Landroid/graphics/RectF;->left:F

    neg-float v0, v0

    invoke-static {p3, v0}, Ljava/lang/Math;->max(FF)F

    move-result p3

    iget v0, v1, Landroid/graphics/RectF;->right:F

    neg-float v0, v0

    add-float/2addr v0, p1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    div-float/2addr p1, v2

    iput p1, p0, Lco/bird/android/widget/cropper/CropImageView;->B:F

    iget p1, p0, Lco/bird/android/widget/cropper/CropImageView;->C:F

    mul-float/2addr p1, v3

    iget p3, v1, Landroid/graphics/RectF;->top:F

    neg-float p3, p3

    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iget p3, v1, Landroid/graphics/RectF;->bottom:F

    neg-float p3, p3

    add-float/2addr p3, p2

    invoke-static {p1, p3}, Ljava/lang/Math;->min(FF)F

    move-result p1

    div-float/2addr p1, v3

    iput p1, p0, Lco/bird/android/widget/cropper/CropImageView;->C:F

    :goto_4
    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    iget p2, p0, Lco/bird/android/widget/cropper/CropImageView;->B:F

    mul-float/2addr p2, v2

    iget p3, p0, Lco/bird/android/widget/cropper/CropImageView;->C:F

    mul-float/2addr p3, v3

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget p1, p0, Lco/bird/android/widget/cropper/CropImageView;->B:F

    mul-float/2addr p1, v2

    iget p2, p0, Lco/bird/android/widget/cropper/CropImageView;->C:F

    mul-float/2addr p2, v3

    invoke-virtual {v1, p1, p2}, Landroid/graphics/RectF;->offset(FF)V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {p1, v1}, Lco/bird/android/widget/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->n()V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    if-eqz p4, :cond_9

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->h:LME0;

    iget-object p2, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    iget-object p3, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2, p3}, LME0;->d([FLandroid/graphics/Matrix;)V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->b:Landroid/widget/ImageView;

    iget-object p2, p0, Lco/bird/android/widget/cropper/CropImageView;->h:LME0;

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_5

    :cond_9
    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->b:Landroid/widget/ImageView;

    iget-object p2, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    :goto_5
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropImageView;->w(Z)V

    :cond_a
    return-void
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget v1, p0, Lco/bird/android/widget/cropper/CropImageView;->p:I

    if-gtz v1, :cond_0

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    iput v1, p0, Lco/bird/android/widget/cropper/CropImageView;->p:I

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    const/4 v2, 0x1

    iput v2, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    iput v1, p0, Lco/bird/android/widget/cropper/CropImageView;->k:I

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    const/4 v1, 0x0

    iput v1, p0, Lco/bird/android/widget/cropper/CropImageView;->B:F

    iput v1, p0, Lco/bird/android/widget/cropper/CropImageView;->C:F

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->G:Landroid/net/Uri;

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->b:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->t()V

    return-void
.end method

.method public e()V
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v1, v3}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    return-void
.end method

.method public f()V
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v1, v3}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    return-void
.end method

.method public g()[F
    .locals 8

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropOverlayView;->m()Landroid/graphics/RectF;

    move-result-object v0

    const/16 v1, 0x8

    new-array v2, v1, [F

    iget v3, v0, Landroid/graphics/RectF;->left:F

    const/4 v4, 0x0

    aput v3, v2, v4

    iget v5, v0, Landroid/graphics/RectF;->top:F

    const/4 v6, 0x1

    aput v5, v2, v6

    iget v6, v0, Landroid/graphics/RectF;->right:F

    const/4 v7, 0x2

    aput v6, v2, v7

    const/4 v7, 0x3

    aput v5, v2, v7

    const/4 v5, 0x4

    aput v6, v2, v5

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    const/4 v5, 0x5

    aput v0, v2, v5

    const/4 v5, 0x6

    aput v3, v2, v5

    const/4 v3, 0x7

    aput v0, v2, v3

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    :goto_0
    if-ge v4, v1, :cond_0

    aget v0, v2, v4

    iget v3, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    int-to-float v3, v3

    mul-float/2addr v0, v3

    aput v0, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public h()Landroid/graphics/Rect;
    .locals 7

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->g()[F

    move-result-object v1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget v2, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    mul-int/2addr v2, v0

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iget v3, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    mul-int/2addr v3, v0

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropOverlayView;->r()Z

    move-result v4

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropOverlayView;->j()I

    move-result v5

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropOverlayView;->k()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lco/bird/android/widget/cropper/c;->s([FIIZII)Landroid/graphics/Rect;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public i()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    return-object v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageView;->k:I

    return v0
.end method

.method public l()Landroid/graphics/Rect;
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget v1, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    mul-int/2addr v0, v1

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    iget v2, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    mul-int/2addr v1, v2

    new-instance v2, Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v2
.end method

.method public final m(ZZ)V
    .locals 10

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_9

    if-lez v0, :cond_9

    if-lez v1, :cond_9

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v2}, Lco/bird/android/widget/cropper/CropOverlayView;->m()Landroid/graphics/RectF;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz p1, :cond_1

    iget p1, v2, Landroid/graphics/RectF;->left:F

    cmpg-float p1, p1, v3

    if-ltz p1, :cond_0

    iget p1, v2, Landroid/graphics/RectF;->top:F

    cmpg-float p1, p1, v3

    if-ltz p1, :cond_0

    iget p1, v2, Landroid/graphics/RectF;->right:F

    int-to-float p2, v0

    cmpl-float p1, p1, p2

    if-gtz p1, :cond_0

    iget p1, v2, Landroid/graphics/RectF;->bottom:F

    int-to-float p2, v1

    cmpl-float p1, p1, p2

    if-lez p1, :cond_9

    :cond_0
    int-to-float p1, v0

    int-to-float p2, v1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, v0}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    goto/16 :goto_2

    :cond_1
    iget-boolean p1, p0, Lco/bird/android/widget/cropper/CropImageView;->u:Z

    const/high16 v4, 0x3f800000    # 1.0f

    if-nez p1, :cond_2

    iget p1, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    cmpl-float p1, p1, v4

    if-lez p1, :cond_9

    :cond_2
    iget p1, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    iget v5, p0, Lco/bird/android/widget/cropper/CropImageView;->v:I

    int-to-float v5, v5

    cmpg-float p1, p1, v5

    if-gez p1, :cond_3

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result p1

    int-to-float v5, v0

    const/high16 v6, 0x3f000000    # 0.5f

    mul-float v7, v5, v6

    cmpg-float p1, p1, v7

    if-gez p1, :cond_3

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result p1

    int-to-float v7, v1

    mul-float/2addr v6, v7

    cmpg-float p1, p1, v6

    if-gez p1, :cond_3

    iget p1, p0, Lco/bird/android/widget/cropper/CropImageView;->v:I

    int-to-float p1, p1

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v6

    iget v8, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    div-float/2addr v6, v8

    const v8, 0x3f23d70a    # 0.64f

    div-float/2addr v6, v8

    div-float/2addr v5, v6

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v6

    iget v9, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    div-float/2addr v6, v9

    div-float/2addr v6, v8

    div-float/2addr v7, v6

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {p1, v5}, Ljava/lang/Math;->min(FF)F

    move-result p1

    goto :goto_0

    :cond_3
    move p1, v3

    :goto_0
    iget v5, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    cmpl-float v5, v5, v4

    if-lez v5, :cond_5

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v5

    int-to-float v6, v0

    const v7, 0x3f266666    # 0.65f

    mul-float v8, v6, v7

    cmpl-float v5, v5, v8

    if-gtz v5, :cond_4

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v5

    int-to-float v8, v1

    mul-float/2addr v8, v7

    cmpl-float v5, v5, v8

    if-lez v5, :cond_5

    :cond_4
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result p1

    iget v5, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    div-float/2addr p1, v5

    const v5, 0x3f028f5c    # 0.51f

    div-float/2addr p1, v5

    div-float/2addr v6, p1

    int-to-float p1, v1

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    iget v7, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    div-float/2addr v2, v7

    div-float/2addr v2, v5

    div-float/2addr p1, v2

    invoke-static {v6, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    :cond_5
    iget-boolean v2, p0, Lco/bird/android/widget/cropper/CropImageView;->u:Z

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    move v4, p1

    :goto_1
    cmpl-float p1, v4, v3

    if-lez p1, :cond_9

    iget p1, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    cmpl-float p1, v4, p1

    if-eqz p1, :cond_9

    if-eqz p2, :cond_8

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->h:LME0;

    if-nez p1, :cond_7

    new-instance p1, LME0;

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->b:Landroid/widget/ImageView;

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-direct {p1, v2, v3}, LME0;-><init>(Landroid/widget/ImageView;Lco/bird/android/widget/cropper/CropOverlayView;)V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->h:LME0;

    :cond_7
    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->h:LME0;

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {p1, v2, v3}, LME0;->e([FLandroid/graphics/Matrix;)V

    :cond_8
    iput v4, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    int-to-float p1, v0

    int-to-float v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1, p2}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    :cond_9
    :goto_2
    return-void
.end method

.method public final n()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v2, v0, v1

    const/4 v1, 0x1

    aput v2, v0, v1

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/4 v3, 0x2

    aput v1, v0, v3

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    const/4 v1, 0x3

    aput v2, v0, v1

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/4 v3, 0x4

    aput v1, v0, v3

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v3, 0x5

    aput v1, v0, v3

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    const/4 v1, 0x6

    aput v2, v0, v1

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x7

    aput v1, v0, v2

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    return-void
.end method

.method public o(Lco/bird/android/widget/cropper/a$a;)V
    .locals 13

    const/4 v0, 0x0

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->I:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->u()V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->x:Lco/bird/android/widget/cropper/CropImageView$e;

    if-eqz v0, :cond_0

    new-instance v12, Lco/bird/android/widget/cropper/CropImageView$b;

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    iget-object v4, p1, Lco/bird/android/widget/cropper/a$a;->a:Landroid/graphics/Bitmap;

    iget-object v5, p1, Lco/bird/android/widget/cropper/a$a;->b:Landroid/net/Uri;

    iget-object v6, p1, Lco/bird/android/widget/cropper/a$a;->c:Ljava/lang/Exception;

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->g()[F

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->h()Landroid/graphics/Rect;

    move-result-object v8

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->l()Landroid/graphics/Rect;

    move-result-object v9

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->k()I

    move-result v10

    iget v11, p1, Lco/bird/android/widget/cropper/a$a;->e:I

    move-object v1, v12

    invoke-direct/range {v1 .. v11}, Lco/bird/android/widget/cropper/CropImageView$b;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V

    invoke-interface {v0, p0, v12}, Lco/bird/android/widget/cropper/CropImageView$e;->e(Lco/bird/android/widget/cropper/CropImageView;Lco/bird/android/widget/cropper/CropImageView$b;)V

    :cond_0
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 2

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    iget p1, p0, Lco/bird/android/widget/cropper/CropImageView;->n:I

    const/4 v0, 0x1

    if-lez p1, :cond_3

    iget p1, p0, Lco/bird/android/widget/cropper/CropImageView;->o:I

    if-lez p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iget v1, p0, Lco/bird/android/widget/cropper/CropImageView;->n:I

    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v1, p0, Lco/bird/android/widget/cropper/CropImageView;->o:I

    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_2

    sub-int/2addr p4, p2

    int-to-float p1, p4

    sub-int/2addr p5, p3

    int-to-float p2, p5

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    iget-object p4, p0, Lco/bird/android/widget/cropper/CropImageView;->D:Landroid/graphics/RectF;

    if-eqz p4, :cond_1

    iget p4, p0, Lco/bird/android/widget/cropper/CropImageView;->E:I

    iget p5, p0, Lco/bird/android/widget/cropper/CropImageView;->j:I

    if-eq p4, p5, :cond_0

    iput p4, p0, Lco/bird/android/widget/cropper/CropImageView;->k:I

    invoke-virtual {p0, p1, p2, v0, p3}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    :cond_0
    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    iget-object p2, p0, Lco/bird/android/widget/cropper/CropImageView;->D:Landroid/graphics/RectF;

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    iget-object p2, p0, Lco/bird/android/widget/cropper/CropImageView;->D:Landroid/graphics/RectF;

    invoke-virtual {p1, p2}, Lco/bird/android/widget/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    invoke-virtual {p0, p3, p3}, Lco/bird/android/widget/cropper/CropImageView;->m(ZZ)V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {p1}, Lco/bird/android/widget/cropper/CropOverlayView;->i()V

    const/4 p1, 0x0

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->D:Landroid/graphics/RectF;

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lco/bird/android/widget/cropper/CropImageView;->F:Z

    if-eqz p1, :cond_4

    iput-boolean p3, p0, Lco/bird/android/widget/cropper/CropImageView;->F:Z

    invoke-virtual {p0, p3, p3}, Lco/bird/android/widget/cropper/CropImageView;->m(ZZ)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropImageView;->w(Z)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropImageView;->w(Z)V

    :cond_4
    :goto_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 11

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_6

    if-nez p2, :cond_0

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    :cond_0
    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    const-wide/high16 v3, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    if-ge p1, v2, :cond_1

    int-to-double v5, p1

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v7, v2

    div-double/2addr v5, v7

    goto :goto_0

    :cond_1
    move-wide v5, v3

    :goto_0
    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-ge p2, v2, :cond_2

    int-to-double v7, p2

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-double v9, v2

    div-double/2addr v7, v9

    goto :goto_1

    :cond_2
    move-wide v7, v3

    :goto_1
    cmpl-double v2, v5, v3

    if-nez v2, :cond_4

    cmpl-double v2, v7, v3

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    goto :goto_3

    :cond_4
    :goto_2
    cmpg-double v2, v5, v7

    if-gtz v2, :cond_5

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v2, v5

    double-to-int v3, v2

    move v2, p1

    goto :goto_3

    :cond_5
    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v2, v7

    double-to-int v2, v2

    move v3, p2

    :goto_3
    invoke-static {v0, p1, v2}, Lco/bird/android/widget/cropper/CropImageView;->j(III)I

    move-result p1

    invoke-static {v1, p2, v3}, Lco/bird/android/widget/cropper/CropImageView;->j(III)I

    move-result p2

    iput p1, p0, Lco/bird/android/widget/cropper/CropImageView;->n:I

    iput p2, p0, Lco/bird/android/widget/cropper/CropImageView;->o:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_4

    :cond_6
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    :goto_4
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 7

    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_a

    check-cast p1, Landroid/os/Bundle;

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->H:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_9

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    if-nez v0, :cond_9

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-nez v0, :cond_9

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageView;->p:I

    if-nez v0, :cond_9

    const-string v0, "LOADED_IMAGE_URI"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    if-eqz v0, :cond_2

    const-string v1, "LOADED_IMAGE_STATE_BITMAP_KEY"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v2, Lco/bird/android/widget/cropper/c;->f:Landroid/util/Pair;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lco/bird/android/widget/cropper/c;->f:Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    sput-object v3, Lco/bird/android/widget/cropper/c;->f:Landroid/util/Pair;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v3, 0x0

    const-string v1, "LOADED_SAMPLE_SIZE"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x0

    move-object v1, p0

    move-object v4, v0

    invoke-virtual/range {v1 .. v6}, Lco/bird/android/widget/cropper/CropImageView;->s(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    :cond_1
    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    if-nez v1, :cond_4

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    goto :goto_1

    :cond_2
    const-string v0, "LOADED_IMAGE_RESOURCE"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropImageView;->setImageResource(I)V

    goto :goto_1

    :cond_3
    const-string v0, "LOADING_IMAGE_URI"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    :cond_4
    :goto_1
    const-string v0, "DEGREES_ROTATED"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageView;->E:I

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageView;->k:I

    const-string v0, "INITIAL_CROP_RECT"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-gtz v1, :cond_5

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-lez v1, :cond_6

    :cond_5
    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v1, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    :cond_6
    const-string v0, "CROP_WINDOW_RECT"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/RectF;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-gtz v1, :cond_7

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpl-float v1, v1, v2

    if-lez v1, :cond_8

    :cond_7
    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->D:Landroid/graphics/RectF;

    :cond_8
    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    const-string v1, "CROP_SHAPE"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lco/bird/android/widget/cropper/CropImageView$c;->valueOf(Ljava/lang/String;)Lco/bird/android/widget/cropper/CropImageView$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/cropper/CropOverlayView;->setCropShape(Lco/bird/android/widget/cropper/CropImageView$c;)V

    const-string v0, "CROP_AUTO_ZOOM_ENABLED"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->u:Z

    const-string v0, "CROP_MAX_ZOOM"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageView;->v:I

    const-string v0, "CROP_FLIP_HORIZONTALLY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    const-string v0, "CROP_FLIP_VERTICALLY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    :cond_9
    const-string v0, "instanceState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    goto :goto_2

    :cond_a
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    :goto_2
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 6

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageView;->p:I

    if-ge v0, v1, :cond_0

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    iget-boolean v3, p0, Lco/bird/android/widget/cropper/CropImageView;->r:Z

    if-eqz v3, :cond_1

    if-nez v2, :cond_1

    iget v3, p0, Lco/bird/android/widget/cropper/CropImageView;->p:I

    if-ge v3, v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->G:Landroid/net/Uri;

    invoke-static {v1, v2, v3}, Lco/bird/android/widget/cropper/c;->D(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->G:Landroid/net/Uri;

    :cond_1
    if-eqz v2, :cond_2

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Landroid/util/Pair;

    new-instance v4, Ljava/lang/ref/WeakReference;

    iget-object v5, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-direct {v4, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v3, v1, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v3, Lco/bird/android/widget/cropper/c;->f:Landroid/util/Pair;

    const-string v3, "LOADED_IMAGE_STATE_BITMAP_KEY"

    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->H:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/widget/cropper/b;

    if-eqz v1, :cond_3

    const-string v3, "LOADING_IMAGE_URI"

    invoke-virtual {v1}, Lco/bird/android/widget/cropper/b;->b()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_3
    const-string v1, "instanceState"

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "LOADED_IMAGE_URI"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "LOADED_IMAGE_RESOURCE"

    iget v2, p0, Lco/bird/android/widget/cropper/CropImageView;->p:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "LOADED_SAMPLE_SIZE"

    iget v2, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "DEGREES_ROTATED"

    iget v2, p0, Lco/bird/android/widget/cropper/CropImageView;->k:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v1}, Lco/bird/android/widget/cropper/CropOverlayView;->n()Landroid/graphics/Rect;

    move-result-object v1

    const-string v2, "INITIAL_CROP_RECT"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    sget-object v1, Lco/bird/android/widget/cropper/c;->c:Landroid/graphics/RectF;

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v2}, Lco/bird/android/widget/cropper/CropOverlayView;->m()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    const-string v2, "CROP_WINDOW_RECT"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v1}, Lco/bird/android/widget/cropper/CropOverlayView;->l()Lco/bird/android/widget/cropper/CropImageView$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "CROP_SHAPE"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CROP_AUTO_ZOOM_ENABLED"

    iget-boolean v2, p0, Lco/bird/android/widget/cropper/CropImageView;->u:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "CROP_MAX_ZOOM"

    iget v2, p0, Lco/bird/android/widget/cropper/CropImageView;->v:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "CROP_FLIP_HORIZONTALLY"

    iget-boolean v2, p0, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "CROP_FLIP_VERTICALLY"

    iget-boolean v2, p0, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    if-lez p3, :cond_0

    if-lez p4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lco/bird/android/widget/cropper/CropImageView;->F:Z

    return-void
.end method

.method public p(Lco/bird/android/widget/cropper/b$a;)V
    .locals 7

    const/4 v0, 0x0

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->H:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->u()V

    iget-object v0, p1, Lco/bird/android/widget/cropper/b$a;->e:Ljava/lang/Exception;

    if-nez v0, :cond_0

    iget v6, p1, Lco/bird/android/widget/cropper/b$a;->d:I

    iput v6, p0, Lco/bird/android/widget/cropper/CropImageView;->j:I

    iget-object v2, p1, Lco/bird/android/widget/cropper/b$a;->b:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    iget-object v4, p1, Lco/bird/android/widget/cropper/b$a;->a:Landroid/net/Uri;

    iget v5, p1, Lco/bird/android/widget/cropper/b$a;->c:I

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lco/bird/android/widget/cropper/CropImageView;->s(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->w:Lco/bird/android/widget/cropper/CropImageView$g;

    if-eqz v0, :cond_1

    iget-object v1, p1, Lco/bird/android/widget/cropper/b$a;->a:Landroid/net/Uri;

    iget-object p1, p1, Lco/bird/android/widget/cropper/b$a;->e:Ljava/lang/Exception;

    invoke-interface {v0, p0, v1, p1}, Lco/bird/android/widget/cropper/CropImageView$g;->j(Lco/bird/android/widget/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V

    :cond_1
    return-void
.end method

.method public q(I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget-object v2, v0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_7

    if-gez v1, :cond_0

    rem-int/lit16 v1, v1, 0x168

    add-int/lit16 v1, v1, 0x168

    goto :goto_0

    :cond_0
    rem-int/lit16 v1, v1, 0x168

    :goto_0
    iget-object v2, v0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v2}, Lco/bird/android/widget/cropper/CropOverlayView;->r()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_3

    const/16 v2, 0x2d

    if-le v1, v2, :cond_1

    const/16 v2, 0x87

    if-lt v1, v2, :cond_2

    :cond_1
    const/16 v2, 0xd7

    if-le v1, v2, :cond_3

    const/16 v2, 0x131

    if-ge v1, v2, :cond_3

    :cond_2
    move v2, v3

    goto :goto_1

    :cond_3
    move v2, v4

    :goto_1
    sget-object v5, Lco/bird/android/widget/cropper/c;->c:Landroid/graphics/RectF;

    iget-object v6, v0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v6}, Lco/bird/android/widget/cropper/CropOverlayView;->m()Landroid/graphics/RectF;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    if-eqz v2, :cond_4

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v6

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v6

    :goto_2
    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    if-eqz v2, :cond_5

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v8

    goto :goto_3

    :cond_5
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v8

    :goto_3
    div-float/2addr v8, v7

    if-eqz v2, :cond_6

    iget-boolean v2, v0, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    iget-boolean v7, v0, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    iput-boolean v7, v0, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    iput-boolean v2, v0, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    :cond_6
    iget-object v2, v0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    iget-object v7, v0, Lco/bird/android/widget/cropper/CropImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v2, v7}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    sget-object v2, Lco/bird/android/widget/cropper/c;->d:[F

    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    move-result v7

    aput v7, v2, v4

    invoke-virtual {v5}, Landroid/graphics/RectF;->centerY()F

    move-result v7

    aput v7, v2, v3

    const/4 v7, 0x2

    const/4 v9, 0x0

    aput v9, v2, v7

    const/4 v10, 0x3

    aput v9, v2, v10

    const/4 v11, 0x4

    const/high16 v12, 0x3f800000    # 1.0f

    aput v12, v2, v11

    const/4 v13, 0x5

    aput v9, v2, v13

    iget-object v9, v0, Lco/bird/android/widget/cropper/CropImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v9, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget v9, v0, Lco/bird/android/widget/cropper/CropImageView;->k:I

    add-int/2addr v9, v1

    rem-int/lit16 v9, v9, 0x168

    iput v9, v0, Lco/bird/android/widget/cropper/CropImageView;->k:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v0, v1, v9, v3, v4}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    iget-object v1, v0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    sget-object v9, Lco/bird/android/widget/cropper/c;->e:[F

    invoke-virtual {v1, v9, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    iget v1, v0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    float-to-double v14, v1

    aget v1, v9, v11

    aget v16, v9, v7

    sub-float v1, v1, v16

    move/from16 p1, v8

    float-to-double v7, v1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    aget v17, v9, v13

    aget v18, v9, v10

    sub-float v1, v17, v18

    float-to-double v10, v1

    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    add-double/2addr v7, v10

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    div-double/2addr v14, v7

    double-to-float v1, v14

    iput v1, v0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    invoke-static {v1, v12}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iput v1, v0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v7

    int-to-float v7, v7

    const/4 v8, 0x1

    const/4 v10, 0x0

    invoke-virtual {v0, v1, v7, v8, v10}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    iget-object v7, v0, Lco/bird/android/widget/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v7, v9, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    const/4 v2, 0x4

    aget v2, v9, v2

    const/4 v7, 0x2

    aget v7, v9, v7

    sub-float/2addr v2, v7

    float-to-double v7, v2

    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    aget v2, v9, v13

    const/4 v10, 0x3

    aget v10, v9, v10

    sub-float/2addr v2, v10

    float-to-double v10, v2

    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-double/2addr v7, v2

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    float-to-double v6, v6

    mul-double/2addr v6, v2

    double-to-float v4, v6

    move/from16 v8, p1

    float-to-double v6, v8

    mul-double/2addr v6, v2

    double-to-float v2, v6

    const/4 v3, 0x0

    aget v6, v9, v3

    sub-float v3, v6, v4

    const/4 v1, 0x1

    aget v7, v9, v1

    sub-float v8, v7, v2

    add-float/2addr v6, v4

    add-float/2addr v7, v2

    invoke-virtual {v5, v3, v8, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v2}, Lco/bird/android/widget/cropper/CropOverlayView;->w()V

    iget-object v2, v0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v2, v5}, Lco/bird/android/widget/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    const/4 v1, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    invoke-virtual {v0, v4, v4}, Lco/bird/android/widget/cropper/CropImageView;->m(ZZ)V

    iget-object v1, v0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v1}, Lco/bird/android/widget/cropper/CropOverlayView;->i()V

    :cond_7
    return-void
.end method

.method public r(Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILco/bird/android/widget/cropper/CropImageView$h;)V
    .locals 7

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->x:Lco/bird/android/widget/cropper/CropImageView$e;

    if-eqz v0, :cond_0

    move-object v0, p0

    move v1, p4

    move v2, p5

    move-object v3, p6

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-virtual/range {v0 .. v6}, Lco/bird/android/widget/cropper/CropImageView;->v(IILco/bird/android/widget/cropper/CropImageView$h;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "mOnCropImageCompleteListener is not set"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final s(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->d()V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iput-object p3, p0, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    iput p2, p0, Lco/bird/android/widget/cropper/CropImageView;->p:I

    iput p4, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    iput p5, p0, Lco/bird/android/widget/cropper/CropImageView;->k:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/widget/cropper/CropOverlayView;->w()V

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->t()V

    :cond_1
    return-void
.end method

.method public setAspectRatio(II)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->setAspectRatioX(I)V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {p1, p2}, Lco/bird/android/widget/cropper/CropOverlayView;->setAspectRatioY(I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropImageView;->setFixedAspectRatio(Z)V

    return-void
.end method

.method public setAutoZoomEnabled(Z)V
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->u:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lco/bird/android/widget/cropper/CropImageView;->u:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lco/bird/android/widget/cropper/CropImageView;->m(ZZ)V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setCropRect(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setCropShape(Lco/bird/android/widget/cropper/CropImageView$c;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->setCropShape(Lco/bird/android/widget/cropper/CropImageView$c;)V

    return-void
.end method

.method public setFixedAspectRatio(Z)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->setFixedAspectRatio(Z)V

    return-void
.end method

.method public setFlippedHorizontally(Z)V
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    :cond_0
    return-void
.end method

.method public setFlippedVertically(Z)V
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, Lco/bird/android/widget/cropper/CropImageView;->c(FFZZ)V

    :cond_0
    return-void
.end method

.method public setGuidelines(Lco/bird/android/widget/cropper/CropImageView$d;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->setGuidelines(Lco/bird/android/widget/cropper/CropImageView$d;)V

    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 8

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lco/bird/android/widget/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Lco/bird/android/widget/cropper/CropImageView;->s(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;LXh1;)V
    .locals 6

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-static {p1, p2}, Lco/bird/android/widget/cropper/c;->A(Landroid/graphics/Bitmap;LXh1;)Lco/bird/android/widget/cropper/c$b;

    move-result-object p1

    iget-object p2, p1, Lco/bird/android/widget/cropper/c$b;->a:Landroid/graphics/Bitmap;

    iget p1, p1, Lco/bird/android/widget/cropper/c$b;->b:I

    iput p1, p0, Lco/bird/android/widget/cropper/CropImageView;->j:I

    move v5, p1

    move-object v1, p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    move-object v1, p1

    move v5, p2

    :goto_0
    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lco/bird/android/widget/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lco/bird/android/widget/cropper/CropImageView;->s(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    return-void
.end method

.method public setImageResource(I)V
    .locals 7

    if-eqz p1, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lco/bird/android/widget/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    move v3, p1

    invoke-virtual/range {v1 .. v6}, Lco/bird/android/widget/cropper/CropImageView;->s(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    :cond_0
    return-void
.end method

.method public setImageUriAsync(Landroid/net/Uri;)V
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->H:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/cropper/b;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->d()V

    iput-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->D:Landroid/graphics/RectF;

    const/4 v0, 0x0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageView;->E:I

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v2, v1}, Lco/bird/android/widget/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    new-instance v2, Lco/bird/android/widget/cropper/b;

    invoke-direct {v2, p0, p1}, Lco/bird/android/widget/cropper/b;-><init>(Lco/bird/android/widget/cropper/CropImageView;Landroid/net/Uri;)V

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->H:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/widget/cropper/b;

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->u()V

    :cond_2
    return-void
.end method

.method public setMaxCropResultSize(II)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/widget/cropper/CropOverlayView;->setMaxCropResultSize(II)V

    return-void
.end method

.method public setMaxZoom(I)V
    .locals 1

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageView;->v:I

    if-eq v0, p1, :cond_0

    if-lez p1, :cond_0

    iput p1, p0, Lco/bird/android/widget/cropper/CropImageView;->v:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lco/bird/android/widget/cropper/CropImageView;->m(ZZ)V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setMinCropResultSize(II)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/widget/cropper/CropOverlayView;->setMinCropResultSize(II)V

    return-void
.end method

.method public setMultiTouchEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->x(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lco/bird/android/widget/cropper/CropImageView;->m(ZZ)V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setOnCropImageCompleteListener(Lco/bird/android/widget/cropper/CropImageView$e;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->x:Lco/bird/android/widget/cropper/CropImageView$e;

    return-void
.end method

.method public setOnSetCropOverlayReleasedListener(Lco/bird/android/widget/cropper/CropImageView$f;)V
    .locals 0

    return-void
.end method

.method public setOnSetImageUriCompleteListener(Lco/bird/android/widget/cropper/CropImageView$g;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->w:Lco/bird/android/widget/cropper/CropImageView$g;

    return-void
.end method

.method public setRotatedDegrees(I)V
    .locals 1

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageView;->k:I

    if-eq v0, p1, :cond_0

    sub-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropImageView;->q(I)V

    :cond_0
    return-void
.end method

.method public setSaveBitmapToInstanceState(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/widget/cropper/CropImageView;->r:Z

    return-void
.end method

.method public setScaleType(Lco/bird/android/widget/cropper/CropImageView$i;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->q:Lco/bird/android/widget/cropper/CropImageView$i;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->q:Lco/bird/android/widget/cropper/CropImageView$i;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lco/bird/android/widget/cropper/CropImageView;->A:F

    const/4 p1, 0x0

    iput p1, p0, Lco/bird/android/widget/cropper/CropImageView;->C:F

    iput p1, p0, Lco/bird/android/widget/cropper/CropImageView;->B:F

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {p1}, Lco/bird/android/widget/cropper/CropOverlayView;->w()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setShowCropOverlay(Z)V
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->s:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lco/bird/android/widget/cropper/CropImageView;->s:Z

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->t()V

    :cond_0
    return-void
.end method

.method public setShowProgressBar(Z)V
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->t:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lco/bird/android/widget/cropper/CropImageView;->t:Z

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropImageView;->u()V

    :cond_0
    return-void
.end method

.method public setSnapRadius(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->setSnapRadius(F)V

    :cond_0
    return-void
.end method

.method public final t()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lco/bird/android/widget/cropper/CropImageView;->s:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public final u()V
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageView;->t:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->H:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->I:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->f:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x4

    :goto_1
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public v(IILco/bird/android/widget/cropper/CropImageView$h;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;I)V
    .locals 22

    move-object/from16 v15, p0

    move-object/from16 v14, p3

    iget-object v0, v15, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_6

    iget-object v0, v15, Lco/bird/android/widget/cropper/CropImageView;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v0, v15, Lco/bird/android/widget/cropper/CropImageView;->I:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/cropper/a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_1
    sget-object v0, Lco/bird/android/widget/cropper/CropImageView$h;->b:Lco/bird/android/widget/cropper/CropImageView$h;

    if-eq v14, v0, :cond_2

    move/from16 v10, p1

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    :goto_1
    if-eq v14, v0, :cond_3

    move/from16 v16, p2

    goto :goto_2

    :cond_3
    const/16 v16, 0x0

    :goto_2
    iget-object v0, v15, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget v2, v15, Lco/bird/android/widget/cropper/CropImageView;->z:I

    mul-int v5, v0, v2

    iget-object v0, v15, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iget v2, v15, Lco/bird/android/widget/cropper/CropImageView;->z:I

    mul-int v6, v0, v2

    iget-object v0, v15, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    if-eqz v0, :cond_5

    if-gt v2, v1, :cond_4

    sget-object v0, Lco/bird/android/widget/cropper/CropImageView$h;->c:Lco/bird/android/widget/cropper/CropImageView$h;

    if-ne v14, v0, :cond_5

    :cond_4
    new-instance v1, Ljava/lang/ref/WeakReference;

    new-instance v13, Lco/bird/android/widget/cropper/a;

    move-object v0, v13

    iget-object v2, v15, Lco/bird/android/widget/cropper/CropImageView;->y:Landroid/net/Uri;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/cropper/CropImageView;->g()[F

    move-result-object v3

    iget v4, v15, Lco/bird/android/widget/cropper/CropImageView;->k:I

    iget-object v7, v15, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v7}, Lco/bird/android/widget/cropper/CropOverlayView;->r()Z

    move-result v7

    iget-object v8, v15, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v8}, Lco/bird/android/widget/cropper/CropOverlayView;->j()I

    move-result v8

    iget-object v9, v15, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v9}, Lco/bird/android/widget/cropper/CropOverlayView;->k()I

    move-result v9

    iget-boolean v12, v15, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    iget-boolean v11, v15, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    move-object/from16 v18, v13

    move v13, v11

    move-object v11, v1

    move-object/from16 v1, p0

    move-object/from16 v19, v11

    move/from16 v11, v16

    move-object/from16 v14, p3

    move-object/from16 v15, p4

    move-object/from16 v16, p5

    move/from16 v17, p6

    invoke-direct/range {v0 .. v17}, Lco/bird/android/widget/cropper/a;-><init>(Lco/bird/android/widget/cropper/CropImageView;Landroid/net/Uri;[FIIIZIIIIZZLco/bird/android/widget/cropper/CropImageView$h;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;I)V

    move-object/from16 v1, v18

    move-object/from16 v0, v19

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    move-object/from16 v15, p0

    iput-object v0, v15, Lco/bird/android/widget/cropper/CropImageView;->I:Ljava/lang/ref/WeakReference;

    move-object v1, v15

    goto :goto_3

    :cond_5
    new-instance v13, Ljava/lang/ref/WeakReference;

    new-instance v12, Lco/bird/android/widget/cropper/a;

    iget-object v2, v15, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/cropper/CropImageView;->g()[F

    move-result-object v3

    iget v4, v15, Lco/bird/android/widget/cropper/CropImageView;->k:I

    iget-object v0, v15, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropOverlayView;->r()Z

    move-result v5

    iget-object v0, v15, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropOverlayView;->j()I

    move-result v6

    iget-object v0, v15, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropOverlayView;->k()I

    move-result v7

    iget-boolean v11, v15, Lco/bird/android/widget/cropper/CropImageView;->l:Z

    iget-boolean v9, v15, Lco/bird/android/widget/cropper/CropImageView;->m:Z

    move-object v0, v12

    move-object/from16 v1, p0

    move v8, v10

    move/from16 v17, v9

    move/from16 v9, v16

    move v10, v11

    move/from16 v11, v17

    move-object/from16 v20, v12

    move-object/from16 v12, p3

    move-object v14, v13

    move-object/from16 v13, p4

    move-object/from16 v21, v14

    move-object/from16 v14, p5

    move/from16 v15, p6

    invoke-direct/range {v0 .. v15}, Lco/bird/android/widget/cropper/a;-><init>(Lco/bird/android/widget/cropper/CropImageView;Landroid/graphics/Bitmap;[FIZIIIIZZLco/bird/android/widget/cropper/CropImageView$h;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;I)V

    move-object/from16 v1, v20

    move-object/from16 v0, v21

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lco/bird/android/widget/cropper/CropImageView;->I:Ljava/lang/ref/WeakReference;

    :goto_3
    iget-object v0, v1, Lco/bird/android/widget/cropper/CropImageView;->I:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/cropper/a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/cropper/CropImageView;->u()V

    goto :goto_4

    :cond_6
    move-object v1, v15

    :goto_4
    return-void
.end method

.method public final w(Z)V
    .locals 5

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget v1, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v1}, Lco/bird/android/widget/cropper/c;->x([F)F

    move-result v1

    div-float/2addr v0, v1

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    iget v2, p0, Lco/bird/android/widget/cropper/CropImageView;->z:I

    mul-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    invoke-static {v2}, Lco/bird/android/widget/cropper/c;->t([F)F

    move-result v2

    div-float/2addr v1, v2

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2, v3, v4, v0, v1}, Lco/bird/android/widget/cropper/CropOverlayView;->setCropWindowLimits(FFFF)V

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lco/bird/android/widget/cropper/CropImageView;->g:[F

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Lco/bird/android/widget/cropper/CropOverlayView;->setBounds([FII)V

    return-void
.end method

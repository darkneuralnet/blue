.class public Lco/bird/android/widget/cropper/CropImageOptions;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/widget/cropper/CropImageOptions;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:Ljava/lang/CharSequence;

.field public F:I

.field public G:Landroid/net/Uri;

.field public H:Landroid/graphics/Bitmap$CompressFormat;

.field public I:I

.field public J:I

.field public K:I

.field public P:Lco/bird/android/widget/cropper/CropImageView$h;

.field public Q:Z

.field public R:Landroid/graphics/Rect;

.field public S:I

.field public T:Z

.field public U:Z

.field public W:Z

.field public X:I

.field public Y:Z

.field public Z:Z

.field public b:Lco/bird/android/widget/cropper/CropImageView$c;

.field public c:F

.field public d:F

.field public e:Lco/bird/android/widget/cropper/CropImageView$d;

.field public f:Lco/bird/android/widget/cropper/CropImageView$i;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:I

.field public l:F

.field public m:Z

.field public n:I

.field public o:I

.field public p:F

.field public q:I

.field public r:F

.field public s:F

.field public t:F

.field public u:I

.field public v:F

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/widget/cropper/CropImageOptions$a;

    invoke-direct {v0}, Lco/bird/android/widget/cropper/CropImageOptions$a;-><init>()V

    sput-object v0, Lco/bird/android/widget/cropper/CropImageOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    sget-object v1, Lco/bird/android/widget/cropper/CropImageView$c;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    iput-object v1, p0, Lco/bird/android/widget/cropper/CropImageOptions;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    const/4 v1, 0x1

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    iput v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->c:F

    const/high16 v3, 0x41c00000    # 24.0f

    invoke-static {v1, v3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    iput v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->d:F

    sget-object v3, Lco/bird/android/widget/cropper/CropImageView$d;->c:Lco/bird/android/widget/cropper/CropImageView$d;

    iput-object v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->e:Lco/bird/android/widget/cropper/CropImageView$d;

    sget-object v3, Lco/bird/android/widget/cropper/CropImageView$i;->b:Lco/bird/android/widget/cropper/CropImageView$i;

    iput-object v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->f:Lco/bird/android/widget/cropper/CropImageView$i;

    iput-boolean v1, p0, Lco/bird/android/widget/cropper/CropImageOptions;->g:Z

    iput-boolean v1, p0, Lco/bird/android/widget/cropper/CropImageOptions;->h:Z

    iput-boolean v1, p0, Lco/bird/android/widget/cropper/CropImageOptions;->i:Z

    const/4 v3, 0x0

    iput-boolean v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->j:Z

    const/4 v4, 0x4

    iput v4, p0, Lco/bird/android/widget/cropper/CropImageOptions;->k:I

    const v4, 0x3dcccccd    # 0.1f

    iput v4, p0, Lco/bird/android/widget/cropper/CropImageOptions;->l:F

    iput-boolean v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->m:Z

    iput v1, p0, Lco/bird/android/widget/cropper/CropImageOptions;->n:I

    iput v1, p0, Lco/bird/android/widget/cropper/CropImageOptions;->o:I

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    iput v2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->p:F

    const/16 v2, 0xaa

    const/16 v4, 0xff

    invoke-static {v2, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v5

    iput v5, p0, Lco/bird/android/widget/cropper/CropImageOptions;->q:I

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v1, v5, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    iput v5, p0, Lco/bird/android/widget/cropper/CropImageOptions;->r:F

    const/high16 v5, 0x40a00000    # 5.0f

    invoke-static {v1, v5, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    iput v5, p0, Lco/bird/android/widget/cropper/CropImageOptions;->s:F

    const/high16 v5, 0x41600000    # 14.0f

    invoke-static {v1, v5, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    iput v5, p0, Lco/bird/android/widget/cropper/CropImageOptions;->t:F

    const/4 v5, -0x1

    iput v5, p0, Lco/bird/android/widget/cropper/CropImageOptions;->u:I

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v1, v6, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v6

    iput v6, p0, Lco/bird/android/widget/cropper/CropImageOptions;->v:F

    invoke-static {v2, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    iput v2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->w:I

    const/16 v2, 0x77

    invoke-static {v2, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    iput v2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->x:I

    const/high16 v2, 0x42280000    # 42.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v4

    float-to-int v4, v4

    iput v4, p0, Lco/bird/android/widget/cropper/CropImageOptions;->y:I

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->z:I

    const/16 v0, 0x28

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->A:I

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->B:I

    const v0, 0x1869f

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->C:I

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->D:I

    const-string v0, ""

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->E:Ljava/lang/CharSequence;

    iput v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->F:I

    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->G:Landroid/net/Uri;

    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->H:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v0, 0x5a

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->I:I

    iput v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->J:I

    iput v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->K:I

    sget-object v2, Lco/bird/android/widget/cropper/CropImageView$h;->b:Lco/bird/android/widget/cropper/CropImageView$h;

    iput-object v2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->P:Lco/bird/android/widget/cropper/CropImageView$h;

    iput-boolean v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->Q:Z

    const/4 v2, 0x0

    iput-object v2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->R:Landroid/graphics/Rect;

    iput v5, p0, Lco/bird/android/widget/cropper/CropImageOptions;->S:I

    iput-boolean v1, p0, Lco/bird/android/widget/cropper/CropImageOptions;->T:Z

    iput-boolean v1, p0, Lco/bird/android/widget/cropper/CropImageOptions;->U:Z

    iput-boolean v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->W:Z

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->X:I

    iput-boolean v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->Y:Z

    iput-boolean v3, p0, Lco/bird/android/widget/cropper/CropImageOptions;->Z:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lco/bird/android/widget/cropper/CropImageView$c;->values()[Lco/bird/android/widget/cropper/CropImageView$c;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->c:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->d:F

    invoke-static {}, Lco/bird/android/widget/cropper/CropImageView$d;->values()[Lco/bird/android/widget/cropper/CropImageView$d;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->e:Lco/bird/android/widget/cropper/CropImageView$d;

    invoke-static {}, Lco/bird/android/widget/cropper/CropImageView$i;->values()[Lco/bird/android/widget/cropper/CropImageView$i;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->f:Lco/bird/android/widget/cropper/CropImageView$i;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->g:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->h:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->i:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    move v0, v2

    :goto_3
    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->j:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->k:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->l:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    move v0, v2

    :goto_4
    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->m:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->n:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->o:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->p:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->q:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->r:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->s:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->t:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->u:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->v:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->w:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->x:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->y:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->z:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->A:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->B:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->C:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->D:I

    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->E:Ljava/lang/CharSequence;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->F:I

    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->G:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Bitmap$CompressFormat;->valueOf(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->H:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->I:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->J:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->K:I

    invoke-static {}, Lco/bird/android/widget/cropper/CropImageView$h;->values()[Lco/bird/android/widget/cropper/CropImageView$h;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    aget-object v0, v0, v3

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->P:Lco/bird/android/widget/cropper/CropImageView$h;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    goto :goto_5

    :cond_5
    move v0, v2

    :goto_5
    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->Q:Z

    const-class v0, Landroid/graphics/Rect;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->R:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->S:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_6

    move v0, v1

    goto :goto_6

    :cond_6
    move v0, v2

    :goto_6
    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->T:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_7

    move v0, v1

    goto :goto_7

    :cond_7
    move v0, v2

    :goto_7
    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->U:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_8

    move v0, v1

    goto :goto_8

    :cond_8
    move v0, v2

    :goto_8
    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->W:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->X:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_9

    move v0, v1

    goto :goto_9

    :cond_9
    move v0, v2

    :goto_9
    iput-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->Y:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_a

    :cond_a
    move v1, v2

    :goto_a
    iput-boolean v1, p0, Lco/bird/android/widget/cropper/CropImageOptions;->Z:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->k:I

    if-ltz v0, :cond_f

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->d:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_e

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->l:F

    cmpg-float v2, v0, v1

    if-ltz v2, :cond_d

    float-to-double v2, v0

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v2, v4

    if-gez v0, :cond_d

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->n:I

    const-string v2, "Cannot set aspect ratio value to a number less than or equal to 0."

    if-lez v0, :cond_c

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->o:I

    if-lez v0, :cond_b

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->p:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_a

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->r:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_9

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->v:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_8

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->z:I

    if-ltz v0, :cond_7

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->A:I

    if-ltz v0, :cond_6

    iget v1, p0, Lco/bird/android/widget/cropper/CropImageOptions;->B:I

    if-ltz v1, :cond_5

    iget v2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->C:I

    if-lt v2, v0, :cond_4

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->D:I

    if-lt v0, v1, :cond_3

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->J:I

    if-ltz v0, :cond_2

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->K:I

    if-ltz v0, :cond_1

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->X:I

    if-ltz v0, :cond_0

    const/16 v1, 0x168

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set rotation degrees value to a number < 0 or > 360"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set request height value to a number < 0 "

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set request width value to a number < 0 "

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set max crop result height to smaller value than min crop result height"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set max crop result width to smaller value than min crop result width"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set min crop result height value to a number < 0 "

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set min crop result width value to a number < 0 "

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set min crop window height value to a number < 0 "

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set guidelines thickness value to a number less than 0."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set corner thickness value to a number less than 0."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set line thickness value to a number less than 0."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set initial crop window padding value to a number < 0 or >= 0.5"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set touch radius value to a number <= 0 "

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set max zoom to a number < 1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->c:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->d:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->e:Lco/bird/android/widget/cropper/CropImageView$d;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->f:Lco/bird/android/widget/cropper/CropImageView$i;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->g:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->h:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->i:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->j:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->k:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->l:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->m:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->n:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->o:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->p:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->q:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->r:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->s:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->t:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->u:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->v:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->w:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->x:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->y:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->z:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->A:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->B:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->C:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->D:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->E:Ljava/lang/CharSequence;

    invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->F:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->G:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->H:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->I:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->J:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->K:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->P:Lco/bird/android/widget/cropper/CropImageView$h;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->Q:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageOptions;->R:Landroid/graphics/Rect;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget p2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->S:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->T:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->U:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->W:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget p2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->X:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->Y:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lco/bird/android/widget/cropper/CropImageOptions;->Z:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method

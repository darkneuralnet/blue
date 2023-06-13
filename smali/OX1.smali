.class public LOX1;
.super LmI4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LmI4<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# static fields
.field public static final DEFAULT_IMAGE_BACKOFF_MULT:F = 2.0f

.field public static final DEFAULT_IMAGE_MAX_RETRIES:I = 0x2

.field public static final DEFAULT_IMAGE_TIMEOUT_MS:I = 0x3e8

.field private static final sDecodeLock:Ljava/lang/Object;


# instance fields
.field private final mDecodeConfig:Landroid/graphics/Bitmap$Config;

.field private mListener:LEM4$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEM4$b<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private final mLock:Ljava/lang/Object;

.field private final mMaxHeight:I

.field private final mMaxWidth:I

.field private final mScaleType:Landroid/widget/ImageView$ScaleType;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LOX1;->sDecodeLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LEM4$b;IILandroid/graphics/Bitmap$Config;LEM4$a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LEM4$b<",
            "Landroid/graphics/Bitmap;",
            ">;II",
            "Landroid/graphics/Bitmap$Config;",
            "LEM4$a;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LOX1;-><init>(Ljava/lang/String;LEM4$b;IILandroid/widget/ImageView$ScaleType;Landroid/graphics/Bitmap$Config;LEM4$a;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LEM4$b;IILandroid/widget/ImageView$ScaleType;Landroid/graphics/Bitmap$Config;LEM4$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LEM4$b<",
            "Landroid/graphics/Bitmap;",
            ">;II",
            "Landroid/widget/ImageView$ScaleType;",
            "Landroid/graphics/Bitmap$Config;",
            "LEM4$a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p7}, LmI4;-><init>(ILjava/lang/String;LEM4$a;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOX1;->mLock:Ljava/lang/Object;

    new-instance p1, LuY0;

    const/4 p7, 0x2

    const/high16 v0, 0x40000000    # 2.0f

    const/16 v1, 0x3e8

    invoke-direct {p1, v1, p7, v0}, LuY0;-><init>(IIF)V

    invoke-virtual {p0, p1}, LmI4;->setRetryPolicy(LQN4;)LmI4;

    iput-object p2, p0, LOX1;->mListener:LEM4$b;

    iput-object p6, p0, LOX1;->mDecodeConfig:Landroid/graphics/Bitmap$Config;

    iput p3, p0, LOX1;->mMaxWidth:I

    iput p4, p0, LOX1;->mMaxHeight:I

    iput-object p5, p0, LOX1;->mScaleType:Landroid/widget/ImageView$ScaleType;

    return-void
.end method

.method private doParse(LO73;)LEM4;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO73;",
            ")",
            "LEM4<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p1, LO73;->b:[B

    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iget v2, p0, LOX1;->mMaxWidth:I

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget v2, p0, LOX1;->mMaxHeight:I

    if-nez v2, :cond_0

    iget-object v2, p0, LOX1;->mDecodeConfig:Landroid/graphics/Bitmap$Config;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    array-length v2, v0

    invoke-static {v0, v3, v2, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    array-length v4, v0

    invoke-static {v0, v3, v4, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v4, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v5, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v6, p0, LOX1;->mMaxWidth:I

    iget v7, p0, LOX1;->mMaxHeight:I

    iget-object v8, p0, LOX1;->mScaleType:Landroid/widget/ImageView$ScaleType;

    invoke-static {v6, v7, v4, v5, v8}, LOX1;->getResizedDimension(IIIILandroid/widget/ImageView$ScaleType;)I

    move-result v6

    iget v7, p0, LOX1;->mMaxHeight:I

    iget v8, p0, LOX1;->mMaxWidth:I

    iget-object v9, p0, LOX1;->mScaleType:Landroid/widget/ImageView$ScaleType;

    invoke-static {v7, v8, v5, v4, v9}, LOX1;->getResizedDimension(IIIILandroid/widget/ImageView$ScaleType;)I

    move-result v7

    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {v4, v5, v6, v7}, LOX1;->findBestSampleSize(IIII)I

    move-result v4

    iput v4, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    array-length v4, v0

    invoke-static {v0, v3, v4, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-gt v1, v6, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-le v1, v7, :cond_2

    :cond_1
    invoke-static {v0, v6, v7, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v1

    :cond_2
    :goto_0
    if-nez v0, :cond_3

    new-instance v0, Lcom/android/volley/ParseError;

    invoke-direct {v0, p1}, Lcom/android/volley/ParseError;-><init>(LO73;)V

    invoke-static {v0}, LEM4;->a(Lcom/android/volley/VolleyError;)LEM4;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {p1}, LEN1;->e(LO73;)LY70$a;

    move-result-object p1

    invoke-static {v0, p1}, LEM4;->c(Ljava/lang/Object;LY70$a;)LEM4;

    move-result-object p1

    return-object p1
.end method

.method public static findBestSampleSize(IIII)I
    .locals 4

    int-to-double v0, p0

    int-to-double v2, p2

    div-double/2addr v0, v2

    int-to-double p0, p1

    int-to-double p2, p3

    div-double/2addr p0, p2

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    const/high16 p2, 0x3f800000    # 1.0f

    :goto_0
    const/high16 p3, 0x40000000    # 2.0f

    mul-float/2addr p3, p2

    float-to-double v0, p3

    cmpg-double v0, v0, p0

    if-gtz v0, :cond_0

    move p2, p3

    goto :goto_0

    :cond_0
    float-to-int p0, p2

    return p0
.end method

.method private static getResizedDimension(IIIILandroid/widget/ImageView$ScaleType;)I
    .locals 4

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    return p2

    :cond_0
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    if-ne p4, v0, :cond_2

    if-nez p0, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    if-nez p0, :cond_3

    int-to-double p0, p1

    int-to-double p3, p3

    div-double/2addr p0, p3

    int-to-double p2, p2

    mul-double/2addr p2, p0

    double-to-int p0, p2

    return p0

    :cond_3
    if-nez p1, :cond_4

    return p0

    :cond_4
    int-to-double v0, p3

    int-to-double p2, p2

    div-double/2addr v0, p2

    sget-object p2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    if-ne p4, p2, :cond_6

    int-to-double p2, p0

    mul-double/2addr p2, v0

    int-to-double v2, p1

    cmpg-double p1, p2, v2

    if-gez p1, :cond_5

    div-double/2addr v2, v0

    double-to-int p0, v2

    :cond_5
    return p0

    :cond_6
    int-to-double p2, p0

    mul-double/2addr p2, v0

    int-to-double v2, p1

    cmpl-double p1, p2, v2

    if-lez p1, :cond_7

    div-double/2addr v2, v0

    double-to-int p0, v2

    :cond_7
    return p0
.end method


# virtual methods
.method public cancel()V
    .locals 2

    invoke-super {p0}, LmI4;->cancel()V

    iget-object v0, p0, LOX1;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, LOX1;->mListener:LEM4$b;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public deliverResponse(Landroid/graphics/Bitmap;)V
    .locals 2

    iget-object v0, p0, LOX1;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOX1;->mListener:LEM4$b;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, LEM4$b;->onResponse(Ljava/lang/Object;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public bridge synthetic deliverResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, LOX1;->deliverResponse(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public getPriority()LmI4$c;
    .locals 1

    sget-object v0, LmI4$c;->b:LmI4$c;

    return-object v0
.end method

.method public parseNetworkResponse(LO73;)LEM4;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO73;",
            ")",
            "LEM4<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    sget-object v0, LOX1;->sDecodeLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1}, LOX1;->doParse(LO73;)LEM4;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Caught OOM for %d byte image, url=%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object p1, p1, LO73;->b:[B

    array-length p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {p0}, LmI4;->getUrl()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x1

    aput-object p1, v3, v4

    invoke-static {v2, v3}, LNu6;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lcom/android/volley/ParseError;

    invoke-direct {p1, v1}, Lcom/android/volley/ParseError;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p1}, LEM4;->a(Lcom/android/volley/VolleyError;)LEM4;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

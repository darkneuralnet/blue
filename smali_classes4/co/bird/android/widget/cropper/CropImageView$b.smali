.class public Lco/bird/android/widget/cropper/CropImageView$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/cropper/CropImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final b:Landroid/graphics/Bitmap;

.field public final c:Landroid/net/Uri;

.field public final d:Landroid/graphics/Bitmap;

.field public final e:Landroid/net/Uri;

.field public final f:Ljava/lang/Exception;

.field public final g:[F

.field public final h:Landroid/graphics/Rect;

.field public final i:Landroid/graphics/Rect;

.field public final j:I

.field public final k:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropImageView$b;->b:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lco/bird/android/widget/cropper/CropImageView$b;->c:Landroid/net/Uri;

    iput-object p3, p0, Lco/bird/android/widget/cropper/CropImageView$b;->d:Landroid/graphics/Bitmap;

    iput-object p4, p0, Lco/bird/android/widget/cropper/CropImageView$b;->e:Landroid/net/Uri;

    iput-object p5, p0, Lco/bird/android/widget/cropper/CropImageView$b;->f:Ljava/lang/Exception;

    iput-object p6, p0, Lco/bird/android/widget/cropper/CropImageView$b;->g:[F

    iput-object p7, p0, Lco/bird/android/widget/cropper/CropImageView$b;->h:Landroid/graphics/Rect;

    iput-object p8, p0, Lco/bird/android/widget/cropper/CropImageView$b;->i:Landroid/graphics/Rect;

    iput p9, p0, Lco/bird/android/widget/cropper/CropImageView$b;->j:I

    iput p10, p0, Lco/bird/android/widget/cropper/CropImageView$b;->k:I

    return-void
.end method


# virtual methods
.method public a()[F
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView$b;->g:[F

    return-object v0
.end method

.method public b()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView$b;->h:Landroid/graphics/Rect;

    return-object v0
.end method

.method public c()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView$b;->f:Ljava/lang/Exception;

    return-object v0
.end method

.method public d()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView$b;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageView$b;->j:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lco/bird/android/widget/cropper/CropImageView$b;->k:I

    return v0
.end method

.method public h()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView$b;->e:Landroid/net/Uri;

    return-object v0
.end method

.method public i()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImageView$b;->i:Landroid/graphics/Rect;

    return-object v0
.end method

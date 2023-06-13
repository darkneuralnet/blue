.class public final Lco/bird/android/widget/cropper/CropImage$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/cropper/CropImage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Lco/bird/android/widget/cropper/CropImageOptions;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropImage$a;->a:Landroid/net/Uri;

    new-instance p1, Lco/bird/android/widget/cropper/CropImageOptions;

    invoke-direct {p1}, Lco/bird/android/widget/cropper/CropImageOptions;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropImage$a;->b:Lco/bird/android/widget/cropper/CropImageOptions;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/net/Uri;LLE0;)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/widget/cropper/CropImage$a;-><init>(Landroid/net/Uri;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1

    const-class v0, Lco/bird/android/widget/cropper/CropImageActivity;

    invoke-virtual {p0, p1, v0}, Lco/bird/android/widget/cropper/CropImage$a;->b(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;)",
            "Landroid/content/Intent;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImage$a;->b:Lco/bird/android/widget/cropper/CropImageOptions;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropImageOptions;->a()V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string p2, "CROP_IMAGE_EXTRA_SOURCE"

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImage$a;->a:Landroid/net/Uri;

    invoke-virtual {p1, p2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "CROP_IMAGE_EXTRA_OPTIONS"

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropImage$a;->b:Lco/bird/android/widget/cropper/CropImageOptions;

    invoke-virtual {p1, p2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "bundle"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v0
.end method

.method public c(II)Lco/bird/android/widget/cropper/CropImage$a;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImage$a;->b:Lco/bird/android/widget/cropper/CropImageOptions;

    iput p1, v0, Lco/bird/android/widget/cropper/CropImageOptions;->n:I

    iput p2, v0, Lco/bird/android/widget/cropper/CropImageOptions;->o:I

    const/4 p1, 0x1

    iput-boolean p1, v0, Lco/bird/android/widget/cropper/CropImageOptions;->m:Z

    return-object p0
.end method

.method public d(Lco/bird/android/widget/cropper/CropImageView$c;)Lco/bird/android/widget/cropper/CropImage$a;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImage$a;->b:Lco/bird/android/widget/cropper/CropImageOptions;

    iput-object p1, v0, Lco/bird/android/widget/cropper/CropImageOptions;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    return-object p0
.end method

.method public e(II)Lco/bird/android/widget/cropper/CropImage$a;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImage$a;->b:Lco/bird/android/widget/cropper/CropImageOptions;

    iput p1, v0, Lco/bird/android/widget/cropper/CropImageOptions;->C:I

    iput p2, v0, Lco/bird/android/widget/cropper/CropImageOptions;->D:I

    return-object p0
.end method

.method public f(II)Lco/bird/android/widget/cropper/CropImage$a;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImage$a;->b:Lco/bird/android/widget/cropper/CropImageOptions;

    iput p1, v0, Lco/bird/android/widget/cropper/CropImageOptions;->y:I

    iput p2, v0, Lco/bird/android/widget/cropper/CropImageOptions;->z:I

    return-object p0
.end method

.method public g(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropImage$a;->b:Lco/bird/android/widget/cropper/CropImageOptions;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropImageOptions;->a()V

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropImage$a;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0xcb

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

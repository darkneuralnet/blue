.class public final Lco/bird/android/widget/cropper/a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/cropper/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lco/bird/android/widget/cropper/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lco/bird/android/widget/cropper/CropImageView;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/graphics/Bitmap;

.field public final c:Landroid/net/Uri;

.field public final d:Landroid/content/Context;

.field public final e:[F

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Z

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:Z

.field public final o:Z

.field public final p:Lco/bird/android/widget/cropper/CropImageView$h;

.field public final q:Landroid/net/Uri;

.field public final r:Landroid/graphics/Bitmap$CompressFormat;

.field public final s:I


# direct methods
.method public constructor <init>(Lco/bird/android/widget/cropper/CropImageView;Landroid/graphics/Bitmap;[FIZIIIIZZLco/bird/android/widget/cropper/CropImageView$h;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;I)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    new-instance v1, Ljava/lang/ref/WeakReference;

    move-object v2, p1

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->d:Landroid/content/Context;

    move-object v1, p2

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->b:Landroid/graphics/Bitmap;

    move-object v1, p3

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->e:[F

    const/4 v1, 0x0

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->c:Landroid/net/Uri;

    move v1, p4

    iput v1, v0, Lco/bird/android/widget/cropper/a;->f:I

    move v1, p5

    iput-boolean v1, v0, Lco/bird/android/widget/cropper/a;->i:Z

    move v1, p6

    iput v1, v0, Lco/bird/android/widget/cropper/a;->j:I

    move v1, p7

    iput v1, v0, Lco/bird/android/widget/cropper/a;->k:I

    move v1, p8

    iput v1, v0, Lco/bird/android/widget/cropper/a;->l:I

    move v1, p9

    iput v1, v0, Lco/bird/android/widget/cropper/a;->m:I

    move v1, p10

    iput-boolean v1, v0, Lco/bird/android/widget/cropper/a;->n:Z

    move v1, p11

    iput-boolean v1, v0, Lco/bird/android/widget/cropper/a;->o:Z

    move-object v1, p12

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->p:Lco/bird/android/widget/cropper/CropImageView$h;

    move-object/from16 v1, p13

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->q:Landroid/net/Uri;

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->r:Landroid/graphics/Bitmap$CompressFormat;

    move/from16 v1, p15

    iput v1, v0, Lco/bird/android/widget/cropper/a;->s:I

    const/4 v1, 0x0

    iput v1, v0, Lco/bird/android/widget/cropper/a;->g:I

    iput v1, v0, Lco/bird/android/widget/cropper/a;->h:I

    return-void
.end method

.method public constructor <init>(Lco/bird/android/widget/cropper/CropImageView;Landroid/net/Uri;[FIIIZIIIIZZLco/bird/android/widget/cropper/CropImageView$h;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;I)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    new-instance v1, Ljava/lang/ref/WeakReference;

    move-object v2, p1

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->d:Landroid/content/Context;

    move-object v1, p2

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->c:Landroid/net/Uri;

    move-object v1, p3

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->e:[F

    move v1, p4

    iput v1, v0, Lco/bird/android/widget/cropper/a;->f:I

    move v1, p7

    iput-boolean v1, v0, Lco/bird/android/widget/cropper/a;->i:Z

    move v1, p8

    iput v1, v0, Lco/bird/android/widget/cropper/a;->j:I

    move v1, p9

    iput v1, v0, Lco/bird/android/widget/cropper/a;->k:I

    move v1, p5

    iput v1, v0, Lco/bird/android/widget/cropper/a;->g:I

    move v1, p6

    iput v1, v0, Lco/bird/android/widget/cropper/a;->h:I

    move v1, p10

    iput v1, v0, Lco/bird/android/widget/cropper/a;->l:I

    move v1, p11

    iput v1, v0, Lco/bird/android/widget/cropper/a;->m:I

    move v1, p12

    iput-boolean v1, v0, Lco/bird/android/widget/cropper/a;->n:Z

    move/from16 v1, p13

    iput-boolean v1, v0, Lco/bird/android/widget/cropper/a;->o:Z

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->p:Lco/bird/android/widget/cropper/CropImageView$h;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->q:Landroid/net/Uri;

    move-object/from16 v1, p16

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->r:Landroid/graphics/Bitmap$CompressFormat;

    move/from16 v1, p17

    iput v1, v0, Lco/bird/android/widget/cropper/a;->s:I

    const/4 v1, 0x0

    iput-object v1, v0, Lco/bird/android/widget/cropper/a;->b:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Lco/bird/android/widget/cropper/a$a;
    .locals 17

    move-object/from16 v1, p0

    const/4 v2, 0x1

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_4

    iget-object v5, v1, Lco/bird/android/widget/cropper/a;->c:Landroid/net/Uri;

    if-eqz v5, :cond_0

    iget-object v4, v1, Lco/bird/android/widget/cropper/a;->d:Landroid/content/Context;

    iget-object v6, v1, Lco/bird/android/widget/cropper/a;->e:[F

    iget v7, v1, Lco/bird/android/widget/cropper/a;->f:I

    iget v8, v1, Lco/bird/android/widget/cropper/a;->g:I

    iget v9, v1, Lco/bird/android/widget/cropper/a;->h:I

    iget-boolean v10, v1, Lco/bird/android/widget/cropper/a;->i:Z

    iget v11, v1, Lco/bird/android/widget/cropper/a;->j:I

    iget v12, v1, Lco/bird/android/widget/cropper/a;->k:I

    iget v13, v1, Lco/bird/android/widget/cropper/a;->l:I

    iget v14, v1, Lco/bird/android/widget/cropper/a;->m:I

    iget-boolean v15, v1, Lco/bird/android/widget/cropper/a;->n:Z

    iget-boolean v0, v1, Lco/bird/android/widget/cropper/a;->o:Z

    move/from16 v16, v0

    invoke-static/range {v4 .. v16}, Lco/bird/android/widget/cropper/c;->d(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZ)Lco/bird/android/widget/cropper/c$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, v1, Lco/bird/android/widget/cropper/a;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    iget-object v4, v1, Lco/bird/android/widget/cropper/a;->e:[F

    iget v5, v1, Lco/bird/android/widget/cropper/a;->f:I

    iget-boolean v6, v1, Lco/bird/android/widget/cropper/a;->i:Z

    iget v7, v1, Lco/bird/android/widget/cropper/a;->j:I

    iget v8, v1, Lco/bird/android/widget/cropper/a;->k:I

    iget-boolean v9, v1, Lco/bird/android/widget/cropper/a;->n:Z

    iget-boolean v10, v1, Lco/bird/android/widget/cropper/a;->o:Z

    move-object v3, v0

    invoke-static/range {v3 .. v10}, Lco/bird/android/widget/cropper/c;->g(Landroid/graphics/Bitmap;[FIZIIZZ)Lco/bird/android/widget/cropper/c$a;

    move-result-object v0

    :goto_0
    iget-object v3, v0, Lco/bird/android/widget/cropper/c$a;->a:Landroid/graphics/Bitmap;

    iget v4, v1, Lco/bird/android/widget/cropper/a;->l:I

    iget v5, v1, Lco/bird/android/widget/cropper/a;->m:I

    iget-object v6, v1, Lco/bird/android/widget/cropper/a;->p:Lco/bird/android/widget/cropper/CropImageView$h;

    invoke-static {v3, v4, v5, v6}, Lco/bird/android/widget/cropper/c;->y(Landroid/graphics/Bitmap;IILco/bird/android/widget/cropper/CropImageView$h;)Landroid/graphics/Bitmap;

    move-result-object v3

    iget-object v4, v1, Lco/bird/android/widget/cropper/a;->q:Landroid/net/Uri;

    if-nez v4, :cond_1

    new-instance v4, Lco/bird/android/widget/cropper/a$a;

    iget v0, v0, Lco/bird/android/widget/cropper/c$a;->b:I

    invoke-direct {v4, v3, v0}, Lco/bird/android/widget/cropper/a$a;-><init>(Landroid/graphics/Bitmap;I)V

    return-object v4

    :cond_1
    iget-object v5, v1, Lco/bird/android/widget/cropper/a;->d:Landroid/content/Context;

    iget-object v6, v1, Lco/bird/android/widget/cropper/a;->r:Landroid/graphics/Bitmap$CompressFormat;

    iget v7, v1, Lco/bird/android/widget/cropper/a;->s:I

    invoke-static {v5, v3, v4, v6, v7}, Lco/bird/android/widget/cropper/c;->C(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;I)V

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    :cond_2
    new-instance v3, Lco/bird/android/widget/cropper/a$a;

    iget-object v4, v1, Lco/bird/android/widget/cropper/a;->q:Landroid/net/Uri;

    iget v0, v0, Lco/bird/android/widget/cropper/c$a;->b:I

    invoke-direct {v3, v4, v0}, Lco/bird/android/widget/cropper/a$a;-><init>(Landroid/net/Uri;I)V

    return-object v3

    :cond_3
    new-instance v0, Lco/bird/android/widget/cropper/a$a;

    invoke-direct {v0, v3, v2}, Lco/bird/android/widget/cropper/a$a;-><init>(Landroid/graphics/Bitmap;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_4
    return-object v3

    :catch_0
    move-exception v0

    new-instance v3, Lco/bird/android/widget/cropper/a$a;

    iget-object v4, v1, Lco/bird/android/widget/cropper/a;->q:Landroid/net/Uri;

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    invoke-direct {v3, v0, v2}, Lco/bird/android/widget/cropper/a$a;-><init>(Ljava/lang/Exception;Z)V

    return-object v3
.end method

.method public b(Lco/bird/android/widget/cropper/a$a;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/cropper/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/cropper/CropImageView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lco/bird/android/widget/cropper/CropImageView;->o(Lco/bird/android/widget/cropper/a$a;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object p1, p1, Lco/bird/android/widget/cropper/a$a;->a:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/a;->a([Ljava/lang/Void;)Lco/bird/android/widget/cropper/a$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/widget/cropper/a$a;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/a;->b(Lco/bird/android/widget/cropper/a$a;)V

    return-void
.end method

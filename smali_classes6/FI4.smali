.class public LFI4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final a:LiT3;

.field public final b:LqI4$b;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Landroid/graphics/drawable/Drawable;

.field public k:Landroid/graphics/drawable/Drawable;

.field public l:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, LFI4;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LFI4;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, LFI4;->a:LiT3;

    new-instance v1, LqI4$b;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2, v0}, LqI4$b;-><init>(Landroid/net/Uri;ILandroid/graphics/Bitmap$Config;)V

    iput-object v1, p0, LFI4;->b:LqI4$b;

    return-void
.end method

.method public constructor <init>(LiT3;Landroid/net/Uri;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LFI4;->e:Z

    iget-boolean v0, p1, LiT3;->n:Z

    if-nez v0, :cond_0

    iput-object p1, p0, LFI4;->a:LiT3;

    new-instance v0, LqI4$b;

    iget-object p1, p1, LiT3;->k:Landroid/graphics/Bitmap$Config;

    invoke-direct {v0, p2, p3, p1}, LqI4$b;-><init>(Landroid/net/Uri;ILandroid/graphics/Bitmap$Config;)V

    iput-object v0, p0, LFI4;->b:LqI4$b;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Picasso instance already shut down. Cannot submit new requests."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()LFI4;
    .locals 2

    iget-object v0, p0, LFI4;->b:LqI4$b;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, LqI4$b;->b(I)LqI4$b;

    return-object p0
.end method

.method public b()LFI4;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LFI4;->l:Ljava/lang/Object;

    return-object p0
.end method

.method public final c(J)LqI4;
    .locals 7

    sget-object v0, LFI4;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iget-object v1, p0, LFI4;->b:LqI4$b;

    invoke-virtual {v1}, LqI4$b;->a()LqI4;

    move-result-object v1

    iput v0, v1, LqI4;->a:I

    iput-wide p1, v1, LqI4;->b:J

    iget-object v2, p0, LFI4;->a:LiT3;

    iget-boolean v2, v2, LiT3;->m:Z

    const-string v3, "Main"

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LqI4;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, LqI4;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "created"

    invoke-static {v3, v6, v4, v5}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v4, p0, LFI4;->a:LiT3;

    invoke-virtual {v4, v1}, LiT3;->p(LqI4;)LqI4;

    move-result-object v4

    if-eq v4, v1, :cond_1

    iput v0, v4, LqI4;->a:I

    iput-wide p1, v4, LqI4;->b:J

    if-eqz v2, :cond_1

    invoke-virtual {v4}, LqI4;->d()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "into "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "changed"

    invoke-static {v3, v0, p1, p2}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v4
.end method

.method public d()LFI4;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LFI4;->d:Z

    return-object p0
.end method

.method public final e()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget v0, p0, LFI4;->f:I

    if-eqz v0, :cond_0

    iget-object v1, p0, LFI4;->a:LiT3;

    iget-object v1, v1, LiT3;->d:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LFI4;->j:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public f(LMY5;)V
    .locals 14

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-static {}, LFi6;->c()V

    if-eqz p1, :cond_5

    iget-boolean v2, p0, LFI4;->d:Z

    if-nez v2, :cond_4

    iget-object v2, p0, LFI4;->b:LqI4$b;

    invoke-virtual {v2}, LqI4$b;->c()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iget-object v0, p0, LFI4;->a:LiT3;

    invoke-virtual {v0, p1}, LiT3;->b(LMY5;)V

    iget-boolean v0, p0, LFI4;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFI4;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    :cond_0
    invoke-interface {p1, v3}, LMY5;->onPrepareLoad(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_1
    invoke-virtual {p0, v0, v1}, LFI4;->c(J)LqI4;

    move-result-object v7

    invoke-static {v7}, LFi6;->f(LqI4;)Ljava/lang/String;

    move-result-object v11

    iget v0, p0, LFI4;->h:I

    invoke-static {v0}, LTP2;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LFI4;->a:LiT3;

    invoke-virtual {v0, v11}, LiT3;->m(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, LFI4;->a:LiT3;

    invoke-virtual {v1, p1}, LiT3;->b(LMY5;)V

    sget-object v1, LiT3$e;->c:LiT3$e;

    invoke-interface {p1, v0, v1}, LMY5;->onBitmapLoaded(Landroid/graphics/Bitmap;LiT3$e;)V

    return-void

    :cond_2
    iget-boolean v0, p0, LFI4;->e:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LFI4;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    :cond_3
    invoke-interface {p1, v3}, LMY5;->onPrepareLoad(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, LOY5;

    iget-object v5, p0, LFI4;->a:LiT3;

    iget v8, p0, LFI4;->h:I

    iget v9, p0, LFI4;->i:I

    iget-object v10, p0, LFI4;->k:Landroid/graphics/drawable/Drawable;

    iget-object v12, p0, LFI4;->l:Ljava/lang/Object;

    iget v13, p0, LFI4;->g:I

    move-object v4, v0

    move-object v6, p1

    invoke-direct/range {v4 .. v13}, LOY5;-><init>(LiT3;LMY5;LqI4;IILandroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Object;I)V

    iget-object p1, p0, LFI4;->a:LiT3;

    invoke-virtual {p1, v0}, LiT3;->g(Lz2;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fit cannot be used with a Target."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Target must not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Landroid/widget/ImageView;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LFI4;->h(Landroid/widget/ImageView;LI80;)V

    return-void
.end method

.method public h(Landroid/widget/ImageView;LI80;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v3, p1

    move-object/from16 v11, p2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-static {}, LFi6;->c()V

    if-eqz v3, :cond_b

    iget-object v4, v0, LFI4;->b:LqI4$b;

    invoke-virtual {v4}, LqI4$b;->c()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v1, v0, LFI4;->a:LiT3;

    invoke-virtual {v1, v3}, LiT3;->c(Landroid/widget/ImageView;)V

    iget-boolean v1, v0, LFI4;->e:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LFI4;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v3, v1}, LjT3;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void

    :cond_1
    iget-boolean v4, v0, LFI4;->d:Z

    if-eqz v4, :cond_6

    iget-object v4, v0, LFI4;->b:LqI4$b;

    invoke-virtual {v4}, LqI4$b;->d()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getHeight()I

    move-result v5

    if-eqz v4, :cond_3

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    iget-object v6, v0, LFI4;->b:LqI4$b;

    invoke-virtual {v6, v4, v5}, LqI4$b;->e(II)LqI4$b;

    goto :goto_1

    :cond_3
    :goto_0
    iget-boolean v1, v0, LFI4;->e:Z

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LFI4;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v3, v1}, LjT3;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    :cond_4
    iget-object v1, v0, LFI4;->a:LiT3;

    new-instance v2, LkZ0;

    invoke-direct {v2, p0, v3, v11}, LkZ0;-><init>(LFI4;Landroid/widget/ImageView;LI80;)V

    invoke-virtual {v1, v3, v2}, LiT3;->e(Landroid/widget/ImageView;LkZ0;)V

    return-void

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Fit cannot be used with resize."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    :goto_1
    invoke-virtual {p0, v1, v2}, LFI4;->c(J)LqI4;

    move-result-object v7

    invoke-static {v7}, LFi6;->f(LqI4;)Ljava/lang/String;

    move-result-object v9

    iget v1, v0, LFI4;->h:I

    invoke-static {v1}, LTP2;->a(I)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v0, LFI4;->a:LiT3;

    invoke-virtual {v1, v9}, LiT3;->m(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    if-eqz v4, :cond_9

    iget-object v1, v0, LFI4;->a:LiT3;

    invoke-virtual {v1, v3}, LiT3;->c(Landroid/widget/ImageView;)V

    iget-object v1, v0, LFI4;->a:LiT3;

    iget-object v2, v1, LiT3;->d:Landroid/content/Context;

    sget-object v8, LiT3$e;->c:LiT3$e;

    iget-boolean v5, v0, LFI4;->c:Z

    iget-boolean v6, v1, LiT3;->l:Z

    move-object/from16 v1, p1

    move-object v3, v4

    move-object v4, v8

    invoke-static/range {v1 .. v6}, LjT3;->c(Landroid/widget/ImageView;Landroid/content/Context;Landroid/graphics/Bitmap;LiT3$e;ZZ)V

    iget-object v1, v0, LFI4;->a:LiT3;

    iget-boolean v1, v1, LiT3;->m:Z

    if-eqz v1, :cond_7

    invoke-virtual {v7}, LqI4;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Main"

    const-string v4, "completed"

    invoke-static {v3, v4, v1, v2}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    if-eqz v11, :cond_8

    invoke-interface/range {p2 .. p2}, LI80;->onSuccess()V

    :cond_8
    return-void

    :cond_9
    iget-boolean v1, v0, LFI4;->e:Z

    if-eqz v1, :cond_a

    invoke-virtual {p0}, LFI4;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v3, v1}, LjT3;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    :cond_a
    new-instance v13, LwY1;

    iget-object v2, v0, LFI4;->a:LiT3;

    iget v5, v0, LFI4;->h:I

    iget v6, v0, LFI4;->i:I

    iget v8, v0, LFI4;->g:I

    iget-object v10, v0, LFI4;->k:Landroid/graphics/drawable/Drawable;

    iget-object v12, v0, LFI4;->l:Ljava/lang/Object;

    iget-boolean v14, v0, LFI4;->c:Z

    move-object v1, v13

    move-object/from16 v3, p1

    move-object v4, v7

    move v7, v8

    move-object v8, v10

    move-object v10, v12

    move-object/from16 v11, p2

    move v12, v14

    invoke-direct/range {v1 .. v12}, LwY1;-><init>(LiT3;Landroid/widget/ImageView;LqI4;IIILandroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Object;LI80;Z)V

    iget-object v1, v0, LFI4;->a:LiT3;

    invoke-virtual {v1, v13}, LiT3;->g(Lz2;)V

    return-void

    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Target must not be null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public i()LFI4;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LFI4;->c:Z

    return-object p0
.end method

.method public j()LFI4;
    .locals 2

    iget v0, p0, LFI4;->f:I

    if-nez v0, :cond_1

    iget-object v0, p0, LFI4;->j:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LFI4;->e:Z

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Placeholder image already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Placeholder resource already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k(II)LFI4;
    .locals 1

    iget-object v0, p0, LFI4;->b:LqI4$b;

    invoke-virtual {v0, p1, p2}, LqI4$b;->e(II)LqI4$b;

    return-object p0
.end method

.method public l(Lq96;)LFI4;
    .locals 1

    iget-object v0, p0, LFI4;->b:LqI4$b;

    invoke-virtual {v0, p1}, LqI4$b;->f(Lq96;)LqI4$b;

    return-object p0
.end method

.method public m()LFI4;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LFI4;->d:Z

    return-object p0
.end method

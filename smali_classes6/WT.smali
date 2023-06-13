.class public LWT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final u:Ljava/lang/Object;

.field public static final v:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/StringBuilder;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final x:LPI4;


# instance fields
.field public final b:I

.field public final c:LiT3;

.field public final d:LQ41;

.field public final e:La80;

.field public final f:LlQ5;

.field public final g:Ljava/lang/String;

.field public final h:LqI4;

.field public final i:I

.field public j:I

.field public final k:LPI4;

.field public l:Lz2;

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz2;",
            ">;"
        }
    .end annotation
.end field

.field public n:Landroid/graphics/Bitmap;

.field public o:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field public p:LiT3$e;

.field public q:Ljava/lang/Exception;

.field public r:I

.field public s:I

.field public t:LiT3$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LWT;->u:Ljava/lang/Object;

    new-instance v0, LWT$a;

    invoke-direct {v0}, LWT$a;-><init>()V

    sput-object v0, LWT;->v:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, LWT;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, LWT$b;

    invoke-direct {v0}, LWT$b;-><init>()V

    sput-object v0, LWT;->x:LPI4;

    return-void
.end method

.method public constructor <init>(LiT3;LQ41;La80;LlQ5;Lz2;LPI4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LWT;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iput v0, p0, LWT;->b:I

    iput-object p1, p0, LWT;->c:LiT3;

    iput-object p2, p0, LWT;->d:LQ41;

    iput-object p3, p0, LWT;->e:La80;

    iput-object p4, p0, LWT;->f:LlQ5;

    iput-object p5, p0, LWT;->l:Lz2;

    invoke-virtual {p5}, Lz2;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LWT;->g:Ljava/lang/String;

    invoke-virtual {p5}, Lz2;->i()LqI4;

    move-result-object p1

    iput-object p1, p0, LWT;->h:LqI4;

    invoke-virtual {p5}, Lz2;->h()LiT3$f;

    move-result-object p1

    iput-object p1, p0, LWT;->t:LiT3$f;

    invoke-virtual {p5}, Lz2;->e()I

    move-result p1

    iput p1, p0, LWT;->i:I

    invoke-virtual {p5}, Lz2;->f()I

    move-result p1

    iput p1, p0, LWT;->j:I

    iput-object p6, p0, LWT;->k:LPI4;

    invoke-virtual {p6}, LPI4;->e()I

    move-result p1

    iput p1, p0, LWT;->s:I

    return-void
.end method

.method public static a(Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lq96;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq96;

    const/4 v3, 0x0

    :try_start_0
    invoke-interface {v2, p1}, Lq96;->transform(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v4, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Transformation "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Lq96;->key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " returned null after "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " previous transformation(s).\n\nTransformation list:\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq96;

    invoke-interface {v0}, Lq96;->key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    sget-object p0, LiT3;->o:Landroid/os/Handler;

    new-instance v0, LWT$d;

    invoke-direct {v0, p1}, LWT$d;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v3

    :cond_1
    if-ne v4, p1, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object p0, LiT3;->o:Landroid/os/Handler;

    new-instance p1, LWT$e;

    invoke-direct {p1, v2}, LWT$e;-><init>(Lq96;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v3

    :cond_2
    if-eq v4, p1, :cond_3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p1

    if-nez p1, :cond_3

    sget-object p0, LiT3;->o:Landroid/os/Handler;

    new-instance p1, LWT$f;

    invoke-direct {p1, v2}, LWT$f;-><init>(Lq96;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    move-object p1, v4

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object p1, LiT3;->o:Landroid/os/Handler;

    new-instance v0, LWT$c;

    invoke-direct {v0, v2, p0}, LWT$c;-><init>(Lq96;Ljava/lang/RuntimeException;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v3

    :cond_4
    return-object p1
.end method

.method public static e(LAN5;LqI4;)Landroid/graphics/Bitmap;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0}, LOe3;->d(LAN5;)Lo30;

    move-result-object p0

    invoke-static {p0}, LFi6;->r(Lo30;)Z

    move-result v0

    iget-boolean v1, p1, LqI4;->r:Z

    invoke-static {p1}, LPI4;->d(LqI4;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v1

    invoke-static {v1}, LPI4;->g(Landroid/graphics/BitmapFactory$Options;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v0, :cond_2

    invoke-interface {p0}, Lo30;->w3()Ljava/io/InputStream;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz v2, :cond_0

    new-instance v2, LeM2;

    invoke-direct {v2, p0}, LeM2;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v2, v3}, LeM2;->a(Z)V

    const/16 p0, 0x400

    invoke-virtual {v2, p0}, LeM2;->c(I)J

    move-result-wide v3

    invoke-static {v2, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget p0, p1, LqI4;->h:I

    iget v5, p1, LqI4;->i:I

    invoke-static {p0, v5, v1, p1}, LPI4;->b(IILandroid/graphics/BitmapFactory$Options;LqI4;)V

    invoke-virtual {v2, v3, v4}, LeM2;->b(J)V

    const/4 p0, 0x1

    invoke-virtual {v2, p0}, LeM2;->a(Z)V

    move-object p0, v2

    :cond_0
    invoke-static {p0, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Failed to decode stream."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-interface {p0}, Lo30;->L0()[B

    move-result-object p0

    if-eqz v2, :cond_3

    array-length v0, p0

    invoke-static {p0, v3, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v0, p1, LqI4;->h:I

    iget v2, p1, LqI4;->i:I

    invoke-static {v0, v2, v1, p1}, LPI4;->b(IILandroid/graphics/BitmapFactory$Options;LqI4;)V

    :cond_3
    array-length p1, p0

    invoke-static {p0, v3, p1, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static g(LiT3;LQ41;La80;LlQ5;Lz2;)LWT;
    .locals 12

    invoke-virtual/range {p4 .. p4}, Lz2;->i()LqI4;

    move-result-object v0

    invoke-virtual {p0}, LiT3;->i()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, LPI4;

    invoke-virtual {v11, v0}, LPI4;->c(LqI4;)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v0, LWT;

    move-object v5, v0

    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    invoke-direct/range {v5 .. v11}, LWT;-><init>(LiT3;LQ41;La80;LlQ5;Lz2;LPI4;)V

    return-object v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, LWT;

    sget-object v10, LWT;->x:LPI4;

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    invoke-direct/range {v4 .. v10}, LWT;-><init>(LiT3;LQ41;La80;LlQ5;Lz2;LPI4;)V

    return-object v0
.end method

.method public static l(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    goto :goto_0

    :pswitch_0
    const/16 p0, 0x10e

    goto :goto_0

    :pswitch_1
    const/16 p0, 0x5a

    goto :goto_0

    :pswitch_2
    const/16 p0, 0xb4

    :goto_0
    return p0

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static m(I)I
    .locals 1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 v0, 0x7

    if-eq p0, v0, :cond_0

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method public static v(ZIIII)Z
    .locals 0

    if-eqz p0, :cond_2

    if-eqz p3, :cond_0

    if-gt p1, p3, :cond_2

    :cond_0
    if-eqz p4, :cond_1

    if-le p2, p4, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static y(LqI4;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 26

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget-boolean v3, v0, LqI4;->m:Z

    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual/range {p0 .. p0}, LqI4;->e()Z

    move-result v4

    if-nez v4, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move v3, v1

    move v5, v2

    move-object v0, v9

    goto/16 :goto_c

    :cond_1
    :goto_0
    iget v4, v0, LqI4;->h:I

    iget v6, v0, LqI4;->i:I

    iget v7, v0, LqI4;->n:F

    const/4 v8, 0x0

    cmpl-float v8, v7, v8

    if-eqz v8, :cond_3

    float-to-double v10, v7

    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    iget-boolean v4, v0, LqI4;->q:Z

    if-eqz v4, :cond_2

    iget v4, v0, LqI4;->o:F

    iget v6, v0, LqI4;->p:F

    invoke-virtual {v9, v7, v4, v6}, Landroid/graphics/Matrix;->setRotate(FFF)V

    iget v4, v0, LqI4;->o:F

    float-to-double v6, v4

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v14, v12

    mul-double/2addr v6, v14

    iget v8, v0, LqI4;->p:F

    move/from16 v16, v2

    move/from16 v17, v3

    float-to-double v2, v8

    mul-double/2addr v2, v10

    add-double/2addr v6, v2

    float-to-double v2, v8

    mul-double/2addr v2, v14

    float-to-double v14, v4

    mul-double/2addr v14, v10

    sub-double/2addr v2, v14

    iget v4, v0, LqI4;->h:I

    int-to-double v14, v4

    mul-double/2addr v14, v12

    add-double/2addr v14, v6

    move-wide/from16 v18, v6

    int-to-double v5, v4

    mul-double/2addr v5, v10

    add-double/2addr v5, v2

    move-object/from16 v20, v9

    int-to-double v8, v4

    mul-double/2addr v8, v12

    add-double v7, v18, v8

    iget v9, v0, LqI4;->i:I

    move/from16 v22, v1

    int-to-double v0, v9

    mul-double/2addr v0, v10

    sub-double/2addr v7, v0

    int-to-double v0, v4

    mul-double/2addr v0, v10

    add-double/2addr v0, v2

    move-wide/from16 v23, v5

    int-to-double v4, v9

    mul-double/2addr v4, v12

    add-double/2addr v0, v4

    int-to-double v4, v9

    mul-double/2addr v4, v10

    sub-double v4, v18, v4

    int-to-double v9, v9

    mul-double/2addr v9, v12

    add-double/2addr v9, v2

    move-wide/from16 v11, v18

    move-wide/from16 v18, v9

    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->min(DD)D

    move-result-wide v11

    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->min(DD)D

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    move-wide/from16 v6, v23

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v11

    invoke-static {v0, v1, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v11

    move-wide/from16 v13, v18

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v11

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    invoke-static {v13, v14, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    sub-double/2addr v9, v4

    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v4, v2

    sub-double/2addr v11, v0

    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v6, v0

    move-object/from16 v0, v20

    goto/16 :goto_1

    :cond_2
    move/from16 v22, v1

    move/from16 v16, v2

    move/from16 v17, v3

    move-object v0, v9

    invoke-virtual {v0, v7}, Landroid/graphics/Matrix;->setRotate(F)V

    move-object/from16 v1, p0

    iget v2, v1, LqI4;->h:I

    int-to-double v3, v2

    mul-double/2addr v3, v12

    int-to-double v5, v2

    mul-double/2addr v5, v10

    int-to-double v7, v2

    mul-double/2addr v7, v12

    iget v9, v1, LqI4;->i:I

    int-to-double v14, v9

    mul-double/2addr v14, v10

    sub-double/2addr v7, v14

    int-to-double v14, v2

    mul-double/2addr v14, v10

    int-to-double v1, v9

    mul-double/2addr v1, v12

    add-double/2addr v14, v1

    int-to-double v1, v9

    mul-double/2addr v1, v10

    neg-double v1, v1

    int-to-double v9, v9

    mul-double/2addr v9, v12

    const-wide/16 v11, 0x0

    move-wide/from16 v18, v9

    invoke-static {v11, v12, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    invoke-static {v1, v2, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    invoke-static {v11, v12, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v3

    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    invoke-static {v11, v12, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    move-wide/from16 v7, v18

    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    invoke-static {v11, v12, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    invoke-static {v14, v15, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    sub-double/2addr v9, v1

    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    sub-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v6, v2

    move v4, v1

    goto :goto_1

    :cond_3
    move/from16 v22, v1

    move/from16 v16, v2

    move/from16 v17, v3

    move-object v0, v9

    :goto_1
    if-eqz p2, :cond_6

    invoke-static/range {p2 .. p2}, LWT;->l(I)I

    move-result v1

    invoke-static/range {p2 .. p2}, LWT;->m(I)I

    move-result v2

    if-eqz v1, :cond_5

    int-to-float v3, v1

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->preRotate(F)Z

    const/16 v3, 0x5a

    if-eq v1, v3, :cond_4

    const/16 v3, 0x10e

    if-ne v1, v3, :cond_5

    :cond_4
    move/from16 v25, v6

    move v6, v4

    move/from16 v4, v25

    :cond_5
    const/4 v1, 0x1

    if-eq v2, v1, :cond_6

    int-to-float v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    :cond_6
    move-object/from16 v1, p0

    iget-boolean v2, v1, LqI4;->j:Z

    if-eqz v2, :cond_10

    if-eqz v4, :cond_7

    int-to-float v2, v4

    move/from16 v3, v22

    int-to-float v5, v3

    div-float/2addr v2, v5

    move/from16 v5, v16

    goto :goto_2

    :cond_7
    move/from16 v3, v22

    int-to-float v2, v6

    move/from16 v5, v16

    int-to-float v7, v5

    div-float/2addr v2, v7

    :goto_2
    if-eqz v6, :cond_8

    int-to-float v7, v6

    int-to-float v8, v5

    goto :goto_3

    :cond_8
    int-to-float v7, v4

    int-to-float v8, v3

    :goto_3
    div-float/2addr v7, v8

    cmpl-float v8, v2, v7

    if-lez v8, :cond_b

    int-to-float v8, v5

    div-float/2addr v7, v2

    mul-float/2addr v8, v7

    float-to-double v7, v8

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-int v7, v7

    iget v1, v1, LqI4;->k:I

    and-int/lit8 v8, v1, 0x30

    const/16 v9, 0x30

    if-ne v8, v9, :cond_9

    const/4 v1, 0x0

    goto :goto_4

    :cond_9
    const/16 v8, 0x50

    and-int/2addr v1, v8

    if-ne v1, v8, :cond_a

    sub-int v1, v5, v7

    goto :goto_4

    :cond_a
    sub-int v1, v5, v7

    div-int/lit8 v1, v1, 0x2

    :goto_4
    int-to-float v8, v6

    int-to-float v9, v7

    div-float/2addr v8, v9

    move v9, v7

    move/from16 v10, v17

    const/16 v21, 0x0

    move v7, v1

    move v1, v3

    goto :goto_6

    :cond_b
    cmpg-float v8, v2, v7

    if-gez v8, :cond_e

    int-to-float v8, v3

    div-float/2addr v2, v7

    mul-float/2addr v8, v2

    float-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v2, v8

    iget v1, v1, LqI4;->k:I

    and-int/lit8 v8, v1, 0x3

    const/4 v9, 0x3

    if-ne v8, v9, :cond_c

    const/4 v1, 0x0

    goto :goto_5

    :cond_c
    const/4 v8, 0x5

    and-int/2addr v1, v8

    if-ne v1, v8, :cond_d

    sub-int v1, v3, v2

    goto :goto_5

    :cond_d
    sub-int v1, v3, v2

    div-int/lit8 v1, v1, 0x2

    :goto_5
    int-to-float v8, v4

    int-to-float v9, v2

    div-float/2addr v8, v9

    move/from16 v21, v1

    move v1, v2

    move v9, v5

    move v2, v8

    move/from16 v10, v17

    move v8, v7

    const/4 v7, 0x0

    goto :goto_6

    :cond_e
    move v1, v3

    move v9, v5

    move v2, v7

    move v8, v2

    move/from16 v10, v17

    const/4 v7, 0x0

    const/16 v21, 0x0

    :goto_6
    invoke-static {v10, v3, v5, v4, v6}, LWT;->v(ZIIII)Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-virtual {v0, v2, v8}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_f
    move v6, v7

    move v8, v9

    move/from16 v5, v21

    move v7, v1

    goto :goto_d

    :cond_10
    move/from16 v5, v16

    move/from16 v10, v17

    move/from16 v3, v22

    iget-boolean v1, v1, LqI4;->l:Z

    if-eqz v1, :cond_14

    if-eqz v4, :cond_11

    int-to-float v1, v4

    int-to-float v2, v3

    goto :goto_7

    :cond_11
    int-to-float v1, v6

    int-to-float v2, v5

    :goto_7
    div-float/2addr v1, v2

    if-eqz v6, :cond_12

    int-to-float v2, v6

    int-to-float v7, v5

    goto :goto_8

    :cond_12
    int-to-float v2, v4

    int-to-float v7, v3

    :goto_8
    div-float/2addr v2, v7

    cmpg-float v7, v1, v2

    if-gez v7, :cond_13

    goto :goto_9

    :cond_13
    move v1, v2

    :goto_9
    invoke-static {v10, v3, v5, v4, v6}, LWT;->v(ZIIII)Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    goto :goto_c

    :cond_14
    if-nez v4, :cond_15

    if-eqz v6, :cond_19

    :cond_15
    if-ne v4, v3, :cond_16

    if-eq v6, v5, :cond_19

    :cond_16
    if-eqz v4, :cond_17

    int-to-float v1, v4

    int-to-float v2, v3

    goto :goto_a

    :cond_17
    int-to-float v1, v6

    int-to-float v2, v5

    :goto_a
    div-float/2addr v1, v2

    if-eqz v6, :cond_18

    int-to-float v2, v6

    int-to-float v7, v5

    goto :goto_b

    :cond_18
    int-to-float v2, v4

    int-to-float v7, v3

    :goto_b
    div-float/2addr v2, v7

    invoke-static {v10, v3, v5, v4, v6}, LWT;->v(ZIIII)Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_19
    :goto_c
    move v7, v3

    move v8, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_d
    const/4 v10, 0x1

    move-object/from16 v4, p1

    move-object v9, v0

    invoke-static/range {v4 .. v10}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_1a

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_e

    :cond_1a
    move-object v0, v1

    :goto_e
    return-object v0
.end method

.method public static z(LqI4;)V
    .locals 3

    invoke-virtual {p0}, LqI4;->a()Ljava/lang/String;

    move-result-object p0

    sget-object v0, LWT;->v:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x8

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->ensureCapacity(I)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {v0, v2, v1, p0}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Lz2;)V
    .locals 7

    iget-object v0, p0, LWT;->c:LiT3;

    iget-boolean v0, v0, LiT3;->m:Z

    iget-object v1, p1, Lz2;->b:LqI4;

    iget-object v2, p0, LWT;->l:Lz2;

    const-string v3, "to "

    const-string v4, "joined"

    const-string v5, "Hunter"

    if-nez v2, :cond_3

    iput-object p1, p0, LWT;->l:Lz2;

    if-eqz v0, :cond_2

    iget-object p1, p0, LWT;->m:Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LqI4;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v3}, LFi6;->k(LWT;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v4, p1, v0}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, LqI4;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "to empty hunter"

    invoke-static {v5, v4, p1, v0}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void

    :cond_3
    iget-object v2, p0, LWT;->m:Ljava/util/List;

    if-nez v2, :cond_4

    new-instance v2, Ljava/util/ArrayList;

    const/4 v6, 0x3

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, LWT;->m:Ljava/util/List;

    :cond_4
    iget-object v2, p0, LWT;->m:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_5

    invoke-virtual {v1}, LqI4;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v3}, LFi6;->k(LWT;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v4, v0, v1}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p1}, Lz2;->h()LiT3$f;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, LWT;->t:LiT3$f;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-le v0, v1, :cond_6

    iput-object p1, p0, LWT;->t:LiT3$f;

    :cond_6
    return-void
.end method

.method public c()Z
    .locals 2

    iget-object v0, p0, LWT;->l:Lz2;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, LWT;->m:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, LWT;->o:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final d()LiT3$f;
    .locals 6

    sget-object v0, LiT3$f;->b:LiT3$f;

    iget-object v1, p0, LWT;->m:Ljava/util/List;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iget-object v4, p0, LWT;->l:Lz2;

    if-nez v4, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :cond_2
    :goto_1
    if-nez v2, :cond_3

    return-object v0

    :cond_3
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lz2;->h()LiT3$f;

    move-result-object v0

    :cond_4
    if-eqz v1, :cond_6

    iget-object v1, p0, LWT;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_2
    if-ge v3, v1, :cond_6

    iget-object v2, p0, LWT;->m:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz2;

    invoke-virtual {v2}, Lz2;->h()LiT3$f;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-le v4, v5, :cond_5

    move-object v0, v2

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    return-object v0
.end method

.method public f(Lz2;)V
    .locals 3

    iget-object v0, p0, LWT;->l:Lz2;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LWT;->l:Lz2;

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LWT;->m:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lz2;->h()LiT3$f;

    move-result-object v0

    iget-object v1, p0, LWT;->t:LiT3$f;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, LWT;->d()LiT3$f;

    move-result-object v0

    iput-object v0, p0, LWT;->t:LiT3$f;

    :cond_2
    iget-object v0, p0, LWT;->c:LiT3;

    iget-boolean v0, v0, LiT3;->m:Z

    if-eqz v0, :cond_3

    iget-object p1, p1, Lz2;->b:LqI4;

    invoke-virtual {p1}, LqI4;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "from "

    invoke-static {p0, v0}, LFi6;->k(LWT;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Hunter"

    const-string v2, "removed"

    invoke-static {v1, v2, p1, v0}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public h()Lz2;
    .locals 1

    iget-object v0, p0, LWT;->l:Lz2;

    return-object v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lz2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LWT;->m:Ljava/util/List;

    return-object v0
.end method

.method public j()LqI4;
    .locals 1

    iget-object v0, p0, LWT;->h:LqI4;

    return-object v0
.end method

.method public k()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, LWT;->q:Ljava/lang/Exception;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LWT;->g:Ljava/lang/String;

    return-object v0
.end method

.method public o()LiT3$e;
    .locals 1

    iget-object v0, p0, LWT;->p:LiT3$e;

    return-object v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, LWT;->i:I

    return v0
.end method

.method public q()LiT3;
    .locals 1

    iget-object v0, p0, LWT;->c:LiT3;

    return-object v0
.end method

.method public r()LiT3$f;
    .locals 1

    iget-object v0, p0, LWT;->t:LiT3$f;

    return-object v0
.end method

.method public run()V
    .locals 5

    const-string v0, "Picasso-Idle"

    :try_start_0
    iget-object v1, p0, LWT;->h:LqI4;

    invoke-static {v1}, LWT;->z(LqI4;)V

    iget-object v1, p0, LWT;->c:LiT3;

    iget-boolean v1, v1, LiT3;->m:Z

    if-eqz v1, :cond_0

    const-string v1, "Hunter"

    const-string v2, "executing"

    invoke-static {p0}, LFi6;->j(LWT;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, LFi6;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LWT;->t()Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, LWT;->n:Landroid/graphics/Bitmap;

    if-nez v1, :cond_1

    iget-object v1, p0, LWT;->d:LQ41;

    invoke-virtual {v1, p0}, LQ41;->e(LWT;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, LWT;->d:LQ41;

    invoke-virtual {v1, p0}, LQ41;->d(LWT;)V
    :try_end_0
    .catch LK73$b; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_1
    iput-object v1, p0, LWT;->q:Ljava/lang/Exception;

    iget-object v1, p0, LWT;->d:LQ41;

    invoke-virtual {v1, p0}, LQ41;->e(LWT;)V

    goto :goto_0

    :catch_1
    move-exception v1

    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    iget-object v3, p0, LWT;->f:LlQ5;

    invoke-virtual {v3}, LlQ5;->a()LmQ5;

    move-result-object v3

    new-instance v4, Ljava/io/PrintWriter;

    invoke-direct {v4, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v3, v4}, LmQ5;->a(Ljava/io/PrintWriter;)V

    new-instance v3, Ljava/lang/RuntimeException;

    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object v3, p0, LWT;->q:Ljava/lang/Exception;

    iget-object v1, p0, LWT;->d:LQ41;

    invoke-virtual {v1, p0}, LQ41;->e(LWT;)V

    goto :goto_0

    :catch_2
    move-exception v1

    iput-object v1, p0, LWT;->q:Ljava/lang/Exception;

    iget-object v1, p0, LWT;->d:LQ41;

    invoke-virtual {v1, p0}, LQ41;->g(LWT;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    goto :goto_1

    :catch_3
    move-exception v1

    :try_start_2
    iget v2, v1, LK73$b;->c:I

    invoke-static {v2}, LJ73;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, v1, LK73$b;->b:I

    const/16 v3, 0x1f8

    if-eq v2, v3, :cond_3

    :cond_2
    iput-object v1, p0, LWT;->q:Ljava/lang/Exception;

    :cond_3
    iget-object v1, p0, LWT;->d:LQ41;

    invoke-virtual {v1, p0}, LQ41;->e(LWT;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v1
.end method

.method public s()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LWT;->n:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public t()Landroid/graphics/Bitmap;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LWT;->i:I

    invoke-static {v0}, LTP2;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LWT;->e:La80;

    iget-object v1, p0, LWT;->g:Ljava/lang/String;

    invoke-interface {v0, v1}, La80;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, LWT;->f:LlQ5;

    invoke-virtual {v1}, LlQ5;->d()V

    sget-object v1, LiT3$e;->c:LiT3$e;

    iput-object v1, p0, LWT;->p:LiT3$e;

    iget-object v1, p0, LWT;->c:LiT3;

    iget-boolean v1, v1, LiT3;->m:Z

    if-eqz v1, :cond_0

    const-string v1, "Hunter"

    const-string v2, "decoded"

    iget-object v3, p0, LWT;->h:LqI4;

    invoke-virtual {v3}, LqI4;->d()Ljava/lang/String;

    move-result-object v3

    const-string v4, "from cache"

    invoke-static {v1, v2, v3, v4}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    iget v1, p0, LWT;->s:I

    if-nez v1, :cond_3

    sget-object v1, LJ73;->e:LJ73;

    iget v1, v1, LJ73;->b:I

    goto :goto_0

    :cond_3
    iget v1, p0, LWT;->j:I

    :goto_0
    iput v1, p0, LWT;->j:I

    iget-object v2, p0, LWT;->k:LPI4;

    iget-object v3, p0, LWT;->h:LqI4;

    invoke-virtual {v2, v3, v1}, LPI4;->f(LqI4;I)LPI4$a;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LPI4$a;->c()LiT3$e;

    move-result-object v0

    iput-object v0, p0, LWT;->p:LiT3$e;

    invoke-virtual {v1}, LPI4$a;->b()I

    move-result v0

    iput v0, p0, LWT;->r:I

    invoke-virtual {v1}, LPI4$a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {v1}, LPI4$a;->d()LAN5;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, LWT;->h:LqI4;

    invoke-static {v0, v1}, LWT;->e(LAN5;LqI4;)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, LAN5;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-object v0, v1

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-interface {v0}, LAN5;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    throw v1

    :cond_4
    :goto_1
    if-eqz v0, :cond_a

    iget-object v1, p0, LWT;->c:LiT3;

    iget-boolean v1, v1, LiT3;->m:Z

    if-eqz v1, :cond_5

    const-string v1, "Hunter"

    const-string v2, "decoded"

    iget-object v3, p0, LWT;->h:LqI4;

    invoke-virtual {v3}, LqI4;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, LFi6;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-object v1, p0, LWT;->f:LlQ5;

    invoke-virtual {v1, v0}, LlQ5;->b(Landroid/graphics/Bitmap;)V

    iget-object v1, p0, LWT;->h:LqI4;

    invoke-virtual {v1}, LqI4;->f()Z

    move-result v1

    if-nez v1, :cond_6

    iget v1, p0, LWT;->r:I

    if-eqz v1, :cond_a

    :cond_6
    sget-object v1, LWT;->u:Ljava/lang/Object;

    monitor-enter v1

    :try_start_3
    iget-object v2, p0, LWT;->h:LqI4;

    invoke-virtual {v2}, LqI4;->e()Z

    move-result v2

    if-nez v2, :cond_7

    iget v2, p0, LWT;->r:I

    if-eqz v2, :cond_8

    :cond_7
    iget-object v2, p0, LWT;->h:LqI4;

    iget v3, p0, LWT;->r:I

    invoke-static {v2, v0, v3}, LWT;->y(LqI4;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v2, p0, LWT;->c:LiT3;

    iget-boolean v2, v2, LiT3;->m:Z

    if-eqz v2, :cond_8

    const-string v2, "Hunter"

    const-string v3, "transformed"

    iget-object v4, p0, LWT;->h:LqI4;

    invoke-virtual {v4}, LqI4;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, LFi6;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    iget-object v2, p0, LWT;->h:LqI4;

    invoke-virtual {v2}, LqI4;->b()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, p0, LWT;->h:LqI4;

    iget-object v2, v2, LqI4;->g:Ljava/util/List;

    invoke-static {v2, v0}, LWT;->a(Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v2, p0, LWT;->c:LiT3;

    iget-boolean v2, v2, LiT3;->m:Z

    if-eqz v2, :cond_9

    const-string v2, "Hunter"

    const-string v3, "transformed"

    iget-object v4, p0, LWT;->h:LqI4;

    invoke-virtual {v4}, LqI4;->d()Ljava/lang/String;

    move-result-object v4

    const-string v5, "from custom transformations"

    invoke-static {v2, v3, v4, v5}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_a

    iget-object v1, p0, LWT;->f:LlQ5;

    invoke-virtual {v1, v0}, LlQ5;->c(Landroid/graphics/Bitmap;)V

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_a
    :goto_2
    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, LWT;->o:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w(ZLandroid/net/NetworkInfo;)Z
    .locals 4

    iget v0, p0, LWT;->s:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-nez v3, :cond_1

    return v2

    :cond_1
    sub-int/2addr v0, v1

    iput v0, p0, LWT;->s:I

    iget-object v0, p0, LWT;->k:LPI4;

    invoke-virtual {v0, p1, p2}, LPI4;->h(ZLandroid/net/NetworkInfo;)Z

    move-result p1

    return p1
.end method

.method public x()Z
    .locals 1

    iget-object v0, p0, LWT;->k:LPI4;

    invoke-virtual {v0}, LPI4;->i()Z

    move-result v0

    return v0
.end method

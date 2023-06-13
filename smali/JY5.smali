.class public abstract LJY5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJY5$a;
    }
.end annotation


# instance fields
.field public a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgf0;

    invoke-direct {v0}, Lgf0;-><init>()V

    invoke-virtual {v0}, Lgf0;->a()I

    move-result v0

    iput v0, p0, LJY5;->a:I

    return-void
.end method

.method public static synthetic a(LJY5;Landroidx/camera/core/ImageCaptureException;)V
    .locals 0

    invoke-direct {p0, p1}, LJY5;->o(Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method

.method public static synthetic b(LJY5;Landroidx/camera/core/h$o;)V
    .locals 0

    invoke-direct {p0, p1}, LJY5;->p(Landroidx/camera/core/h$o;)V

    return-void
.end method

.method public static synthetic c(LJY5;Landroidx/camera/core/i;)V
    .locals 0

    invoke-direct {p0, p1}, LJY5;->q(Landroidx/camera/core/i;)V

    return-void
.end method

.method private synthetic o(Landroidx/camera/core/ImageCaptureException;)V
    .locals 4

    invoke-virtual {p0}, LJY5;->h()Landroidx/camera/core/h$l;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0}, LJY5;->j()Landroidx/camera/core/h$m;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    if-eqz v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {p0}, LJY5;->h()Landroidx/camera/core/h$l;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Landroidx/camera/core/h$l;->b(Landroidx/camera/core/ImageCaptureException;)V

    goto :goto_2

    :cond_2
    if-eqz v1, :cond_3

    if-nez v0, :cond_3

    invoke-virtual {p0}, LJY5;->j()Landroidx/camera/core/h$m;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/h$m;

    invoke-interface {v0, p1}, Landroidx/camera/core/h$m;->b(Landroidx/camera/core/ImageCaptureException;)V

    :goto_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "One and only one callback is allowed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private synthetic p(Landroidx/camera/core/h$o;)V
    .locals 1

    invoke-virtual {p0}, LJY5;->j()Landroidx/camera/core/h$m;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/h$m;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, p1}, Landroidx/camera/core/h$m;->a(Landroidx/camera/core/h$o;)V

    return-void
.end method

.method private synthetic q(Landroidx/camera/core/i;)V
    .locals 1

    invoke-virtual {p0}, LJY5;->h()Landroidx/camera/core/h$l;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Landroidx/camera/core/i;

    invoke-virtual {v0, p1}, Landroidx/camera/core/h$l;->a(Landroidx/camera/core/i;)V

    return-void
.end method

.method public static r(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Landroidx/camera/core/h$m;Landroidx/camera/core/h$n;Landroid/graphics/Rect;Landroid/graphics/Matrix;IIILjava/util/List;)LJY5;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/camera/core/h$l;",
            "Landroidx/camera/core/h$m;",
            "Landroidx/camera/core/h$n;",
            "Landroid/graphics/Rect;",
            "Landroid/graphics/Matrix;",
            "III",
            "Ljava/util/List<",
            "Lpa0;",
            ">;)",
            "LJY5;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-nez p3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-ne v2, v3, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    const-string v3, "onDiskCallback and outputFileOptions should be both null or both non-null."

    invoke-static {v2, v3}, LHZ3;->b(ZLjava/lang/Object;)V

    if-nez p2, :cond_3

    move v2, v0

    goto :goto_3

    :cond_3
    move v2, v1

    :goto_3
    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    move v0, v1

    :goto_4
    xor-int/2addr v0, v2

    const-string v1, "One and only one on-disk or in-memory callback should be present."

    invoke-static {v0, v1}, LHZ3;->b(ZLjava/lang/Object;)V

    new-instance v11, Lou;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lou;-><init>(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Landroidx/camera/core/h$m;Landroidx/camera/core/h$n;Landroid/graphics/Rect;Landroid/graphics/Matrix;IIILjava/util/List;)V

    return-object v11
.end method


# virtual methods
.method public d()Z
    .locals 2

    invoke-static {}, LO36;->a()V

    iget v0, p0, LJY5;->a:I

    if-lez v0, :cond_0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, LJY5;->a:I

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract e()Ljava/util/concurrent/Executor;
.end method

.method public abstract f()I
.end method

.method public abstract g()Landroid/graphics/Rect;
.end method

.method public abstract h()Landroidx/camera/core/h$l;
.end method

.method public abstract i()I
.end method

.method public abstract j()Landroidx/camera/core/h$m;
.end method

.method public abstract k()Landroidx/camera/core/h$n;
.end method

.method public abstract l()I
.end method

.method public abstract m()Landroid/graphics/Matrix;
.end method

.method public abstract n()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpa0;",
            ">;"
        }
    .end annotation
.end method

.method public s(Landroidx/camera/core/ImageCaptureException;)V
    .locals 2

    invoke-virtual {p0}, LJY5;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, LGY5;

    invoke-direct {v1, p0, p1}, LGY5;-><init>(LJY5;Landroidx/camera/core/ImageCaptureException;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public t(Landroidx/camera/core/h$o;)V
    .locals 2

    invoke-virtual {p0}, LJY5;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, LHY5;

    invoke-direct {v1, p0, p1}, LHY5;-><init>(LJY5;Landroidx/camera/core/h$o;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public u(Landroidx/camera/core/i;)V
    .locals 2

    invoke-virtual {p0}, LJY5;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, LIY5;

    invoke-direct {v1, p0, p1}, LIY5;-><init>(LJY5;Landroidx/camera/core/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

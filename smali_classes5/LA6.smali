.class public LLA6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLA6$d;,
        LLA6$a;,
        LLA6$c;,
        LLA6$b;
    }
.end annotation


# static fields
.field public static final s:Liy3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liy3<",
            "LJA6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:LEA6;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LLA6$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LUI4;

.field public final e:LeU;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:LrI4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LrI4<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public j:LLA6$a;

.field public k:Z

.field public l:LLA6$a;

.field public m:Landroid/graphics/Bitmap;

.field public n:Lr96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public o:LLA6$a;

.field public p:I

.field public q:I

.field public r:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy"

    sget-object v1, LJA6;->d:LJA6;

    invoke-static {v0, v1}, Liy3;->f(Ljava/lang/String;Ljava/lang/Object;)Liy3;

    move-result-object v0

    sput-object v0, LLA6;->s:Liy3;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;LEA6;IILr96;Landroid/graphics/Bitmap;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/a;",
            "LEA6;",
            "II",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/bumptech/glide/a;->f()LeU;

    move-result-object v1

    invoke-virtual {p1}, Lcom/bumptech/glide/a;->h()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/a;->t(Landroid/content/Context;)LUI4;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/bumptech/glide/a;->h()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/a;->t(Landroid/content/Context;)LUI4;

    move-result-object p1

    invoke-static {p1, p3, p4}, LLA6;->j(LUI4;II)LrI4;

    move-result-object v5

    move-object v0, p0

    move-object v3, p2

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LLA6;-><init>(LeU;LUI4;LEA6;Landroid/os/Handler;LrI4;Lr96;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public constructor <init>(LeU;LUI4;LEA6;Landroid/os/Handler;LrI4;Lr96;Landroid/graphics/Bitmap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LeU;",
            "LUI4;",
            "LEA6;",
            "Landroid/os/Handler;",
            "LrI4<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LLA6;->c:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, LLA6;->f:Z

    iput-boolean v0, p0, LLA6;->g:Z

    iput-boolean v0, p0, LLA6;->h:Z

    iput-object p2, p0, LLA6;->d:LUI4;

    if-nez p4, :cond_0

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    new-instance v0, LLA6$c;

    invoke-direct {v0, p0}, LLA6$c;-><init>(LLA6;)V

    invoke-direct {p4, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    :cond_0
    iput-object p1, p0, LLA6;->e:LeU;

    iput-object p4, p0, LLA6;->b:Landroid/os/Handler;

    iput-object p5, p0, LLA6;->i:LrI4;

    iput-object p3, p0, LLA6;->a:LEA6;

    invoke-virtual {p0, p6, p7}, LLA6;->p(Lr96;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static j(LUI4;II)LrI4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUI4;",
            "II)",
            "LrI4<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LUI4;->b()LrI4;

    move-result-object p0

    sget-object v0, LB41;->b:LB41;

    invoke-static {v0}, LYI4;->H0(LB41;)LYI4;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LLD;->C0(Z)LLD;

    move-result-object v0

    check-cast v0, LYI4;

    invoke-virtual {v0, v1}, LLD;->x0(Z)LLD;

    move-result-object v0

    check-cast v0, LYI4;

    invoke-virtual {v0, p1, p2}, LLD;->k0(II)LLD;

    move-result-object p1

    invoke-virtual {p0, p1}, LrI4;->G0(LLD;)LrI4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, LLA6;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, LLA6;->o()V

    invoke-virtual {p0}, LLA6;->r()V

    iget-object v0, p0, LLA6;->j:LLA6$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, LLA6;->d:LUI4;

    invoke-virtual {v2, v0}, LUI4;->d(LLY5;)V

    iput-object v1, p0, LLA6;->j:LLA6$a;

    :cond_0
    iget-object v0, p0, LLA6;->l:LLA6$a;

    if-eqz v0, :cond_1

    iget-object v2, p0, LLA6;->d:LUI4;

    invoke-virtual {v2, v0}, LUI4;->d(LLY5;)V

    iput-object v1, p0, LLA6;->l:LLA6$a;

    :cond_1
    iget-object v0, p0, LLA6;->o:LLA6$a;

    if-eqz v0, :cond_2

    iget-object v2, p0, LLA6;->d:LUI4;

    invoke-virtual {v2, v0}, LUI4;->d(LLY5;)V

    iput-object v1, p0, LLA6;->o:LLA6$a;

    :cond_2
    iget-object v0, p0, LLA6;->a:LEA6;

    invoke-virtual {v0}, LEA6;->clear()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LLA6;->k:Z

    return-void
.end method

.method public b()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, LLA6;->a:LEA6;

    invoke-virtual {v0}, LEA6;->getData()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LLA6;->j:LLA6$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LLA6$a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LLA6;->m:Landroid/graphics/Bitmap;

    :goto_0
    return-object v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, LLA6;->j:LLA6$a;

    if-eqz v0, :cond_0

    iget v0, v0, LLA6$a;->f:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LLA6;->m:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, LLA6;->a:LEA6;

    invoke-virtual {v0}, LEA6;->g()I

    move-result v0

    return v0
.end method

.method public final g(I)Lak2;
    .locals 3

    new-instance v0, LLA6$d;

    new-instance v1, LQd3;

    iget-object v2, p0, LLA6;->a:LEA6;

    invoke-direct {v1, v2}, LQd3;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1}, LLA6$d;-><init>(Lak2;I)V

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, LLA6;->r:I

    return v0
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, LLA6;->a:LEA6;

    invoke-virtual {v0}, LEA6;->n()I

    move-result v0

    return v0
.end method

.method public k()I
    .locals 2

    iget-object v0, p0, LLA6;->a:LEA6;

    invoke-virtual {v0}, LEA6;->d()I

    move-result v0

    iget v1, p0, LLA6;->p:I

    add-int/2addr v0, v1

    return v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, LLA6;->q:I

    return v0
.end method

.method public final m()V
    .locals 5

    iget-boolean v0, p0, LLA6;->f:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, LLA6;->g:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, LLA6;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, LLA6;->o:LLA6$a;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const-string v3, "Pending target must be null when starting from the first frame"

    invoke-static {v0, v3}, LzZ3;->a(ZLjava/lang/String;)V

    iget-object v0, p0, LLA6;->a:LEA6;

    invoke-virtual {v0}, LEA6;->b()V

    iput-boolean v2, p0, LLA6;->h:Z

    :cond_2
    iget-object v0, p0, LLA6;->o:LLA6$a;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    iput-object v1, p0, LLA6;->o:LLA6$a;

    invoke-virtual {p0, v0}, LLA6;->n(LLA6$a;)V

    return-void

    :cond_3
    iput-boolean v1, p0, LLA6;->g:Z

    iget-object v0, p0, LLA6;->a:LEA6;

    invoke-virtual {v0}, LEA6;->h()I

    move-result v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    int-to-long v3, v0

    add-long/2addr v1, v3

    iget-object v0, p0, LLA6;->a:LEA6;

    invoke-virtual {v0}, LEA6;->f()V

    iget-object v0, p0, LLA6;->a:LEA6;

    invoke-virtual {v0}, LEA6;->c()I

    move-result v0

    new-instance v3, LLA6$a;

    iget-object v4, p0, LLA6;->b:Landroid/os/Handler;

    invoke-direct {v3, v4, v0, v1, v2}, LLA6$a;-><init>(Landroid/os/Handler;IJ)V

    iput-object v3, p0, LLA6;->l:LLA6$a;

    iget-object v1, p0, LLA6;->a:LEA6;

    invoke-virtual {v1}, LEA6;->l()LJA6;

    move-result-object v1

    invoke-virtual {p0, v0}, LLA6;->g(I)Lak2;

    move-result-object v0

    invoke-static {v0}, LYI4;->J0(Lak2;)LYI4;

    move-result-object v0

    invoke-virtual {v1}, LJA6;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, LLD;->x0(Z)LLD;

    move-result-object v0

    check-cast v0, LYI4;

    iget-object v1, p0, LLA6;->i:LrI4;

    invoke-virtual {v1, v0}, LrI4;->G0(LLD;)LrI4;

    move-result-object v0

    iget-object v1, p0, LLA6;->a:LEA6;

    invoke-virtual {v0, v1}, LrI4;->Z0(Ljava/lang/Object;)LrI4;

    move-result-object v0

    iget-object v1, p0, LLA6;->l:LLA6$a;

    invoke-virtual {v0, v1}, LrI4;->O0(LLY5;)LLY5;

    :cond_4
    :goto_1
    return-void
.end method

.method public n(LLA6$a;)V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, LLA6;->g:Z

    iget-boolean v0, p0, LLA6;->k:Z

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, LLA6;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_0
    iget-boolean v0, p0, LLA6;->f:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, LLA6;->h:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LLA6;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_1
    iput-object p1, p0, LLA6;->o:LLA6$a;

    :goto_0
    return-void

    :cond_2
    invoke-virtual {p1}, LLA6$a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LLA6;->o()V

    iget-object v0, p0, LLA6;->j:LLA6$a;

    iput-object p1, p0, LLA6;->j:LLA6$a;

    iget-object p1, p0, LLA6;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_1
    if-ltz p1, :cond_4

    :try_start_0
    iget-object v2, p0, LLA6;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LLA6$b;

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v2}, LLA6$b;->a()V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    iget-object p1, p0, LLA6;->b:Landroid/os/Handler;

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_5
    invoke-virtual {p0}, LLA6;->m()V

    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, LLA6;->m:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v1, p0, LLA6;->e:LeU;

    invoke-interface {v1, v0}, LeU;->c(Landroid/graphics/Bitmap;)V

    const/4 v0, 0x0

    iput-object v0, p0, LLA6;->m:Landroid/graphics/Bitmap;

    :cond_0
    return-void
.end method

.method public p(Lr96;Landroid/graphics/Bitmap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr96;

    iput-object v0, p0, LLA6;->n:Lr96;

    invoke-static {p2}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, LLA6;->m:Landroid/graphics/Bitmap;

    iget-object v0, p0, LLA6;->i:LrI4;

    new-instance v1, LYI4;

    invoke-direct {v1}, LYI4;-><init>()V

    invoke-virtual {v1, p1}, LLD;->z0(Lr96;)LLD;

    move-result-object p1

    invoke-virtual {v0, p1}, LrI4;->G0(LLD;)LrI4;

    move-result-object p1

    iput-object p1, p0, LLA6;->i:LrI4;

    invoke-static {p2}, Lpi6;->h(Landroid/graphics/Bitmap;)I

    move-result p1

    iput p1, p0, LLA6;->p:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iput p1, p0, LLA6;->q:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, LLA6;->r:I

    return-void
.end method

.method public final q()V
    .locals 1

    iget-boolean v0, p0, LLA6;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LLA6;->f:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LLA6;->k:Z

    invoke-virtual {p0}, LLA6;->m()V

    return-void
.end method

.method public final r()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LLA6;->f:Z

    return-void
.end method

.method public s(LLA6$b;)V
    .locals 2

    iget-boolean v0, p0, LLA6;->k:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LLA6;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LLA6;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    iget-object v1, p0, LLA6;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLA6;->q()V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot subscribe twice in a row"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot subscribe to a cleared frame loader"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(LLA6$b;)V
    .locals 1

    iget-object v0, p0, LLA6;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, LLA6;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LLA6;->r()V

    :cond_0
    return-void
.end method

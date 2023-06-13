.class public LAC1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAC1$a;,
        LAC1$c;,
        LAC1$b;
    }
.end annotation


# instance fields
.field public final a:LtC1;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LAC1$b;",
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

.field public j:LAC1$a;

.field public k:Z

.field public l:LAC1$a;

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

.field public o:LAC1$a;

.field public p:I

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/a;LtC1;IILr96;Landroid/graphics/Bitmap;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/a;",
            "LtC1;",
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

    invoke-static {p1, p3, p4}, LAC1;->i(LUI4;II)LrI4;

    move-result-object v5

    move-object v0, p0

    move-object v3, p2

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LAC1;-><init>(LeU;LUI4;LtC1;Landroid/os/Handler;LrI4;Lr96;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public constructor <init>(LeU;LUI4;LtC1;Landroid/os/Handler;LrI4;Lr96;Landroid/graphics/Bitmap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LeU;",
            "LUI4;",
            "LtC1;",
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

    iput-object v0, p0, LAC1;->c:Ljava/util/List;

    iput-object p2, p0, LAC1;->d:LUI4;

    if-nez p4, :cond_0

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    new-instance v0, LAC1$c;

    invoke-direct {v0, p0}, LAC1$c;-><init>(LAC1;)V

    invoke-direct {p4, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    :cond_0
    iput-object p1, p0, LAC1;->e:LeU;

    iput-object p4, p0, LAC1;->b:Landroid/os/Handler;

    iput-object p5, p0, LAC1;->i:LrI4;

    iput-object p3, p0, LAC1;->a:LtC1;

    invoke-virtual {p0, p6, p7}, LAC1;->o(Lr96;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static g()Lak2;
    .locals 3

    new-instance v0, LQd3;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, LQd3;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static i(LUI4;II)LrI4;
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

    iget-object v0, p0, LAC1;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, LAC1;->n()V

    invoke-virtual {p0}, LAC1;->q()V

    iget-object v0, p0, LAC1;->j:LAC1$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, LAC1;->d:LUI4;

    invoke-virtual {v2, v0}, LUI4;->d(LLY5;)V

    iput-object v1, p0, LAC1;->j:LAC1$a;

    :cond_0
    iget-object v0, p0, LAC1;->l:LAC1$a;

    if-eqz v0, :cond_1

    iget-object v2, p0, LAC1;->d:LUI4;

    invoke-virtual {v2, v0}, LUI4;->d(LLY5;)V

    iput-object v1, p0, LAC1;->l:LAC1$a;

    :cond_1
    iget-object v0, p0, LAC1;->o:LAC1$a;

    if-eqz v0, :cond_2

    iget-object v2, p0, LAC1;->d:LUI4;

    invoke-virtual {v2, v0}, LUI4;->d(LLY5;)V

    iput-object v1, p0, LAC1;->o:LAC1$a;

    :cond_2
    iget-object v0, p0, LAC1;->a:LtC1;

    invoke-interface {v0}, LtC1;->clear()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LAC1;->k:Z

    return-void
.end method

.method public b()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, LAC1;->a:LtC1;

    invoke-interface {v0}, LtC1;->getData()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LAC1;->j:LAC1$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LAC1$a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LAC1;->m:Landroid/graphics/Bitmap;

    :goto_0
    return-object v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, LAC1;->j:LAC1$a;

    if-eqz v0, :cond_0

    iget v0, v0, LAC1$a;->f:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LAC1;->m:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, LAC1;->a:LtC1;

    invoke-interface {v0}, LtC1;->g()I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, LAC1;->r:I

    return v0
.end method

.method public j()I
    .locals 2

    iget-object v0, p0, LAC1;->a:LtC1;

    invoke-interface {v0}, LtC1;->d()I

    move-result v0

    iget v1, p0, LAC1;->p:I

    add-int/2addr v0, v1

    return v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, LAC1;->q:I

    return v0
.end method

.method public final l()V
    .locals 5

    iget-boolean v0, p0, LAC1;->f:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, LAC1;->g:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, LAC1;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, LAC1;->o:LAC1$a;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const-string v3, "Pending target must be null when starting from the first frame"

    invoke-static {v0, v3}, LzZ3;->a(ZLjava/lang/String;)V

    iget-object v0, p0, LAC1;->a:LtC1;

    invoke-interface {v0}, LtC1;->b()V

    iput-boolean v2, p0, LAC1;->h:Z

    :cond_2
    iget-object v0, p0, LAC1;->o:LAC1$a;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    iput-object v1, p0, LAC1;->o:LAC1$a;

    invoke-virtual {p0, v0}, LAC1;->m(LAC1$a;)V

    return-void

    :cond_3
    iput-boolean v1, p0, LAC1;->g:Z

    iget-object v0, p0, LAC1;->a:LtC1;

    invoke-interface {v0}, LtC1;->h()I

    move-result v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    int-to-long v3, v0

    add-long/2addr v1, v3

    iget-object v0, p0, LAC1;->a:LtC1;

    invoke-interface {v0}, LtC1;->f()V

    new-instance v0, LAC1$a;

    iget-object v3, p0, LAC1;->b:Landroid/os/Handler;

    iget-object v4, p0, LAC1;->a:LtC1;

    invoke-interface {v4}, LtC1;->c()I

    move-result v4

    invoke-direct {v0, v3, v4, v1, v2}, LAC1$a;-><init>(Landroid/os/Handler;IJ)V

    iput-object v0, p0, LAC1;->l:LAC1$a;

    iget-object v0, p0, LAC1;->i:LrI4;

    invoke-static {}, LAC1;->g()Lak2;

    move-result-object v1

    invoke-static {v1}, LYI4;->J0(Lak2;)LYI4;

    move-result-object v1

    invoke-virtual {v0, v1}, LrI4;->G0(LLD;)LrI4;

    move-result-object v0

    iget-object v1, p0, LAC1;->a:LtC1;

    invoke-virtual {v0, v1}, LrI4;->Z0(Ljava/lang/Object;)LrI4;

    move-result-object v0

    iget-object v1, p0, LAC1;->l:LAC1$a;

    invoke-virtual {v0, v1}, LrI4;->O0(LLY5;)LLY5;

    :cond_4
    :goto_1
    return-void
.end method

.method public m(LAC1$a;)V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, LAC1;->g:Z

    iget-boolean v0, p0, LAC1;->k:Z

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, LAC1;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_0
    iget-boolean v0, p0, LAC1;->f:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, LAC1;->h:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LAC1;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_1
    iput-object p1, p0, LAC1;->o:LAC1$a;

    :goto_0
    return-void

    :cond_2
    invoke-virtual {p1}, LAC1$a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LAC1;->n()V

    iget-object v0, p0, LAC1;->j:LAC1$a;

    iput-object p1, p0, LAC1;->j:LAC1$a;

    iget-object p1, p0, LAC1;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_1
    if-ltz p1, :cond_3

    iget-object v2, p0, LAC1;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LAC1$b;

    invoke-interface {v2}, LAC1$b;->a()V

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_3
    if-eqz v0, :cond_4

    iget-object p1, p0, LAC1;->b:Landroid/os/Handler;

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_4
    invoke-virtual {p0}, LAC1;->l()V

    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, LAC1;->m:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v1, p0, LAC1;->e:LeU;

    invoke-interface {v1, v0}, LeU;->c(Landroid/graphics/Bitmap;)V

    const/4 v0, 0x0

    iput-object v0, p0, LAC1;->m:Landroid/graphics/Bitmap;

    :cond_0
    return-void
.end method

.method public o(Lr96;Landroid/graphics/Bitmap;)V
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

    iput-object v0, p0, LAC1;->n:Lr96;

    invoke-static {p2}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, LAC1;->m:Landroid/graphics/Bitmap;

    iget-object v0, p0, LAC1;->i:LrI4;

    new-instance v1, LYI4;

    invoke-direct {v1}, LYI4;-><init>()V

    invoke-virtual {v1, p1}, LLD;->z0(Lr96;)LLD;

    move-result-object p1

    invoke-virtual {v0, p1}, LrI4;->G0(LLD;)LrI4;

    move-result-object p1

    iput-object p1, p0, LAC1;->i:LrI4;

    invoke-static {p2}, Lpi6;->h(Landroid/graphics/Bitmap;)I

    move-result p1

    iput p1, p0, LAC1;->p:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iput p1, p0, LAC1;->q:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, LAC1;->r:I

    return-void
.end method

.method public final p()V
    .locals 1

    iget-boolean v0, p0, LAC1;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LAC1;->f:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LAC1;->k:Z

    invoke-virtual {p0}, LAC1;->l()V

    return-void
.end method

.method public final q()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LAC1;->f:Z

    return-void
.end method

.method public r(LAC1$b;)V
    .locals 2

    iget-boolean v0, p0, LAC1;->k:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LAC1;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LAC1;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    iget-object v1, p0, LAC1;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LAC1;->p()V

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

.method public s(LAC1$b;)V
    .locals 1

    iget-object v0, p0, LAC1;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, LAC1;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LAC1;->q()V

    :cond_0
    return-void
.end method

.class public LlQ5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LlQ5$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/os/HandlerThread;

.field public final b:La80;

.field public final c:Landroid/os/Handler;

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:J

.field public j:J

.field public k:J

.field public l:I

.field public m:I

.field public n:I


# direct methods
.method public constructor <init>(La80;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlQ5;->b:La80;

    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "Picasso-Stats"

    const/16 v1, 0xa

    invoke-direct {p1, v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, LlQ5;->a:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, LFi6;->h(Landroid/os/Looper;)V

    new-instance v0, LlQ5$a;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p1, p0}, LlQ5$a;-><init>(Landroid/os/Looper;LlQ5;)V

    iput-object v0, p0, LlQ5;->c:Landroid/os/Handler;

    return-void
.end method

.method public static g(IJ)J
    .locals 2

    int-to-long v0, p0

    div-long/2addr p1, v0

    return-wide p1
.end method


# virtual methods
.method public a()LmQ5;
    .locals 28

    move-object/from16 v0, p0

    new-instance v25, LmQ5;

    move-object/from16 v1, v25

    iget-object v2, v0, LlQ5;->b:La80;

    invoke-interface {v2}, La80;->a()I

    move-result v2

    iget-object v3, v0, LlQ5;->b:La80;

    invoke-interface {v3}, La80;->size()I

    move-result v3

    iget-wide v4, v0, LlQ5;->d:J

    iget-wide v6, v0, LlQ5;->e:J

    iget-wide v8, v0, LlQ5;->f:J

    iget-wide v10, v0, LlQ5;->g:J

    iget-wide v12, v0, LlQ5;->h:J

    iget-wide v14, v0, LlQ5;->i:J

    move-object/from16 v26, v1

    move/from16 v27, v2

    iget-wide v1, v0, LlQ5;->j:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, LlQ5;->k:J

    move-wide/from16 v18, v1

    iget v1, v0, LlQ5;->l:I

    move/from16 v20, v1

    iget v1, v0, LlQ5;->m:I

    move/from16 v21, v1

    iget v1, v0, LlQ5;->n:I

    move/from16 v22, v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v23

    move-object/from16 v1, v26

    move/from16 v2, v27

    invoke-direct/range {v1 .. v24}, LmQ5;-><init>(IIJJJJJJJJIIIJ)V

    return-object v25
.end method

.method public b(Landroid/graphics/Bitmap;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, LlQ5;->m(Landroid/graphics/Bitmap;I)V

    return-void
.end method

.method public c(Landroid/graphics/Bitmap;)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, LlQ5;->m(Landroid/graphics/Bitmap;I)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, LlQ5;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, LlQ5;->c:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public f(J)V
    .locals 2

    iget-object v0, p0, LlQ5;->c:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public h(J)V
    .locals 3

    iget v0, p0, LlQ5;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LlQ5;->m:I

    iget-wide v1, p0, LlQ5;->g:J

    add-long/2addr v1, p1

    iput-wide v1, p0, LlQ5;->g:J

    invoke-static {v0, v1, v2}, LlQ5;->g(IJ)J

    move-result-wide p1

    iput-wide p1, p0, LlQ5;->j:J

    return-void
.end method

.method public i(J)V
    .locals 2

    iget v0, p0, LlQ5;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LlQ5;->n:I

    iget-wide v0, p0, LlQ5;->h:J

    add-long/2addr v0, p1

    iput-wide v0, p0, LlQ5;->h:J

    iget p1, p0, LlQ5;->m:I

    invoke-static {p1, v0, v1}, LlQ5;->g(IJ)J

    move-result-wide p1

    iput-wide p1, p0, LlQ5;->k:J

    return-void
.end method

.method public j()V
    .locals 4

    iget-wide v0, p0, LlQ5;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, LlQ5;->d:J

    return-void
.end method

.method public k()V
    .locals 4

    iget-wide v0, p0, LlQ5;->e:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, LlQ5;->e:J

    return-void
.end method

.method public l(Ljava/lang/Long;)V
    .locals 4

    iget v0, p0, LlQ5;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LlQ5;->l:I

    iget-wide v0, p0, LlQ5;->f:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LlQ5;->f:J

    iget p1, p0, LlQ5;->l:I

    invoke-static {p1, v0, v1}, LlQ5;->g(IJ)J

    move-result-wide v0

    iput-wide v0, p0, LlQ5;->i:J

    return-void
.end method

.method public final m(Landroid/graphics/Bitmap;I)V
    .locals 2

    invoke-static {p1}, LFi6;->i(Landroid/graphics/Bitmap;)I

    move-result p1

    iget-object v0, p0, LlQ5;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

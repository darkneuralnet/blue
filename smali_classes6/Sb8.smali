.class public final LSb8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:LFc8;


# direct methods
.method public constructor <init>(LFc8;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LSb8;->g:LFc8;

    iput p2, p0, LSb8;->b:I

    iput-object p3, p0, LSb8;->c:Ljava/lang/String;

    iput-object p4, p0, LSb8;->d:Ljava/lang/Object;

    iput-object p5, p0, LSb8;->e:Ljava/lang/Object;

    iput-object p6, p0, LSb8;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, LSb8;->g:LFc8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    invoke-virtual {v0}, LBs8;->k()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, LSb8;->g:LFc8;

    invoke-static {v1}, LFc8;->l(LFc8;)C

    move-result v2

    if-nez v2, :cond_1

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->w()Lgl7;

    move-result-object v1

    invoke-virtual {v1}, Lgl7;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LSb8;->g:LFc8;

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->C()LFg7;

    const/16 v2, 0x43

    invoke-static {v1, v2}, LFc8;->F(LFc8;C)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, LSb8;->g:LFc8;

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->C()LFg7;

    const/16 v2, 0x63

    invoke-static {v1, v2}, LFc8;->F(LFc8;C)V

    :cond_1
    :goto_0
    iget-object v1, p0, LSb8;->g:LFc8;

    invoke-static {v1}, LFc8;->m(LFc8;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gez v2, :cond_2

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    move-result-object v2

    invoke-virtual {v2}, Lgl7;->n()J

    const-wide/32 v2, 0x12cc8

    invoke-static {v1, v2, v3}, LFc8;->E(LFc8;J)V

    :cond_2
    iget v1, p0, LSb8;->b:I

    const-string v2, "01VDIWEA?"

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    iget-object v2, p0, LSb8;->g:LFc8;

    invoke-static {v2}, LFc8;->l(LFc8;)C

    move-result v3

    invoke-static {v2}, LFc8;->m(LFc8;)J

    move-result-wide v4

    iget-object v2, p0, LSb8;->c:Ljava/lang/String;

    iget-object v6, p0, LSb8;->d:Ljava/lang/Object;

    iget-object v7, p0, LSb8;->e:Ljava/lang/Object;

    iget-object v8, p0, LSb8;->f:Ljava/lang/Object;

    const/4 v9, 0x1

    invoke-static {v9, v2, v6, v7, v8}, LFc8;->x(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "2"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x400

    if-le v2, v3, :cond_3

    iget-object v1, p0, LSb8;->c:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :cond_3
    iget-object v0, v0, LIh8;->d:Leh8;

    if-eqz v0, :cond_4

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Leh8;->b(Ljava/lang/String;J)V

    :cond_4
    return-void

    :cond_5
    iget-object v0, p0, LSb8;->g:LFc8;

    invoke-virtual {v0}, LFc8;->D()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Persisted config not initialized. Not logging error/warn"

    const/4 v2, 0x6

    invoke-static {v2, v0, v1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.class public Lyv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public b:LOH6;

.field public final c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lyv;->c:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lyv;->f:Z

    iput-boolean p1, p0, Lyv;->g:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lyv;->d()Lyv;

    move-result-object v0

    return-object v0
.end method

.method public d()Lyv;
    .locals 2

    new-instance v0, Lyv;

    iget v1, p0, Lyv;->c:I

    invoke-direct {v0, v1}, Lyv;-><init>(I)V

    iget-object v1, p0, Lyv;->b:LOH6;

    iput-object v1, v0, Lyv;->b:LOH6;

    iget v1, p0, Lyv;->d:I

    iput v1, v0, Lyv;->d:I

    iget v1, p0, Lyv;->e:I

    iput v1, v0, Lyv;->e:I

    iget-boolean v1, p0, Lyv;->f:Z

    iput-boolean v1, v0, Lyv;->f:Z

    iget-boolean v1, p0, Lyv;->g:Z

    iput-boolean v1, v0, Lyv;->g:Z

    return-object v0
.end method

.method public e()I
    .locals 1

    iget-boolean v0, p0, Lyv;->f:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lyv;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lyv;->d:I

    return v0

    :cond_1
    :goto_0
    const v0, 0x7fffffff

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lyv;->e:I

    return v0
.end method

.method public g()LOH6;
    .locals 1

    iget-object v0, p0, Lyv;->b:LOH6;

    return-object v0
.end method

.method public h(I)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lyv;->b:LOH6;

    iget v0, p0, Lyv;->c:I

    iput v0, p0, Lyv;->d:I

    iput p1, p0, Lyv;->e:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lyv;->f:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lyv;->g:Z

    return-void
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lyv;->g:Z

    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lyv;->f:Z

    return v0
.end method

.method public l(LOH6;)V
    .locals 1

    iput-object p1, p0, Lyv;->b:LOH6;

    invoke-virtual {p1}, LOH6;->a()I

    move-result p1

    iput p1, p0, Lyv;->d:I

    iget v0, p0, Lyv;->c:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lyv;->g:Z

    :cond_0
    return-void
.end method

.method public m(Ljava/util/Stack;Llw6;[B[BLFd3;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Stack<",
            "LOH6;",
            ">;",
            "Llw6;",
            "[B[B",
            "LFd3;",
            ")V"
        }
    .end annotation

    if-eqz p5, :cond_5

    iget-boolean v0, p0, Lyv;->g:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lyv;->f:Z

    if-eqz v0, :cond_4

    new-instance v0, LFd3$b;

    invoke-direct {v0}, LFd3$b;-><init>()V

    invoke-virtual {p5}, LCH6;->b()I

    move-result v1

    invoke-virtual {v0, v1}, LCH6$a;->g(I)LCH6$a;

    move-result-object v0

    check-cast v0, LFd3$b;

    invoke-virtual {p5}, LCH6;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LCH6$a;->h(J)LCH6$a;

    move-result-object v0

    check-cast v0, LFd3$b;

    iget v1, p0, Lyv;->e:I

    invoke-virtual {v0, v1}, LFd3$b;->p(I)LFd3$b;

    move-result-object v0

    invoke-virtual {p5}, LFd3;->e()I

    move-result v1

    invoke-virtual {v0, v1}, LFd3$b;->n(I)LFd3$b;

    move-result-object v0

    invoke-virtual {p5}, LFd3;->f()I

    move-result v1

    invoke-virtual {v0, v1}, LFd3$b;->o(I)LFd3$b;

    move-result-object v0

    invoke-virtual {p5}, LCH6;->a()I

    move-result p5

    invoke-virtual {v0, p5}, LCH6$a;->f(I)LCH6$a;

    move-result-object p5

    check-cast p5, LFd3$b;

    invoke-virtual {p5}, LFd3$b;->l()LCH6;

    move-result-object p5

    check-cast p5, LFd3;

    new-instance v0, LQl2$b;

    invoke-direct {v0}, LQl2$b;-><init>()V

    invoke-virtual {p5}, LCH6;->b()I

    move-result v1

    invoke-virtual {v0, v1}, LCH6$a;->g(I)LCH6$a;

    move-result-object v0

    check-cast v0, LQl2$b;

    invoke-virtual {p5}, LCH6;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LCH6$a;->h(J)LCH6$a;

    move-result-object v0

    check-cast v0, LQl2$b;

    iget v1, p0, Lyv;->e:I

    invoke-virtual {v0, v1}, LQl2$b;->n(I)LQl2$b;

    move-result-object v0

    invoke-virtual {v0}, LQl2$b;->l()LCH6;

    move-result-object v0

    check-cast v0, LQl2;

    new-instance v1, LtH1$b;

    invoke-direct {v1}, LtH1$b;-><init>()V

    invoke-virtual {p5}, LCH6;->b()I

    move-result v2

    invoke-virtual {v1, v2}, LCH6$a;->g(I)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    invoke-virtual {p5}, LCH6;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LCH6$a;->h(J)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    iget v2, p0, Lyv;->e:I

    invoke-virtual {v1, v2}, LtH1$b;->n(I)LtH1$b;

    move-result-object v1

    invoke-virtual {v1}, LtH1$b;->k()LCH6;

    move-result-object v1

    check-cast v1, LtH1;

    invoke-virtual {p2, p4, p5}, Llw6;->g([BLFd3;)[B

    move-result-object p4

    invoke-virtual {p2, p4, p3}, Llw6;->h([B[B)V

    invoke-virtual {p2, p5}, Llw6;->e(LFd3;)Low6;

    move-result-object p3

    invoke-static {p2, p3, v0}, LPH6;->a(Llw6;Low6;LQl2;)LOH6;

    move-result-object p3

    :goto_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p4

    const/4 p5, 0x1

    if-nez p4, :cond_0

    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LOH6;

    invoke-virtual {p4}, LOH6;->a()I

    move-result p4

    invoke-virtual {p3}, LOH6;->a()I

    move-result v0

    if-ne p4, v0, :cond_0

    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LOH6;

    invoke-virtual {p4}, LOH6;->a()I

    move-result p4

    iget v0, p0, Lyv;->c:I

    if-eq p4, v0, :cond_0

    new-instance p4, LtH1$b;

    invoke-direct {p4}, LtH1$b;-><init>()V

    invoke-virtual {v1}, LCH6;->b()I

    move-result v0

    invoke-virtual {p4, v0}, LCH6$a;->g(I)LCH6$a;

    move-result-object p4

    check-cast p4, LtH1$b;

    invoke-virtual {v1}, LCH6;->c()J

    move-result-wide v2

    invoke-virtual {p4, v2, v3}, LCH6$a;->h(J)LCH6$a;

    move-result-object p4

    check-cast p4, LtH1$b;

    invoke-virtual {v1}, LtH1;->e()I

    move-result v0

    invoke-virtual {p4, v0}, LtH1$b;->m(I)LtH1$b;

    move-result-object p4

    invoke-virtual {v1}, LtH1;->f()I

    move-result v0

    sub-int/2addr v0, p5

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p4, v0}, LtH1$b;->n(I)LtH1$b;

    move-result-object p4

    invoke-virtual {v1}, LCH6;->a()I

    move-result v0

    invoke-virtual {p4, v0}, LCH6$a;->f(I)LCH6$a;

    move-result-object p4

    check-cast p4, LtH1$b;

    invoke-virtual {p4}, LtH1$b;->k()LCH6;

    move-result-object p4

    check-cast p4, LtH1;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOH6;

    invoke-static {p2, v0, p3, p4}, LPH6;->b(Llw6;LOH6;LOH6;LCH6;)LOH6;

    move-result-object p3

    new-instance v0, LOH6;

    invoke-virtual {p3}, LOH6;->a()I

    move-result v1

    add-int/2addr v1, p5

    invoke-virtual {p3}, LOH6;->b()[B

    move-result-object p3

    invoke-direct {v0, v1, p3}, LOH6;-><init>(I[B)V

    new-instance p3, LtH1$b;

    invoke-direct {p3}, LtH1$b;-><init>()V

    invoke-virtual {p4}, LCH6;->b()I

    move-result v1

    invoke-virtual {p3, v1}, LCH6$a;->g(I)LCH6$a;

    move-result-object p3

    check-cast p3, LtH1$b;

    invoke-virtual {p4}, LCH6;->c()J

    move-result-wide v1

    invoke-virtual {p3, v1, v2}, LCH6$a;->h(J)LCH6$a;

    move-result-object p3

    check-cast p3, LtH1$b;

    invoke-virtual {p4}, LtH1;->e()I

    move-result v1

    add-int/2addr v1, p5

    invoke-virtual {p3, v1}, LtH1$b;->m(I)LtH1$b;

    move-result-object p3

    invoke-virtual {p4}, LtH1;->f()I

    move-result p5

    invoke-virtual {p3, p5}, LtH1$b;->n(I)LtH1$b;

    move-result-object p3

    invoke-virtual {p4}, LCH6;->a()I

    move-result p4

    invoke-virtual {p3, p4}, LCH6$a;->f(I)LCH6$a;

    move-result-object p3

    check-cast p3, LtH1$b;

    invoke-virtual {p3}, LtH1$b;->k()LCH6;

    move-result-object p3

    move-object v1, p3

    check-cast v1, LtH1;

    move-object p3, v0

    goto/16 :goto_0

    :cond_0
    iget-object p4, p0, Lyv;->b:LOH6;

    if-nez p4, :cond_1

    iput-object p3, p0, Lyv;->b:LOH6;

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p4}, LOH6;->a()I

    move-result p4

    invoke-virtual {p3}, LOH6;->a()I

    move-result v0

    if-ne p4, v0, :cond_2

    new-instance p1, LtH1$b;

    invoke-direct {p1}, LtH1$b;-><init>()V

    invoke-virtual {v1}, LCH6;->b()I

    move-result p4

    invoke-virtual {p1, p4}, LCH6$a;->g(I)LCH6$a;

    move-result-object p1

    check-cast p1, LtH1$b;

    invoke-virtual {v1}, LCH6;->c()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, LCH6$a;->h(J)LCH6$a;

    move-result-object p1

    check-cast p1, LtH1$b;

    invoke-virtual {v1}, LtH1;->e()I

    move-result p4

    invoke-virtual {p1, p4}, LtH1$b;->m(I)LtH1$b;

    move-result-object p1

    invoke-virtual {v1}, LtH1;->f()I

    move-result p4

    sub-int/2addr p4, p5

    div-int/lit8 p4, p4, 0x2

    invoke-virtual {p1, p4}, LtH1$b;->n(I)LtH1$b;

    move-result-object p1

    invoke-virtual {v1}, LCH6;->a()I

    move-result p4

    invoke-virtual {p1, p4}, LCH6$a;->f(I)LCH6$a;

    move-result-object p1

    check-cast p1, LtH1$b;

    invoke-virtual {p1}, LtH1$b;->k()LCH6;

    move-result-object p1

    check-cast p1, LtH1;

    iget-object p4, p0, Lyv;->b:LOH6;

    invoke-static {p2, p4, p3, p1}, LPH6;->b(Llw6;LOH6;LOH6;LCH6;)LOH6;

    move-result-object p2

    new-instance p3, LOH6;

    iget-object p4, p0, Lyv;->b:LOH6;

    invoke-virtual {p4}, LOH6;->a()I

    move-result p4

    add-int/2addr p4, p5

    invoke-virtual {p2}, LOH6;->b()[B

    move-result-object p2

    invoke-direct {p3, p4, p2}, LOH6;-><init>(I[B)V

    iput-object p3, p0, Lyv;->b:LOH6;

    new-instance p2, LtH1$b;

    invoke-direct {p2}, LtH1$b;-><init>()V

    invoke-virtual {p1}, LCH6;->b()I

    move-result p4

    invoke-virtual {p2, p4}, LCH6$a;->g(I)LCH6$a;

    move-result-object p2

    check-cast p2, LtH1$b;

    invoke-virtual {p1}, LCH6;->c()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, LCH6$a;->h(J)LCH6$a;

    move-result-object p2

    check-cast p2, LtH1$b;

    invoke-virtual {p1}, LtH1;->e()I

    move-result p4

    add-int/2addr p4, p5

    invoke-virtual {p2, p4}, LtH1$b;->m(I)LtH1$b;

    move-result-object p2

    invoke-virtual {p1}, LtH1;->f()I

    move-result p4

    invoke-virtual {p2, p4}, LtH1$b;->n(I)LtH1$b;

    move-result-object p2

    invoke-virtual {p1}, LCH6;->a()I

    move-result p1

    invoke-virtual {p2, p1}, LCH6$a;->f(I)LCH6$a;

    move-result-object p1

    check-cast p1, LtH1$b;

    invoke-virtual {p1}, LtH1$b;->k()LCH6;

    move-result-object p1

    check-cast p1, LtH1;

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget-object p1, p0, Lyv;->b:LOH6;

    invoke-virtual {p1}, LOH6;->a()I

    move-result p1

    iget p2, p0, Lyv;->c:I

    if-ne p1, p2, :cond_3

    iput-boolean p5, p0, Lyv;->g:Z

    goto :goto_2

    :cond_3
    invoke-virtual {p3}, LOH6;->a()I

    move-result p1

    iput p1, p0, Lyv;->d:I

    iget p1, p0, Lyv;->e:I

    add-int/2addr p1, p5

    iput p1, p0, Lyv;->e:I

    :goto_2
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "finished or not initialized"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "otsHashAddress == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

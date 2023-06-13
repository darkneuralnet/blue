.class public final Lcom/google/protobuf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/I;


# instance fields
.field public final a:Lcom/google/protobuf/f;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Lcom/google/protobuf/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lcom/google/protobuf/t;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/f;

    iput-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    iput-object p0, p1, Lcom/google/protobuf/f;->d:Lcom/google/protobuf/g;

    return-void
.end method

.method public static Q(Lcom/google/protobuf/f;)Lcom/google/protobuf/g;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/f;->d:Lcom/google/protobuf/g;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/protobuf/g;

    invoke-direct {v0, p0}, Lcom/google/protobuf/g;-><init>(Lcom/google/protobuf/f;)V

    return-object v0
.end method


# virtual methods
.method public A(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/g;->W(Ljava/util/List;Z)V

    return-void
.end method

.method public B()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->r()I

    move-result v0

    return v0
.end method

.method public C(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/y;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/y;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/g;->a0(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->p()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/y;->f(J)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/y;->f(J)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->a0(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->p()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

.method public D(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/s;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/s;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

.method public E()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->o()I

    move-result v0

    return v0
.end method

.method public F()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method public G()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->x()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public H()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->t()I

    move-result v0

    return v0
.end method

.method public I()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public J(Ljava/util/List;LJm5;Lcom/google/protobuf/k;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "LJm5<",
            "TT;>;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    iget v0, p0, Lcom/google/protobuf/g;->b:I

    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/g;->U(LJm5;Lcom/google/protobuf/k;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->e()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/protobuf/g;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->z()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/protobuf/g;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public K(Ljava/util/List;LJm5;Lcom/google/protobuf/k;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "LJm5<",
            "TT;>;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    iget v0, p0, Lcom/google/protobuf/g;->b:I

    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/g;->V(LJm5;Lcom/google/protobuf/k;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->e()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/protobuf/g;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->z()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/protobuf/g;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public L(Ljava/util/Map;Lcom/google/protobuf/z$a;Lcom/google/protobuf/k;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lcom/google/protobuf/z$a<",
            "TK;TV;>;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->A()I

    move-result v1

    iget-object v2, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v2, v1}, Lcom/google/protobuf/f;->j(I)I

    move-result v1

    iget-object v2, p2, Lcom/google/protobuf/z$a;->b:Ljava/lang/Object;

    iget-object v3, p2, Lcom/google/protobuf/z$a;->d:Ljava/lang/Object;

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/protobuf/g;->n()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_5

    iget-object v5, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v5}, Lcom/google/protobuf/f;->e()Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    const-string v6, "Unable to parse map entry."

    if-eq v4, v5, :cond_3

    if-eq v4, v0, :cond_2

    :try_start_1
    invoke-virtual {p0}, Lcom/google/protobuf/g;->q()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance v4, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v4, v6}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_2
    iget-object v4, p2, Lcom/google/protobuf/z$a;->c:Lcom/google/protobuf/P$b;

    iget-object v5, p2, Lcom/google/protobuf/z$a;->d:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {p0, v4, v5, p3}, Lcom/google/protobuf/g;->T(Lcom/google/protobuf/P$b;Ljava/lang/Class;Lcom/google/protobuf/k;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_3
    iget-object v4, p2, Lcom/google/protobuf/z$a;->a:Lcom/google/protobuf/P$b;

    const/4 v5, 0x0

    invoke-virtual {p0, v4, v5, v5}, Lcom/google/protobuf/g;->T(Lcom/google/protobuf/P$b;Ljava/lang/Class;Lcom/google/protobuf/k;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-virtual {p0}, Lcom/google/protobuf/g;->q()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p1, v6}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1, v1}, Lcom/google/protobuf/f;->i(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p2, v1}, Lcom/google/protobuf/f;->i(I)V

    throw p1
.end method

.method public M(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LJm5<",
            "TT;>;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/g;->R(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V

    return-void
.end method

.method public N(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LJm5<",
            "TT;>;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/g;->S(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V

    return-void
.end method

.method public O(Ljava/lang/Class;Lcom/google/protobuf/k;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/protobuf/k;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    invoke-static {}, LL94;->a()LL94;

    move-result-object v0

    invoke-virtual {v0, p1}, LL94;->c(Ljava/lang/Class;)LJm5;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/g;->U(LJm5;Lcom/google/protobuf/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public P(Ljava/lang/Class;Lcom/google/protobuf/k;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/protobuf/k;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    invoke-static {}, LL94;->a()LL94;

    move-result-object v0

    invoke-virtual {v0, p1}, LL94;->c(Ljava/lang/Class;)LJm5;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/g;->V(LJm5;Lcom/google/protobuf/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final R(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LJm5<",
            "TT;>;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/protobuf/g;->c:I

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v1}, Lcom/google/protobuf/P;->a(I)I

    move-result v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lcom/google/protobuf/P;->c(II)I

    move-result v1

    iput v1, p0, Lcom/google/protobuf/g;->c:I

    :try_start_0
    invoke-interface {p2, p1, p0, p3}, LJm5;->j(Ljava/lang/Object;Lcom/google/protobuf/I;Lcom/google/protobuf/k;)V

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    iget p2, p0, Lcom/google/protobuf/g;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lcom/google/protobuf/g;->c:I

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->h()Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lcom/google/protobuf/g;->c:I

    throw p1
.end method

.method public final S(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LJm5<",
            "TT;>;",
            "Lcom/google/protobuf/k;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    iget v2, v1, Lcom/google/protobuf/f;->a:I

    iget v3, v1, Lcom/google/protobuf/f;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/protobuf/f;->j(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    iget v2, v1, Lcom/google/protobuf/f;->a:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/google/protobuf/f;->a:I

    invoke-interface {p2, p1, p0, p3}, LJm5;->j(Ljava/lang/Object;Lcom/google/protobuf/I;Lcom/google/protobuf/k;)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/protobuf/f;->a(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    iget p2, p1, Lcom/google/protobuf/f;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lcom/google/protobuf/f;->a:I

    invoke-virtual {p1, v0}, Lcom/google/protobuf/f;->i(I)V

    return-void

    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->i()Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public final T(Lcom/google/protobuf/P$b;Ljava/lang/Class;Lcom/google/protobuf/k;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/P$b;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/protobuf/k;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "unsupported field type."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/protobuf/g;->j()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0}, Lcom/google/protobuf/g;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0}, Lcom/google/protobuf/g;->I()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0}, Lcom/google/protobuf/g;->F()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0}, Lcom/google/protobuf/g;->f()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0}, Lcom/google/protobuf/g;->b()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0}, Lcom/google/protobuf/g;->H()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/g;->P(Ljava/lang/Class;Lcom/google/protobuf/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p0}, Lcom/google/protobuf/g;->t()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0}, Lcom/google/protobuf/g;->B()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p0}, Lcom/google/protobuf/g;->readFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p0}, Lcom/google/protobuf/g;->u()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p0}, Lcom/google/protobuf/g;->E()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0}, Lcom/google/protobuf/g;->e()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p0}, Lcom/google/protobuf/g;->readDouble()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p0}, Lcom/google/protobuf/g;->h()Lcom/google/protobuf/e;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p0}, Lcom/google/protobuf/g;->w()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final U(LJm5;Lcom/google/protobuf/k;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LJm5<",
            "TT;>;",
            "Lcom/google/protobuf/k;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p1}, LJm5;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/protobuf/g;->R(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V

    invoke-interface {p1, v0}, LJm5;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final V(LJm5;Lcom/google/protobuf/k;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LJm5<",
            "TT;>;",
            "Lcom/google/protobuf/k;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p1}, LJm5;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/protobuf/g;->S(Ljava/lang/Object;LJm5;Lcom/google/protobuf/k;)V

    invoke-interface {p1, v0}, LJm5;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public W(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    instance-of v0, p1, LOo2;

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    move-object v0, p1

    check-cast v0, LOo2;

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/g;->h()Lcom/google/protobuf/e;

    move-result-object p1

    invoke-interface {v0, p1}, LOo2;->P(Lcom/google/protobuf/e;)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget p2, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, p2, :cond_0

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/google/protobuf/g;->I()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/g;->G()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_5
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public final X(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->k()Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public final Y(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public final Z(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p1, p1, 0x3

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->h()Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/y;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/y;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->w()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/y;->f(J)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->w()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/y;->f(J)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

.method public final a0(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p1, p1, 0x7

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->h()Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public b()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/g;->b:I

    return v0
.end method

.method public e()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->n()I

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->v()I

    move-result v0

    return v0
.end method

.method public g(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/d;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/d;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->k()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/d;->f(Z)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->k()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/d;->f(Z)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

.method public h()Lcom/google/protobuf/e;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->l()Lcom/google/protobuf/e;

    move-result-object v0

    return-object v0
.end method

.method public i(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/s;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/s;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->v()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->v()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

.method public j()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->B()J

    move-result-wide v0

    return-wide v0
.end method

.method public k(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/y;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/y;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/g;->a0(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->u()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/y;->f(J)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->u()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/y;->f(J)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->a0(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

.method public l(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/s;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/s;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

.method public m(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/s;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/s;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/g;->Z(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Z(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public n()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/protobuf/g;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Lcom/google/protobuf/g;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/g;->b:I

    :goto_0
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    if-eqz v0, :cond_2

    iget v1, p0, Lcom/google/protobuf/g;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lcom/google/protobuf/P;->a(I)I

    move-result v0

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public o(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/g;->W(Ljava/util/List;Z)V

    return-void
.end method

.method public p(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/p;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/p;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->q()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p;->e(F)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/g;->Z(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->q()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p;->e(F)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->q()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Z(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->q()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public q()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/protobuf/g;->b:I

    iget v1, p0, Lcom/google/protobuf/g;->c:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1, v0}, Lcom/google/protobuf/f;->C(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public r(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/protobuf/e;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/g;->h()Lcom/google/protobuf/e;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public readDouble()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->m()D

    move-result-wide v0

    return-wide v0
.end method

.method public readFloat()F
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->q()F

    move-result v0

    return v0
.end method

.method public s(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/i;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/i;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/g;->a0(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->m()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/i;->e(D)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->m()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/i;->e(D)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->a0(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->m()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->m()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

.method public t()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->s()J

    move-result-wide v0

    return-wide v0
.end method

.method public u()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public v(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/s;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/s;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->t()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/g;->Z(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->t()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->t()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Z(I)V

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->t()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public w()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/g;->Y(I)V

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->k()Z

    move-result v0

    return v0
.end method

.method public x(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/y;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/y;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->B()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/y;->f(J)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->B()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/y;->f(J)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->B()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

.method public y(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/y;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/y;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->s()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/y;->f(J)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/y;->f(J)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

.method public z(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/protobuf/s;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/s;

    iget p1, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {p1}, Lcom/google/protobuf/P;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/s;->L2(I)V

    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {p1}, Lcom/google/protobuf/f;->z()I

    move-result p1

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/protobuf/g;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/protobuf/g;->b:I

    invoke-static {v0}, Lcom/google/protobuf/P;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v1}, Lcom/google/protobuf/f;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/protobuf/g;->X(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->e()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/g;->a:Lcom/google/protobuf/f;

    invoke-virtual {v0}, Lcom/google/protobuf/f;->z()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/g;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/protobuf/g;->d:I

    return-void
.end method

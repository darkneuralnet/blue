.class public final Lcom/google/crypto/tink/shaded/protobuf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/L;


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/h;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object p0, p1, Lcom/google/crypto/tink/shaded/protobuf/h;->d:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static Q(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h;->d:Lcom/google/crypto/tink/shaded/protobuf/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/i;-><init>(Lcom/google/crypto/tink/shaded/protobuf/h;)V

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

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->T(Ljava/util/List;Z)V

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->r()I

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/A;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/A;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->X(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->p()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/A;->f(J)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/A;->f(J)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->X(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->p()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/u;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/u;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->o()I

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()J

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()Ljava/lang/String;

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->t()I

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public J(Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/M<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/i;->R(Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public K(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    invoke-static {}, LM94;->a()LM94;

    move-result-object v0

    invoke-virtual {v0, p1}, LM94;->d(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/i;->R(Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public L(Ljava/util/Map;Lcom/google/crypto/tink/shaded/protobuf/B$a;Lcom/google/crypto/tink/shaded/protobuf/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/B$a<",
            "TK;TV;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    iget-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->j(I)I

    const/4 p1, 0x0

    throw p1
.end method

.method public M(Ljava/util/List;Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/M<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/i;->S(Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public N(Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/M<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/i;->S(Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public O(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    invoke-static {}, LM94;->a()LM94;

    move-result-object v0

    invoke-virtual {v0, p1}, LM94;->d(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/i;->S(Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public P(Ljava/util/List;Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/M<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/i;->R(Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public final R(Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/M<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->c:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/U;->a(I)I

    move-result v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/U;->c(II)I

    move-result v1

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->c:I

    :try_start_0
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/M;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1, p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/M;->i(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/L;Lcom/google/crypto/tink/shaded/protobuf/m;)V

    invoke-interface {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/M;->g(Ljava/lang/Object;)V

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    iget p2, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->c:I

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->h()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->c:I

    throw p1
.end method

.method public final S(Lcom/google/crypto/tink/shaded/protobuf/M;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/M<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    iget v2, v1, Lcom/google/crypto/tink/shaded/protobuf/h;->a:I

    iget v3, v1, Lcom/google/crypto/tink/shaded/protobuf/h;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->j(I)I

    move-result v0

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/M;->d()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    iget v3, v2, Lcom/google/crypto/tink/shaded/protobuf/h;->a:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lcom/google/crypto/tink/shaded/protobuf/h;->a:I

    invoke-interface {p1, v1, p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/M;->i(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/L;Lcom/google/crypto/tink/shaded/protobuf/m;)V

    invoke-interface {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/M;->g(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/h;->a(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    iget p2, p1, Lcom/google/crypto/tink/shaded/protobuf/h;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lcom/google/crypto/tink/shaded/protobuf/h;->a:I

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->i(I)V

    return-object v1

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->i()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public T(Ljava/util/List;Z)V
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

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    instance-of v0, p1, LPo2;

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    move-object v0, p1

    check-cast v0, LPo2;

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->h()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-interface {v0, p1}, LPo2;->q1(Lcom/google/crypto/tink/shaded/protobuf/g;)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget p2, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, p2, :cond_0

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->I()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->G()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_5
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public final U(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->k()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public final V(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1
.end method

.method public final W(I)V
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
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->h()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public final X(I)V
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
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->h()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/A;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/A;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/A;->f(J)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/A;->f(J)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void
.end method

.method public b()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->u()J

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->n()I

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()I

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/f;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/f;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->k()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/f;->f(Z)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->k()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/f;->f(Z)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void
.end method

.method public h()Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->l()Lcom/google/crypto/tink/shaded/protobuf/g;

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/u;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/u;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->B()J

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/A;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/A;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->X(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->u()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/A;->f(J)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->u()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/A;->f(J)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->X(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/u;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/u;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/u;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/u;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->W(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->W(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

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

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    :goto_0
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eqz v0, :cond_2

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->a(I)I

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

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->T(Ljava/util/List;Z)V

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/r;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/r;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->q()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/r;->e(F)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->W(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->q()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/r;->e(F)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->q()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->W(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->q()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

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

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->c:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->C(I)Z

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
            "Lcom/google/crypto/tink/shaded/protobuf/g;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->h()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->m()D

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->q()F

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/k;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->X(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->m()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->e(D)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->m()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->e(D)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->X(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->m()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->m()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->s()J

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->p()J

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/u;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/u;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->t()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->W(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->t()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->t()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->W(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->t()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

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

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->V(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->k()Z

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/A;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/A;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->B()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/A;->f(J)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->B()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/A;->f(J)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->B()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/A;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/A;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->s()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/A;->f(J)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/A;->f(J)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

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

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/u;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/u;

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result p1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result p1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->L2(I)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result p1

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->A()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->U(I)V

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()I

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->d:I

    return-void
.end method

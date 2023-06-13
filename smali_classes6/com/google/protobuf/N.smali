.class public Lcom/google/protobuf/N;
.super Lcom/google/protobuf/L;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/L<",
        "Lcom/google/protobuf/M;",
        "Lcom/google/protobuf/M;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/L;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)Lcom/google/protobuf/M;
    .locals 0

    check-cast p1, Lcom/google/protobuf/r;

    iget-object p1, p1, Lcom/google/protobuf/r;->unknownFields:Lcom/google/protobuf/M;

    return-object p1
.end method

.method public B(Lcom/google/protobuf/M;)I
    .locals 0

    invoke-virtual {p1}, Lcom/google/protobuf/M;->d()I

    move-result p1

    return p1
.end method

.method public C(Lcom/google/protobuf/M;)I
    .locals 0

    invoke-virtual {p1}, Lcom/google/protobuf/M;->e()I

    move-result p1

    return p1
.end method

.method public D(Lcom/google/protobuf/M;Lcom/google/protobuf/M;)Lcom/google/protobuf/M;
    .locals 1

    invoke-static {}, Lcom/google/protobuf/M;->c()Lcom/google/protobuf/M;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/protobuf/M;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/protobuf/M;->c()Lcom/google/protobuf/M;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/M;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lcom/google/protobuf/M;->j(Lcom/google/protobuf/M;Lcom/google/protobuf/M;)Lcom/google/protobuf/M;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1, p2}, Lcom/google/protobuf/M;->i(Lcom/google/protobuf/M;)Lcom/google/protobuf/M;

    move-result-object p1

    return-object p1
.end method

.method public E()Lcom/google/protobuf/M;
    .locals 1

    invoke-static {}, Lcom/google/protobuf/M;->k()Lcom/google/protobuf/M;

    move-result-object v0

    return-object v0
.end method

.method public F(Ljava/lang/Object;Lcom/google/protobuf/M;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/N;->G(Ljava/lang/Object;Lcom/google/protobuf/M;)V

    return-void
.end method

.method public G(Ljava/lang/Object;Lcom/google/protobuf/M;)V
    .locals 0

    check-cast p1, Lcom/google/protobuf/r;

    iput-object p2, p1, Lcom/google/protobuf/r;->unknownFields:Lcom/google/protobuf/M;

    return-void
.end method

.method public H(Lcom/google/protobuf/M;)Lcom/google/protobuf/M;
    .locals 0

    invoke-virtual {p1}, Lcom/google/protobuf/M;->h()V

    return-object p1
.end method

.method public I(Lcom/google/protobuf/M;Lcom/google/protobuf/Q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/google/protobuf/M;->p(Lcom/google/protobuf/Q;)V

    return-void
.end method

.method public J(Lcom/google/protobuf/M;Lcom/google/protobuf/Q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/google/protobuf/M;->r(Lcom/google/protobuf/Q;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;II)V
    .locals 0

    check-cast p1, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/N;->u(Lcom/google/protobuf/M;II)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/protobuf/N;->v(Lcom/google/protobuf/M;IJ)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/protobuf/M;

    check-cast p3, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/N;->w(Lcom/google/protobuf/M;ILcom/google/protobuf/M;)V

    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;ILcom/google/protobuf/e;)V
    .locals 0

    check-cast p1, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/N;->x(Lcom/google/protobuf/M;ILcom/google/protobuf/e;)V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/protobuf/N;->y(Lcom/google/protobuf/M;IJ)V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/N;->z(Ljava/lang/Object;)Lcom/google/protobuf/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/N;->A(Ljava/lang/Object;)Lcom/google/protobuf/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/N;->B(Lcom/google/protobuf/M;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/N;->C(Lcom/google/protobuf/M;)I

    move-result p1

    return p1
.end method

.method public j(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/N;->A(Ljava/lang/Object;)Lcom/google/protobuf/M;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/M;->h()V

    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/protobuf/M;

    check-cast p2, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/N;->D(Lcom/google/protobuf/M;Lcom/google/protobuf/M;)Lcom/google/protobuf/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/N;->E()Lcom/google/protobuf/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/N;->F(Ljava/lang/Object;Lcom/google/protobuf/M;)V

    return-void
.end method

.method public bridge synthetic p(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/N;->G(Ljava/lang/Object;Lcom/google/protobuf/M;)V

    return-void
.end method

.method public q(Lcom/google/protobuf/I;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/N;->H(Lcom/google/protobuf/M;)Lcom/google/protobuf/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Lcom/google/protobuf/Q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/N;->I(Lcom/google/protobuf/M;Lcom/google/protobuf/Q;)V

    return-void
.end method

.method public bridge synthetic t(Ljava/lang/Object;Lcom/google/protobuf/Q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lcom/google/protobuf/M;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/N;->J(Lcom/google/protobuf/M;Lcom/google/protobuf/Q;)V

    return-void
.end method

.method public u(Lcom/google/protobuf/M;II)V
    .locals 1

    const/4 v0, 0x5

    invoke-static {p2, v0}, Lcom/google/protobuf/P;->c(II)I

    move-result p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/protobuf/M;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public v(Lcom/google/protobuf/M;IJ)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/google/protobuf/P;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/protobuf/M;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public w(Lcom/google/protobuf/M;ILcom/google/protobuf/M;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {p2, v0}, Lcom/google/protobuf/P;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Lcom/google/protobuf/M;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public x(Lcom/google/protobuf/M;ILcom/google/protobuf/e;)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {p2, v0}, Lcom/google/protobuf/P;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Lcom/google/protobuf/M;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public y(Lcom/google/protobuf/M;IJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/google/protobuf/P;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/protobuf/M;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public z(Ljava/lang/Object;)Lcom/google/protobuf/M;
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/protobuf/N;->A(Ljava/lang/Object;)Lcom/google/protobuf/M;

    move-result-object v0

    invoke-static {}, Lcom/google/protobuf/M;->c()Lcom/google/protobuf/M;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/protobuf/M;->k()Lcom/google/protobuf/M;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/N;->G(Ljava/lang/Object;Lcom/google/protobuf/M;)V

    :cond_0
    return-object v0
.end method

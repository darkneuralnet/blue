.class public Lcom/google/crypto/tink/shaded/protobuf/S;
.super Lcom/google/crypto/tink/shaded/protobuf/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/P<",
        "Lcom/google/crypto/tink/shaded/protobuf/Q;",
        "Lcom/google/crypto/tink/shaded/protobuf/Q;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/P;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/Q;
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/t;

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/t;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/Q;

    return-object p1
.end method

.method public B(Lcom/google/crypto/tink/shaded/protobuf/Q;)I
    .locals 0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/Q;->d()I

    move-result p1

    return p1
.end method

.method public C(Lcom/google/crypto/tink/shaded/protobuf/Q;)I
    .locals 0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/Q;->e()I

    move-result p1

    return p1
.end method

.method public D(Lcom/google/crypto/tink/shaded/protobuf/Q;Lcom/google/crypto/tink/shaded/protobuf/Q;)Lcom/google/crypto/tink/shaded/protobuf/Q;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/Q;->c()Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/Q;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/Q;->i(Lcom/google/crypto/tink/shaded/protobuf/Q;Lcom/google/crypto/tink/shaded/protobuf/Q;)Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public E()Lcom/google/crypto/tink/shaded/protobuf/Q;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/Q;->j()Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object v0

    return-object v0
.end method

.method public F(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/Q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/Q;)V

    return-void
.end method

.method public G(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/Q;)V
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/t;

    iput-object p2, p1, Lcom/google/crypto/tink/shaded/protobuf/t;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/Q;

    return-void
.end method

.method public H(Lcom/google/crypto/tink/shaded/protobuf/Q;)Lcom/google/crypto/tink/shaded/protobuf/Q;
    .locals 0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/Q;->h()V

    return-object p1
.end method

.method public I(Lcom/google/crypto/tink/shaded/protobuf/Q;Lcom/google/crypto/tink/shaded/protobuf/V;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/Q;->o(Lcom/google/crypto/tink/shaded/protobuf/V;)V

    return-void
.end method

.method public J(Lcom/google/crypto/tink/shaded/protobuf/Q;Lcom/google/crypto/tink/shaded/protobuf/V;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/Q;->q(Lcom/google/crypto/tink/shaded/protobuf/V;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;II)V
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->u(Lcom/google/crypto/tink/shaded/protobuf/Q;II)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/S;->v(Lcom/google/crypto/tink/shaded/protobuf/Q;IJ)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    check-cast p3, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->w(Lcom/google/crypto/tink/shaded/protobuf/Q;ILcom/google/crypto/tink/shaded/protobuf/Q;)V

    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/S;->x(Lcom/google/crypto/tink/shaded/protobuf/Q;ILcom/google/crypto/tink/shaded/protobuf/g;)V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/S;->y(Lcom/google/crypto/tink/shaded/protobuf/Q;IJ)V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->z(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->A(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->B(Lcom/google/crypto/tink/shaded/protobuf/Q;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->C(Lcom/google/crypto/tink/shaded/protobuf/Q;)I

    move-result p1

    return p1
.end method

.method public j(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->A(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/Q;->h()V

    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->D(Lcom/google/crypto/tink/shaded/protobuf/Q;Lcom/google/crypto/tink/shaded/protobuf/Q;)Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/S;->E()Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->F(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/Q;)V

    return-void
.end method

.method public bridge synthetic p(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/Q;)V

    return-void
.end method

.method public q(Lcom/google/crypto/tink/shaded/protobuf/L;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->H(Lcom/google/crypto/tink/shaded/protobuf/Q;)Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/V;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->I(Lcom/google/crypto/tink/shaded/protobuf/Q;Lcom/google/crypto/tink/shaded/protobuf/V;)V

    return-void
.end method

.method public bridge synthetic t(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/V;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/Q;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/S;->J(Lcom/google/crypto/tink/shaded/protobuf/Q;Lcom/google/crypto/tink/shaded/protobuf/V;)V

    return-void
.end method

.method public u(Lcom/google/crypto/tink/shaded/protobuf/Q;II)V
    .locals 1

    const/4 v0, 0x5

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->c(II)I

    move-result p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/Q;->m(ILjava/lang/Object;)V

    return-void
.end method

.method public v(Lcom/google/crypto/tink/shaded/protobuf/Q;IJ)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/Q;->m(ILjava/lang/Object;)V

    return-void
.end method

.method public w(Lcom/google/crypto/tink/shaded/protobuf/Q;ILcom/google/crypto/tink/shaded/protobuf/Q;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/Q;->m(ILjava/lang/Object;)V

    return-void
.end method

.method public x(Lcom/google/crypto/tink/shaded/protobuf/Q;ILcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/Q;->m(ILjava/lang/Object;)V

    return-void
.end method

.method public y(Lcom/google/crypto/tink/shaded/protobuf/Q;IJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/Q;->m(ILjava/lang/Object;)V

    return-void
.end method

.method public z(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/Q;
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/S;->A(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/Q;->c()Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/Q;->j()Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/S;->G(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/Q;)V

    :cond_0
    return-object v0
.end method

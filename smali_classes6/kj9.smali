.class public final Lkj9;
.super LQi9;
.source "SourceFile"


# instance fields
.field public final h:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    invoke-direct {p0, p2}, LQi9;-><init>(I)V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lkj9;->h:Ljava/io/OutputStream;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "out"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lkj9;->V(I)V

    invoke-virtual {p0, p1}, LQi9;->Q(I)V

    return-void
.end method

.method public final B(IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lkj9;->V(I)V

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, LQi9;->S(I)V

    invoke-virtual {p0, p2, p3}, LQi9;->R(J)V

    return-void
.end method

.method public final C(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lkj9;->V(I)V

    invoke-virtual {p0, p1, p2}, LQi9;->R(J)V

    return-void
.end method

.method public final D(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lkj9;->V(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, LQi9;->S(I)V

    if-ltz p2, :cond_0

    invoke-virtual {p0, p2}, LQi9;->S(I)V

    return-void

    :cond_0
    int-to-long p1, p2

    invoke-virtual {p0, p1, p2}, LQi9;->T(J)V

    return-void
.end method

.method public final E(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lkj9;->L(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lkj9;->N(J)V

    return-void
.end method

.method public final F(ILNp9;Lbr9;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lkj9;->L(I)V

    move-object p1, p2

    check-cast p1, LNe9;

    invoke-virtual {p1}, LNe9;->a()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p3, p1}, Lbr9;->zza(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p1, v0}, LNe9;->i(I)V

    :cond_0
    invoke-virtual {p0, v0}, Lkj9;->L(I)V

    iget-object p1, p0, Lrj9;->a:Lyj9;

    invoke-interface {p3, p2, p1}, Lbr9;->e(Ljava/lang/Object;LVs9;)V

    return-void
.end method

.method public final G(LNp9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p1}, LNp9;->g()I

    move-result v0

    invoke-virtual {p0, v0}, Lkj9;->L(I)V

    invoke-interface {p1, p0}, LNp9;->j(Lrj9;)V

    return-void
.end method

.method public final H(ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lkj9;->L(I)V

    invoke-virtual {p0, p2}, Lkj9;->I(Ljava/lang/String;)V

    return-void
.end method

.method public final I(Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    invoke-static {v0}, Lrj9;->l(I)I

    move-result v1

    add-int v2, v1, v0

    iget v3, p0, LQi9;->e:I

    if-le v2, v3, :cond_0

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, LPs9;->b(Ljava/lang/CharSequence;[BII)I

    move-result v0

    invoke-virtual {p0, v0}, Lkj9;->L(I)V

    invoke-virtual {p0, v1, v2, v0}, Lkj9;->W([BII)V

    return-void

    :cond_0
    iget v0, p0, LQi9;->f:I

    sub-int/2addr v3, v0

    if-le v2, v3, :cond_1

    invoke-virtual {p0}, Lkj9;->U()V

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lrj9;->l(I)I

    move-result v0

    iget v2, p0, LQi9;->f:I
    :try_end_0
    .catch LNs9; {:try_start_0 .. :try_end_0} :catch_2

    if-ne v0, v1, :cond_2

    add-int v1, v2, v0

    :try_start_1
    iput v1, p0, LQi9;->f:I

    iget-object v3, p0, LQi9;->d:[B

    iget v4, p0, LQi9;->e:I

    sub-int/2addr v4, v1

    invoke-static {p1, v3, v1, v4}, LPs9;->b(Ljava/lang/CharSequence;[BII)I

    move-result v1

    iput v2, p0, LQi9;->f:I

    sub-int v3, v1, v2

    sub-int/2addr v3, v0

    invoke-virtual {p0, v3}, LQi9;->S(I)V

    iput v1, p0, LQi9;->f:I

    goto :goto_0

    :cond_2
    invoke-static {p1}, LPs9;->c(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-virtual {p0, v3}, LQi9;->S(I)V

    iget-object v0, p0, LQi9;->d:[B

    iget v1, p0, LQi9;->f:I

    invoke-static {p1, v0, v1, v3}, LPs9;->b(Ljava/lang/CharSequence;[BII)I

    move-result v0

    iput v0, p0, LQi9;->f:I

    :goto_0
    iget v0, p0, LQi9;->g:I

    add-int/2addr v0, v3

    iput v0, p0, LQi9;->g:I
    :try_end_1
    .catch LNs9; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v1, Lcom/google/android/gms/internal/recaptcha/zzqh;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/recaptcha/zzqh;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    iget v1, p0, LQi9;->g:I

    iget v3, p0, LQi9;->f:I

    sub-int/2addr v3, v2

    sub-int/2addr v1, v3

    iput v1, p0, LQi9;->g:I

    iput v2, p0, LQi9;->f:I

    throw v0
    :try_end_2
    .catch LNs9; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception v0

    invoke-virtual {p0, p1, v0}, Lrj9;->q(Ljava/lang/String;LNs9;)V

    return-void
.end method

.method public final J(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lkj9;->L(I)V

    return-void
.end method

.method public final K(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lkj9;->V(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, LQi9;->S(I)V

    invoke-virtual {p0, p2}, LQi9;->S(I)V

    return-void
.end method

.method public final L(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lkj9;->V(I)V

    invoke-virtual {p0, p1}, LQi9;->S(I)V

    return-void
.end method

.method public final M(IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lkj9;->V(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, LQi9;->S(I)V

    invoke-virtual {p0, p2, p3}, LQi9;->T(J)V

    return-void
.end method

.method public final N(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lkj9;->V(I)V

    invoke-virtual {p0, p1, p2}, LQi9;->T(J)V

    return-void
.end method

.method public final U()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lkj9;->h:Ljava/io/OutputStream;

    iget-object v1, p0, LQi9;->d:[B

    iget v2, p0, LQi9;->f:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, LQi9;->f:I

    return-void
.end method

.method public final V(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LQi9;->e:I

    iget v1, p0, LQi9;->f:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    invoke-virtual {p0}, Lkj9;->U()V

    :cond_0
    return-void
.end method

.method public final W([BII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget p2, p0, LQi9;->e:I

    iget v0, p0, LQi9;->f:I

    sub-int/2addr p2, v0

    const/4 v1, 0x0

    if-lt p2, p3, :cond_0

    iget-object p2, p0, LQi9;->d:[B

    invoke-static {p1, v1, p2, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, LQi9;->f:I

    add-int/2addr p1, p3

    iput p1, p0, LQi9;->f:I

    iget p1, p0, LQi9;->g:I

    add-int/2addr p1, p3

    iput p1, p0, LQi9;->g:I

    return-void

    :cond_0
    iget-object v2, p0, LQi9;->d:[B

    invoke-static {p1, v1, v2, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr p3, p2

    iget v0, p0, LQi9;->e:I

    iput v0, p0, LQi9;->f:I

    iget v0, p0, LQi9;->g:I

    add-int/2addr v0, p2

    iput v0, p0, LQi9;->g:I

    invoke-virtual {p0}, Lkj9;->U()V

    iget v0, p0, LQi9;->e:I

    if-gt p3, v0, :cond_1

    iget-object v0, p0, LQi9;->d:[B

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, LQi9;->f:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkj9;->h:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :goto_0
    iget p1, p0, LQi9;->g:I

    add-int/2addr p1, p3

    iput p1, p0, LQi9;->g:I

    return-void
.end method

.method public final a([BII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lkj9;->W([BII)V

    return-void
.end method

.method public final s()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LQi9;->f:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lkj9;->U()V

    :cond_0
    return-void
.end method

.method public final t(B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LQi9;->f:I

    iget v1, p0, LQi9;->e:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lkj9;->U()V

    :cond_0
    invoke-virtual {p0, p1}, LQi9;->P(B)V

    return-void
.end method

.method public final u(IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lkj9;->V(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, LQi9;->S(I)V

    invoke-virtual {p0, p2}, LQi9;->P(B)V

    return-void
.end method

.method public final v([BII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p3}, Lkj9;->L(I)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lkj9;->W([BII)V

    return-void
.end method

.method public final x(ILnh9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lkj9;->L(I)V

    invoke-virtual {p0, p2}, Lkj9;->y(Lnh9;)V

    return-void
.end method

.method public final y(Lnh9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lnh9;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lkj9;->L(I)V

    invoke-virtual {p1, p0}, Lnh9;->o(LIf9;)V

    return-void
.end method

.method public final z(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lkj9;->V(I)V

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x5

    invoke-virtual {p0, p1}, LQi9;->S(I)V

    invoke-virtual {p0, p2}, LQi9;->Q(I)V

    return-void
.end method

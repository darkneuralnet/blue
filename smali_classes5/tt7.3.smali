.class public final Ltt7;
.super Lrt7;
.source "SourceFile"


# instance fields
.field public final h:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    invoke-direct {p0, p2}, Lrt7;-><init>(I)V

    if-eqz p1, :cond_0

    iput-object p1, p0, Ltt7;->h:Ljava/io/OutputStream;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "out"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Ltt7;->Y(I)V

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x5

    invoke-virtual {p0, p1}, Lrt7;->U(I)V

    invoke-virtual {p0, p2}, Lrt7;->S(I)V

    return-void
.end method

.method public final B(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Ltt7;->Y(I)V

    invoke-virtual {p0, p1}, Lrt7;->S(I)V

    return-void
.end method

.method public final C(IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Ltt7;->Y(I)V

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lrt7;->U(I)V

    invoke-virtual {p0, p2, p3}, Lrt7;->T(J)V

    return-void
.end method

.method public final D(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Ltt7;->Y(I)V

    invoke-virtual {p0, p1, p2}, Lrt7;->T(J)V

    return-void
.end method

.method public final E(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Ltt7;->Y(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lrt7;->U(I)V

    if-ltz p2, :cond_0

    invoke-virtual {p0, p2}, Lrt7;->U(I)V

    return-void

    :cond_0
    int-to-long p1, p2

    invoke-virtual {p0, p1, p2}, Lrt7;->V(J)V

    return-void
.end method

.method public final F(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Ltt7;->O(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Ltt7;->Q(J)V

    return-void
.end method

.method public final G(ILfv7;LNv7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ltt7;->O(I)V

    move-object p1, p2

    check-cast p1, Lys7;

    invoke-virtual {p1}, Lys7;->b()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p3, p1}, LNv7;->zza(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p1, v0}, Lys7;->d(I)V

    :cond_0
    invoke-virtual {p0, v0}, Ltt7;->O(I)V

    iget-object p1, p0, Lut7;->a:Lvt7;

    invoke-interface {p3, p2, p1}, LNv7;->f(Ljava/lang/Object;LKw7;)V

    return-void
.end method

.method public final H(Lfv7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p1}, Lfv7;->w()I

    move-result v0

    invoke-virtual {p0, v0}, Ltt7;->O(I)V

    invoke-interface {p1, p0}, Lfv7;->y(Lut7;)V

    return-void
.end method

.method public final I(ILfv7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Ltt7;->O(I)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Ltt7;->N(II)V

    const/16 p1, 0x1a

    invoke-virtual {p0, p1}, Ltt7;->O(I)V

    invoke-virtual {p0, p2}, Ltt7;->H(Lfv7;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1}, Ltt7;->O(I)V

    return-void
.end method

.method public final J(ILkt7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Ltt7;->O(I)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Ltt7;->N(II)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, p2}, Ltt7;->y(ILkt7;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1}, Ltt7;->O(I)V

    return-void
.end method

.method public final K(ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ltt7;->O(I)V

    invoke-virtual {p0, p2}, Ltt7;->L(Ljava/lang/String;)V

    return-void
.end method

.method public final L(Ljava/lang/String;)V
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

    invoke-static {v0}, Lut7;->m(I)I

    move-result v1

    add-int v2, v1, v0

    iget v3, p0, Lrt7;->e:I

    if-le v2, v3, :cond_0

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, LHw7;->d(Ljava/lang/CharSequence;[BII)I

    move-result v0

    invoke-virtual {p0, v0}, Ltt7;->O(I)V

    invoke-virtual {p0, v1, v2, v0}, Ltt7;->W([BII)V

    return-void

    :cond_0
    iget v0, p0, Lrt7;->f:I

    sub-int/2addr v3, v0

    if-le v2, v3, :cond_1

    invoke-virtual {p0}, Ltt7;->X()V

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lut7;->m(I)I

    move-result v0

    iget v2, p0, Lrt7;->f:I
    :try_end_0
    .catch LGw7; {:try_start_0 .. :try_end_0} :catch_2

    if-ne v0, v1, :cond_2

    add-int v1, v2, v0

    :try_start_1
    iput v1, p0, Lrt7;->f:I

    iget-object v3, p0, Lrt7;->d:[B

    iget v4, p0, Lrt7;->e:I

    sub-int/2addr v4, v1

    invoke-static {p1, v3, v1, v4}, LHw7;->d(Ljava/lang/CharSequence;[BII)I

    move-result v1

    iput v2, p0, Lrt7;->f:I

    sub-int v3, v1, v2

    sub-int/2addr v3, v0

    invoke-virtual {p0, v3}, Lrt7;->U(I)V

    iput v1, p0, Lrt7;->f:I

    goto :goto_0

    :cond_2
    invoke-static {p1}, LHw7;->e(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-virtual {p0, v3}, Lrt7;->U(I)V

    iget-object v0, p0, Lrt7;->d:[B

    iget v1, p0, Lrt7;->f:I

    invoke-static {p1, v0, v1, v3}, LHw7;->d(Ljava/lang/CharSequence;[BII)I

    move-result v0

    iput v0, p0, Lrt7;->f:I

    :goto_0
    iget v0, p0, Lrt7;->g:I

    add-int/2addr v0, v3

    iput v0, p0, Lrt7;->g:I
    :try_end_1
    .catch LGw7; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzapn;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzapn;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    iget v1, p0, Lrt7;->g:I

    iget v3, p0, Lrt7;->f:I

    sub-int/2addr v3, v2

    sub-int/2addr v1, v3

    iput v1, p0, Lrt7;->g:I

    iput v2, p0, Lrt7;->f:I

    throw v0
    :try_end_2
    .catch LGw7; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception v0

    invoke-virtual {p0, p1, v0}, Lut7;->r(Ljava/lang/String;LGw7;)V

    return-void
.end method

.method public final M(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Ltt7;->O(I)V

    return-void
.end method

.method public final N(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Ltt7;->Y(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lrt7;->U(I)V

    invoke-virtual {p0, p2}, Lrt7;->U(I)V

    return-void
.end method

.method public final O(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Ltt7;->Y(I)V

    invoke-virtual {p0, p1}, Lrt7;->U(I)V

    return-void
.end method

.method public final P(IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Ltt7;->Y(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lrt7;->U(I)V

    invoke-virtual {p0, p2, p3}, Lrt7;->V(J)V

    return-void
.end method

.method public final Q(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Ltt7;->Y(I)V

    invoke-virtual {p0, p1, p2}, Lrt7;->V(J)V

    return-void
.end method

.method public final W([BII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lrt7;->e:I

    iget v1, p0, Lrt7;->f:I

    sub-int/2addr v0, v1

    if-lt v0, p3, :cond_0

    iget-object v0, p0, Lrt7;->d:[B

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lrt7;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Lrt7;->f:I

    iget p1, p0, Lrt7;->g:I

    add-int/2addr p1, p3

    iput p1, p0, Lrt7;->g:I

    return-void

    :cond_0
    iget-object v2, p0, Lrt7;->d:[B

    invoke-static {p1, p2, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    iget v1, p0, Lrt7;->e:I

    iput v1, p0, Lrt7;->f:I

    iget v1, p0, Lrt7;->g:I

    add-int/2addr v1, v0

    iput v1, p0, Lrt7;->g:I

    invoke-virtual {p0}, Ltt7;->X()V

    iget v0, p0, Lrt7;->e:I

    if-gt p3, v0, :cond_1

    iget-object v0, p0, Lrt7;->d:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, Lrt7;->f:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ltt7;->h:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :goto_0
    iget p1, p0, Lrt7;->g:I

    add-int/2addr p1, p3

    iput p1, p0, Lrt7;->g:I

    return-void
.end method

.method public final X()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Ltt7;->h:Ljava/io/OutputStream;

    iget-object v1, p0, Lrt7;->d:[B

    iget v2, p0, Lrt7;->f:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, Lrt7;->f:I

    return-void
.end method

.method public final Y(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lrt7;->e:I

    iget v1, p0, Lrt7;->f:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    invoke-virtual {p0}, Ltt7;->X()V

    :cond_0
    return-void
.end method

.method public final a([BII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Ltt7;->W([BII)V

    return-void
.end method

.method public final t()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lrt7;->f:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Ltt7;->X()V

    :cond_0
    return-void
.end method

.method public final u(B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lrt7;->f:I

    iget v1, p0, Lrt7;->e:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ltt7;->X()V

    :cond_0
    invoke-virtual {p0, p1}, Lrt7;->R(B)V

    return-void
.end method

.method public final v(IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Ltt7;->Y(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lrt7;->U(I)V

    invoke-virtual {p0, p2}, Lrt7;->R(B)V

    return-void
.end method

.method public final w([BII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p3}, Ltt7;->O(I)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3}, Ltt7;->W([BII)V

    return-void
.end method

.method public final y(ILkt7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ltt7;->O(I)V

    invoke-virtual {p0, p2}, Ltt7;->z(Lkt7;)V

    return-void
.end method

.method public final z(Lkt7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lkt7;->e()I

    move-result v0

    invoke-virtual {p0, v0}, Ltt7;->O(I)V

    invoke-virtual {p1, p0}, Lkt7;->w(LIs7;)V

    return-void
.end method

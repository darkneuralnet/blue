.class public LKH6;
.super LM;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:[B

.field public final f:[B

.field public final g:[B

.field public final h:[B

.field public final i:[B


# direct methods
.method public constructor <init>(J[B[B[B[B[B)V
    .locals 1

    invoke-direct {p0}, LM;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LKH6;->b:I

    iput-wide p1, p0, LKH6;->c:J

    invoke-static {p3}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->e:[B

    invoke-static {p4}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->f:[B

    invoke-static {p5}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->g:[B

    invoke-static {p6}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->h:[B

    invoke-static {p7}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->i:[B

    const-wide/16 p1, -0x1

    iput-wide p1, p0, LKH6;->d:J

    return-void
.end method

.method public constructor <init>(J[B[B[B[B[BJ)V
    .locals 1

    invoke-direct {p0}, LM;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, LKH6;->b:I

    iput-wide p1, p0, LKH6;->c:J

    invoke-static {p3}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->e:[B

    invoke-static {p4}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->f:[B

    invoke-static {p5}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->g:[B

    invoke-static {p6}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->h:[B

    invoke-static {p7}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->i:[B

    iput-wide p8, p0, LKH6;->d:J

    return-void
.end method

.method public constructor <init>(LU;)V
    .locals 8

    invoke-direct {p0}, LM;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v1

    invoke-static {v1}, LK;->A(Ljava/lang/Object;)LK;

    move-result-object v1

    invoke-virtual {v1, v0}, LK;->D(I)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    invoke-virtual {v1, v3}, LK;->D(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unknown version of sequence"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {v1}, LK;->F()I

    move-result v1

    iput v1, p0, LKH6;->b:I

    invoke-virtual {p1}, LU;->size()I

    move-result v1

    const/4 v2, 0x3

    const/4 v4, 0x2

    if-eq v1, v4, :cond_3

    invoke-virtual {p1}, LU;->size()I

    move-result v1

    if-ne v1, v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "key sequence wrong size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    invoke-virtual {p1, v3}, LU;->A(I)LE;

    move-result-object v1

    invoke-static {v1}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object v1

    invoke-virtual {v1, v0}, LU;->A(I)LE;

    move-result-object v5

    invoke-static {v5}, LK;->A(Ljava/lang/Object;)LK;

    move-result-object v5

    invoke-virtual {v5}, LK;->I()J

    move-result-wide v5

    iput-wide v5, p0, LKH6;->c:J

    invoke-virtual {v1, v3}, LU;->A(I)LE;

    move-result-object v5

    invoke-static {v5}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v5

    invoke-virtual {v5}, LO;->C()[B

    move-result-object v5

    invoke-static {v5}, LAo;->d([B)[B

    move-result-object v5

    iput-object v5, p0, LKH6;->e:[B

    invoke-virtual {v1, v4}, LU;->A(I)LE;

    move-result-object v5

    invoke-static {v5}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v5

    invoke-virtual {v5}, LO;->C()[B

    move-result-object v5

    invoke-static {v5}, LAo;->d([B)[B

    move-result-object v5

    iput-object v5, p0, LKH6;->f:[B

    invoke-virtual {v1, v2}, LU;->A(I)LE;

    move-result-object v5

    invoke-static {v5}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v5

    invoke-virtual {v5}, LO;->C()[B

    move-result-object v5

    invoke-static {v5}, LAo;->d([B)[B

    move-result-object v5

    iput-object v5, p0, LKH6;->g:[B

    const/4 v5, 0x4

    invoke-virtual {v1, v5}, LU;->A(I)LE;

    move-result-object v5

    invoke-static {v5}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v5

    invoke-virtual {v5}, LO;->C()[B

    move-result-object v5

    invoke-static {v5}, LAo;->d([B)[B

    move-result-object v5

    iput-object v5, p0, LKH6;->h:[B

    invoke-virtual {v1}, LU;->size()I

    move-result v5

    const/4 v6, 0x6

    const/4 v7, 0x5

    if-ne v5, v6, :cond_5

    invoke-virtual {v1, v7}, LU;->A(I)LE;

    move-result-object v1

    invoke-static {v1}, LZ;->z(Ljava/lang/Object;)LZ;

    move-result-object v1

    invoke-virtual {v1}, LZ;->C()I

    move-result v5

    if-nez v5, :cond_4

    invoke-static {v1, v0}, LK;->z(LZ;Z)LK;

    move-result-object v0

    invoke-virtual {v0}, LK;->I()J

    move-result-wide v0

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unknown tag in XMSSPrivateKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {v1}, LU;->size()I

    move-result v0

    if-ne v0, v7, :cond_7

    const-wide/16 v0, -0x1

    :goto_2
    iput-wide v0, p0, LKH6;->d:J

    invoke-virtual {p1}, LU;->size()I

    move-result v0

    if-ne v0, v2, :cond_6

    invoke-virtual {p1, v4}, LU;->A(I)LE;

    move-result-object p1

    invoke-static {p1}, LZ;->z(Ljava/lang/Object;)LZ;

    move-result-object p1

    invoke-static {p1, v3}, LO;->z(LZ;Z)LO;

    move-result-object p1

    invoke-virtual {p1}, LO;->C()[B

    move-result-object p1

    invoke-static {p1}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LKH6;->i:[B

    goto :goto_3

    :cond_6
    const/4 p1, 0x0

    iput-object p1, p0, LKH6;->i:[B

    :goto_3
    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "keySeq should be 5 or 6 in length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static s(Ljava/lang/Object;)LKH6;
    .locals 1

    instance-of v0, p0, LKH6;

    if-eqz v0, :cond_0

    check-cast p0, LKH6;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, LKH6;

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    invoke-direct {v0, p0}, LKH6;-><init>(LU;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public c()LS;
    .locals 7

    new-instance v0, LF;

    invoke-direct {v0}, LF;-><init>()V

    iget-wide v1, p0, LKH6;->d:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-ltz v1, :cond_0

    new-instance v1, LK;

    const-wide/16 v5, 0x1

    invoke-direct {v1, v5, v6}, LK;-><init>(J)V

    goto :goto_0

    :cond_0
    new-instance v1, LK;

    invoke-direct {v1, v3, v4}, LK;-><init>(J)V

    :goto_0
    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LF;

    invoke-direct {v1}, LF;-><init>()V

    new-instance v2, LK;

    iget-wide v5, p0, LKH6;->c:J

    invoke-direct {v2, v5, v6}, LK;-><init>(J)V

    invoke-virtual {v1, v2}, LF;->a(LE;)V

    new-instance v2, LVF0;

    iget-object v5, p0, LKH6;->e:[B

    invoke-direct {v2, v5}, LVF0;-><init>([B)V

    invoke-virtual {v1, v2}, LF;->a(LE;)V

    new-instance v2, LVF0;

    iget-object v5, p0, LKH6;->f:[B

    invoke-direct {v2, v5}, LVF0;-><init>([B)V

    invoke-virtual {v1, v2}, LF;->a(LE;)V

    new-instance v2, LVF0;

    iget-object v5, p0, LKH6;->g:[B

    invoke-direct {v2, v5}, LVF0;-><init>([B)V

    invoke-virtual {v1, v2}, LF;->a(LE;)V

    new-instance v2, LVF0;

    iget-object v5, p0, LKH6;->h:[B

    invoke-direct {v2, v5}, LVF0;-><init>([B)V

    invoke-virtual {v1, v2}, LF;->a(LE;)V

    iget-wide v5, p0, LKH6;->d:J

    cmp-long v2, v5, v3

    const/4 v3, 0x0

    if-ltz v2, :cond_1

    new-instance v2, LcG0;

    new-instance v4, LK;

    invoke-direct {v4, v5, v6}, LK;-><init>(J)V

    invoke-direct {v2, v3, v3, v4}, LcG0;-><init>(ZILE;)V

    invoke-virtual {v1, v2}, LF;->a(LE;)V

    :cond_1
    new-instance v2, LZF0;

    invoke-direct {v2, v1}, LZF0;-><init>(LF;)V

    invoke-virtual {v0, v2}, LF;->a(LE;)V

    new-instance v1, LcG0;

    new-instance v2, LVF0;

    iget-object v4, p0, LKH6;->i:[B

    invoke-direct {v2, v4}, LVF0;-><init>([B)V

    const/4 v4, 0x1

    invoke-direct {v1, v4, v3, v2}, LcG0;-><init>(ZILE;)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method

.method public j()[B
    .locals 1

    iget-object v0, p0, LKH6;->i:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method

.method public o()J
    .locals 2

    iget-wide v0, p0, LKH6;->c:J

    return-wide v0
.end method

.method public u()J
    .locals 2

    iget-wide v0, p0, LKH6;->d:J

    return-wide v0
.end method

.method public v()[B
    .locals 1

    iget-object v0, p0, LKH6;->g:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method

.method public w()[B
    .locals 1

    iget-object v0, p0, LKH6;->h:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method

.method public x()[B
    .locals 1

    iget-object v0, p0, LKH6;->f:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method

.method public y()[B
    .locals 1

    iget-object v0, p0, LKH6;->e:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method

.method public z()I
    .locals 1

    iget v0, p0, LKH6;->b:I

    return v0
.end method

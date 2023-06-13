.class public LUH6;
.super LM;
.source "SourceFile"


# instance fields
.field public final b:[B

.field public final c:[B


# direct methods
.method public constructor <init>(LU;)V
    .locals 2

    invoke-direct {p0}, LM;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v1

    invoke-static {v1}, LK;->A(Ljava/lang/Object;)LK;

    move-result-object v1

    invoke-virtual {v1, v0}, LK;->D(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    invoke-static {v0}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v0

    invoke-virtual {v0}, LO;->C()[B

    move-result-object v0

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    iput-object v0, p0, LUH6;->b:[B

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object p1

    invoke-static {p1}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object p1

    invoke-virtual {p1}, LO;->C()[B

    move-result-object p1

    invoke-static {p1}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LUH6;->c:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unknown version of sequence"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([B[B)V
    .locals 0

    invoke-direct {p0}, LM;-><init>()V

    invoke-static {p1}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LUH6;->b:[B

    invoke-static {p2}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LUH6;->c:[B

    return-void
.end method

.method public static j(Ljava/lang/Object;)LUH6;
    .locals 1

    instance-of v0, p0, LUH6;

    if-eqz v0, :cond_0

    check-cast p0, LUH6;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, LUH6;

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    invoke-direct {v0, p0}, LUH6;-><init>(LU;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public c()LS;
    .locals 4

    new-instance v0, LF;

    invoke-direct {v0}, LF;-><init>()V

    new-instance v1, LK;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, LK;-><init>(J)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LVF0;

    iget-object v2, p0, LUH6;->b:[B

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LVF0;

    iget-object v2, p0, LUH6;->c:[B

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method

.method public o()[B
    .locals 1

    iget-object v0, p0, LUH6;->b:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method

.method public s()[B
    .locals 1

    iget-object v0, p0, LUH6;->c:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method

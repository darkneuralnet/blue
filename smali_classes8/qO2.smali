.class public LqO2;
.super LM;
.source "SourceFile"


# instance fields
.field public b:I

.field public c:I

.field public d:[B

.field public e:[B

.field public f:[B

.field public g:[B

.field public h:[B


# direct methods
.method public constructor <init>(IILPA1;LTX3;LhR3;LhR3;LOA1;)V
    .locals 0

    invoke-direct {p0}, LM;-><init>()V

    iput p1, p0, LqO2;->b:I

    iput p2, p0, LqO2;->c:I

    invoke-virtual {p3}, LPA1;->e()[B

    move-result-object p1

    iput-object p1, p0, LqO2;->d:[B

    invoke-virtual {p4}, LTX3;->h()[B

    move-result-object p1

    iput-object p1, p0, LqO2;->e:[B

    invoke-virtual {p7}, LOA1;->c()[B

    move-result-object p1

    iput-object p1, p0, LqO2;->f:[B

    invoke-virtual {p5}, LhR3;->a()[B

    move-result-object p1

    iput-object p1, p0, LqO2;->g:[B

    invoke-virtual {p6}, LhR3;->a()[B

    move-result-object p1

    iput-object p1, p0, LqO2;->h:[B

    return-void
.end method

.method public constructor <init>(LU;)V
    .locals 1

    invoke-direct {p0}, LM;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    check-cast v0, LK;

    invoke-virtual {v0}, LK;->F()I

    move-result v0

    iput v0, p0, LqO2;->b:I

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    check-cast v0, LK;

    invoke-virtual {v0}, LK;->F()I

    move-result v0

    iput v0, p0, LqO2;->c:I

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    check-cast v0, LO;

    invoke-virtual {v0}, LO;->C()[B

    move-result-object v0

    iput-object v0, p0, LqO2;->d:[B

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    check-cast v0, LO;

    invoke-virtual {v0}, LO;->C()[B

    move-result-object v0

    iput-object v0, p0, LqO2;->e:[B

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    check-cast v0, LO;

    invoke-virtual {v0}, LO;->C()[B

    move-result-object v0

    iput-object v0, p0, LqO2;->g:[B

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    check-cast v0, LO;

    invoke-virtual {v0}, LO;->C()[B

    move-result-object v0

    iput-object v0, p0, LqO2;->h:[B

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object p1

    check-cast p1, LO;

    invoke-virtual {p1}, LO;->C()[B

    move-result-object p1

    iput-object p1, p0, LqO2;->f:[B

    return-void
.end method

.method public static s(Ljava/lang/Object;)LqO2;
    .locals 1

    instance-of v0, p0, LqO2;

    if-eqz v0, :cond_0

    check-cast p0, LqO2;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, LqO2;

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    invoke-direct {v0, p0}, LqO2;-><init>(LU;)V

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

    iget v2, p0, LqO2;->b:I

    int-to-long v2, v2

    invoke-direct {v1, v2, v3}, LK;-><init>(J)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LK;

    iget v2, p0, LqO2;->c:I

    int-to-long v2, v2

    invoke-direct {v1, v2, v3}, LK;-><init>(J)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LVF0;

    iget-object v2, p0, LqO2;->d:[B

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LVF0;

    iget-object v2, p0, LqO2;->e:[B

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LVF0;

    iget-object v2, p0, LqO2;->g:[B

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LVF0;

    iget-object v2, p0, LqO2;->h:[B

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LVF0;

    iget-object v2, p0, LqO2;->f:[B

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method

.method public j()LPA1;
    .locals 2

    new-instance v0, LPA1;

    iget-object v1, p0, LqO2;->d:[B

    invoke-direct {v0, v1}, LPA1;-><init>([B)V

    return-object v0
.end method

.method public o()LTX3;
    .locals 3

    new-instance v0, LTX3;

    invoke-virtual {p0}, LqO2;->j()LPA1;

    move-result-object v1

    iget-object v2, p0, LqO2;->e:[B

    invoke-direct {v0, v1, v2}, LTX3;-><init>(LPA1;[B)V

    return-object v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, LqO2;->c:I

    return v0
.end method

.method public v()I
    .locals 1

    iget v0, p0, LqO2;->b:I

    return v0
.end method

.method public w()LhR3;
    .locals 2

    new-instance v0, LhR3;

    iget-object v1, p0, LqO2;->g:[B

    invoke-direct {v0, v1}, LhR3;-><init>([B)V

    return-object v0
.end method

.method public x()LhR3;
    .locals 2

    new-instance v0, LhR3;

    iget-object v1, p0, LqO2;->h:[B

    invoke-direct {v0, v1}, LhR3;-><init>([B)V

    return-object v0
.end method

.method public y()LOA1;
    .locals 2

    new-instance v0, LOA1;

    iget-object v1, p0, LqO2;->f:[B

    invoke-direct {v0, v1}, LOA1;-><init>([B)V

    return-object v0
.end method

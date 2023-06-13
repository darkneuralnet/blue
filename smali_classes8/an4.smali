.class public Lan4;
.super LM;
.source "SourceFile"


# instance fields
.field public b:LK;

.field public c:LN;

.field public d:LK;

.field public e:[[B

.field public f:[[B

.field public g:[B


# direct methods
.method public constructor <init>(I[[S[[S[S)V
    .locals 3

    invoke-direct {p0}, LM;-><init>()V

    new-instance v0, LK;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, LK;-><init>(J)V

    iput-object v0, p0, Lan4;->b:LK;

    new-instance v0, LK;

    int-to-long v1, p1

    invoke-direct {v0, v1, v2}, LK;-><init>(J)V

    iput-object v0, p0, Lan4;->d:LK;

    invoke-static {p2}, Lcn4;->c([[S)[[B

    move-result-object p1

    iput-object p1, p0, Lan4;->e:[[B

    invoke-static {p3}, Lcn4;->c([[S)[[B

    move-result-object p1

    iput-object p1, p0, Lan4;->f:[[B

    invoke-static {p4}, Lcn4;->a([S)[B

    move-result-object p1

    iput-object p1, p0, Lan4;->g:[B

    return-void
.end method

.method public constructor <init>(LU;)V
    .locals 5

    invoke-direct {p0}, LM;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v1

    instance-of v1, v1, LK;

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v1

    invoke-static {v1}, LK;->A(Ljava/lang/Object;)LK;

    move-result-object v1

    iput-object v1, p0, Lan4;->b:LK;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v1

    invoke-static {v1}, LN;->F(Ljava/lang/Object;)LN;

    move-result-object v1

    iput-object v1, p0, Lan4;->c:LN;

    :goto_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, LU;->A(I)LE;

    move-result-object v1

    invoke-static {v1}, LK;->A(Ljava/lang/Object;)LK;

    move-result-object v1

    iput-object v1, p0, Lan4;->d:LK;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, LU;->A(I)LE;

    move-result-object v1

    invoke-static {v1}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object v1

    invoke-virtual {v1}, LU;->size()I

    move-result v2

    new-array v2, v2, [[B

    iput-object v2, p0, Lan4;->e:[[B

    move v2, v0

    :goto_1
    invoke-virtual {v1}, LU;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lan4;->e:[[B

    invoke-virtual {v1, v2}, LU;->A(I)LE;

    move-result-object v4

    invoke-static {v4}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v4

    invoke-virtual {v4}, LO;->C()[B

    move-result-object v4

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x3

    invoke-virtual {p1, v1}, LU;->A(I)LE;

    move-result-object v1

    check-cast v1, LU;

    invoke-virtual {v1}, LU;->size()I

    move-result v2

    new-array v2, v2, [[B

    iput-object v2, p0, Lan4;->f:[[B

    move v2, v0

    :goto_2
    invoke-virtual {v1}, LU;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    iget-object v3, p0, Lan4;->f:[[B

    invoke-virtual {v1, v2}, LU;->A(I)LE;

    move-result-object v4

    invoke-static {v4}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v4

    invoke-virtual {v4}, LO;->C()[B

    move-result-object v4

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x4

    invoke-virtual {p1, v1}, LU;->A(I)LE;

    move-result-object p1

    check-cast p1, LU;

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object p1

    invoke-static {p1}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object p1

    invoke-virtual {p1}, LO;->C()[B

    move-result-object p1

    iput-object p1, p0, Lan4;->g:[B

    return-void
.end method

.method public static v(Ljava/lang/Object;)Lan4;
    .locals 1

    instance-of v0, p0, Lan4;

    if-eqz v0, :cond_0

    check-cast p0, Lan4;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, Lan4;

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    invoke-direct {v0, p0}, Lan4;-><init>(LU;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public c()LS;
    .locals 6

    new-instance v0, LF;

    invoke-direct {v0}, LF;-><init>()V

    iget-object v1, p0, Lan4;->b:LK;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lan4;->c:LN;

    :goto_0
    invoke-virtual {v0, v1}, LF;->a(LE;)V

    iget-object v1, p0, Lan4;->d:LK;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LF;

    invoke-direct {v1}, LF;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    iget-object v4, p0, Lan4;->e:[[B

    array-length v5, v4

    if-ge v3, v5, :cond_1

    new-instance v5, LVF0;

    aget-object v4, v4, v3

    invoke-direct {v5, v4}, LVF0;-><init>([B)V

    invoke-virtual {v1, v5}, LF;->a(LE;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    new-instance v3, LZF0;

    invoke-direct {v3, v1}, LZF0;-><init>(LF;)V

    invoke-virtual {v0, v3}, LF;->a(LE;)V

    new-instance v1, LF;

    invoke-direct {v1}, LF;-><init>()V

    :goto_2
    iget-object v3, p0, Lan4;->f:[[B

    array-length v4, v3

    if-ge v2, v4, :cond_2

    new-instance v4, LVF0;

    aget-object v3, v3, v2

    invoke-direct {v4, v3}, LVF0;-><init>([B)V

    invoke-virtual {v1, v4}, LF;->a(LE;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    new-instance v2, LZF0;

    invoke-direct {v2, v1}, LZF0;-><init>(LF;)V

    invoke-virtual {v0, v2}, LF;->a(LE;)V

    new-instance v1, LF;

    invoke-direct {v1}, LF;-><init>()V

    new-instance v2, LVF0;

    iget-object v3, p0, Lan4;->g:[B

    invoke-direct {v2, v3}, LVF0;-><init>([B)V

    invoke-virtual {v1, v2}, LF;->a(LE;)V

    new-instance v2, LZF0;

    invoke-direct {v2, v1}, LZF0;-><init>(LF;)V

    invoke-virtual {v0, v2}, LF;->a(LE;)V

    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method

.method public j()[[S
    .locals 1

    iget-object v0, p0, Lan4;->e:[[B

    invoke-static {v0}, Lcn4;->d([[B)[[S

    move-result-object v0

    return-object v0
.end method

.method public o()[S
    .locals 1

    iget-object v0, p0, Lan4;->g:[B

    invoke-static {v0}, Lcn4;->b([B)[S

    move-result-object v0

    return-object v0
.end method

.method public s()[[S
    .locals 1

    iget-object v0, p0, Lan4;->f:[[B

    invoke-static {v0}, Lcn4;->d([[B)[[S

    move-result-object v0

    return-object v0
.end method

.method public u()I
    .locals 1

    iget-object v0, p0, Lan4;->d:LK;

    invoke-virtual {v0}, LK;->F()I

    move-result v0

    return v0
.end method

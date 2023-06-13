.class public abstract LH;
.super LS;
.source "SourceFile"


# instance fields
.field public b:LN;

.field public c:LK;

.field public d:LS;

.field public e:I

.field public f:LS;


# direct methods
.method public constructor <init>(LF;)V
    .locals 4

    invoke-direct {p0}, LS;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LH;->z(LF;I)LS;

    move-result-object v1

    instance-of v2, v1, LN;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    check-cast v1, LN;

    iput-object v1, p0, LH;->b:LN;

    invoke-virtual {p0, p1, v3}, LH;->z(LF;I)LS;

    move-result-object v1

    move v0, v3

    :cond_0
    instance-of v2, v1, LK;

    if-eqz v2, :cond_1

    check-cast v1, LK;

    iput-object v1, p0, LH;->c:LK;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, p1, v0}, LH;->z(LF;I)LS;

    move-result-object v1

    :cond_1
    instance-of v2, v1, LZ;

    if-nez v2, :cond_2

    iput-object v1, p0, LH;->d:LS;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, p1, v0}, LH;->z(LF;I)LS;

    move-result-object v1

    :cond_2
    invoke-virtual {p1}, LF;->f()I

    move-result p1

    add-int/2addr v0, v3

    if-ne p1, v0, :cond_4

    instance-of p1, v1, LZ;

    if-eqz p1, :cond_3

    check-cast v1, LZ;

    invoke-virtual {v1}, LZ;->C()I

    move-result p1

    invoke-virtual {p0, p1}, LH;->D(I)V

    invoke-virtual {v1}, LZ;->A()LS;

    move-result-object p1

    iput-object p1, p0, LH;->f:LS;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No tagged object found in vector. Structure doesn\'t seem to be of type External"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "input vector too large"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(LN;LK;LS;ILS;)V
    .locals 0

    invoke-direct {p0}, LS;-><init>()V

    invoke-virtual {p0, p1}, LH;->C(LN;)V

    invoke-virtual {p0, p2}, LH;->F(LK;)V

    invoke-virtual {p0, p3}, LH;->A(LS;)V

    invoke-virtual {p0, p4}, LH;->D(I)V

    invoke-virtual {p5}, LS;->c()LS;

    move-result-object p1

    invoke-virtual {p0, p1}, LH;->E(LS;)V

    return-void
.end method


# virtual methods
.method public final A(LS;)V
    .locals 0

    iput-object p1, p0, LH;->d:LS;

    return-void
.end method

.method public final C(LN;)V
    .locals 0

    iput-object p1, p0, LH;->b:LN;

    return-void
.end method

.method public final D(I)V
    .locals 3

    if-ltz p1, :cond_0

    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    iput p1, p0, LH;->e:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid encoding value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final E(LS;)V
    .locals 0

    iput-object p1, p0, LH;->f:LS;

    return-void
.end method

.method public final F(LK;)V
    .locals 0

    iput-object p1, p0, LH;->c:LK;

    return-void
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LH;->b:LN;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LN;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LH;->c:LK;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LK;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, LH;->d:LS;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LS;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, LH;->f:LS;

    invoke-virtual {v1}, LS;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public j(LS;)Z
    .locals 3

    instance-of v0, p1, LH;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-ne p0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    check-cast p1, LH;

    iget-object v0, p0, LH;->b:LN;

    if-eqz v0, :cond_3

    iget-object v2, p1, LH;->b:LN;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v0}, LS;->u(LS;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    return v1

    :cond_3
    iget-object v0, p0, LH;->c:LK;

    if-eqz v0, :cond_5

    iget-object v2, p1, LH;->c:LK;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v0}, LS;->u(LS;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    return v1

    :cond_5
    iget-object v0, p0, LH;->d:LS;

    if-eqz v0, :cond_7

    iget-object v2, p1, LH;->d:LS;

    if-eqz v2, :cond_6

    invoke-virtual {v2, v0}, LS;->u(LS;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    return v1

    :cond_7
    iget-object v0, p0, LH;->f:LS;

    iget-object p1, p1, LH;->f:LS;

    invoke-virtual {v0, p1}, LS;->u(LS;)Z

    move-result p1

    return p1
.end method

.method public s()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LM;->getEncoded()[B

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x()LS;
    .locals 7

    new-instance v6, LNF0;

    iget-object v1, p0, LH;->b:LN;

    iget-object v2, p0, LH;->c:LK;

    iget-object v3, p0, LH;->d:LS;

    iget v4, p0, LH;->e:I

    iget-object v5, p0, LH;->f:LS;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LNF0;-><init>(LN;LK;LS;ILS;)V

    return-object v6
.end method

.method public y()LS;
    .locals 7

    new-instance v6, LjG0;

    iget-object v1, p0, LH;->b:LN;

    iget-object v2, p0, LH;->c:LK;

    iget-object v3, p0, LH;->d:LS;

    iget v4, p0, LH;->e:I

    iget-object v5, p0, LH;->f:LS;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LjG0;-><init>(LN;LK;LS;ILS;)V

    return-object v6
.end method

.method public final z(LF;I)LS;
    .locals 1

    invoke-virtual {p1}, LF;->f()I

    move-result v0

    if-le v0, p2, :cond_0

    invoke-virtual {p1, p2}, LF;->d(I)LE;

    move-result-object p1

    invoke-interface {p1}, LE;->c()LS;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "too few objects in input vector"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

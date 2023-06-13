.class public abstract LB;
.super LS;
.source "SourceFile"


# instance fields
.field public final b:Z

.field public final c:I

.field public final d:[B


# direct methods
.method public constructor <init>(ZI[B)V
    .locals 0

    invoke-direct {p0}, LS;-><init>()V

    iput-boolean p1, p0, LB;->b:Z

    iput p2, p0, LB;->c:I

    invoke-static {p3}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LB;->d:[B

    return-void
.end method


# virtual methods
.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, LB;->b:Z

    iget v1, p0, LB;->c:I

    xor-int/2addr v0, v1

    iget-object v1, p0, LB;->d:[B

    invoke-static {v1}, LAo;->k([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public j(LS;)Z
    .locals 3

    instance-of v0, p1, LB;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LB;

    iget-boolean v0, p0, LB;->b:Z

    iget-boolean v2, p1, LB;->b:Z

    if-ne v0, v2, :cond_1

    iget v0, p0, LB;->c:I

    iget v2, p1, LB;->c:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, LB;->d:[B

    iget-object p1, p1, LB;->d:[B

    invoke-static {v0, p1}, LAo;->a([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public o(LQ;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LB;->b:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x60

    goto :goto_0

    :cond_0
    const/16 v0, 0x40

    :goto_0
    iget v1, p0, LB;->c:I

    iget-object v2, p0, LB;->d:[B

    invoke-virtual {p1, p2, v0, v1, v2}, LQ;->m(ZII[B)V

    return-void
.end method

.method public s()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LB;->c:I

    invoke-static {v0}, LER5;->b(I)I

    move-result v0

    iget-object v1, p0, LB;->d:[B

    array-length v1, v1

    invoke-static {v1}, LER5;->a(I)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, LB;->d:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, LB;->w()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "CONSTRUCTED "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    const-string v1, "APPLICATION "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, LB;->z()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, LB;->d:[B

    if-eqz v1, :cond_1

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, LB;->d:[B

    invoke-static {v1}, LLL1;->c([B)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, " #null"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, LB;->b:Z

    return v0
.end method

.method public z()I
    .locals 1

    iget v0, p0, LB;->c:I

    return v0
.end method

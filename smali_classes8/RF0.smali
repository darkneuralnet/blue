.class public LRF0;
.super LS;
.source "SourceFile"


# instance fields
.field public final b:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, LS;-><init>()V

    invoke-static {p1}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LRF0;->b:[B

    return-void
.end method


# virtual methods
.method public hashCode()I
    .locals 1

    iget-object v0, p0, LRF0;->b:[B

    invoke-static {v0}, LAo;->k([B)I

    move-result v0

    return v0
.end method

.method public j(LS;)Z
    .locals 1

    instance-of v0, p1, LRF0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LRF0;

    iget-object v0, p0, LRF0;->b:[B

    iget-object p1, p1, LRF0;->b:[B

    invoke-static {v0, p1}, LAo;->a([B[B)Z

    move-result p1

    return p1
.end method

.method public o(LQ;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x19

    iget-object v1, p0, LRF0;->b:[B

    invoke-virtual {p1, p2, v0, v1}, LQ;->n(ZI[B)V

    return-void
.end method

.method public s()I
    .locals 2

    iget-object v0, p0, LRF0;->b:[B

    array-length v0, v0

    invoke-static {v0}, LER5;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LRF0;->b:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

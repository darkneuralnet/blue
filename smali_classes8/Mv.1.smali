.class public LMv;
.super LU;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LU;-><init>()V

    return-void
.end method

.method public constructor <init>(LF;)V
    .locals 0

    invoke-direct {p0, p1}, LU;-><init>(LF;)V

    return-void
.end method


# virtual methods
.method public o(LQ;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x30

    iget-object v1, p0, LU;->b:[LE;

    invoke-virtual {p1, p2, v0, v1}, LQ;->q(ZI[LE;)V

    return-void
.end method

.method public s()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LU;->b:[LE;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, LU;->b:[LE;

    aget-object v3, v3, v1

    invoke-interface {v3}, LE;->c()LS;

    move-result-object v3

    invoke-virtual {v3}, LS;->s()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, 0x2

    return v2
.end method

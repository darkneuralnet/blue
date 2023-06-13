.class public LVF0;
.super LO;
.source "SourceFile"


# direct methods
.method public constructor <init>(LE;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p1}, LE;->c()LS;

    move-result-object p1

    const-string v0, "DER"

    invoke-virtual {p1, v0}, LM;->h(Ljava/lang/String;)[B

    move-result-object p1

    invoke-direct {p0, p1}, LO;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0, p1}, LO;-><init>([B)V

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

    const/4 v0, 0x4

    iget-object v1, p0, LO;->b:[B

    invoke-virtual {p1, p2, v0, v1}, LQ;->n(ZI[B)V

    return-void
.end method

.method public s()I
    .locals 2

    iget-object v0, p0, LO;->b:[B

    array-length v0, v0

    invoke-static {v0}, LER5;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LO;->b:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x()LS;
    .locals 0

    return-object p0
.end method

.method public y()LS;
    .locals 0

    return-object p0
.end method

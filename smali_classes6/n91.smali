.class public Ln91;
.super Lj91;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final g:I

.field public transient h:[B

.field public transient i:[B

.field public transient j:Ljava/lang/String;

.field public transient k:Ljava/lang/String;

.field public transient l:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0x16

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/16 v2, 0x17

    invoke-direct {p0, v2, v0, v1}, Ln91;-><init>(II[B)V

    return-void

    nop

    :array_0
    .array-data 1
        -0x56t
        -0x2t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(II[B)V
    .locals 1

    sget-object v0, Lj91$a;->b:Lj91$a;

    invoke-direct {p0, p1, p2, p3, v0}, Lj91;-><init>(II[BLj91$a;)V

    invoke-virtual {p0, p3}, Ln91;->e([B)I

    move-result p1

    iput p1, p0, Ln91;->g:I

    return-void
.end method


# virtual methods
.method public final e([B)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x4

    if-gt v1, v0, :cond_0

    const/4 v0, 0x3

    aget-byte p1, p1, v0

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public f()[B
    .locals 3

    iget-object v0, p0, Ln91;->i:[B

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lg;->a()[B

    move-result-object v0

    const/16 v1, 0xe

    const/16 v2, 0x14

    invoke-static {v0, v1, v2}, LR70;->b([BII)[B

    move-result-object v0

    iput-object v0, p0, Ln91;->i:[B

    :cond_0
    iget-object v0, p0, Ln91;->i:[B

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ln91;->k:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln91;->f()[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, LR70;->e([BZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ln91;->k:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Ln91;->k:Ljava/lang/String;

    return-object v0
.end method

.method public h()[B
    .locals 3

    iget-object v0, p0, Ln91;->h:[B

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lg;->a()[B

    move-result-object v0

    const/4 v1, 0x4

    const/16 v2, 0xe

    invoke-static {v0, v1, v2}, LR70;->b([BII)[B

    move-result-object v0

    iput-object v0, p0, Ln91;->h:[B

    :cond_0
    iget-object v0, p0, Ln91;->h:[B

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ln91;->j:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln91;->h()[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, LR70;->e([BZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ln91;->j:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Ln91;->j:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Ln91;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Ln91;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p0}, Ln91;->i()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p0}, Ln91;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "EddyStoneUID(TxPower=%d,NamespaceId=%s,InstanceId=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ln91;->l:Ljava/lang/String;

    return-object v0
.end method

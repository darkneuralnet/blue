.class public final LZc6;
.super Led6;
.source "SourceFile"


# instance fields
.field public final i:Led6;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Led6;-><init>()V

    new-instance v0, LE81;

    invoke-direct {v0}, LE81;-><init>()V

    iput-object v0, p0, LZc6;->i:Led6;

    return-void
.end method

.method public static r(LbN4;)LbN4;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    invoke-virtual {p0}, LbN4;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-ne v1, v2, :cond_1

    new-instance v1, LbN4;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LbN4;->e()[LfN4;

    move-result-object v2

    sget-object v3, LQx;->p:LQx;

    const/4 v4, 0x0

    invoke-direct {v1, v0, v4, v2, v3}, LbN4;-><init>(Ljava/lang/String;[B[LfN4;LQx;)V

    invoke-virtual {p0}, LbN4;->d()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LbN4;->d()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {v1, p0}, LbN4;->g(Ljava/util/Map;)V

    :cond_0
    return-object v1

    :cond_1
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a(LTG;Ljava/util/Map;)LbN4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTG;",
            "Ljava/util/Map<",
            "LqV0;",
            "*>;)",
            "LbN4;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    iget-object v0, p0, LZc6;->i:Led6;

    invoke-virtual {v0, p1, p2}, Lzh3;->a(LTG;Ljava/util/Map;)LbN4;

    move-result-object p1

    invoke-static {p1}, LZc6;->r(LbN4;)LbN4;

    move-result-object p1

    return-object p1
.end method

.method public b(ILCT;Ljava/util/Map;)LbN4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LCT;",
            "Ljava/util/Map<",
            "LqV0;",
            "*>;)",
            "LbN4;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    iget-object v0, p0, LZc6;->i:Led6;

    invoke-virtual {v0, p1, p2, p3}, Led6;->b(ILCT;Ljava/util/Map;)LbN4;

    move-result-object p1

    invoke-static {p1}, LZc6;->r(LbN4;)LbN4;

    move-result-object p1

    return-object p1
.end method

.method public k(LCT;[ILjava/lang/StringBuilder;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    iget-object v0, p0, LZc6;->i:Led6;

    invoke-virtual {v0, p1, p2, p3}, Led6;->k(LCT;[ILjava/lang/StringBuilder;)I

    move-result p1

    return p1
.end method

.method public l(ILCT;[ILjava/util/Map;)LbN4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LCT;",
            "[I",
            "Ljava/util/Map<",
            "LqV0;",
            "*>;)",
            "LbN4;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    iget-object v0, p0, LZc6;->i:Led6;

    invoke-virtual {v0, p1, p2, p3, p4}, Led6;->l(ILCT;[ILjava/util/Map;)LbN4;

    move-result-object p1

    invoke-static {p1}, LZc6;->r(LbN4;)LbN4;

    move-result-object p1

    return-object p1
.end method

.method public p()LQx;
    .locals 1

    sget-object v0, LQx;->p:LQx;

    return-object v0
.end method

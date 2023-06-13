.class public final LeO2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWr4;


# static fields
.field public static final b:[LfN4;


# instance fields
.field public final a:LEV0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [LfN4;

    sput-object v0, LeO2;->b:[LfN4;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LEV0;

    invoke-direct {v0}, LEV0;-><init>()V

    iput-object v0, p0, LeO2;->a:LEV0;

    return-void
.end method

.method public static b(LET;)LET;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    invoke-virtual {p0}, LET;->k()[I

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v3, v0, v3

    const/4 v4, 0x2

    aget v5, v0, v4

    const/4 v6, 0x3

    aget v0, v0, v6

    new-instance v6, LET;

    const/16 v7, 0x1e

    const/16 v8, 0x21

    invoke-direct {v6, v7, v8}, LET;-><init>(II)V

    move v9, v1

    :goto_0
    if-ge v9, v8, :cond_2

    mul-int v10, v9, v0

    div-int/lit8 v11, v0, 0x2

    add-int/2addr v10, v11

    div-int/2addr v10, v8

    add-int/2addr v10, v3

    move v11, v1

    :goto_1
    if-ge v11, v7, :cond_1

    mul-int v12, v11, v5

    div-int/lit8 v13, v5, 0x2

    add-int/2addr v12, v13

    and-int/lit8 v13, v9, 0x1

    mul-int/2addr v13, v5

    div-int/2addr v13, v4

    add-int/2addr v12, v13

    div-int/2addr v12, v7

    add-int/2addr v12, v2

    invoke-virtual {p0, v12, v10}, LET;->h(II)Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-virtual {v6, v11, v9}, LET;->q(II)V

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    return-object v6

    :cond_3
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a(LTG;Ljava/util/Map;)LbN4;
    .locals 4
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
            Lcom/google/zxing/ChecksumException;,
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    if-eqz p2, :cond_1

    sget-object v0, LqV0;->d:LqV0;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LTG;->a()LET;

    move-result-object p1

    invoke-static {p1}, LeO2;->b(LET;)LET;

    move-result-object p1

    iget-object v0, p0, LeO2;->a:LEV0;

    invoke-virtual {v0, p1, p2}, LEV0;->b(LET;Ljava/util/Map;)LHV0;

    move-result-object p1

    new-instance p2, LbN4;

    invoke-virtual {p1}, LHV0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LHV0;->e()[B

    move-result-object v1

    sget-object v2, LeO2;->b:[LfN4;

    sget-object v3, LQx;->k:LQx;

    invoke-direct {p2, v0, v1, v2, v3}, LbN4;-><init>(Ljava/lang/String;[B[LfN4;LQx;)V

    invoke-virtual {p1}, LHV0;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, LdN4;->e:LdN4;

    invoke-virtual {p2, v0, p1}, LbN4;->h(LdN4;Ljava/lang/Object;)V

    :cond_0
    return-object p2

    :cond_1
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1
.end method

.method public reset()V
    .locals 0

    return-void
.end method

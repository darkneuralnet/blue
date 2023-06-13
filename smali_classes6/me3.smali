.class public final Lme3;
.super Lfh2;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final m:LIy;


# direct methods
.method public constructor <init>(LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LIy;",
            "LRk2;",
            "Ljava/util/Set<",
            "Lyk2;",
            ">;",
            "LE9;",
            "Ljava/lang/String;",
            "Ljava/net/URI;",
            "LIy;",
            "LIy;",
            "Ljava/util/List<",
            "LGy;",
            ">;",
            "Ljava/security/KeyStore;",
            ")V"
        }
    .end annotation

    move-object v0, p1

    sget-object v2, LOk2;->f:LOk2;

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lfh2;-><init>(LOk2;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V

    if-eqz v0, :cond_0

    move-object v1, p0

    iput-object v0, v1, Lme3;->m:LIy;

    return-void

    :cond_0
    move-object v1, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "The key value must not be null"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static p(Ljava/util/Map;)Lme3;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lme3;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    sget-object v0, LOk2;->f:LOk2;

    invoke-static {p0}, Lgh2;->d(Ljava/util/Map;)LOk2;

    move-result-object v1

    invoke-virtual {v0, v1}, LOk2;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v0, "k"

    invoke-static {p0, v0}, LMg2;->a(Ljava/util/Map;Ljava/lang/String;)LIy;

    move-result-object v4

    :try_start_0
    new-instance v0, Lme3;

    invoke-static {p0}, Lgh2;->e(Ljava/util/Map;)LRk2;

    move-result-object v5

    invoke-static {p0}, Lgh2;->c(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v6

    invoke-static {p0}, Lgh2;->a(Ljava/util/Map;)LE9;

    move-result-object v7

    invoke-static {p0}, Lgh2;->b(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    invoke-static {p0}, Lgh2;->i(Ljava/util/Map;)Ljava/net/URI;

    move-result-object v9

    invoke-static {p0}, Lgh2;->h(Ljava/util/Map;)LIy;

    move-result-object v10

    invoke-static {p0}, Lgh2;->g(Ljava/util/Map;)LIy;

    move-result-object v11

    invoke-static {p0}, Lgh2;->f(Ljava/util/Map;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v13}, Lme3;-><init>(LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/text/ParseException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_0
    new-instance p0, Ljava/text/ParseException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The key type kty must be "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LOk2;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lme3;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-super {p0, p1}, Lfh2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    check-cast p1, Lme3;

    iget-object v0, p0, Lme3;->m:LIy;

    iget-object p1, p1, Lme3;->m:LIy;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-super {p0}, Lfh2;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    iget-object v2, p0, Lme3;->m:LIy;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public m()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lfh2;->m()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lme3;->m:LIy;

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "k"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public o()LIy;
    .locals 1

    iget-object v0, p0, Lme3;->m:LIy;

    return-object v0
.end method

.method public q()[B
    .locals 1

    invoke-virtual {p0}, Lme3;->o()LIy;

    move-result-object v0

    invoke-virtual {v0}, LGy;->a()[B

    move-result-object v0

    return-object v0
.end method

.method public r(Ljava/lang/String;)Ljavax/crypto/SecretKey;
    .locals 2

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p0}, Lme3;->q()[B

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.class public Lle3;
.super Lfh2;
.source "SourceFile"


# static fields
.field public static final r:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LgF0;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final m:LgF0;

.field public final n:LIy;

.field public final o:[B

.field public final p:LIy;

.field public final q:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x4

    new-array v1, v1, [LgF0;

    const/4 v2, 0x0

    sget-object v3, LgF0;->j:LgF0;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    sget-object v3, LgF0;->k:LgF0;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    sget-object v3, LgF0;->l:LgF0;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    sget-object v3, LgF0;->m:LgF0;

    aput-object v3, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lle3;->r:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(LgF0;LIy;LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgF0;",
            "LIy;",
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

    move-object v11, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    sget-object v1, LOk2;->g:LOk2;

    move-object v0, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    invoke-direct/range {v0 .. v10}, Lfh2;-><init>(LOk2;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V

    if-eqz v12, :cond_3

    sget-object v0, Lle3;->r:Ljava/util/Set;

    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object v12, v11, Lle3;->m:LgF0;

    if-eqz v13, :cond_1

    iput-object v13, v11, Lle3;->n:LIy;

    invoke-virtual/range {p2 .. p2}, LGy;->a()[B

    move-result-object v0

    iput-object v0, v11, Lle3;->o:[B

    if-eqz v14, :cond_0

    iput-object v14, v11, Lle3;->p:LIy;

    invoke-virtual/range {p3 .. p3}, LGy;->a()[B

    move-result-object v0

    iput-object v0, v11, Lle3;->q:[B

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The \'d\' parameter must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The \'x\' parameter must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown / unsupported curve: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The curve must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(LgF0;LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgF0;",
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

    move-object v11, p0

    move-object v12, p1

    move-object/from16 v13, p2

    sget-object v1, LOk2;->g:LOk2;

    move-object v0, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    invoke-direct/range {v0 .. v10}, Lfh2;-><init>(LOk2;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V

    if-eqz v12, :cond_2

    sget-object v0, Lle3;->r:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object v12, v11, Lle3;->m:LgF0;

    if-eqz v13, :cond_0

    iput-object v13, v11, Lle3;->n:LIy;

    invoke-virtual/range {p2 .. p2}, LGy;->a()[B

    move-result-object v0

    iput-object v0, v11, Lle3;->o:[B

    const/4 v0, 0x0

    iput-object v0, v11, Lle3;->p:LIy;

    iput-object v0, v11, Lle3;->q:[B

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The \'x\' parameter must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown / unsupported curve: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The curve must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static o(Ljava/util/Map;)Lle3;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lle3;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    move-object/from16 v0, p0

    sget-object v1, LOk2;->g:LOk2;

    invoke-static/range {p0 .. p0}, Lgh2;->d(Ljava/util/Map;)LOk2;

    move-result-object v2

    invoke-virtual {v1, v2}, LOk2;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    :try_start_0
    const-string v1, "crv"

    invoke-static {v0, v1}, LMg2;->h(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LgF0;->d(Ljava/lang/String;)LgF0;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v1, "x"

    invoke-static {v0, v1}, LMg2;->a(Ljava/util/Map;Ljava/lang/String;)LIy;

    move-result-object v6

    const-string v1, "d"

    invoke-static {v0, v1}, LMg2;->a(Ljava/util/Map;Ljava/lang/String;)LIy;

    move-result-object v7

    if-nez v7, :cond_0

    :try_start_1
    new-instance v1, Lle3;

    invoke-static/range {p0 .. p0}, Lgh2;->e(Ljava/util/Map;)LRk2;

    move-result-object v7

    invoke-static/range {p0 .. p0}, Lgh2;->c(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v8

    invoke-static/range {p0 .. p0}, Lgh2;->a(Ljava/util/Map;)LE9;

    move-result-object v9

    invoke-static/range {p0 .. p0}, Lgh2;->b(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    invoke-static/range {p0 .. p0}, Lgh2;->i(Ljava/util/Map;)Ljava/net/URI;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lgh2;->h(Ljava/util/Map;)LIy;

    move-result-object v12

    invoke-static/range {p0 .. p0}, Lgh2;->g(Ljava/util/Map;)LIy;

    move-result-object v13

    invoke-static/range {p0 .. p0}, Lgh2;->f(Ljava/util/Map;)Ljava/util/List;

    move-result-object v14

    const/4 v15, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v15}, Lle3;-><init>(LgF0;LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V

    return-object v1

    :cond_0
    new-instance v1, Lle3;

    invoke-static/range {p0 .. p0}, Lgh2;->e(Ljava/util/Map;)LRk2;

    move-result-object v8

    invoke-static/range {p0 .. p0}, Lgh2;->c(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v9

    invoke-static/range {p0 .. p0}, Lgh2;->a(Ljava/util/Map;)LE9;

    move-result-object v10

    invoke-static/range {p0 .. p0}, Lgh2;->b(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lgh2;->i(Ljava/util/Map;)Ljava/net/URI;

    move-result-object v12

    invoke-static/range {p0 .. p0}, Lgh2;->h(Ljava/util/Map;)LIy;

    move-result-object v13

    invoke-static/range {p0 .. p0}, Lgh2;->g(Ljava/util/Map;)LIy;

    move-result-object v14

    invoke-static/range {p0 .. p0}, Lgh2;->f(Ljava/util/Map;)Ljava/util/List;

    move-result-object v15

    const/16 v16, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v16}, Lle3;-><init>(LgF0;LIy;LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_1
    new-instance v0, Ljava/text/ParseException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "The key type kty must be "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, LOk2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lle3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-super {p0, p1}, Lfh2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    check-cast p1, Lle3;

    iget-object v1, p0, Lle3;->m:LgF0;

    iget-object v3, p1, Lle3;->m:LgF0;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lle3;->n:LIy;

    iget-object v3, p1, Lle3;->n:LIy;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lle3;->o:[B

    iget-object v3, p1, Lle3;->o:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lle3;->p:LIy;

    iget-object v3, p1, Lle3;->p:LIy;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lle3;->q:[B

    iget-object p1, p1, Lle3;->q:[B

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    invoke-super {p0}, Lfh2;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    iget-object v2, p0, Lle3;->m:LgF0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lle3;->n:LIy;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lle3;->p:LIy;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lle3;->o:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lle3;->q:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lle3;->p:LIy;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
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

    iget-object v1, p0, Lle3;->m:LgF0;

    invoke-virtual {v1}, LgF0;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "crv"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lle3;->n:LIy;

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "x"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lle3;->p:LIy;

    if-eqz v1, :cond_0

    const-string v2, "d"

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

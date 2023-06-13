.class public final LQ81;
.super Lfh2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ81$a;
    }
.end annotation


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

.field public final o:LIy;

.field public final p:LIy;

.field public final q:Ljava/security/PrivateKey;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x4

    new-array v1, v1, [LgF0;

    const/4 v2, 0x0

    sget-object v3, LgF0;->e:LgF0;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    sget-object v3, LgF0;->f:LgF0;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    sget-object v3, LgF0;->h:LgF0;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    sget-object v3, LgF0;->i:LgF0;

    aput-object v3, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LQ81;->r:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(LgF0;LIy;LIy;LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgF0;",
            "LIy;",
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

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    move-object/from16 v15, p4

    sget-object v1, LOk2;->d:LOk2;

    move-object/from16 v0, p0

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lfh2;-><init>(LOk2;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V

    if-eqz v12, :cond_3

    iput-object v12, v11, LQ81;->m:LgF0;

    if-eqz v13, :cond_2

    iput-object v13, v11, LQ81;->n:LIy;

    if-eqz v14, :cond_1

    iput-object v14, v11, LQ81;->o:LIy;

    invoke-static/range {p1 .. p3}, LQ81;->q(LgF0;LIy;LIy;)V

    invoke-virtual/range {p0 .. p0}, Lfh2;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v11, v0}, LQ81;->p(Ljava/util/List;)V

    if-eqz v15, :cond_0

    iput-object v15, v11, LQ81;->p:LIy;

    const/4 v0, 0x0

    iput-object v0, v11, LQ81;->q:Ljava/security/PrivateKey;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The \'d\' coordinate must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The \'y\' coordinate must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The \'x\' coordinate must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The curve must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
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

    sget-object v1, LOk2;->d:LOk2;

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

    if-eqz v12, :cond_2

    iput-object v12, v11, LQ81;->m:LgF0;

    if-eqz v13, :cond_1

    iput-object v13, v11, LQ81;->n:LIy;

    if-eqz v14, :cond_0

    iput-object v14, v11, LQ81;->o:LIy;

    invoke-static/range {p1 .. p3}, LQ81;->q(LgF0;LIy;LIy;)V

    invoke-virtual {p0}, Lfh2;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, LQ81;->p(Ljava/util/List;)V

    const/4 v0, 0x0

    iput-object v0, v11, LQ81;->p:LIy;

    iput-object v0, v11, LQ81;->q:Ljava/security/PrivateKey;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The \'y\' coordinate must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The \'x\' coordinate must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The curve must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(LgF0;LIy;LIy;Ljava/security/PrivateKey;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgF0;",
            "LIy;",
            "LIy;",
            "Ljava/security/PrivateKey;",
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

    sget-object v1, LOk2;->d:LOk2;

    move-object v0, p0

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lfh2;-><init>(LOk2;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V

    if-eqz v12, :cond_2

    iput-object v12, v11, LQ81;->m:LgF0;

    if-eqz v13, :cond_1

    iput-object v13, v11, LQ81;->n:LIy;

    if-eqz v14, :cond_0

    iput-object v14, v11, LQ81;->o:LIy;

    invoke-static/range {p1 .. p3}, LQ81;->q(LgF0;LIy;LIy;)V

    invoke-virtual {p0}, Lfh2;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, LQ81;->p(Ljava/util/List;)V

    const/4 v0, 0x0

    iput-object v0, v11, LQ81;->p:LIy;

    move-object/from16 v0, p4

    iput-object v0, v11, LQ81;->q:Ljava/security/PrivateKey;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The \'y\' coordinate must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The \'x\' coordinate must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The curve must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static o(ILjava/math/BigInteger;)LIy;
    .locals 3

    invoke-static {p1}, LJG;->a(Ljava/math/BigInteger;)[B

    move-result-object p1

    add-int/lit8 p0, p0, 0x7

    div-int/lit8 p0, p0, 0x8

    array-length v0, p1

    if-lt v0, p0, :cond_0

    invoke-static {p1}, LIy;->e([B)LIy;

    move-result-object p0

    return-object p0

    :cond_0
    new-array v0, p0, [B

    array-length v1, p1

    sub-int/2addr p0, v1

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0}, LIy;->e([B)LIy;

    move-result-object p0

    return-object p0
.end method

.method public static q(LgF0;LIy;LIy;)V
    .locals 1

    sget-object v0, LQ81;->r:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LGy;->b()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p2}, LGy;->b()Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p0}, LgF0;->e()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-static {p1, p2, v0}, LL81;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid EC JWK: The \'x\' and \'y\' public coordinates are not on the "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " curve"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown / unsupported curve: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static v(Ljava/lang/String;)LQ81;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    invoke-static {p0}, LMg2;->m(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {p0}, LQ81;->w(Ljava/util/Map;)LQ81;

    move-result-object p0

    return-object p0
.end method

.method public static w(Ljava/util/Map;)LQ81;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "LQ81;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    move-object/from16 v0, p0

    sget-object v1, LOk2;->d:LOk2;

    invoke-static/range {p0 .. p0}, Lgh2;->d(Ljava/util/Map;)LOk2;

    move-result-object v2

    invoke-virtual {v1, v2}, LOk2;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    :try_start_0
    const-string v1, "crv"

    invoke-static {v0, v1}, LMg2;->h(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LgF0;->d(Ljava/lang/String;)LgF0;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v1, "x"

    invoke-static {v0, v1}, LMg2;->a(Ljava/util/Map;Ljava/lang/String;)LIy;

    move-result-object v5

    const-string v1, "y"

    invoke-static {v0, v1}, LMg2;->a(Ljava/util/Map;Ljava/lang/String;)LIy;

    move-result-object v6

    const-string v1, "d"

    invoke-static {v0, v1}, LMg2;->a(Ljava/util/Map;Ljava/lang/String;)LIy;

    move-result-object v7

    if-nez v7, :cond_0

    :try_start_1
    new-instance v1, LQ81;

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

    move-object v3, v1

    invoke-direct/range {v3 .. v15}, LQ81;-><init>(LgF0;LIy;LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V

    return-object v1

    :cond_0
    new-instance v1, LQ81;

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

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, LQ81;-><init>(LgF0;LIy;LIy;LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_1
    new-instance v0, Ljava/text/ParseException;

    const-string v1, "The key type \"kty\" must be EC"

    invoke-direct {v0, v1, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LQ81;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-super {p0, p1}, Lfh2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    check-cast p1, LQ81;

    iget-object v1, p0, LQ81;->m:LgF0;

    iget-object v3, p1, LQ81;->m:LgF0;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LQ81;->n:LIy;

    iget-object v3, p1, LQ81;->n:LIy;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LQ81;->o:LIy;

    iget-object v3, p1, LQ81;->o:LIy;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LQ81;->p:LIy;

    iget-object v3, p1, LQ81;->p:LIy;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LQ81;->q:Ljava/security/PrivateKey;

    iget-object p1, p1, LQ81;->q:Ljava/security/PrivateKey;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    invoke-super {p0}, Lfh2;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    iget-object v2, p0, LQ81;->m:LgF0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, LQ81;->n:LIy;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, LQ81;->o:LIy;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, LQ81;->p:LIy;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, LQ81;->q:Ljava/security/PrivateKey;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, LQ81;->p:LIy;

    if-nez v0, :cond_1

    iget-object v0, p0, LQ81;->q:Ljava/security/PrivateKey;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
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

    iget-object v1, p0, LQ81;->m:LgF0;

    invoke-virtual {v1}, LgF0;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "crv"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LQ81;->n:LIy;

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "x"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LQ81;->o:LIy;

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "y"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LQ81;->p:LIy;

    if-eqz v1, :cond_0

    const-string v2, "d"

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final p(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    invoke-virtual {p0, p1}, LQ81;->u(Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public r()LgF0;
    .locals 1

    iget-object v0, p0, LQ81;->m:LgF0;

    return-object v0
.end method

.method public s()LIy;
    .locals 1

    iget-object v0, p0, LQ81;->n:LIy;

    return-object v0
.end method

.method public t()LIy;
    .locals 1

    iget-object v0, p0, LQ81;->o:LIy;

    return-object v0
.end method

.method public u(Ljava/security/cert/X509Certificate;)Z
    .locals 3

    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lfh2;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPublicKey;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, LQ81;->s()LIy;

    move-result-object v1

    invoke-virtual {v1}, LGy;->b()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v2

    invoke-virtual {v2}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    return p1

    :cond_0
    invoke-virtual {p0}, LQ81;->t()LIy;

    move-result-object p1

    invoke-virtual {p1}, LGy;->b()Ljava/math/BigInteger;

    move-result-object p1

    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p1

    :catch_0
    return p1
.end method

.method public x()Ljava/security/interfaces/ECPublicKey;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LQ81;->y(Ljava/security/Provider;)Ljava/security/interfaces/ECPublicKey;

    move-result-object v0

    return-object v0
.end method

.method public y(Ljava/security/Provider;)Ljava/security/interfaces/ECPublicKey;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    iget-object v0, p0, LQ81;->m:LgF0;

    invoke-virtual {v0}, LgF0;->e()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Ljava/security/spec/ECPoint;

    iget-object v2, p0, LQ81;->n:LIy;

    invoke-virtual {v2}, LGy;->b()Ljava/math/BigInteger;

    move-result-object v2

    iget-object v3, p0, LQ81;->o:LIy;

    invoke-virtual {v3}, LGy;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance v2, Ljava/security/spec/ECPublicKeySpec;

    invoke-direct {v2, v1, v0}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    const-string v0, "EC"

    if-nez p1, :cond_0

    :try_start_0
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {v0, p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    move-result-object p1

    :goto_0
    invoke-virtual {p1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    check-cast p1, Ljava/security/interfaces/ECPublicKey;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t get EC parameter spec for curve "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ81;->m:LgF0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public z()LQ81;
    .locals 14

    new-instance v13, LQ81;

    invoke-virtual {p0}, LQ81;->r()LgF0;

    move-result-object v1

    invoke-virtual {p0}, LQ81;->s()LIy;

    move-result-object v2

    invoke-virtual {p0}, LQ81;->t()LIy;

    move-result-object v3

    invoke-virtual {p0}, Lfh2;->e()LRk2;

    move-result-object v4

    invoke-virtual {p0}, Lfh2;->c()Ljava/util/Set;

    move-result-object v5

    invoke-virtual {p0}, Lfh2;->a()LE9;

    move-result-object v6

    invoke-virtual {p0}, Lfh2;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lfh2;->j()Ljava/net/URI;

    move-result-object v8

    invoke-virtual {p0}, Lfh2;->i()LIy;

    move-result-object v9

    invoke-virtual {p0}, Lfh2;->h()LIy;

    move-result-object v10

    invoke-virtual {p0}, Lfh2;->g()Ljava/util/List;

    move-result-object v11

    invoke-virtual {p0}, Lfh2;->d()Ljava/security/KeyStore;

    move-result-object v12

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, LQ81;-><init>(LgF0;LIy;LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V

    return-object v13
.end method

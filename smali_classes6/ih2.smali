.class public final Lih2;
.super LBp0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lih2$a;
    }
.end annotation


# static fields
.field public static final q:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final p:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "alg"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "jku"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "jwk"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "x5u"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "x5t"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "x5t#S256"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "x5c"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "kid"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "typ"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "cty"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "crit"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "b64"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lih2;->q:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lhh2;LGg2;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lfh2;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/lang/String;ZLjava/util/Map;LIy;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhh2;",
            "LGg2;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/net/URI;",
            "Lfh2;",
            "Ljava/net/URI;",
            "LIy;",
            "LIy;",
            "Ljava/util/List<",
            "LGy;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "LIy;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    invoke-direct/range {v0 .. v13}, LBp0;-><init>(LE9;LGg2;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lfh2;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;LIy;)V

    invoke-virtual {p1}, LE9;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LE9;->d:LE9;

    invoke-virtual {v1}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p0

    move/from16 v1, p12

    iput-boolean v1, v0, Lih2;->p:Z

    return-void

    :cond_0
    move-object v0, p0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The JWS algorithm \"alg\" cannot be \"none\""

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static s()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lih2;->q:Ljava/util/Set;

    return-object v0
.end method

.method public static u(LIy;)Lih2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    invoke-virtual {p0}, LGy;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lih2;->v(Ljava/lang/String;LIy;)Lih2;

    move-result-object p0

    return-object p0
.end method

.method public static v(Ljava/lang/String;LIy;)Lih2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    const/16 v0, 0x4e20

    invoke-static {p0, v0}, LMg2;->n(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object p0

    invoke-static {p0, p1}, Lih2;->w(Ljava/util/Map;LIy;)Lih2;

    move-result-object p0

    return-object p0
.end method

.method public static w(Ljava/util/Map;LIy;)Lih2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "LIy;",
            ")",
            "Lih2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    invoke-static {p0}, LyH1;->g(Ljava/util/Map;)LE9;

    move-result-object v0

    instance-of v1, v0, Lhh2;

    if-eqz v1, :cond_e

    new-instance v1, Lih2$a;

    check-cast v0, Lhh2;

    invoke-direct {v1, v0}, Lih2$a;-><init>(Lhh2;)V

    invoke-virtual {v1, p1}, Lih2$a;->i(LIy;)Lih2$a;

    move-result-object p1

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "alg"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "typ"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p0, v1}, LMg2;->h(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, LGg2;

    invoke-direct {v2, v1}, LGg2;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lih2$a;->j(LGg2;)Lih2$a;

    move-result-object p1

    goto :goto_0

    :cond_2
    const-string v2, "cty"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p0, v1}, LMg2;->h(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lih2$a;->c(Ljava/lang/String;)Lih2$a;

    move-result-object p1

    goto :goto_0

    :cond_3
    const-string v2, "crit"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {p0, v1}, LMg2;->j(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, v2}, Lih2$a;->d(Ljava/util/Set;)Lih2$a;

    move-result-object p1

    goto :goto_0

    :cond_4
    const-string v2, "jku"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {p0, v1}, LMg2;->k(Ljava/util/Map;Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    invoke-virtual {p1, v1}, Lih2$a;->g(Ljava/net/URI;)Lih2$a;

    move-result-object p1

    goto :goto_0

    :cond_5
    const-string v2, "jwk"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {p0, v1}, LMg2;->f(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, LBp0;->q(Ljava/util/Map;)Lfh2;

    move-result-object v1

    invoke-virtual {p1, v1}, Lih2$a;->f(Lfh2;)Lih2$a;

    move-result-object p1

    goto :goto_0

    :cond_6
    const-string v2, "x5u"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {p0, v1}, LMg2;->k(Ljava/util/Map;Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    invoke-virtual {p1, v1}, Lih2$a;->n(Ljava/net/URI;)Lih2$a;

    move-result-object p1

    goto/16 :goto_0

    :cond_7
    const-string v2, "x5t"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {p0, v1}, LMg2;->h(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LIy;->f(Ljava/lang/String;)LIy;

    move-result-object v1

    invoke-virtual {p1, v1}, Lih2$a;->m(LIy;)Lih2$a;

    move-result-object p1

    goto/16 :goto_0

    :cond_8
    const-string v2, "x5t#S256"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {p0, v1}, LMg2;->h(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LIy;->f(Ljava/lang/String;)LIy;

    move-result-object v1

    invoke-virtual {p1, v1}, Lih2$a;->l(LIy;)Lih2$a;

    move-result-object p1

    goto/16 :goto_0

    :cond_9
    const-string v2, "x5c"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {p0, v1}, LMg2;->e(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LrH6;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1}, Lih2$a;->k(Ljava/util/List;)Lih2$a;

    move-result-object p1

    goto/16 :goto_0

    :cond_a
    const-string v2, "kid"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {p0, v1}, LMg2;->h(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lih2$a;->h(Ljava/lang/String;)Lih2$a;

    move-result-object p1

    goto/16 :goto_0

    :cond_b
    const-string v2, "b64"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-static {p0, v1}, LMg2;->b(Ljava/util/Map;Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {p1, v1}, Lih2$a;->a(Z)Lih2$a;

    move-result-object p1

    goto/16 :goto_0

    :cond_c
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lih2$a;->e(Ljava/lang/String;Ljava/lang/Object;)Lih2$a;

    move-result-object p1

    goto/16 :goto_0

    :cond_d
    invoke-virtual {p1}, Lih2$a;->b()Lih2;

    move-result-object p0

    return-object p0

    :cond_e
    new-instance p0, Ljava/text/ParseException;

    const-string p1, "Not a JWS header"

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method


# virtual methods
.method public i()Ljava/util/Map;
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

    invoke-super {p0}, LBp0;->i()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lih2;->t()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "b64"

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic j()Lfh2;
    .locals 1

    invoke-super {p0}, LBp0;->j()Lfh2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k()Ljava/net/URI;
    .locals 1

    invoke-super {p0}, LBp0;->k()Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, LBp0;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Ljava/util/List;
    .locals 1

    invoke-super {p0}, LBp0;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()LIy;
    .locals 1

    invoke-super {p0}, LBp0;->n()LIy;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o()LIy;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0}, LBp0;->o()LIy;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p()Ljava/net/URI;
    .locals 1

    invoke-super {p0}, LBp0;->p()Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method

.method public r()Lhh2;
    .locals 1

    invoke-super {p0}, LyH1;->a()LE9;

    move-result-object v0

    check-cast v0, Lhh2;

    return-object v0
.end method

.method public t()Z
    .locals 1

    iget-boolean v0, p0, Lih2;->p:Z

    return v0
.end method

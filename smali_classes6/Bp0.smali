.class public abstract LBp0;
.super LyH1;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final i:Ljava/net/URI;

.field public final j:Lfh2;

.field public final k:Ljava/net/URI;

.field public final l:LIy;

.field public final m:LIy;

.field public final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LGy;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(LE9;LGg2;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lfh2;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;LIy;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LE9;",
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
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "LIy;",
            ")V"
        }
    .end annotation

    move-object v7, p0

    move-object/from16 v8, p10

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p12

    move-object/from16 v6, p13

    invoke-direct/range {v0 .. v6}, LyH1;-><init>(LE9;LGg2;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;LIy;)V

    move-object v0, p5

    iput-object v0, v7, LBp0;->i:Ljava/net/URI;

    move-object v0, p6

    iput-object v0, v7, LBp0;->j:Lfh2;

    move-object/from16 v0, p7

    iput-object v0, v7, LBp0;->k:Ljava/net/URI;

    move-object/from16 v0, p8

    iput-object v0, v7, LBp0;->l:LIy;

    move-object/from16 v0, p9

    iput-object v0, v7, LBp0;->m:LIy;

    if-eqz v8, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v7, LBp0;->n:Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, v7, LBp0;->n:Ljava/util/List;

    :goto_0
    move-object/from16 v0, p11

    iput-object v0, v7, LBp0;->o:Ljava/lang/String;

    return-void
.end method

.method public static q(Ljava/util/Map;)Lfh2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lfh2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, Lfh2;->l(Ljava/util/Map;)Lfh2;

    move-result-object p0

    invoke-virtual {p0}, Lfh2;->k()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "Non-public key in jwk header parameter"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method


# virtual methods
.method public i()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, LyH1;->i()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LBp0;->i:Ljava/net/URI;

    if-eqz v1, :cond_0

    const-string v2, "jku"

    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, LBp0;->j:Lfh2;

    if-eqz v1, :cond_1

    const-string v2, "jwk"

    invoke-virtual {v1}, Lfh2;->m()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, LBp0;->k:Ljava/net/URI;

    if-eqz v1, :cond_2

    const-string v2, "x5u"

    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, LBp0;->l:LIy;

    if-eqz v1, :cond_3

    const-string v2, "x5t"

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, LBp0;->m:LIy;

    if-eqz v1, :cond_4

    const-string v2, "x5t#S256"

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, LBp0;->n:Ljava/util/List;

    if-eqz v1, :cond_6

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, LBp0;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, LBp0;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LGy;

    invoke-virtual {v3}, LGy;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    const-string v2, "x5c"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v1, p0, LBp0;->o:Ljava/lang/String;

    if-eqz v1, :cond_7

    const-string v2, "kid"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    return-object v0
.end method

.method public j()Lfh2;
    .locals 1

    iget-object v0, p0, LBp0;->j:Lfh2;

    return-object v0
.end method

.method public k()Ljava/net/URI;
    .locals 1

    iget-object v0, p0, LBp0;->i:Ljava/net/URI;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LBp0;->o:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LGy;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBp0;->n:Ljava/util/List;

    return-object v0
.end method

.method public n()LIy;
    .locals 1

    iget-object v0, p0, LBp0;->m:LIy;

    return-object v0
.end method

.method public o()LIy;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LBp0;->l:LIy;

    return-object v0
.end method

.method public p()Ljava/net/URI;
    .locals 1

    iget-object v0, p0, LBp0;->k:Ljava/net/URI;

    return-object v0
.end method

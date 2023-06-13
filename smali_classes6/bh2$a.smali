.class public Lbh2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbh2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:LXg2;

.field public final b:LUc1;

.field public c:LGg2;

.field public d:Ljava/lang/String;

.field public e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/net/URI;

.field public g:Lfh2;

.field public h:Ljava/net/URI;

.field public i:LIy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public j:LIy;

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LGy;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ljava/lang/String;

.field public m:Lfh2;

.field public n:Lvu0;

.field public o:LIy;

.field public p:LIy;

.field public q:LIy;

.field public r:I

.field public s:LIy;

.field public t:LIy;

.field public u:Ljava/lang/String;

.field public v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public w:LIy;


# direct methods
.method public constructor <init>(LXg2;LUc1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LE9;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LE9;->d:LE9;

    invoke-virtual {v1}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Lbh2$a;->a:LXg2;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lbh2$a;->b:LUc1;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The encryption method \"enc\" parameter must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The JWE algorithm \"alg\" cannot be \"none\""

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(LIy;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->o:LIy;

    return-object p0
.end method

.method public b(LIy;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->p:LIy;

    return-object p0
.end method

.method public c(LIy;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->t:LIy;

    return-object p0
.end method

.method public d()Lbh2;
    .locals 27

    move-object/from16 v0, p0

    new-instance v25, Lbh2;

    move-object/from16 v1, v25

    iget-object v2, v0, Lbh2$a;->a:LXg2;

    iget-object v3, v0, Lbh2$a;->b:LUc1;

    iget-object v4, v0, Lbh2$a;->c:LGg2;

    iget-object v5, v0, Lbh2$a;->d:Ljava/lang/String;

    iget-object v6, v0, Lbh2$a;->e:Ljava/util/Set;

    iget-object v7, v0, Lbh2$a;->f:Ljava/net/URI;

    iget-object v8, v0, Lbh2$a;->g:Lfh2;

    iget-object v9, v0, Lbh2$a;->h:Ljava/net/URI;

    iget-object v10, v0, Lbh2$a;->i:LIy;

    iget-object v11, v0, Lbh2$a;->j:LIy;

    iget-object v12, v0, Lbh2$a;->k:Ljava/util/List;

    iget-object v13, v0, Lbh2$a;->l:Ljava/lang/String;

    iget-object v14, v0, Lbh2$a;->m:Lfh2;

    iget-object v15, v0, Lbh2$a;->n:Lvu0;

    move-object/from16 v26, v1

    iget-object v1, v0, Lbh2$a;->o:LIy;

    move-object/from16 v16, v1

    iget-object v1, v0, Lbh2$a;->p:LIy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lbh2$a;->q:LIy;

    move-object/from16 v18, v1

    iget v1, v0, Lbh2$a;->r:I

    move/from16 v19, v1

    iget-object v1, v0, Lbh2$a;->s:LIy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lbh2$a;->t:LIy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lbh2$a;->u:Ljava/lang/String;

    move-object/from16 v22, v1

    iget-object v1, v0, Lbh2$a;->v:Ljava/util/Map;

    move-object/from16 v23, v1

    iget-object v1, v0, Lbh2$a;->w:LIy;

    move-object/from16 v24, v1

    move-object/from16 v1, v26

    invoke-direct/range {v1 .. v24}, Lbh2;-><init>(LE9;LUc1;LGg2;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lfh2;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/lang/String;Lfh2;Lvu0;LIy;LIy;LIy;ILIy;LIy;Ljava/lang/String;Ljava/util/Map;LIy;)V

    return-object v25
.end method

.method public e(Lvu0;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->n:Lvu0;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/util/Set;)Lbh2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lbh2$a;"
        }
    .end annotation

    iput-object p1, p0, Lbh2$a;->e:Ljava/util/Set;

    return-object p0
.end method

.method public h(Ljava/lang/String;Ljava/lang/Object;)Lbh2$a;
    .locals 2

    invoke-static {}, Lbh2;->u()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lbh2$a;->v:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbh2$a;->v:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lbh2$a;->v:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The parameter name \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" matches a registered name"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public i(Lfh2;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->m:Lfh2;

    return-object p0
.end method

.method public j(LIy;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->s:LIy;

    return-object p0
.end method

.method public k(Lfh2;)Lbh2$a;
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lfh2;->k()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The JWK must be public"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lbh2$a;->g:Lfh2;

    return-object p0
.end method

.method public l(Ljava/net/URI;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->f:Ljava/net/URI;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->l:Ljava/lang/String;

    return-object p0
.end method

.method public n(LIy;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->w:LIy;

    return-object p0
.end method

.method public o(I)Lbh2$a;
    .locals 1

    if-ltz p1, :cond_0

    iput p1, p0, Lbh2$a;->r:I

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The PBES2 count parameter must not be negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p(LIy;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->q:LIy;

    return-object p0
.end method

.method public q(Ljava/lang/String;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->u:Ljava/lang/String;

    return-object p0
.end method

.method public r(LGg2;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->c:LGg2;

    return-object p0
.end method

.method public s(Ljava/util/List;)Lbh2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LGy;",
            ">;)",
            "Lbh2$a;"
        }
    .end annotation

    iput-object p1, p0, Lbh2$a;->k:Ljava/util/List;

    return-object p0
.end method

.method public t(LIy;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->j:LIy;

    return-object p0
.end method

.method public u(LIy;)Lbh2$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lbh2$a;->i:LIy;

    return-object p0
.end method

.method public v(Ljava/net/URI;)Lbh2$a;
    .locals 0

    iput-object p1, p0, Lbh2$a;->h:Ljava/net/URI;

    return-object p0
.end method

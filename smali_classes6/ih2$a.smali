.class public Lih2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lih2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lhh2;

.field public b:LGg2;

.field public c:Ljava/lang/String;

.field public d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/net/URI;

.field public f:Lfh2;

.field public g:Ljava/net/URI;

.field public h:LIy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public i:LIy;

.field public j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LGy;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/lang/String;

.field public l:Z

.field public m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public n:LIy;


# direct methods
.method public constructor <init>(Lhh2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lih2$a;->l:Z

    invoke-virtual {p1}, LE9;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LE9;->d:LE9;

    invoke-virtual {v1}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lih2$a;->a:Lhh2;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The JWS algorithm \"alg\" cannot be \"none\""

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lih2;)V
    .locals 1

    invoke-virtual {p1}, Lih2;->r()Lhh2;

    move-result-object v0

    invoke-direct {p0, v0}, Lih2$a;-><init>(Lhh2;)V

    invoke-virtual {p1}, LyH1;->f()LGg2;

    move-result-object v0

    iput-object v0, p0, Lih2$a;->b:LGg2;

    invoke-virtual {p1}, LyH1;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lih2$a;->c:Ljava/lang/String;

    invoke-virtual {p1}, LyH1;->c()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lih2$a;->d:Ljava/util/Set;

    invoke-virtual {p1}, Lih2;->k()Ljava/net/URI;

    move-result-object v0

    iput-object v0, p0, Lih2$a;->e:Ljava/net/URI;

    invoke-virtual {p1}, Lih2;->j()Lfh2;

    move-result-object v0

    iput-object v0, p0, Lih2$a;->f:Lfh2;

    invoke-virtual {p1}, Lih2;->p()Ljava/net/URI;

    move-result-object v0

    iput-object v0, p0, Lih2$a;->g:Ljava/net/URI;

    invoke-virtual {p1}, Lih2;->o()LIy;

    move-result-object v0

    iput-object v0, p0, Lih2$a;->h:LIy;

    invoke-virtual {p1}, Lih2;->n()LIy;

    move-result-object v0

    iput-object v0, p0, Lih2$a;->i:LIy;

    invoke-virtual {p1}, Lih2;->m()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lih2$a;->j:Ljava/util/List;

    invoke-virtual {p1}, Lih2;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lih2$a;->k:Ljava/lang/String;

    invoke-virtual {p1}, Lih2;->t()Z

    move-result v0

    iput-boolean v0, p0, Lih2$a;->l:Z

    invoke-virtual {p1}, LyH1;->e()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lih2$a;->m:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Z)Lih2$a;
    .locals 0

    iput-boolean p1, p0, Lih2$a;->l:Z

    return-object p0
.end method

.method public b()Lih2;
    .locals 17

    move-object/from16 v0, p0

    new-instance v16, Lih2;

    iget-object v2, v0, Lih2$a;->a:Lhh2;

    iget-object v3, v0, Lih2$a;->b:LGg2;

    iget-object v4, v0, Lih2$a;->c:Ljava/lang/String;

    iget-object v5, v0, Lih2$a;->d:Ljava/util/Set;

    iget-object v6, v0, Lih2$a;->e:Ljava/net/URI;

    iget-object v7, v0, Lih2$a;->f:Lfh2;

    iget-object v8, v0, Lih2$a;->g:Ljava/net/URI;

    iget-object v9, v0, Lih2$a;->h:LIy;

    iget-object v10, v0, Lih2$a;->i:LIy;

    iget-object v11, v0, Lih2$a;->j:Ljava/util/List;

    iget-object v12, v0, Lih2$a;->k:Ljava/lang/String;

    iget-boolean v13, v0, Lih2$a;->l:Z

    iget-object v14, v0, Lih2$a;->m:Ljava/util/Map;

    iget-object v15, v0, Lih2$a;->n:LIy;

    move-object/from16 v1, v16

    invoke-direct/range {v1 .. v15}, Lih2;-><init>(Lhh2;LGg2;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lfh2;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/lang/String;ZLjava/util/Map;LIy;)V

    return-object v16
.end method

.method public c(Ljava/lang/String;)Lih2$a;
    .locals 0

    iput-object p1, p0, Lih2$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/util/Set;)Lih2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lih2$a;"
        }
    .end annotation

    iput-object p1, p0, Lih2$a;->d:Ljava/util/Set;

    return-object p0
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;)Lih2$a;
    .locals 2

    invoke-static {}, Lih2;->s()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lih2$a;->m:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lih2$a;->m:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lih2$a;->m:Ljava/util/Map;

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

.method public f(Lfh2;)Lih2$a;
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
    iput-object p1, p0, Lih2$a;->f:Lfh2;

    return-object p0
.end method

.method public g(Ljava/net/URI;)Lih2$a;
    .locals 0

    iput-object p1, p0, Lih2$a;->e:Ljava/net/URI;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lih2$a;
    .locals 0

    iput-object p1, p0, Lih2$a;->k:Ljava/lang/String;

    return-object p0
.end method

.method public i(LIy;)Lih2$a;
    .locals 0

    iput-object p1, p0, Lih2$a;->n:LIy;

    return-object p0
.end method

.method public j(LGg2;)Lih2$a;
    .locals 0

    iput-object p1, p0, Lih2$a;->b:LGg2;

    return-object p0
.end method

.method public k(Ljava/util/List;)Lih2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LGy;",
            ">;)",
            "Lih2$a;"
        }
    .end annotation

    iput-object p1, p0, Lih2$a;->j:Ljava/util/List;

    return-object p0
.end method

.method public l(LIy;)Lih2$a;
    .locals 0

    iput-object p1, p0, Lih2$a;->i:LIy;

    return-object p0
.end method

.method public m(LIy;)Lih2$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lih2$a;->h:LIy;

    return-object p0
.end method

.method public n(Ljava/net/URI;)Lih2$a;
    .locals 0

    iput-object p1, p0, Lih2$a;->g:Ljava/net/URI;

    return-object p0
.end method

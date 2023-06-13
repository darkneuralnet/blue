.class public abstract Lfh2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final b:LOk2;

.field public final c:LRk2;

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lyk2;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LE9;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/net/URI;

.field public final h:LIy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final i:LIy;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LGy;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/security/KeyStore;


# direct methods
.method public constructor <init>(LOk2;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOk2;",
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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_3

    iput-object p1, p0, Lfh2;->b:LOk2;

    invoke-static {p2, p3}, LSk2;->a(LRk2;Ljava/util/Set;)Z

    move-result p1

    if-eqz p1, :cond_2

    iput-object p2, p0, Lfh2;->c:LRk2;

    iput-object p3, p0, Lfh2;->d:Ljava/util/Set;

    iput-object p4, p0, Lfh2;->e:LE9;

    iput-object p5, p0, Lfh2;->f:Ljava/lang/String;

    iput-object p6, p0, Lfh2;->g:Ljava/net/URI;

    iput-object p7, p0, Lfh2;->h:LIy;

    iput-object p8, p0, Lfh2;->i:LIy;

    if-eqz p9, :cond_1

    invoke-interface {p9}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The X.509 certificate chain \"x5c\" must not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p9, p0, Lfh2;->j:Ljava/util/List;

    :try_start_0
    invoke-static {p9}, LrH6;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lfh2;->k:Ljava/util/List;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p10, p0, Lfh2;->l:Ljava/security/KeyStore;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Invalid X.509 certificate chain \"x5c\": "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The key type \"kty\" parameter must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static l(Ljava/util/Map;)Lfh2;
    .locals 4
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

    const-string v0, "kty"

    invoke-static {p0, v0}, LMg2;->h(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-static {v0}, LOk2;->b(Ljava/lang/String;)LOk2;

    move-result-object v0

    sget-object v2, LOk2;->d:LOk2;

    if-ne v0, v2, :cond_0

    invoke-static {p0}, LQ81;->w(Ljava/util/Map;)LQ81;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v2, LOk2;->e:LOk2;

    if-ne v0, v2, :cond_1

    invoke-static {p0}, Lom4;->p(Ljava/util/Map;)Lom4;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v2, LOk2;->f:LOk2;

    if-ne v0, v2, :cond_2

    invoke-static {p0}, Lme3;->p(Ljava/util/Map;)Lme3;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object v2, LOk2;->g:LOk2;

    if-ne v0, v2, :cond_3

    invoke-static {p0}, Lle3;->o(Ljava/util/Map;)Lle3;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/text/ParseException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported key type \"kty\" parameter: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_4
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "Missing key type \"kty\" parameter"

    invoke-direct {p0, v0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method


# virtual methods
.method public a()LE9;
    .locals 1

    iget-object v0, p0, Lfh2;->e:LE9;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfh2;->f:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lyk2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfh2;->d:Ljava/util/Set;

    return-object v0
.end method

.method public d()Ljava/security/KeyStore;
    .locals 1

    iget-object v0, p0, Lfh2;->l:Ljava/security/KeyStore;

    return-object v0
.end method

.method public e()LRk2;
    .locals 1

    iget-object v0, p0, Lfh2;->c:LRk2;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfh2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfh2;

    iget-object v1, p0, Lfh2;->b:LOk2;

    iget-object v3, p1, Lfh2;->b:LOk2;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfh2;->c:LRk2;

    iget-object v3, p1, Lfh2;->c:LRk2;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfh2;->d:Ljava/util/Set;

    iget-object v3, p1, Lfh2;->d:Ljava/util/Set;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfh2;->e:LE9;

    iget-object v3, p1, Lfh2;->e:LE9;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfh2;->f:Ljava/lang/String;

    iget-object v3, p1, Lfh2;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfh2;->g:Ljava/net/URI;

    iget-object v3, p1, Lfh2;->g:Ljava/net/URI;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfh2;->h:LIy;

    iget-object v3, p1, Lfh2;->h:LIy;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfh2;->i:LIy;

    iget-object v3, p1, Lfh2;->i:LIy;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfh2;->j:Ljava/util/List;

    iget-object v3, p1, Lfh2;->j:Ljava/util/List;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfh2;->l:Ljava/security/KeyStore;

    iget-object p1, p1, Lfh2;->l:Ljava/security/KeyStore;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfh2;->k:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LGy;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfh2;->j:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public h()LIy;
    .locals 1

    iget-object v0, p0, Lfh2;->i:LIy;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lfh2;->b:LOk2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lfh2;->c:LRk2;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lfh2;->d:Ljava/util/Set;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lfh2;->e:LE9;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lfh2;->f:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lfh2;->g:Ljava/net/URI;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lfh2;->h:LIy;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-object v2, p0, Lfh2;->i:LIy;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    iget-object v2, p0, Lfh2;->j:Ljava/util/List;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    iget-object v2, p0, Lfh2;->l:Ljava/security/KeyStore;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()LIy;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lfh2;->h:LIy;

    return-object v0
.end method

.method public j()Ljava/net/URI;
    .locals 1

    iget-object v0, p0, Lfh2;->g:Ljava/net/URI;

    return-object v0
.end method

.method public abstract k()Z
.end method

.method public m()Ljava/util/Map;
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

    invoke-static {}, LMg2;->l()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lfh2;->b:LOk2;

    invoke-virtual {v1}, LOk2;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "kty"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lfh2;->c:LRk2;

    if-eqz v1, :cond_0

    const-string v2, "use"

    invoke-virtual {v1}, LRk2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lfh2;->d:Ljava/util/Set;

    if-eqz v1, :cond_2

    invoke-static {}, LIg2;->a()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lfh2;->d:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyk2;

    invoke-virtual {v3}, Lyk2;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v2, "key_ops"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lfh2;->e:LE9;

    if-eqz v1, :cond_3

    const-string v2, "alg"

    invoke-virtual {v1}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lfh2;->f:Ljava/lang/String;

    if-eqz v1, :cond_4

    const-string v2, "kid"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lfh2;->g:Ljava/net/URI;

    if-eqz v1, :cond_5

    const-string v2, "x5u"

    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v1, p0, Lfh2;->h:LIy;

    if-eqz v1, :cond_6

    const-string v2, "x5t"

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v1, p0, Lfh2;->i:LIy;

    if-eqz v1, :cond_7

    const-string v2, "x5t#S256"

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v1, p0, Lfh2;->j:Ljava/util/List;

    if-eqz v1, :cond_9

    invoke-static {}, LIg2;->a()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lfh2;->j:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LGy;

    invoke-virtual {v3}, LGy;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    const-string v2, "x5c"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lfh2;->m()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, LMg2;->o(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lfh2;->m()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, LMg2;->o(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

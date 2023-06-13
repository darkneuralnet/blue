.class public Ldh2;
.super LFg2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldh2$a;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public d:Lbh2;

.field public e:LIy;

.field public f:LIy;

.field public g:LIy;

.field public h:LIy;

.field public i:Ldh2$a;


# direct methods
.method public constructor <init>(LIy;LIy;LIy;LIy;LIy;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    invoke-direct {p0}, LFg2;-><init>()V

    if-eqz p1, :cond_7

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Lbh2;->v(LIy;)Lbh2;

    move-result-object v1

    iput-object v1, p0, Ldh2;->d:Lbh2;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LGy;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iput-object p2, p0, Ldh2;->e:LIy;

    goto :goto_1

    :cond_1
    :goto_0
    iput-object v1, p0, Ldh2;->e:LIy;

    :goto_1
    if-eqz p3, :cond_3

    invoke-virtual {p3}, LGy;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    iput-object p3, p0, Ldh2;->f:LIy;

    goto :goto_3

    :cond_3
    :goto_2
    iput-object v1, p0, Ldh2;->f:LIy;

    :goto_3
    if-eqz p4, :cond_6

    iput-object p4, p0, Ldh2;->g:LIy;

    if-eqz p5, :cond_5

    invoke-virtual {p5}, LGy;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    iput-object p5, p0, Ldh2;->h:LIy;

    goto :goto_5

    :cond_5
    :goto_4
    iput-object v1, p0, Ldh2;->h:LIy;

    :goto_5
    sget-object v1, Ldh2$a;->c:Ldh2$a;

    iput-object v1, p0, Ldh2;->i:Ldh2$a;

    const/4 v1, 0x5

    new-array v1, v1, [LIy;

    aput-object p1, v1, v0

    const/4 p1, 0x1

    aput-object p2, v1, p1

    const/4 p1, 0x2

    aput-object p3, v1, p1

    const/4 p1, 0x3

    aput-object p4, v1, p1

    const/4 p1, 0x4

    aput-object p5, v1, p1

    invoke-virtual {p0, v1}, LFg2;->c([LIy;)V

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The fourth part must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/text/ParseException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Invalid JWE header: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p2

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The first part must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lbh2;LvL3;)V
    .locals 0

    invoke-direct {p0}, LFg2;-><init>()V

    if-eqz p1, :cond_1

    iput-object p1, p0, Ldh2;->d:Lbh2;

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, LFg2;->d(LvL3;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ldh2;->e:LIy;

    iput-object p1, p0, Ldh2;->g:LIy;

    sget-object p1, Ldh2$a;->b:Ldh2$a;

    iput-object p1, p0, Ldh2;->i:Ldh2$a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The payload must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The JWE header must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static q(Ljava/lang/String;)Ldh2;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    invoke-static {p0}, LFg2;->e(Ljava/lang/String;)[LIy;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x5

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    new-instance v0, Ldh2;

    aget-object v4, p0, v2

    const/4 v1, 0x1

    aget-object v5, p0, v1

    const/4 v1, 0x2

    aget-object v6, p0, v1

    const/4 v1, 0x3

    aget-object v7, p0, v1

    const/4 v1, 0x4

    aget-object v8, p0, v1

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Ldh2;-><init>(LIy;LIy;LIy;LIy;LIy;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "Unexpected number of Base64URL parts, must be five"

    invoke-direct {p0, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method


# virtual methods
.method public declared-synchronized f(LZg2;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ldh2;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, LvL3;

    invoke-virtual {p0}, Ldh2;->o()Lbh2;

    move-result-object v2

    invoke-virtual {p0}, Ldh2;->n()LIy;

    move-result-object v3

    invoke-virtual {p0}, Ldh2;->p()LIy;

    move-result-object v4

    invoke-virtual {p0}, Ldh2;->m()LIy;

    move-result-object v5

    invoke-virtual {p0}, Ldh2;->l()LIy;

    move-result-object v6

    move-object v1, p1

    invoke-interface/range {v1 .. v6}, LZg2;->a(Lbh2;LIy;LIy;LIy;LIy;)[B

    move-result-object p1

    invoke-direct {v0, p1}, LvL3;-><init>([B)V

    invoke-virtual {p0, v0}, LFg2;->d(LvL3;)V
    :try_end_1
    .catch Lcom/nimbusds/jose/JOSEException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object p1, Ldh2$a;->d:Ldh2$a;

    iput-object p1, p0, Ldh2;->i:Ldh2$a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    move-exception p1

    :try_start_3
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized g(Lah2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ldh2;->k()V

    invoke-virtual {p0, p1}, Ldh2;->j(Lah2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0}, Ldh2;->o()Lbh2;

    move-result-object v0

    invoke-virtual {p0}, LFg2;->b()LvL3;

    move-result-object v1

    invoke-virtual {v1}, LvL3;->d()[B

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lah2;->encrypt(Lbh2;[B)LYg2;

    move-result-object p1
    :try_end_1
    .catch Lcom/nimbusds/jose/JOSEException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1}, LYg2;->d()Lbh2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LYg2;->d()Lbh2;

    move-result-object v0

    iput-object v0, p0, Ldh2;->d:Lbh2;

    :cond_0
    invoke-virtual {p1}, LYg2;->c()LIy;

    move-result-object v0

    iput-object v0, p0, Ldh2;->e:LIy;

    invoke-virtual {p1}, LYg2;->e()LIy;

    move-result-object v0

    iput-object v0, p0, Ldh2;->f:LIy;

    invoke-virtual {p1}, LYg2;->b()LIy;

    move-result-object v0

    iput-object v0, p0, Ldh2;->g:LIy;

    invoke-virtual {p1}, LYg2;->a()LIy;

    move-result-object p1

    iput-object p1, p0, Ldh2;->h:LIy;

    sget-object p1, Ldh2$a;->c:Ldh2$a;

    iput-object p1, p0, Ldh2;->i:Ldh2$a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    move-exception p1

    :try_start_3
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Ldh2;->i:Ldh2$a;

    sget-object v1, Ldh2$a;->c:Ldh2$a;

    if-eq v0, v1, :cond_1

    sget-object v1, Ldh2$a;->d:Ldh2$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The JWE object must be in an encrypted or decrypted state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Ldh2;->i:Ldh2$a;

    sget-object v1, Ldh2$a;->c:Ldh2$a;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The JWE object must be in an encrypted state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j(Lah2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    invoke-interface {p1}, Leh2;->supportedJWEAlgorithms()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Ldh2;->o()Lbh2;

    move-result-object v1

    invoke-virtual {v1}, Lbh2;->r()LXg2;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "The "

    if-eqz v0, :cond_1

    invoke-interface {p1}, Leh2;->supportedEncryptionMethods()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Ldh2;->o()Lbh2;

    move-result-object v2

    invoke-virtual {v2}, Lbh2;->t()LUc1;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ldh2;->o()Lbh2;

    move-result-object v1

    invoke-virtual {v1}, Lbh2;->t()LUc1;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " encryption method or key size is not supported by the JWE encrypter: Supported methods: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Leh2;->supportedEncryptionMethods()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ldh2;->o()Lbh2;

    move-result-object v1

    invoke-virtual {v1}, Lbh2;->r()LXg2;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " algorithm is not supported by the JWE encrypter: Supported algorithms: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Leh2;->supportedJWEAlgorithms()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Ldh2;->i:Ldh2$a;

    sget-object v1, Ldh2$a;->b:Ldh2$a;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The JWE object must be in an unencrypted state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()LIy;
    .locals 1

    iget-object v0, p0, Ldh2;->h:LIy;

    return-object v0
.end method

.method public m()LIy;
    .locals 1

    iget-object v0, p0, Ldh2;->g:LIy;

    return-object v0
.end method

.method public n()LIy;
    .locals 1

    iget-object v0, p0, Ldh2;->e:LIy;

    return-object v0
.end method

.method public o()Lbh2;
    .locals 1

    iget-object v0, p0, Ldh2;->d:Lbh2;

    return-object v0
.end method

.method public p()LIy;
    .locals 1

    iget-object v0, p0, Ldh2;->f:LIy;

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ldh2;->h()V

    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldh2;->d:Lbh2;

    invoke-virtual {v1}, LyH1;->h()LIy;

    move-result-object v1

    invoke-virtual {v1}, LGy;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ldh2;->e:LIy;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ldh2;->f:LIy;

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ldh2;->g:LIy;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldh2;->h:LIy;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public LQ81$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ81;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:LgF0;

.field public final b:LIy;

.field public final c:LIy;

.field public d:LIy;

.field public e:Ljava/security/PrivateKey;

.field public f:LRk2;

.field public g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lyk2;",
            ">;"
        }
    .end annotation
.end field

.field public h:LE9;

.field public i:Ljava/lang/String;

.field public j:Ljava/net/URI;

.field public k:LIy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public l:LIy;

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LGy;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/security/KeyStore;


# direct methods
.method public constructor <init>(LgF0;LIy;LIy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    iput-object p1, p0, LQ81$a;->a:LgF0;

    if-eqz p2, :cond_1

    iput-object p2, p0, LQ81$a;->b:LIy;

    if-eqz p3, :cond_0

    iput-object p3, p0, LQ81$a;->c:LIy;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The \'y\' coordinate must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The \'x\' coordinate must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The curve must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(LgF0;Ljava/security/interfaces/ECPublicKey;)V
    .locals 2

    invoke-interface {p2}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/spec/ECField;->getFieldSize()I

    move-result v0

    invoke-interface {p2}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v0, v1}, LQ81;->o(ILjava/math/BigInteger;)LIy;

    move-result-object v0

    invoke-interface {p2}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/spec/ECField;->getFieldSize()I

    move-result v1

    invoke-interface {p2}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object p2

    invoke-virtual {p2}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p2

    invoke-static {v1, p2}, LQ81;->o(ILjava/math/BigInteger;)LIy;

    move-result-object p2

    invoke-direct {p0, p1, v0, p2}, LQ81$a;-><init>(LgF0;LIy;LIy;)V

    return-void
.end method


# virtual methods
.method public a()LQ81;
    .locals 15

    :try_start_0
    iget-object v0, p0, LQ81$a;->d:LIy;

    if-nez v0, :cond_0

    iget-object v0, p0, LQ81$a;->e:Ljava/security/PrivateKey;

    if-nez v0, :cond_0

    new-instance v0, LQ81;

    iget-object v2, p0, LQ81$a;->a:LgF0;

    iget-object v3, p0, LQ81$a;->b:LIy;

    iget-object v4, p0, LQ81$a;->c:LIy;

    iget-object v5, p0, LQ81$a;->f:LRk2;

    iget-object v6, p0, LQ81$a;->g:Ljava/util/Set;

    iget-object v7, p0, LQ81$a;->h:LE9;

    iget-object v8, p0, LQ81$a;->i:Ljava/lang/String;

    iget-object v9, p0, LQ81$a;->j:Ljava/net/URI;

    iget-object v10, p0, LQ81$a;->k:LIy;

    iget-object v11, p0, LQ81$a;->l:LIy;

    iget-object v12, p0, LQ81$a;->m:Ljava/util/List;

    iget-object v13, p0, LQ81$a;->n:Ljava/security/KeyStore;

    move-object v1, v0

    invoke-direct/range {v1 .. v13}, LQ81;-><init>(LgF0;LIy;LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V

    return-object v0

    :cond_0
    iget-object v0, p0, LQ81$a;->e:Ljava/security/PrivateKey;

    if-eqz v0, :cond_1

    new-instance v0, LQ81;

    iget-object v2, p0, LQ81$a;->a:LgF0;

    iget-object v3, p0, LQ81$a;->b:LIy;

    iget-object v4, p0, LQ81$a;->c:LIy;

    iget-object v5, p0, LQ81$a;->e:Ljava/security/PrivateKey;

    iget-object v6, p0, LQ81$a;->f:LRk2;

    iget-object v7, p0, LQ81$a;->g:Ljava/util/Set;

    iget-object v8, p0, LQ81$a;->h:LE9;

    iget-object v9, p0, LQ81$a;->i:Ljava/lang/String;

    iget-object v10, p0, LQ81$a;->j:Ljava/net/URI;

    iget-object v11, p0, LQ81$a;->k:LIy;

    iget-object v12, p0, LQ81$a;->l:LIy;

    iget-object v13, p0, LQ81$a;->m:Ljava/util/List;

    iget-object v14, p0, LQ81$a;->n:Ljava/security/KeyStore;

    move-object v1, v0

    invoke-direct/range {v1 .. v14}, LQ81;-><init>(LgF0;LIy;LIy;Ljava/security/PrivateKey;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V

    return-object v0

    :cond_1
    new-instance v0, LQ81;

    iget-object v2, p0, LQ81$a;->a:LgF0;

    iget-object v3, p0, LQ81$a;->b:LIy;

    iget-object v4, p0, LQ81$a;->c:LIy;

    iget-object v5, p0, LQ81$a;->d:LIy;

    iget-object v6, p0, LQ81$a;->f:LRk2;

    iget-object v7, p0, LQ81$a;->g:Ljava/util/Set;

    iget-object v8, p0, LQ81$a;->h:LE9;

    iget-object v9, p0, LQ81$a;->i:Ljava/lang/String;

    iget-object v10, p0, LQ81$a;->j:Ljava/net/URI;

    iget-object v11, p0, LQ81$a;->k:LIy;

    iget-object v12, p0, LQ81$a;->l:LIy;

    iget-object v13, p0, LQ81$a;->m:Ljava/util/List;

    iget-object v14, p0, LQ81$a;->n:Ljava/security/KeyStore;

    move-object v1, v0

    invoke-direct/range {v1 .. v14}, LQ81;-><init>(LgF0;LIy;LIy;LIy;LRk2;Ljava/util/Set;LE9;Ljava/lang/String;Ljava/net/URI;LIy;LIy;Ljava/util/List;Ljava/security/KeyStore;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public b(Ljava/lang/String;)LQ81$a;
    .locals 0

    iput-object p1, p0, LQ81$a;->i:Ljava/lang/String;

    return-object p0
.end method

.method public c(LRk2;)LQ81$a;
    .locals 0

    iput-object p1, p0, LQ81$a;->f:LRk2;

    return-object p0
.end method

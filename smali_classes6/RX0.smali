.class public LRX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAg2;


# static fields
.field public static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lhh2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:LBg2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v1, LCE2;->d:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    sget-object v1, Lqm4;->c:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    sget-object v1, LO81;->c:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LRX0;->b:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LBg2;

    invoke-direct {v0}, LBg2;-><init>()V

    iput-object v0, p0, LRX0;->a:LBg2;

    return-void
.end method


# virtual methods
.method public c(Lih2;Ljava/security/Key;)Lkh2;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    sget-object v0, LCE2;->d:Ljava/util/Set;

    invoke-virtual {p1}, Lih2;->r()Lhh2;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of p1, p2, Ljavax/crypto/SecretKey;

    if-eqz p1, :cond_0

    check-cast p2, Ljavax/crypto/SecretKey;

    new-instance p1, LDE2;

    invoke-direct {p1, p2}, LDE2;-><init>(Ljavax/crypto/SecretKey;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/nimbusds/jose/KeyTypeException;

    const-class p2, Ljavax/crypto/SecretKey;

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/KeyTypeException;-><init>(Ljava/lang/Class;)V

    throw p1

    :cond_1
    sget-object v0, Lqm4;->c:Ljava/util/Set;

    invoke-virtual {p1}, Lih2;->r()Lhh2;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of p1, p2, Ljava/security/interfaces/RSAPublicKey;

    if-eqz p1, :cond_2

    check-cast p2, Ljava/security/interfaces/RSAPublicKey;

    new-instance p1, Lrm4;

    invoke-direct {p1, p2}, Lrm4;-><init>(Ljava/security/interfaces/RSAPublicKey;)V

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/nimbusds/jose/KeyTypeException;

    const-class p2, Ljava/security/interfaces/RSAPublicKey;

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/KeyTypeException;-><init>(Ljava/lang/Class;)V

    throw p1

    :cond_3
    sget-object v0, LO81;->c:Ljava/util/Set;

    invoke-virtual {p1}, Lih2;->r()Lhh2;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    instance-of p1, p2, Ljava/security/interfaces/ECPublicKey;

    if-eqz p1, :cond_4

    check-cast p2, Ljava/security/interfaces/ECPublicKey;

    new-instance p1, LP81;

    invoke-direct {p1, p2}, LP81;-><init>(Ljava/security/interfaces/ECPublicKey;)V

    :goto_0
    invoke-interface {p1}, LAg2;->getJCAContext()LBg2;

    move-result-object p2

    iget-object v0, p0, LRX0;->a:LBg2;

    invoke-virtual {v0}, LBg2;->a()Ljava/security/Provider;

    move-result-object v0

    invoke-virtual {p2, v0}, LBg2;->c(Ljava/security/Provider;)V

    return-object p1

    :cond_4
    new-instance p1, Lcom/nimbusds/jose/KeyTypeException;

    const-class p2, Ljava/security/interfaces/ECPublicKey;

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/KeyTypeException;-><init>(Ljava/lang/Class;)V

    throw p1

    :cond_5
    new-instance p2, Lcom/nimbusds/jose/JOSEException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported JWS algorithm: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lih2;->r()Lhh2;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public getJCAContext()LBg2;
    .locals 1

    iget-object v0, p0, LRX0;->a:LBg2;

    return-object v0
.end method

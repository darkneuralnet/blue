.class public LDE2;
.super LCE2;
.source "SourceFile"

# interfaces
.implements Lkh2;


# instance fields
.field public final e:LKE0;


# direct methods
.method public constructor <init>(Ljavax/crypto/SecretKey;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    invoke-direct {p0, p1}, LDE2;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LDE2;-><init>([BLjava/util/Set;)V

    return-void
.end method

.method public constructor <init>([BLjava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    sget-object v0, LCE2;->d:Ljava/util/Set;

    invoke-direct {p0, p1, v0}, LCE2;-><init>([BLjava/util/Set;)V

    new-instance p1, LKE0;

    invoke-direct {p1}, LKE0;-><init>()V

    iput-object p1, p0, LDE2;->e:LKE0;

    invoke-virtual {p1, p2}, LKE0;->e(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public b(Lih2;[BLIy;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    iget-object v0, p0, LDE2;->e:LKE0;

    invoke-virtual {v0, p1}, LKE0;->d(LyH1;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lih2;->r()Lhh2;

    move-result-object p1

    invoke-static {p1}, LCE2;->d(Lhh2;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LCE2;->e()[B

    move-result-object v0

    invoke-virtual {p0}, LmB;->getJCAContext()LBg2;

    move-result-object v1

    invoke-virtual {v1}, LBg2;->a()Ljava/security/Provider;

    move-result-object v1

    invoke-static {p1, v0, p2, v1}, LBE1;->a(Ljava/lang/String;[B[BLjava/security/Provider;)[B

    move-result-object p1

    invoke-virtual {p3}, LGy;->a()[B

    move-result-object p2

    invoke-static {p1, p2}, LRy0;->a([B[B)Z

    move-result p1

    return p1
.end method

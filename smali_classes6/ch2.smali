.class public final Lch2;
.super LBg2;
.source "SourceFile"


# instance fields
.field public c:Ljava/security/Provider;

.field public d:Ljava/security/Provider;

.field public e:Ljava/security/Provider;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lch2;-><init>(Ljava/security/Provider;Ljava/security/Provider;Ljava/security/Provider;Ljava/security/Provider;Ljava/security/SecureRandom;)V

    return-void
.end method

.method public constructor <init>(Ljava/security/Provider;Ljava/security/Provider;Ljava/security/Provider;Ljava/security/Provider;Ljava/security/SecureRandom;)V
    .locals 0

    invoke-direct {p0, p1, p5}, LBg2;-><init>(Ljava/security/Provider;Ljava/security/SecureRandom;)V

    iput-object p2, p0, Lch2;->c:Ljava/security/Provider;

    iput-object p3, p0, Lch2;->d:Ljava/security/Provider;

    iput-object p4, p0, Lch2;->e:Ljava/security/Provider;

    return-void
.end method


# virtual methods
.method public d()Ljava/security/Provider;
    .locals 1

    iget-object v0, p0, Lch2;->d:Ljava/security/Provider;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LBg2;->a()Ljava/security/Provider;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public e()Ljava/security/Provider;
    .locals 1

    iget-object v0, p0, Lch2;->c:Ljava/security/Provider;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LBg2;->a()Ljava/security/Provider;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public f()Ljava/security/Provider;
    .locals 1

    iget-object v0, p0, Lch2;->e:Ljava/security/Provider;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LBg2;->a()Ljava/security/Provider;

    move-result-object v0

    :goto_0
    return-object v0
.end method

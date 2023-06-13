.class public LVM1$a;
.super LD24;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVM1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LD24<",
        "LVE2;",
        "LTM1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, LD24;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/F;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    check-cast p1, LTM1;

    invoke-virtual {p0, p1}, LVM1$a;->c(LTM1;)LVE2;

    move-result-object p1

    return-object p1
.end method

.method public c(LTM1;)LVE2;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, LTM1;->L()LWM1;

    move-result-object v0

    invoke-virtual {v0}, LWM1;->J()LuH1;

    move-result-object v0

    invoke-virtual {p1}, LTM1;->K()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/g;->C()[B

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "HMAC"

    invoke-direct {v2, v1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {p1}, LTM1;->L()LWM1;

    move-result-object p1

    invoke-virtual {p1}, LWM1;->K()I

    move-result p1

    sget-object v1, LVM1$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    new-instance v0, Lq24;

    new-instance v1, Lp24;

    const-string v3, "HMACSHA512"

    invoke-direct {v1, v3, v2}, Lp24;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, Lq24;-><init>(Ln24;I)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Lq24;

    new-instance v1, Lp24;

    const-string v3, "HMACSHA384"

    invoke-direct {v1, v3, v2}, Lp24;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, Lq24;-><init>(Ln24;I)V

    return-object v0

    :cond_2
    new-instance v0, Lq24;

    new-instance v1, Lp24;

    const-string v3, "HMACSHA256"

    invoke-direct {v1, v3, v2}, Lp24;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, Lq24;-><init>(Ln24;I)V

    return-object v0

    :cond_3
    new-instance v0, Lq24;

    new-instance v1, Lp24;

    const-string v3, "HMACSHA224"

    invoke-direct {v1, v3, v2}, Lp24;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, Lq24;-><init>(Ln24;I)V

    return-object v0

    :cond_4
    new-instance v0, Lq24;

    new-instance v1, Lp24;

    const-string v3, "HMACSHA1"

    invoke-direct {v1, v3, v2}, Lp24;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, Lq24;-><init>(Ln24;I)V

    return-object v0
.end method

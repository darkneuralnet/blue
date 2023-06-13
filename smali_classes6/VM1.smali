.class public final LVM1;
.super LQk2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2<",
        "LTM1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LD24;

    new-instance v1, LVM1$a;

    const-class v2, LVE2;

    invoke-direct {v1, v2}, LVM1$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, LTM1;

    invoke-direct {p0, v1, v0}, LQk2;-><init>(Ljava/lang/Class;[LD24;)V

    return-void
.end method

.method public static synthetic k(LWM1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {p0}, LVM1;->r(LWM1;)V

    return-void
.end method

.method public static synthetic l(IILuH1;LJk2$b;)LQk2$a$a;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LVM1;->m(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object p0

    return-object p0
.end method

.method public static m(IILuH1;LJk2$b;)LQk2$a$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "LuH1;",
            "LJk2$b;",
            ")",
            "LQk2$a$a<",
            "LUM1;",
            ">;"
        }
    .end annotation

    new-instance v0, LQk2$a$a;

    invoke-static {}, LUM1;->L()LUM1$b;

    move-result-object v1

    invoke-static {}, LWM1;->L()LWM1$b;

    move-result-object v2

    invoke-virtual {v2, p2}, LWM1$b;->y(LuH1;)LWM1$b;

    move-result-object p2

    invoke-virtual {p2, p1}, LWM1$b;->z(I)LWM1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LWM1;

    invoke-virtual {v1, p1}, LUM1$b;->z(LWM1;)LUM1$b;

    move-result-object p1

    invoke-virtual {p1, p0}, LUM1$b;->y(I)LUM1$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LUM1;

    invoke-direct {v0, p0, p3}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    return-object v0
.end method

.method public static p(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, LVM1;

    invoke-direct {v0}, LVM1;-><init>()V

    invoke-static {v0, p0}, LNt4;->k(LQk2;Z)V

    return-void
.end method

.method public static r(LWM1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p0}, LWM1;->K()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    sget-object v0, LVM1$c;->a:[I

    invoke-virtual {p0}, LWM1;->J()LuH1;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "tag size too big"

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LWM1;->K()I

    move-result p0

    const/16 v0, 0x40

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0}, LWM1;->K()I

    move-result p0

    const/16 v0, 0x30

    if-gt p0, v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {p0}, LWM1;->K()I

    move-result p0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0}, LWM1;->K()I

    move-result p0

    const/16 v0, 0x1c

    if-gt p0, v0, :cond_7

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-virtual {p0}, LWM1;->K()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_9

    :goto_0
    return-void

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too small"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()LV46$b;
    .locals 1

    sget-object v0, LV46$b;->c:LV46$b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    return-object v0
.end method

.method public f()LQk2$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQk2$a<",
            "LUM1;",
            "LTM1;",
            ">;"
        }
    .end annotation

    new-instance v0, LVM1$b;

    const-class v1, LUM1;

    invoke-direct {v0, p0, v1}, LVM1$b;-><init>(LVM1;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lhk2$c;
    .locals 1

    sget-object v0, Lhk2$c;->d:Lhk2$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/g;)Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-virtual {p0, p1}, LVM1;->o(Lcom/google/crypto/tink/shaded/protobuf/g;)LTM1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/F;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    check-cast p1, LTM1;

    invoke-virtual {p0, p1}, LVM1;->q(LTM1;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/g;)LTM1;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, LTM1;->O(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LTM1;

    move-result-object p1

    return-object p1
.end method

.method public q(LTM1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, LTM1;->M()I

    move-result v0

    invoke-virtual {p0}, LVM1;->n()I

    move-result v1

    invoke-static {v0, v1}, LAj6;->c(II)V

    invoke-virtual {p1}, LTM1;->K()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, LTM1;->L()LWM1;

    move-result-object p1

    invoke-static {p1}, LVM1;->r(LWM1;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

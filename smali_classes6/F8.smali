.class public final LF8;
.super LQk2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2<",
        "LD8;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LD24;

    new-instance v1, LF8$a;

    const-class v2, Lp8;

    invoke-direct {v1, v2}, LF8$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, LD8;

    invoke-direct {p0, v1, v0}, LQk2;-><init>(Ljava/lang/Class;[LD24;)V

    return-void
.end method

.method public static synthetic k(IIIILuH1;LJk2$b;)LQk2$a$a;
    .locals 0

    invoke-static/range {p0 .. p5}, LF8;->m(IIIILuH1;LJk2$b;)LQk2$a$a;

    move-result-object p0

    return-object p0
.end method

.method public static l(IIIILuH1;)LE8;
    .locals 2

    invoke-static {}, LI8;->L()LI8$b;

    move-result-object v0

    invoke-static {}, LK8;->J()LK8$b;

    move-result-object v1

    invoke-virtual {v1, p1}, LK8$b;->y(I)LK8$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LK8;

    invoke-virtual {v0, p1}, LI8$b;->z(LK8;)LI8$b;

    move-result-object p1

    invoke-virtual {p1, p0}, LI8$b;->y(I)LI8$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LI8;

    invoke-static {}, LUM1;->L()LUM1$b;

    move-result-object p1

    invoke-static {}, LWM1;->L()LWM1$b;

    move-result-object v0

    invoke-virtual {v0, p4}, LWM1$b;->y(LuH1;)LWM1$b;

    move-result-object p4

    invoke-virtual {p4, p3}, LWM1$b;->z(I)LWM1$b;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p3

    check-cast p3, LWM1;

    invoke-virtual {p1, p3}, LUM1$b;->z(LWM1;)LUM1$b;

    move-result-object p1

    invoke-virtual {p1, p2}, LUM1$b;->y(I)LUM1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LUM1;

    invoke-static {}, LE8;->K()LE8$b;

    move-result-object p2

    invoke-virtual {p2, p0}, LE8$b;->y(LI8;)LE8$b;

    move-result-object p0

    invoke-virtual {p0, p1}, LE8$b;->z(LUM1;)LE8$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LE8;

    return-object p0
.end method

.method public static m(IIIILuH1;LJk2$b;)LQk2$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "LuH1;",
            "LJk2$b;",
            ")",
            "LQk2$a$a<",
            "LE8;",
            ">;"
        }
    .end annotation

    new-instance v0, LQk2$a$a;

    invoke-static {p0, p1, p2, p3, p4}, LF8;->l(IIIILuH1;)LE8;

    move-result-object p0

    invoke-direct {v0, p0, p5}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    return-object v0
.end method

.method public static p(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, LF8;

    invoke-direct {v0}, LF8;-><init>()V

    invoke-static {v0, p0}, LNt4;->k(LQk2;Z)V

    return-void
.end method


# virtual methods
.method public a()LV46$b;
    .locals 1

    sget-object v0, LV46$b;->c:LV46$b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0
.end method

.method public f()LQk2$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQk2$a<",
            "LE8;",
            "LD8;",
            ">;"
        }
    .end annotation

    new-instance v0, LF8$b;

    const-class v1, LE8;

    invoke-direct {v0, p0, v1}, LF8$b;-><init>(LF8;Ljava/lang/Class;)V

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

    invoke-virtual {p0, p1}, LF8;->o(Lcom/google/crypto/tink/shaded/protobuf/g;)LD8;

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

    check-cast p1, LD8;

    invoke-virtual {p0, p1}, LF8;->q(LD8;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/g;)LD8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, LD8;->N(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LD8;

    move-result-object p1

    return-object p1
.end method

.method public q(LD8;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, LD8;->L()I

    move-result v0

    invoke-virtual {p0}, LF8;->n()I

    move-result v1

    invoke-static {v0, v1}, LAj6;->c(II)V

    new-instance v0, LJ8;

    invoke-direct {v0}, LJ8;-><init>()V

    invoke-virtual {p1}, LD8;->J()LH8;

    move-result-object v1

    invoke-virtual {v0, v1}, LJ8;->n(LH8;)V

    new-instance v0, LVM1;

    invoke-direct {v0}, LVM1;-><init>()V

    invoke-virtual {p1}, LD8;->K()LTM1;

    move-result-object p1

    invoke-virtual {v0, p1}, LVM1;->q(LTM1;)V

    return-void
.end method

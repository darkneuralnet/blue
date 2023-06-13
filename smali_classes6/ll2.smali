.class public final Lll2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkl2;

.field public final b:LxV2;


# direct methods
.method public constructor <init>(Lkl2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lll2;->a:Lkl2;

    sget-object p1, LxV2;->b:LxV2;

    iput-object p1, p0, Lll2;->b:LxV2;

    return-void
.end method

.method public static a(LSc1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LSc1;->I()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lkl2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkl2;->L()I

    move-result p0

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(LSc1;Lp8;[B)Lkl2;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, LSc1;->I()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->C()[B

    move-result-object p0

    invoke-interface {p1, p0, p2}, Lp8;->b([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object p1

    invoke-static {p0, p1}, Lkl2;->P([BLcom/google/crypto/tink/shaded/protobuf/m;)Lkl2;

    move-result-object p0

    invoke-static {p0}, Lll2;->b(Lkl2;)V
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Lkl2;Lp8;[B)LSc1;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lp8;->a([B[B)[B

    move-result-object v0

    :try_start_0
    invoke-interface {p1, v0, p2}, Lp8;->b([B[B)[B

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object p2

    invoke-static {p1, p2}, Lkl2;->P([BLcom/google/crypto/tink/shaded/protobuf/m;)Lkl2;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/t;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    invoke-static {}, LSc1;->J()LSc1$b;

    move-result-object p1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->f([B)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p2

    invoke-virtual {p1, p2}, LSc1$b;->y(Lcom/google/crypto/tink/shaded/protobuf/g;)LSc1$b;

    move-result-object p1

    invoke-static {p0}, Lri6;->b(Lkl2;)Lml2;

    move-result-object p0

    invoke-virtual {p1, p0}, LSc1$b;->z(Lml2;)LSc1$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LSc1;

    return-object p0

    :cond_0
    :try_start_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "cannot encrypt keyset"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(Lkl2;)Lll2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {p0}, Lll2;->b(Lkl2;)V

    new-instance v0, Lll2;

    invoke-direct {v0, p0}, Lll2;-><init>(Lkl2;)V

    return-object v0
.end method

.method public static final j(Lol2;Lp8;)Lll2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {p0, p1, v0}, Lll2;->k(Lol2;Lp8;[B)Lll2;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lol2;Lp8;[B)Lll2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p0}, Lol2;->a()LSc1;

    move-result-object p0

    invoke-static {p0}, Lll2;->a(LSc1;)V

    new-instance v0, Lll2;

    invoke-static {p0, p1, p2}, Lll2;->c(LSc1;Lp8;[B)Lkl2;

    move-result-object p0

    invoke-direct {v0, p0}, Lll2;-><init>(Lkl2;)V

    return-object v0
.end method


# virtual methods
.method public f()Lkl2;
    .locals 1

    iget-object v0, p0, Lll2;->a:Lkl2;

    return-object v0
.end method

.method public g()Lml2;
    .locals 1

    iget-object v0, p0, Lll2;->a:Lkl2;

    invoke-static {v0}, Lri6;->b(Lkl2;)Lml2;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {p1}, LNt4;->c(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, Lll2;->i(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No wrapper found for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;",
            "Ljava/lang/Class<",
            "TB;>;)TP;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    iget-object v0, p0, Lll2;->a:Lkl2;

    invoke-static {v0}, Lri6;->d(Lkl2;)V

    invoke-static {p2}, LJ24;->j(Ljava/lang/Class;)LJ24$b;

    move-result-object v0

    iget-object v1, p0, Lll2;->b:LxV2;

    invoke-virtual {v0, v1}, LJ24$b;->e(LxV2;)LJ24$b;

    iget-object v1, p0, Lll2;->a:Lkl2;

    invoke-virtual {v1}, Lkl2;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkl2$c;

    invoke-virtual {v2}, Lkl2$c;->N()LIk2;

    move-result-object v3

    sget-object v4, LIk2;->d:LIk2;

    if-ne v3, v4, :cond_0

    invoke-virtual {v2}, Lkl2$c;->K()Lhk2;

    move-result-object v3

    invoke-static {v3, p2}, LNt4;->d(Lhk2;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2}, Lkl2$c;->L()I

    move-result v4

    iget-object v5, p0, Lll2;->a:Lkl2;

    invoke-virtual {v5}, Lkl2;->N()I

    move-result v5

    if-ne v4, v5, :cond_1

    invoke-virtual {v0, v3, v2}, LJ24$b;->a(Ljava/lang/Object;Lkl2$c;)LJ24$b;

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v3, v2}, LJ24$b;->b(Ljava/lang/Object;Lkl2$c;)LJ24$b;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LJ24$b;->d()LJ24;

    move-result-object p2

    invoke-static {p2, p1}, LNt4;->n(LJ24;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public l(Lpl2;Lp8;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-virtual {p0, p1, p2, v0}, Lll2;->m(Lpl2;Lp8;[B)V

    return-void
.end method

.method public m(Lpl2;Lp8;[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lll2;->a:Lkl2;

    invoke-static {v0, p2, p3}, Lll2;->d(Lkl2;Lp8;[B)LSc1;

    move-result-object p2

    invoke-interface {p1, p2}, Lpl2;->a(LSc1;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lll2;->g()Lml2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

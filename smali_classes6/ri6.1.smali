.class public final Lri6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lri6;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lkl2$c;)Lml2$c;
    .locals 2

    invoke-static {}, Lml2$c;->L()Lml2$c$a;

    move-result-object v0

    invoke-virtual {p0}, Lkl2$c;->K()Lhk2;

    move-result-object v1

    invoke-virtual {v1}, Lhk2;->L()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lml2$c$a;->B(Ljava/lang/String;)Lml2$c$a;

    move-result-object v0

    invoke-virtual {p0}, Lkl2$c;->N()LIk2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lml2$c$a;->A(LIk2;)Lml2$c$a;

    move-result-object v0

    invoke-virtual {p0}, Lkl2$c;->M()LeA3;

    move-result-object v1

    invoke-virtual {v0, v1}, Lml2$c$a;->z(LeA3;)Lml2$c$a;

    move-result-object v0

    invoke-virtual {p0}, Lkl2$c;->L()I

    move-result p0

    invoke-virtual {v0, p0}, Lml2$c$a;->y(I)Lml2$c$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, Lml2$c;

    return-object p0
.end method

.method public static b(Lkl2;)Lml2;
    .locals 2

    invoke-static {}, Lml2;->L()Lml2$b;

    move-result-object v0

    invoke-virtual {p0}, Lkl2;->N()I

    move-result v1

    invoke-virtual {v0, v1}, Lml2$b;->z(I)Lml2$b;

    move-result-object v0

    invoke-virtual {p0}, Lkl2;->M()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkl2$c;

    invoke-static {v1}, Lri6;->a(Lkl2$c;)Lml2$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lml2$b;->y(Lml2$c;)Lml2$b;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, Lml2;

    return-object p0
.end method

.method public static c(Lkl2$c;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p0}, Lkl2$c;->O()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lkl2$c;->M()LeA3;

    move-result-object v0

    sget-object v3, LeA3;->c:LeA3;

    if-eq v0, v3, :cond_1

    invoke-virtual {p0}, Lkl2$c;->N()LIk2;

    move-result-object v0

    sget-object v3, LIk2;->c:LIk2;

    if-eq v0, v3, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lkl2$c;->L()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v1

    const-string p0, "key %d has unknown status"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lkl2$c;->L()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v1

    const-string p0, "key %d has unknown prefix"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lkl2$c;->L()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v1

    const-string p0, "key %d has no key data"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Lkl2;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p0}, Lkl2;->N()I

    move-result v0

    invoke-virtual {p0}, Lkl2;->M()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v1

    move v4, v3

    move v5, v2

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkl2$c;

    invoke-virtual {v6}, Lkl2$c;->N()LIk2;

    move-result-object v7

    sget-object v8, LIk2;->d:LIk2;

    if-eq v7, v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v6}, Lri6;->c(Lkl2$c;)V

    invoke-virtual {v6}, Lkl2$c;->L()I

    move-result v7

    if-ne v7, v0, :cond_2

    if-nez v4, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset contains multiple primary keys"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    invoke-virtual {v6}, Lkl2$c;->K()Lhk2;

    move-result-object v6

    invoke-virtual {v6}, Lhk2;->K()Lhk2$c;

    move-result-object v6

    sget-object v7, Lhk2$c;->f:Lhk2$c;

    if-eq v6, v7, :cond_3

    move v5, v1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    if-eqz v3, :cond_7

    if-nez v4, :cond_6

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset doesn\'t contain a valid primary key"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_2
    return-void

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset must contain at least one ENABLED key"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

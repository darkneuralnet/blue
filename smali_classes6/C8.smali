.class public final LC8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ70;

.field public static final b:LLE3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLE3<",
            "Lw8;",
            "LH94;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:LKE3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKE3<",
            "LH94;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:LGk2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGk2<",
            "Lt8;",
            "LG94;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:LAk2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAk2<",
            "LG94;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v0}, Lsi6;->d(Ljava/lang/String;)LQ70;

    move-result-object v0

    sput-object v0, LC8;->a:LQ70;

    new-instance v1, Ly8;

    invoke-direct {v1}, Ly8;-><init>()V

    const-class v2, Lw8;

    const-class v3, LH94;

    invoke-static {v1, v2, v3}, LLE3;->a(LLE3$b;Ljava/lang/Class;Ljava/lang/Class;)LLE3;

    move-result-object v1

    sput-object v1, LC8;->b:LLE3;

    new-instance v1, Lz8;

    invoke-direct {v1}, Lz8;-><init>()V

    invoke-static {v1, v0, v3}, LKE3;->a(LKE3$b;LQ70;Ljava/lang/Class;)LKE3;

    move-result-object v1

    sput-object v1, LC8;->c:LKE3;

    new-instance v1, LA8;

    invoke-direct {v1}, LA8;-><init>()V

    const-class v2, Lt8;

    const-class v3, LG94;

    invoke-static {v1, v2, v3}, LGk2;->a(LGk2$b;Ljava/lang/Class;Ljava/lang/Class;)LGk2;

    move-result-object v1

    sput-object v1, LC8;->d:LGk2;

    new-instance v1, LB8;

    invoke-direct {v1}, LB8;-><init>()V

    invoke-static {v1, v0, v3}, LAk2;->a(LAk2$b;LQ70;Ljava/lang/Class;)LAk2;

    move-result-object v0

    sput-object v0, LC8;->e:LAk2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LG94;LMq5;)Lt8;
    .locals 0

    invoke-static {p0, p1}, LC8;->b(LG94;LMq5;)Lt8;

    move-result-object p0

    return-object p0
.end method

.method public static b(LG94;LMq5;)Lt8;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p0}, LG94;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, LG94;->g()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v1

    invoke-static {v0, v1}, Ls8;->N(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Ls8;

    move-result-object v0

    invoke-virtual {v0}, Ls8;->L()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ls8;->K()Lx8;

    move-result-object v1

    invoke-virtual {p0}, LG94;->e()LeA3;

    move-result-object v2

    invoke-static {v1, v2}, LC8;->c(Lx8;LeA3;)Lw8;

    move-result-object v1

    invoke-virtual {v0}, Ls8;->J()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->C()[B

    move-result-object v0

    invoke-static {p1}, LMq5;->b(LMq5;)LMq5;

    move-result-object p1

    invoke-static {v0, p1}, LLq5;->a([BLMq5;)LLq5;

    move-result-object p1

    invoke-virtual {p0}, LG94;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v1, p1, p0}, Lt8;->d(Lw8;LLq5;Ljava/lang/Integer;)Lt8;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing AesCmacKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to AesCmacParameters.parseParameters"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Lx8;LeA3;)Lw8;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p0}, Lx8;->I()I

    move-result p0

    invoke-static {p1}, LC8;->f(LeA3;)Lw8$a;

    move-result-object p1

    invoke-static {p0, p1}, Lw8;->a(ILw8$a;)Lw8;

    move-result-object p0

    return-object p0
.end method

.method public static d()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, LAX2;->a()LAX2;

    move-result-object v0

    invoke-static {v0}, LC8;->e(LAX2;)V

    return-void
.end method

.method public static e(LAX2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    sget-object v0, LC8;->b:LLE3;

    invoke-virtual {p0, v0}, LAX2;->g(LLE3;)V

    sget-object v0, LC8;->c:LKE3;

    invoke-virtual {p0, v0}, LAX2;->f(LKE3;)V

    sget-object v0, LC8;->d:LGk2;

    invoke-virtual {p0, v0}, LAX2;->e(LGk2;)V

    sget-object v0, LC8;->e:LAk2;

    invoke-virtual {p0, v0}, LAX2;->d(LAk2;)V

    return-void
.end method

.method public static f(LeA3;)Lw8$a;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    sget-object v0, LC8$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lw8$a;->e:Lw8$a;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse OutputPrefixType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LeA3;->getNumber()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lw8$a;->d:Lw8$a;

    return-object p0

    :cond_2
    sget-object p0, Lw8$a;->c:Lw8$a;

    return-object p0

    :cond_3
    sget-object p0, Lw8$a;->b:Lw8$a;

    return-object p0
.end method

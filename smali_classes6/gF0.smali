.class public final LgF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final e:LgF0;

.field public static final f:LgF0;

.field public static final g:LgF0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final h:LgF0;

.field public static final i:LgF0;

.field public static final j:LgF0;

.field public static final k:LgF0;

.field public static final l:LgF0;

.field public static final m:LgF0;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LgF0;

    const-string v1, "secp256r1"

    const-string v2, "1.2.840.10045.3.1.7"

    const-string v3, "P-256"

    invoke-direct {v0, v3, v1, v2}, LgF0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LgF0;->e:LgF0;

    new-instance v0, LgF0;

    const-string v1, "secp256k1"

    const-string v2, "1.3.132.0.10"

    invoke-direct {v0, v1, v1, v2}, LgF0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LgF0;->f:LgF0;

    new-instance v0, LgF0;

    const-string v3, "P-256K"

    invoke-direct {v0, v3, v1, v2}, LgF0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LgF0;->g:LgF0;

    new-instance v0, LgF0;

    const-string v1, "secp384r1"

    const-string v2, "1.3.132.0.34"

    const-string v3, "P-384"

    invoke-direct {v0, v3, v1, v2}, LgF0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LgF0;->h:LgF0;

    new-instance v0, LgF0;

    const-string v1, "secp521r1"

    const-string v2, "1.3.132.0.35"

    const-string v3, "P-521"

    invoke-direct {v0, v3, v1, v2}, LgF0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LgF0;->i:LgF0;

    new-instance v0, LgF0;

    const-string v1, "Ed25519"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2}, LgF0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LgF0;->j:LgF0;

    new-instance v0, LgF0;

    const-string v1, "Ed448"

    invoke-direct {v0, v1, v1, v2}, LgF0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LgF0;->k:LgF0;

    new-instance v0, LgF0;

    const-string v1, "X25519"

    invoke-direct {v0, v1, v1, v2}, LgF0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LgF0;->l:LgF0;

    new-instance v0, LgF0;

    const-string v1, "X448"

    invoke-direct {v0, v1, v1, v2}, LgF0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LgF0;->m:LgF0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, LgF0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, LgF0;->b:Ljava/lang/String;

    iput-object p2, p0, LgF0;->c:Ljava/lang/String;

    iput-object p3, p0, LgF0;->d:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The JOSE cryptographic curve name must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Ljava/security/spec/ECParameterSpec;)LgF0;
    .locals 0

    invoke-static {p0}, LR81;->a(Ljava/security/spec/ECParameterSpec;)LgF0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lhh2;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhh2;",
            ")",
            "Ljava/util/Set<",
            "LgF0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lhh2;->k:Lhh2;

    invoke-virtual {v0, p0}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LgF0;->e:LgF0;

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lhh2;->l:Lhh2;

    invoke-virtual {v0, p0}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, LgF0;->f:LgF0;

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v0, Lhh2;->m:Lhh2;

    invoke-virtual {v0, p0}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, LgF0;->h:LgF0;

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object v0, Lhh2;->n:Lhh2;

    invoke-virtual {v0, p0}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, LgF0;->i:LgF0;

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object v0, Lhh2;->r:Lhh2;

    invoke-virtual {v0, p0}, LE9;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    new-instance p0, Ljava/util/HashSet;

    const/4 v0, 0x2

    new-array v0, v0, [LgF0;

    const/4 v1, 0x0

    sget-object v2, LgF0;->j:LgF0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LgF0;->k:LgF0;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Ljava/lang/String;)LgF0;
    .locals 2

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, LgF0;->e:LgF0;

    invoke-virtual {v0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, LgF0;->g:LgF0;

    invoke-virtual {v0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, LgF0;->f:LgF0;

    invoke-virtual {v0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, LgF0;->h:LgF0;

    invoke-virtual {v0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    sget-object v0, LgF0;->i:LgF0;

    invoke-virtual {v0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    sget-object v0, LgF0;->j:LgF0;

    invoke-virtual {v0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v0

    :cond_5
    sget-object v0, LgF0;->k:LgF0;

    invoke-virtual {v0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    return-object v0

    :cond_6
    sget-object v0, LgF0;->l:LgF0;

    invoke-virtual {v0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    return-object v0

    :cond_7
    sget-object v0, LgF0;->m:LgF0;

    invoke-virtual {v0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    return-object v0

    :cond_8
    new-instance v0, LgF0;

    invoke-direct {v0, p0}, LgF0;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "The cryptographic curve string must not be null or empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LgF0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/security/spec/ECParameterSpec;
    .locals 1

    invoke-static {p0}, LR81;->b(LgF0;)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LgF0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LgF0;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LgF0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LgF0;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

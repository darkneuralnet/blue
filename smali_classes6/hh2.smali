.class public final Lhh2;
.super LE9;
.source "SourceFile"


# static fields
.field public static final e:Lhh2;

.field public static final f:Lhh2;

.field public static final g:Lhh2;

.field public static final h:Lhh2;

.field public static final i:Lhh2;

.field public static final j:Lhh2;

.field public static final k:Lhh2;

.field public static final l:Lhh2;

.field public static final m:Lhh2;

.field public static final n:Lhh2;

.field public static final o:Lhh2;

.field public static final p:Lhh2;

.field public static final q:Lhh2;

.field public static final r:Lhh2;

.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lhh2;

    const-string v1, "HS256"

    sget-object v2, LrJ4;->b:LrJ4;

    invoke-direct {v0, v1, v2}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->e:Lhh2;

    new-instance v0, Lhh2;

    sget-object v1, LrJ4;->d:LrJ4;

    const-string v2, "HS384"

    invoke-direct {v0, v2, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->f:Lhh2;

    new-instance v0, Lhh2;

    const-string v2, "HS512"

    invoke-direct {v0, v2, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->g:Lhh2;

    new-instance v0, Lhh2;

    sget-object v2, LrJ4;->c:LrJ4;

    const-string v3, "RS256"

    invoke-direct {v0, v3, v2}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->h:Lhh2;

    new-instance v0, Lhh2;

    const-string v3, "RS384"

    invoke-direct {v0, v3, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->i:Lhh2;

    new-instance v0, Lhh2;

    const-string v3, "RS512"

    invoke-direct {v0, v3, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->j:Lhh2;

    new-instance v0, Lhh2;

    const-string v3, "ES256"

    invoke-direct {v0, v3, v2}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->k:Lhh2;

    new-instance v0, Lhh2;

    const-string v2, "ES256K"

    invoke-direct {v0, v2, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->l:Lhh2;

    new-instance v0, Lhh2;

    const-string v2, "ES384"

    invoke-direct {v0, v2, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->m:Lhh2;

    new-instance v0, Lhh2;

    const-string v2, "ES512"

    invoke-direct {v0, v2, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->n:Lhh2;

    new-instance v0, Lhh2;

    const-string v2, "PS256"

    invoke-direct {v0, v2, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->o:Lhh2;

    new-instance v0, Lhh2;

    const-string v2, "PS384"

    invoke-direct {v0, v2, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->p:Lhh2;

    new-instance v0, Lhh2;

    const-string v2, "PS512"

    invoke-direct {v0, v2, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->q:Lhh2;

    new-instance v0, Lhh2;

    const-string v2, "EdDSA"

    invoke-direct {v0, v2, v1}, Lhh2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, Lhh2;->r:Lhh2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LE9;-><init>(Ljava/lang/String;LrJ4;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LrJ4;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LE9;-><init>(Ljava/lang/String;LrJ4;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)Lhh2;
    .locals 2

    sget-object v0, Lhh2;->e:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lhh2;->f:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lhh2;->g:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Lhh2;->h:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    sget-object v0, Lhh2;->i:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    sget-object v0, Lhh2;->j:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v0

    :cond_5
    sget-object v0, Lhh2;->k:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    return-object v0

    :cond_6
    sget-object v0, Lhh2;->l:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    return-object v0

    :cond_7
    sget-object v0, Lhh2;->m:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    return-object v0

    :cond_8
    sget-object v0, Lhh2;->n:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    return-object v0

    :cond_9
    sget-object v0, Lhh2;->o:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    return-object v0

    :cond_a
    sget-object v0, Lhh2;->p:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    return-object v0

    :cond_b
    sget-object v0, Lhh2;->q:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    return-object v0

    :cond_c
    sget-object v0, Lhh2;->r:Lhh2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    return-object v0

    :cond_d
    new-instance v0, Lhh2;

    invoke-direct {v0, p0}, Lhh2;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

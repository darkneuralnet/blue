.class public final LXg2;
.super LE9;
.source "SourceFile"


# static fields
.field public static final A:LXg2;

.field public static final e:LXg2;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final f:LXg2;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final g:LXg2;

.field public static final h:LXg2;

.field public static final i:LXg2;

.field public static final j:LXg2;

.field public static final k:LXg2;

.field public static final l:LXg2;

.field public static final m:LXg2;

.field public static final n:LXg2;

.field public static final o:LXg2;

.field public static final p:LXg2;

.field public static final q:LXg2;

.field public static final r:LXg2;

.field public static final s:LXg2;

.field private static final serialVersionUID:J = 0x1L

.field public static final t:LXg2;

.field public static final u:LXg2;

.field public static final v:LXg2;

.field public static final w:LXg2;

.field public static final x:LXg2;

.field public static final y:LXg2;

.field public static final z:LXg2;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LXg2;

    const-string v1, "RSA1_5"

    sget-object v2, LrJ4;->b:LrJ4;

    invoke-direct {v0, v1, v2}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->e:LXg2;

    new-instance v0, LXg2;

    sget-object v1, LrJ4;->d:LrJ4;

    const-string v2, "RSA-OAEP"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->f:LXg2;

    new-instance v0, LXg2;

    const-string v2, "RSA-OAEP-256"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->g:LXg2;

    new-instance v0, LXg2;

    const-string v2, "RSA-OAEP-384"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->h:LXg2;

    new-instance v0, LXg2;

    const-string v2, "RSA-OAEP-512"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->i:LXg2;

    new-instance v0, LXg2;

    sget-object v2, LrJ4;->c:LrJ4;

    const-string v3, "A128KW"

    invoke-direct {v0, v3, v2}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->j:LXg2;

    new-instance v0, LXg2;

    const-string v3, "A192KW"

    invoke-direct {v0, v3, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->k:LXg2;

    new-instance v0, LXg2;

    const-string v3, "A256KW"

    invoke-direct {v0, v3, v2}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->l:LXg2;

    new-instance v0, LXg2;

    const-string v3, "dir"

    invoke-direct {v0, v3, v2}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->m:LXg2;

    new-instance v0, LXg2;

    const-string v3, "ECDH-ES"

    invoke-direct {v0, v3, v2}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->n:LXg2;

    new-instance v0, LXg2;

    const-string v3, "ECDH-ES+A128KW"

    invoke-direct {v0, v3, v2}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->o:LXg2;

    new-instance v0, LXg2;

    const-string v3, "ECDH-ES+A192KW"

    invoke-direct {v0, v3, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->p:LXg2;

    new-instance v0, LXg2;

    const-string v3, "ECDH-ES+A256KW"

    invoke-direct {v0, v3, v2}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->q:LXg2;

    new-instance v0, LXg2;

    const-string v2, "ECDH-1PU"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->r:LXg2;

    new-instance v0, LXg2;

    const-string v2, "ECDH-1PU+A128KW"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->s:LXg2;

    new-instance v0, LXg2;

    const-string v2, "ECDH-1PU+A192KW"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->t:LXg2;

    new-instance v0, LXg2;

    const-string v2, "ECDH-1PU+A256KW"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->u:LXg2;

    new-instance v0, LXg2;

    const-string v2, "A128GCMKW"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->v:LXg2;

    new-instance v0, LXg2;

    const-string v2, "A192GCMKW"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->w:LXg2;

    new-instance v0, LXg2;

    const-string v2, "A256GCMKW"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->x:LXg2;

    new-instance v0, LXg2;

    const-string v2, "PBES2-HS256+A128KW"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->y:LXg2;

    new-instance v0, LXg2;

    const-string v2, "PBES2-HS384+A192KW"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->z:LXg2;

    new-instance v0, LXg2;

    const-string v2, "PBES2-HS512+A256KW"

    invoke-direct {v0, v2, v1}, LXg2;-><init>(Ljava/lang/String;LrJ4;)V

    sput-object v0, LXg2;->A:LXg2;

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

.method public static b(Ljava/lang/String;)LXg2;
    .locals 2

    sget-object v0, LXg2;->e:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, LXg2;->f:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, LXg2;->g:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, LXg2;->h:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    sget-object v0, LXg2;->i:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    sget-object v0, LXg2;->j:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v0

    :cond_5
    sget-object v0, LXg2;->k:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    return-object v0

    :cond_6
    sget-object v0, LXg2;->l:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    return-object v0

    :cond_7
    sget-object v0, LXg2;->m:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    return-object v0

    :cond_8
    sget-object v0, LXg2;->n:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    return-object v0

    :cond_9
    sget-object v0, LXg2;->o:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    return-object v0

    :cond_a
    sget-object v0, LXg2;->p:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    return-object v0

    :cond_b
    sget-object v0, LXg2;->q:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    return-object v0

    :cond_c
    sget-object v0, LXg2;->r:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    return-object v0

    :cond_d
    sget-object v0, LXg2;->s:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    return-object v0

    :cond_e
    sget-object v0, LXg2;->t:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    return-object v0

    :cond_f
    sget-object v0, LXg2;->u:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    return-object v0

    :cond_10
    sget-object v0, LXg2;->v:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    return-object v0

    :cond_11
    sget-object v0, LXg2;->w:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    return-object v0

    :cond_12
    sget-object v0, LXg2;->x:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    return-object v0

    :cond_13
    sget-object v0, LXg2;->y:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    return-object v0

    :cond_14
    sget-object v0, LXg2;->z:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    return-object v0

    :cond_15
    sget-object v0, LXg2;->A:LXg2;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    return-object v0

    :cond_16
    new-instance v0, LXg2;

    invoke-direct {v0, p0}, LXg2;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

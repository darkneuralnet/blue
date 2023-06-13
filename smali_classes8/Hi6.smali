.class public LHi6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LG9;

.field public static final b:LG9;

.field public static final c:LG9;

.field public static final d:LG9;

.field public static final e:LG9;

.field public static final f:LG9;

.field public static final g:LG9;

.field public static final h:LG9;

.field public static final i:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LG9;

    sget-object v1, LBD3;->X:LN;

    invoke-direct {v0, v1}, LG9;-><init>(LN;)V

    sput-object v0, LHi6;->a:LG9;

    new-instance v0, LG9;

    sget-object v2, LBD3;->Y:LN;

    invoke-direct {v0, v2}, LG9;-><init>(LN;)V

    sput-object v0, LHi6;->b:LG9;

    new-instance v0, LG9;

    sget-object v3, LhY2;->j:LN;

    invoke-direct {v0, v3}, LG9;-><init>(LN;)V

    sput-object v0, LHi6;->c:LG9;

    new-instance v0, LG9;

    sget-object v3, LhY2;->h:LN;

    invoke-direct {v0, v3}, LG9;-><init>(LN;)V

    sput-object v0, LHi6;->d:LG9;

    new-instance v0, LG9;

    sget-object v3, LhY2;->c:LN;

    invoke-direct {v0, v3}, LG9;-><init>(LN;)V

    sput-object v0, LHi6;->e:LG9;

    new-instance v0, LG9;

    sget-object v3, LhY2;->e:LN;

    invoke-direct {v0, v3}, LG9;-><init>(LN;)V

    sput-object v0, LHi6;->f:LG9;

    new-instance v0, LG9;

    sget-object v3, LhY2;->m:LN;

    invoke-direct {v0, v3}, LG9;-><init>(LN;)V

    sput-object v0, LHi6;->g:LG9;

    new-instance v0, LG9;

    sget-object v3, LhY2;->n:LN;

    invoke-direct {v0, v3}, LG9;-><init>(LN;)V

    sput-object v0, LHi6;->h:LG9;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LHi6;->i:Ljava/util/Map;

    const/4 v3, 0x5

    invoke-static {v3}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x6

    invoke-static {v1}, LQ52;->a(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)LG9;
    .locals 3

    const-string v0, "SHA-1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, LG9;

    sget-object v0, LBd3;->i:LN;

    sget-object v1, LTF0;->b:LTF0;

    invoke-direct {p0, v0, v1}, LG9;-><init>(LN;LE;)V

    return-object p0

    :cond_0
    const-string v0, "SHA-224"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, LG9;

    sget-object v0, LhY2;->f:LN;

    invoke-direct {p0, v0}, LG9;-><init>(LN;)V

    return-object p0

    :cond_1
    const-string v0, "SHA-256"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p0, LG9;

    sget-object v0, LhY2;->c:LN;

    invoke-direct {p0, v0}, LG9;-><init>(LN;)V

    return-object p0

    :cond_2
    const-string v0, "SHA-384"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p0, LG9;

    sget-object v0, LhY2;->d:LN;

    invoke-direct {p0, v0}, LG9;-><init>(LN;)V

    return-object p0

    :cond_3
    const-string v0, "SHA-512"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance p0, LG9;

    sget-object v0, LhY2;->e:LN;

    invoke-direct {p0, v0}, LG9;-><init>(LN;)V

    return-object p0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unrecognised digest algorithm: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(LN;)LP31;
    .locals 3

    sget-object v0, LhY2;->c:LN;

    invoke-virtual {p0, v0}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Lng5;

    invoke-direct {p0}, Lng5;-><init>()V

    return-object p0

    :cond_0
    sget-object v0, LhY2;->e:LN;

    invoke-virtual {p0, v0}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Lqg5;

    invoke-direct {p0}, Lqg5;-><init>()V

    return-object p0

    :cond_1
    sget-object v0, LhY2;->m:LN;

    invoke-virtual {p0, v0}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p0, Lrg5;

    const/16 v0, 0x80

    invoke-direct {p0, v0}, Lrg5;-><init>(I)V

    return-object p0

    :cond_2
    sget-object v0, LhY2;->n:LN;

    invoke-virtual {p0, v0}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p0, Lrg5;

    const/16 v0, 0x100

    invoke-direct {p0, v0}, Lrg5;-><init>(I)V

    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unrecognized digest OID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(LN;)Ljava/lang/String;
    .locals 3

    sget-object v0, LBd3;->i:LN;

    invoke-virtual {p0, v0}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "SHA-1"

    return-object p0

    :cond_0
    sget-object v0, LhY2;->f:LN;

    invoke-virtual {p0, v0}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "SHA-224"

    return-object p0

    :cond_1
    sget-object v0, LhY2;->c:LN;

    invoke-virtual {p0, v0}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "SHA-256"

    return-object p0

    :cond_2
    sget-object v0, LhY2;->d:LN;

    invoke-virtual {p0, v0}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "SHA-384"

    return-object p0

    :cond_3
    sget-object v0, LhY2;->e:LN;

    invoke-virtual {p0, v0}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p0, "SHA-512"

    return-object p0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unrecognised digest algorithm: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(I)LG9;
    .locals 3

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/4 v0, 0x6

    if-ne p0, v0, :cond_0

    sget-object p0, LHi6;->b:LG9;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown security category: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, LHi6;->a:LG9;

    return-object p0
.end method

.method public static e(LG9;)I
    .locals 1

    sget-object v0, LHi6;->i:Ljava/util/Map;

    invoke-virtual {p0}, LG9;->j()LN;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static f(Ljava/lang/String;)LG9;
    .locals 3

    const-string v0, "SHA3-256"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LHi6;->c:LG9;

    return-object p0

    :cond_0
    const-string v0, "SHA-512/256"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, LHi6;->d:LG9;

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown tree digest: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static g(Lsg5;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lsg5;->o()LG9;

    move-result-object p0

    invoke-virtual {p0}, LG9;->j()LN;

    move-result-object v0

    sget-object v1, LHi6;->c:LG9;

    invoke-virtual {v1}, LG9;->j()LN;

    move-result-object v1

    invoke-virtual {v0, v1}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "SHA3-256"

    return-object p0

    :cond_0
    invoke-virtual {p0}, LG9;->j()LN;

    move-result-object v0

    sget-object v1, LHi6;->d:LG9;

    invoke-virtual {v1}, LG9;->j()LN;

    move-result-object v1

    invoke-virtual {v0, v1}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "SHA-512/256"

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown tree digest: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LG9;->j()LN;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static h(Ljava/lang/String;)LG9;
    .locals 3

    const-string v0, "SHA-256"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LHi6;->e:LG9;

    return-object p0

    :cond_0
    const-string v0, "SHA-512"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, LHi6;->f:LG9;

    return-object p0

    :cond_1
    const-string v0, "SHAKE128"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, LHi6;->g:LG9;

    return-object p0

    :cond_2
    const-string v0, "SHAKE256"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, LHi6;->h:LG9;

    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown tree digest: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

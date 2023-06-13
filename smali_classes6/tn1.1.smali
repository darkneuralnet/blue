.class public final Ltn1;
.super LmQ3;
.source "SourceFile"


# static fields
.field public static final c:Lad;


# instance fields
.field public final a:LL73;

.field public final b:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lad;->e()Lad;

    move-result-object v0

    sput-object v0, Ltn1;->c:Lad;

    return-void
.end method

.method public constructor <init>(LL73;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, LmQ3;-><init>()V

    iput-object p2, p0, Ltn1;->b:Landroid/content/Context;

    iput-object p1, p0, Ltn1;->a:LL73;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 6

    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->w0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltn1;->j(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Ltn1;->c:Lad;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "URL is missing:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltn1;->a:LL73;

    invoke-virtual {v3}, LL73;->w0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_0
    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->w0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltn1;->g(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Ltn1;->c:Lad;

    const-string v2, "URL cannot be parsed"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_1
    iget-object v2, p0, Ltn1;->b:Landroid/content/Context;

    invoke-virtual {p0, v0, v2}, Ltn1;->h(Ljava/net/URI;Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Ltn1;->c:Lad;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "URL fails allowlist rule: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_2
    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ltn1;->k(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v0, Ltn1;->c:Lad;

    const-string v2, "URL host is null or invalid"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_3
    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ltn1;->p(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v0, Ltn1;->c:Lad;

    const-string v2, "URL scheme is null or invalid"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_4
    invoke-virtual {v0}, Ljava/net/URI;->getUserInfo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ltn1;->r(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    sget-object v0, Ltn1;->c:Lad;

    const-string v2, "URL user info is null"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_5
    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v0

    invoke-virtual {p0, v0}, Ltn1;->o(I)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Ltn1;->c:Lad;

    const-string v2, "URL port is less than or equal to 0"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_6
    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->y0()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->n0()LL73$d;

    move-result-object v0

    goto :goto_0

    :cond_7
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Ltn1;->l(LL73$d;)Z

    move-result v0

    if-nez v0, :cond_8

    sget-object v0, Ltn1;->c:Lad;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HTTP Method is null or invalid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltn1;->a:LL73;

    invoke-virtual {v3}, LL73;->n0()LL73$d;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_8
    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->z0()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->o0()I

    move-result v0

    invoke-virtual {p0, v0}, Ltn1;->m(I)Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Ltn1;->c:Lad;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HTTP ResponseCode is a negative value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltn1;->a:LL73;

    invoke-virtual {v3}, LL73;->o0()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_9
    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->A0()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->q0()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ltn1;->n(J)Z

    move-result v0

    if-nez v0, :cond_a

    sget-object v0, Ltn1;->c:Lad;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Request Payload is a negative value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltn1;->a:LL73;

    invoke-virtual {v3}, LL73;->q0()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_a
    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->B0()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->s0()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ltn1;->n(J)Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v0, Ltn1;->c:Lad;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Response Payload is a negative value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltn1;->a:LL73;

    invoke-virtual {v3}, LL73;->s0()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_b
    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->x0()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->l0()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_c

    goto/16 :goto_2

    :cond_c
    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->C0()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->t0()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ltn1;->q(J)Z

    move-result v0

    if-nez v0, :cond_d

    sget-object v0, Ltn1;->c:Lad;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Time to complete the request is a negative value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltn1;->a:LL73;

    invoke-virtual {v3}, LL73;->t0()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_d
    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->E0()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->v0()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ltn1;->q(J)Z

    move-result v0

    if-nez v0, :cond_e

    sget-object v0, Ltn1;->c:Lad;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Time from the start of the request to the start of the response is null or a negative value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltn1;->a:LL73;

    invoke-virtual {v3}, LL73;->v0()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_e
    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->D0()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->u0()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-gtz v0, :cond_f

    goto :goto_1

    :cond_f
    iget-object v0, p0, Ltn1;->a:LL73;

    invoke-virtual {v0}, LL73;->z0()Z

    move-result v0

    if-nez v0, :cond_10

    sget-object v0, Ltn1;->c:Lad;

    const-string v2, "Did not receive a HTTP Response Code"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_10
    const/4 v0, 0x1

    return v0

    :cond_11
    :goto_1
    sget-object v0, Ltn1;->c:Lad;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Time from the start of the request to the end of the response is null, negative or zero:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltn1;->a:LL73;

    invoke-virtual {v3}, LL73;->u0()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_12
    :goto_2
    sget-object v0, Ltn1;->c:Lad;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Start time of the request is null, or zero, or a negative value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltn1;->a:LL73;

    invoke-virtual {v3}, LL73;->l0()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1
.end method

.method public final g(Ljava/lang/String;)Ljava/net/URI;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    sget-object v1, Ltn1;->c:Lad;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    const-string p1, "getResultUrl throws exception %s"

    invoke-virtual {v1, p1, v2}, Lad;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public final h(Ljava/net/URI;Landroid/content/Context;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1, p2}, Lid6;->a(Ljava/net/URI;Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method public final i(Ljava/lang/String;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    return p1
.end method

.method public final j(Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ltn1;->i(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final k(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Ltn1;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0xff

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public l(LL73$d;)Z
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, LL73$d;->c:LL73$d;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final m(I)Z
    .locals 0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final n(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final o(I)Z
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final p(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const-string v1, "http"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "https"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public final q(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final r(Ljava/lang/String;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

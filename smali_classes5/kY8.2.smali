.class public final LkY8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LUH8;

.field public b:LNQ8;

.field public final c:I


# direct methods
.method public constructor <init>(LUH8;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LNQ8;

    invoke-direct {v0}, LNQ8;-><init>()V

    iput-object v0, p0, LkY8;->b:LNQ8;

    iput-object p1, p0, LkY8;->a:LUH8;

    invoke-static {}, LXZ8;->a()LXZ8;

    iput p2, p0, LkY8;->c:I

    return-void
.end method

.method public static d(LUH8;I)LkY8;
    .locals 1

    new-instance v0, LkY8;

    invoke-direct {v0, p0, p1}, LkY8;-><init>(LUH8;I)V

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LkY8;->c:I

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LkY8;->a:LUH8;

    invoke-virtual {v0}, LUH8;->h()LsI8;

    move-result-object v0

    invoke-virtual {v0}, LsI8;->d()LhR8;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LhR8;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZA7;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LhR8;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "NA"

    return-object v0
.end method

.method public final c(IZ)[B
    .locals 2

    iget-object p2, p0, LkY8;->b:LNQ8;

    xor-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, LNQ8;->f(Ljava/lang/Boolean;)LNQ8;

    iget-object p2, p0, LkY8;->b:LNQ8;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, LNQ8;->e(Ljava/lang/Boolean;)LNQ8;

    iget-object p2, p0, LkY8;->a:LUH8;

    iget-object v0, p0, LkY8;->b:LNQ8;

    invoke-virtual {v0}, LNQ8;->m()LhR8;

    move-result-object v0

    invoke-virtual {p2, v0}, LUH8;->g(LhR8;)LUH8;

    :try_start_0
    invoke-static {}, LXZ8;->a()LXZ8;

    if-nez p1, :cond_1

    iget-object p1, p0, LkY8;->a:LUH8;

    invoke-virtual {p1}, LUH8;->h()LsI8;

    move-result-object p1

    new-instance p2, Lqi2;

    invoke-direct {p2}, Lqi2;-><init>()V

    sget-object v0, LBw8;->a:LFx0;

    invoke-virtual {p2, v0}, Lqi2;->j(LFx0;)Lqi2;

    move-result-object p2

    invoke-virtual {p2, v1}, Lqi2;->k(Z)Lqi2;

    move-result-object p2

    invoke-virtual {p2}, Lqi2;->i()LHS0;

    move-result-object p2

    invoke-interface {p2, p1}, LHS0;->encode(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "utf-8"

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, LkY8;->a:LUH8;

    invoke-virtual {p1}, LUH8;->h()LsI8;

    move-result-object p1

    new-instance p2, LRS7;

    invoke-direct {p2}, LRS7;-><init>()V

    sget-object v0, LBw8;->a:LFx0;

    invoke-interface {v0, p2}, LFx0;->configure(Ltb1;)V

    invoke-virtual {p2}, LRS7;->b()LgT7;

    move-result-object p2

    invoke-virtual {p2, p1}, LgT7;->a(Ljava/lang/Object;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Failed to covert logging to UTF-8 byte array"

    invoke-direct {p2, v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final e(LIH8;)LkY8;
    .locals 1

    iget-object v0, p0, LkY8;->a:LUH8;

    invoke-virtual {v0, p1}, LUH8;->e(LIH8;)LUH8;

    return-object p0
.end method

.method public final f(LNQ8;)LkY8;
    .locals 0

    iput-object p1, p0, LkY8;->b:LNQ8;

    return-object p0
.end method

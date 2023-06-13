.class public final Lz59;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LxO8;

.field public b:LvX8;

.field public final c:I


# direct methods
.method public constructor <init>(LxO8;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LvX8;

    invoke-direct {v0}, LvX8;-><init>()V

    iput-object v0, p0, Lz59;->b:LvX8;

    iput-object p1, p0, Lz59;->a:LxO8;

    invoke-static {}, LS69;->a()LS69;

    iput p2, p0, Lz59;->c:I

    return-void
.end method

.method public static d(LxO8;)Lz59;
    .locals 2

    new-instance v0, Lz59;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lz59;-><init>(LxO8;I)V

    return-object v0
.end method

.method public static e(LxO8;I)Lz59;
    .locals 1

    new-instance p1, Lz59;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lz59;-><init>(LxO8;I)V

    return-object p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lz59;->c:I

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lz59;->a:LxO8;

    invoke-virtual {v0}, LxO8;->j()LSO8;

    move-result-object v0

    invoke-virtual {v0}, LSO8;->f()LPX8;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LPX8;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lth7;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LPX8;->k()Ljava/lang/String;

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

    iget-object p2, p0, Lz59;->b:LvX8;

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

    invoke-virtual {p2, v0}, LvX8;->f(Ljava/lang/Boolean;)LvX8;

    iget-object p2, p0, Lz59;->b:LvX8;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, LvX8;->e(Ljava/lang/Boolean;)LvX8;

    iget-object p2, p0, Lz59;->a:LxO8;

    iget-object v0, p0, Lz59;->b:LvX8;

    invoke-virtual {v0}, LvX8;->m()LPX8;

    move-result-object v0

    invoke-virtual {p2, v0}, LxO8;->i(LPX8;)LxO8;

    :try_start_0
    invoke-static {}, LS69;->a()LS69;

    if-nez p1, :cond_1

    iget-object p1, p0, Lz59;->a:LxO8;

    invoke-virtual {p1}, LxO8;->j()LSO8;

    move-result-object p1

    new-instance p2, Lqi2;

    invoke-direct {p2}, Lqi2;-><init>()V

    sget-object v0, LbC8;->a:LFx0;

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
    iget-object p1, p0, Lz59;->a:LxO8;

    invoke-virtual {p1}, LxO8;->j()LSO8;

    move-result-object p1

    new-instance p2, LqX7;

    invoke-direct {p2}, LqX7;-><init>()V

    sget-object v0, LbC8;->a:LFx0;

    invoke-interface {v0, p2}, LFx0;->configure(Ltb1;)V

    invoke-virtual {p2}, LqX7;->b()LFX7;

    move-result-object p2

    invoke-virtual {p2, p1}, LFX7;->a(Ljava/lang/Object;)[B

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

.method public final f(LlO8;)Lz59;
    .locals 1

    iget-object v0, p0, Lz59;->a:LxO8;

    invoke-virtual {v0, p1}, LxO8;->f(LlO8;)LxO8;

    return-object p0
.end method

.method public final g(LvX8;)Lz59;
    .locals 0

    iput-object p1, p0, Lz59;->b:LvX8;

    return-object p0
.end method

.class public final LC19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVZ8;


# instance fields
.field public final a:LSF8;

.field public b:LXS8;


# direct methods
.method public constructor <init>(LSF8;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, LXS8;

    invoke-direct {p2}, LXS8;-><init>()V

    iput-object p2, p0, LC19;->b:LXS8;

    iput-object p1, p0, LC19;->a:LSF8;

    invoke-static {}, LZ39;->a()LZ39;

    return-void
.end method

.method public static d(LSF8;)LVZ8;
    .locals 2

    new-instance v0, LC19;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LC19;-><init>(LSF8;I)V

    return-object v0
.end method


# virtual methods
.method public final a(IZ)[B
    .locals 2

    xor-int/lit8 p2, p1, 0x1

    iget-object v0, p0, LC19;->b:LXS8;

    const/4 v1, 0x1

    if-eq v1, p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, LXS8;->f(Ljava/lang/Boolean;)LXS8;

    iget-object p2, p0, LC19;->b:LXS8;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, LXS8;->e(Ljava/lang/Boolean;)LXS8;

    iget-object p2, p0, LC19;->a:LSF8;

    iget-object v0, p0, LC19;->b:LXS8;

    invoke-virtual {v0}, LXS8;->m()LVT8;

    move-result-object v0

    invoke-virtual {p2, v0}, LSF8;->e(LVT8;)LSF8;

    :try_start_0
    invoke-static {}, LZ39;->a()LZ39;

    if-nez p1, :cond_1

    iget-object p1, p0, LC19;->a:LSF8;

    invoke-virtual {p1}, LSF8;->f()LqG8;

    move-result-object p1

    new-instance p2, Lqi2;

    invoke-direct {p2}, Lqi2;-><init>()V

    sget-object v0, LWu8;->a:LFx0;

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
    iget-object p1, p0, LC19;->a:LSF8;

    invoke-virtual {p1}, LSF8;->f()LqG8;

    move-result-object p1

    new-instance p2, LDq7;

    invoke-direct {p2}, LDq7;-><init>()V

    sget-object v0, LWu8;->a:LFx0;

    invoke-interface {v0, p2}, LFx0;->configure(Ltb1;)V

    invoke-virtual {p2}, LDq7;->b()Lur7;

    move-result-object p2

    invoke-virtual {p2, p1}, Lur7;->a(Ljava/lang/Object;)[B

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

.method public final b(LXS8;)LVZ8;
    .locals 0

    iput-object p1, p0, LC19;->b:LXS8;

    return-object p0
.end method

.method public final c(LGF8;)LVZ8;
    .locals 1

    iget-object v0, p0, LC19;->a:LSF8;

    invoke-virtual {v0, p1}, LSF8;->c(LGF8;)LSF8;

    return-object p0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LC19;->a:LSF8;

    invoke-virtual {v0}, LSF8;->f()LqG8;

    move-result-object v0

    invoke-virtual {v0}, LqG8;->c()LVT8;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LVT8;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcm8;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LVT8;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "NA"

    return-object v0
.end method

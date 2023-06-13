.class public final Lwn9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRl9;


# instance fields
.field public final a:LW59;

.field public b:Lah9;

.field public final c:I


# direct methods
.method public constructor <init>(LW59;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lah9;

    invoke-direct {v0}, Lah9;-><init>()V

    iput-object v0, p0, Lwn9;->b:Lah9;

    iput-object p1, p0, Lwn9;->a:LW59;

    invoke-static {}, Lqo9;->a()Lqo9;

    iput p2, p0, Lwn9;->c:I

    return-void
.end method

.method public static d(LW59;)LRl9;
    .locals 2

    new-instance v0, Lwn9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lwn9;-><init>(LW59;I)V

    return-object v0
.end method

.method public static e(LW59;I)LRl9;
    .locals 1

    new-instance p1, Lwn9;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lwn9;-><init>(LW59;I)V

    return-object p1
.end method


# virtual methods
.method public final a(IZ)[B
    .locals 2

    xor-int/lit8 p2, p1, 0x1

    iget-object v0, p0, Lwn9;->b:Lah9;

    const/4 v1, 0x1

    if-eq v1, p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lah9;->f(Ljava/lang/Boolean;)Lah9;

    iget-object p2, p0, Lwn9;->b:Lah9;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Lah9;->e(Ljava/lang/Boolean;)Lah9;

    iget-object p2, p0, Lwn9;->a:LW59;

    iget-object v0, p0, Lwn9;->b:Lah9;

    invoke-virtual {v0}, Lah9;->m()Lqh9;

    move-result-object v0

    invoke-virtual {p2, v0}, LW59;->i(Lqh9;)LW59;

    :try_start_0
    invoke-static {}, Lqo9;->a()Lqo9;

    if-nez p1, :cond_1

    iget-object p1, p0, Lwn9;->a:LW59;

    invoke-virtual {p1}, LW59;->j()Lm69;

    move-result-object p1

    new-instance p2, Lqi2;

    invoke-direct {p2}, Lqi2;-><init>()V

    sget-object v0, LtV8;->a:LFx0;

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
    iget-object p1, p0, Lwn9;->a:LW59;

    invoke-virtual {p1}, LW59;->j()Lm69;

    move-result-object p1

    new-instance p2, LI28;

    invoke-direct {p2}, LI28;-><init>()V

    sget-object v0, LtV8;->a:LFx0;

    invoke-interface {v0, p2}, LFx0;->configure(Ltb1;)V

    invoke-virtual {p2}, LI28;->b()LV28;

    move-result-object p2

    invoke-virtual {p2, p1}, LV28;->a(Ljava/lang/Object;)[B

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

.method public final b(LO59;)LRl9;
    .locals 1

    iget-object v0, p0, Lwn9;->a:LW59;

    invoke-virtual {v0, p1}, LW59;->f(LO59;)LW59;

    return-object p0
.end method

.method public final c(Lah9;)LRl9;
    .locals 0

    iput-object p1, p0, Lwn9;->b:Lah9;

    return-object p0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lwn9;->c:I

    return v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lwn9;->a:LW59;

    invoke-virtual {v0}, LW59;->j()Lm69;

    move-result-object v0

    invoke-virtual {v0}, Lm69;->f()Lqh9;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqh9;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LDu7;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lqh9;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "NA"

    return-object v0
.end method

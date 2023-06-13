.class public final LYo7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lso7;


# instance fields
.field public final a:LXk7;

.field public b:LCm7;


# direct methods
.method public constructor <init>(LXk7;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, LCm7;

    invoke-direct {p2}, LCm7;-><init>()V

    iput-object p2, p0, LYo7;->b:LCm7;

    iput-object p1, p0, LYo7;->a:LXk7;

    invoke-static {}, Lkp7;->a()Lkp7;

    return-void
.end method

.method public static d(LXk7;)Lso7;
    .locals 2

    new-instance v0, LYo7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYo7;-><init>(LXk7;I)V

    return-object v0
.end method


# virtual methods
.method public final a(IZ)[B
    .locals 2

    iget-object p2, p0, LYo7;->b:LCm7;

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

    invoke-virtual {p2, v0}, LCm7;->f(Ljava/lang/Boolean;)LCm7;

    iget-object p2, p0, LYo7;->b:LCm7;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, LCm7;->e(Ljava/lang/Boolean;)LCm7;

    iget-object p2, p0, LYo7;->a:LXk7;

    iget-object v0, p0, LYo7;->b:LCm7;

    invoke-virtual {v0}, LCm7;->m()LEm7;

    move-result-object v0

    invoke-virtual {p2, v0}, LXk7;->f(LEm7;)LXk7;

    :try_start_0
    invoke-static {}, Lkp7;->a()Lkp7;

    if-nez p1, :cond_1

    iget-object p1, p0, LYo7;->a:LXk7;

    invoke-virtual {p1}, LXk7;->g()Lul7;

    move-result-object p1

    new-instance p2, Lqi2;

    invoke-direct {p2}, Lqi2;-><init>()V

    sget-object v0, LSj7;->a:LFx0;

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
    iget-object p1, p0, LYo7;->a:LXk7;

    invoke-virtual {p1}, LXk7;->g()Lul7;

    move-result-object p1

    new-instance p2, Ls39;

    invoke-direct {p2}, Ls39;-><init>()V

    sget-object v0, LSj7;->a:LFx0;

    invoke-interface {v0, p2}, LFx0;->configure(Ltb1;)V

    invoke-virtual {p2}, Ls39;->b()LB39;

    move-result-object p2

    invoke-virtual {p2, p1}, LB39;->a(Ljava/lang/Object;)[B

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

.method public final b(LWk7;)Lso7;
    .locals 1

    iget-object v0, p0, LYo7;->a:LXk7;

    invoke-virtual {v0, p1}, LXk7;->d(LWk7;)LXk7;

    return-object p0
.end method

.method public final c(LCm7;)Lso7;
    .locals 0

    iput-object p1, p0, LYo7;->b:LCm7;

    return-object p0
.end method

.method public final zza()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYo7;->a:LXk7;

    invoke-virtual {v0}, LXk7;->g()Lul7;

    move-result-object v0

    invoke-virtual {v0}, Lul7;->d()LEm7;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LEm7;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LNR8;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LEm7;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "NA"

    return-object v0
.end method

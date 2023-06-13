.class public final Lqf9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LyW8;

.field public b:Ly79;

.field public final c:I


# direct methods
.method public constructor <init>(LyW8;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly79;

    invoke-direct {v0}, Ly79;-><init>()V

    iput-object v0, p0, Lqf9;->b:Ly79;

    iput-object p1, p0, Lqf9;->a:LyW8;

    invoke-static {}, Lek9;->a()Lek9;

    iput p2, p0, Lqf9;->c:I

    return-void
.end method

.method public static d(LyW8;)Lqf9;
    .locals 2

    new-instance v0, Lqf9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lqf9;-><init>(LyW8;I)V

    return-object v0
.end method

.method public static e(LyW8;I)Lqf9;
    .locals 1

    new-instance p1, Lqf9;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lqf9;-><init>(LyW8;I)V

    return-object p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lqf9;->c:I

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lqf9;->a:LyW8;

    invoke-virtual {v0}, LyW8;->l()LUW8;

    move-result-object v0

    invoke-virtual {v0}, LUW8;->h()LM79;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LM79;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LjA8;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LM79;->k()Ljava/lang/String;

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

    iget-object p2, p0, Lqf9;->b:Ly79;

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

    invoke-virtual {p2, v0}, Ly79;->f(Ljava/lang/Boolean;)Ly79;

    iget-object p2, p0, Lqf9;->b:Ly79;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Ly79;->e(Ljava/lang/Boolean;)Ly79;

    iget-object p2, p0, Lqf9;->a:LyW8;

    iget-object v0, p0, Lqf9;->b:Ly79;

    invoke-virtual {v0}, Ly79;->m()LM79;

    move-result-object v0

    invoke-virtual {p2, v0}, LyW8;->k(LM79;)LyW8;

    :try_start_0
    invoke-static {}, Lek9;->a()Lek9;

    if-nez p1, :cond_1

    iget-object p1, p0, Lqf9;->a:LyW8;

    invoke-virtual {p1}, LyW8;->l()LUW8;

    move-result-object p1

    new-instance p2, Lqi2;

    invoke-direct {p2}, Lqi2;-><init>()V

    sget-object v0, LoM8;->a:LFx0;

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
    iget-object p1, p0, Lqf9;->a:LyW8;

    invoke-virtual {p1}, LyW8;->l()LUW8;

    move-result-object p1

    new-instance p2, LoS7;

    invoke-direct {p2}, LoS7;-><init>()V

    sget-object v0, LoM8;->a:LFx0;

    invoke-interface {v0, p2}, LFx0;->configure(Ltb1;)V

    invoke-virtual {p2}, LoS7;->b()LCS7;

    move-result-object p2

    invoke-virtual {p2, p1}, LCS7;->a(Ljava/lang/Object;)[B

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

.method public final f(LmW8;)Lqf9;
    .locals 1

    iget-object v0, p0, Lqf9;->a:LyW8;

    invoke-virtual {v0, p1}, LyW8;->f(LmW8;)LyW8;

    return-object p0
.end method

.method public final g(Ly79;)Lqf9;
    .locals 0

    iput-object p1, p0, Lqf9;->b:Ly79;

    return-object p0
.end method

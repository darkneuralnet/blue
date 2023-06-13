.class public final LxS8;
.super LIR8;
.source "SourceFile"


# direct methods
.method public constructor <init>(LhV8;)V
    .locals 0

    invoke-direct {p0, p1}, LIR8;-><init>(LhV8;)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/String;)LeS8;
    .locals 5

    invoke-static {}, LWl9;->b()Z

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    sget-object v1, La98;->s0:LL88;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "sgtm feature flag enabled."

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    iget-object v0, p0, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->W()Ltq7;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LeS8;

    invoke-virtual {p0, p1}, LxS8;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LeS8;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lpt8;->O()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v3, "sgtm upload enabled in manifest."

    invoke-virtual {v1, v3}, Lec8;->a(Ljava/lang/String;)V

    iget-object v1, p0, LIR8;->b:LhV8;

    invoke-virtual {v1}, LhV8;->a0()LOk8;

    move-result-object v1

    invoke-virtual {v0}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LOk8;->q(Ljava/lang/String;)LCg8;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LCg8;->K()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LCg8;->J()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->s()Lec8;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eq v3, v4, :cond_4

    const-string v3, "N"

    goto :goto_0

    :cond_4
    const-string v3, "Y"

    :goto_0
    const-string v4, "sgtm configured with upload_url, server_info"

    invoke-virtual {v2, v4, v1, v3}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->C()LFg7;

    new-instance v2, LeS8;

    invoke-direct {v2, v1}, LeS8;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "x-google-sgtm-server-info"

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LeS8;

    invoke-direct {v0, v1, v2}, LeS8;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    move-object v2, v0

    :goto_1
    if-eqz v2, :cond_6

    return-object v2

    :cond_6
    new-instance v0, LeS8;

    invoke-virtual {p0, p1}, LxS8;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LeS8;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->a0()LOk8;

    move-result-object v0

    invoke-virtual {v0, p1}, LOk8;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, La98;->s:LL88;

    invoke-virtual {v0, v1}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, La98;->s:LL88;

    invoke-virtual {p1, v1}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

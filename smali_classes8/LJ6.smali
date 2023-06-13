.class public LLJ6;
.super LmM6;
.source "SourceFile"


# instance fields
.field public c:LcM6;

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:Landroid/os/Handler;

.field public f:LSF2;

.field public g:LVF2;

.field public h:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(LcM6;LVF2;Landroid/os/Handler;Lorg/json/JSONObject;)V
    .locals 0
    .param p1    # LcM6;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # LVF2;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/os/Handler;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, LmM6;-><init>()V

    iput-object p1, p0, LLJ6;->c:LcM6;

    iput-object p2, p0, LLJ6;->g:LVF2;

    iput-object p3, p0, LLJ6;->e:Landroid/os/Handler;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LLJ6;->d:Ljava/util/Map;

    invoke-virtual {p2}, LVF2;->d()LSF2;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, LSF2;

    invoke-direct {p1}, LSF2;-><init>()V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LVF2;->d()LSF2;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LLJ6;->f:LSF2;

    iput-object p4, p0, LLJ6;->h:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, LLJ6;->g:LVF2;

    invoke-virtual {v0}, LVF2;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLJ6;->e()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LmM6;->a()V

    :goto_0
    return-void
.end method

.method public final c(ILjava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MagesGetRequest for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LLJ6;->c:LcM6;

    invoke-virtual {v2}, LcM6;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " returned status code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", and responseString: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {v0, p2, p1}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    sget-object v0, LLJ6$a;->a:[I

    iget-object v1, p0, LLJ6;->c:LcM6;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, LLJ6;->g:LVF2;

    invoke-virtual {p1}, LVF2;->b()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "REMOTE_CONFIG"

    invoke-static {p1, v2, v3}, LaL6;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, LlN6;->l(Lorg/json/JSONObject;)V

    sget-object p1, LWL6;->w:LWL6;

    invoke-virtual {p1}, LWL6;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v1}, LlN6;->i(Z)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LLJ6;->g:LVF2;

    invoke-virtual {v0}, LVF2;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "RAMP_CONFIG"

    invoke-static {v0, p1, v1}, LaL6;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public e()V
    .locals 6

    invoke-virtual {p0}, LLJ6;->f()V

    :try_start_0
    iget-object v0, p0, LLJ6;->f:LSF2;

    sget-object v1, LaM6;->d:LaM6;

    invoke-virtual {v0, v1}, LSF2;->a(LaM6;)LRF2;

    move-result-object v0

    invoke-virtual {p0}, LLJ6;->g()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-interface {v0, v2}, LRF2;->e(Landroid/net/Uri;)V

    iget-object v2, p0, LLJ6;->d:Ljava/util/Map;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, LLJ6;->d:Ljava/util/Map;

    invoke-interface {v0, v2}, LRF2;->d(Ljava/util/Map;)V

    :cond_1
    iget-object v2, p0, LLJ6;->e:Landroid/os/Handler;

    if-eqz v2, :cond_2

    sget-object v3, LbM6;->c:LbM6;

    invoke-virtual {v3}, LbM6;->a()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Magnes Request Started for URL: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_2
    const/4 v1, 0x0

    invoke-interface {v0, v1}, LRF2;->a([B)I

    move-result v1

    new-instance v2, Ljava/lang/String;

    invoke-interface {v0}, LRF2;->b()[B

    move-result-object v0

    const-string v3, "UTF-8"

    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {p0, v1, v2}, LLJ6;->c(ILjava/lang/String;)V

    sget-object v0, LbM6;->j:LbM6;

    invoke-virtual {v0}, LbM6;->a()I

    move-result v0

    if-ne v1, v0, :cond_3

    invoke-virtual {p0, v2}, LLJ6;->d(Ljava/lang/String;)V

    iget-object v0, p0, LLJ6;->e:Landroid/os/Handler;

    if-eqz v0, :cond_4

    sget-object v1, LbM6;->e:LbM6;

    invoke-virtual {v1}, LbM6;->a()I

    move-result v1

    invoke-static {v0, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_1

    :cond_3
    iget-object v0, p0, LLJ6;->e:Landroid/os/Handler;

    if-eqz v0, :cond_4

    sget-object v3, LbM6;->d:LbM6;

    invoke-virtual {v3}, LbM6;->a()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, LLJ6;->e:Landroid/os/Handler;

    if-eqz v1, :cond_4

    sget-object v2, LbM6;->d:LbM6;

    invoke-virtual {v2}, LbM6;->a()I

    move-result v2

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_4
    :goto_1
    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, LLJ6;->c:LcM6;

    sget-object v1, LcM6;->e:LcM6;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LLJ6;->i()V

    :cond_0
    return-void
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LLJ6;->c:LcM6;

    sget-object v1, LcM6;->e:LcM6;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LLJ6;->h:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LLJ6;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, LLJ6;->c:LcM6;

    invoke-virtual {v0}, LcM6;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LLJ6;->h:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, LcM6;->e:LcM6;

    invoke-virtual {v1}, LcM6;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "?p="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLJ6;->h:Lorg/json/JSONObject;

    const-string v2, "pairing_id"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&i="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLJ6;->h:Lorg/json/JSONObject;

    sget-object v2, LXL6;->s:LXL6;

    invoke-virtual {v2}, LXL6;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&t="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLJ6;->g:LVF2;

    invoke-virtual {v1}, LVF2;->e()I

    move-result v1

    sget-object v2, LWF2;->c:LWF2;

    invoke-virtual {v2}, LWF2;->a()I

    move-result v2

    if-ne v1, v2, :cond_1

    const-string v1, "&s="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLJ6;->h:Lorg/json/JSONObject;

    sget-object v2, LWL6;->f:LWL6;

    invoke-virtual {v2}, LWL6;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v2, "&a="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i()V
    .locals 5

    iget-object v0, p0, LLJ6;->h:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LLJ6;->d:Ljava/util/Map;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v3, LWL6;->f:LWL6;

    invoke-virtual {v3}, LWL6;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    aput-object v0, v2, v3

    iget-object v0, p0, LLJ6;->h:Lorg/json/JSONObject;

    sget-object v3, LWL6;->h:LWL6;

    invoke-virtual {v3}, LWL6;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x1

    aput-object v0, v2, v4

    iget-object v0, p0, LLJ6;->h:Lorg/json/JSONObject;

    invoke-virtual {v3}, LWL6;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    aput-object v0, v2, v3

    iget-object v0, p0, LLJ6;->h:Lorg/json/JSONObject;

    sget-object v3, LWL6;->e:LWL6;

    invoke-virtual {v3}, LWL6;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const-string v0, "%s/%s/%s/%s/Android"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "User-Agent"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LLJ6;->d:Ljava/util/Map;

    const-string v1, "Accept-Language"

    const-string v2, "en-us"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, LLJ6;->e:Landroid/os/Handler;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LLJ6;->e()V

    return-void
.end method

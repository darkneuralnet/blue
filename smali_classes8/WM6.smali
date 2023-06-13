.class public LWM6;
.super LaL6;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Landroid/content/Context;

.field public c:Landroid/os/Handler;

.field public d:LVF2;

.field public e:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(LVF2;Landroid/os/Handler;)V
    .locals 1
    .param p1    # LVF2;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Handler;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, LaL6;-><init>()V

    sget-object v0, LdM6;->i:LdM6;

    invoke-virtual {v0}, LdM6;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LWM6;->a:Ljava/lang/String;

    invoke-virtual {p1}, LVF2;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, LWM6;->b:Landroid/content/Context;

    iput-object p1, p0, LWM6;->d:LVF2;

    iput-object p2, p0, LWM6;->c:Landroid/os/Handler;

    invoke-virtual {p0}, LWM6;->j()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, LWM6;->h(Lorg/json/JSONObject;)V

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0}, LWM6;->i()Lorg/json/JSONObject;

    move-result-object p2

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public g()Lorg/json/JSONObject;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "entering getDefaultConfig"

    invoke-static {v0, v1, v2}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "s"

    invoke-virtual {p0}, LWM6;->k()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "hw"

    invoke-virtual {p0}, LWM6;->k()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ts"

    invoke-virtual {p0}, LWM6;->k()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "td"

    invoke-virtual {p0}, LWM6;->k()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, LdM6;->i:LdM6;

    invoke-virtual {v1}, LdM6;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x1c20

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v2, v3, v1}, LKJ6;->b(Ljava/lang/Class;ILjava/lang/Throwable;)V

    :goto_0
    return-object v0
.end method

.method public h(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, LWM6;->e:Lorg/json/JSONObject;

    return-void
.end method

.method public i()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, LWM6;->e:Lorg/json/JSONObject;

    return-object v0
.end method

.method public j()Lorg/json/JSONObject;
    .locals 6

    const-string v0, "RAMP_CONFIG"

    :try_start_0
    iget-object v1, p0, LWM6;->d:LVF2;

    invoke-virtual {v1}, LVF2;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, LaL6;->a(Ljava/lang/String;Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    new-instance v0, LLJ6;

    sget-object v1, LcM6;->g:LcM6;

    iget-object v3, p0, LWM6;->d:LVF2;

    iget-object v4, p0, LWM6;->c:Landroid/os/Handler;

    invoke-direct {v0, v1, v3, v4, v2}, LLJ6;-><init>(LcM6;LVF2;Landroid/os/Handler;Lorg/json/JSONObject;)V

    invoke-virtual {v0}, LLJ6;->b()V

    invoke-virtual {p0}, LWM6;->g()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v3, p0, LWM6;->b:Landroid/content/Context;

    invoke-virtual {p0, v3, v0}, LaL6;->f(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    sget-object v0, LVL6;->c:LVL6;

    invoke-static {v1, v3, v4, v0}, LaL6;->d(Lorg/json/JSONObject;JLVL6;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v3, "Cached config used while fetching."

    const/4 v4, 0x0

    invoke-static {v0, v4, v3}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V

    new-instance v0, LLJ6;

    sget-object v3, LcM6;->g:LcM6;

    iget-object v4, p0, LWM6;->d:LVF2;

    iget-object v5, p0, LWM6;->c:Landroid/os/Handler;

    invoke-direct {v0, v3, v4, v5, v2}, LLJ6;-><init>(LcM6;LVF2;Landroid/os/Handler;Lorg/json/JSONObject;)V

    invoke-virtual {v0}, LLJ6;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-object v1

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v1, v2, v0}, LKJ6;->b(Ljava/lang/Class;ILjava/lang/Throwable;)V

    invoke-virtual {p0}, LWM6;->g()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lorg/json/JSONObject;
    .locals 5

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    sget-object v1, LdM6;->c:LdM6;

    invoke-virtual {v1}, LdM6;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    sget-object v1, LdM6;->f:LdM6;

    invoke-virtual {v1}, LdM6;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    sget-object v1, LdM6;->e:LdM6;

    invoke-virtual {v1}, LdM6;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "4.4.0"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, LdM6;->d:LdM6;

    invoke-virtual {v1}, LdM6;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, LdM6;->g:LdM6;

    invoke-virtual {v1}, LdM6;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, LdM6;->h:LdM6;

    invoke-virtual {v1}, LdM6;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to create deafult config due to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x3

    invoke-static {v2, v3, v1}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V

    :goto_0
    return-object v0
.end method

.class public LbL6;
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

.field public i:Z


# direct methods
.method public constructor <init>(LcM6;Lorg/json/JSONObject;ZLVF2;Landroid/os/Handler;)V
    .locals 0
    .param p1    # LcM6;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # LVF2;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/os/Handler;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, LmM6;-><init>()V

    iput-object p1, p0, LbL6;->c:LcM6;

    iput-object p2, p0, LbL6;->h:Lorg/json/JSONObject;

    iput-boolean p3, p0, LbL6;->i:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LbL6;->d:Ljava/util/Map;

    iput-object p5, p0, LbL6;->e:Landroid/os/Handler;

    iput-object p4, p0, LbL6;->g:LVF2;

    invoke-virtual {p4}, LVF2;->d()LSF2;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, LSF2;

    invoke-direct {p1}, LSF2;-><init>()V

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, LVF2;->d()LSF2;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LbL6;->f:LSF2;

    return-void
.end method


# virtual methods
.method public final b(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, LWL6;->i:LWL6;

    invoke-virtual {v2}, LWL6;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, LWL6;->y:LWL6;

    invoke-virtual {v2}, LWL6;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 p1, 0x2

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    aput-object v2, v1, p1

    const-string p1, "Dyson/%S (%S %S)"

    invoke-static {v0, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LbL6;->g:LVF2;

    invoke-virtual {v0}, LVF2;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LbL6;->e()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LmM6;->a()V

    :goto_0
    return-void
.end method

.method public final d(ILjava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MagnesPostRequest for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LbL6;->c:LcM6;

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

.method public e()V
    .locals 6

    const-string v0, "UTF-8"

    invoke-virtual {p0}, LbL6;->f()V

    :try_start_0
    iget-object v1, p0, LbL6;->f:LSF2;

    sget-object v2, LaM6;->c:LaM6;

    invoke-virtual {v1, v2}, LSF2;->a(LaM6;)LRF2;

    move-result-object v1

    invoke-virtual {p0}, LbL6;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, LbL6;->h()Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_2

    if-nez v3, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-interface {v1, v4}, LRF2;->e(Landroid/net/Uri;)V

    iget-object v4, p0, LbL6;->d:Ljava/util/Map;

    invoke-interface {v1, v4}, LRF2;->d(Ljava/util/Map;)V

    iget-object v4, p0, LbL6;->e:Landroid/os/Handler;

    sget-object v5, LbM6;->f:LbM6;

    invoke-virtual {v5}, LbM6;->a()I

    move-result v5

    invoke-static {v4, v5, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-interface {v1, v2}, LRF2;->a([B)I

    move-result v2

    new-instance v3, Ljava/lang/String;

    invoke-interface {v1}, LRF2;->b()[B

    move-result-object v4

    invoke-direct {v3, v4, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    const-string v0, "MagnesPostRequest"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "MagnesPostRequest returned PayPal-Debug-Id: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, LRF2;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v2, v3}, LbL6;->d(ILjava/lang/String;)V

    sget-object v0, LbM6;->j:LbM6;

    invoke-virtual {v0}, LbM6;->a()I

    move-result v0

    if-ne v2, v0, :cond_1

    iget-object v0, p0, LbL6;->e:Landroid/os/Handler;

    if-eqz v0, :cond_3

    sget-object v1, LbM6;->h:LbM6;

    invoke-virtual {v1}, LbM6;->a()I

    move-result v1

    invoke-static {v0, v1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_2

    :cond_1
    iget-object v0, p0, LbL6;->e:Landroid/os/Handler;

    if-eqz v0, :cond_3

    sget-object v1, LbM6;->g:LbM6;

    invoke-virtual {v1}, LbM6;->a()I

    move-result v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    :goto_1
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v1, v2, v0}, LKJ6;->b(Ljava/lang/Class;ILjava/lang/Throwable;)V

    iget-object v1, p0, LbL6;->e:Landroid/os/Handler;

    if-eqz v1, :cond_3

    sget-object v2, LbM6;->g:LbM6;

    invoke-virtual {v2}, LbM6;->a()I

    move-result v2

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_3
    :goto_2
    return-void
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, LbL6;->g:LVF2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, LbL6$a;->a:[I

    iget-object v1, p0, LbL6;->c:LcM6;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LbL6;->g:LVF2;

    invoke-virtual {v0}, LVF2;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LzN6;->o(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    :goto_0
    iput-object v0, p0, LbL6;->d:Ljava/util/Map;

    goto :goto_1

    :cond_1
    iget-object v0, p0, LbL6;->g:LVF2;

    invoke-virtual {v0}, LVF2;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LzN6;->q(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_2

    goto :goto_0

    :catch_0
    move-exception v0

    const-class v1, LzN6;

    const/4 v2, 0x3

    invoke-static {v1, v2, v0}, LKJ6;->b(Ljava/lang/Class;ILjava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LbL6;->g:LVF2;

    if-eqz v0, :cond_5

    iget-object v0, p0, LbL6;->e:Landroid/os/Handler;

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    sget-object v0, LbL6$a;->a:[I

    iget-object v1, p0, LbL6;->c:LcM6;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LbL6;->c:LcM6;

    invoke-virtual {v0}, LcM6;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LbL6;->g:LVF2;

    invoke-virtual {v0}, LVF2;->c()Lxf1;

    move-result-object v0

    sget-object v1, Lxf1;->b:Lxf1;

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, LbL6;->i:Z

    if-eqz v0, :cond_1

    sget-object v0, LcM6;->c:LcM6;

    goto :goto_0

    :cond_1
    sget-object v0, LcM6;->f:LcM6;

    :goto_0
    invoke-virtual {v0}, LcM6;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-boolean v0, p0, LbL6;->i:Z

    if-eqz v0, :cond_3

    sget-object v0, LcM6;->l:LcM6;

    goto :goto_0

    :cond_3
    sget-object v0, LcM6;->m:LcM6;

    goto :goto_0

    :goto_1
    return-object v0

    :pswitch_1
    iget-object v0, p0, LbL6;->g:LVF2;

    invoke-virtual {v0}, LVF2;->c()Lxf1;

    move-result-object v0

    sget-object v1, Lxf1;->b:Lxf1;

    if-ne v0, v1, :cond_4

    invoke-static {}, LUF2;->g()LUF2;

    move-result-object v0

    iget-object v0, v0, LUF2;->a:LlN6;

    invoke-virtual {v0}, LlN6;->r()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    sget-object v0, LcM6;->i:LcM6;

    invoke-virtual {v0}, LcM6;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LbL6;->h:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, LbL6$a;->a:[I

    iget-object v2, p0, LbL6;->c:LcM6;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    iget-object v0, p0, LbL6;->h:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, LbL6;->i()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LbL6;->h:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, LbL6;->h:Lorg/json/JSONObject;

    sget-object v2, LWL6;->e:LWL6;

    invoke-virtual {v2}, LWL6;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "appGuid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LbL6;->h:Lorg/json/JSONObject;

    invoke-virtual {p0, v1}, LbL6;->b(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "libraryVersion"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LbL6;->h:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "additionalData"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    const-string v4, "&"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "UTF-8"

    invoke-static {v4, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Encoded Device info payload : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v4, v2}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, LbL6;->e:Landroid/os/Handler;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LbL6;->e()V

    return-void
.end method

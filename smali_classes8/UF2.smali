.class public final LUF2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static j:LUF2;


# instance fields
.field public a:LlN6;

.field public b:LVF2;

.field public c:Lorg/json/JSONObject;

.field public d:Landroid/os/Handler;

.field public e:Landroid/os/HandlerThread;

.field public f:LMN6;

.field public g:LWM6;

.field public h:LpO6;

.field public i:LvO6;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LpO6;->r()LpO6;

    move-result-object v0

    iput-object v0, p0, LUF2;->h:LpO6;

    invoke-static {}, LvO6;->r()LvO6;

    move-result-object v0

    iput-object v0, p0, LUF2;->i:LvO6;

    return-void
.end method

.method public static declared-synchronized g()LUF2;
    .locals 2

    const-class v0, LUF2;

    monitor-enter v0

    :try_start_0
    sget-object v1, LUF2;->j:LUF2;

    if-nez v1, :cond_0

    new-instance v1, LUF2;

    invoke-direct {v1}, LUF2;-><init>()V

    sput-object v1, LUF2;->j:LUF2;

    :cond_0
    sget-object v1, LUF2;->j:LUF2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Z)LTF2;
    .locals 13
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation

        .annotation build Landroid/support/annotation/Size;
            max = 0x20L
        .end annotation
    .end param
    .param p3    # Ljava/util/HashMap;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)",
            "LTF2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Llib/android/paypal/com/magnessdk/InvalidInputException;
        }
    .end annotation

    move-object v1, p0

    move-object v0, p2

    const-class v10, LUF2;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "COLLECT method called with paypalClientMetaDataId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " , Is pass in additionalData null? : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v11, 0x0

    if-nez p3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v11

    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v11, v2}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x20

    if-gt v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Llib/android/paypal/com/magnessdk/InvalidInputException;

    sget-object v2, LUL6;->c:LUL6;

    invoke-virtual {v2}, LUL6;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Llib/android/paypal/com/magnessdk/InvalidInputException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    iget-object v2, v1, LUF2;->b:LVF2;

    const/4 v12, 0x2

    if-nez v2, :cond_3

    const-string v2, "No MagnesSettings specified, using platform default."

    invoke-static {v10, v12, v2}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V

    new-instance v2, LVF2$b;

    move-object v3, p1

    invoke-direct {v2, p1}, LVF2$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, LVF2$b;->j()LVF2;

    move-result-object v2

    iput-object v2, v1, LUF2;->b:LVF2;

    invoke-virtual {p0, v2}, LUF2;->h(LVF2;)LVF2;

    :cond_3
    iget-object v2, v1, LUF2;->a:LlN6;

    invoke-virtual {v2}, LlN6;->s()Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "nc presents, collecting coreData."

    invoke-static {v10, v11, v2}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V

    new-instance v2, LMN6;

    invoke-direct {v2}, LMN6;-><init>()V

    iput-object v2, v1, LUF2;->f:LMN6;

    iget-object v3, v1, LUF2;->b:LVF2;

    iget-object v4, v1, LUF2;->g:LWM6;

    iget-object v5, v1, LUF2;->a:LlN6;

    invoke-virtual {v2, v3, v4, v5}, LMN6;->r(LVF2;LWM6;LlN6;)Lorg/json/JSONObject;

    move-result-object v2

    iput-object v2, v1, LUF2;->c:Lorg/json/JSONObject;

    invoke-static {v11}, LlN6;->i(Z)V

    :cond_4
    new-instance v2, LbO6;

    move/from16 v3, p4

    invoke-direct {v2, v3}, LbO6;-><init>(Z)V

    iget-object v3, v1, LUF2;->b:LVF2;

    iget-object v4, v1, LUF2;->g:LWM6;

    iget-object v5, v1, LUF2;->a:LlN6;

    iget-object v6, v1, LUF2;->f:LMN6;

    invoke-virtual {v6}, LMN6;->v()Ljava/lang/String;

    move-result-object v6

    iget-object v9, v1, LUF2;->d:Landroid/os/Handler;

    move-object v7, p2

    move-object/from16 v8, p3

    invoke-virtual/range {v2 .. v9}, LbO6;->u(LVF2;LWM6;LlN6;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Landroid/os/Handler;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v2, v1, LUF2;->f:LMN6;

    invoke-virtual {v2, v0}, LKN6;->g(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Device Info JSONObject : "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v11, v0}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V

    const-string v0, "pairing_id"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const/4 v3, 0x3

    invoke-static {v10, v3, v0}, LKJ6;->b(Ljava/lang/Class;ILjava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_2
    new-instance v3, LTF2;

    invoke-direct {v3}, LTF2;-><init>()V

    invoke-virtual {v3, v2}, LTF2;->c(Lorg/json/JSONObject;)LTF2;

    move-result-object v2

    invoke-virtual {v2, v0}, LTF2;->d(Ljava/lang/String;)LTF2;

    move-result-object v0

    return-object v0
.end method

.method public b()LWM6;
    .locals 3

    iget-object v0, p0, LUF2;->g:LWM6;

    if-nez v0, :cond_0

    new-instance v0, LWM6;

    iget-object v1, p0, LUF2;->b:LVF2;

    iget-object v2, p0, LUF2;->d:Landroid/os/Handler;

    invoke-direct {v0, v1, v2}, LWM6;-><init>(LVF2;Landroid/os/Handler;)V

    iput-object v0, p0, LUF2;->g:LWM6;

    :cond_0
    iget-object v0, p0, LUF2;->g:LWM6;

    return-object v0
.end method

.method public final c(Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 6

    new-instance p1, LbL6;

    sget-object v1, LcM6;->d:LcM6;

    const/4 v3, 0x0

    iget-object v4, p0, LUF2;->b:LVF2;

    iget-object v5, p0, LUF2;->d:Landroid/os/Handler;

    move-object v0, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, LbL6;-><init>(LcM6;Lorg/json/JSONObject;ZLVF2;Landroid/os/Handler;)V

    invoke-virtual {p1}, LbL6;->c()V

    invoke-virtual {p0}, LUF2;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LLJ6;

    sget-object v0, LcM6;->e:LcM6;

    iget-object v1, p0, LUF2;->b:LVF2;

    iget-object v2, p0, LUF2;->d:Landroid/os/Handler;

    invoke-direct {p1, v0, v1, v2, p2}, LLJ6;-><init>(LcM6;LVF2;Landroid/os/Handler;Lorg/json/JSONObject;)V

    invoke-virtual {p1}, LLJ6;->b()V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, LUF2;->e:Landroid/os/HandlerThread;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "MagnesHandlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LUF2;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    iget-object v0, p0, LUF2;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0, p0}, LmN6;->a(Landroid/os/Looper;LUF2;)LmN6;

    move-result-object v0

    iput-object v0, p0, LUF2;->d:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, LUF2;->b:LVF2;

    invoke-virtual {v0}, LVF2;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LUF2;->b:LVF2;

    invoke-virtual {v0}, LVF2;->c()Lxf1;

    move-result-object v0

    sget-object v1, Lxf1;->b:Lxf1;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;)LTF2;
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation

        .annotation build Landroid/support/annotation/Size;
            max = 0x20L
        .end annotation
    .end param
    .param p3    # Ljava/util/HashMap;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "LTF2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Llib/android/paypal/com/magnessdk/InvalidInputException;
        }
    .end annotation

    const-class v0, LUF2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SUBMIT method called with paypalClientMetaDataId : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " , Is pass in additionalData null? : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez p3, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1}, LKJ6;->a(Ljava/lang/Class;ILjava/lang/String;)V

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Llib/android/paypal/com/magnessdk/InvalidInputException;

    sget-object p2, LUL6;->c:LUL6;

    invoke-virtual {p2}, LUL6;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Llib/android/paypal/com/magnessdk/InvalidInputException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {p0, p1, p2, p3, v2}, LUF2;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Z)LTF2;

    move-result-object p2

    invoke-virtual {p2}, LTF2;->a()Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, LUF2;->c(Landroid/content/Context;Lorg/json/JSONObject;)V

    return-object p2
.end method

.method public h(LVF2;)LVF2;
    .locals 4
    .param p1    # LVF2;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iput-object p1, p0, LUF2;->b:LVF2;

    invoke-virtual {p0}, LUF2;->d()V

    new-instance v0, LlN6;

    iget-object v1, p0, LUF2;->d:Landroid/os/Handler;

    invoke-direct {v0, p1, v1}, LlN6;-><init>(LVF2;Landroid/os/Handler;)V

    iput-object v0, p0, LUF2;->a:LlN6;

    new-instance v0, LWM6;

    iget-object v1, p0, LUF2;->d:Landroid/os/Handler;

    invoke-direct {v0, p1, v1}, LWM6;-><init>(LVF2;Landroid/os/Handler;)V

    iput-object v0, p0, LUF2;->g:LWM6;

    iget-object v1, p0, LUF2;->h:LpO6;

    iget-object v2, p0, LUF2;->b:LVF2;

    iget-object v3, p0, LUF2;->d:Landroid/os/Handler;

    invoke-virtual {v1, v0, v2, v3}, LpO6;->q(LWM6;LVF2;Landroid/os/Handler;)V

    iget-object v0, p0, LUF2;->i:LvO6;

    iget-object v1, p0, LUF2;->g:LWM6;

    iget-object v2, p0, LUF2;->b:LVF2;

    iget-object v3, p0, LUF2;->d:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, LvO6;->q(LWM6;LVF2;Landroid/os/Handler;)V

    iget-object v0, p0, LUF2;->f:LMN6;

    if-nez v0, :cond_0

    new-instance v0, LMN6;

    invoke-direct {v0}, LMN6;-><init>()V

    iput-object v0, p0, LUF2;->f:LMN6;

    iget-object v1, p0, LUF2;->g:LWM6;

    iget-object v2, p0, LUF2;->a:LlN6;

    invoke-virtual {v0, p1, v1, v2}, LMN6;->r(LVF2;LWM6;LlN6;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, LUF2;->c:Lorg/json/JSONObject;

    :cond_0
    return-object p1
.end method

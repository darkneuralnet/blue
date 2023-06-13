.class public final LdO6;
.super LKN6;
.source "SourceFile"


# static fields
.field public static l:LdO6;


# instance fields
.field public c:Ljava/lang/String;

.field public d:Lorg/json/JSONObject;

.field public e:LlN6;

.field public f:Lorg/json/JSONArray;

.field public g:Landroid/os/Handler;

.field public h:LVF2;

.field public i:LAO6;

.field public j:LAO6;

.field public k:LAO6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LKN6;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LdO6;->c:Ljava/lang/String;

    return-void
.end method

.method public static synthetic q(LdO6;)LAO6;
    .locals 0

    iget-object p0, p0, LdO6;->i:LAO6;

    return-object p0
.end method

.method public static declared-synchronized u()LdO6;
    .locals 2

    const-class v0, LdO6;

    monitor-enter v0

    :try_start_0
    sget-object v1, LdO6;->l:LdO6;

    if-nez v1, :cond_0

    new-instance v1, LdO6;

    invoke-direct {v1}, LdO6;-><init>()V

    sput-object v1, LdO6;->l:LdO6;

    :cond_0
    sget-object v1, LdO6;->l:LdO6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static synthetic v(LdO6;)Lorg/json/JSONArray;
    .locals 0

    iget-object p0, p0, LdO6;->f:Lorg/json/JSONArray;

    return-object p0
.end method

.method public static synthetic w(LdO6;)LAO6;
    .locals 0

    iget-object p0, p0, LdO6;->j:LAO6;

    return-object p0
.end method

.method public static synthetic y(LdO6;)LAO6;
    .locals 0

    iget-object p0, p0, LdO6;->k:LAO6;

    return-object p0
.end method

.method public static synthetic z(LdO6;)V
    .locals 0

    invoke-virtual {p0}, LdO6;->x()V

    return-void
.end method


# virtual methods
.method public d()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r(LVF2;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 2

    iput-object p2, p0, LdO6;->c:Ljava/lang/String;

    iput-object p3, p0, LdO6;->d:Lorg/json/JSONObject;

    const/16 p2, 0x60

    invoke-virtual {p0, p2, p1}, LdO6;->s(ILVF2;)V

    const/16 p2, 0x61

    invoke-virtual {p0, p2, p1}, LdO6;->s(ILVF2;)V

    const/16 p2, 0x66

    invoke-virtual {p0, p2, p1}, LdO6;->s(ILVF2;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance p2, LdO6$a;

    invoke-direct {p2, p0, p3}, LdO6$a;-><init>(LdO6;Lorg/json/JSONObject;)V

    iget-object p3, p0, LdO6;->e:LlN6;

    invoke-virtual {p3}, LlN6;->q()I

    move-result p3

    int-to-long v0, p3

    sget-object p3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, p2, v0, v1, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public s(ILVF2;)V
    .locals 3

    :try_start_0
    invoke-virtual {p2}, LVF2;->b()Landroid/content/Context;

    move-result-object p2

    const/16 v0, 0x60

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/16 v0, 0x61

    if-eq p1, v0, :cond_1

    const/16 v0, 0x66

    if-eq p1, v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, LdO6;->e:LlN6;

    invoke-virtual {v0, p1}, LlN6;->j(I)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, LAO6;

    iget-object v0, p0, LdO6;->g:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-direct {p1, p2, v0, v2}, LAO6;-><init>(Landroid/content/Context;Landroid/os/Handler;I)V

    iput-object p1, p0, LdO6;->k:LAO6;

    iget-object p1, p0, LdO6;->d:Lorg/json/JSONObject;

    sget-object p2, LgM6;->e:LgM6;

    invoke-virtual {p2}, LgM6;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LdO6;->k:LAO6;

    :goto_0
    invoke-virtual {p1}, LAO6;->b()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LdO6;->e:LlN6;

    invoke-virtual {v0, p1}, LlN6;->j(I)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, LAO6;

    iget-object v0, p0, LdO6;->g:Landroid/os/Handler;

    const/4 v2, 0x4

    invoke-direct {p1, p2, v0, v2}, LAO6;-><init>(Landroid/content/Context;Landroid/os/Handler;I)V

    iput-object p1, p0, LdO6;->j:LAO6;

    iget-object p1, p0, LdO6;->d:Lorg/json/JSONObject;

    sget-object p2, LgM6;->d:LgM6;

    invoke-virtual {p2}, LgM6;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LdO6;->j:LAO6;

    goto :goto_0

    :cond_2
    iget-object v0, p0, LdO6;->e:LlN6;

    invoke-virtual {v0, p1}, LlN6;->j(I)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, LAO6;

    iget-object v0, p0, LdO6;->g:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-direct {p1, p2, v0, v2}, LAO6;-><init>(Landroid/content/Context;Landroid/os/Handler;I)V

    iput-object p1, p0, LdO6;->i:LAO6;

    iget-object p1, p0, LdO6;->d:Lorg/json/JSONObject;

    sget-object p2, LgM6;->c:LgM6;

    invoke-virtual {p2}, LgM6;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LdO6;->i:LAO6;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-class p2, LdO6;

    const/4 v0, 0x3

    invoke-static {p2, v0, p1}, LKJ6;->b(Ljava/lang/Class;ILjava/lang/Throwable;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public t(LlN6;Landroid/os/Handler;LVF2;)V
    .locals 0

    iput-object p2, p0, LdO6;->g:Landroid/os/Handler;

    iput-object p1, p0, LdO6;->e:LlN6;

    iput-object p3, p0, LdO6;->h:LVF2;

    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    iput-object p1, p0, LdO6;->f:Lorg/json/JSONArray;

    return-void
.end method

.method public final x()V
    .locals 7

    const-string v0, "s"

    :try_start_0
    invoke-static {v0}, LKN6;->l(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v1, p0, LdO6;->c:Ljava/lang/String;

    iget-object v2, p0, LdO6;->f:Lorg/json/JSONArray;

    invoke-static {v1, v2, v0}, LKN6;->p(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LdO6;->c:Ljava/lang/String;

    iget-object v2, p0, LdO6;->f:Lorg/json/JSONArray;

    invoke-static {v1, v2, v0}, LKN6;->e(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    move-object v3, v0

    if-eqz v3, :cond_1

    new-instance v0, LbL6;

    sget-object v2, LcM6;->f:LcM6;

    iget-object v5, p0, LdO6;->h:LVF2;

    iget-object v6, p0, LdO6;->g:Landroid/os/Handler;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LbL6;-><init>(LcM6;Lorg/json/JSONObject;ZLVF2;Landroid/os/Handler;)V

    invoke-virtual {v0}, LbL6;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-class v1, LdO6;

    const/4 v2, 0x3

    invoke-static {v1, v2, v0}, LKJ6;->b(Ljava/lang/Class;ILjava/lang/Throwable;)V

    :cond_1
    :goto_1
    return-void
.end method

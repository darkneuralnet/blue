.class public Lcom/facebook/share/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/internal/a$l;,
        Lcom/facebook/share/internal/a$y;,
        Lcom/facebook/share/internal/a$t;,
        Lcom/facebook/share/internal/a$k;,
        Lcom/facebook/share/internal/a$x;,
        Lcom/facebook/share/internal/a$n;,
        Lcom/facebook/share/internal/a$p;,
        Lcom/facebook/share/internal/a$r;,
        Lcom/facebook/share/internal/a$s;,
        Lcom/facebook/share/internal/a$v;,
        Lcom/facebook/share/internal/a$u;,
        Lcom/facebook/share/internal/a$q;,
        Lcom/facebook/share/internal/a$o;,
        Lcom/facebook/share/internal/a$w;,
        Lcom/facebook/share/internal/a$m;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final o:Ljava/lang/String; = "a"

.field public static p:Lpl1;

.field public static final q:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/facebook/share/internal/a;",
            ">;"
        }
    .end annotation
.end field

.field public static r:LCG6;

.field public static s:LCG6;

.field public static t:Landroid/os/Handler;

.field public static u:Ljava/lang/String;

.field public static v:Z

.field public static volatile w:I

.field public static x:LJ1;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/facebook/share/widget/LikeView$g;

.field public c:Z

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Landroid/os/Bundle;

.field public n:Ln62;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/facebook/share/internal/a;->q:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, LCG6;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LCG6;-><init>(I)V

    sput-object v0, Lcom/facebook/share/internal/a;->r:LCG6;

    new-instance v0, LCG6;

    invoke-direct {v0, v1}, LCG6;-><init>(I)V

    sput-object v0, Lcom/facebook/share/internal/a;->s:LCG6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/share/internal/a;->b:Lcom/facebook/share/widget/LikeView$g;

    return-void
.end method

.method public static synthetic A(Lcom/facebook/share/internal/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/internal/a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic B(Lcom/facebook/share/internal/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/internal/a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic C(Lcom/facebook/share/internal/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/internal/a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static D(Lcom/facebook/share/internal/a;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/facebook/share/internal/a;->E(Lcom/facebook/share/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static E(Lcom/facebook/share/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    if-eqz p0, :cond_1

    if-nez p2, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    move-object p2, p1

    :cond_0
    const-string p1, "com.facebook.sdk.LikeActionController.OBJECT_ID"

    invoke-virtual {p0}, Lcom/facebook/share/internal/a;->P()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_2
    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, LMu2;->b(Landroid/content/Context;)LMu2;

    move-result-object p0

    invoke-virtual {p0, v0}, LMu2;->d(Landroid/content/Intent;)Z

    return-void
.end method

.method public static G(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V
    .locals 1

    invoke-static {p0}, Lcom/facebook/share/internal/a;->N(Ljava/lang/String;)Lcom/facebook/share/internal/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1, p2}, Lcom/facebook/share/internal/a;->p0(Lcom/facebook/share/internal/a;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/facebook/share/internal/a;->H(Ljava/lang/String;)Lcom/facebook/share/internal/a;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/facebook/share/internal/a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/share/internal/a;-><init>(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    invoke-static {v0}, Lcom/facebook/share/internal/a;->h0(Lcom/facebook/share/internal/a;)V

    :cond_1
    invoke-static {p0, v0}, Lcom/facebook/share/internal/a;->c0(Ljava/lang/String;Lcom/facebook/share/internal/a;)V

    sget-object p0, Lcom/facebook/share/internal/a;->t:Landroid/os/Handler;

    new-instance p1, Lcom/facebook/share/internal/a$d;

    invoke-direct {p1, v0}, Lcom/facebook/share/internal/a$d;-><init>(Lcom/facebook/share/internal/a;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p0, 0x0

    invoke-static {p2, v0, p0}, Lcom/facebook/share/internal/a;->R(Lcom/facebook/share/internal/a$m;Lcom/facebook/share/internal/a;Lcom/facebook/FacebookException;)V

    return-void
.end method

.method public static H(Ljava/lang/String;)Lcom/facebook/share/internal/a;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lcom/facebook/share/internal/a;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lcom/facebook/share/internal/a;->p:Lpl1;

    invoke-virtual {v1, p0}, Lpl1;->g(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    :try_start_1
    invoke-static {p0}, Lyi6;->i0(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Lcom/facebook/share/internal/a;->I(Ljava/lang/String;)Lcom/facebook/share/internal/a;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    if-eqz p0, :cond_1

    :goto_1
    invoke-static {p0}, Lyi6;->g(Ljava/io/Closeable;)V

    goto :goto_3

    :catchall_0
    move-exception p0

    move-object v4, v0

    move-object v0, p0

    move-object p0, v4

    goto :goto_4

    :catch_1
    move-exception v1

    move-object p0, v0

    :goto_2
    :try_start_2
    sget-object v2, Lcom/facebook/share/internal/a;->o:Ljava/lang/String;

    const-string v3, "Unable to deserialize controller from disk"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    :goto_3
    return-object v0

    :catchall_1
    move-exception v0

    :goto_4
    if-eqz p0, :cond_2

    invoke-static {p0}, Lyi6;->g(Ljava/io/Closeable;)V

    :cond_2
    throw v0
.end method

.method public static I(Ljava/lang/String;)Lcom/facebook/share/internal/a;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "com.facebook.share.internal.LikeActionController.version"

    const/4 v2, -0x1

    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    const/4 v2, 0x3

    if-eq p0, v2, :cond_0

    return-object v0

    :cond_0
    const-string p0, "object_id"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v2, "object_type"

    sget-object v3, Lcom/facebook/share/widget/LikeView$g;->d:Lcom/facebook/share/widget/LikeView$g;

    invoke-virtual {v3}, Lcom/facebook/share/widget/LikeView$g;->b()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    new-instance v3, Lcom/facebook/share/internal/a;

    invoke-static {v2}, Lcom/facebook/share/widget/LikeView$g;->a(I)Lcom/facebook/share/widget/LikeView$g;

    move-result-object v2

    invoke-direct {v3, p0, v2}, Lcom/facebook/share/internal/a;-><init>(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    const-string p0, "like_count_string_with_like"

    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v3, Lcom/facebook/share/internal/a;->d:Ljava/lang/String;

    const-string p0, "like_count_string_without_like"

    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v3, Lcom/facebook/share/internal/a;->e:Ljava/lang/String;

    const-string p0, "social_sentence_with_like"

    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v3, Lcom/facebook/share/internal/a;->f:Ljava/lang/String;

    const-string p0, "social_sentence_without_like"

    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v3, Lcom/facebook/share/internal/a;->g:Ljava/lang/String;

    const-string p0, "is_object_liked"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p0

    iput-boolean p0, v3, Lcom/facebook/share/internal/a;->c:Z

    const-string p0, "unlike_token"

    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v3, Lcom/facebook/share/internal/a;->h:Ljava/lang/String;

    const-string p0, "facebook_dialog_analytics_bundle"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lc70;->a(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object p0

    iput-object p0, v3, Lcom/facebook/share/internal/a;->m:Landroid/os/Bundle;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    move-object v0, v3

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object v1, Lcom/facebook/share/internal/a;->o:Ljava/lang/String;

    const-string v2, "Unable to deserialize controller from JSON"

    invoke-static {v1, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-object v0
.end method

.method public static L(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lcom/facebook/AccessToken;->c()Lcom/facebook/AccessToken;

    move-result-object v0

    invoke-static {}, Lcom/facebook/AccessToken;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->m()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lyi6;->c0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const-string p0, ""

    invoke-static {v0, p0}, Lyi6;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    aput-object p0, v2, v0

    sget p0, Lcom/facebook/share/internal/a;->w:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x2

    aput-object p0, v2, v0

    const-string p0, "%s|%s|com.fb.sdk.like|%d"

    invoke-static {v1, p0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static M(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-boolean v0, Lcom/facebook/share/internal/a;->v:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/share/internal/a;->V()V

    :cond_0
    invoke-static {p0}, Lcom/facebook/share/internal/a;->N(Ljava/lang/String;)Lcom/facebook/share/internal/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1, p2}, Lcom/facebook/share/internal/a;->p0(Lcom/facebook/share/internal/a;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/facebook/share/internal/a;->s:LCG6;

    new-instance v1, Lcom/facebook/share/internal/a$l;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/share/internal/a$l;-><init>(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V

    invoke-virtual {v0, v1}, LCG6;->e(Ljava/lang/Runnable;)LCG6$b;

    :goto_0
    return-void
.end method

.method public static N(Ljava/lang/String;)Lcom/facebook/share/internal/a;
    .locals 4

    invoke-static {p0}, Lcom/facebook/share/internal/a;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lcom/facebook/share/internal/a;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/internal/a;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/facebook/share/internal/a;->r:LCG6;

    new-instance v2, Lcom/facebook/share/internal/a$t;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/facebook/share/internal/a$t;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v1, v2}, LCG6;->e(Ljava/lang/Runnable;)LCG6$b;

    :cond_0
    return-object v0
.end method

.method public static R(Lcom/facebook/share/internal/a$m;Lcom/facebook/share/internal/a;Lcom/facebook/FacebookException;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/facebook/share/internal/a;->t:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/share/internal/a$f;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/share/internal/a$f;-><init>(Lcom/facebook/share/internal/a$m;Lcom/facebook/share/internal/a;Lcom/facebook/FacebookException;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static declared-synchronized V()V
    .locals 5

    const-class v0, Lcom/facebook/share/internal/a;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/facebook/share/internal/a;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lcom/facebook/share/internal/a;->t:Landroid/os/Handler;

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "OBJECT_SUFFIX"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lcom/facebook/share/internal/a;->w:I

    new-instance v1, Lpl1;

    sget-object v2, Lcom/facebook/share/internal/a;->o:Ljava/lang/String;

    new-instance v4, Lpl1$e;

    invoke-direct {v4}, Lpl1$e;-><init>()V

    invoke-direct {v1, v2, v4}, Lpl1;-><init>(Ljava/lang/String;Lpl1$e;)V

    sput-object v1, Lcom/facebook/share/internal/a;->p:Lpl1;

    invoke-static {}, Lcom/facebook/share/internal/a;->f0()V

    sget-object v1, LM80$c;->f:LM80$c;

    invoke-virtual {v1}, LM80$c;->a()I

    move-result v1

    new-instance v2, Lcom/facebook/share/internal/a$e;

    invoke-direct {v2}, Lcom/facebook/share/internal/a$e;-><init>()V

    invoke-static {v1, v2}, LM80;->b(ILM80$a;)V

    sput-boolean v3, Lcom/facebook/share/internal/a;->v:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/share/internal/a;->o:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic b(Lcom/facebook/share/internal/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/internal/a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Lcom/facebook/share/internal/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/internal/a;->h:Ljava/lang/String;

    return-object p0
.end method

.method public static c0(Ljava/lang/String;Lcom/facebook/share/internal/a;)V
    .locals 3

    invoke-static {p0}, Lcom/facebook/share/internal/a;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lcom/facebook/share/internal/a;->r:LCG6;

    new-instance v1, Lcom/facebook/share/internal/a$t;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/internal/a$t;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, LCG6;->e(Ljava/lang/Runnable;)LCG6$b;

    sget-object v0, Lcom/facebook/share/internal/a;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic d(Lcom/facebook/share/internal/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/internal/a;->h:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic e(Lcom/facebook/share/internal/a;)Ln62;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/share/internal/a;->K()Ln62;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/facebook/share/internal/a;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lcom/facebook/share/internal/a;->o0(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static f0()V
    .locals 1

    new-instance v0, Lcom/facebook/share/internal/a$g;

    invoke-direct {v0}, Lcom/facebook/share/internal/a$g;-><init>()V

    sput-object v0, Lcom/facebook/share/internal/a;->x:LJ1;

    return-void
.end method

.method public static synthetic g(Lcom/facebook/share/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/facebook/share/internal/a;->E(Lcom/facebook/share/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic h(Lcom/facebook/share/internal/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/internal/a;->i:Ljava/lang/String;

    return-object p0
.end method

.method public static h0(Lcom/facebook/share/internal/a;)V
    .locals 3

    invoke-static {p0}, Lcom/facebook/share/internal/a;->j0(Lcom/facebook/share/internal/a;)Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    invoke-static {p0}, Lcom/facebook/share/internal/a;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p0}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/facebook/share/internal/a;->s:LCG6;

    new-instance v2, Lcom/facebook/share/internal/a$y;

    invoke-direct {v2, p0, v0}, Lcom/facebook/share/internal/a$y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LCG6;->e(Ljava/lang/Runnable;)LCG6$b;

    :cond_0
    return-void
.end method

.method public static synthetic i(Lcom/facebook/share/internal/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/internal/a;->i:Ljava/lang/String;

    return-object p1
.end method

.method public static i0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/facebook/share/internal/a;->p:Lpl1;

    invoke-virtual {v1, p0}, Lpl1;->k(Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {v0}, Lyi6;->g(Ljava/io/Closeable;)V

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_0
    move-exception p0

    :try_start_1
    sget-object p1, Lcom/facebook/share/internal/a;->o:Ljava/lang/String;

    const-string v1, "Unable to serialize controller to disk"

    invoke-static {p1, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    :goto_1
    return-void

    :goto_2
    if-eqz v0, :cond_1

    invoke-static {v0}, Lyi6;->g(Ljava/io/Closeable;)V

    :cond_1
    throw p0
.end method

.method public static synthetic j(Lcom/facebook/share/internal/a;)Lcom/facebook/share/widget/LikeView$g;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/internal/a;->b:Lcom/facebook/share/widget/LikeView$g;

    return-object p0
.end method

.method public static j0(Lcom/facebook/share/internal/a;)Ljava/lang/String;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "com.facebook.share.internal.LikeActionController.version"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "object_id"

    iget-object v2, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "object_type"

    iget-object v2, p0, Lcom/facebook/share/internal/a;->b:Lcom/facebook/share/widget/LikeView$g;

    invoke-virtual {v2}, Lcom/facebook/share/widget/LikeView$g;->b()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "like_count_string_with_like"

    iget-object v2, p0, Lcom/facebook/share/internal/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "like_count_string_without_like"

    iget-object v2, p0, Lcom/facebook/share/internal/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "social_sentence_with_like"

    iget-object v2, p0, Lcom/facebook/share/internal/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "social_sentence_without_like"

    iget-object v2, p0, Lcom/facebook/share/internal/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "is_object_liked"

    iget-boolean v2, p0, Lcom/facebook/share/internal/a;->c:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "unlike_token"

    iget-object v2, p0, Lcom/facebook/share/internal/a;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p0, p0, Lcom/facebook/share/internal/a;->m:Landroid/os/Bundle;

    if-eqz p0, :cond_0

    invoke-static {p0}, Lc70;->b(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "facebook_dialog_analytics_bundle"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    sget-object v0, Lcom/facebook/share/internal/a;->o:Ljava/lang/String;

    const-string v1, "Unable to serialize controller to JSON"

    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic k(Lcom/facebook/share/internal/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/share/internal/a;->l:Z

    return p1
.end method

.method public static synthetic l(Lcom/facebook/share/internal/a;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/a;->Y(Z)V

    return-void
.end method

.method public static l0(Ljava/lang/String;)V
    .locals 2

    sput-object p0, Lcom/facebook/share/internal/a;->u:Ljava/lang/String;

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object p0

    const-string v0, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "PENDING_CONTROLLER_KEY"

    sget-object v1, Lcom/facebook/share/internal/a;->u:Ljava/lang/String;

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static synthetic m(Lcom/facebook/share/internal/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/share/internal/a;->d0()V

    return-void
.end method

.method public static synthetic n(Lcom/facebook/share/internal/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/share/internal/a;->k:Z

    return p1
.end method

.method public static synthetic o(Lcom/facebook/share/internal/a;Landroid/os/Bundle;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/a;->X(Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic p(Lcom/facebook/share/internal/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static p0(Lcom/facebook/share/internal/a;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V
    .locals 5

    iget-object v0, p0, Lcom/facebook/share/internal/a;->b:Lcom/facebook/share/widget/LikeView$g;

    invoke-static {p1, v0}, LNy5;->g(Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/widget/LikeView$g;)Lcom/facebook/share/widget/LikeView$g;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/FacebookException;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    aput-object v4, v2, v3

    iget-object p0, p0, Lcom/facebook/share/internal/a;->b:Lcom/facebook/share/widget/LikeView$g;

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView$g;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v3, 0x1

    aput-object p0, v2, v3

    const/4 p0, 0x2

    invoke-virtual {p1}, Lcom/facebook/share/widget/LikeView$g;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, p0

    const-string p0, "Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\""

    invoke-direct {v0, p0, v2}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object p0, v1

    move-object v1, v0

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/facebook/share/internal/a;->b:Lcom/facebook/share/widget/LikeView$g;

    :goto_0
    invoke-static {p2, p0, v1}, Lcom/facebook/share/internal/a;->R(Lcom/facebook/share/internal/a$m;Lcom/facebook/share/internal/a;Lcom/facebook/FacebookException;)V

    return-void
.end method

.method public static synthetic q(Lcom/facebook/share/internal/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/share/internal/a;->j:Z

    return p1
.end method

.method public static synthetic r(Lcom/facebook/share/internal/a;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/facebook/share/internal/a;->U(Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V

    return-void
.end method

.method public static synthetic s(Lcom/facebook/share/internal/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/share/internal/a;->c:Z

    return p0
.end method

.method public static synthetic t(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/internal/a;->i0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic u(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/facebook/share/internal/a;->G(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V

    return-void
.end method

.method public static synthetic v()I
    .locals 1

    sget v0, Lcom/facebook/share/internal/a;->w:I

    return v0
.end method

.method public static synthetic w(I)I
    .locals 0

    sput p0, Lcom/facebook/share/internal/a;->w:I

    return p0
.end method

.method public static synthetic x()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    sget-object v0, Lcom/facebook/share/internal/a;->q:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public static synthetic y()Lpl1;
    .locals 1

    sget-object v0, Lcom/facebook/share/internal/a;->p:Lpl1;

    return-object v0
.end method

.method public static synthetic z(Lcom/facebook/share/internal/a;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/internal/a;->D(Lcom/facebook/share/internal/a;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final F()Z
    .locals 2

    invoke-static {}, Lcom/facebook/AccessToken;->c()Lcom/facebook/AccessToken;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/share/internal/a;->j:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/share/internal/a;->i:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/facebook/AccessToken;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->k()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->k()Ljava/util/Set;

    move-result-object v0

    const-string v1, "publish_actions"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final J(Lcom/facebook/share/internal/a$w;)V
    .locals 4

    iget-object v0, p0, Lcom/facebook/share/internal/a;->i:Ljava/lang/String;

    invoke-static {v0}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/facebook/share/internal/a$w;->onComplete()V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/facebook/share/internal/a$o;

    iget-object v1, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/share/internal/a;->b:Lcom/facebook/share/widget/LikeView$g;

    invoke-direct {v0, p0, v1, v2}, Lcom/facebook/share/internal/a$o;-><init>(Lcom/facebook/share/internal/a;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    new-instance v1, Lcom/facebook/share/internal/a$q;

    iget-object v2, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/share/internal/a;->b:Lcom/facebook/share/widget/LikeView$g;

    invoke-direct {v1, p0, v2, v3}, Lcom/facebook/share/internal/a$q;-><init>(Lcom/facebook/share/internal/a;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    new-instance v2, LVD1;

    invoke-direct {v2}, LVD1;-><init>()V

    invoke-virtual {v0, v2}, Lcom/facebook/share/internal/a$k;->c(LVD1;)V

    invoke-virtual {v1, v2}, Lcom/facebook/share/internal/a$k;->c(LVD1;)V

    new-instance v3, Lcom/facebook/share/internal/a$b;

    invoke-direct {v3, p0, v0, v1, p1}, Lcom/facebook/share/internal/a$b;-><init>(Lcom/facebook/share/internal/a;Lcom/facebook/share/internal/a$o;Lcom/facebook/share/internal/a$q;Lcom/facebook/share/internal/a$w;)V

    invoke-virtual {v2, v3}, LVD1;->c(LVD1$a;)V

    invoke-virtual {v2}, LVD1;->j()LUD1;

    return-void
.end method

.method public final K()Ln62;
    .locals 2

    iget-object v0, p0, Lcom/facebook/share/internal/a;->n:Ln62;

    if-nez v0, :cond_0

    new-instance v0, Ln62;

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ln62;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/share/internal/a;->n:Ln62;

    :cond_0
    iget-object v0, p0, Lcom/facebook/share/internal/a;->n:Ln62;

    return-object v0
.end method

.method public O()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lcom/facebook/share/internal/a;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/share/internal/a;->d:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/share/internal/a;->e:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public P()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public Q()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lcom/facebook/share/internal/a;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/share/internal/a;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/share/internal/a;->g:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public S()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lcom/facebook/share/internal/a;->c:Z

    return v0
.end method

.method public final T(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    const-string p2, "object_id"

    iget-object v1, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    invoke-virtual {v0, p2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/facebook/share/internal/a;->b:Lcom/facebook/share/widget/LikeView$g;

    invoke-virtual {p2}, Lcom/facebook/share/widget/LikeView$g;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "object_type"

    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "current_action"

    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/share/internal/a;->K()Ln62;

    move-result-object p1

    const-string p2, "fb_like_control_error"

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1, v0}, Ln62;->i(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    return-void
.end method

.method public final U(Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/facebook/FacebookRequestError;->g()Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v1, "error"

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, v0}, Lcom/facebook/share/internal/a;->T(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final W(Landroid/app/Activity;LIy1;Landroid/os/Bundle;)V
    .locals 4

    invoke-static {}, LXq2;->n()Z

    move-result v0

    const-string v1, "fb_like_control_did_present_dialog"

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-static {}, LXq2;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "fb_like_control_did_present_fallback_dialog"

    goto :goto_0

    :cond_1
    const-string v0, "present_dialog"

    invoke-virtual {p0, v0, p3}, Lcom/facebook/share/internal/a;->T(Ljava/lang/String;Landroid/os/Bundle;)V

    sget-object v0, Lcom/facebook/share/internal/a;->o:Ljava/lang/String;

    const-string v2, "Cannot show the Like Dialog on this device."

    invoke-static {v0, v2}, Lyi6;->Y(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.facebook.sdk.LikeActionController.UPDATED"

    const/4 v2, 0x0

    invoke-static {v2, v0}, Lcom/facebook/share/internal/a;->D(Lcom/facebook/share/internal/a;Ljava/lang/String;)V

    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/share/internal/a;->b:Lcom/facebook/share/widget/LikeView$g;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/share/widget/LikeView$g;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/facebook/share/widget/LikeView$g;->d:Lcom/facebook/share/widget/LikeView$g;

    invoke-virtual {v0}, Lcom/facebook/share/widget/LikeView$g;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    new-instance v2, Lcom/facebook/share/internal/LikeContent$b;

    invoke-direct {v2}, Lcom/facebook/share/internal/LikeContent$b;-><init>()V

    iget-object v3, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/facebook/share/internal/LikeContent$b;->d(Ljava/lang/String;)Lcom/facebook/share/internal/LikeContent$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/share/internal/LikeContent$b;->e(Ljava/lang/String;)Lcom/facebook/share/internal/LikeContent$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/share/internal/LikeContent$b;->c()Lcom/facebook/share/internal/LikeContent;

    move-result-object v0

    if-eqz p2, :cond_3

    new-instance p1, LXq2;

    invoke-direct {p1, p2}, LXq2;-><init>(LIy1;)V

    invoke-virtual {p1, v0}, LXq2;->r(Lcom/facebook/share/internal/LikeContent;)V

    goto :goto_2

    :cond_3
    new-instance p2, LXq2;

    invoke-direct {p2, p1}, LXq2;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p2, v0}, LXq2;->r(Lcom/facebook/share/internal/LikeContent;)V

    :goto_2
    invoke-virtual {p0, p3}, Lcom/facebook/share/internal/a;->g0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/facebook/share/internal/a;->K()Ln62;

    move-result-object p1

    invoke-virtual {p1, v1, p3}, Ln62;->h(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_4
    return-void
.end method

.method public final X(Landroid/os/Bundle;)V
    .locals 2

    iget-boolean v0, p0, Lcom/facebook/share/internal/a;->c:Z

    iget-boolean v1, p0, Lcom/facebook/share/internal/a;->k:Z

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0, p1}, Lcom/facebook/share/internal/a;->a0(ZLandroid/os/Bundle;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/facebook/share/internal/a;->c:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/a;->Y(Z)V

    :cond_0
    return-void
.end method

.method public final Y(Z)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/a;->n0(Z)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "com.facebook.platform.status.ERROR_DESCRIPTION"

    const-string v1, "Unable to publish the like/unlike action"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.facebook.sdk.LikeActionController.DID_ERROR"

    invoke-static {p0, v0, p1}, Lcom/facebook/share/internal/a;->E(Lcom/facebook/share/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final Z(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/share/internal/a;->l:Z

    new-instance v0, Lcom/facebook/share/internal/a$h;

    invoke-direct {v0, p0, p1}, Lcom/facebook/share/internal/a$h;-><init>(Lcom/facebook/share/internal/a;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/facebook/share/internal/a;->J(Lcom/facebook/share/internal/a$w;)V

    return-void
.end method

.method public final a0(ZLandroid/os/Bundle;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/share/internal/a;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Lcom/facebook/share/internal/a;->Z(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/facebook/share/internal/a;->h:Ljava/lang/String;

    invoke-static {p1}, Lyi6;->R(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0, p2}, Lcom/facebook/share/internal/a;->b0(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b0(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/share/internal/a;->l:Z

    new-instance v0, LVD1;

    invoke-direct {v0}, LVD1;-><init>()V

    new-instance v1, Lcom/facebook/share/internal/a$v;

    iget-object v2, p0, Lcom/facebook/share/internal/a;->h:Ljava/lang/String;

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/internal/a$v;-><init>(Lcom/facebook/share/internal/a;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/facebook/share/internal/a$k;->c(LVD1;)V

    new-instance v2, Lcom/facebook/share/internal/a$i;

    invoke-direct {v2, p0, v1, p1}, Lcom/facebook/share/internal/a$i;-><init>(Lcom/facebook/share/internal/a;Lcom/facebook/share/internal/a$v;Landroid/os/Bundle;)V

    invoke-virtual {v0, v2}, LVD1;->c(LVD1$a;)V

    invoke-virtual {v0}, LVD1;->j()LUD1;

    return-void
.end method

.method public final d0()V
    .locals 1

    invoke-static {}, Lcom/facebook/AccessToken;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/internal/a;->e0()V

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/share/internal/a$j;

    invoke-direct {v0, p0}, Lcom/facebook/share/internal/a$j;-><init>(Lcom/facebook/share/internal/a;)V

    invoke-virtual {p0, v0}, Lcom/facebook/share/internal/a;->J(Lcom/facebook/share/internal/a$w;)V

    return-void
.end method

.method public final e0()V
    .locals 4

    new-instance v0, LZq2;

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/facebook/a;->f()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, LZq2;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, LcW3;->g()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/facebook/share/internal/a$a;

    invoke-direct {v1, p0}, Lcom/facebook/share/internal/a$a;-><init>(Lcom/facebook/share/internal/a;)V

    invoke-virtual {v0, v1}, LcW3;->f(LcW3$b;)V

    return-void
.end method

.method public final g0(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/internal/a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/share/internal/a;->l0(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/share/internal/a;->m:Landroid/os/Bundle;

    invoke-static {p0}, Lcom/facebook/share/internal/a;->h0(Lcom/facebook/share/internal/a;)V

    return-void
.end method

.method public k0()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public m0(Landroid/app/Activity;LIy1;Landroid/os/Bundle;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lcom/facebook/share/internal/a;->c:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lcom/facebook/share/internal/a;->F()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/facebook/share/internal/a;->n0(Z)V

    iget-boolean v1, p0, Lcom/facebook/share/internal/a;->l:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/internal/a;->K()Ln62;

    move-result-object p1

    const-string p2, "fb_like_control_did_undo_quickly"

    invoke-virtual {p1, p2, p3}, Ln62;->h(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, p3}, Lcom/facebook/share/internal/a;->a0(ZLandroid/os/Bundle;)Z

    move-result v1

    if-nez v1, :cond_2

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/share/internal/a;->n0(Z)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/share/internal/a;->W(Landroid/app/Activity;LIy1;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/share/internal/a;->W(Landroid/app/Activity;LIy1;Landroid/os/Bundle;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final n0(Z)V
    .locals 7

    iget-object v2, p0, Lcom/facebook/share/internal/a;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/share/internal/a;->e:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/share/internal/a;->f:Ljava/lang/String;

    iget-object v5, p0, Lcom/facebook/share/internal/a;->g:Ljava/lang/String;

    iget-object v6, p0, Lcom/facebook/share/internal/a;->h:Ljava/lang/String;

    move-object v0, p0

    move v1, p1

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/share/internal/a;->o0(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final o0(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lyi6;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, v0}, Lyi6;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p4, v0}, Lyi6;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p5, v0}, Lyi6;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-static {p6, v0}, Lyi6;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p6

    iget-boolean v0, p0, Lcom/facebook/share/internal/a;->c:Z

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/facebook/share/internal/a;->d:Ljava/lang/String;

    invoke-static {p2, v0}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/share/internal/a;->e:Ljava/lang/String;

    invoke-static {p3, v0}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/share/internal/a;->f:Ljava/lang/String;

    invoke-static {p4, v0}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/share/internal/a;->g:Ljava/lang/String;

    invoke-static {p5, v0}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/share/internal/a;->h:Ljava/lang/String;

    invoke-static {p6, v0}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    return-void

    :cond_2
    iput-boolean p1, p0, Lcom/facebook/share/internal/a;->c:Z

    iput-object p2, p0, Lcom/facebook/share/internal/a;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/share/internal/a;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/share/internal/a;->f:Ljava/lang/String;

    iput-object p5, p0, Lcom/facebook/share/internal/a;->g:Ljava/lang/String;

    iput-object p6, p0, Lcom/facebook/share/internal/a;->h:Ljava/lang/String;

    invoke-static {p0}, Lcom/facebook/share/internal/a;->h0(Lcom/facebook/share/internal/a;)V

    const-string p1, "com.facebook.sdk.LikeActionController.UPDATED"

    invoke-static {p0, p1}, Lcom/facebook/share/internal/a;->D(Lcom/facebook/share/internal/a;Ljava/lang/String;)V

    return-void
.end method

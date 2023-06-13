.class public final Lyi9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQj9;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Date;

.field public final c:LYb9;

.field public d:Lvy7;

.field public e:LVg9;

.field public final synthetic f:LGi9;


# direct methods
.method public constructor <init>(LGi9;Ljava/lang/String;Ljava/util/Date;LYb9;)V
    .locals 0

    iput-object p1, p0, Lyi9;->f:LGi9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lyi9;->a:Ljava/lang/String;

    iput-object p3, p0, Lyi9;->b:Ljava/util/Date;

    iput-object p4, p0, Lyi9;->c:LYb9;

    return-void
.end method


# virtual methods
.method public final a()Lvy7;
    .locals 1

    iget-object v0, p0, Lyi9;->d:Lvy7;

    return-object v0
.end method

.method public final b()LVg9;
    .locals 1

    iget-object v0, p0, Lyi9;->e:LVg9;

    return-object v0
.end method

.method public final zza()Z
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LVi9;
        }
    .end annotation

    const-string v0, "MLKit RemoteConfigRestC"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lyi9;->f:LGi9;

    invoke-static {v2}, LGi9;->e(LGi9;)Ldh9;

    move-result-object v2

    const-string v3, "Creating HTTP connection to remote config service"

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v2}, Ldh9;->b()Ljava/net/HttpURLConnection;

    move-result-object v5
    :try_end_0
    .catch LVi9; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v2, p0, Lyi9;->f:LGi9;

    invoke-static {v2}, LGi9;->e(LGi9;)Ldh9;

    move-result-object v4

    invoke-static {v2}, LGi9;->d(LGi9;)LKb9;

    move-result-object v2

    invoke-virtual {v2}, LKb9;->a()Lcb9;

    move-result-object v2

    invoke-virtual {v2}, Lcb9;->a()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lyi9;->a:Ljava/lang/String;

    invoke-static {}, Lvy7;->c()Lvy7;

    move-result-object v8

    invoke-static {}, Lvy7;->c()Lvy7;

    move-result-object v10

    iget-object v11, p0, Lyi9;->b:Ljava/util/Date;

    iget-object v2, p0, Lyi9;->f:LGi9;

    invoke-static {v2}, LGi9;->g(LGi9;)Ljava/lang/String;

    move-result-object v13

    iget-object v14, p0, Lyi9;->c:LYb9;

    const/4 v9, 0x0

    const-string v12, "o:a:mlkit:1.0.0"

    invoke-virtual/range {v4 .. v14}, Ldh9;->a(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;LYb9;)Llh9;

    move-result-object v2

    const-string v3, "Got FetchResponse"

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v2}, Llh9;->a()LVg9;

    move-result-object v2

    iput-object v2, p0, Lyi9;->e:LVg9;

    invoke-virtual {v2}, LVg9;->d()Lorg/json/JSONObject;

    move-result-object v2

    :try_start_1
    invoke-static {v2}, LGi9;->c(Lorg/json/JSONObject;)Lvy7;

    move-result-object v3

    iput-object v3, p0, Lyi9;->d:Lvy7;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v3

    iget-object v4, p0, Lyi9;->c:LYb9;

    sget-object v5, Lc79;->g:Lc79;

    invoke-virtual {v4, v5}, LYb9;->b(Lc79;)V

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "Fetched remote config setting has invalid format: "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v1

    :catch_1
    move-exception v2

    const-string v3, "Creating HTTP connection to remote config service failed"

    invoke-static {v0, v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lyi9;->c:LYb9;

    sget-object v2, Lc79;->d:Lc79;

    invoke-virtual {v0, v2}, LYb9;->b(Lc79;)V

    return v1
.end method

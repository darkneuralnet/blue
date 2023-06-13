.class public final LNg9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lorg/json/JSONObject;

.field public b:Ljava/util/Date;

.field public c:Lorg/json/JSONArray;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, LNg9;->a:Lorg/json/JSONObject;

    invoke-static {}, LVg9;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, LNg9;->b:Ljava/util/Date;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, LNg9;->c:Lorg/json/JSONArray;

    return-void
.end method

.method public synthetic constructor <init>(LFg9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, LNg9;->a:Lorg/json/JSONObject;

    invoke-static {}, LVg9;->b()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, LNg9;->b:Ljava/util/Date;

    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    iput-object p1, p0, LNg9;->c:Lorg/json/JSONArray;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)LNg9;
    .locals 1

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LNg9;->a:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method public final b(Lorg/json/JSONArray;)LNg9;
    .locals 1

    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LNg9;->c:Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method public final c(Ljava/util/Date;)LNg9;
    .locals 0

    iput-object p1, p0, LNg9;->b:Ljava/util/Date;

    return-object p0
.end method

.method public final d()LVg9;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, LVg9;

    iget-object v1, p0, LNg9;->a:Lorg/json/JSONObject;

    iget-object v2, p0, LNg9;->b:Ljava/util/Date;

    iget-object v3, p0, LNg9;->c:Lorg/json/JSONArray;

    invoke-direct {v0, v1, v2, v3}, LVg9;-><init>(Lorg/json/JSONObject;Ljava/util/Date;Lorg/json/JSONArray;)V

    return-object v0
.end method

.class public LdO6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LdO6;->r(LVF2;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lorg/json/JSONObject;

.field public final synthetic c:LdO6;


# direct methods
.method public constructor <init>(LdO6;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, LdO6$a;->c:LdO6;

    iput-object p2, p0, LdO6$a;->b:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LdO6$a;->c:LdO6;

    invoke-static {v0}, LdO6;->q(LdO6;)LAO6;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LdO6$a;->b:Lorg/json/JSONObject;

    sget-object v2, LgM6;->c:LgM6;

    invoke-virtual {v2}, LgM6;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LdO6$a;->c:LdO6;

    invoke-static {v0}, LdO6;->v(LdO6;)Lorg/json/JSONArray;

    move-result-object v0

    iget-object v2, p0, LdO6$a;->c:LdO6;

    invoke-static {v2}, LdO6;->q(LdO6;)LAO6;

    move-result-object v2

    invoke-virtual {v2}, LAO6;->d()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_0
    iget-object v0, p0, LdO6$a;->c:LdO6;

    invoke-static {v0}, LdO6;->w(LdO6;)LAO6;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LdO6$a;->b:Lorg/json/JSONObject;

    sget-object v2, LgM6;->d:LgM6;

    invoke-virtual {v2}, LgM6;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LdO6$a;->c:LdO6;

    invoke-static {v0}, LdO6;->v(LdO6;)Lorg/json/JSONArray;

    move-result-object v0

    iget-object v2, p0, LdO6$a;->c:LdO6;

    invoke-static {v2}, LdO6;->w(LdO6;)LAO6;

    move-result-object v2

    invoke-virtual {v2}, LAO6;->d()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_1
    iget-object v0, p0, LdO6$a;->c:LdO6;

    invoke-static {v0}, LdO6;->y(LdO6;)LAO6;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LdO6$a;->b:Lorg/json/JSONObject;

    sget-object v2, LgM6;->e:LgM6;

    invoke-virtual {v2}, LgM6;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LdO6$a;->c:LdO6;

    invoke-static {v0}, LdO6;->v(LdO6;)Lorg/json/JSONArray;

    move-result-object v0

    iget-object v1, p0, LdO6$a;->c:LdO6;

    invoke-static {v1}, LdO6;->y(LdO6;)LAO6;

    move-result-object v1

    invoke-virtual {v1}, LAO6;->d()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_2
    iget-object v0, p0, LdO6$a;->c:LdO6;

    invoke-static {v0}, LdO6;->z(LdO6;)V

    return-void
.end method

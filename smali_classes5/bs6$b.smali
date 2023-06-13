.class public Lbs6$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbs6;->d(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lorg/json/JSONObject;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lbs6;


# direct methods
.method public constructor <init>(Lbs6;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lbs6$b;->e:Lbs6;

    iput-object p2, p0, Lbs6$b;->b:Lorg/json/JSONObject;

    iput-object p3, p0, Lbs6$b;->c:Ljava/lang/String;

    iput-object p4, p0, Lbs6$b;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lyi6;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lbs6$b;->b:Lorg/json/JSONObject;

    invoke-static {v1, v0}, LBk1;->a(Lorg/json/JSONObject;Ljava/lang/String;)[F

    move-result-object v1

    iget-object v2, p0, Lbs6$b;->c:Ljava/lang/String;

    iget-object v3, p0, Lbs6$b;->e:Lbs6;

    invoke-static {v3}, Lbs6;->b(Lbs6;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, LBk1;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v1, :cond_1

    return-void

    :cond_1
    sget-object v2, LaV2$a;->c:LaV2$a;

    const/4 v3, 0x1

    new-array v4, v3, [[F

    const/4 v5, 0x0

    aput-object v1, v4, v5

    new-array v3, v3, [Ljava/lang/String;

    aput-object v0, v3, v5

    invoke-static {v2, v4, v3}, LaV2;->o(LaV2$a;[[F[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    aget-object v0, v0, v5

    iget-object v2, p0, Lbs6$b;->d:Ljava/lang/String;

    invoke-static {v2, v0}, LNZ3;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "other"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lbs6$b;->c:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lbs6;->a(Ljava/lang/String;Ljava/lang/String;[F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    :catch_0
    :cond_3
    :goto_0
    return-void
.end method

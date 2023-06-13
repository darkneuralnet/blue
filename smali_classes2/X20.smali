.class public LX20;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LX20;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LX20;

    invoke-direct {v0}, LX20;-><init>()V

    sput-object v0, LX20;->a:LX20;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LX20;
    .locals 1

    sget-object v0, LX20;->a:LX20;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    const-string v0, "browserSwitch.request"

    invoke-static {v0, p1}, LLR3;->c(Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method

.method public b(Landroid/content/Context;)LY20;
    .locals 2

    const-string v0, "browserSwitch.request"

    invoke-static {v0, p1}, LLR3;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1}, LY20;->a(Ljava/lang/String;)LY20;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BrowserSwitch"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public d(LY20;Landroid/content/Context;)V
    .locals 1

    :try_start_0
    const-string v0, "browserSwitch.request"

    invoke-virtual {p1}, LY20;->h()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, LLR3;->b(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string v0, "BrowserSwitch"

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

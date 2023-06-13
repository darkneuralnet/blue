.class public LpL3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LXA0;

.field public static b:Lov0;

.field public static c:LSx1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LmL3;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;)LXA0;
    .locals 1

    sget-object v0, LpL3;->a:LXA0;

    if-nez v0, :cond_0

    new-instance v0, LXA0;

    invoke-direct {v0, p0}, LXA0;-><init>(Landroid/content/Context;)V

    sput-object v0, LpL3;->a:LXA0;

    :cond_0
    sget-object p0, LpL3;->a:LXA0;

    return-object p0
.end method

.method public static c(Landroid/content/Context;)LSx1;
    .locals 0

    invoke-static {p0}, LpL3;->e(Landroid/content/Context;)V

    sget-object p0, LpL3;->c:LSx1;

    return-object p0
.end method

.method public static d(Landroid/content/Context;Lcom/paypal/android/sdk/onetouch/core/Request;)LgQ3;
    .locals 6

    invoke-static {p0}, LpL3;->e(Landroid/content/Context;)V

    invoke-static {p0}, LpL3;->f(Landroid/content/Context;)Z

    sget-object v0, LpL3;->b:Lov0;

    invoke-virtual {v0}, Lov0;->b()LSy3;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/paypal/android/sdk/onetouch/core/Request;->l(Landroid/content/Context;LSy3;)Lms4;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    new-instance p0, LgQ3;

    invoke-direct {p0, v1, v2, v2, v2}, LgQ3;-><init>(ZLjJ4;Ljava/lang/String;Landroid/content/Intent;)V

    return-object p0

    :cond_0
    sget-object v3, LjJ4;->c:LjJ4;

    invoke-virtual {v0}, Lms4;->c()LjJ4;

    move-result-object v4

    const/4 v5, 0x1

    if-ne v3, v4, :cond_1

    sget-object v1, Ln66;->f:Ln66;

    invoke-virtual {v0}, Lms4;->b()LS94;

    move-result-object v2

    invoke-virtual {p1, p0, v1, v2}, Lcom/paypal/android/sdk/onetouch/core/Request;->q(Landroid/content/Context;Ln66;LS94;)V

    new-instance p0, LgQ3;

    invoke-virtual {p1}, Lcom/paypal/android/sdk/onetouch/core/Request;->j()Ljava/lang/String;

    move-result-object v1

    sget-object v2, LpL3;->a:LXA0;

    sget-object v4, LpL3;->b:Lov0;

    invoke-static {v2, v4, p1, v0}, Lpl;->b(LXA0;Lov0;Lcom/paypal/android/sdk/onetouch/core/Request;Lms4;)Landroid/content/Intent;

    move-result-object p1

    invoke-direct {p0, v5, v3, v1, p1}, LgQ3;-><init>(ZLjJ4;Ljava/lang/String;Landroid/content/Intent;)V

    return-object p0

    :cond_1
    sget-object p0, LpL3;->a:LXA0;

    sget-object v0, LpL3;->b:Lov0;

    invoke-static {p0, v0, p1}, LU20;->a(LXA0;Lov0;Lcom/paypal/android/sdk/onetouch/core/Request;)Landroid/content/Intent;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, LgQ3;

    sget-object v1, LjJ4;->b:LjJ4;

    invoke-virtual {p1}, Lcom/paypal/android/sdk/onetouch/core/Request;->j()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v5, v1, p1, p0}, LgQ3;-><init>(ZLjJ4;Ljava/lang/String;Landroid/content/Intent;)V

    return-object v0

    :cond_2
    new-instance p0, LgQ3;

    sget-object v0, LjJ4;->b:LjJ4;

    invoke-virtual {p1}, Lcom/paypal/android/sdk/onetouch/core/Request;->j()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v1, v0, p1, v2}, LgQ3;-><init>(ZLjJ4;Ljava/lang/String;Landroid/content/Intent;)V

    return-object p0
.end method

.method public static e(Landroid/content/Context;)V
    .locals 3

    sget-object v0, LpL3;->b:Lov0;

    if-eqz v0, :cond_0

    sget-object v0, LpL3;->c:LSx1;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, LoL3;

    invoke-direct {v0}, LoL3;-><init>()V

    const-string v1, "https://api-m.paypal.com/v1/"

    invoke-virtual {v0, v1}, LyN1;->i(Ljava/lang/String;)LyN1;

    move-result-object v0

    check-cast v0, LoL3;

    new-instance v1, Lov0;

    invoke-static {p0}, LpL3;->b(Landroid/content/Context;)LXA0;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lov0;-><init>(LXA0;LoL3;)V

    sput-object v1, LpL3;->b:Lov0;

    new-instance v1, LSx1;

    invoke-static {p0}, LpL3;->b(Landroid/content/Context;)LXA0;

    move-result-object p0

    invoke-direct {v1, p0, v0}, LSx1;-><init>(LXA0;LoL3;)V

    sput-object v1, LpL3;->c:LSx1;

    :cond_1
    sget-object p0, LpL3;->b:Lov0;

    invoke-virtual {p0}, Lov0;->d()V

    return-void
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 4

    invoke-static {p0}, LpL3;->e(Landroid/content/Context;)V

    sget-object v0, LpL3;->b:Lov0;

    invoke-virtual {v0}, Lov0;->b()LSy3;

    move-result-object v0

    invoke-virtual {v0}, LSy3;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3;

    invoke-virtual {v1}, Lms4;->c()LjJ4;

    move-result-object v2

    sget-object v3, LjJ4;->c:LjJ4;

    if-ne v2, v3, :cond_0

    invoke-virtual {v1, p0}, Lms4;->g(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static g(Landroid/content/Context;Lcom/paypal/android/sdk/onetouch/core/Request;Landroid/content/Intent;)Lcom/paypal/android/sdk/onetouch/core/Result;
    .locals 1

    invoke-static {p0}, LpL3;->e(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object p0, LpL3;->a:LXA0;

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    invoke-static {p0, p1, p2}, LU20;->b(LXA0;Lcom/paypal/android/sdk/onetouch/core/Request;Landroid/net/Uri;)Lcom/paypal/android/sdk/onetouch/core/Result;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object p0, LpL3;->a:LXA0;

    invoke-static {p0, p1, p2}, Lpl;->d(LXA0;Lcom/paypal/android/sdk/onetouch/core/Request;Landroid/content/Intent;)Lcom/paypal/android/sdk/onetouch/core/Result;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p2, Ln66;->g:Ln66;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, p2, v0}, Lcom/paypal/android/sdk/onetouch/core/Request;->q(Landroid/content/Context;Ln66;LS94;)V

    new-instance p0, Lcom/paypal/android/sdk/onetouch/core/Result;

    invoke-direct {p0}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>()V

    return-object p0
.end method

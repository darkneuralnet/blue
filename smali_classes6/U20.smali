.class public LU20;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LXA0;Lov0;Lcom/paypal/android/sdk/onetouch/core/Request;)Landroid/content/Intent;
    .locals 4

    invoke-virtual {p1}, Lov0;->b()LSy3;

    move-result-object p1

    invoke-virtual {p2}, Lcom/paypal/android/sdk/onetouch/core/Request;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p1}, Lcom/paypal/android/sdk/onetouch/core/Request;->e(LSy3;)Lms4;

    move-result-object p1

    invoke-virtual {p1}, Lms4;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0, v2}, Lms4;->i(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object v1

    sget-object v3, Ln66;->e:Ln66;

    invoke-virtual {p1}, Lms4;->b()LS94;

    move-result-object p1

    invoke-virtual {p2, v1, v3, p1}, Lcom/paypal/android/sdk/onetouch/core/Request;->q(Landroid/content/Context;Ln66;LS94;)V

    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v0, v2}, Lms4;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(LXA0;Lcom/paypal/android/sdk/onetouch/core/Request;Landroid/net/Uri;)Lcom/paypal/android/sdk/onetouch/core/Result;
    .locals 3

    invoke-virtual {p1, p2}, Lcom/paypal/android/sdk/onetouch/core/Request;->n(Landroid/net/Uri;)Lcom/paypal/android/sdk/onetouch/core/Result;

    move-result-object p2

    sget-object v0, LU20$a;->a:[I

    invoke-virtual {p2}, Lcom/paypal/android/sdk/onetouch/core/Result;->c()LiN4;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object p0

    sget-object v0, Ln66;->h:Ln66;

    invoke-virtual {p1, p0, v0, v2}, Lcom/paypal/android/sdk/onetouch/core/Request;->q(Landroid/content/Context;Ln66;LS94;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object p0

    sget-object v0, Ln66;->g:Ln66;

    invoke-virtual {p1, p0, v0, v2}, Lcom/paypal/android/sdk/onetouch/core/Request;->q(Landroid/content/Context;Ln66;LS94;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object p0

    sget-object v0, Ln66;->i:Ln66;

    invoke-virtual {p1, p0, v0, v2}, Lcom/paypal/android/sdk/onetouch/core/Request;->q(Landroid/content/Context;Ln66;LS94;)V

    :goto_0
    return-object p2
.end method

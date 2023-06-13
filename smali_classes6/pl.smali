.class public Lpl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static b(LXA0;Lov0;Lcom/paypal/android/sdk/onetouch/core/Request;Lms4;)Landroid/content/Intent;
    .locals 1

    invoke-virtual {p3}, Lms4;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.paypal.android.p2pmobile"

    invoke-static {p1, v0}, Lpl;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p3}, Lms4;->b()LS94;

    move-result-object p3

    invoke-virtual {p3}, LS94;->b()Ljava/lang/String;

    move-result-object p3

    const-string v0, "version"

    invoke-virtual {p1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, LY42;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "app_guid"

    invoke-virtual {p1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p2}, Lcom/paypal/android/sdk/onetouch/core/Request;->j()Ljava/lang/String;

    move-result-object p3

    const-string v0, "client_metadata_id"

    invoke-virtual {p1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string p3, "client_id"

    invoke-virtual {p2}, Lcom/paypal/android/sdk/onetouch/core/Request;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, LH21;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const-string p3, "app_name"

    invoke-virtual {p1, p3, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "environment"

    invoke-virtual {p2}, Lcom/paypal/android/sdk/onetouch/core/Request;->k()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p2}, Lcom/paypal/android/sdk/onetouch/core/Request;->k()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lzf1;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "environment_url"

    invoke-virtual {p0, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    check-cast p2, Lcom/paypal/android/sdk/onetouch/core/CheckoutRequest;

    invoke-virtual {p2}, Lcom/paypal/android/sdk/onetouch/core/CheckoutRequest;->g()Ljava/lang/String;

    move-result-object p1

    const-string p2, "response_type"

    const-string p3, "web"

    invoke-virtual {p0, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p2

    const-string p3, "webURL"

    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "O=Paypal"

    const v1, 0x2096f5c

    invoke-static {p0, p1, v0, v0, v1}, LKA5;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    move-result p0

    return p0
.end method

.method public static d(LXA0;Lcom/paypal/android/sdk/onetouch/core/Request;Landroid/content/Intent;)Lcom/paypal/android/sdk/onetouch/core/Result;
    .locals 3

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/paypal/android/sdk/onetouch/core/Request;->r(Landroid/os/Bundle;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object p0

    sget-object v0, Ln66;->h:Ln66;

    invoke-virtual {p1, p0, v0, v1}, Lcom/paypal/android/sdk/onetouch/core/Request;->q(Landroid/content/Context;Ln66;LS94;)V

    invoke-static {p2}, Lpl;->e(Landroid/os/Bundle;)Lcom/paypal/android/sdk/onetouch/core/Result;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "error"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object p0

    sget-object v2, Ln66;->i:Ln66;

    invoke-virtual {p1, p0, v2, v1}, Lcom/paypal/android/sdk/onetouch/core/Request;->q(Landroid/content/Context;Ln66;LS94;)V

    new-instance p0, Lcom/paypal/android/sdk/onetouch/core/Result;

    new-instance p1, Lcom/paypal/android/sdk/onetouch/core/exception/WalletSwitchException;

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/paypal/android/sdk/onetouch/core/exception/WalletSwitchException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>(Ljava/lang/Throwable;)V

    return-object p0

    :cond_1
    invoke-virtual {p0}, LXA0;->b()Landroid/content/Context;

    move-result-object p0

    sget-object p2, Ln66;->i:Ln66;

    invoke-virtual {p1, p0, p2, v1}, Lcom/paypal/android/sdk/onetouch/core/Request;->q(Landroid/content/Context;Ln66;LS94;)V

    new-instance p0, Lcom/paypal/android/sdk/onetouch/core/Result;

    new-instance p1, Lcom/paypal/android/sdk/onetouch/core/exception/ResponseParsingException;

    const-string p2, "invalid wallet response"

    invoke-direct {p1, p2}, Lcom/paypal/android/sdk/onetouch/core/exception/ResponseParsingException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public static e(Landroid/os/Bundle;)Lcom/paypal/android/sdk/onetouch/core/Result;
    .locals 6

    const-string v0, "webURL"

    const-string v1, "error"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance p0, Lcom/paypal/android/sdk/onetouch/core/Result;

    new-instance v0, Lcom/paypal/android/sdk/onetouch/core/exception/WalletSwitchException;

    invoke-direct {v0, v1}, Lcom/paypal/android/sdk/onetouch/core/exception/WalletSwitchException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>(Ljava/lang/Throwable;)V

    return-object p0

    :cond_0
    const-string v1, "environment"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "response_type"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "code"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, LLM4;->c:LLM4;

    goto :goto_0

    :cond_1
    sget-object v2, LLM4;->b:LLM4;

    :goto_0
    :try_start_0
    sget-object v4, LLM4;->b:LLM4;

    if-ne v4, v2, :cond_2

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v3, Lcom/paypal/android/sdk/onetouch/core/Result;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v4, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    const/4 v0, 0x0

    invoke-direct {v3, v1, v2, p0, v0}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>(Ljava/lang/String;LLM4;Lorg/json/JSONObject;Ljava/lang/String;)V

    return-object v3

    :cond_2
    const-string v0, "authorization_code"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "email"

    invoke-virtual {p0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v4, Lcom/paypal/android/sdk/onetouch/core/Result;

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v5, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {v4, v1, v2, v0, p0}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>(Ljava/lang/String;LLM4;Lorg/json/JSONObject;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    :catch_0
    move-exception p0

    new-instance v0, Lcom/paypal/android/sdk/onetouch/core/Result;

    new-instance v1, Lcom/paypal/android/sdk/onetouch/core/exception/ResponseParsingException;

    invoke-direct {v1, p0}, Lcom/paypal/android/sdk/onetouch/core/exception/ResponseParsingException;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.class public Lcom/braintreepayments/api/internal/AnalyticsIntentService;
.super Landroid/app/IntentService;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-class v0, Lcom/braintreepayments/api/internal/AnalyticsIntentService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/IntentService;->setIntentRedelivery(Z)V

    return-void
.end method


# virtual methods
.method public onHandleIntent(Landroid/content/Intent;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v0, "com.braintreepayments.api.internal.AnalyticsIntentService.EXTRA_AUTHORIZATION"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/braintreepayments/api/models/Authorization;->a(Ljava/lang/String;)Lcom/braintreepayments/api/models/Authorization;

    move-result-object v0

    const-string v1, "com.braintreepayments.api.internal.AnalyticsIntentService.EXTRA_CONFIGURATION"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lex0;->a(Ljava/lang/String;)Lex0;

    move-result-object p1

    new-instance v1, LK10;

    invoke-direct {v1, v0}, LK10;-><init>(Lcom/braintreepayments/api/models/Authorization;)V

    invoke-virtual {p1}, Lex0;->b()Laa;

    move-result-object p1

    invoke-virtual {p1}, Laa;->b()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x1

    invoke-static {p0, v0, v1, p1, v2}, LVa;->d(Landroid/content/Context;Lcom/braintreepayments/api/models/Authorization;LK10;Ljava/lang/String;Z)V
    :try_end_0
    .catch Lcom/braintreepayments/api/exceptions/InvalidArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

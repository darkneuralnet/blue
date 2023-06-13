.class public Lxo6;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Landroid/content/Intent;
    .locals 4

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.venmo"

    const-string v3, "com.venmo.controller.SetupMerchantActivity"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 3

    invoke-static {}, Lxo6;->a()Landroid/content/Intent;

    move-result-object v0

    invoke-static {p0, v0}, Lcj;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "com.venmo"

    const v1, -0x7bb3ee3

    const-string v2, "CN=Andrew Kortina,OU=Engineering,O=Venmo,L=Philadelphia,ST=PA,C=US"

    invoke-static {p0, v0, v2, v2, v1}, LKA5;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static c(LG10;ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const-string p1, "pay-with-venmo.app-switch.success"

    invoke-virtual {p0, p1}, LG10;->Ea(Ljava/lang/String;)V

    const-string p1, "com.braintreepayments.api.EXTRA_PAYMENT_METHOD_NONCE"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LG10;->T9()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lxo6;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LG10;->da()Lcom/braintreepayments/api/models/Authorization;

    move-result-object v0

    instance-of v0, v0, Lcom/braintreepayments/api/models/ClientToken;

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lxo6;->e(LG10;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "com.braintreepayments.api.EXTRA_USER_NAME"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/braintreepayments/api/models/VenmoAccountNonce;

    invoke-direct {v0, p1, p2, p2}, Lcom/braintreepayments/api/models/VenmoAccountNonce;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LG10;->va(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    const-string p1, "pay-with-venmo.app-switch.canceled"

    invoke-virtual {p0, p1}, LG10;->Ea(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 2

    invoke-static {p0}, LO10;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "com.braintreepayments.api.Venmo.VAULT_VENMO_KEY"

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static e(LG10;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lyo6;

    invoke-direct {v0}, Lyo6;-><init>()V

    invoke-virtual {v0, p1}, Lyo6;->l(Ljava/lang/String;)Lyo6;

    move-result-object p1

    new-instance v0, Lxo6$a;

    invoke-direct {v0, p0}, Lxo6$a;-><init>(LG10;)V

    invoke-static {p0, p1, v0}, Lu56;->c(LG10;LrN3;LLN3;)V

    return-void
.end method

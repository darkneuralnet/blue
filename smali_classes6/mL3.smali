.class public LmL3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    new-instance v0, LnL3;

    invoke-direct {v0}, LnL3;-><init>()V

    invoke-static {p0}, LY42;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LnL3;->e(Ljava/lang/String;)LnL3;

    move-result-object v0

    invoke-static {p0, v0}, LmL3;->b(Landroid/content/Context;LnL3;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;LnL3;)Ljava/lang/String;
    .locals 4

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {}, LUF2;->g()LUF2;

    move-result-object v1

    new-instance v2, LVF2$b;

    invoke-direct {v2, p0}, LVF2$b;-><init>(Landroid/content/Context;)V

    sget-object v3, LWF2;->f:LWF2;

    invoke-virtual {v2, v3}, LVF2$b;->n(LWF2;)LVF2$b;

    move-result-object v2

    invoke-virtual {p1}, LnL3;->d()Z

    move-result v3

    invoke-virtual {v2, v3}, LVF2$b;->k(Z)LVF2$b;

    move-result-object v2

    sget-object v3, Lxf1;->b:Lxf1;

    invoke-virtual {v2, v3}, LVF2$b;->m(Lxf1;)LVF2$b;

    move-result-object v2

    invoke-virtual {p1}, LnL3;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LVF2$b;->l(Ljava/lang/String;)LVF2$b;

    move-result-object v2

    invoke-virtual {v2}, LVF2$b;->j()LVF2;

    move-result-object v2

    invoke-virtual {v1, v2}, LUF2;->h(LVF2;)LVF2;

    invoke-virtual {p1}, LnL3;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LnL3;->a()Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {v1, p0, v2, p1}, LUF2;->f(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;)LTF2;

    move-result-object p0

    invoke-virtual {p0}, LTF2;->b()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Llib/android/paypal/com/magnessdk/InvalidInputException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "Exception"

    const-string v1, "Error fetching client metadata ID. Contact Braintree Support for assistance."

    invoke-static {p1, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, LnL3;

    invoke-direct {v0}, LnL3;-><init>()V

    invoke-static {p0}, LY42;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LnL3;->e(Ljava/lang/String;)LnL3;

    move-result-object v0

    invoke-virtual {v0, p1}, LnL3;->f(Ljava/lang/String;)LnL3;

    move-result-object p1

    invoke-static {p0, p1}, LmL3;->b(Landroid/content/Context;LnL3;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.class public final LWO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUM6;


# instance fields
.field public final synthetic a:LcO5;

.field public final synthetic b:Landroid/content/Intent;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:LcP6;


# direct methods
.method public constructor <init>(LcP6;LcO5;Landroid/content/Intent;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LWO6;->d:LcP6;

    iput-object p2, p0, LWO6;->a:LcO5;

    iput-object p3, p0, LWO6;->b:Landroid/content/Intent;

    iput-object p4, p0, LWO6;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, LWO6;->d:LcP6;

    iget-object v1, p0, LWO6;->a:LcO5;

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LcP6;->h(LcP6;LcO5;II)V

    return-void
.end method

.method public final a(I)V
    .locals 3

    iget-object v0, p0, LWO6;->d:LcP6;

    iget-object v1, p0, LWO6;->a:LcO5;

    const/4 v2, 0x6

    invoke-static {v0, v1, v2, p1}, LcP6;->h(LcP6;LcO5;II)V

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, LWO6;->b:Landroid/content/Intent;

    const-string v1, "triggered_from_app_after_verification"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LWO6;->b:Landroid/content/Intent;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v0, p0, LWO6;->c:Landroid/content/Context;

    iget-object v1, p0, LWO6;->b:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    :cond_0
    iget-object v0, p0, LWO6;->d:LcP6;

    invoke-static {v0}, LcP6;->i(LcP6;)LhK6;

    move-result-object v0

    const-string v1, "Splits copied and verified more than once."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LhK6;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

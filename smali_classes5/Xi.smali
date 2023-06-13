.class public LXi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXi$a;
    }
.end annotation


# instance fields
.field public a:LYi;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYi;

    invoke-direct {v0, p1, p2, p3}, LYi;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V

    iput-object v0, p0, LXi;->a:LYi;

    return-void
.end method

.method public static a(Landroid/app/Application;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LYi;->a(Landroid/app/Application;Ljava/lang/String;)V

    return-void
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LYi;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static d()LXi$a;
    .locals 1

    invoke-static {}, LYi;->f()LXi$a;

    move-result-object v0

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lbb;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LYi;->i(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static h(Landroid/content/Context;)LXi;
    .locals 2

    new-instance v0, LXi;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, LXi;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V

    return-object v0
.end method

.method public static i()V
    .locals 0

    invoke-static {}, LYi;->u()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, LXi;->a:LYi;

    invoke-virtual {v0}, LYi;->c()V

    return-void
.end method

.method public g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LXi;->a:LYi;

    invoke-virtual {v0, p1, p2}, LYi;->m(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.class public final Lcom/facebook/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/a;->E(Landroid/content/Context;Lcom/facebook/a$j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/facebook/a$j;Landroid/content/Context;)V
    .locals 0

    iput-object p2, p0, Lcom/facebook/a$g;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, LG1;->h()LG1;

    move-result-object v0

    invoke-virtual {v0}, LG1;->i()Z

    invoke-static {}, LA74;->d()LA74;

    move-result-object v0

    invoke-virtual {v0}, LA74;->e()Z

    invoke-static {}, Lcom/facebook/AccessToken;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/facebook/Profile;->c()Lcom/facebook/Profile;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/Profile;->b()V

    :cond_0
    invoke-static {}, Lcom/facebook/a;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/facebook/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LXi;->f(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/b;->m()V

    iget-object v0, p0, Lcom/facebook/a$g;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LXi;->h(Landroid/content/Context;)LXi;

    move-result-object v0

    invoke-virtual {v0}, LXi;->b()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/a$g;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

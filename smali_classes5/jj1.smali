.class public abstract Ljj1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljj1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CONTENT:",
        "Ljava/lang/Object;",
        "RESU",
        "LT:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final e:Ljava/lang/Object;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:LIy1;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljj1<",
            "TCONTENT;TRESU",
            "LT;",
            ">.a;>;"
        }
    .end annotation
.end field

.field public d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ljj1;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LIy1;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "fragmentWrapper"

    invoke-static {p1, v0}, Lsj6;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ljj1;->b:LIy1;

    const/4 v0, 0x0

    iput-object v0, p0, Ljj1;->a:Landroid/app/Activity;

    iput p2, p0, Ljj1;->d:I

    invoke-virtual {p1}, LIy1;->a()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot use a fragment that is not attached to an activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/app/Activity;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "activity"

    invoke-static {p1, v0}, Lsj6;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ljj1;->a:Landroid/app/Activity;

    const/4 p1, 0x0

    iput-object p1, p0, Ljj1;->b:LIy1;

    iput p2, p0, Ljj1;->d:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljj1<",
            "TCONTENT;TRESU",
            "LT;",
            ">.a;>;"
        }
    .end annotation

    iget-object v0, p0, Ljj1;->c:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljj1;->g()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ljj1;->c:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Ljj1;->c:Ljava/util/List;

    return-object v0
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;)Z"
        }
    .end annotation

    sget-object v0, Ljj1;->e:Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Ljj1;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    sget-object v0, Ljj1;->e:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p2, v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Ljj1;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljj1$a;

    if-nez v0, :cond_2

    invoke-virtual {v4}, Ljj1$a;->c()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, p2}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v4, p1, v2}, Ljj1$a;->a(Ljava/lang/Object;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    return v1

    :cond_3
    return v2
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)LSh;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;",
            "Ljava/lang/Object;",
            ")",
            "LSh;"
        }
    .end annotation

    sget-object v0, Ljj1;->e:Ljava/lang/Object;

    const/4 v1, 0x1

    if-ne p2, v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ljj1;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljj1$a;

    if-nez v0, :cond_1

    invoke-virtual {v3}, Ljj1$a;->c()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, p2}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3, p1, v1}, Ljj1$a;->a(Ljava/lang/Object;Z)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    :try_start_0
    invoke-virtual {v3, p1}, Ljj1$a;->b(Ljava/lang/Object;)LSh;

    move-result-object p1
    :try_end_0
    .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Ljj1;->e()LSh;

    move-result-object p2

    invoke-static {p2, p1}, LC31;->j(LSh;Lcom/facebook/FacebookException;)V

    move-object p1, p2

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_4

    invoke-virtual {p0}, Ljj1;->e()LSh;

    move-result-object p1

    invoke-static {p1}, LC31;->g(LSh;)V

    :cond_4
    return-object p1
.end method

.method public abstract e()LSh;
.end method

.method public f()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Ljj1;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ljj1;->b:LIy1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LIy1;->a()Landroid/app/Activity;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract g()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljj1<",
            "TCONTENT;TRESU",
            "LT;",
            ">.a;>;"
        }
    .end annotation
.end method

.method public h()I
    .locals 1

    iget v0, p0, Ljj1;->d:I

    return v0
.end method

.method public i(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;)V"
        }
    .end annotation

    sget-object v0, Ljj1;->e:Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Ljj1;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ljj1;->d(Ljava/lang/Object;Ljava/lang/Object;)LSh;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Ljj1;->b:LIy1;

    if-eqz p2, :cond_0

    invoke-static {p1, p2}, LC31;->e(LSh;LIy1;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ljj1;->a:Landroid/app/Activity;

    invoke-static {p1, p2}, LC31;->f(LSh;Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    const-string p1, "FacebookDialog"

    const-string p2, "No code path should ever result in a null appCall"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/facebook/a;->v()Z

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k(Landroid/content/Intent;I)V
    .locals 2

    iget-object v0, p0, Ljj1;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljj1;->b:LIy1;

    const-string v1, "Failed to find Activity or Fragment to startActivityForResult "

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LIy1;->b()Landroid/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljj1;->b:LIy1;

    invoke-virtual {v0}, LIy1;->b()Landroid/app/Fragment;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ljj1;->b:LIy1;

    invoke-virtual {v0}, LIy1;->c()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ljj1;->b:LIy1;

    invoke-virtual {v0}, LIy1;->c()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_0
    const/4 v1, 0x0

    :cond_2
    if-eqz v1, :cond_3

    sget-object p1, LSx2;->g:LSx2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p1, v0, p2, v1}, LFx2;->f(LSx2;ILjava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

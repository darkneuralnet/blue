.class public abstract LDB;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:LNA5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LNA5<",
            "LdV5;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field public c:LNA5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LNA5<",
            "LrV5;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDB;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, LdV5;

    if-eqz v0, :cond_2

    check-cast p1, LdV5;

    iget-object v0, p0, LDB;->b:LNA5;

    if-nez v0, :cond_0

    new-instance v0, LNA5;

    invoke-direct {v0}, LNA5;-><init>()V

    iput-object v0, p0, LDB;->b:LNA5;

    :cond_0
    iget-object v0, p0, LDB;->b:LNA5;

    invoke-virtual {v0, p1}, LNA5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    if-nez v0, :cond_1

    new-instance v0, LqQ2;

    iget-object v1, p0, LDB;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, LqQ2;-><init>(Landroid/content/Context;LdV5;)V

    iget-object v1, p0, LDB;->b:LNA5;

    invoke-virtual {v1, p1, v0}, LNA5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final d(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .locals 2

    instance-of v0, p1, LrV5;

    if-eqz v0, :cond_2

    check-cast p1, LrV5;

    iget-object v0, p0, LDB;->c:LNA5;

    if-nez v0, :cond_0

    new-instance v0, LNA5;

    invoke-direct {v0}, LNA5;-><init>()V

    iput-object v0, p0, LDB;->c:LNA5;

    :cond_0
    iget-object v0, p0, LDB;->c:LNA5;

    invoke-virtual {v0, p1}, LNA5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    if-nez v0, :cond_1

    new-instance v0, LXS5;

    iget-object v1, p0, LDB;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, LXS5;-><init>(Landroid/content/Context;LrV5;)V

    iget-object v1, p0, LDB;->c:LNA5;

    invoke-virtual {v1, p1, v0}, LNA5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, LDB;->b:LNA5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LNA5;->clear()V

    :cond_0
    iget-object v0, p0, LDB;->c:LNA5;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LNA5;->clear()V

    :cond_1
    return-void
.end method

.method public final f(I)V
    .locals 2

    iget-object v0, p0, LDB;->b:LNA5;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LDB;->b:LNA5;

    invoke-virtual {v1}, LNA5;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, LDB;->b:LNA5;

    invoke-virtual {v1, v0}, LNA5;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LdV5;

    invoke-interface {v1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v1

    if-ne v1, p1, :cond_1

    iget-object v1, p0, LDB;->b:LNA5;

    invoke-virtual {v1, v0}, LNA5;->k(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final g(I)V
    .locals 2

    iget-object v0, p0, LDB;->b:LNA5;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LDB;->b:LNA5;

    invoke-virtual {v1}, LNA5;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, LDB;->b:LNA5;

    invoke-virtual {v1, v0}, LNA5;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LdV5;

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v1, p1, :cond_1

    iget-object p1, p0, LDB;->b:LNA5;

    invoke-virtual {p1, v0}, LNA5;->k(I)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

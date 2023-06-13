.class public final LhC6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LhC6$d;,
        LhC6$c;,
        LhC6$b;,
        LhC6$a;,
        LhC6$e;
    }
.end annotation


# instance fields
.field public final a:LhC6$e;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance p2, LhC6$d;

    invoke-direct {p2, p1, p0}, LhC6$d;-><init>(Landroid/view/Window;LhC6;)V

    iput-object p2, p0, LhC6;->a:LhC6$e;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    new-instance v0, LhC6$c;

    invoke-direct {v0, p1, p2}, LhC6$c;-><init>(Landroid/view/Window;Landroid/view/View;)V

    iput-object v0, p0, LhC6;->a:LhC6$e;

    goto :goto_0

    :cond_1
    new-instance v0, LhC6$b;

    invoke-direct {v0, p1, p2}, LhC6$b;-><init>(Landroid/view/Window;Landroid/view/View;)V

    iput-object v0, p0, LhC6;->a:LhC6$e;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LhC6$d;

    invoke-direct {v0, p1, p0}, LhC6$d;-><init>(Landroid/view/WindowInsetsController;LhC6;)V

    iput-object v0, p0, LhC6;->a:LhC6$e;

    return-void
.end method

.method public static f(Landroid/view/WindowInsetsController;)LhC6;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LhC6;

    invoke-direct {v0, p0}, LhC6;-><init>(Landroid/view/WindowInsetsController;)V

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, LhC6;->a:LhC6$e;

    invoke-virtual {v0, p1}, LhC6$e;->a(I)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, LhC6;->a:LhC6$e;

    invoke-virtual {v0}, LhC6$e;->b()Z

    move-result v0

    return v0
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, LhC6;->a:LhC6$e;

    invoke-virtual {v0, p1}, LhC6$e;->c(Z)V

    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, LhC6;->a:LhC6$e;

    invoke-virtual {v0, p1}, LhC6$e;->d(Z)V

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, LhC6;->a:LhC6$e;

    invoke-virtual {v0, p1}, LhC6$e;->e(I)V

    return-void
.end method

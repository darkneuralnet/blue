.class public Lzendesk/belvedere/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LXX1;

.field public final b:Lzendesk/belvedere/f;

.field public final c:Lzendesk/belvedere/b;

.field public final d:Lzendesk/belvedere/c$b;


# direct methods
.method public constructor <init>(LXX1;Lzendesk/belvedere/f;Lzendesk/belvedere/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzendesk/belvedere/g$c;

    invoke-direct {v0, p0}, Lzendesk/belvedere/g$c;-><init>(Lzendesk/belvedere/g;)V

    iput-object v0, p0, Lzendesk/belvedere/g;->d:Lzendesk/belvedere/c$b;

    iput-object p1, p0, Lzendesk/belvedere/g;->a:LXX1;

    iput-object p2, p0, Lzendesk/belvedere/g;->b:Lzendesk/belvedere/f;

    iput-object p3, p0, Lzendesk/belvedere/g;->c:Lzendesk/belvedere/b;

    return-void
.end method

.method public static synthetic a(Lzendesk/belvedere/g;)LXX1;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/g;->a:LXX1;

    return-object p0
.end method

.method public static synthetic b(Lzendesk/belvedere/g;)Lzendesk/belvedere/b;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/g;->c:Lzendesk/belvedere/b;

    return-object p0
.end method

.method public static synthetic c(Lzendesk/belvedere/g;)Lzendesk/belvedere/f;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/g;->b:Lzendesk/belvedere/f;

    return-object p0
.end method

.method public static synthetic d(Lzendesk/belvedere/g;Lzendesk/belvedere/MediaResult;Z)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lzendesk/belvedere/g;->k(Lzendesk/belvedere/MediaResult;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e()V
    .locals 3

    iget-object v0, p0, Lzendesk/belvedere/g;->c:Lzendesk/belvedere/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Lzendesk/belvedere/b;->T9(Lzendesk/belvedere/h;Lzendesk/belvedere/BelvedereUi$UiConfig;)V

    iget-object v0, p0, Lzendesk/belvedere/g;->c:Lzendesk/belvedere/b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v1, v2}, Lzendesk/belvedere/b;->P9(IIF)V

    iget-object v0, p0, Lzendesk/belvedere/g;->c:Lzendesk/belvedere/b;

    invoke-virtual {v0}, Lzendesk/belvedere/b;->E9()V

    return-void
.end method

.method public f()V
    .locals 2

    invoke-virtual {p0}, Lzendesk/belvedere/g;->i()V

    invoke-virtual {p0}, Lzendesk/belvedere/g;->g()V

    iget-object v0, p0, Lzendesk/belvedere/g;->b:Lzendesk/belvedere/f;

    iget-object v1, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {v1}, LXX1;->i()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Lzendesk/belvedere/f;->e(I)V

    iget-object v0, p0, Lzendesk/belvedere/g;->b:Lzendesk/belvedere/f;

    iget-object v1, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {v1}, LXX1;->i()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Lzendesk/belvedere/f;->f(I)V

    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {v0}, LXX1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lzendesk/belvedere/g$a;

    invoke-direct {v0, p0}, Lzendesk/belvedere/g$a;-><init>(Lzendesk/belvedere/g;)V

    iget-object v1, p0, Lzendesk/belvedere/g;->b:Lzendesk/belvedere/f;

    invoke-interface {v1, v0}, Lzendesk/belvedere/f;->c(Landroid/view/View$OnClickListener;)V

    :cond_0
    iget-object v0, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {v0}, LXX1;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lzendesk/belvedere/g$b;

    invoke-direct {v0, p0}, Lzendesk/belvedere/g$b;-><init>(Lzendesk/belvedere/g;)V

    iget-object v1, p0, Lzendesk/belvedere/g;->b:Lzendesk/belvedere/f;

    invoke-interface {v1, v0}, Lzendesk/belvedere/f;->b(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method public h(IIF)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lzendesk/belvedere/g;->c:Lzendesk/belvedere/b;

    invoke-virtual {v0, p1, p2, p3}, Lzendesk/belvedere/b;->P9(IIF)V

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 7

    iget-object v0, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {v0}, LXX1;->d()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lzendesk/belvedere/g;->b:Lzendesk/belvedere/f;

    invoke-interface {v0}, Lzendesk/belvedere/f;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    move v4, v0

    iget-object v0, p0, Lzendesk/belvedere/g;->b:Lzendesk/belvedere/f;

    invoke-interface {v0, v4}, Lzendesk/belvedere/f;->d(Z)V

    iget-object v0, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {v0}, LXX1;->f()Ljava/util/List;

    move-result-object v2

    iget-object v0, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {v0}, LXX1;->i()Ljava/util/List;

    move-result-object v3

    iget-object v1, p0, Lzendesk/belvedere/g;->b:Lzendesk/belvedere/f;

    iget-object v0, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {v0}, LXX1;->b()Z

    move-result v5

    iget-object v6, p0, Lzendesk/belvedere/g;->d:Lzendesk/belvedere/c$b;

    invoke-interface/range {v1 .. v6}, Lzendesk/belvedere/f;->a(Ljava/util/List;Ljava/util/List;ZZLzendesk/belvedere/c$b;)V

    iget-object v0, p0, Lzendesk/belvedere/g;->c:Lzendesk/belvedere/b;

    invoke-virtual {v0}, Lzendesk/belvedere/b;->S9()V

    return-void
.end method

.method public j()V
    .locals 2

    iget-object v0, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {v0}, LXX1;->i()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lzendesk/belvedere/g;->c:Lzendesk/belvedere/b;

    invoke-virtual {v1, v0}, Lzendesk/belvedere/b;->J9(Ljava/util/List;)V

    return-void
.end method

.method public final k(Lzendesk/belvedere/MediaResult;Z)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/belvedere/MediaResult;",
            "Z)",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;"
        }
    .end annotation

    if-eqz p2, :cond_0

    iget-object p2, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {p2, p1}, LXX1;->k(Lzendesk/belvedere/MediaResult;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lzendesk/belvedere/g;->a:LXX1;

    invoke-interface {p2, p1}, LXX1;->c(Lzendesk/belvedere/MediaResult;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

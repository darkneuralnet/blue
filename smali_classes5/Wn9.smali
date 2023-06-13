.class public final LWn9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXl9;


# instance fields
.field public a:LX94;

.field public final b:LX94;

.field public final c:Ljm9;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljm9;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LWn9;->c:Ljm9;

    sget-object p2, LW70;->g:LW70;

    invoke-static {p1}, Lia6;->f(Landroid/content/Context;)V

    invoke-static {}, Lia6;->c()Lia6;

    move-result-object p1

    invoke-virtual {p1, p2}, Lia6;->g(LG01;)LU96;

    move-result-object p1

    invoke-virtual {p2}, LW70;->a()Ljava/util/Set;

    move-result-object p2

    const-string v0, "json"

    invoke-static {v0}, LPc1;->b(Ljava/lang/String;)LPc1;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, LYm2;

    new-instance v0, LJn9;

    invoke-direct {v0, p1}, LJn9;-><init>(LU96;)V

    invoke-direct {p2, v0}, LYm2;-><init>(LX94;)V

    iput-object p2, p0, LWn9;->a:LX94;

    :cond_0
    new-instance p2, LYm2;

    new-instance v0, LMn9;

    invoke-direct {v0, p1}, LMn9;-><init>(LU96;)V

    invoke-direct {p2, v0}, LYm2;-><init>(LX94;)V

    iput-object p2, p0, LWn9;->b:LX94;

    return-void
.end method

.method public static b(Ljm9;LRl9;)Lyg1;
    .locals 2

    invoke-virtual {p0}, Ljm9;->a()I

    move-result p0

    invoke-interface {p1}, LRl9;->zza()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0, v1}, LRl9;->a(IZ)[B

    move-result-object p0

    invoke-static {p0}, Lyg1;->d(Ljava/lang/Object;)Lyg1;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p1, p0, v1}, LRl9;->a(IZ)[B

    move-result-object p0

    invoke-static {p0}, Lyg1;->e(Ljava/lang/Object;)Lyg1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LRl9;)V
    .locals 2

    iget-object v0, p0, LWn9;->c:Ljm9;

    invoke-virtual {v0}, Ljm9;->a()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LWn9;->a:LX94;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR96;

    iget-object v1, p0, LWn9;->c:Ljm9;

    invoke-static {v1, p1}, LWn9;->b(Ljm9;LRl9;)Lyg1;

    move-result-object p1

    invoke-interface {v0, p1}, LR96;->a(Lyg1;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, LWn9;->b:LX94;

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR96;

    iget-object v1, p0, LWn9;->c:Ljm9;

    invoke-static {v1, p1}, LWn9;->b(Ljm9;LRl9;)Lyg1;

    move-result-object p1

    invoke-interface {v0, p1}, LR96;->a(Lyg1;)V

    return-void
.end method

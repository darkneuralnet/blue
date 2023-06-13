.class public final LNZ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwX8;


# instance fields
.field public a:LX94;

.field public final b:LX94;

.field public final c:LwW8;


# direct methods
.method public constructor <init>(Landroid/content/Context;LwW8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LNZ8;->c:LwW8;

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

    new-instance v0, LMY8;

    invoke-direct {v0, p1}, LMY8;-><init>(LU96;)V

    invoke-direct {p2, v0}, LYm2;-><init>(LX94;)V

    iput-object p2, p0, LNZ8;->a:LX94;

    :cond_0
    new-instance p2, LYm2;

    new-instance v0, LWY8;

    invoke-direct {v0, p1}, LWY8;-><init>(LU96;)V

    invoke-direct {p2, v0}, LYm2;-><init>(LX94;)V

    iput-object p2, p0, LNZ8;->b:LX94;

    return-void
.end method

.method public static b(LwW8;LkY8;)Lyg1;
    .locals 2

    invoke-virtual {p0}, LwW8;->a()I

    move-result p0

    invoke-virtual {p1}, LkY8;->a()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0, v1}, LkY8;->c(IZ)[B

    move-result-object p0

    invoke-static {p0}, Lyg1;->d(Ljava/lang/Object;)Lyg1;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p1, p0, v1}, LkY8;->c(IZ)[B

    move-result-object p0

    invoke-static {p0}, Lyg1;->e(Ljava/lang/Object;)Lyg1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LkY8;)V
    .locals 2

    iget-object v0, p0, LNZ8;->c:LwW8;

    invoke-virtual {v0}, LwW8;->a()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LNZ8;->a:LX94;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR96;

    iget-object v1, p0, LNZ8;->c:LwW8;

    invoke-static {v1, p1}, LNZ8;->b(LwW8;LkY8;)Lyg1;

    move-result-object p1

    invoke-interface {v0, p1}, LR96;->a(Lyg1;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, LNZ8;->b:LX94;

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR96;

    iget-object v1, p0, LNZ8;->c:LwW8;

    invoke-static {v1, p1}, LNZ8;->b(LwW8;LkY8;)Lyg1;

    move-result-object p1

    invoke-interface {v0, p1}, LR96;->a(Lyg1;)V

    return-void
.end method

.class public final Ldp7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzo7;


# instance fields
.field public a:LX94;

.field public final b:LX94;

.field public final c:Luo7;


# direct methods
.method public constructor <init>(Landroid/content/Context;Luo7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ldp7;->c:Luo7;

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

    new-instance v0, Lbp7;

    invoke-direct {v0, p1}, Lbp7;-><init>(LU96;)V

    invoke-direct {p2, v0}, LYm2;-><init>(LX94;)V

    iput-object p2, p0, Ldp7;->a:LX94;

    :cond_0
    new-instance p2, LYm2;

    new-instance v0, Lcp7;

    invoke-direct {v0, p1}, Lcp7;-><init>(LU96;)V

    invoke-direct {p2, v0}, LYm2;-><init>(LX94;)V

    iput-object p2, p0, Ldp7;->b:LX94;

    return-void
.end method

.method public static b(Luo7;Lso7;)Lyg1;
    .locals 1

    invoke-virtual {p0}, Luo7;->a()I

    move-result p0

    invoke-interface {p1}, Lso7;->zza()I

    const/4 v0, 0x0

    invoke-interface {p1, p0, v0}, Lso7;->a(IZ)[B

    move-result-object p0

    invoke-static {p0}, Lyg1;->e(Ljava/lang/Object;)Lyg1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lso7;)V
    .locals 2

    iget-object v0, p0, Ldp7;->c:Luo7;

    invoke-virtual {v0}, Luo7;->a()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ldp7;->a:LX94;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR96;

    iget-object v1, p0, Ldp7;->c:Luo7;

    invoke-static {v1, p1}, Ldp7;->b(Luo7;Lso7;)Lyg1;

    move-result-object p1

    invoke-interface {v0, p1}, LR96;->a(Lyg1;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Ldp7;->b:LX94;

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR96;

    iget-object v1, p0, Ldp7;->c:Luo7;

    invoke-static {v1, p1}, Ldp7;->b(Luo7;Lso7;)Lyg1;

    move-result-object p1

    invoke-interface {v0, p1}, LR96;->a(Lyg1;)V

    return-void
.end method

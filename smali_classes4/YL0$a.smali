.class public final LYL0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnG2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYL0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lhj;

.field public b:LVH2;

.field public c:Ldq;

.field public d:LNh2;

.field public e:LP43;

.field public f:LMa4;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LXL0;)V
    .locals 0

    invoke-direct {p0}, LYL0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LVH2;)LnG2$a;
    .locals 0

    invoke-virtual {p0, p1}, LYL0$a;->h(LVH2;)LYL0$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lau5;)LnG2$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, LYL0$a;->j(Lau5;)LYL0$a;

    move-result-object p1

    return-object p1
.end method

.method public build()LnG2;
    .locals 10

    iget-object v0, p0, LYL0$a;->a:Lhj;

    const-class v1, Lhj;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, LYL0$a;->b:LVH2;

    const-class v1, LVH2;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, LYL0$a;->c:Ldq;

    if-nez v0, :cond_0

    new-instance v0, Ldq;

    invoke-direct {v0}, Ldq;-><init>()V

    iput-object v0, p0, LYL0$a;->c:Ldq;

    :cond_0
    iget-object v0, p0, LYL0$a;->d:LNh2;

    if-nez v0, :cond_1

    new-instance v0, LNh2;

    invoke-direct {v0}, LNh2;-><init>()V

    iput-object v0, p0, LYL0$a;->d:LNh2;

    :cond_1
    iget-object v0, p0, LYL0$a;->e:LP43;

    if-nez v0, :cond_2

    new-instance v0, LP43;

    invoke-direct {v0}, LP43;-><init>()V

    iput-object v0, p0, LYL0$a;->e:LP43;

    :cond_2
    iget-object v0, p0, LYL0$a;->f:LMa4;

    if-nez v0, :cond_3

    new-instance v0, LMa4;

    invoke-direct {v0}, LMa4;-><init>()V

    iput-object v0, p0, LYL0$a;->f:LMa4;

    :cond_3
    new-instance v0, LYL0$b;

    iget-object v2, p0, LYL0$a;->d:LNh2;

    iget-object v3, p0, LYL0$a;->a:Lhj;

    iget-object v4, p0, LYL0$a;->b:LVH2;

    new-instance v5, Ljn1;

    invoke-direct {v5}, Ljn1;-><init>()V

    iget-object v6, p0, LYL0$a;->e:LP43;

    iget-object v7, p0, LYL0$a;->f:LMa4;

    iget-object v8, p0, LYL0$a;->c:Ldq;

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, LYL0$b;-><init>(LNh2;Lhj;LVH2;Ljn1;LP43;LMa4;Ldq;LZL0;)V

    return-object v0
.end method

.method public bridge synthetic c(LgI4;)LnG2$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, LYL0$a;->i(LgI4;)LYL0$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ldq;)LnG2$a;
    .locals 0

    invoke-virtual {p0, p1}, LYL0$a;->g(Ldq;)LYL0$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lhj;)LnG2$a;
    .locals 0

    invoke-virtual {p0, p1}, LYL0$a;->f(Lhj;)LYL0$a;

    move-result-object p1

    return-object p1
.end method

.method public f(Lhj;)LYL0$a;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhj;

    iput-object p1, p0, LYL0$a;->a:Lhj;

    return-object p0
.end method

.method public g(Ldq;)LYL0$a;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldq;

    iput-object p1, p0, LYL0$a;->c:Ldq;

    return-object p0
.end method

.method public h(LVH2;)LYL0$a;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LVH2;

    iput-object p1, p0, LYL0$a;->b:LVH2;

    return-object p0
.end method

.method public i(LgI4;)LYL0$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public j(Lau5;)LYL0$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

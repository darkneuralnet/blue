.class public final LdS7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lnl8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnl8<",
            "Lz18;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LDV7;


# direct methods
.method public constructor <init>(Lnl8;LDV7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl8<",
            "Lz18;",
            ">;",
            "LDV7;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdS7;->a:Lnl8;

    iput-object p2, p0, LdS7;->b:LDV7;

    return-void
.end method

.method public static a(Landroid/content/Context;)LdS7;
    .locals 2

    new-instance v0, LdS7;

    invoke-static {p0}, LDQ7;->a(Landroid/content/Context;)Lcn8;

    move-result-object v1

    invoke-static {p0, v1}, LTQ7;->a(Landroid/content/Context;Lcn8;)Lnl8;

    move-result-object p0

    invoke-static {}, LRV7;->a()LDV7;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LdS7;-><init>(Lnl8;LDV7;)V

    return-object v0
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;Lz18;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LdS7;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, Lz18;->B()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LR28;

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    invoke-virtual {p0}, LR28;->A()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v0, v1

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;)LMb9;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "LMb9<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LdS7;->a:Lnl8;

    invoke-virtual {v0}, LOs8;->d()LMb9;

    move-result-object v0

    new-instance v1, LjR7;

    invoke-direct {v1, p1, p2}, LjR7;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lva9;->j(LMb9;LYH8;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lz18;)LMb9;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p4}, LEm9;->q()Lbm9;

    move-result-object p4

    check-cast p4, LH08;

    invoke-static {p1, p2}, LdS7;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, LR28;->w()LE28;

    move-result-object p2

    invoke-virtual {p2, p3}, LE28;->A(Ljava/lang/String;)LE28;

    iget-object p3, p0, LdS7;->b:LDV7;

    invoke-interface {p3}, LDV7;->zza()LKr9;

    move-result-object p3

    invoke-virtual {p2, p3}, LE28;->y(LKr9;)LE28;

    invoke-virtual {p2}, Lbm9;->q()LEm9;

    move-result-object p2

    check-cast p2, LR28;

    invoke-virtual {p4, p1, p2}, LH08;->y(Ljava/lang/String;LR28;)LH08;

    invoke-virtual {p4}, Lbm9;->q()LEm9;

    move-result-object p1

    check-cast p1, Lz18;

    invoke-static {p1}, Lva9;->f(Ljava/lang/Object;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LMb9;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "LMb9<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LdS7;->a:Lnl8;

    new-instance v1, LyR7;

    invoke-direct {v1, p0, p1, p2, p3}, LyR7;-><init>(LdS7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LOs8;->i(Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v0

    new-instance v7, LNR7;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p4

    move-object v4, p3

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, LNR7;-><init>(LdS7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, LeP7;->b:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v7, p1}, Lva9;->m(LMb9;LM99;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

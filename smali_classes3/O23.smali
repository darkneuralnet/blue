.class public final LO23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LN23;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaM;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LP23;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lpm6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LP23;",
            ">;",
            "LY94<",
            "Lpm6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO23;->a:LY94;

    iput-object p2, p0, LO23;->b:LY94;

    iput-object p3, p0, LO23;->c:LY94;

    iput-object p4, p0, LO23;->d:LY94;

    iput-object p5, p0, LO23;->e:LY94;

    iput-object p6, p0, LO23;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LO23;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LP23;",
            ">;",
            "LY94<",
            "Lpm6;",
            ">;)",
            "LO23;"
        }
    .end annotation

    new-instance v7, LO23;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LO23;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LaM;Lbn;Le13;Lcom/uber/autodispose/ScopeProvider;LP23;Lpm6;)LN23;
    .locals 8

    new-instance v7, LN23;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LN23;-><init>(LaM;Lbn;Le13;Lcom/uber/autodispose/ScopeProvider;LP23;Lpm6;)V

    return-object v7
.end method


# virtual methods
.method public b()LN23;
    .locals 7

    iget-object v0, p0, LO23;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LaM;

    iget-object v0, p0, LO23;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lbn;

    iget-object v0, p0, LO23;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Le13;

    iget-object v0, p0, LO23;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LO23;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LP23;

    iget-object v0, p0, LO23;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lpm6;

    invoke-static/range {v1 .. v6}, LO23;->c(LaM;Lbn;Le13;Lcom/uber/autodispose/ScopeProvider;LP23;Lpm6;)LN23;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO23;->b()LN23;

    move-result-object v0

    return-object v0
.end method

.class public final LIF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LHF;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJF;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
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
            "LoF;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lom3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LJF;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LoF;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIF;->a:LY94;

    iput-object p2, p0, LIF;->b:LY94;

    iput-object p3, p0, LIF;->c:LY94;

    iput-object p4, p0, LIF;->d:LY94;

    iput-object p5, p0, LIF;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LIF;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LJF;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LoF;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;)",
            "LIF;"
        }
    .end annotation

    new-instance v6, LIF;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LIF;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(LJF;Lcom/uber/autodispose/ScopeProvider;Le13;LoF;Lom3;)LHF;
    .locals 7

    new-instance v6, LHF;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LHF;-><init>(LJF;Lcom/uber/autodispose/ScopeProvider;Le13;LoF;Lom3;)V

    return-object v6
.end method


# virtual methods
.method public b()LHF;
    .locals 5

    iget-object v0, p0, LIF;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJF;

    iget-object v1, p0, LIF;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/uber/autodispose/ScopeProvider;

    iget-object v2, p0, LIF;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    iget-object v3, p0, LIF;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LoF;

    iget-object v4, p0, LIF;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lom3;

    invoke-static {v0, v1, v2, v3, v4}, LIF;->c(LJF;Lcom/uber/autodispose/ScopeProvider;Le13;LoF;Lom3;)LHF;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIF;->b()LHF;

    move-result-object v0

    return-object v0
.end method

.class public final LKx6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lom3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpJ;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LpJ;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKx6;->a:LY94;

    iput-object p2, p0, LKx6;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LKx6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LpJ;",
            ">;)",
            "LKx6;"
        }
    .end annotation

    new-instance v0, LKx6;

    invoke-direct {v0, p0, p1}, LKx6;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lom3;LpJ;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LLx6;Let3;)LHx6;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lom3;",
            "LpJ;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LLx6;",
            "Let3;",
            ")",
            "LHx6;"
        }
    .end annotation

    new-instance v6, LHx6;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LHx6;-><init>(Lom3;LpJ;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LLx6;Let3;)V

    return-object v6
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LLx6;Let3;)LHx6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LLx6;",
            "Let3;",
            ")",
            "LHx6;"
        }
    .end annotation

    iget-object v0, p0, LKx6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lom3;

    iget-object v1, p0, LKx6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LpJ;

    invoke-static {v0, v1, p1, p2, p3}, LKx6;->c(Lom3;LpJ;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LLx6;Let3;)LHx6;

    move-result-object p1

    return-object p1
.end method

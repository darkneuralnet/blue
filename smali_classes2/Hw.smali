.class public final LHw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LKp0;",
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
            "Ldr4;",
            ">;",
            "LY94<",
            "LKp0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHw;->a:LY94;

    iput-object p2, p0, LHw;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LHw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LKp0;",
            ">;)",
            "LHw;"
        }
    .end annotation

    new-instance v0, LHw;

    invoke-direct {v0, p0, p1}, LHw;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Ldr4;LKp0;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LIw;Le13;)LDw;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldr4;",
            "LKp0;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LIw;",
            "Le13;",
            ")",
            "LDw;"
        }
    .end annotation

    new-instance v6, LDw;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LDw;-><init>(Ldr4;LKp0;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LIw;Le13;)V

    return-object v6
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LIw;Le13;)LDw;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LIw;",
            "Le13;",
            ")",
            "LDw;"
        }
    .end annotation

    iget-object v0, p0, LHw;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    iget-object v1, p0, LHw;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKp0;

    invoke-static {v0, v1, p1, p2, p3}, LHw;->c(Ldr4;LKp0;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LIw;Le13;)LDw;

    move-result-object p1

    return-object p1
.end method

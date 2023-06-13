.class public final LoU4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
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
            "Lgl;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoU4;->a:LY94;

    iput-object p2, p0, LoU4;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LoU4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LoU4;"
        }
    .end annotation

    new-instance v0, LoU4;

    invoke-direct {v0, p0, p1}, LoU4;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lgl;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LP75;Le13;)LlU4;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgl;",
            "LTq4;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LP75;",
            "Le13;",
            ")",
            "LlU4;"
        }
    .end annotation

    new-instance v6, LlU4;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LlU4;-><init>(Lgl;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LP75;Le13;)V

    return-object v6
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LP75;Le13;)LlU4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LP75;",
            "Le13;",
            ")",
            "LlU4;"
        }
    .end annotation

    iget-object v0, p0, LoU4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    iget-object v1, p0, LoU4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTq4;

    invoke-static {v0, v1, p1, p2, p3}, LoU4;->c(Lgl;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LP75;Le13;)LlU4;

    move-result-object p1

    return-object p1
.end method

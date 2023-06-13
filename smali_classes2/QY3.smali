.class public final LQY3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LQY3;
    .locals 1

    new-instance v0, LQY3;

    invoke-direct {v0}, LQY3;-><init>()V

    return-object v0
.end method

.method public static c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LRY3;)LNY3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Le13;",
            "LRY3;",
            ")",
            "LNY3;"
        }
    .end annotation

    new-instance v0, LNY3;

    invoke-direct {v0, p0, p1, p2}, LNY3;-><init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LRY3;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LRY3;)LNY3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Le13;",
            "LRY3;",
            ")",
            "LNY3;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, LQY3;->c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LRY3;)LNY3;

    move-result-object p1

    return-object p1
.end method

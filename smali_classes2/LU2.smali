.class public final LLU2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LLU2;
    .locals 1

    new-instance v0, LLU2;

    invoke-direct {v0}, LLU2;-><init>()V

    return-object v0
.end method

.method public static c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;)LIU2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "LIU2;"
        }
    .end annotation

    new-instance v0, LIU2;

    invoke-direct {v0, p0, p1}, LIU2;-><init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;)LIU2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "LIU2;"
        }
    .end annotation

    invoke-static {p1, p2}, LLU2;->c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;)LIU2;

    move-result-object p1

    return-object p1
.end method

.class public final LN65;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lz65;",
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
            "LYR4;",
            ">;",
            "LY94<",
            "Lz65;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN65;->a:LY94;

    iput-object p2, p0, LN65;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LN65;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lz65;",
            ">;)",
            "LN65;"
        }
    .end annotation

    new-instance v0, LN65;

    invoke-direct {v0, p0, p1}, LN65;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LYR4;LY94;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;)LK65;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYR4;",
            "LY94<",
            "Lz65;",
            ">;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Le13;",
            ")",
            "LK65;"
        }
    .end annotation

    new-instance v0, LK65;

    invoke-direct {v0, p0, p1, p2, p3}, LK65;-><init>(LYR4;LY94;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;)LK65;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Le13;",
            ")",
            "LK65;"
        }
    .end annotation

    iget-object v0, p0, LN65;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    iget-object v1, p0, LN65;->b:LY94;

    invoke-static {v0, v1, p1, p2}, LN65;->c(LYR4;LY94;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;)LK65;

    move-result-object p1

    return-object p1
.end method

.class public final LeL5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lde5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lde5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LeL5;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LeL5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lde5;",
            ">;)",
            "LeL5;"
        }
    .end annotation

    new-instance v0, LeL5;

    invoke-direct {v0, p0}, LeL5;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lde5;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LfL5;Le13;)LbL5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde5;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LfL5;",
            "Le13;",
            ")",
            "LbL5;"
        }
    .end annotation

    new-instance v0, LbL5;

    invoke-direct {v0, p0, p1, p2, p3}, LbL5;-><init>(Lde5;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LfL5;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LfL5;Le13;)LbL5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LfL5;",
            "Le13;",
            ")",
            "LbL5;"
        }
    .end annotation

    iget-object v0, p0, LeL5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde5;

    invoke-static {v0, p1, p2, p3}, LeL5;->c(Lde5;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LfL5;Le13;)LbL5;

    move-result-object p1

    return-object p1
.end method

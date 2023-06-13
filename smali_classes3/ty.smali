.class public final Lty;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGt5;",
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
            "LGt5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lty;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lty;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LGt5;",
            ">;)",
            "Lty;"
        }
    .end annotation

    new-instance v0, Lty;

    invoke-direct {v0, p0}, Lty;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LGt5;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Luy;Le13;LDQ3;Z)Lny;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGt5;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Luy;",
            "Le13;",
            "LDQ3;",
            "Z)",
            "Lny;"
        }
    .end annotation

    new-instance v7, Lny;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lny;-><init>(LGt5;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Luy;Le13;LDQ3;Z)V

    return-object v7
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Luy;Le13;LDQ3;Z)Lny;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Luy;",
            "Le13;",
            "LDQ3;",
            "Z)",
            "Lny;"
        }
    .end annotation

    iget-object v0, p0, Lty;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LGt5;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-static/range {v1 .. v6}, Lty;->c(LGt5;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Luy;Le13;LDQ3;Z)Lny;

    move-result-object p1

    return-object p1
.end method

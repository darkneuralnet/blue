.class public final LRH4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LRH4;
    .locals 1

    new-instance v0, LRH4;

    invoke-direct {v0}, LRH4;-><init>()V

    return-object v0
.end method

.method public static c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSH4;Le13;LJy4;)LOH4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LSH4;",
            "Le13;",
            "LJy4;",
            ")",
            "LOH4;"
        }
    .end annotation

    new-instance v0, LOH4;

    invoke-direct {v0, p0, p1, p2, p3}, LOH4;-><init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSH4;Le13;LJy4;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSH4;Le13;LJy4;)LOH4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LSH4;",
            "Le13;",
            "LJy4;",
            ")",
            "LOH4;"
        }
    .end annotation

    invoke-static {p1, p2, p3, p4}, LRH4;->c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSH4;Le13;LJy4;)LOH4;

    move-result-object p1

    return-object p1
.end method

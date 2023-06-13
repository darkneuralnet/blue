.class public final LQH4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPH4;


# instance fields
.field public final a:LRH4;


# direct methods
.method public constructor <init>(LRH4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQH4;->a:LRH4;

    return-void
.end method

.method public static b(LRH4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRH4;",
            ")",
            "LY94<",
            "LPH4;",
            ">;"
        }
    .end annotation

    new-instance v0, LQH4;

    invoke-direct {v0, p0}, LQH4;-><init>(LRH4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSH4;Le13;LJy4;)LOH4;
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

    iget-object v0, p0, LQH4;->a:LRH4;

    invoke-virtual {v0, p1, p2, p3, p4}, LRH4;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSH4;Le13;LJy4;)LOH4;

    move-result-object p1

    return-object p1
.end method

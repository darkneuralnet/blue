.class public final LeR4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LdR4;


# instance fields
.field public final a:LfR4;


# direct methods
.method public constructor <init>(LfR4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LeR4;->a:LfR4;

    return-void
.end method

.method public static b(LfR4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LfR4;",
            ")",
            "LY94<",
            "LdR4;",
            ">;"
        }
    .end annotation

    new-instance v0, LeR4;

    invoke-direct {v0, p0}, LeR4;-><init>(LfR4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LWR4;)LZQ4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Le13;",
            "LWR4;",
            ")",
            "LZQ4;"
        }
    .end annotation

    iget-object v0, p0, LeR4;->a:LfR4;

    invoke-virtual {v0, p1, p2, p3}, LfR4;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LWR4;)LZQ4;

    move-result-object p1

    return-object p1
.end method

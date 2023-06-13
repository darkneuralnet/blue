.class public final LdF3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcF3;


# instance fields
.field public final a:LeF3;


# direct methods
.method public constructor <init>(LeF3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdF3;->a:LeF3;

    return-void
.end method

.method public static b(LeF3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LeF3;",
            ")",
            "LY94<",
            "LcF3;",
            ">;"
        }
    .end annotation

    new-instance v0, LdF3;

    invoke-direct {v0, p0}, LdF3;-><init>(LeF3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LfF3;Le13;)LbF3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LfF3;",
            "Le13;",
            ")",
            "LbF3;"
        }
    .end annotation

    iget-object v0, p0, LdF3;->a:LeF3;

    invoke-virtual {v0, p1, p2, p3}, LeF3;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LfF3;Le13;)LbF3;

    move-result-object p1

    return-object p1
.end method

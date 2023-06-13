.class public final LPY3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOY3;


# instance fields
.field public final a:LQY3;


# direct methods
.method public constructor <init>(LQY3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPY3;->a:LQY3;

    return-void
.end method

.method public static b(LQY3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQY3;",
            ")",
            "LY94<",
            "LOY3;",
            ">;"
        }
    .end annotation

    new-instance v0, LPY3;

    invoke-direct {v0, p0}, LPY3;-><init>(LQY3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LRY3;)LNY3;
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

    iget-object v0, p0, LPY3;->a:LQY3;

    invoke-virtual {v0, p1, p2, p3}, LQY3;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LRY3;)LNY3;

    move-result-object p1

    return-object p1
.end method

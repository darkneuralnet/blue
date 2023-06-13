.class public final LPy2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOy2;


# instance fields
.field public final a:LQy2;


# direct methods
.method public constructor <init>(LQy2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPy2;->a:LQy2;

    return-void
.end method

.method public static b(LQy2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQy2;",
            ")",
            "LY94<",
            "LOy2;",
            ">;"
        }
    .end annotation

    new-instance v0, LPy2;

    invoke-direct {v0, p0}, LPy2;-><init>(LQy2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSy2;Le13;LDQ3;)LNy2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LSy2;",
            "Le13;",
            "LDQ3;",
            ")",
            "LNy2;"
        }
    .end annotation

    iget-object v0, p0, LPy2;->a:LQy2;

    invoke-virtual {v0, p1, p2, p3, p4}, LQy2;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSy2;Le13;LDQ3;)LNy2;

    move-result-object p1

    return-object p1
.end method

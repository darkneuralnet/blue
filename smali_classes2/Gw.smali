.class public final LGw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFw;


# instance fields
.field public final a:LHw;


# direct methods
.method public constructor <init>(LHw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGw;->a:LHw;

    return-void
.end method

.method public static b(LHw;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHw;",
            ")",
            "LY94<",
            "LFw;",
            ">;"
        }
    .end annotation

    new-instance v0, LGw;

    invoke-direct {v0, p0}, LGw;-><init>(LHw;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LIw;Le13;)LDw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LIw;",
            "Le13;",
            ")",
            "LDw;"
        }
    .end annotation

    iget-object v0, p0, LGw;->a:LHw;

    invoke-virtual {v0, p1, p2, p3}, LHw;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LIw;Le13;)LDw;

    move-result-object p1

    return-object p1
.end method

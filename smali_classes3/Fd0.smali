.class public final LFd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEd0;


# instance fields
.field public final a:LGd0;


# direct methods
.method public constructor <init>(LGd0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFd0;->a:LGd0;

    return-void
.end method

.method public static b(LGd0;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGd0;",
            ")",
            "LY94<",
            "LEd0;",
            ">;"
        }
    .end annotation

    new-instance v0, LFd0;

    invoke-direct {v0, p0}, LFd0;-><init>(LGd0;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LXd0;Le13;)LBd0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LXd0;",
            "Le13;",
            ")",
            "LBd0;"
        }
    .end annotation

    iget-object v0, p0, LFd0;->a:LGd0;

    invoke-virtual {v0, p1, p2, p3}, LGd0;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LXd0;Le13;)LBd0;

    move-result-object p1

    return-object p1
.end method

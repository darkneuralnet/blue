.class public final LH03;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF03;


# instance fields
.field public final a:LK03;


# direct methods
.method public constructor <init>(LK03;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH03;->a:LK03;

    return-void
.end method

.method public static b(LK03;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LK03;",
            ")",
            "LY94<",
            "LF03;",
            ">;"
        }
    .end annotation

    new-instance v0, LH03;

    invoke-direct {v0, p0}, LH03;-><init>(LK03;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LN03;)LC03;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LN03;",
            ")",
            "LC03;"
        }
    .end annotation

    iget-object v0, p0, LH03;->a:LK03;

    invoke-virtual {v0, p1, p2}, LK03;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LN03;)LC03;

    move-result-object p1

    return-object p1
.end method

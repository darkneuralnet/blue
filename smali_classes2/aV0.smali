.class public final LaV0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZU0;


# instance fields
.field public final a:LbV0;


# direct methods
.method public constructor <init>(LbV0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LaV0;->a:LbV0;

    return-void
.end method

.method public static b(LbV0;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LbV0;",
            ")",
            "LY94<",
            "LZU0;",
            ">;"
        }
    .end annotation

    new-instance v0, LaV0;

    invoke-direct {v0, p0}, LaV0;-><init>(LbV0;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LeV0;)LWU0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LeV0;",
            ")",
            "LWU0;"
        }
    .end annotation

    iget-object v0, p0, LaV0;->a:LbV0;

    invoke-virtual {v0, p1, p2}, LbV0;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LeV0;)LWU0;

    move-result-object p1

    return-object p1
.end method

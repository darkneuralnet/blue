.class public final LFj3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEj3;


# instance fields
.field public final a:LHj3;


# direct methods
.method public constructor <init>(LHj3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFj3;->a:LHj3;

    return-void
.end method

.method public static b(LHj3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHj3;",
            ")",
            "LY94<",
            "LEj3;",
            ">;"
        }
    .end annotation

    new-instance v0, LFj3;

    invoke-direct {v0, p0}, LFj3;-><init>(LHj3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;)LBj3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LNm3;",
            ")",
            "LBj3;"
        }
    .end annotation

    iget-object v0, p0, LFj3;->a:LHj3;

    invoke-virtual {v0, p1, p2}, LHj3;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;)LBj3;

    move-result-object p1

    return-object p1
.end method

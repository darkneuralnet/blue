.class public final LJx6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIx6;


# instance fields
.field public final a:LKx6;


# direct methods
.method public constructor <init>(LKx6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJx6;->a:LKx6;

    return-void
.end method

.method public static b(LKx6;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKx6;",
            ")",
            "LY94<",
            "LIx6;",
            ">;"
        }
    .end annotation

    new-instance v0, LJx6;

    invoke-direct {v0, p0}, LJx6;-><init>(LKx6;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LLx6;Let3;)LHx6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LLx6;",
            "Let3;",
            ")",
            "LHx6;"
        }
    .end annotation

    iget-object v0, p0, LJx6;->a:LKx6;

    invoke-virtual {v0, p1, p2, p3}, LKx6;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LLx6;Let3;)LHx6;

    move-result-object p1

    return-object p1
.end method

.class public final LQw6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPw6;


# instance fields
.field public final a:LRw6;


# direct methods
.method public constructor <init>(LRw6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQw6;->a:LRw6;

    return-void
.end method

.method public static b(LRw6;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRw6;",
            ")",
            "LY94<",
            "LPw6;",
            ">;"
        }
    .end annotation

    new-instance v0, LQw6;

    invoke-direct {v0, p0}, LQw6;-><init>(LRw6;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LSw6;)LKw6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Le13;",
            "LSw6;",
            ")",
            "LKw6;"
        }
    .end annotation

    iget-object v0, p0, LQw6;->a:LRw6;

    invoke-virtual {v0, p1, p2, p3}, LRw6;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LSw6;)LKw6;

    move-result-object p1

    return-object p1
.end method

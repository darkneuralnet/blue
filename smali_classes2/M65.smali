.class public final LM65;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL65;


# instance fields
.field public final a:LN65;


# direct methods
.method public constructor <init>(LN65;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM65;->a:LN65;

    return-void
.end method

.method public static b(LN65;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LN65;",
            ")",
            "LY94<",
            "LL65;",
            ">;"
        }
    .end annotation

    new-instance v0, LM65;

    invoke-direct {v0, p0}, LM65;-><init>(LN65;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;)LK65;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Le13;",
            ")",
            "LK65;"
        }
    .end annotation

    iget-object v0, p0, LM65;->a:LN65;

    invoke-virtual {v0, p1, p2}, LN65;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;)LK65;

    move-result-object p1

    return-object p1
.end method

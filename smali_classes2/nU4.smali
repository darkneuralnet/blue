.class public final LnU4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmU4;


# instance fields
.field public final a:LoU4;


# direct methods
.method public constructor <init>(LoU4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnU4;->a:LoU4;

    return-void
.end method

.method public static b(LoU4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LoU4;",
            ")",
            "LY94<",
            "LmU4;",
            ">;"
        }
    .end annotation

    new-instance v0, LnU4;

    invoke-direct {v0, p0}, LnU4;-><init>(LoU4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LP75;Le13;)LlU4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LP75;",
            "Le13;",
            ")",
            "LlU4;"
        }
    .end annotation

    iget-object v0, p0, LnU4;->a:LoU4;

    invoke-virtual {v0, p1, p2, p3}, LoU4;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LP75;Le13;)LlU4;

    move-result-object p1

    return-object p1
.end method

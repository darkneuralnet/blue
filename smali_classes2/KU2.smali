.class public final LKU2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJU2;


# instance fields
.field public final a:LLU2;


# direct methods
.method public constructor <init>(LLU2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKU2;->a:LLU2;

    return-void
.end method

.method public static b(LLU2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLU2;",
            ")",
            "LY94<",
            "LJU2;",
            ">;"
        }
    .end annotation

    new-instance v0, LKU2;

    invoke-direct {v0, p0}, LKU2;-><init>(LLU2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;)LIU2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "LIU2;"
        }
    .end annotation

    iget-object v0, p0, LKU2;->a:LLU2;

    invoke-virtual {v0, p1, p2}, LLU2;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;)LIU2;

    move-result-object p1

    return-object p1
.end method

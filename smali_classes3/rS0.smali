.class public final LrS0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LqS0;


# instance fields
.field public final a:LsS0;


# direct methods
.method public constructor <init>(LsS0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrS0;->a:LsS0;

    return-void
.end method

.method public static b(LsS0;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsS0;",
            ")",
            "LY94<",
            "LqS0;",
            ">;"
        }
    .end annotation

    new-instance v0, LrS0;

    invoke-direct {v0, p0}, LrS0;-><init>(LsS0;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LtS0;Le13;)LoS0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LtS0;",
            "Le13;",
            ")",
            "LoS0;"
        }
    .end annotation

    iget-object v0, p0, LrS0;->a:LsS0;

    invoke-virtual {v0, p1, p2, p3}, LsS0;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LtS0;Le13;)LoS0;

    move-result-object p1

    return-object p1
.end method

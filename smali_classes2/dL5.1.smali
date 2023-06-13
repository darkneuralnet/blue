.class public final LdL5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcL5;


# instance fields
.field public final a:LeL5;


# direct methods
.method public constructor <init>(LeL5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdL5;->a:LeL5;

    return-void
.end method

.method public static b(LeL5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LeL5;",
            ")",
            "LY94<",
            "LcL5;",
            ">;"
        }
    .end annotation

    new-instance v0, LdL5;

    invoke-direct {v0, p0}, LdL5;-><init>(LeL5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LfL5;Le13;)LbL5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LfL5;",
            "Le13;",
            ")",
            "LbL5;"
        }
    .end annotation

    iget-object v0, p0, LdL5;->a:LeL5;

    invoke-virtual {v0, p1, p2, p3}, LeL5;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LfL5;Le13;)LbL5;

    move-result-object p1

    return-object p1
.end method

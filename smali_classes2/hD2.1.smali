.class public final LhD2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LgD2;


# instance fields
.field public final a:LiD2;


# direct methods
.method public constructor <init>(LiD2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LhD2;->a:LiD2;

    return-void
.end method

.method public static b(LiD2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LiD2;",
            ")",
            "LY94<",
            "LgD2;",
            ">;"
        }
    .end annotation

    new-instance v0, LhD2;

    invoke-direct {v0, p0}, LhD2;-><init>(LiD2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LjD2;Le13;)LfD2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LjD2;",
            "Le13;",
            ")",
            "LfD2;"
        }
    .end annotation

    iget-object v0, p0, LhD2;->a:LiD2;

    invoke-virtual {v0, p1, p2, p3}, LiD2;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LjD2;Le13;)LfD2;

    move-result-object p1

    return-object p1
.end method

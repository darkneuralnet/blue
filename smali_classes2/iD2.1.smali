.class public final LiD2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lom3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiD2;->a:LY94;

    iput-object p2, p0, LiD2;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LiD2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "LiD2;"
        }
    .end annotation

    new-instance v0, LiD2;

    invoke-direct {v0, p0, p1}, LiD2;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lom3;LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LjD2;Le13;)LfD2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lom3;",
            "LEa;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LjD2;",
            "Le13;",
            ")",
            "LfD2;"
        }
    .end annotation

    new-instance v6, LfD2;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LfD2;-><init>(Lom3;LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LjD2;Le13;)V

    return-object v6
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LjD2;Le13;)LfD2;
    .locals 2
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

    iget-object v0, p0, LiD2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lom3;

    iget-object v1, p0, LiD2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEa;

    invoke-static {v0, v1, p1, p2, p3}, LiD2;->c(Lom3;LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LjD2;Le13;)LfD2;

    move-result-object p1

    return-object p1
.end method

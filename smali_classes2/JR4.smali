.class public final LJR4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lom3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJR4;->a:LY94;

    iput-object p2, p0, LJR4;->b:LY94;

    iput-object p3, p0, LJR4;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LJR4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;)",
            "LJR4;"
        }
    .end annotation

    new-instance v0, LJR4;

    invoke-direct {v0, p0, p1, p2}, LJR4;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LEa;LYR4;Lom3;Lco/bird/android/model/wire/WireBird;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LRR4;Le13;)LGR4;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEa;",
            "LYR4;",
            "Lom3;",
            "Lco/bird/android/model/wire/WireBird;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LRR4;",
            "Le13;",
            ")",
            "LGR4;"
        }
    .end annotation

    new-instance v8, LGR4;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LGR4;-><init>(LEa;LYR4;Lom3;Lco/bird/android/model/wire/WireBird;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LRR4;Le13;)V

    return-object v8
.end method


# virtual methods
.method public b(Lco/bird/android/model/wire/WireBird;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LRR4;Le13;)LGR4;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LRR4;",
            "Le13;",
            ")",
            "LGR4;"
        }
    .end annotation

    iget-object v0, p0, LJR4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LEa;

    iget-object v0, p0, LJR4;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LYR4;

    iget-object v0, p0, LJR4;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lom3;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-static/range {v1 .. v7}, LJR4;->c(LEa;LYR4;Lom3;Lco/bird/android/model/wire/WireBird;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LRR4;Le13;)LGR4;

    move-result-object p1

    return-object p1
.end method

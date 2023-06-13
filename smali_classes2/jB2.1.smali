.class public final LjB2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
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
            "LTq4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjB2;->a:LY94;

    iput-object p2, p0, LjB2;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LjB2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "LjB2;"
        }
    .end annotation

    new-instance v0, LjB2;

    invoke-direct {v0, p0, p1}, LjB2;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTq4;LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LgB2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTq4;",
            "LEa;",
            "LQA2;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lpz2<",
            "Lco/bird/android/model/RentalPlan;",
            ">;",
            "Le13;",
            ")",
            "LgB2;"
        }
    .end annotation

    new-instance v7, LgB2;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LgB2;-><init>(LTq4;LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)V

    return-object v7
.end method


# virtual methods
.method public b(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LgB2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQA2;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lpz2<",
            "Lco/bird/android/model/RentalPlan;",
            ">;",
            "Le13;",
            ")",
            "LgB2;"
        }
    .end annotation

    iget-object v0, p0, LjB2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTq4;

    iget-object v0, p0, LjB2;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LEa;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, LjB2;->c(LTq4;LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LgB2;

    move-result-object p1

    return-object p1
.end method

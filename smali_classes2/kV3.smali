.class public final LkV3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LkV3;
    .locals 1

    new-instance v0, LkV3;

    invoke-direct {v0}, LkV3;-><init>()V

    return-object v0
.end method

.method public static c(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LhV3;
    .locals 1
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
            "LhV3;"
        }
    .end annotation

    new-instance v0, LhV3;

    invoke-direct {v0, p0, p1, p2, p3}, LhV3;-><init>(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LhV3;
    .locals 0
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
            "LhV3;"
        }
    .end annotation

    invoke-static {p1, p2, p3, p4}, LkV3;->c(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LhV3;

    move-result-object p1

    return-object p1
.end method

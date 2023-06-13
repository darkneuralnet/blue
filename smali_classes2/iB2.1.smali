.class public final LiB2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LhB2;


# instance fields
.field public final a:LjB2;


# direct methods
.method public constructor <init>(LjB2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiB2;->a:LjB2;

    return-void
.end method

.method public static b(LjB2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LjB2;",
            ")",
            "LY94<",
            "LhB2;",
            ">;"
        }
    .end annotation

    new-instance v0, LiB2;

    invoke-direct {v0, p0}, LiB2;-><init>(LjB2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LgB2;
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
            "LgB2;"
        }
    .end annotation

    iget-object v0, p0, LiB2;->a:LjB2;

    invoke-virtual {v0, p1, p2, p3, p4}, LjB2;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LgB2;

    move-result-object p1

    return-object p1
.end method

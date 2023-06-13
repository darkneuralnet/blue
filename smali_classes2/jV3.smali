.class public final LjV3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LiV3;


# instance fields
.field public final a:LkV3;


# direct methods
.method public constructor <init>(LkV3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjV3;->a:LkV3;

    return-void
.end method

.method public static b(LkV3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LkV3;",
            ")",
            "LY94<",
            "LiV3;",
            ">;"
        }
    .end annotation

    new-instance v0, LjV3;

    invoke-direct {v0, p0}, LjV3;-><init>(LkV3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LhV3;
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

    iget-object v0, p0, LjV3;->a:LkV3;

    invoke-virtual {v0, p1, p2, p3, p4}, LkV3;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LhV3;

    move-result-object p1

    return-object p1
.end method

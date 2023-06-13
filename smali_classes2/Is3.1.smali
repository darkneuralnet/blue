.class public final LIs3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHs3;


# instance fields
.field public final a:LJs3;


# direct methods
.method public constructor <init>(LJs3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIs3;->a:LJs3;

    return-void
.end method

.method public static b(LJs3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJs3;",
            ")",
            "LY94<",
            "LHs3;",
            ">;"
        }
    .end annotation

    new-instance v0, LIs3;

    invoke-direct {v0, p0}, LIs3;-><init>(LJs3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;LCw3;Le13;Lio/reactivex/Observable;Lio/reactivex/Observable;LAs1;)Lts3;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LNm3;",
            "LCw3;",
            "Le13;",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;",
            "LAs1;",
            ")",
            "Lts3;"
        }
    .end annotation

    move-object v0, p0

    iget-object v1, v0, LIs3;->a:LJs3;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-virtual/range {v1 .. v9}, LJs3;->b(Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;LCw3;Le13;Lio/reactivex/Observable;Lio/reactivex/Observable;LAs1;)Lts3;

    move-result-object v1

    return-object v1
.end method

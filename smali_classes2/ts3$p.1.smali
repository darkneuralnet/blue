.class public final synthetic Lts3$p;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts3;-><init>(Llg6;LaM;LpJ;Llh6;LTq4;Lot5;LyL;Lgl;LuQ3;LEa;LTl3;Ldr4;LaG6;Lsu2;Lom3;LtZ5;LDQ3;Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;LCw3;Le13;Lio/reactivex/Observable;Lio/reactivex/Observable;LAs1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
        "Lio/reactivex/k<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x1

    const-class v3, Lom3;

    const-string v4, "streamOperatorMapNearby"

    const-string v5, "streamOperatorMapNearby(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lio/reactivex/Flowable;"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lio/reactivex/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
            ")",
            "Lio/reactivex/k<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;>;"
        }
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    check-cast v0, Lom3;

    invoke-interface {v0, p1}, Lom3;->s(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;

    invoke-virtual {p0, p1}, Lts3$p;->a(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method

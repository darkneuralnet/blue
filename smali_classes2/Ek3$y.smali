.class public final LEk3$y;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEk3;->Z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;",
        "kotlin.jvm.PlatformType",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "invoke",
        "(Lkotlin/Pair;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LEk3;


# direct methods
.method public constructor <init>(LEk3;)V
    .locals 0

    iput-object p1, p0, LEk3$y;->g:LEk3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LEk3$y;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(LEk3;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;)V
    .locals 0

    invoke-static {p0, p1}, LEk3$y;->c(LEk3;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;)V

    return-void
.end method

.method public static final c(LEk3;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LEk3;->access$getRefreshBountyRelay$p(LEk3;)Lma4;

    move-result-object v0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    invoke-static {p0}, LEk3;->access$getBountyIdRelay$p(LEk3;)Lma4;

    move-result-object p0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->getBountyIds()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p1, p0, LEk3$y;->g:LEk3;

    invoke-static {p1}, LEk3;->access$getOperatorManager$p(LEk3;)Lom3;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->getBountyIds()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v1}, Lom3;->n1(Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    iget-object v1, p0, LEk3$y;->g:LEk3;

    new-instance v2, LJk3;

    invoke-direct {v2, v1, v0}, LJk3;-><init>(LEk3;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;)V

    invoke-virtual {p1, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LEk3$y$a;

    iget-object v1, p0, LEk3$y;->g:LEk3;

    invoke-direct {v0, v1}, LEk3$y$a;-><init>(LEk3;)V

    new-instance v1, LKk3;

    invoke-direct {v1, v0}, LKk3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LEk3$y;->invoke(Lkotlin/Pair;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

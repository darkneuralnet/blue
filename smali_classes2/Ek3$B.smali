.class public final LEk3$B;
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
        "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Unit;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;",
        "action",
        "Lio/reactivex/K;",
        "",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;)Lio/reactivex/K;"
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

    iput-object p1, p0, LEk3$B;->g:LEk3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LEk3;)V
    .locals 0

    invoke-static {p0}, LEk3$B;->c(LEk3;)V

    return-void
.end method

.method public static final c(LEk3;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LEk3;->access$getRefreshBountyRelay$p(LEk3;)Lma4;

    move-result-object p0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, v0}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LEk3$B;->g:LEk3;

    invoke-static {v0}, LEk3;->access$getOperatorManager$p(LEk3;)Lom3;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;->getBountyIds()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lom3;->X0(Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LEk3$B;->g:LEk3;

    new-instance v1, LLk3;

    invoke-direct {v1, v0}, LLk3;-><init>(LEk3;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;

    invoke-virtual {p0, p1}, LEk3$B;->b(Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

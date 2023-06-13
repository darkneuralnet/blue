.class public final LEk3$x;
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
        "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;",
        "action",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;)Lio/reactivex/u;"
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

    iput-object p1, p0, LEk3$x;->g:LEk3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LEk3$x;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;
    .locals 0

    invoke-static {p0, p1}, LEk3$x;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final c(Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;",
            ">;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;

    if-eqz v0, :cond_0

    iget-object v0, p0, LEk3$x;->g:LEk3;

    invoke-static {v0}, LEk3;->access$getUi$p(LEk3;)LPk3;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->getAcceptDestinationConfirmationTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;->getAcceptDestinationConfirmationBody()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, LPk3;->g3(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, LEk3$x$a;->g:LEk3$x$a;

    new-instance v2, LHk3;

    invoke-direct {v2, v1}, LHk3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object v0

    new-instance v1, LEk3$x$b;

    invoke-direct {v1, p1}, LEk3$x$b;-><init>(Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;)V

    new-instance p1, LIk3;

    invoke-direct {p1, v1}, LIk3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$Capture;

    if-eqz v0, :cond_1

    iget-object p1, p0, LEk3$x;->g:LEk3;

    invoke-static {p1}, LEk3;->access$getUi$p(LEk3;)LPk3;

    move-result-object p1

    invoke-interface {p1}, LPk3;->K4()V

    iget-object p1, p0, LEk3$x;->g:LEk3;

    invoke-static {p1}, LEk3;->access$getUi$p(LEk3;)LPk3;

    move-result-object p1

    invoke-interface {p1}, LJj3;->U2()V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$ResolveComplaint;

    if-eqz v0, :cond_2

    iget-object v0, p0, LEk3$x;->g:LEk3;

    invoke-static {v0}, LEk3;->access$getNavigator$p(LEk3;)Le13;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$ResolveComplaint;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$ResolveComplaint;->getComplaintIds()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->v2(Ljava/util/List;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;

    invoke-virtual {p0, p1}, LEk3$x;->c(Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

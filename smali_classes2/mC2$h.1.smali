.class public final LmC2$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmC2;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/DialogResponse;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\t\u001a\n \u0003*\u0004\u0018\u00010\u00060\u00062(\u0010\u0005\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/DialogResponse;",
        "",
        "kotlin.jvm.PlatformType",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "invoke",
        "(Lkotlin/Triple;)Lio/reactivex/h;",
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
.field public final synthetic g:LmC2;


# direct methods
.method public constructor <init>(LmC2;)V
    .locals 0

    iput-object p1, p0, LmC2$h;->g:LmC2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LmC2;)V
    .locals 0

    invoke-static {p0}, LmC2$h;->g(LmC2;)V

    return-void
.end method

.method public static synthetic b(LmC2;)V
    .locals 0

    invoke-static {p0}, LmC2$h;->f(LmC2;)V

    return-void
.end method

.method public static synthetic c(LmC2;)V
    .locals 0

    invoke-static {p0}, LmC2$h;->h(LmC2;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LmC2$h;->invoke$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LmC2$h;->invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LmC2;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LmC2;->access$getAnalyticsManager$p(LmC2;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/RentalEnded;

    invoke-direct {v1}, Lco/bird/android/model/analytics/RentalEnded;-><init>()V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    invoke-static {p0}, LmC2;->access$getNavigator$p(LmC2;)Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->a2()V

    invoke-static {p0}, LmC2;->access$getAnalyticsManager$p(LmC2;)LEa;

    move-result-object p0

    new-instance v0, Lco/bird/android/model/analytics/RentalEnded;

    invoke-direct {v0}, Lco/bird/android/model/analytics/RentalEnded;-><init>()V

    invoke-interface {p0, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    return-void
.end method

.method public static final g(LmC2;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/navigator/LongTermRentalSignUpResult$b;->b:Lco/bird/android/navigator/LongTermRentalSignUpResult$b;

    invoke-static {p0, v0}, LmC2;->access$setActivityResult(LmC2;Lco/bird/android/navigator/LongTermRentalSignUpResult$b;)V

    invoke-static {p0}, LmC2;->access$getAnalyticsManager$p(LmC2;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/RentalCancelled;

    invoke-direct {v1}, Lco/bird/android/model/analytics/RentalCancelled;-><init>()V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    invoke-static {p0}, LmC2;->access$getNavigator$p(LmC2;)Le13;

    move-result-object p0

    invoke-interface {p0}, Le13;->close()V

    return-void
.end method

.method public static final h(LmC2;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LmC2;->access$getUi$p(LmC2;)LxC2;

    move-result-object v0

    sget v1, Lnl4;->long_term_rental_canceled_auto_renew_toast:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lh56$a;->topToast$default(Lh56;ILf56;ILjava/lang/Object;)V

    invoke-static {p0}, LmC2;->access$getAnalyticsManager$p(LmC2;)LEa;

    move-result-object p0

    new-instance v0, Lco/bird/android/model/analytics/RentalEnded;

    invoke-direct {v0}, Lco/bird/android/model/analytics/RentalEnded;-><init>()V

    invoke-interface {p0, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    return-void
.end method

.method public static final invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final invoke$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lkotlin/Triple;)Lio/reactivex/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "+",
            "Lco/bird/android/model/DialogResponse;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v1, "isCancelable"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "rentalId"

    if-eqz v0, :cond_1

    iget-object v0, p0, LmC2$h;->g:LmC2;

    invoke-static {v0}, LmC2;->access$getModel$p(LmC2;)LQA2;

    move-result-object v0

    invoke-virtual {v0}, LQA2;->z()LAG;

    move-result-object v0

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LmC2$h;->g:LmC2;

    new-instance v0, LoC2;

    invoke-direct {v0, p1}, LoC2;-><init>(LmC2;)V

    invoke-static {v0}, Lio/reactivex/c;->G(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LmC2$h;->g:LmC2;

    invoke-static {v0}, LmC2;->access$getManager$p(LmC2;)LCx4;

    move-result-object v0

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LCx4;->e(Ljava/lang/String;)Lio/reactivex/p;

    move-result-object p1

    sget-object v0, LmC2$h$a;->g:LmC2$h$a;

    new-instance v1, LpC2;

    invoke-direct {v1, v0}, LpC2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->A(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LmC2$h;->g:LmC2;

    new-instance v1, LqC2;

    invoke-direct {v1, v0}, LqC2;-><init>(LmC2;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LmC2$h;->g:LmC2;

    invoke-static {v0}, LmC2;->access$getManager$p(LmC2;)LCx4;

    move-result-object v0

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LCx4;->d(Ljava/lang/String;)Lio/reactivex/p;

    move-result-object p1

    sget-object v0, LmC2$h$b;->g:LmC2$h$b;

    new-instance v1, LrC2;

    invoke-direct {v1, v0}, LrC2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->A(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LmC2$h;->g:LmC2;

    new-instance v1, LsC2;

    invoke-direct {v1, v0}, LsC2;-><init>(LmC2;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    const-string v0, "if (isCancelable) {\n    \u2026)\n            }\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LmC2$h;->g:LmC2;

    invoke-static {v0}, LmC2;->access$getUi$p(LmC2;)LxC2;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LmC2$h;->invoke(Lkotlin/Triple;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

.class public final LjG2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMV0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LjG2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002J\u0008\u0010\u0007\u001a\u00020\u0004H\u0002J\u0008\u0010\u0008\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "LjG2;",
        "LMV0;",
        "Landroid/content/Intent;",
        "intent",
        "Lio/reactivex/c;",
        "a",
        "k",
        "i",
        "g",
        "Lgl;",
        "Lgl;",
        "preference",
        "Le13;",
        "b",
        "Le13;",
        "navigator",
        "<init>",
        "(Lgl;Le13;)V",
        "deeplink_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lgl;

.field public final b:Le13;


# direct methods
.method public constructor <init>(Lgl;Le13;)V
    .locals 1

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjG2;->a:Lgl;

    iput-object p2, p0, LjG2;->b:Le13;

    return-void
.end method

.method public static final synthetic access$getPreference$p(LjG2;)Lgl;
    .locals 0

    iget-object p0, p0, LjG2;->a:Lgl;

    return-object p0
.end method

.method public static synthetic b(LjG2;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, LjG2;->j(LjG2;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LjG2;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, LjG2;->n(LjG2;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LjG2;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, LjG2;->h(LjG2;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LjG2;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(LjG2;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, LjG2;->l(LjG2;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h(LjG2;)Lkotlin/Unit;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LjG2;->b:Le13;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Le13;->X0(Z)V

    iget-object p0, p0, LjG2;->b:Le13;

    invoke-interface {p0}, Le13;->close()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(LjG2;)Lkotlin/Unit;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LjG2;->b:Le13;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToOperator$default(Le13;ZLco/bird/android/model/GoOperatorMapDeeplinkParams;Ljava/util/List;ILjava/lang/Object;)V

    iget-object p0, p0, LjG2;->b:Le13;

    invoke-interface {p0}, Le13;->close()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(LjG2;)Lkotlin/Unit;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LjG2;->b:Le13;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToRider$default(Le13;ZZLco/bird/android/model/GoDeepLinkParams;ILjava/lang/Object;)V

    iget-object p0, p0, LjG2;->b:Le13;

    invoke-interface {p0}, Le13;->close()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final n(LjG2;)Lio/reactivex/h;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LjG2;->a:Lgl;

    invoke-virtual {v0}, Lgl;->t0()Lco/bird/android/model/constant/MapMode;

    move-result-object v0

    sget-object v1, LjG2$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 p0, 0x5

    if-eq v0, p0, :cond_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_0
    new-instance p0, Lkotlin/NotImplementedError;

    const/4 v0, 0x0

    invoke-direct {p0, v0, v1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, LjG2;->g()Lio/reactivex/c;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LjG2;->i()Lio/reactivex/c;

    move-result-object p0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LjG2;->k()Lio/reactivex/c;

    move-result-object p0

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, LjG2;->k()Lio/reactivex/c;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Intent;)Lio/reactivex/c;
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, LYf5;->l0(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    new-instance v0, LjG2$b;

    invoke-direct {v0, p0}, LjG2$b;-><init>(LjG2;)V

    new-instance v1, LeG2;

    invoke-direct {v1, v0}, LeG2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->s(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/p;->F()Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LfG2;

    invoke-direct {v0, p0}, LfG2;-><init>(LjG2;)V

    invoke-static {v0}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun navigate(\n \u2026()\n        }\n      })\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final g()Lio/reactivex/c;
    .locals 2

    new-instance v0, LhG2;

    invoke-direct {v0, p0}, LhG2;-><init>(LjG2;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fromCallable {\n    navig\u2026    navigator.close()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final i()Lio/reactivex/c;
    .locals 2

    new-instance v0, LgG2;

    invoke-direct {v0, p0}, LgG2;-><init>(LjG2;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fromCallable {\n    navig\u2026    navigator.close()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final k()Lio/reactivex/c;
    .locals 2

    new-instance v0, LiG2;

    invoke-direct {v0, p0}, LiG2;-><init>(LjG2;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fromCallable {\n    navig\u2026    navigator.close()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

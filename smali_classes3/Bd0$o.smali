.class public final LBd0$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBd0;->b(Landroid/content/Intent;)V
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
        "Lkotlin/Unit;",
        "+",
        "Ljava/util/List<",
        "+",
        "Landroid/net/Uri;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "LHM4<",
        "Lco/bird/api/response/CannotAccessBirdReport;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\t\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0002*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007 \u0002* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0002*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "",
        "Landroid/net/Uri;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "LHM4;",
        "Lco/bird/api/response/CannotAccessBirdReport;",
        "c",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LBd0;


# direct methods
.method public constructor <init>(LBd0;)V
    .locals 0

    iput-object p1, p0, LBd0$o;->g:LBd0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LBd0$o;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LBd0$o;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "LHM4<",
            "Lco/bird/api/response/CannotAccessBirdReport;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, LBd0$o;->g:LBd0;

    invoke-static {v0}, LBd0;->access$getBirdFinderManager$p(LBd0;)LyL;

    move-result-object v0

    invoke-interface {v0}, LyL;->e()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    const-string v0, "imageUris"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LIf6;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    iget-object p1, p0, LBd0$o;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getBirdManager$p(LBd0;)LaM;

    move-result-object v1

    iget-object p1, p0, LBd0$o;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getBird$p(LBd0;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    const-string v0, "bird"

    const/4 v2, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, LBd0$o;->g:LBd0;

    invoke-static {v3}, LBd0;->access$getBird$p(LBd0;)Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v2

    :cond_1
    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getBountyId()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, LBd0$o;->g:LBd0;

    invoke-static {v0}, LBd0;->access$getSelectedIssue$p(LBd0;)Lco/bird/android/model/InaccessibleReason;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "selectedIssue"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v2

    goto :goto_0

    :cond_2
    move-object v4, v0

    :goto_0
    iget-object v0, p0, LBd0$o;->g:LBd0;

    invoke-static {v0}, LBd0;->access$getSource$p(LBd0;)Lco/bird/android/model/InaccessibleReportSource;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, "source"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v2

    goto :goto_1

    :cond_3
    move-object v5, v0

    :goto_1
    iget-object v0, p0, LBd0$o;->g:LBd0;

    invoke-static {v0}, LBd0;->access$getPreference$p(LBd0;)Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->s0()Lco/bird/android/model/UserRoleItem;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/UserRoleItem;->getUserRoleCode()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, LBd0$o;->g:LBd0;

    invoke-static {v0}, LBd0;->access$getBirdDropdownValue$p(LBd0;)Ljava/lang/String;

    move-result-object v10

    iget-object v0, p0, LBd0$o;->g:LBd0;

    invoke-static {v0}, LBd0;->access$getUi$p(LBd0;)LXd0;

    move-result-object v0

    invoke-interface {v0}, LXd0;->U()Ljava/lang/String;

    move-result-object v8

    iget-object v0, p0, LBd0$o;->g:LBd0;

    invoke-static {v0}, LBd0;->access$getPassiveScanTimeInSeconds(LBd0;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    move-object v2, p1

    invoke-interface/range {v1 .. v11}, LaM;->a1(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/InaccessibleReason;Lco/bird/android/model/InaccessibleReportSource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LBd0$o$a;

    iget-object v1, p0, LBd0$o;->g:LBd0;

    invoke-direct {v0, v1}, LBd0$o$a;-><init>(LBd0;)V

    new-instance v1, LCd0;

    invoke-direct {v1, v0}, LCd0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LBd0$o$b;

    iget-object v1, p0, LBd0$o;->g:LBd0;

    invoke-direct {v0, v1}, LBd0$o$b;-><init>(LBd0;)V

    new-instance v1, LDd0;

    invoke-direct {v1, v0}, LDd0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LBd0$o;->c(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

.class public final LBd0$n;
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
        "Lio/reactivex/u<",
        "Lkotlin/Pair<",
        "+",
        "Lkotlin/Unit;",
        "+",
        "Ljava/util/List<",
        "+",
        "Landroid/net/Uri;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a`\u0012\\\u0012Z\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u00000\u00062^\u0010\u0005\u001aZ\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "",
        "Landroid/net/Uri;",
        "it",
        "Lio/reactivex/u;",
        "a",
        "(Lkotlin/Pair;)Lio/reactivex/u;"
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

    iput-object p1, p0, LBd0$n;->g:LBd0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Lio/reactivex/u;
    .locals 14
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
            "Lio/reactivex/u<",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;>;"
        }
    .end annotation

    iget-object p1, p0, LBd0$n;->g:LBd0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LBd0;->access$setReturnedFromBirdScan$p(LBd0;Z)V

    iget-object p1, p0, LBd0$n;->g:LBd0;

    invoke-static {p1, v0}, LBd0;->access$setBirdFoundInBirdScan$p(LBd0;Z)V

    iget-object p1, p0, LBd0$n;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getUi$p(LBd0;)LXd0;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v0, v1, v2}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    iget-object p1, p0, LBd0$n;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getUi$p(LBd0;)LXd0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-interface {p1, v1}, LXd0;->p(Z)V

    iget-object p1, p0, LBd0$n;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getNavigator$p(LBd0;)Le13;

    move-result-object v3

    const/4 v4, 0x1

    iget-object p1, p0, LBd0$n;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getBird$p(LBd0;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "bird"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object v5, p1

    :goto_0
    iget-object p1, p0, LBd0$n;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getMarkMissingBirdFinderRequiredIntervalSeconds(LBd0;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object p1, p0, LBd0$n;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getUi$p(LBd0;)LXd0;

    move-result-object p1

    sget v1, Lnl4;->cannot_access_nearby_bird_submit_report_cta:I

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1, v1, v0}, LXd0;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xe0

    const/4 v13, 0x0

    invoke-static/range {v3 .. v13}, Le13$a;->goToNearbyBirds$default(Le13;ZLco/bird/android/model/wire/WireBird;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroidx/fragment/app/Fragment;ILjava/lang/Object;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    const-string v0, "empty()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LBd0$n;->a(Lkotlin/Pair;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

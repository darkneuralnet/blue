.class public final LG46$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG46;->refresh()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireBird;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/BirdSummaryBody;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireHydratedRoute;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00ca\u0001\u0012^\u0008\u0001\u0012Z\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003 \u0005*d\u0012^\u0008\u0001\u0012Z\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/BirdSummaryBody;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/wire/WireHydratedRoute;",
        "a",
        "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LG46;


# direct methods
.method public constructor <init>(LG46;)V
    .locals 0

    iput-object p1, p0, LG46$d;->g:LG46;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/BirdSummaryBody;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireHydratedRoute;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/reactivex/rxkotlin/g;->a:Lio/reactivex/rxkotlin/g;

    iget-object v1, p0, LG46$d;->g:LG46;

    invoke-static {v1}, LG46;->access$getBirdManager$p(LG46;)LaM;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LaM;->o(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v2

    iget-object v3, p0, LG46$d;->g:LG46;

    invoke-static {v3}, LG46;->access$getSummarySubject$p(LG46;)Lio/reactivex/subjects/a;

    move-result-object v3

    invoke-static {v1, v2, v3}, LG46;->access$doOnRefreshError(LG46;Lio/reactivex/F;Lio/reactivex/Observable;)Lio/reactivex/F;

    move-result-object v1

    iget-object v2, p0, LG46$d;->g:LG46;

    invoke-static {v2}, LG46;->access$getRoutingManager$p(LG46;)Ltc5;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, p1}, Ltc5;->b(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    iget-object v3, p0, LG46$d;->g:LG46;

    invoke-static {v3}, LG46;->access$getTimelineSubject$p(LG46;)Lio/reactivex/subjects/a;

    move-result-object v3

    invoke-static {v2, p1, v3}, LG46;->access$doOnRefreshError(LG46;Lio/reactivex/F;Lio/reactivex/Observable;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/reactivex/rxkotlin/g;->a(Lio/reactivex/K;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0, p1}, LG46$d;->a(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

.class public final Ldb5$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldb5;->Xl(Lco/bird/android/model/wire/WireRiderTutorialStep;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LrD2;",
        "Lio/reactivex/B<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Long;",
        "+",
        "LrD2;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\u0010\u0006\u001a\u009a\u0001\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003 \u0005*L\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LrD2;",
        "composition",
        "Lio/reactivex/B;",
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(LrD2;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireRiderTutorialStep;

.field public final synthetic h:Ldb5;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireRiderTutorialStep;Ldb5;)V
    .locals 0

    iput-object p1, p0, Ldb5$e;->g:Lco/bird/android/model/wire/WireRiderTutorialStep;

    iput-object p2, p0, Ldb5$e;->h:Ldb5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LrD2;)Lio/reactivex/B;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LrD2;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/lang/Long;",
            "LrD2;",
            ">;>;"
        }
    .end annotation

    const-string v0, "composition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x3e8

    int-to-float v0, v0

    iget-object v1, p0, Ldb5$e;->g:Lco/bird/android/model/wire/WireRiderTutorialStep;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRiderTutorialStep;->getDelayLoopStart()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-long v0, v0

    invoke-virtual {p1}, LrD2;->d()F

    move-result v2

    iget-object v3, p0, Ldb5$e;->g:Lco/bird/android/model/wire/WireRiderTutorialStep;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRiderTutorialStep;->getProgressLoopEnd()F

    move-result v3

    iget-object v4, p0, Ldb5$e;->g:Lco/bird/android/model/wire/WireRiderTutorialStep;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireRiderTutorialStep;->getProgressStart()F

    move-result v4

    sub-float/2addr v3, v4

    mul-float/2addr v2, v3

    float-to-long v2, v2

    invoke-virtual {p1}, LrD2;->d()F

    move-result v4

    iget-object v5, p0, Ldb5$e;->g:Lco/bird/android/model/wire/WireRiderTutorialStep;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireRiderTutorialStep;->getProgressLoopEnd()F

    move-result v5

    iget-object v6, p0, Ldb5$e;->g:Lco/bird/android/model/wire/WireRiderTutorialStep;

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireRiderTutorialStep;->getProgressLoopStart()F

    move-result v6

    sub-float/2addr v5, v6

    mul-float/2addr v4, v5

    float-to-long v4, v4

    sget-object v6, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    add-long/2addr v2, v0

    add-long/2addr v4, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v4, v5, v0}, Lio/reactivex/Observable;->interval(JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "interval(duration + loop\u2026s, TimeUnit.MILLISECONDS)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ldb5$e;->h:Ldb5;

    iget-object v2, p0, Ldb5$e;->g:Lco/bird/android/model/wire/WireRiderTutorialStep;

    invoke-static {v1, p1, v2}, Ldb5;->access$loopLottieComposition(Ldb5;LrD2;Lco/bird/android/model/wire/WireRiderTutorialStep;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object p1

    const-string v1, "loopLottieComposition(co\u2026orialStep).toObservable()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v0, p1}, Lio/reactivex/rxkotlin/e;->a(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LrD2;

    invoke-virtual {p0, p1}, Ldb5$e;->a(LrD2;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method

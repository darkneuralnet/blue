.class public final Lco/bird/android/feature/birdplus/v1/details/a$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/birdplus/v1/details/a;->D(Lco/bird/android/feature/birdplus/v1/details/b;)V
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
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;>;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "Lco/bird/android/buava/Optional;",
        "",
        "kotlin.jvm.PlatformType",
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
.field public final synthetic g:Lco/bird/android/feature/birdplus/v1/details/b;

.field public final synthetic h:Lco/bird/android/feature/birdplus/v1/details/a;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/birdplus/v1/details/b;Lco/bird/android/feature/birdplus/v1/details/a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h;->g:Lco/bird/android/feature/birdplus/v1/details/b;

    iput-object p2, p0, Lco/bird/android/feature/birdplus/v1/details/a$h;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$h;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$h;->invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$h;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static final invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/BirdPlusView;

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h;->g:Lco/bird/android/feature/birdplus/v1/details/b;

    invoke-interface {v0}, Lco/bird/android/feature/birdplus/v1/details/b;->e0()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "renderer.subscribeClicks\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getPaymentManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LAM3;

    move-result-object v1

    invoke-interface {v1}, LAM3;->e()LZ84;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$h;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v2}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getGooglePayManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LiD1;

    move-result-object v2

    invoke-interface {v2}, LiD1;->g()Lio/reactivex/F;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object v2

    const-string v3, "googlePayManager.googlePayReady().toObservable()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lio/reactivex/rxkotlin/f;->b(Lio/reactivex/Observable;Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/birdplus/v1/details/a$h$a;

    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$h;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-direct {v1, v2}, Lco/bird/android/feature/birdplus/v1/details/a$h$a;-><init>(Lco/bird/android/feature/birdplus/v1/details/a;)V

    new-instance v2, LbQ;

    invoke-direct {v2, v1}, LbQ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/birdplus/v1/details/a$h$b;

    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$h;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-direct {v1, v2, p1}, Lco/bird/android/feature/birdplus/v1/details/a$h$b;-><init>(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)V

    new-instance p1, LcQ;

    invoke-direct {p1, v1}, LcQ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/birdplus/v1/details/a$h$c;

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-direct {v0, v1}, Lco/bird/android/feature/birdplus/v1/details/a$h$c;-><init>(Lco/bird/android/feature/birdplus/v1/details/a;)V

    new-instance v1, LdQ;

    invoke-direct {v1, v0}, LdQ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->T()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$h;->invoke(Lkotlin/Pair;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
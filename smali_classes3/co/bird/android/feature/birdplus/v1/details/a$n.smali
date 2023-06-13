.class public final Lco/bird/android/feature/birdplus/v1/details/a$n;
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
        "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;",
        "Lio/reactivex/B<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0010\u0008\u001a\u00aa\u0001\u0012N\u0008\u0001\u0012J\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003 \u0007*T\u0012N\u0008\u0001\u0012J\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;",
        "identifier",
        "Lio/reactivex/B;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "Lco/bird/android/buava/Optional;",
        "",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/birdplus/v1/details/a;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/birdplus/v1/details/a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$n;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$n;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$n;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$n;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;)Lio/reactivex/B;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    instance-of v1, p1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$d;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$n;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getBirdPlusManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LJQ;

    move-result-object v1

    invoke-interface {p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, LJQ;->d0(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$e;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$n;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getBirdPlusManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LJQ;

    move-result-object v1

    invoke-interface {p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, LJQ;->e0(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$n;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getBirdPlusManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LJQ;

    move-result-object v1

    invoke-interface {p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, LJQ;->c0(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v1

    :goto_0
    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$n;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v2}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getBirdPlusManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LJQ;

    move-result-object v2

    invoke-interface {v2}, LJQ;->b0()LZ84;

    move-result-object v2

    sget-object v3, Lco/bird/android/feature/birdplus/v1/details/a$n$a;->g:Lco/bird/android/feature/birdplus/v1/details/a$n$a;

    new-instance v4, LqQ;

    invoke-direct {v4, v3}, LqQ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v2

    sget-object v3, Lco/bird/android/feature/birdplus/v1/details/a$n$b;->g:Lco/bird/android/feature/birdplus/v1/details/a$n$b;

    new-instance v4, LrQ;

    invoke-direct {v4, v3}, LrQ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v2

    const-string v3, "birdPlusManager.birdPlus\u2026  .distinctUntilChanged()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lio/reactivex/rxkotlin/e;->a(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/birdplus/v1/details/a$n$c;

    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$n;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-direct {v1, v2, p1}, Lco/bird/android/feature/birdplus/v1/details/a$n$c;-><init>(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;)V

    new-instance p1, LsQ;

    invoke-direct {p1, v1}, LsQ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$n;->d(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method

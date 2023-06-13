.class public final LbI4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LbI4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(LbI4;Ljava/lang/Throwable;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, LbI4$a;->n(LbI4;Ljava/lang/Throwable;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LbI4;Ljava/lang/Throwable;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LbI4$a;->k(LbI4;Ljava/lang/Throwable;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LbI4;Ljava/lang/Throwable;)Lna4;
    .locals 0

    invoke-static {p0, p1}, LbI4$a;->l(LbI4;Ljava/lang/Throwable;)Lna4;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LbI4;Ljava/lang/Throwable;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LbI4$a;->m(LbI4;Ljava/lang/Throwable;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LbI4$a;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static f(LbI4;Lio/reactivex/c;)Lio/reactivex/c;
    .locals 1

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LbI4$a$a;

    invoke-direct {v0, p0}, LbI4$a$a;-><init>(LbI4;)V

    new-instance p0, LZH4;

    invoke-direct {p0, v0}, LZH4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0}, Lio/reactivex/c;->S(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p0

    const-string p1, "fun Completable.clearOnE\u2026table.error(t))\n    }\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static g(LbI4;Lio/reactivex/k;)Lio/reactivex/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LbI4;",
            "Lio/reactivex/k<",
            "TT;>;)",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LXH4;

    invoke-direct {v0, p0}, LXH4;-><init>(LbI4;)V

    invoke-virtual {p1, v0}, Lio/reactivex/k;->A0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p0

    const-string p1, "this.onErrorResumeNext(F\u2026Flowable.error(t))\n    })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static h(LbI4;Lio/reactivex/p;)Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LbI4;",
            "Lio/reactivex/p<",
            "TT;>;)",
            "Lio/reactivex/p<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LaI4;

    invoke-direct {v0, p0}, LaI4;-><init>(LbI4;)V

    invoke-virtual {p1, v0}, Lio/reactivex/p;->M(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p0

    const-string p1, "this.onErrorResumeNext(F\u2026en(Maybe.error(t))\n    })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static i(LbI4;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LbI4;",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYH4;

    invoke-direct {v0, p0}, LYH4;-><init>(LbI4;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p0

    const-string p1, "this.onErrorResumeNext(F\u2026servable.error(t))\n    })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static j(LbI4;Lio/reactivex/F;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LbI4;",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWH4;

    invoke-direct {v0, p0}, LWH4;-><init>(LbI4;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->P(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p0

    const-string p1, "this.onErrorResumeNext(F\u2026n(Single.error(t))\n    })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static k(LbI4;Ljava/lang/Throwable;)Lio/reactivex/B;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    invoke-interface {p0}, LbI4;->clear()Lio/reactivex/c;

    move-result-object p0

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static l(LbI4;Ljava/lang/Throwable;)Lna4;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    invoke-interface {p0}, LbI4;->clear()Lio/reactivex/c;

    move-result-object p0

    invoke-static {p1}, Lio/reactivex/k;->Q(Ljava/lang/Throwable;)Lio/reactivex/k;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/c;->j(Lna4;)Lio/reactivex/k;

    move-result-object p0

    return-object p0
.end method

.method public static m(LbI4;Ljava/lang/Throwable;)Lio/reactivex/K;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    invoke-interface {p0}, LbI4;->clear()Lio/reactivex/c;

    move-result-object p0

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static n(LbI4;Ljava/lang/Throwable;)Lio/reactivex/u;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    invoke-interface {p0}, LbI4;->clear()Lio/reactivex/c;

    move-result-object p0

    invoke-static {p1}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/c;->k(Lio/reactivex/u;)Lio/reactivex/p;

    move-result-object p0

    return-object p0
.end method

.method public static o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

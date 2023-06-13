.class public final Lbr4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbr4;
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
.method public static synthetic a(Lio/reactivex/c;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, Lbr4$a;->f(Lio/reactivex/c;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0}, Lbr4$a;->j(Lio/reactivex/Observable;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lio/reactivex/F;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0}, Lbr4$a;->l(Lio/reactivex/F;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lio/reactivex/p;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0}, Lbr4$a;->h(Lio/reactivex/p;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lbr4;)Lio/reactivex/i;
    .locals 0

    new-instance p0, LYq4;

    invoke-direct {p0}, LYq4;-><init>()V

    return-object p0
.end method

.method public static f(Lio/reactivex/c;)Lio/reactivex/h;
    .locals 1

    const-string v0, "completable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lbr4;)Lio/reactivex/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbr4;",
            ")",
            "Lio/reactivex/v<",
            "TT;TT;>;"
        }
    .end annotation

    new-instance p0, Lar4;

    invoke-direct {p0}, Lar4;-><init>()V

    return-object p0
.end method

.method public static h(Lio/reactivex/p;)Lio/reactivex/u;
    .locals 1

    const-string v0, "observable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/p;->T(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object p0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/p;->I(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lbr4;)Lio/reactivex/C;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbr4;",
            ")",
            "Lio/reactivex/C<",
            "TT;TT;>;"
        }
    .end annotation

    new-instance p0, LXq4;

    invoke-direct {p0}, LXq4;-><init>()V

    return-object p0
.end method

.method public static j(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 1

    const-string v0, "observable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lbr4;)Lio/reactivex/L;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbr4;",
            ")",
            "Lio/reactivex/L<",
            "TT;TT;>;"
        }
    .end annotation

    new-instance p0, LZq4;

    invoke-direct {p0}, LZq4;-><init>()V

    return-object p0
.end method

.method public static l(Lio/reactivex/F;)Lio/reactivex/K;
    .locals 1

    const-string v0, "observable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static m(Lbr4;Lio/reactivex/c;)Lio/reactivex/c;
    .locals 1

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lbr4;->c()Lio/reactivex/i;

    move-result-object p0

    invoke-virtual {p1, p0}, Lio/reactivex/c;->q(Lio/reactivex/i;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static n(Lbr4;Lio/reactivex/p;)Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbr4;",
            "Lio/reactivex/p<",
            "TT;>;)",
            "Lio/reactivex/p<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lbr4;->m()Lio/reactivex/v;

    move-result-object p0

    invoke-virtual {p1, p0}, Lio/reactivex/p;->g(Lio/reactivex/v;)Lio/reactivex/p;

    move-result-object p0

    return-object p0
.end method

.method public static o(Lbr4;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbr4;",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lbr4;->o()Lio/reactivex/C;

    move-result-object p0

    invoke-virtual {p1, p0}, Lio/reactivex/Observable;->compose(Lio/reactivex/C;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static p(Lbr4;Lio/reactivex/F;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbr4;",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lbr4;->s()Lio/reactivex/L;

    move-result-object p0

    invoke-virtual {p1, p0}, Lio/reactivex/F;->i(Lio/reactivex/L;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

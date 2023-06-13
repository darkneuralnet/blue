.class public final Low0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llw0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J.\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016J&\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u000b0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J/\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0012\u0010\u0011\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\u0010\"\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Low0;",
        "Llw0;",
        "Lio/reactivex/c;",
        "g",
        "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
        "context",
        "",
        "birdModel",
        "",
        "filterSeen",
        "Lio/reactivex/F;",
        "",
        "Lco/bird/android/model/persistence/Tutorial;",
        "i0",
        "Lio/reactivex/p;",
        "m0",
        "",
        "tutorialIds",
        "l0",
        "([Ljava/lang/String;)Lio/reactivex/F;",
        "tutorialId",
        "B",
        "LGw0;",
        "a",
        "LGw0;",
        "repo",
        "<init>",
        "(LGw0;)V",
        "configurable-tutorial_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LGw0;


# direct methods
.method public constructor <init>(LGw0;)V
    .locals 1

    const-string v0, "repo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Low0;->a:LGw0;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Low0;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Low0;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public B(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    const-string v0, "tutorialId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Low0;->a:LGw0;

    invoke-interface {v0, p1}, LGw0;->B(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "repo.incrementTutorialSe\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public g()Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Low0;->a:LGw0;

    invoke-interface {v0}, LGw0;->g()Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "repo.fetchTutorials()\n  \u2026scribeOn(Schedulers.io())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public i0(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;Z)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
            "Ljava/lang/String;",
            "Z)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;>;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Low0;->a:LGw0;

    invoke-interface {v0, p1, p2, p3}, LGw0;->i0(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;Z)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "repo.getTutorialsByConte\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public j0(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Llw0$a;->d(Llw0;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public k0(J)Lio/reactivex/c;
    .locals 0

    invoke-static {p0, p1, p2}, Llw0$a;->b(Llw0;J)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public varargs l0([Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;>;"
        }
    .end annotation

    const-string v0, "tutorialIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Low0;->a:LGw0;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-interface {v0, p1}, LGw0;->W0([Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "repo.getTutorialsById(*t\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public m0(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;)Lio/reactivex/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/p<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Low0;->a:LGw0;

    const/4 v1, 0x1

    invoke-interface {v0, p1, p2, v1}, LGw0;->i0(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;Z)Lio/reactivex/F;

    move-result-object p1

    sget-object p2, Low0$a;->g:Low0$a;

    new-instance v0, Lmw0;

    invoke-direct {v0, p2}, Lmw0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    sget-object p2, Low0$b;->g:Low0$b;

    new-instance v0, Lnw0;

    invoke-direct {v0, p2}, Lnw0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/p;->T(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object p1

    const-string p2, "repo.getTutorialsByConte\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public n0(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;Z)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
            "Ljava/lang/String;",
            "Z)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Llw0$a;->e(Llw0;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;Z)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public o0(Le13;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;ZLjava/lang/Integer;Z)Z
    .locals 0

    invoke-static/range {p0 .. p6}, Llw0$a;->c(Llw0;Le13;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;ZLjava/lang/Integer;Z)Z

    move-result p1

    return p1
.end method

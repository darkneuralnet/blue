.class public final LIw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGw0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIw0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u0016B\u0019\u0008\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u00a2\u0006\u0004\u0008!\u0010\"J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J.\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016J/\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0012\u0010\u000f\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\u000e\"\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0008\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006$"
    }
    d2 = {
        "LIw0;",
        "LGw0;",
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
        "",
        "tutorialIds",
        "W0",
        "([Ljava/lang/String;)Lio/reactivex/F;",
        "id",
        "B",
        "clear",
        "LEa6;",
        "a",
        "LEa6;",
        "tutorialClient",
        "LRv0;",
        "b",
        "LRv0;",
        "configurableTutorialDao",
        "Lorg/joda/time/DateTime;",
        "c",
        "Lorg/joda/time/DateTime;",
        "lastTutorialRefreshTime",
        "<init>",
        "(LEa6;LRv0;)V",
        "d",
        "co.bird.android.repository.configurable-tutorial"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final d:LIw0$a;


# instance fields
.field public final a:LEa6;

.field public final b:LRv0;

.field public c:Lorg/joda/time/DateTime;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LIw0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LIw0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LIw0;->d:LIw0$a;

    return-void
.end method

.method public constructor <init>(LEa6;LRv0;)V
    .locals 1

    const-string v0, "tutorialClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurableTutorialDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIw0;->a:LEa6;

    iput-object p2, p0, LIw0;->b:LRv0;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lorg/joda/time/DateTime;->minusDays(I)Lorg/joda/time/DateTime;

    move-result-object p1

    const-string p2, "now().minusDays(1)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LIw0;->c:Lorg/joda/time/DateTime;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LIw0;->M1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final M1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getConfigurableTutorialDao$p(LIw0;)LRv0;
    .locals 0

    iget-object p0, p0, LIw0;->b:LRv0;

    return-object p0
.end method


# virtual methods
.method public B(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIw0;->b:LRv0;

    invoke-virtual {v0, p1}, LRv0;->g(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p0, p1}, LIw0;->K1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public K1(Lio/reactivex/c;)Lio/reactivex/c;
    .locals 0

    invoke-static {p0, p1}, LGw0$a;->a(LGw0;Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public L1(Lio/reactivex/F;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LGw0$a;->b(LGw0;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public varargs W0([Ljava/lang/String;)Lio/reactivex/F;
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

    iget-object v0, p0, LIw0;->b:LRv0;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {v0, p1}, LRv0;->f([Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LIw0;->L1(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public clear()Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, LIw0;->b:LRv0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, LRv0;->a([Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public g()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, LIw0;->c:Lorg/joda/time/DateTime;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lorg/joda/time/DateTime;->plusMinutes(I)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "{\n      Completable.complete()\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LIw0;->a:LEa6;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v1, v2}, LEa6$a;->getTutorials$default(LEa6;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LIw0$b;

    invoke-direct {v1, p0}, LIw0$b;-><init>(LIw0;)V

    new-instance v2, LHw0;

    invoke-direct {v2, v1}, LHw0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "override fun fetchTutori\u2026.clearOnError()\n    }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LIw0;->K1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object v0

    :goto_0
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

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    iget-object p3, p0, LIw0;->b:LRv0;

    invoke-virtual {p3, p1, p2}, LRv0;->d(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-object p3, p0, LIw0;->b:LRv0;

    invoke-virtual {p3, p1, p2}, LRv0;->c(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    iget-object p2, p0, LIw0;->b:LRv0;

    invoke-virtual {p2, p1}, LRv0;->e(Lco/bird/android/model/constant/ConfigurableTutorialContext;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p2, p0, LIw0;->b:LRv0;

    invoke-virtual {p2, p1}, LRv0;->b(Lco/bird/android/model/constant/ConfigurableTutorialContext;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, LIw0;->L1(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

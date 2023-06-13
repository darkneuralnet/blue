.class public final LOR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMR;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "LOR;",
        "LMR;",
        "",
        "birdId",
        "Lio/reactivex/c;",
        "R",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/persistence/BirdRatingHistory;",
        "D",
        "clear",
        "LTk3;",
        "a",
        "LTk3;",
        "operatorClient",
        "LCR;",
        "b",
        "LCR;",
        "birdRatingHistoryDao",
        "<init>",
        "(LTk3;LCR;)V",
        "co.bird.android.repository.bird-rating-history"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LTk3;

.field public final b:LCR;


# direct methods
.method public constructor <init>(LTk3;LCR;)V
    .locals 1

    const-string v0, "operatorClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdRatingHistoryDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOR;->a:LTk3;

    iput-object p2, p0, LOR;->b:LCR;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LOR;->L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getBirdRatingHistoryDao$p(LOR;)LCR;
    .locals 0

    iget-object p0, p0, LOR;->b:LCR;

    return-object p0
.end method


# virtual methods
.method public D(Ljava/lang/String;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/persistence/BirdRatingHistory;",
            ">;"
        }
    .end annotation

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LOR;->b:LCR;

    invoke-virtual {v0, p1}, LCR;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LOR;->K1(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public K1(Lio/reactivex/F;)Lio/reactivex/F;
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

    invoke-static {p0, p1}, LMR$a;->a(LMR;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public R(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LOR;->a:LTk3;

    invoke-interface {v0, p1}, LTk3;->y(Ljava/lang/String;)Lio/reactivex/p;

    move-result-object v0

    new-instance v1, LOR$a;

    invoke-direct {v1, p0, p1}, LOR$a;-><init>(LOR;Ljava/lang/String;)V

    new-instance p1, LNR;

    invoke-direct {p1, v1}, LNR;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/p;->A(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun fetchBirdRa\u2026Id)\n        )\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public clear()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, LOR;->b:LCR;

    invoke-virtual {v0}, LCR;->b()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

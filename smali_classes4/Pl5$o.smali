.class public final LPl5$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPl5;->C()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LTk5;",
        "Lio/reactivex/u<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        "+",
        "LTk5;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aZ\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LTk5;",
        "result",
        "Lio/reactivex/u;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LTk5;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LPl5;


# direct methods
.method public constructor <init>(LPl5;)V
    .locals 0

    iput-object p1, p0, LPl5$o;->g:LPl5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LTk5;)Lio/reactivex/u;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTk5;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireBird;",
            "LTk5;",
            ">;>;"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LUk5;->l(LTk5;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LPl5$o;->g:LPl5;

    invoke-static {v0}, LPl5;->access$getBirdManager$p(LPl5;)LaM;

    move-result-object v1

    sget-object v3, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    sget-object v4, Lco/bird/android/model/constant/ScanIntention;->QUICKSTART:Lco/bird/android/model/constant/ScanIntention;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v1 .. v6}, LaM;->W0(Ljava/lang/String;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;ZLjava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0}, Lag5;->k(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LPl5$o$a;

    invoke-direct {v1, p1}, LPl5$o$a;-><init>(LTk5;)V

    invoke-static {v0, v1}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/p;->J()Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTk5;

    invoke-virtual {p0, p1}, LPl5$o;->a(LTk5;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

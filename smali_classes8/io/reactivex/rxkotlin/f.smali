.class public final Lio/reactivex/rxkotlin/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aF\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0003\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H\u0007\u001ad\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000c0\u0003\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0008*\u00020\u0000\"\u0008\u0008\u0002\u0010\t*\u00020\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0004H\u0007\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "T",
        "U",
        "Lio/reactivex/Observable;",
        "Lio/reactivex/B;",
        "other",
        "Lkotlin/Pair;",
        "a",
        "T1",
        "T2",
        "o1",
        "o2",
        "Lkotlin/Triple;",
        "b",
        "rxkotlin"
    }
    k = 0x2
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;",
            "Lio/reactivex/B<",
            "TU;>;)",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "TT;TU;>;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxkotlin/f$a;->a:Lio/reactivex/rxkotlin/f$a;

    invoke-virtual {p0, p1, v0}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p0

    const-string p1, "withLatestFrom(other, Bi\u2026n { t, u -> Pair(t, u) })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(Lio/reactivex/Observable;Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;",
            "Lio/reactivex/B<",
            "TT1;>;",
            "Lio/reactivex/B<",
            "TT2;>;)",
            "Lio/reactivex/Observable<",
            "Lkotlin/Triple<",
            "TT;TT1;TT2;>;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxkotlin/f$b;->a:Lio/reactivex/rxkotlin/f$b;

    invoke-virtual {p0, p1, p2, v0}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/h;)Lio/reactivex/Observable;

    move-result-object p0

    const-string p1, "withLatestFrom(o1, o2, F\u20262 -> Triple(t, t1, t2) })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

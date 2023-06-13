.class public final Lio/reactivex/rxkotlin/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aF\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0003\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "T",
        "U",
        "Lio/reactivex/k;",
        "Lna4;",
        "other",
        "Lkotlin/Pair;",
        "a",
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
.method public static final a(Lio/reactivex/k;Lna4;)Lio/reactivex/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lna4<",
            "TU;>;)",
            "Lio/reactivex/k<",
            "Lkotlin/Pair<",
            "TT;TU;>;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxkotlin/b$a;->a:Lio/reactivex/rxkotlin/b$a;

    invoke-virtual {p0, p1, v0}, Lio/reactivex/k;->t1(Lna4;Lio/reactivex/functions/c;)Lio/reactivex/k;

    move-result-object p0

    const-string p1, "withLatestFrom(other, Bi\u2026n { t, u -> Pair(t, u) })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

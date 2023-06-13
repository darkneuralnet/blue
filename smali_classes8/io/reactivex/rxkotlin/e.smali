.class public final Lio/reactivex/rxkotlin/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJJ\u0010\u0008\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0004\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0001\"\u0008\u0008\u0001\u0010\u0003*\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H\u0007Jh\u0010\u000c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b0\u0004\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0001\"\u0008\u0008\u0001\u0010\u0003*\u00020\u0001\"\u0008\u0008\u0002\u0010\t*\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0004H\u0007JJ\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0004\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0001\"\u0008\u0008\u0001\u0010\u0003*\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/reactivex/rxkotlin/e;",
        "",
        "T1",
        "T2",
        "Lio/reactivex/Observable;",
        "source1",
        "source2",
        "Lkotlin/Pair;",
        "a",
        "T3",
        "source3",
        "Lkotlin/Triple;",
        "b",
        "c",
        "<init>",
        "()V",
        "rxkotlin"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lio/reactivex/rxkotlin/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/rxkotlin/e;

    invoke-direct {v0}, Lio/reactivex/rxkotlin/e;-><init>()V

    sput-object v0, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT1;>;",
            "Lio/reactivex/Observable<",
            "TT2;>;)",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "TT1;TT2;>;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxkotlin/e$a;->a:Lio/reactivex/rxkotlin/e$a;

    invoke-static {p1, p2, v0}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "Observable.combineLatest\u2026> { t1, t2 -> t1 to t2 })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT1;>;",
            "Lio/reactivex/Observable<",
            "TT2;>;",
            "Lio/reactivex/Observable<",
            "TT3;>;)",
            "Lio/reactivex/Observable<",
            "Lkotlin/Triple<",
            "TT1;TT2;TT3;>;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxkotlin/e$b;->a:Lio/reactivex/rxkotlin/e$b;

    invoke-static {p1, p2, p3, v0}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/h;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "Observable.combineLatest\u2026 -> Triple(t1, t2, t3) })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final c(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT1;>;",
            "Lio/reactivex/Observable<",
            "TT2;>;)",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "TT1;TT2;>;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxkotlin/e$c;->a:Lio/reactivex/rxkotlin/e$c;

    invoke-static {p1, p2, v0}, Lio/reactivex/Observable;->zip(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "Observable.zip(source1, \u2026> { t1, t2 -> t1 to t2 })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

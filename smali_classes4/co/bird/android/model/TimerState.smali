.class public final enum Lco/bird/android/model/TimerState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/TimerState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/model/TimerState;",
        "",
        "delta",
        "",
        "(Ljava/lang/String;IJ)V",
        "timer",
        "Lio/reactivex/Observable;",
        "currentValueSeconds",
        "",
        "STOPPED",
        "INCREASING",
        "DECREASING",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/TimerState;

.field public static final enum DECREASING:Lco/bird/android/model/TimerState;

.field public static final enum INCREASING:Lco/bird/android/model/TimerState;

.field public static final enum STOPPED:Lco/bird/android/model/TimerState;


# instance fields
.field private final delta:J


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/TimerState;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/android/model/TimerState;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/TimerState;->STOPPED:Lco/bird/android/model/TimerState;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/TimerState;->INCREASING:Lco/bird/android/model/TimerState;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/TimerState;->DECREASING:Lco/bird/android/model/TimerState;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lco/bird/android/model/TimerState;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-string v4, "STOPPED"

    invoke-direct {v0, v4, v1, v2, v3}, Lco/bird/android/model/TimerState;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lco/bird/android/model/TimerState;->STOPPED:Lco/bird/android/model/TimerState;

    new-instance v0, Lco/bird/android/model/TimerState;

    const/4 v1, 0x1

    const-wide/16 v2, 0x1

    const-string v4, "INCREASING"

    invoke-direct {v0, v4, v1, v2, v3}, Lco/bird/android/model/TimerState;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lco/bird/android/model/TimerState;->INCREASING:Lco/bird/android/model/TimerState;

    new-instance v0, Lco/bird/android/model/TimerState;

    const/4 v1, 0x2

    const-wide/16 v2, -0x1

    const-string v4, "DECREASING"

    invoke-direct {v0, v4, v1, v2, v3}, Lco/bird/android/model/TimerState;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lco/bird/android/model/TimerState;->DECREASING:Lco/bird/android/model/TimerState;

    invoke-static {}, Lco/bird/android/model/TimerState;->$values()[Lco/bird/android/model/TimerState;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/TimerState;->$VALUES:[Lco/bird/android/model/TimerState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lco/bird/android/model/TimerState;->delta:J

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/TimerState;->timer$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDelta$p(Lco/bird/android/model/TimerState;)J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/TimerState;->delta:J

    return-wide v0
.end method

.method private static final timer$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Long;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/TimerState;
    .locals 1

    const-class v0, Lco/bird/android/model/TimerState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/TimerState;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/TimerState;
    .locals 1

    sget-object v0, Lco/bird/android/model/TimerState;->$VALUES:[Lco/bird/android/model/TimerState;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/TimerState;

    return-object v0
.end method


# virtual methods
.method public final timer(I)Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lco/bird/android/model/TimerState;->delta:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-static {}, Lio/reactivex/Observable;->never()Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "{\n      Observable.never()\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v0, v1, v4}, Lio/reactivex/Observable;->interval(JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/TimerState$timer$1;

    invoke-direct {v1, p0, p1}, Lco/bird/android/model/TimerState$timer$1;-><init>(Lco/bird/android/model/TimerState;I)V

    new-instance p1, LQ46;

    invoke-direct {p1, v1}, LQ46;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "fun timer(currentValueSe\u2026tValueSeconds }\n    }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

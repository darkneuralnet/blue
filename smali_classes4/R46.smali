.class public final enum LR46;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LR46;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nj\u0002\u0008\u0008j\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "LR46;",
        "",
        "",
        "currentValue",
        "Ljava/util/concurrent/TimeUnit;",
        "timeUnit",
        "Lio/reactivex/Observable;",
        "",
        "c",
        "b",
        "J",
        "delta",
        "<init>",
        "(Ljava/lang/String;IJ)V",
        "d",
        "e",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:LR46;

.field public static final enum d:LR46;

.field public static final enum e:LR46;

.field public static final synthetic f:[LR46;


# instance fields
.field public final b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LR46;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-string v4, "STOPPED"

    invoke-direct {v0, v4, v1, v2, v3}, LR46;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, LR46;->c:LR46;

    new-instance v0, LR46;

    const/4 v1, 0x1

    const-wide/16 v2, 0x1

    const-string v4, "INCREASING"

    invoke-direct {v0, v4, v1, v2, v3}, LR46;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, LR46;->d:LR46;

    new-instance v0, LR46;

    const/4 v1, 0x2

    const-wide/16 v2, -0x1

    const-string v4, "DECREASING"

    invoke-direct {v0, v4, v1, v2, v3}, LR46;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, LR46;->e:LR46;

    invoke-static {}, LR46;->b()[LR46;

    move-result-object v0

    sput-object v0, LR46;->f:[LR46;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, LR46;->b:J

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0, p1}, LR46;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDelta$p(LR46;)J
    .locals 2

    iget-wide v0, p0, LR46;->b:J

    return-wide v0
.end method

.method public static final synthetic b()[LR46;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LR46;

    const/4 v1, 0x0

    sget-object v2, LR46;->c:LR46;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LR46;->d:LR46;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LR46;->e:LR46;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Long;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LR46;
    .locals 1

    const-class v0, LR46;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LR46;

    return-object p0
.end method

.method public static values()[LR46;
    .locals 1

    sget-object v0, LR46;->f:[LR46;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LR46;

    return-object v0
.end method


# virtual methods
.method public final c(ILjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-string v0, "timeUnit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, LR46;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-static {}, Lio/reactivex/Observable;->never()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "{\n      Observable.never()\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1

    invoke-static {v2, v3, v0, v1, p2}, Lio/reactivex/Observable;->interval(JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p2

    new-instance v0, LR46$a;

    invoke-direct {v0, p0, p1}, LR46$a;-><init>(LR46;I)V

    new-instance p1, LP46;

    invoke-direct {p1, v0}, LP46;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "fun timer(currentValue: \u2026tUntilChanged()\n    }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.class public final LcR1$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcR1;->b1(Lio/reactivex/p;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "record",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "e",
        "(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LcR1;


# direct methods
.method public constructor <init>(LcR1;)V
    .locals 0

    iput-object p1, p0, LcR1$l;->g:LcR1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/BrainSwapRecord;
    .locals 0

    invoke-static {p0, p1}, LcR1$l;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/BrainSwapRecord;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LcR1;Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LcR1$l;->g(LcR1;Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LcR1;Ljava/lang/Throwable;)Z
    .locals 0

    invoke-static {p0, p1}, LcR1$l;->i(LcR1;Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(LcR1;Lco/bird/android/model/persistence/BrainSwapRecord;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1, p2}, LcR1$l;->f(LcR1;Lco/bird/android/model/persistence/BrainSwapRecord;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LcR1;Lco/bird/android/model/persistence/BrainSwapRecord;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LcR1;->access$getBrainSwapManager$p(LcR1;)Ln10;

    move-result-object p0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getImei()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ln10;->B0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final g(LcR1;Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LcR1;->access$getBrainSwapManager$p(LcR1;)Ln10;

    move-result-object p0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getBirdId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ln10;->E0(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p0

    sget-object p1, LcR1$l$a;->g:LcR1$l$a;

    new-instance v0, LnR1;

    invoke-direct {v0, p1}, LnR1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/BrainSwapRecord;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/BrainSwapRecord;

    return-object p0
.end method

.method public static final i(LcR1;Ljava/lang/Throwable;)Z
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LcR1$f;

    if-eqz v0, :cond_0

    check-cast p1, LcR1$f;

    invoke-virtual {p1}, LcR1$f;->a()Lco/bird/android/model/persistence/BrainSwapRecord;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-static {p0}, LcR1;->access$getBrainSwapTimeoutSeconds(LcR1;)I

    move-result p0

    invoke-virtual {p1, p0}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final e(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;"
        }
    .end annotation

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v1

    iget-object v2, p0, LcR1$l;->g:LcR1;

    invoke-static {v2}, LcR1;->access$getBrainSwapTimeoutSeconds(LcR1;)I

    move-result v2

    invoke-virtual {v1, v2}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/Seconds;->getSeconds()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->timer(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LcR1$l;->g:LcR1;

    new-instance v2, LkR1;

    invoke-direct {v2, v1, p1}, LkR1;-><init>(LcR1;Lco/bird/android/model/persistence/BrainSwapRecord;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LcR1$l;->g:LcR1;

    new-instance v2, LlR1;

    invoke-direct {v2, v1, p1}, LlR1;-><init>(LcR1;Lco/bird/android/model/persistence/BrainSwapRecord;)V

    invoke-static {v2}, Lio/reactivex/F;->k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    iget-object v0, p0, LcR1$l;->g:LcR1;

    new-instance v1, LmR1;

    invoke-direct {v1, v0}, LmR1;-><init>(LcR1;)V

    invoke-static {v1}, LSN4;->l(Lio/reactivex/functions/q;)LSN4$f;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, LSN4$f;->b(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)LSN4$f;

    move-result-object v0

    invoke-virtual {v0}, LSN4$f;->a()Lio/reactivex/functions/o;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->W(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BrainSwapRecord;

    invoke-virtual {p0, p1}, LcR1$l;->e(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

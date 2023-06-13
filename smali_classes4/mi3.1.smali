.class public final Lmi3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lji3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R3\u0010\u0013\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e0\n8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R:\u0010\u0018\u001a(\u0012$\u0012\"\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\r0\u000bj\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\r`\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R+\u0010\u001e\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\n8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0010\u001a\u0004\u0008\u001d\u0010\u0012R$\u0010 \u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0017\u00a8\u0006\'"
    }
    d2 = {
        "Lmi3;",
        "Lji3;",
        "Lgl;",
        "a",
        "Lgl;",
        "preference",
        "Lom3;",
        "b",
        "Lom3;",
        "operatorManager",
        "LZ84;",
        "Ljava/util/HashMap;",
        "",
        "Lco/bird/android/model/wire/WireOperatorActivityLogDetails;",
        "Lco/bird/android/coreinterface/manager/ActivityLogDetailsMap;",
        "c",
        "Lkotlin/Lazy;",
        "getOperatorPerformanceActivityDetails",
        "()LZ84;",
        "operatorPerformanceActivityDetails",
        "La94;",
        "Lkotlin/collections/HashMap;",
        "d",
        "La94;",
        "mutableDetailsRelay",
        "Ljava/util/ArrayList;",
        "Lco/bird/android/model/wire/WireActivityLogShift;",
        "Lco/bird/android/coreinterface/manager/ActivityLogHistoryList;",
        "e",
        "getOperatorPerformanceActivityShiftHistory",
        "operatorPerformanceActivityShiftHistory",
        "f",
        "mutableShiftHistoryRelay",
        "LRh6;",
        "userStream",
        "LTq4;",
        "reactiveConfig",
        "<init>",
        "(Lgl;Lom3;LRh6;LTq4;)V",
        "contractor_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorActivityLogManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorActivityLogManagerImpl.kt\nco/bird/android/manager/contractor/OperatorActivityLogManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,99:1\n180#2:100\n*S KotlinDebug\n*F\n+ 1 OperatorActivityLogManagerImpl.kt\nco/bird/android/manager/contractor/OperatorActivityLogManagerImpl\n*L\n42#1:100\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lgl;

.field public final b:Lom3;

.field public final c:Lkotlin/Lazy;

.field public final d:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireOperatorActivityLogDetails;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Lkotlin/Lazy;

.field public final f:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/ArrayList<",
            "Lco/bird/android/model/wire/WireActivityLogShift;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgl;Lom3;LRh6;LTq4;)V
    .locals 1

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operatorManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmi3;->a:Lgl;

    iput-object p2, p0, Lmi3;->b:Lom3;

    new-instance p1, Lmi3$c;

    invoke-direct {p1, p0}, Lmi3$c;-><init>(Lmi3;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lmi3;->c:Lkotlin/Lazy;

    sget-object p1, La94;->h:La94$a;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const/4 p4, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, p4, v0, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p2

    iput-object p2, p0, Lmi3;->d:La94;

    new-instance p2, Lmi3$d;

    invoke-direct {p2, p0}, Lmi3$d;-><init>(Lmi3;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lmi3;->e:Lkotlin/Lazy;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1, p2, p4, v0, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, Lmi3;->f:La94;

    invoke-interface {p3}, LRh6;->i()Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string p3, "UNBOUND"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, Lmi3$a;

    invoke-direct {p2, p0}, Lmi3$a;-><init>(Lmi3;)V

    new-instance p3, Lki3;

    invoke-direct {p3, p2}, Lki3;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object p2, Lmi3$b;->g:Lmi3$b;

    new-instance p4, Lli3;

    invoke-direct {p4, p2}, Lli3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3, p4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lmi3;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getMutableDetailsRelay$p(Lmi3;)La94;
    .locals 0

    iget-object p0, p0, Lmi3;->d:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableShiftHistoryRelay$p(Lmi3;)La94;
    .locals 0

    iget-object p0, p0, Lmi3;->f:La94;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lmi3;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.class public final Lzn6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzn6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0011B-\u0008\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0018\u0012\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u001c\u00a2\u0006\u0004\u0008 \u0010!J\u001c\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001dR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001f\u00a8\u0006\""
    }
    d2 = {
        "Lzn6;",
        "",
        "",
        "tipId",
        "emergencyPhoneNumber",
        "",
        "f",
        "userResponse",
        "Lco/bird/android/model/wire/WireRide;",
        "ride",
        "Lzendesk/support/CreateRequest;",
        "d",
        "(Ljava/lang/String;Lco/bird/android/model/wire/WireRide;)Lzendesk/support/CreateRequest;",
        "request",
        "Lio/reactivex/c;",
        "e",
        "LYR4;",
        "a",
        "LYR4;",
        "rideManager",
        "Le13;",
        "b",
        "Le13;",
        "navigator",
        "Lcom/uber/autodispose/ScopeProvider;",
        "c",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "LFn6;",
        "LFn6;",
        "ui",
        "Ljava/lang/String;",
        "<init>",
        "(LYR4;Le13;Lcom/uber/autodispose/ScopeProvider;LFn6;)V",
        "app_birdRelease"
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
        "SMAP\nVehicleTipPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleTipPresenter.kt\nco/bird/android/app/feature/tip/VehicleTipPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n237#2:132\n180#2:133\n180#2:134\n1#3:135\n*S KotlinDebug\n*F\n+ 1 VehicleTipPresenter.kt\nco/bird/android/app/feature/tip/VehicleTipPresenterImpl\n*L\n79#1:132\n83#1:133\n89#1:134\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lzn6$a;

.field public static final g:I

.field public static final h:Lorg/joda/time/format/DateTimeFormatter;


# instance fields
.field public final a:LYR4;

.field public final b:Le13;

.field public final c:Lcom/uber/autodispose/ScopeProvider;

.field public final d:LFn6;

.field public e:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzn6$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzn6$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzn6;->f:Lzn6$a;

    const/16 v0, 0x8

    sput v0, Lzn6;->g:I

    invoke-static {}, Lorg/joda/time/format/DateTimeFormat;->mediumDateTime()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "mediumDateTime()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lzn6;->h:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(LYR4;Le13;Lcom/uber/autodispose/ScopeProvider;LFn6;)V
    .locals 1

    const-string v0, "rideManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzn6;->a:LYR4;

    iput-object p2, p0, Lzn6;->b:Le13;

    iput-object p3, p0, Lzn6;->c:Lcom/uber/autodispose/ScopeProvider;

    iput-object p4, p0, Lzn6;->d:LFn6;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lzn6;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$createRequest(Lzn6;Lzendesk/support/CreateRequest;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0, p1}, Lzn6;->e(Lzendesk/support/CreateRequest;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDATE_TIME_FORMATTER$cp()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lzn6;->h:Lorg/joda/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public static final synthetic access$getNavigator$p(Lzn6;)Le13;
    .locals 0

    iget-object p0, p0, Lzn6;->b:Le13;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(Lzn6;)LFn6;
    .locals 0

    iget-object p0, p0, Lzn6;->d:LFn6;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lzn6;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lzn6;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/String;Lco/bird/android/model/wire/WireRide;)Lzendesk/support/CreateRequest;
    .locals 9

    const-string v0, "userResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    sget-object v2, Lzn6;->h:Lorg/joda/time/format/DateTimeFormatter;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "<https://dash.bird.co/bird/rides/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/tracks>"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lzn6;->d:LFn6;

    invoke-interface {v4}, LFn6;->L5()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    new-array v6, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v8, 0x1

    aput-object v2, v6, v8

    const/4 v2, 0x2

    aput-object v3, v6, v2

    const/4 v3, 0x3

    aput-object p1, v6, v3

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "format(this, *args)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    :cond_2
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "vehicle_tip"

    aput-object v3, v2, v7

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "model:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v8

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "partner:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance p2, Lzendesk/support/CreateRequest;

    invoke-direct {p2}, Lzendesk/support/CreateRequest;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Vehicle "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Tip Follow-Up"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lzendesk/support/CreateRequest;->setSubject(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lzendesk/support/CreateRequest;->setDescription(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lzendesk/support/CreateRequest;->setTags(Ljava/util/List;)V

    return-object p2
.end method

.method public final e(Lzendesk/support/CreateRequest;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lzn6$b;

    invoke-direct {v0, p1}, Lzn6$b;-><init>(Lzendesk/support/CreateRequest;)V

    invoke-static {v0}, Lnh5;->e(Lkotlin/jvm/functions/Function1;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lzn6;->e:Ljava/lang/String;

    iget-object p1, p0, Lzn6;->d:LFn6;

    if-nez p2, :cond_0

    const-string p2, "911"

    :cond_0
    invoke-interface {p1, p2}, LFn6;->Gk(Ljava/lang/String;)V

    iget-object p1, p0, Lzn6;->d:LFn6;

    invoke-interface {p1}, LFn6;->Lf()Lio/reactivex/Observable;

    move-result-object p1

    iget-object p2, p0, Lzn6;->d:LFn6;

    invoke-interface {p2}, LFn6;->m8()Lio/reactivex/Observable;

    move-result-object p2

    iget-object v0, p0, Lzn6;->d:LFn6;

    invoke-interface {v0}, LFn6;->ai()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "merge(\n      ui.tippedBu\u2026nClicks())\n      .take(1)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lzn6;->a:LYR4;

    invoke-interface {p2}, LYR4;->R()LZ84;

    move-result-object p2

    invoke-static {p1, p2}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lzn6$c;

    invoke-direct {p2, p0}, Lzn6$c;-><init>(Lzn6;)V

    new-instance v0, Lwn6;

    invoke-direct {v0, p2}, Lwn6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun onCreate(ti\u2026{ navigator.close() }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lzn6;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    iget-object p1, p0, Lzn6;->d:LFn6;

    invoke-interface {p1}, LFn6;->p4()Lio/reactivex/Observable;

    move-result-object p1

    iget-object p2, p0, Lzn6;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lzn6$d;

    invoke-direct {v0, p0}, Lzn6$d;-><init>(Lzn6;)V

    new-instance v1, Lxn6;

    invoke-direct {v1, v0}, Lxn6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object p1, p0, Lzn6;->d:LFn6;

    invoke-interface {p1}, LFn6;->s1()Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, Lzn6;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, Lzn6$e;

    invoke-direct {p2, p0}, Lzn6$e;-><init>(Lzn6;)V

    new-instance v0, Lyn6;

    invoke-direct {v0, p2}, Lyn6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.class public final Lco/bird/android/runtime/logging/CrashlyticsTree;
.super Lg46$b;
.source "SourceFile"

# interfaces
.implements LFq2;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "CheckResult"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/runtime/logging/CrashlyticsTree$h;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB1\u0008\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0007J\u0008\u0010\u0005\u001a\u00020\u0003H\u0007J,\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0014J$\u0010\u000e\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/runtime/logging/CrashlyticsTree;",
        "Lg46$b;",
        "LFq2;",
        "",
        "onApplicationForegrounded",
        "onApplicationBackgrounded",
        "",
        "priority",
        "",
        "tag",
        "message",
        "",
        "t",
        "throwable",
        "H",
        "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;",
        "c",
        "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;",
        "crashlytics",
        "Ldr4;",
        "locationManager",
        "LTq4;",
        "reactiveConfig",
        "LBc;",
        "deviceManager",
        "LRh6;",
        "userStream",
        "<init>",
        "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ldr4;LTq4;LBc;LRh6;)V",
        "d",
        "h",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final d:Lco/bird/android/runtime/logging/CrashlyticsTree$h;

.field public static final e:I


# instance fields
.field public final c:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/runtime/logging/CrashlyticsTree$h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/runtime/logging/CrashlyticsTree$h;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/runtime/logging/CrashlyticsTree;->d:Lco/bird/android/runtime/logging/CrashlyticsTree$h;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/runtime/logging/CrashlyticsTree;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ldr4;LTq4;LBc;LRh6;)V
    .locals 6

    const-string v0, "crashlytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lg46$b;-><init>()V

    iput-object p1, p0, Lco/bird/android/runtime/logging/CrashlyticsTree;->c:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    const-string v0, "device_id"

    invoke-interface {p4}, LBc;->getDeviceId()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, v0, p4}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->setCustomKey(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p5}, LRh6;->c()Lio/reactivex/Observable;

    move-result-object p4

    new-instance v0, Lco/bird/android/runtime/logging/CrashlyticsTree$a;

    invoke-direct {v0, p0}, Lco/bird/android/runtime/logging/CrashlyticsTree$a;-><init>(Lco/bird/android/runtime/logging/CrashlyticsTree;)V

    new-instance v1, LdE0;

    invoke-direct {v1, v0}, LdE0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p4, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p5}, LRh6;->i()Lio/reactivex/Observable;

    move-result-object p4

    new-instance p5, Lco/bird/android/runtime/logging/CrashlyticsTree$b;

    invoke-direct {p5, p0}, Lco/bird/android/runtime/logging/CrashlyticsTree$b;-><init>(Lco/bird/android/runtime/logging/CrashlyticsTree;)V

    new-instance v0, LeE0;

    invoke-direct {v0, p5}, LeE0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p4, v0}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual {p3}, LTq4;->f8()LZ84;

    move-result-object p3

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p4

    invoke-virtual {p3, p4}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p3

    sget-object p4, Lco/bird/android/runtime/logging/CrashlyticsTree$c;->g:Lco/bird/android/runtime/logging/CrashlyticsTree$c;

    new-instance p5, LfE0;

    invoke-direct {p5, p4}, LfE0;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p3, p5}, Lio/reactivex/Observable;->distinctUntilChanged(Lio/reactivex/functions/d;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/runtime/logging/CrashlyticsTree$d;

    invoke-direct {v1, p1}, Lco/bird/android/runtime/logging/CrashlyticsTree$d;-><init>(Ljava/lang/Object;)V

    const-string p3, "distinctUntilChanged { f\u2026tId == second.habitatId }"

    invoke-static {v0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    new-instance v3, Lco/bird/android/runtime/logging/CrashlyticsTree$e;

    invoke-direct {v3, p0}, Lco/bird/android/runtime/logging/CrashlyticsTree$e;-><init>(Lco/bird/android/runtime/logging/CrashlyticsTree;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lio/reactivex/rxkotlin/i;->f(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/disposables/c;

    invoke-interface {p2}, Ldr4;->p()LZ84;

    move-result-object p2

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/runtime/logging/CrashlyticsTree$f;

    invoke-direct {v1, p1}, Lco/bird/android/runtime/logging/CrashlyticsTree$f;-><init>(Ljava/lang/Object;)V

    const-string p1, "observeOn(Schedulers.io())"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lco/bird/android/runtime/logging/CrashlyticsTree$g;

    invoke-direct {v3, p0}, Lco/bird/android/runtime/logging/CrashlyticsTree$g;-><init>(Lco/bird/android/runtime/logging/CrashlyticsTree;)V

    invoke-static/range {v0 .. v5}, Lio/reactivex/rxkotlin/i;->f(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic A(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/runtime/logging/CrashlyticsTree;->G(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/runtime/logging/CrashlyticsTree;->D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/runtime/logging/CrashlyticsTree;->E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final G(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getCrashlytics$p(Lco/bird/android/runtime/logging/CrashlyticsTree;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;
    .locals 0

    iget-object p0, p0, Lco/bird/android/runtime/logging/CrashlyticsTree;->c:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    return-object p0
.end method


# virtual methods
.method public final H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    const-string p1, "\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Ljava/io/StringWriter;

    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    new-instance p2, Ljava/io/PrintWriter;

    invoke-direct {p2, p1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p3, p2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply {\n\u2026g())\n    }\n  }.toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onApplicationBackgrounded()V
    .locals 3
    .annotation runtime Landroidx/lifecycle/l;
        value = .enum Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;
    .end annotation

    iget-object v0, p0, Lco/bird/android/runtime/logging/CrashlyticsTree;->c:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    const-string v1, "app_foregrounded"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->setCustomKey(Ljava/lang/String;Z)V

    return-void
.end method

.method public final onApplicationForegrounded()V
    .locals 3
    .annotation runtime Landroidx/lifecycle/l;
        value = .enum Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;
    .end annotation

    iget-object v0, p0, Lco/bird/android/runtime/logging/CrashlyticsTree;->c:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    const-string v1, "app_foregrounded"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->setCustomKey(Ljava/lang/String;Z)V

    return-void
.end method

.method public t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lco/bird/android/runtime/logging/CrashlyticsTree;->c:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    invoke-virtual {p0, p2, p3, p4}, Lco/bird/android/runtime/logging/CrashlyticsTree;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->log(Ljava/lang/String;)V

    const/4 p2, 0x6

    if-ne p1, p2, :cond_1

    if-eqz p4, :cond_1

    iget-object p1, p0, Lco/bird/android/runtime/logging/CrashlyticsTree;->c:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    invoke-virtual {p1, p4}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->recordException(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.class public final Lco/bird/android/App$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/App;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 App.kt\nco/bird/android/App$onCreate$3\n+ 2 L.kt\ncom/michaelflisar/lumberjack/L\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n107#2:445\n1#3:446\n*S KotlinDebug\n*F\n+ 1 App.kt\nco/bird/android/App$onCreate$3\n*L\n192#1:445\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/App;


# direct methods
.method public constructor <init>(Lco/bird/android/App;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/App;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/App$c;->f(Lco/bird/android/App;)V

    return-void
.end method

.method public static synthetic b(Landroidx/lifecycle/f;Lco/bird/android/App;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/App$c;->e(Landroidx/lifecycle/f;Lco/bird/android/App;)V

    return-void
.end method

.method public static synthetic c(Lco/bird/android/App;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/App$c;->g(Lco/bird/android/App;)V

    return-void
.end method

.method public static synthetic d(Lco/bird/android/App;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/App$c;->h(Lco/bird/android/App;)V

    return-void
.end method

.method public static final e(Landroidx/lifecycle/f;Lco/bird/android/App;)V
    .locals 2

    const-string v0, "$this_apply"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/App;->p()Ldagger/Lazy;

    move-result-object v0

    invoke-interface {v0}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "localeUpdateObserver.get()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LFq2;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/f;->a(LFq2;)V

    invoke-virtual {p1}, Lco/bird/android/App;->v()Ldagger/Lazy;

    move-result-object v0

    invoke-interface {v0}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "smartlockBluetoothScanner.get()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LFq2;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/f;->a(LFq2;)V

    invoke-virtual {p1}, Lco/bird/android/App;->u()Ldagger/Lazy;

    move-result-object v0

    invoke-interface {v0}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "smartLockGlobalBluetoothScanner.get()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LFq2;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/f;->a(LFq2;)V

    invoke-virtual {p1}, Lco/bird/android/App;->k()Ldagger/Lazy;

    move-result-object p1

    invoke-interface {p1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "crashlyticsTree.get()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LFq2;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void
.end method

.method public static final f(Lco/bird/android/App;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/App;->f()Ldagger/Lazy;

    move-result-object v0

    invoke-interface {v0}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, LEa;->d(Landroid/app/Application;Z)V

    return-void
.end method

.method public static final g(Lco/bird/android/App;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0}, LH22;->l0()LZ85;

    move-result-object v0

    invoke-interface {v0}, LZ85;->d()V

    invoke-virtual {p0}, Lco/bird/android/App;->q()Ldagger/Lazy;

    move-result-object p0

    invoke-interface {p0}, Ldagger/Lazy;->get()Ljava/lang/Object;

    return-void
.end method

.method public static final h(Lco/bird/android/App;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/App;->s()LLifecycleOwner;

    move-result-object v0

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/App;->m()Ldagger/Lazy;

    move-result-object v1

    invoke-interface {v1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "foregroundServiceLifecycleObserver.get()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LFq2;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(LFq2;)V

    invoke-virtual {p0}, Lco/bird/android/App;->t()Ldagger/Lazy;

    move-result-object p0

    invoke-interface {p0}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;

    invoke-virtual {p0}, Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;->p()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/App$c;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v1}, LxU2;->a(Landroid/content/Context;)V

    const-string v1, "bird"

    const/4 v2, 0x1

    invoke-static {v1, v1, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v1}, Lcom/facebook/a;->D(Landroid/content/Context;)V

    :cond_0
    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v1}, Lco/bird/android/App;->access$getInitializer(Lco/bird/android/App;)Ldj;

    move-result-object v1

    const-class v3, Lnet/danlew/android/joda/JodaTimeInitializer;

    invoke-virtual {v1, v3}, Ldj;->f(Ljava/lang/Class;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    invoke-static {v1}, Lorg/joda/time/DateTimeZone;->forTimeZone(Ljava/util/TimeZone;)Lorg/joda/time/DateTimeZone;

    move-result-object v1

    invoke-static {v1}, Lorg/joda/time/DateTimeZone;->setDefault(Lorg/joda/time/DateTimeZone;)V

    new-instance v8, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    const-string v1, "android_logcat"

    const-string v3, "log"

    const/4 v11, 0x3

    const-string v4, "%d\t%.-1level\t%msg%n"

    invoke-direct {v8, v11, v4, v1, v3}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v7, "5MB"

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, LFl2;->a:LFl2;

    new-instance v3, Lol1;

    invoke-direct {v3, v1}, Lol1;-><init>(Lcom/michaelflisar/lumberjack/FileLoggingSetup;)V

    invoke-static {v3}, Lg46;->j(Lg46$b;)V

    sget-object v1, LH22;->a:LH22;

    invoke-virtual {v1}, LH22;->w3()LnG2;

    move-result-object v3

    invoke-interface {v3}, LlG2;->h1()Lio/reactivex/functions/g;

    move-result-object v3

    invoke-static {v3}, Lio/reactivex/plugins/a;->D(Lio/reactivex/functions/g;)V

    const/4 v3, 0x0

    invoke-static {v3}, LIx2;->j(Z)V

    invoke-virtual {v1}, LH22;->r()Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->O()Luf1;

    move-result-object v1

    sget-object v4, Luf1;->k:Luf1;

    if-ne v1, v4, :cond_1

    sget-object v1, Lzendesk/core/Zendesk;->INSTANCE:Lzendesk/core/Zendesk;

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lml4;->zendesk_url:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lml4;->zendesk_application_id:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lml4;->zendesk_client_id:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v4, v5, v6, v7}, Lzendesk/core/Zendesk;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v1, Lzendesk/core/Zendesk;->INSTANCE:Lzendesk/core/Zendesk;

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lml4;->zendesk_sandbox_url:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lml4;->zendesk_sandbox_application_id:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lml4;->zendesk_sandbox_client_id:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v4, v5, v6, v7}, Lzendesk/core/Zendesk;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    sget-object v1, Lzendesk/support/Support;->INSTANCE:Lzendesk/support/Support;

    sget-object v4, Lzendesk/core/Zendesk;->INSTANCE:Lzendesk/core/Zendesk;

    invoke-virtual {v1, v4}, Lzendesk/support/Support;->init(Lzendesk/core/Zendesk;)V

    const-string v4, "iw"

    const-string v5, "he"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v4, Ljava/util/Locale;

    invoke-direct {v4, v5}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lzendesk/support/Support;->setHelpCenterLocaleOverride(Ljava/util/Locale;)V

    :cond_2
    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v1}, Lco/bird/android/App;->k()Ldagger/Lazy;

    move-result-object v1

    invoke-interface {v1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg46$b;

    invoke-static {v1}, Lg46;->j(Lg46$b;)V

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v1}, Lco/bird/android/App;->e()Ldagger/Lazy;

    move-result-object v4

    invoke-interface {v4}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {v1, v4}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v1}, Lco/bird/android/App;->l()Ldagger/Lazy;

    move-result-object v4

    invoke-interface {v4}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {v1, v4}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v1}, Lco/bird/android/App;->s()LLifecycleOwner;

    move-result-object v1

    invoke-interface {v1}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v1

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v4}, Lco/bird/android/App;->n()Ldagger/Lazy;

    move-result-object v5

    invoke-interface {v5}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/Handler;

    new-instance v6, LDh;

    invoke-direct {v6, v1, v4}, LDh;-><init>(Landroidx/lifecycle/f;Lco/bird/android/App;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v1}, Lco/bird/android/App;->n()Ldagger/Lazy;

    move-result-object v1

    invoke-interface {v1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    new-instance v5, LEh;

    invoke-direct {v5, v4}, LEh;-><init>(Lco/bird/android/App;)V

    invoke-virtual {v1, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    new-instance v1, Lorg/joda/time/DateTime;

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v4}, Lco/bird/android/App;->access$getAppStartTime$p(Lco/bird/android/App;)J

    move-result-wide v4

    invoke-direct {v1, v4, v5}, Lorg/joda/time/DateTime;-><init>(J)V

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v4}, Lco/bird/android/App;->f()Ldagger/Lazy;

    move-result-object v4

    invoke-interface {v4}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LEa;

    move v12, v3

    :goto_1
    const-string v5, "true_app_start_time"

    if-ge v12, v11, :cond_3

    const-string v6, "invoke$lambda$5$lambda$4"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lco/bird/android/model/analytics/ColdAppStart;

    invoke-direct {v6}, Lco/bird/android/model/analytics/ColdAppStart;-><init>()V

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractDateTime;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v5, v4

    invoke-static/range {v5 .. v10}, LEa$a;->startTrace$default(LEa;Lco/bird/android/model/analytics/TraceKey;Ljava/util/Map;Lorg/joda/time/DateTime;ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_3
    new-instance v6, Lco/bird/android/model/analytics/AppProcessInit;

    invoke-direct {v6}, Lco/bird/android/model/analytics/AppProcessInit;-><init>()V

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractDateTime;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v4, v6, v5, v1}, LEa;->z(Lco/bird/android/model/analytics/TraceKey;Ljava/util/Map;Lorg/joda/time/DateTime;)V

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v1}, Lco/bird/android/App;->n()Ldagger/Lazy;

    move-result-object v1

    invoke-interface {v1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    new-instance v5, LFh;

    invoke-direct {v5, v4}, LFh;-><init>(Lco/bird/android/App;)V

    invoke-virtual {v1, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object v1, LH22;->a:LH22;

    invoke-virtual {v1}, LH22;->i0()LjB0;

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v1}, Lco/bird/android/App;->access$handleGcTimeout(Lco/bird/android/App;)V

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v1}, Lco/bird/android/App;->i()LlG2;

    move-result-object v1

    invoke-interface {v1}, LlG2;->r()Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->o()V

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v1}, Lco/bird/android/App;->n()Ldagger/Lazy;

    move-result-object v1

    invoke-interface {v1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    new-instance v5, LGh;

    invoke-direct {v5, v4}, LGh;-><init>(Lco/bird/android/App;)V

    invoke-virtual {v1, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v1}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appboy/Appboy;->requestLocationInitialization()V

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v1}, Lco/bird/android/App;->access$updateBrazePushToken(Lco/bird/android/App;)V

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v1}, Lco/bird/android/App;->f()Ldagger/Lazy;

    move-result-object v1

    invoke-interface {v1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v1

    const-string v4, "analyticsManager.get()"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v1

    check-cast v12, LEa;

    new-instance v13, Lco/bird/android/model/analytics/AppProcessInit;

    invoke-direct {v13}, Lco/bird/android/model/analytics/AppProcessInit;-><init>()V

    const/4 v14, 0x0

    new-array v1, v11, [Lkotlin/Pair;

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v4}, Lco/bird/android/App;->access$getAppOnCreateStartTime$p(Lco/bird/android/App;)Ljava/lang/Long;

    move-result-object v4

    const-string v5, "0"

    if-eqz v4, :cond_4

    iget-object v6, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    invoke-static {v6}, Lco/bird/android/App;->access$getAppStartTime$p(Lco/bird/android/App;)J

    move-result-wide v9

    sub-long/2addr v7, v9

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_5

    :cond_4
    move-object v4, v5

    :cond_5
    const-string v6, "onCreateStartTime"

    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v1, v3

    iget-object v3, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v3}, Lco/bird/android/App;->access$getAppOnCreateSuperComplete$p(Lco/bird/android/App;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v4, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-static {v4}, Lco/bird/android/App;->access$getAppStartTime$p(Lco/bird/android/App;)J

    move-result-wide v3

    sub-long/2addr v6, v3

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_7

    :cond_6
    move-object v3, v5

    :cond_7
    const-string v4, "onCreateSuperCompletedStartTime"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v2

    iget-object v2, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v2}, Lco/bird/android/App;->access$getAppOnCreateInjectorInitTime$p(Lco/bird/android/App;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_9

    iget-object v3, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-static {v3}, Lco/bird/android/App;->access$getAppStartTime$p(Lco/bird/android/App;)J

    move-result-wide v2

    sub-long/2addr v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_8
    move-object v5, v2

    :cond_9
    :goto_2
    const-string v2, "onCreateInjectorInitTime"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v15

    iget-object v1, v0, Lco/bird/android/App$c;->g:Lco/bird/android/App;

    invoke-static {v1}, Lco/bird/android/App;->access$getAppOnCreateCompleteTime$p(Lco/bird/android/App;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    new-instance v3, Lorg/joda/time/DateTime;

    invoke-direct {v3, v1, v2}, Lorg/joda/time/DateTime;-><init>(J)V

    move-object/from16 v16, v3

    goto :goto_3

    :cond_a
    const/4 v1, 0x0

    move-object/from16 v16, v1

    :goto_3
    const/16 v17, 0x2

    const/16 v18, 0x0

    invoke-static/range {v12 .. v18}, LEa$a;->stopTrace$default(LEa;Lco/bird/android/model/analytics/TraceKey;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;ILjava/lang/Object;)V

    return-void
.end method

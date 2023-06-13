.class public final Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;
.super Lqx1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$a;,
        Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;,
        Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0003`a>BO\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00103\u001a\u000200\u00a2\u0006\u0004\u0008^\u0010_J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J\u0008\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u001a\u0010\u0014\u001a\u00020\u00108\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u001a\u00108\u001a\u0002048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u0008\u001a\u00107R\u001a\u0010:\u001a\u0002048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u00089\u00106\u001a\u0004\u0008\u001e\u00107R\u001a\u0010@\u001a\u00020;8\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008B\u0010DR\u001c\u0010J\u001a\n G*\u0004\u0018\u00010F0F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\"\u0010M\u001a\u0010\u0012\u000c\u0012\n G*\u0004\u0018\u00010;0;0K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010LR\"\u0010O\u001a\u0010\u0012\u000c\u0012\n G*\u0004\u0018\u00010;0;0K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010LR\"\u0010Q\u001a\u0010\u0012\u000c\u0012\n G*\u0004\u0018\u00010)0)0K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010LR\u001a\u0010U\u001a\u0008\u0012\u0004\u0012\u00020R0\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR!\u0010X\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008V\u0010C\u001a\u0004\u0008H\u0010WR!\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010C\u001a\u0004\u0008&\u0010WR\u0014\u0010[\u001a\u00020;8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010?R\u0014\u0010]\u001a\u00020;8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\\\u0010?\u00a8\u0006b"
    }
    d2 = {
        "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;",
        "Lqx1;",
        "",
        "operatorActive",
        "requirementsMissing",
        "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;",
        "z",
        "Lio/reactivex/Observable;",
        "u",
        "Lio/reactivex/c;",
        "A",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "isDebug",
        "",
        "n",
        "Landroid/content/Context;",
        "g",
        "Landroid/content/Context;",
        "()Landroid/content/Context;",
        "context",
        "Lom3;",
        "h",
        "Lom3;",
        "operatorManager",
        "LRh6;",
        "i",
        "LRh6;",
        "userStream",
        "Ldr4;",
        "j",
        "Ldr4;",
        "locationManager",
        "LTq4;",
        "k",
        "LTq4;",
        "reactiveConfig",
        "Lde5;",
        "l",
        "Lde5;",
        "rxBleClient",
        "Landroid/content/Intent;",
        "m",
        "Landroid/content/Intent;",
        "mainActivityIntent",
        "Lgl;",
        "Lgl;",
        "preference",
        "LLifecycleOwner;",
        "o",
        "LLifecycleOwner;",
        "lifecycleOwner",
        "",
        "p",
        "I",
        "()I",
        "notificationId",
        "q",
        "notificationPriority",
        "",
        "r",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "channelId",
        "Landroidx/core/app/NotificationManagerCompat;",
        "s",
        "Lkotlin/Lazy;",
        "()Landroidx/core/app/NotificationManagerCompat;",
        "notificationManagerCompat",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "t",
        "Ljava/util/concurrent/ExecutorService;",
        "executor",
        "Lio/reactivex/subjects/a;",
        "Lio/reactivex/subjects/a;",
        "contentTitleSubject",
        "v",
        "contentTextSubject",
        "w",
        "intentSubject",
        "Landroidx/lifecycle/f$a;",
        "x",
        "Lio/reactivex/Observable;",
        "lifecycleObservable",
        "y",
        "()Lio/reactivex/Observable;",
        "shouldForegroundSetup",
        "shouldForeground",
        "f",
        "contentTitle",
        "e",
        "contentText",
        "<init>",
        "(Landroid/content/Context;Lom3;LRh6;Ldr4;LTq4;Lde5;Landroid/content/Intent;Lgl;LLifecycleOwner;)V",
        "a",
        "b",
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
        "SMAP\nUserTrackerServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,208:1\n237#2:209\n180#2:210\n*S KotlinDebug\n*F\n+ 1 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin\n*L\n166#1:209\n189#1:210\n*E\n"
    }
.end annotation


# static fields
.field public static final A:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$a;

.field public static final B:I


# instance fields
.field public final g:Landroid/content/Context;

.field public final h:Lom3;

.field public final i:LRh6;

.field public final j:Ldr4;

.field public final k:LTq4;

.field public final l:Lde5;

.field public final m:Landroid/content/Intent;

.field public final n:Lgl;

.field public final o:LLifecycleOwner;

.field public final p:I

.field public final q:I

.field public final r:Ljava/lang/String;

.field public final s:Lkotlin/Lazy;

.field public final t:Ljava/util/concurrent/ExecutorService;

.field public final u:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public final x:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Landroidx/lifecycle/f$a;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Lkotlin/Lazy;

.field public final z:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->A:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$a;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->B:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lom3;LRh6;Ldr4;LTq4;Lde5;Landroid/content/Intent;Lgl;LLifecycleOwner;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operatorManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBleClient"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainActivityIntent"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lqx1;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->g:Landroid/content/Context;

    iput-object p2, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->h:Lom3;

    iput-object p3, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->i:LRh6;

    iput-object p4, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->j:Ldr4;

    iput-object p5, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->k:LTq4;

    iput-object p6, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->l:Lde5;

    iput-object p7, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->m:Landroid/content/Intent;

    iput-object p8, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->n:Lgl;

    iput-object p9, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->o:LLifecycleOwner;

    const/16 p1, 0x4d6

    iput p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->p:I

    const/4 p1, 0x2

    iput p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->q:I

    const-string p1, "special_tasks_channel"

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->r:Ljava/lang/String;

    new-instance p1, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$d;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$d;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->s:Lkotlin/Lazy;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->t:Ljava/util/concurrent/ExecutorService;

    const-string p1, ""

    invoke-static {p1}, Lio/reactivex/subjects/a;->g(Ljava/lang/Object;)Lio/reactivex/subjects/a;

    move-result-object p2

    const-string p3, "createDefault(\"\")"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->u:Lio/reactivex/subjects/a;

    invoke-static {p1}, Lio/reactivex/subjects/a;->g(Ljava/lang/Object;)Lio/reactivex/subjects/a;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->v:Lio/reactivex/subjects/a;

    invoke-static {p7}, Lio/reactivex/subjects/a;->g(Ljava/lang/Object;)Lio/reactivex/subjects/a;

    move-result-object p1

    const-string p2, "createDefault(mainActivityIntent)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->w:Lio/reactivex/subjects/a;

    new-instance p1, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    invoke-static {p1}, Lnh5;->i(Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->x:Lio/reactivex/Observable;

    new-instance p1, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->y:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$i;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$i;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->z:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getContentTextSubject$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->v:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getContentTitleSubject$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->u:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getIntentSubject$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->w:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getLifecycleObservable$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lio/reactivex/Observable;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->x:Lio/reactivex/Observable;

    return-object p0
.end method

.method public static final synthetic access$getLifecycleOwner$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)LLifecycleOwner;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->o:LLifecycleOwner;

    return-object p0
.end method

.method public static final synthetic access$getLocationManager$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Ldr4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->j:Ldr4;

    return-object p0
.end method

.method public static final synthetic access$getMainActivityIntent$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->m:Landroid/content/Intent;

    return-object p0
.end method

.method public static final synthetic access$getNotificationManagerCompat(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Landroidx/core/app/NotificationManagerCompat;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->s()Landroidx/core/app/NotificationManagerCompat;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lgl;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->n:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)LTq4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->k:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getRxBleClient$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lde5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->l:Lde5;

    return-object p0
.end method

.method public static final synthetic access$getShouldForegroundSetup(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lio/reactivex/Observable;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->t()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUserStream$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)LRh6;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->i:LRh6;

    return-object p0
.end method

.method public static final synthetic access$observeNotificationsActive(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lio/reactivex/Observable;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->u()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$processForUserTrackService(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;ZZ)Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->z(ZZ)Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$trackUser(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->A()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Triple;

    return-object p0
.end method

.method public static final y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final A()Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->h:Lom3;

    invoke-interface {v0}, Lom3;->k1()Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "operatorManager.track()\n      .onErrorComplete()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->r:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->v:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->u:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public g()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->g:Landroid/content/Context;

    return-object v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->p:I

    return v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->q:I

    return v0
.end method

.method public l()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->z:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-shouldForeground>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public n(Lcom/uber/autodispose/ScopeProvider;Z)V
    .locals 3

    const-string v0, "scopeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lqx1;->n(Lcom/uber/autodispose/ScopeProvider;Z)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->t()Lio/reactivex/Observable;

    move-result-object p2

    iget-object v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->t:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lio/reactivex/schedulers/a;->b(Ljava/util/concurrent/Executor;)Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p2

    new-instance v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$f;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$f;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    new-instance v1, Lai6;

    invoke-direct {v1, v0}, Lai6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v1}, Lio/reactivex/Observable;->switchMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p2

    const-string v0, "override fun onCreate(sc\u2026nNext(intent)\n      }\n  }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {p2, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p2

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p2}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    invoke-virtual {p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->t()Lio/reactivex/Observable;

    move-result-object p2

    new-instance v1, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$g;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$g;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    new-instance v2, Lbi6;

    invoke-direct {v2, v1}, Lbi6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$h;

    invoke-direct {p2, p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$h;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    new-instance v0, Lci6;

    invoke-direct {v0, p2}, Lci6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final s()Landroidx/core/app/NotificationManagerCompat;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->s:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/app/NotificationManagerCompat;

    return-object v0
.end method

.method public final t()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->y:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-shouldForegroundSetup>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public final u()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, 0x5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->interval(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$e;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$e;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    new-instance v2, LZh6;

    invoke-direct {v2, v1}, LZh6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "private fun observeNotif\u2026istinctUntilChanged()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final z(ZZ)Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;
    .locals 2

    if-eqz p2, :cond_0

    sget-object v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;->c:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;->b:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    :goto_0
    new-instance v1, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;

    if-eqz p1, :cond_1

    if-nez p2, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-direct {v1, p1, v0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;-><init>(ZLco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;)V

    return-object v1
.end method

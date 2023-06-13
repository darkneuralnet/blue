.class public final Lco/bird/android/manager/ride/EndRideManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXc1;
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/ride/EndRideManagerImpl$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001SBK\u0008\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010\'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0008\u0008\u0001\u0010.\u001a\u00020\u0003\u00a2\u0006\u0004\u0008U\u0010VJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u0012\u0010\r\u001a\u00020\u000c2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0008\u0010\u0010\u001a\u00020\u000eH\u0016J\u0008\u0010\u0011\u001a\u00020\u0005H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\'\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010.\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R0\u00108\u001a\n 0*\u0004\u0018\u00010/0/8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\r\u00101\u0012\u0004\u00086\u00107\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R.\u0010<\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/ 0*\n\u0012\u0004\u0012\u00020/\u0018\u00010:0:098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010;R\u001a\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u001a\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010?R\u001a\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010?R\u001a\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010?R\u0018\u0010H\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR \u0010M\u001a\u0008\u0012\u0004\u0012\u00020\n0I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008J\u0010K\u001a\u0004\u0008\u001a\u0010LR \u0010O\u001a\u0008\u0012\u0004\u0012\u00020\n0I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008N\u0010K\u001a\u0004\u0008>\u0010LR \u0010Q\u001a\u0008\u0012\u0004\u0012\u00020\n0I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008P\u0010K\u001a\u0004\u0008!\u0010LR \u0010T\u001a\u0008\u0012\u0004\u0012\u00020\n0I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008R\u0010K\u001a\u0004\u0008S\u0010L\u00a8\u0006X"
    }
    d2 = {
        "Lco/bird/android/manager/ride/EndRideManagerImpl;",
        "LXc1;",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onStart",
        "onStop",
        "Lco/bird/android/model/wire/WireRide;",
        "ride",
        "",
        "b",
        "Lio/reactivex/c;",
        "j",
        "",
        "n",
        "k",
        "e",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "LYR4;",
        "c",
        "LYR4;",
        "rideManager",
        "Lbn;",
        "d",
        "Lbn;",
        "areaManager",
        "Lpv0;",
        "Lpv0;",
        "configManager",
        "LTq4;",
        "f",
        "LTq4;",
        "reactiveConfig",
        "LEa;",
        "g",
        "LEa;",
        "analyticsManager",
        "Ldr4;",
        "h",
        "Ldr4;",
        "reactiveLocationManager",
        "i",
        "LLifecycleOwner;",
        "processLifecycleOwner",
        "Lorg/joda/time/DateTime;",
        "kotlin.jvm.PlatformType",
        "Lorg/joda/time/DateTime;",
        "N",
        "()Lorg/joda/time/DateTime;",
        "setLastForegroundTime$ride_release",
        "(Lorg/joda/time/DateTime;)V",
        "getLastForegroundTime$ride_release$annotations",
        "()V",
        "lastForegroundTime",
        "LAG;",
        "Lco/bird/android/buava/Optional;",
        "LAG;",
        "firstLocationUpdatePostForeground",
        "La94;",
        "l",
        "La94;",
        "mutableWaitingForEndRideConditions",
        "m",
        "mutableLocationUpdatedAfterForegrounding",
        "mutableAreasRefreshedAfterForegrounding",
        "o",
        "mutableNestsRefreshedAfterForegrounding",
        "p",
        "Ljava/lang/String;",
        "endRideSessionId",
        "LZ84;",
        "q",
        "LZ84;",
        "()LZ84;",
        "waitingForEndRideConditions",
        "r",
        "locationUpdatedAfterForegrounding",
        "s",
        "areasRefreshedAfterForegrounding",
        "t",
        "a",
        "nestsRefreshedAfterForegrounding",
        "<init>",
        "(Landroid/content/Context;LYR4;Lbn;Lpv0;LTq4;LEa;Ldr4;LLifecycleOwner;)V",
        "u",
        "ride_release"
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
        "SMAP\nEndRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndRideManagerImpl.kt\nco/bird/android/manager/ride/EndRideManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n44#2:286\n44#2:288\n218#3:287\n237#3:289\n1#4:290\n*S KotlinDebug\n*F\n+ 1 EndRideManagerImpl.kt\nco/bird/android/manager/ride/EndRideManagerImpl\n*L\n93#1:286\n109#1:288\n93#1:287\n109#1:289\n*E\n"
    }
.end annotation


# static fields
.field public static final u:Lco/bird/android/manager/ride/EndRideManagerImpl$a;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:LYR4;

.field public final d:Lbn;

.field public final e:Lpv0;

.field public final f:LTq4;

.field public final g:LEa;

.field public final h:Ldr4;

.field public final i:LLifecycleOwner;

.field public j:Lorg/joda/time/DateTime;

.field public final k:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Lco/bird/android/buava/Optional<",
            "Lorg/joda/time/DateTime;",
            ">;>;"
        }
    .end annotation
.end field

.field public final l:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final m:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final n:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final o:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public p:Ljava/lang/String;

.field public final q:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final r:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final s:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final t:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/manager/ride/EndRideManagerImpl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/manager/ride/EndRideManagerImpl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/manager/ride/EndRideManagerImpl;->u:Lco/bird/android/manager/ride/EndRideManagerImpl$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LYR4;Lbn;Lpv0;LTq4;LEa;Ldr4;LLifecycleOwner;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areaManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveLocationManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processLifecycleOwner"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->b:Landroid/content/Context;

    iput-object p2, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->c:LYR4;

    iput-object p3, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->d:Lbn;

    iput-object p4, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->e:Lpv0;

    iput-object p5, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->f:LTq4;

    iput-object p6, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->g:LEa;

    iput-object p7, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->h:Ldr4;

    iput-object p8, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->i:LLifecycleOwner;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->j:Lorg/joda/time/DateTime;

    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-static {p1}, LAG;->h(Ljava/lang/Object;)LAG;

    move-result-object p1

    const-string p2, "createDefault<Optional<D\u2026Time>>(Optional.absent())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->k:LAG;

    sget-object p1, La94;->h:La94$a;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p3, 0x0

    const/4 p4, 0x2

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p5

    iput-object p5, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->l:La94;

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p6

    iput-object p6, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->m:La94;

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p7

    iput-object p7, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->n:La94;

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->o:La94;

    sget-object p2, LZ84;->d:LZ84$a;

    invoke-virtual {p2, p5}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p3

    iput-object p3, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->q:LZ84;

    invoke-virtual {p2, p6}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p3

    iput-object p3, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->r:LZ84;

    invoke-virtual {p2, p7}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p3

    iput-object p3, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->s:LZ84;

    invoke-virtual {p2, p1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->t:LZ84;

    invoke-interface {p8}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void
.end method

.method public static synthetic A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic B()V
    .locals 0

    invoke-static {}, Lco/bird/android/manager/ride/EndRideManagerImpl;->W()V

    return-void
.end method

.method public static synthetic C(Lco/bird/android/manager/ride/EndRideManagerImpl;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/manager/ride/EndRideManagerImpl;->e0(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    return-void
.end method

.method public static synthetic D()V
    .locals 0

    invoke-static {}, Lco/bird/android/manager/ride/EndRideManagerImpl;->a0()V

    return-void
.end method

.method public static synthetic E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lco/bird/android/manager/ride/EndRideManagerImpl;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/manager/ride/EndRideManagerImpl;->f0(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    return-void
.end method

.method public static synthetic H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic K(J)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->d0(J)V

    return-void
.end method

.method public static synthetic L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->Y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final S()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "completing waitForForeground config update"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final W()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "completing waitForForeground areas update"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final Y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final a0()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "completing waitForForeground nests update"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getAreaManager$p(Lco/bird/android/manager/ride/EndRideManagerImpl;)Lbn;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->d:Lbn;

    return-object p0
.end method

.method public static final synthetic access$getConfigManager$p(Lco/bird/android/manager/ride/EndRideManagerImpl;)Lpv0;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->e:Lpv0;

    return-object p0
.end method

.method public static final synthetic access$getFirstLocationUpdatePostForeground$p(Lco/bird/android/manager/ride/EndRideManagerImpl;)LAG;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->k:LAG;

    return-object p0
.end method

.method public static final synthetic access$getMutableAreasRefreshedAfterForegrounding$p(Lco/bird/android/manager/ride/EndRideManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->n:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableLocationUpdatedAfterForegrounding$p(Lco/bird/android/manager/ride/EndRideManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->m:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableNestsRefreshedAfterForegrounding$p(Lco/bird/android/manager/ride/EndRideManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->o:La94;

    return-object p0
.end method

.method public static final synthetic access$getRideManager$p(Lco/bird/android/manager/ride/EndRideManagerImpl;)LYR4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->c:LYR4;

    return-object p0
.end method

.method public static final b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final c0()Lio/reactivex/h;
    .locals 3

    const-wide/16 v0, 0xfa

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lio/reactivex/c;->c0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public static final d0(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Timed out while waiting "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " seconds for overall stream to complete, ignoring end ride conditions checks now"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final e0(Lco/bird/android/manager/ride/EndRideManagerImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->l:La94;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static final f0(Lco/bird/android/manager/ride/EndRideManagerImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->l:La94;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static final g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static synthetic getLastForegroundTime$ride_release$annotations()V
    .locals 0

    return-void
.end method

.method public static final h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j0()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "completing waitForForeground location update"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s()Lio/reactivex/h;
    .locals 1

    invoke-static {}, Lco/bird/android/manager/ride/EndRideManagerImpl;->c0()Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic t()V
    .locals 0

    invoke-static {}, Lco/bird/android/manager/ride/EndRideManagerImpl;->j0()V

    return-void
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x()V
    .locals 0

    invoke-static {}, Lco/bird/android/manager/ride/EndRideManagerImpl;->S()V

    return-void
.end method

.method public static synthetic y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final N()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->j:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public a()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->t:LZ84;

    return-object v0
.end method

.method public b(Lco/bird/android/model/wire/WireRide;)Z
    .locals 7

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->c:LYR4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, LYR4;->i1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/RideState;->getRideConfig()Lco/bird/android/model/wire/configs/Config;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getEndRide()Lco/bird/android/model/wire/configs/EndRideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/EndRideConfig;->getWaitForForegroundLocationSeconds()Ljava/lang/Float;

    move-result-object v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToLong(F)J

    move-result-wide v5

    invoke-static {v5, v6, v2, v3}, Lkotlin/jvm/internal/Intrinsics;->compare(JJ)I

    move-result v1

    if-ne v1, v4, :cond_2

    move v1, v4

    goto :goto_1

    :cond_2
    move v1, v0

    :goto_1
    if-nez v1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/EndRideConfig;->getWaitForForegroundConfigSeconds()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToLong(F)J

    move-result-wide v5

    invoke-static {v5, v6, v2, v3}, Lkotlin/jvm/internal/Intrinsics;->compare(JJ)I

    move-result v1

    if-ne v1, v4, :cond_3

    move v1, v4

    goto :goto_2

    :cond_3
    move v1, v0

    :goto_2
    if-nez v1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/EndRideConfig;->getWaitForForegroundAreasSeconds()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToLong(F)J

    move-result-wide v5

    invoke-static {v5, v6, v2, v3}, Lkotlin/jvm/internal/Intrinsics;->compare(JJ)I

    move-result v1

    if-ne v1, v4, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    move v1, v0

    :goto_3
    if-nez v1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/EndRideConfig;->getWaitForForegroundParkingNestsSeconds()Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lkotlin/math/MathKt;->roundToLong(F)J

    move-result-wide v5

    invoke-static {v5, v6, v2, v3}, Lkotlin/jvm/internal/Intrinsics;->compare(JJ)I

    move-result p1

    if-ne p1, v4, :cond_5

    move p1, v4

    goto :goto_4

    :cond_5
    move p1, v0

    :goto_4
    if-eqz p1, :cond_7

    :cond_6
    move v0, v4

    :cond_7
    return v0
.end method

.method public d()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->q:LZ84;

    return-object v0
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->p:Ljava/lang/String;

    return-void
.end method

.method public f()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->s:LZ84;

    return-object v0
.end method

.method public j(Lco/bird/android/model/wire/WireRide;)Lio/reactivex/c;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/manager/ride/EndRideManagerImpl;->l:La94;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    iget-object v1, v0, Lco/bird/android/manager/ride/EndRideManagerImpl;->c:LYR4;

    if-eqz p1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1, v3}, LYR4;->i1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v1

    const-string v3, "complete()"

    if-nez v1, :cond_1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRideConfig()Lco/bird/android/model/wire/configs/Config;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/RideConfig;->getEndRide()Lco/bird/android/model/wire/configs/EndRideConfig;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/EndRideConfig;->getWaitForForegroundLocationSeconds()Ljava/lang/Float;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-static {v5}, Lkotlin/math/MathKt;->roundToLong(F)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v6

    invoke-virtual {v6}, Lco/bird/android/model/wire/configs/RideConfig;->getEndRide()Lco/bird/android/model/wire/configs/EndRideConfig;

    move-result-object v6

    invoke-virtual {v6}, Lco/bird/android/model/wire/configs/EndRideConfig;->getWaitForForegroundConfigSeconds()Ljava/lang/Float;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-static {v6}, Lkotlin/math/MathKt;->roundToLong(F)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/RideConfig;->getEndRide()Lco/bird/android/model/wire/configs/EndRideConfig;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/EndRideConfig;->getWaitForForegroundAreasSeconds()Ljava/lang/Float;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    invoke-static {v7}, Lkotlin/math/MathKt;->roundToLong(F)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_3

    :cond_4
    const/4 v7, 0x0

    :goto_3
    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getEndRide()Lco/bird/android/model/wire/configs/EndRideConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/EndRideConfig;->getWaitForForegroundParkingNestsSeconds()Ljava/lang/Float;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-static {v4}, Lkotlin/math/MathKt;->roundToLong(F)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    :goto_4
    iget-object v8, v0, Lco/bird/android/manager/ride/EndRideManagerImpl;->j:Lorg/joda/time/DateTime;

    const-string v9, "lastForegroundTime"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, LpT0;->h(Lorg/joda/time/DateTime;)I

    move-result v8

    const/4 v9, 0x4

    new-array v10, v9, [Ljava/lang/Long;

    const/4 v11, 0x0

    aput-object v5, v10, v11

    const/4 v12, 0x1

    aput-object v6, v10, v12

    const/4 v13, 0x2

    aput-object v7, v10, v13

    const/4 v14, 0x3

    aput-object v4, v10, v14

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    const-wide/16 v15, 0x1

    if-eqz v10, :cond_6

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    add-long v15, v17, v15

    :cond_6
    move-wide v14, v15

    int-to-long v12, v8

    cmp-long v12, v12, v14

    if-lez v12, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "app has already been foregrounded for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " seconds which is longer than the max waiting seconds value ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "), "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v1

    new-instance v2, Lmd1;

    invoke-direct {v2, v0}, Lmd1;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v1

    const-string v2, "complete()\n        .doOn\u2026onditions.accept(false) }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :cond_7
    const-string v8, "waiting for up to "

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v12

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " seconds (waitForForegroundLocationSeconds) for post foreground location update"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v5, v11, [Ljava/lang/Object;

    invoke-static {v2, v5}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, v0, Lco/bird/android/manager/ride/EndRideManagerImpl;->h:Ldr4;

    invoke-interface {v2}, Ldr4;->t()LZ84;

    move-result-object v2

    new-instance v5, Lco/bird/android/manager/ride/EndRideManagerImpl$m;

    invoke-direct {v5, v0}, Lco/bird/android/manager/ride/EndRideManagerImpl$m;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    new-instance v10, Lcd1;

    invoke-direct {v10, v5}, Lcd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v10}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v2

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v12, v13, v5}, Lio/reactivex/c;->Z(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object v2

    sget-object v5, Lco/bird/android/manager/ride/EndRideManagerImpl$n;->g:Lco/bird/android/manager/ride/EndRideManagerImpl$n;

    new-instance v10, Ldd1;

    invoke-direct {v10, v5}, Ldd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v10}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v2

    sget-object v5, Lco/bird/android/manager/ride/EndRideManagerImpl$o;->g:Lco/bird/android/manager/ride/EndRideManagerImpl$o;

    new-instance v10, Led1;

    invoke-direct {v10, v5}, Led1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v10}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v2

    new-instance v5, Lfd1;

    invoke-direct {v5}, Lfd1;-><init>()V

    invoke-virtual {v2, v5}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v2

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    :goto_5
    if-nez v2, :cond_9

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    if-eqz v6, :cond_c

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v12, " seconds (waitForForegroundConfigSeconds) for post foreground config update"

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v10, v12}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v10, v0, Lco/bird/android/manager/ride/EndRideManagerImpl;->f:LTq4;

    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v12

    invoke-virtual {v12}, Lco/bird/android/model/wire/WireRide;->getPartnerId()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_b

    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v12

    goto :goto_6

    :cond_a
    const/4 v12, 0x0

    :cond_b
    :goto_6
    invoke-virtual {v10, v12}, LTq4;->g8(Ljava/lang/String;)LZ84;

    move-result-object v1

    new-instance v10, Lco/bird/android/manager/ride/EndRideManagerImpl$j;

    invoke-direct {v10, v0}, Lco/bird/android/manager/ride/EndRideManagerImpl$j;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    new-instance v12, Lgd1;

    invoke-direct {v12, v10}, Lgd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v12}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v1

    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v5, v6, v10}, Lio/reactivex/c;->Z(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object v1

    sget-object v5, Lco/bird/android/manager/ride/EndRideManagerImpl$k;->g:Lco/bird/android/manager/ride/EndRideManagerImpl$k;

    new-instance v6, Lhd1;

    invoke-direct {v6, v5}, Lhd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v6}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v1

    sget-object v5, Lco/bird/android/manager/ride/EndRideManagerImpl$l;->g:Lco/bird/android/manager/ride/EndRideManagerImpl$l;

    new-instance v6, Lid1;

    invoke-direct {v6, v5}, Lid1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v6}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v1

    new-instance v5, Lkd1;

    invoke-direct {v5}, Lkd1;-><init>()V

    invoke-virtual {v1, v5}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v1

    goto :goto_7

    :cond_c
    const/4 v1, 0x0

    :goto_7
    if-nez v1, :cond_d

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_d
    if-eqz v7, :cond_e

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, " seconds (waitForForegroundAreasSeconds) for post foreground area update"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v10, v11, [Ljava/lang/Object;

    invoke-static {v7, v10}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v7, v0, Lco/bird/android/manager/ride/EndRideManagerImpl;->d:Lbn;

    invoke-interface {v7}, Lbn;->D()LZ84;

    move-result-object v7

    new-instance v10, Lco/bird/android/manager/ride/EndRideManagerImpl$f;

    invoke-direct {v10, v0}, Lco/bird/android/manager/ride/EndRideManagerImpl$f;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    invoke-static {v7, v10}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v7

    invoke-virtual {v7}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v7

    new-instance v10, Lco/bird/android/manager/ride/EndRideManagerImpl$g;

    invoke-direct {v10, v0}, Lco/bird/android/manager/ride/EndRideManagerImpl$g;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    new-instance v12, Lld1;

    invoke-direct {v12, v10}, Lld1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v7, v12}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v7

    invoke-virtual {v7}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v7

    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v5, v6, v10}, Lio/reactivex/c;->Z(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object v5

    sget-object v6, Lco/bird/android/manager/ride/EndRideManagerImpl$h;->g:Lco/bird/android/manager/ride/EndRideManagerImpl$h;

    new-instance v7, Lnd1;

    invoke-direct {v7, v6}, Lnd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v7}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v5

    new-instance v6, Lod1;

    invoke-direct {v6}, Lod1;-><init>()V

    invoke-virtual {v5, v6}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v5

    sget-object v6, Lco/bird/android/manager/ride/EndRideManagerImpl$i;->g:Lco/bird/android/manager/ride/EndRideManagerImpl$i;

    new-instance v7, Lpd1;

    invoke-direct {v7, v6}, Lpd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v7}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v5

    invoke-virtual {v5}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v5

    goto :goto_8

    :cond_e
    const/4 v5, 0x0

    :goto_8
    if-nez v5, :cond_f

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_f
    if-eqz v4, :cond_10

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " seconds (waitForForegroundParkingNestsSeconds) for post foreground parking nest update"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v8, v11, [Ljava/lang/Object;

    invoke-static {v4, v8}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v4, v0, Lco/bird/android/manager/ride/EndRideManagerImpl;->d:Lbn;

    invoke-interface {v4}, Lbn;->C()LZ84;

    move-result-object v4

    new-instance v8, Lco/bird/android/manager/ride/EndRideManagerImpl$p;

    invoke-direct {v8, v0}, Lco/bird/android/manager/ride/EndRideManagerImpl$p;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    invoke-static {v4, v8}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v4

    invoke-virtual {v4}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v4

    new-instance v8, Lco/bird/android/manager/ride/EndRideManagerImpl$q;

    invoke-direct {v8, v0}, Lco/bird/android/manager/ride/EndRideManagerImpl$q;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    new-instance v10, Lqd1;

    invoke-direct {v10, v8}, Lqd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v10}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v4

    invoke-virtual {v4}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v4

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v6, v7, v8}, Lio/reactivex/c;->Z(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object v4

    sget-object v6, Lco/bird/android/manager/ride/EndRideManagerImpl$r;->g:Lco/bird/android/manager/ride/EndRideManagerImpl$r;

    new-instance v7, Lrd1;

    invoke-direct {v7, v6}, Lrd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v7}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v4

    new-instance v6, Lsd1;

    invoke-direct {v6}, Lsd1;-><init>()V

    invoke-virtual {v4, v6}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v4

    sget-object v6, Lco/bird/android/manager/ride/EndRideManagerImpl$s;->g:Lco/bird/android/manager/ride/EndRideManagerImpl$s;

    new-instance v7, Ltd1;

    invoke-direct {v7, v6}, Ltd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v7}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v4

    invoke-virtual {v4}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v4

    move-object/from16 v17, v4

    goto :goto_9

    :cond_10
    const/16 v17, 0x0

    :goto_9
    if-nez v17, :cond_11

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v4

    :cond_11
    new-array v3, v9, [Lio/reactivex/h;

    aput-object v2, v3, v11

    const/4 v2, 0x1

    aput-object v1, v3, v2

    const/4 v1, 0x2

    aput-object v5, v3, v1

    const/4 v1, 0x3

    aput-object v17, v3, v1

    invoke-static {v3}, Lio/reactivex/c;->M([Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object v1

    new-instance v2, LZc1;

    invoke-direct {v2}, LZc1;-><init>()V

    invoke-static {v2}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v3

    new-instance v4, Lad1;

    invoke-direct {v4, v14, v15}, Lad1;-><init>(J)V

    invoke-virtual {v3, v4}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v3

    invoke-virtual {v1, v14, v15, v2, v3}, Lio/reactivex/c;->a0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object v1

    new-instance v2, Lbd1;

    invoke-direct {v2, v0}, Lbd1;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v1

    const-string v2, "mergeArray(\n      locati\u2026onditions.accept(false) }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public k()Ljava/lang/String;
    .locals 2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "randomUUID().toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->p:Ljava/lang/String;

    return-object v0
.end method

.method public l()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->r:LZ84;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->p:Ljava/lang/String;

    return-object v0
.end method

.method public onStart(LLifecycleOwner;)V
    .locals 5

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStart(LLifecycleOwner;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onAppForeground called"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->j:Lorg/joda/time/DateTime;

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->k:LAG;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->l:La94;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->m:La94;

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->n:La94;

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->o:La94;

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->h:Ldr4;

    invoke-interface {v0}, Ldr4;->t()LZ84;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/ride/EndRideManagerImpl$b;

    invoke-direct {v1, p0}, Lco/bird/android/manager/ride/EndRideManagerImpl$b;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    invoke-static {v0, v1}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstElement()Lio/reactivex/p;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/p;->J()Lio/reactivex/p;

    move-result-object v0

    const-string v1, "override fun onStart(own\u2026))\n      .subscribe()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v2

    const-string v3, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v2, Lco/bird/android/manager/ride/EndRideManagerImpl$c;

    invoke-direct {v2, p0}, Lco/bird/android/manager/ride/EndRideManagerImpl$c;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    new-instance v4, LYc1;

    invoke-direct {v4, v2}, LYc1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->k:LAG;

    new-instance v2, Lco/bird/android/manager/ride/EndRideManagerImpl$d;

    invoke-direct {v2, p0}, Lco/bird/android/manager/ride/EndRideManagerImpl$d;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    invoke-static {v0, v2}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstElement()Lio/reactivex/p;

    move-result-object v0

    new-instance v2, Lco/bird/android/manager/ride/EndRideManagerImpl$e;

    invoke-direct {v2, p0}, Lco/bird/android/manager/ride/EndRideManagerImpl$e;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    new-instance v4, Ljd1;

    invoke-direct {v4, v2}, Ljd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/p;->A(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public onStop(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStop(LLifecycleOwner;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "onAppBackground called"

    invoke-static {v0, p1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->k:LAG;

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, LAG;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->l:La94;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->m:La94;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->n:La94;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl;->o:La94;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

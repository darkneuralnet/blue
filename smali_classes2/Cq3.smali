.class public abstract LCq3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCq3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\'\u00a8\u0006\u000c"
    }
    d2 = {
        "LCq3;",
        "",
        "LfR3;",
        "impl",
        "LeR3;",
        "e",
        "LaR3;",
        "LGQ3;",
        "d",
        "<init>",
        "()V",
        "a",
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
.field public static final a:LCq3$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LCq3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LCq3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LCq3;->a:LCq3$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;)Lio/reactivex/Observable;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LCq3;->a:LCq3$a;

    invoke-virtual {v0, p0}, LCq3$a;->a(Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;)Lio/reactivex/Observable;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LCq3;->a:LCq3$a;

    invoke-virtual {v0, p0}, LCq3$a;->b(Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LG03;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LIq3;Le13;LDQ3;)LaZ2;
    .locals 6
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LG03;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LIq3;",
            "Le13;",
            "LDQ3;",
            ")",
            "LaZ2;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LCq3;->a:LCq3$a;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, LCq3$a;->c(LG03;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LIq3;Le13;LDQ3;)LaZ2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract d(LaR3;)LGQ3;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract e(LfR3;)LeR3;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.class public final Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->c()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        "T2:",
        "Ljava/lang/Object;",
        "T3:",
        "Ljava/lang/Object;",
        "T4:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/i<",
        "TT1;TT2;TT3;TT4;TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0000\n\u0002\u0008\u000c\u0010\u000c\u001a\u00028\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0000\"\u0008\u0008\u0002\u0010\u0003*\u00020\u0000\"\u0008\u0008\u0003\u0010\u0004*\u00020\u0000\"\u0008\u0008\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "",
        "T1",
        "T2",
        "T3",
        "T4",
        "R",
        "t1",
        "t2",
        "t3",
        "t4",
        "apply",
        "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$5\n+ 2 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$shouldForegroundSetup$2\n*L\n1#1,304:1\n107#2,4:305\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$c;->a:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT1;TT2;TT3;TT4;)TR;"
        }
    .end annotation

    check-cast p4, Landroidx/lifecycle/f$a;

    check-cast p3, Ljava/lang/String;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$c;->a:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getPreference$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->t0()Lco/bird/android/model/constant/MapMode;

    move-result-object p1

    sget-object p2, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    if-ne p1, p2, :cond_0

    sget-object p1, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    if-ne p4, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

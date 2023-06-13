.class public final LgW0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpJ;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;LpJ;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;->k:LpJ;

    return-void
.end method


# virtual methods
.method public b(Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;)V
    .locals 1

    iget-object v0, p0, LgW0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpJ;

    invoke-static {p1, v0}, LgW0;->a(Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;LpJ;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;

    invoke-virtual {p0, p1}, LgW0;->b(Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;)V

    return-void
.end method

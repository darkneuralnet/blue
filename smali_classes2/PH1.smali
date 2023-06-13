.class public final LPH1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMD;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lpv0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;LMD;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->h:LMD;

    return-void
.end method

.method public static b(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;Lpv0;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->i:Lpv0;

    return-void
.end method

.method public static d(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;Ldr4;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->j:Ldr4;

    return-void
.end method


# virtual methods
.method public c(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;)V
    .locals 1

    iget-object v0, p0, LPH1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMD;

    invoke-static {p1, v0}, LPH1;->a(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;LMD;)V

    iget-object v0, p0, LPH1;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpv0;

    invoke-static {p1, v0}, LPH1;->b(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;Lpv0;)V

    iget-object v0, p0, LPH1;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LPH1;->d(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;Ldr4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;

    invoke-virtual {p0, p1}, LPH1;->c(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;)V

    return-void
.end method

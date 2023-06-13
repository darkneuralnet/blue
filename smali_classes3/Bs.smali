.class public final LBs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGs;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LUs;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;LGs;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->j:LGs;

    return-void
.end method

.method public static c(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;LUs;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->k:LUs;

    return-void
.end method


# virtual methods
.method public b(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;)V
    .locals 1

    iget-object v0, p0, LBs;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LBs;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LBs;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    iget-object v0, p0, LBs;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGs;

    invoke-static {p1, v0}, LBs;->a(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;LGs;)V

    iget-object v0, p0, LBs;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUs;

    invoke-static {p1, v0}, LBs;->c(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;LUs;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;

    invoke-virtual {p0, p1}, LBs;->b(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;)V

    return-void
.end method

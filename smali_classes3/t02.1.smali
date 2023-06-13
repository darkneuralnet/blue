.class public final Lt02;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;",
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
            "La12;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lw02;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;Lw02;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->m:Lw02;

    return-void
.end method

.method public static c(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;La12;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->l:La12;

    return-void
.end method


# virtual methods
.method public b(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;)V
    .locals 1

    iget-object v0, p0, Lt02;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lt02;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lt02;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    iget-object v0, p0, Lt02;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La12;

    invoke-static {p1, v0}, Lt02;->c(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;La12;)V

    iget-object v0, p0, Lt02;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw02;

    invoke-static {p1, v0}, Lt02;->a(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;Lw02;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;

    invoke-virtual {p0, p1}, Lt02;->b(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;)V

    return-void
.end method

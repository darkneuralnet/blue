.class public final LV04;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;",
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
            "LY04;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJ14;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "La14;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;LY04;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->j:LY04;

    return-void
.end method

.method public static c(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;La14;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->l:La14;

    return-void
.end method

.method public static d(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;LJ14;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->k:LJ14;

    return-void
.end method


# virtual methods
.method public b(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V
    .locals 1

    iget-object v0, p0, LV04;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LV04;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LV04;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    iget-object v0, p0, LV04;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY04;

    invoke-static {p1, v0}, LV04;->a(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;LY04;)V

    iget-object v0, p0, LV04;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ14;

    invoke-static {p1, v0}, LV04;->d(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;LJ14;)V

    iget-object v0, p0, LV04;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La14;

    invoke-static {p1, v0}, LV04;->c(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;La14;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    invoke-virtual {p0, p1}, LV04;->b(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V

    return-void
.end method

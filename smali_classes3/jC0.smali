.class public final LjC0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;",
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
            "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->k:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;

    return-void
.end method

.method public static c(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->j:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    return-void
.end method


# virtual methods
.method public b(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V
    .locals 1

    iget-object v0, p0, LjC0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LjC0;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LjC0;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    iget-object v0, p0, LjC0;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    invoke-static {p1, v0}, LjC0;->c(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    iget-object v0, p0, LjC0;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;

    invoke-static {p1, v0}, LjC0;->a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

    invoke-virtual {p0, p1}, LjC0;->b(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V

    return-void
.end method

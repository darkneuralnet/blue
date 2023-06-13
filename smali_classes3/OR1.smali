.class public final LOR1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;",
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
            "LfS1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRR1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;LRR1;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;->k:LRR1;

    return-void
.end method

.method public static c(Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;LfS1;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;->j:LfS1;

    return-void
.end method


# virtual methods
.method public b(Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;)V
    .locals 1

    iget-object v0, p0, LOR1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LOR1;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LOR1;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    iget-object v0, p0, LOR1;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfS1;

    invoke-static {p1, v0}, LOR1;->c(Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;LfS1;)V

    iget-object v0, p0, LOR1;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRR1;

    invoke-static {p1, v0}, LOR1;->a(Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;LRR1;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;

    invoke-virtual {p0, p1}, LOR1;->b(Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;)V

    return-void
.end method

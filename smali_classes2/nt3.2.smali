.class public final Lnt3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;",
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
            "Lvt3;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lpt3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;Lpt3;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->k:Lpt3;

    return-void
.end method

.method public static c(Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;Lvt3;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;->j:Lvt3;

    return-void
.end method


# virtual methods
.method public b(Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;)V
    .locals 1

    iget-object v0, p0, Lnt3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lnt3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lnt3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    iget-object v0, p0, Lnt3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvt3;

    invoke-static {p1, v0}, Lnt3;->c(Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;Lvt3;)V

    iget-object v0, p0, Lnt3;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpt3;

    invoke-static {p1, v0}, Lnt3;->a(Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;Lpt3;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;

    invoke-virtual {p0, p1}, Lnt3;->b(Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;)V

    return-void
.end method

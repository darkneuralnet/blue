.class public final Lsv2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/app/feature/locale/LocaleChangedReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LQh2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/app/feature/locale/LocaleChangedReceiver;LQh2;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/locale/LocaleChangedReceiver;->a:LQh2;

    return-void
.end method


# virtual methods
.method public b(Lco/bird/android/app/feature/locale/LocaleChangedReceiver;)V
    .locals 1

    iget-object v0, p0, Lsv2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQh2;

    invoke-static {p1, v0}, Lsv2;->a(Lco/bird/android/app/feature/locale/LocaleChangedReceiver;LQh2;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/locale/LocaleChangedReceiver;

    invoke-virtual {p0, p1}, Lsv2;->b(Lco/bird/android/app/feature/locale/LocaleChangedReceiver;)V

    return-void
.end method

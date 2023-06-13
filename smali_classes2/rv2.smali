.class public final Lrv2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/app/feature/locale/LocaleChangedJobConsumer;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lco/bird/android/app/feature/locale/LocaleChangedJobConsumer;Llh6;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/locale/LocaleChangedJobConsumer;->k:Llh6;

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/app/feature/locale/LocaleChangedJobConsumer;)V
    .locals 1

    iget-object v0, p0, Lrv2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {p1, v0}, Lrv2;->b(Lco/bird/android/app/feature/locale/LocaleChangedJobConsumer;Llh6;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/locale/LocaleChangedJobConsumer;

    invoke-virtual {p0, p1}, Lrv2;->a(Lco/bird/android/app/feature/locale/LocaleChangedJobConsumer;)V

    return-void
.end method

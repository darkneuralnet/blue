.class public final Lsc5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/feature/commandcenter/routing/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lvc5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lco/bird/android/feature/commandcenter/routing/b;Lvc5;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/commandcenter/routing/b;->b:Lvc5;

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/commandcenter/routing/b;)V
    .locals 1

    iget-object v0, p0, Lsc5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvc5;

    invoke-static {p1, v0}, Lsc5;->b(Lco/bird/android/feature/commandcenter/routing/b;Lvc5;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/feature/commandcenter/routing/b;

    invoke-virtual {p0, p1}, Lsc5;->a(Lco/bird/android/feature/commandcenter/routing/b;)V

    return-void
.end method

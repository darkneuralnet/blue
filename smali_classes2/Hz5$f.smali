.class public final LHz5$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHz5;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lqz5;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lqz5;",
        "kotlin.jvm.PlatformType",
        "event",
        "",
        "a",
        "(Lqz5;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LHz5;


# direct methods
.method public constructor <init>(LHz5;)V
    .locals 0

    iput-object p1, p0, LHz5$f;->g:LHz5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lqz5;)V
    .locals 6

    instance-of v0, p1, LDI4;

    if-eqz v0, :cond_1

    iget-object v0, p0, LHz5$f;->g:LHz5;

    check-cast p1, LDI4;

    invoke-virtual {p1}, LDI4;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lpz5;

    iget-object v2, p0, LHz5$f;->g:LHz5;

    invoke-static {v2}, LHz5;->access$getDeviceManager$p(LHz5;)LBc;

    move-result-object v2

    invoke-interface {v2}, LBc;->getDeviceId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LHz5$f;->g:LHz5;

    invoke-static {v3}, LHz5;->access$getPreference$p(LHz5;)Lgl;

    move-result-object v3

    invoke-virtual {v3}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, LHz5$f;->g:LHz5;

    invoke-static {v4}, LHz5;->access$getAuthTokenManager$p(LHz5;)Lhq;

    move-result-object v4

    invoke-interface {v4}, Lhq;->a()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/buava/Optional;

    invoke-virtual {v4}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, LHz5$f;->g:LHz5;

    invoke-static {v5}, LHz5;->access$getAuthTokenManager$p(LHz5;)Lhq;

    move-result-object v5

    invoke-interface {v5}, Lhq;->c()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v2, v3, v4, v5}, Lpz5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, p1, v1}, LHz5;->access$execute(LHz5;Ljava/lang/String;LN80;)V

    goto :goto_1

    :cond_1
    instance-of p1, p1, Lzl0;

    if-eqz p1, :cond_2

    iget-object p1, p0, LHz5$f;->g:LHz5;

    invoke-static {p1}, LHz5;->access$getNavigator$p(LHz5;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Unknown or null javascript command"

    invoke-static {v0, p1}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqz5;

    invoke-virtual {p0, p1}, LHz5$f;->a(Lqz5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.class public final LHz5$d;
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
        "LwP3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LwP3;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LwP3;)V"
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

    iput-object p1, p0, LHz5$d;->g:LHz5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LwP3;)V
    .locals 8

    invoke-virtual {p1}, LwP3;->a()LaJ4;

    move-result-object v0

    invoke-virtual {p1}, LwP3;->b()Lco/bird/android/model/User;

    move-result-object v2

    invoke-virtual {p1}, LwP3;->c()Lcom/stripe/android/model/Card;

    move-result-object v1

    invoke-virtual {p1}, LwP3;->d()Z

    move-result p1

    invoke-virtual {v0}, LaJ4;->b()Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v1, :cond_1

    invoke-static {v1}, LES5;->b(Lcom/stripe/android/model/Card;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1}, Lcom/stripe/android/model/Card;->getId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, LHz5$d;->g:LHz5;

    invoke-virtual {v0}, LaJ4;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v2, LmM3;

    invoke-direct {v2, p1}, LmM3;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v0, v2}, LHz5;->access$execute(LHz5;Ljava/lang/String;LN80;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_3

    iget-object p1, p0, LHz5$d;->g:LHz5;

    invoke-static {p1}, LHz5;->access$getUi$p(LHz5;)LNz5;

    move-result-object p1

    sget v0, Lnl4;->payment_error_title:I

    invoke-virtual {p1, v0}, LXC;->error(I)V

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    iget-object p1, p0, LHz5$d;->g:LHz5;

    invoke-static {p1}, LHz5;->access$getGooglePayManager$p(LHz5;)LiD1;

    move-result-object v1

    iget-object p1, p0, LHz5$d;->g:LHz5;

    invoke-static {p1}, LHz5;->access$getActivity$p(LHz5;)Landroid/app/Activity;

    move-result-object v3

    sget-object p1, LxI4;->c:LxI4;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-virtual {v0}, LaJ4;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v5

    invoke-virtual {v0}, LaJ4;->e()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, LiD1;->h(Lco/bird/android/model/User;Landroid/app/Activity;ILjava/util/Currency;Ljava/lang/Long;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, LHz5$d;->g:LHz5;

    invoke-static {p1}, LHz5;->access$getNavigator$p(LHz5;)Le13;

    move-result-object v0

    sget-object p1, LxI4;->b:LxI4;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Le13$a;->goToEnterCard$default(Le13;IZLco/bird/android/model/PaymentAddSource;ILjava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LwP3;

    invoke-virtual {p0, p1}, LHz5$d;->a(LwP3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

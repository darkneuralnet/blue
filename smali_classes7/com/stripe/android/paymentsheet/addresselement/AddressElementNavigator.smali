.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\u0004\u0008\u0000\u0010\u000c2\u0006\u0010\u0008\u001a\u00020\u0007J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;",
        "target",
        "",
        "navigateTo",
        "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;)Lkotlin/Unit;",
        "",
        "key",
        "value",
        "setResult",
        "(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;",
        "T",
        "LEu1;",
        "getResultFlow",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
        "result",
        "dismiss",
        "(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)Lkotlin/Unit;",
        "onBack",
        "()Lkotlin/Unit;",
        "LOY2;",
        "navigationController",
        "LOY2;",
        "getNavigationController",
        "()LOY2;",
        "setNavigationController",
        "(LOY2;)V",
        "Lkotlin/Function1;",
        "onDismiss",
        "Lkotlin/jvm/functions/Function1;",
        "getOnDismiss",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnDismiss",
        "(Lkotlin/jvm/functions/Function1;)V",
        "<init>",
        "()V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private navigationController:LOY2;

.field private onDismiss:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic dismiss$default(Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;ILjava/lang/Object;)Lkotlin/Unit;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;->INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)Lkotlin/Unit;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->onDismiss:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getNavigationController()LOY2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->navigationController:LOY2;

    return-object v0
.end method

.method public final getOnDismiss()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->onDismiss:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getResultFlow(Ljava/lang/String;)LEu1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "LEu1<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->navigationController:LOY2;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LDY2;->y()LAY2;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LAY2;->i()Landroidx/lifecycle/p;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/p;->i(Ljava/lang/String;Ljava/lang/Object;)LtP5;

    move-result-object p1

    invoke-static {p1}, LVu1;->v(LEu1;)LEu1;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object v1
.end method

.method public final navigateTo(Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;)Lkotlin/Unit;
    .locals 7

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->navigationController:LOY2;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;->getRoute()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LDY2;->P(LDY2;Ljava/lang/String;LTY2;Ld13$a;ILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final onBack()Lkotlin/Unit;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->navigationController:LOY2;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LDY2;->S()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p0, v1, v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->dismiss$default(Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;ILjava/lang/Object;)Lkotlin/Unit;

    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    return-object v1
.end method

.method public final setNavigationController(LOY2;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->navigationController:LOY2;

    return-void
.end method

.method public final setOnDismiss(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->onDismiss:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setResult(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->navigationController:LOY2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDY2;->F()LAY2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LAY2;->i()Landroidx/lifecycle/p;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

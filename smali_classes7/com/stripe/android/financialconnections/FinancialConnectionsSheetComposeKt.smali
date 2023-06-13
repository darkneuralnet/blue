.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetComposeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a#\u0010\u0008\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
        "",
        "callback",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;",
        "rememberFinancialConnectionsSheet",
        "(Lkotlin/jvm/functions/Function1;LEt0;I)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;",
        "rememberFinancialConnectionsSheetForToken",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFinancialConnectionsSheetCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetCompose.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,64:1\n36#2:65\n25#2:72\n36#2:79\n25#2:86\n1057#3,6:66\n1057#3,6:73\n1057#3,6:80\n1057#3,6:87\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetCompose.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetComposeKt\n*L\n28#1:65\n29#1:72\n55#1:79\n56#1:86\n28#1:66,6\n29#1:73,6\n55#1:80,6\n56#1:87,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final rememberFinancialConnectionsSheet(Lkotlin/jvm/functions/Function1;LEt0;I)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x63610eac

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.rememberFinancialConnectionsSheet (FinancialConnectionsSheetCompose.kt:22)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataContract;

    invoke-direct {p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataContract;-><init>()V

    const v0, 0x44faf204

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetComposeKt$rememberFinancialConnectionsSheet$activityResultLauncher$1$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetComposeKt$rememberFinancialConnectionsSheet$activityResultLauncher$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 p0, 0x0

    invoke-static {p2, v1, p1, p0}, LD5;->a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;

    move-result-object p0

    const p2, -0x1d58f75c

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_3

    new-instance p2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher;-><init>(LB5;)V

    invoke-direct {p2, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;)V

    invoke-interface {p1, p2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    check-cast p2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method

.method public static final rememberFinancialConnectionsSheetForToken(Lkotlin/jvm/functions/Function1;LEt0;I)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x41721c84

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.rememberFinancialConnectionsSheetForToken (FinancialConnectionsSheetCompose.kt:49)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;

    invoke-direct {p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;-><init>()V

    const v0, 0x44faf204

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetComposeKt$rememberFinancialConnectionsSheetForToken$activityResultLauncher$1$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetComposeKt$rememberFinancialConnectionsSheetForToken$activityResultLauncher$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 p0, 0x0

    invoke-static {p2, v1, p1, p0}, LD5;->a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;

    move-result-object p0

    const p2, -0x1d58f75c

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_3

    new-instance p2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;-><init>(LB5;)V

    invoke-direct {p2, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;)V

    invoke-interface {p1, p2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    check-cast p2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method

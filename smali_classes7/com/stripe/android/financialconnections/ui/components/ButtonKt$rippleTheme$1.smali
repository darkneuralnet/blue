.class public final Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxb5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->rippleTheme(Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;)Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u0002H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\t"
    }
    d2 = {
        "com/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1",
        "Lxb5;",
        "Lpm0;",
        "defaultColor-WaAFU9c",
        "(LEt0;I)J",
        "defaultColor",
        "Lpb5;",
        "rippleAlpha",
        "(LEt0;I)Lpb5;",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $this_rippleTheme:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;->$this_rippleTheme:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public defaultColor-WaAFU9c(LEt0;I)J
    .locals 3

    const v0, -0x75c6e121

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.components.rippleTheme.<no name provided>.defaultColor (Button.kt:92)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object p2, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;->$this_rippleTheme:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;

    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, Lpm0;->b:Lpm0$a;

    invoke-virtual {p2}, Lpm0$a;->h()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v0

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Critical;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Critical;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Lpm0;->b:Lpm0$a;

    invoke-virtual {p2}, Lpm0$a;->h()J

    move-result-wide v0

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    return-wide v0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public rippleAlpha(LEt0;I)Lpb5;
    .locals 3

    const v0, -0x1b4429dc

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.components.rippleTheme.<no name provided>.rippleAlpha (Button.kt:99)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lxb5;->a:Lxb5$a;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;->$this_rippleTheme:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;->buttonColors(LEt0;I)Lh70;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x1

    invoke-interface {v0, v2, p1, v1}, Lh70;->b(ZLEt0;I)LsP5;

    move-result-object v0

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpm0;

    invoke-virtual {v0}, Lpm0;->w()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1, v2}, Lxb5$a;->a(JZ)Lpb5;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method

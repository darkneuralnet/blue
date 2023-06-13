.class public final Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;
.super Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Pill"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R#\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;",
        "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;",
        "LPD3;",
        "paddingValues",
        "(LEt0;I)LPD3;",
        "Lk61;",
        "radius",
        "F",
        "getRadius-D9Ej5fM",
        "()F",
        "<init>",
        "()V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,241:1\n154#2:242\n154#2:243\n154#2:244\n154#2:245\n154#2:246\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill\n*L\n168#1:242\n169#1:243\n170#1:244\n171#1:245\n164#1:246\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;

.field private static final radius:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;->radius:F

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getRadius-D9Ej5fM()F
    .locals 1

    sget v0, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;->radius:F

    return v0
.end method

.method public paddingValues(LEt0;I)LPD3;
    .locals 3

    const v0, 0x72838fe5

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Size.Pill.paddingValues (Button.kt:166)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/16 p2, 0x8

    int-to-float p2, p2

    invoke-static {p2}, Lk61;->g(F)F

    move-result v0

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v2

    invoke-static {p2}, Lk61;->g(F)F

    move-result p2

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v0, v2, p2, v1}, LND3;->d(FFFF)LPD3;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method

.class public final Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00082\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000eJ<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00082\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;",
        "",
        "()V",
        "create",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;",
        "activity",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "onComplete",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
        "",
        "provider",
        "Lkotlin/Function0;",
        "isFinancialConnectionsAvailable",
        "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;

    invoke-direct {v0}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;->$$INSTANCE:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;ILjava/lang/Object;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    new-instance p3, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion$create$2;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion$create$2;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    new-instance p4, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;

    invoke-direct {p4}, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;-><init>()V

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;->create(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic create$default(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;ILjava/lang/Object;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    new-instance p3, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion$create$1;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion$create$1;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    new-instance p4, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;

    invoke-direct {p4}, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;-><init>()V

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;->create(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/appcompat/app/AppCompatActivity;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;",
            ">;",
            "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;",
            ")",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onComplete"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "provider"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "isFinancialConnectionsAvailable"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4}, Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;->invoke()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/stripe/android/payments/financialconnections/UnsupportedFinancialConnectionsPaymentsProxy;

    invoke-direct {p1}, Lcom/stripe/android/payments/financialconnections/UnsupportedFinancialConnectionsPaymentsProxy;-><init>()V

    :goto_0
    return-object p1
.end method

.method public final create(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;",
            ">;",
            "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;",
            ")",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;"
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onComplete"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "provider"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "isFinancialConnectionsAvailable"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4}, Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;->invoke()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/stripe/android/payments/financialconnections/UnsupportedFinancialConnectionsPaymentsProxy;

    invoke-direct {p1}, Lcom/stripe/android/payments/financialconnections/UnsupportedFinancialConnectionsPaymentsProxy;-><init>()V

    :goto_0
    return-object p1
.end method

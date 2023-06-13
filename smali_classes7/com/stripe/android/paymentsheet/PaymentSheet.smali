.class public final Lcom/stripe/android/paymentsheet/PaymentSheet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Address;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0014\u0008\u0007\u0018\u0000 %2\u00020\u0001:\u0011!\"#$%&\'()*+,-./01B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nB\u001f\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rB\u0017\u0008\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010B\u001f\u0008\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0011B\u001f\u0008\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0012B\u000f\u0008\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u001c\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u001c\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001e2\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet;",
        "",
        "activity",
        "Landroidx/activity/ComponentActivity;",
        "callback",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
        "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "createIntentCallback",
        "Lcom/stripe/android/CreateIntentCallback;",
        "paymentResultCallback",
        "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "createIntentCallbackForServerSideConfirmation",
        "Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;",
        "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "paymentSheetLauncher",
        "Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V",
        "presentWithIntentConfiguration",
        "",
        "intentConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
        "configuration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "presentWithPaymentIntent",
        "paymentIntentClientSecret",
        "",
        "presentWithSetupIntent",
        "setupIntentClientSecret",
        "Address",
        "Appearance",
        "BillingDetails",
        "Colors",
        "Companion",
        "Configuration",
        "CustomerConfiguration",
        "FlowController",
        "GooglePayConfiguration",
        "InitializationMode",
        "IntentConfiguration",
        "PrimaryButton",
        "PrimaryButtonColors",
        "PrimaryButtonShape",
        "PrimaryButtonTypography",
        "Shapes",
        "Typography",
        "paymentsheet_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;


# instance fields
.field private final paymentSheetLauncher:Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/PaymentSheet;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createIntentCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentResultCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;

    invoke-direct {v0, p1, p3}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V

    sget-object p1, Lcom/stripe/android/IntentConfirmationInterceptor;->Companion:Lcom/stripe/android/IntentConfirmationInterceptor$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;->setCreateIntentCallback(Lcom/stripe/android/AbsCreateIntentCallback;)V

    return-void
.end method

.method public constructor <init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createIntentCallbackForServerSideConfirmation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentResultCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;

    invoke-direct {v0, p1, p3}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V

    sget-object p1, Lcom/stripe/android/IntentConfirmationInterceptor;->Companion:Lcom/stripe/android/IntentConfirmationInterceptor$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;->setCreateIntentCallback(Lcom/stripe/android/AbsCreateIntentCallback;)V

    return-void
.end method

.method public constructor <init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createIntentCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentResultCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;

    invoke-direct {v0, p1, p3}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V

    sget-object p1, Lcom/stripe/android/IntentConfirmationInterceptor;->Companion:Lcom/stripe/android/IntentConfirmationInterceptor$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;->setCreateIntentCallback(Lcom/stripe/android/AbsCreateIntentCallback;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createIntentCallbackForServerSideConfirmation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentResultCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;

    invoke-direct {v0, p1, p3}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V

    sget-object p1, Lcom/stripe/android/IntentConfirmationInterceptor;->Companion:Lcom/stripe/android/IntentConfirmationInterceptor$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;->setCreateIntentCallback(Lcom/stripe/android/AbsCreateIntentCallback;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V
    .locals 1

    const-string v0, "paymentSheetLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet;->paymentSheetLauncher:Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;

    return-void
.end method

.method public static synthetic presentWithIntentConfiguration$default(Lcom/stripe/android/paymentsheet/PaymentSheet;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet;->presentWithIntentConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    return-void
.end method

.method public static synthetic presentWithPaymentIntent$default(Lcom/stripe/android/paymentsheet/PaymentSheet;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet;->presentWithPaymentIntent(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    return-void
.end method

.method public static synthetic presentWithSetupIntent$default(Lcom/stripe/android/paymentsheet/PaymentSheet;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet;->presentWithSetupIntent(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    return-void
.end method


# virtual methods
.method public final presentWithIntentConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "intentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet;->presentWithIntentConfiguration$default(Lcom/stripe/android/paymentsheet/PaymentSheet;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ILjava/lang/Object;)V

    return-void
.end method

.method public final presentWithIntentConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "intentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet;->paymentSheetLauncher:Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V

    invoke-interface {v0, v1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;->present(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    return-void
.end method

.method public final presentWithPaymentIntent(Ljava/lang/String;)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "paymentIntentClientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet;->presentWithPaymentIntent$default(Lcom/stripe/android/paymentsheet/PaymentSheet;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ILjava/lang/Object;)V

    return-void
.end method

.method public final presentWithPaymentIntent(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "paymentIntentClientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet;->paymentSheetLauncher:Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$PaymentIntent;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$PaymentIntent;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;->present(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    return-void
.end method

.method public final presentWithSetupIntent(Ljava/lang/String;)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "setupIntentClientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet;->presentWithSetupIntent$default(Lcom/stripe/android/paymentsheet/PaymentSheet;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ILjava/lang/Object;)V

    return-void
.end method

.method public final presentWithSetupIntent(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "setupIntentClientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet;->paymentSheetLauncher:Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$SetupIntent;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$SetupIntent;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;->present(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    return-void
.end method

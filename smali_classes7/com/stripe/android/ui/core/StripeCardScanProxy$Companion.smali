.class public final Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/StripeCardScanProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JS\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u000e\u0012\u0004\u0012\u00020\u000f0\n2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013JS\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00082!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u000e\u0012\u0004\u0012\u00020\u000f0\n2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;",
        "",
        "()V",
        "create",
        "Lcom/stripe/android/ui/core/StripeCardScanProxy;",
        "activity",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "stripePublishableKey",
        "",
        "onFinished",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
        "Lkotlin/ParameterName;",
        "name",
        "cardScanSheetResult",
        "",
        "provider",
        "Lkotlin/Function0;",
        "isStripeCardScanAvailable",
        "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "removeCardScanFragment",
        "supportFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "payments-ui-core_release"
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->$$INSTANCE:Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;ILjava/lang/Object;)Lcom/stripe/android/ui/core/StripeCardScanProxy;
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    new-instance p4, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$2;

    invoke-direct {p4, p1, p2, p3}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$2;-><init>(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    new-instance p5, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    invoke-direct {p5}, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;-><init>()V

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->create(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)Lcom/stripe/android/ui/core/StripeCardScanProxy;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic create$default(Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;ILjava/lang/Object;)Lcom/stripe/android/ui/core/StripeCardScanProxy;
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    new-instance p4, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$1;

    invoke-direct {p4, p1, p2, p3}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$1;-><init>(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    new-instance p5, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    invoke-direct {p5}, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;-><init>()V

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->create(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)Lcom/stripe/android/ui/core/StripeCardScanProxy;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic removeCardScanFragment$default(Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;Landroidx/fragment/app/FragmentManager;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    invoke-direct {p2}, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->removeCardScanFragment(Landroidx/fragment/app/FragmentManager;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)V

    return-void
.end method


# virtual methods
.method public final create(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)Lcom/stripe/android/ui/core/StripeCardScanProxy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/appcompat/app/AppCompatActivity;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/stripe/android/ui/core/StripeCardScanProxy;",
            ">;",
            "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;",
            ")",
            "Lcom/stripe/android/ui/core/StripeCardScanProxy;"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "stripePublishableKey"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onFinished"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "provider"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "isStripeCardScanAvailable"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p5}, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;->invoke()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/StripeCardScanProxy;

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/stripe/android/ui/core/UnsupportedStripeCardScanProxy;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/UnsupportedStripeCardScanProxy;-><init>()V

    :goto_0
    return-object p1
.end method

.method public final create(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)Lcom/stripe/android/ui/core/StripeCardScanProxy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/stripe/android/ui/core/StripeCardScanProxy;",
            ">;",
            "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;",
            ")",
            "Lcom/stripe/android/ui/core/StripeCardScanProxy;"
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "stripePublishableKey"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onFinished"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "provider"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "isStripeCardScanAvailable"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p5}, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;->invoke()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/StripeCardScanProxy;

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/stripe/android/ui/core/UnsupportedStripeCardScanProxy;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/UnsupportedStripeCardScanProxy;-><init>()V

    :goto_0
    return-object p1
.end method

.method public final removeCardScanFragment(Landroidx/fragment/app/FragmentManager;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)V
    .locals 1

    const-string v0, "supportFragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isStripeCardScanAvailable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;->invoke()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;->Companion:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;->removeCardScanFragment(Landroidx/fragment/app/FragmentManager;)V

    :cond_0
    return-void
.end method

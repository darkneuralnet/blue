.class public final Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000c2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;",
        "",
        "()V",
        "create",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;",
        "activity",
        "Landroidx/activity/ComponentActivity;",
        "callback",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;",
        "",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;

    invoke-direct {v0}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;->$$INSTANCE:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;->create$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;->create$lambda$1(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V

    return-void
.end method

.method private static final create$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final create$lambda$1(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/ComponentActivity;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/payments/bankaccount/StripeCollectBankAccountLauncher;

    new-instance v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;

    invoke-direct {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;-><init>()V

    new-instance v2, Lbm0;

    invoke-direct {v2, p2}, Lbm0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1, v2}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    const-string p2, "activity.registerForActi\u2026ack(it)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/bankaccount/StripeCollectBankAccountLauncher;-><init>(LB5;)V

    return-object v0
.end method

.method public final create(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;"
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/payments/bankaccount/StripeCollectBankAccountLauncher;

    new-instance v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;

    invoke-direct {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;-><init>()V

    new-instance v2, Lcm0;

    invoke-direct {v2, p2}, Lcm0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1, v2}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    const-string p2, "fragment.registerForActi\u2026ack(it)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/bankaccount/StripeCollectBankAccountLauncher;-><init>(LB5;)V

    return-object v0
.end method

.class public final Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bB\u0019\u0008\u0016\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010B\u0019\u0008\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0013B!\u0008\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "configuration",
        "",
        "present",
        "LB5;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;",
        "activityResultLauncher",
        "LB5;",
        "<init>",
        "(LB5;)V",
        "Landroidx/activity/ComponentActivity;",
        "activity",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;",
        "callback",
        "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V",
        "Landroidx/fragment/app/Fragment;",
        "fragment",
        "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V",
        "Landroidx/activity/result/ActivityResultRegistry;",
        "registry",
        "(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V",
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
.field private final activityResultLauncher:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LB5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5<",
            "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activityResultLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;->activityResultLauncher:LB5;

    return-void
.end method

.method public constructor <init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;-><init>()V

    new-instance v1, Lhm1;

    invoke-direct {v1, p2}, Lhm1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V

    invoke-virtual {p1, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    const-string p2, "activity.registerForActi\u2026SheetResult(it)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;-><init>(LB5;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V
    .locals 2

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "registry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;-><init>()V

    new-instance v1, Lgm1;

    invoke-direct {v1, p3}, Lgm1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V

    invoke-virtual {p1, v0, p2, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Lv5;Landroidx/activity/result/ActivityResultRegistry;Lt5;)LB5;

    move-result-object p1

    const-string p2, "fragment.registerForActi\u2026SheetResult(it)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;-><init>(LB5;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V
    .locals 2

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;-><init>()V

    new-instance v1, Lfm1;

    invoke-direct {v1, p2}, Lfm1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    const-string p2, "fragment.registerForActi\u2026SheetResult(it)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;-><init>(LB5;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;->onFinancialConnectionsSheetResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V

    return-void
.end method

.method private static final _init_$lambda$1(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;->onFinancialConnectionsSheetResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V

    return-void
.end method

.method private static final _init_$lambda$2(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;->onFinancialConnectionsSheetResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;->_init_$lambda$2(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V

    return-void
.end method

.method public static synthetic b(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;->_init_$lambda$0(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V

    return-void
.end method

.method public static synthetic c(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;->_init_$lambda$1(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V

    return-void
.end method


# virtual methods
.method public present(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V
    .locals 2

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;->activityResultLauncher:LB5;

    new-instance v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    invoke-virtual {v0, v1}, LB5;->a(Ljava/lang/Object;)V

    return-void
.end method

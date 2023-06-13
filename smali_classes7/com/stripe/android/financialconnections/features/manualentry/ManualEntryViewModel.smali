.class public final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 !2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BA\u0008\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0008\u0010\u0005\u001a\u00020\u0003H\u0002J\u000e\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0003R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "",
        "observeInputs",
        "observeAsyncs",
        "",
        "input",
        "onRoutingEntered",
        "onAccountEntered",
        "onAccountConfirmEntered",
        "onSubmit",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;",
        "pollAttachPaymentAccount",
        "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "getManifest",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "goNext",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "initialState",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V",
        "Companion",
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
        "SMAP\nManualEntryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntryViewModel.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,189:1\n429#2:190\n502#2,5:191\n429#2:196\n502#2,5:197\n429#2:202\n502#2,5:203\n*S KotlinDebug\n*F\n+ 1 ManualEntryViewModel.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel\n*L\n106#1:190\n106#1:191,5\n111#1:196\n111#1:197,5\n116#1:202\n116#1:203,5\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;


# instance fields
.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

.field private final goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

.field private final pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->Companion:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V
    .locals 2

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollAttachPaymentAccount"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getManifest"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goNext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->observeAsyncs()V

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->observeInputs()V

    new-instance p2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$1;

    invoke-direct {p2, p0, v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 p3, 0x0

    const/4 p4, 0x0

    sget-object p5, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$2;

    const/4 p6, 0x3

    const/4 p7, 0x0

    move-object p1, p0

    invoke-static/range {p1 .. p7}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetManifest$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/GetManifest;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    return-object p0
.end method

.method public static final synthetic access$getGoNext$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/GoNext;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNativeAuthFlowCoordinator$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    return-object p0
.end method

.method public static final synthetic access$getPollAttachPaymentAccount$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    return-object p0
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$withState(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-virtual {p0, p1}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final observeAsyncs()V
    .locals 13

    sget-object v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$1;

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$2;

    const/4 v6, 0x0

    invoke-direct {v3, p0, v6}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$2;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LRN2;->onAsync$default(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    sget-object v8, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$3;

    new-instance v9, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$4;

    invoke-direct {v9, p0, v6}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$4;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v12}, LRN2;->onAsync$default(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final observeInputs()V
    .locals 3

    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$1;

    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1}, LRN2;->onEach(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)Lzh2;

    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$3;

    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$4;

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$4;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1}, LRN2;->onEach(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)Lzh2;

    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$5;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$5;

    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$6;

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$6;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1}, LRN2;->onEach(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)Lzh2;

    return-void
.end method


# virtual methods
.method public final onAccountConfirmEntered(Ljava/lang/String;)V
    .locals 5

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "filterTo(StringBuilder(), predicate).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onAccountConfirmEntered$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onAccountConfirmEntered$1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onAccountEntered(Ljava/lang/String;)V
    .locals 5

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "filterTo(StringBuilder(), predicate).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onAccountEntered$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onAccountEntered$1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onRoutingEntered(Ljava/lang/String;)V
    .locals 5

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "filterTo(StringBuilder(), predicate).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onRoutingEntered$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onRoutingEntered$1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onSubmit()V
    .locals 7

    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

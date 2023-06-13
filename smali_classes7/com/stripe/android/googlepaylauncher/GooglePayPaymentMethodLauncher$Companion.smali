.class public final Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion;",
        "",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
        "config",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;",
        "readyCallback",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;",
        "resultCallback",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;",
        "rememberLauncher",
        "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;LEt0;I)Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;",
        "",
        "DEVELOPER_ERROR",
        "I",
        "INTERNAL_ERROR",
        "NETWORK_ERROR",
        "",
        "PRODUCT_USAGE_TOKEN",
        "Ljava/lang/String;",
        "<init>",
        "()V",
        "payments-core_release"
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
        "SMAP\nGooglePayPaymentMethodLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayPaymentMethodLauncher.kt\ncom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,425:1\n76#2:426\n76#2:427\n36#3:428\n955#4,6:429\n89#5:435\n*S KotlinDebug\n*F\n+ 1 GooglePayPaymentMethodLauncher.kt\ncom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion\n*L\n404#1:426\n405#1:427\n411#1:428\n411#1:429,6\n402#1:435\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$rememberLauncher$lambda$0(LsP5;)Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion;->rememberLauncher$lambda$0(LsP5;)Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;

    move-result-object p0

    return-object p0
.end method

.method private static final rememberLauncher$lambda$0(LsP5;)Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;",
            ">;)",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;

    return-object p0
.end method


# virtual methods
.method public final rememberLauncher(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;LEt0;I)Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;
    .locals 7

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readyCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x53e66a87

    invoke-interface {p4, v0}, LEt0;->F(I)V

    shr-int/lit8 p5, p5, 0x3

    and-int/lit8 p5, p5, 0xe

    invoke-static {p2, p4, p5}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p2

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object p5

    invoke-interface {p4, p5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p5

    move-object v1, p5

    check-cast v1, Landroid/content/Context;

    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object p5

    invoke-interface {p4, p5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, LLifecycleOwner;

    invoke-static {p5}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v2

    new-instance p5, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract;

    invoke-direct {p5}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract;-><init>()V

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion$rememberLauncher$activityResultLauncher$1;

    invoke-direct {v0, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion$rememberLauncher$activityResultLauncher$1;-><init>(Ljava/lang/Object;)V

    const/4 p3, 0x0

    invoke-static {p5, v0, p4, p3}, LD5;->a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;

    move-result-object v3

    const p3, -0x384212

    invoke-interface {p4, p3}, LEt0;->F(I)V

    invoke-interface {p4, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_0

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p5, p3, :cond_1

    :cond_0
    new-instance p5, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;

    new-instance v5, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion$rememberLauncher$1$1;

    invoke-direct {v5, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion$rememberLauncher$1$1;-><init>(LsP5;)V

    const/4 v6, 0x0

    move-object v0, p5

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;-><init>(Landroid/content/Context;LZC0;LB5;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p4, p5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p4}, LEt0;->Q()V

    check-cast p5, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;

    invoke-interface {p4}, LEt0;->Q()V

    return-object p5
.end method

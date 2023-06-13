.class public final Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion;",
        "",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;",
        "config",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;",
        "readyCallback",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;",
        "resultCallback",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;",
        "rememberLauncher",
        "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;LEt0;I)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;",
        "",
        "PRODUCT_USAGE",
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
        "SMAP\nGooglePayLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayLauncher.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,341:1\n76#2:342\n76#2:343\n36#3:344\n955#4,6:345\n89#5:351\n*S KotlinDebug\n*F\n+ 1 GooglePayLauncher.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion\n*L\n306#1:342\n307#1:343\n313#1:344\n313#1:345,6\n304#1:351\n*E\n"
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

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$rememberLauncher$lambda$0(LsP5;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion;->rememberLauncher$lambda$0(LsP5;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;

    move-result-object p0

    return-object p0
.end method

.method private static final rememberLauncher$lambda$0(LsP5;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;",
            ">;)",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;

    return-object p0
.end method


# virtual methods
.method public final rememberLauncher(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;LEt0;I)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;
    .locals 9

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readyCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x13aa0fa6

    invoke-interface {p4, v0}, LEt0;->F(I)V

    shr-int/lit8 p5, p5, 0x3

    and-int/lit8 p5, p5, 0xe

    invoke-static {p2, p4, p5}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p2

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object p5

    invoke-interface {p4, p5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroid/content/Context;

    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v0

    invoke-interface {p4, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLifecycleOwner;

    invoke-static {v0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v2

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract;

    invoke-direct {v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract;-><init>()V

    new-instance v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion$rememberLauncher$activityResultLauncher$1;

    invoke-direct {v1, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion$rememberLauncher$activityResultLauncher$1;-><init>(Ljava/lang/Object;)V

    const/4 p3, 0x0

    invoke-static {v0, v1, p4, p3}, LD5;->a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;

    move-result-object v5

    const p3, -0x384212

    invoke-interface {p4, p3}, LEt0;->F(I)V

    invoke-interface {p4, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_0

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_1

    :cond_0
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;

    new-instance v4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion$rememberLauncher$1$1;

    invoke-direct {v4, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion$rememberLauncher$1$1;-><init>(LsP5;)V

    new-instance v6, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion$rememberLauncher$1$2;

    invoke-direct {v6, p5, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion$rememberLauncher$1$2;-><init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;)V

    new-instance v7, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object p2, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {p2, p5}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object p2

    const-string p3, "GooglePayLauncher"

    invoke-static {p3}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p3

    invoke-direct {v7, p5, p2, p3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)V

    new-instance v8, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    invoke-direct {v8}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>()V

    move-object v1, v0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;-><init>(LZC0;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;LB5;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V

    invoke-interface {p4, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p4}, LEt0;->Q()V

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;

    invoke-interface {p4}, LEt0;->Q()V

    return-object v0
.end method

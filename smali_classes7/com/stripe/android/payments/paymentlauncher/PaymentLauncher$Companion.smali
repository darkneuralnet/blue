.class public final Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0007J+\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;",
        "",
        "Landroidx/activity/ComponentActivity;",
        "activity",
        "",
        "publishableKey",
        "stripeAccountId",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;",
        "callback",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "create",
        "Landroidx/fragment/app/Fragment;",
        "fragment",
        "createForCompose",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;LEt0;II)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "rememberLauncher",
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
        "SMAP\nPaymentLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLauncher.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,134:1\n76#2:135\n76#2:136\n50#3:137\n49#3:138\n955#4,6:139\n*S KotlinDebug\n*F\n+ 1 PaymentLauncher.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion\n*L\n97#1:135\n119#1:136\n125#1:137\n125#1:138\n125#1:139,6\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;

    invoke-direct {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->$$INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;ILjava/lang/Object;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->create(Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic create$default(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;ILjava/lang/Object;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->create(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Landroidx/activity/ComponentActivity;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->create$default(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;ILjava/lang/Object;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p1

    return-object p1
.end method

.method public final create(Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;

    invoke-direct {v0, p1, p4}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;-><init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V

    invoke-virtual {v0, p2, p3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p1

    return-object p1
.end method

.method public final create(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->create$default(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;ILjava/lang/Object;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p1

    return-object p1
.end method

.method public final create(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;

    invoke-direct {v0, p1, p4}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;-><init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V

    invoke-virtual {v0, p2, p3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p1

    return-object p1
.end method

.method public final createForCompose(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;LEt0;II)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        message = "This method creates a new PaymentLauncher object every time it is called, evenduring recompositions."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "PaymentLauncher.rememberLauncher(publishableKey, stripeAccountId, callback)"
            imports = {}
        .end subannotation
    .end annotation

    const-string p5, "publishableKey"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "callback"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p5, 0x53307a35

    invoke-interface {p4, p5}, LEt0;->F(I)V

    and-int/lit8 p5, p6, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    new-instance p5, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object p6

    invoke-interface {p4, p6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Landroid/content/Context;

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;

    invoke-direct {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;-><init>()V

    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion$createForCompose$1;

    invoke-direct {v1, p3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion$createForCompose$1;-><init>(Ljava/lang/Object;)V

    const/4 p3, 0x0

    invoke-static {v0, v1, p4, p3}, LD5;->a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;

    move-result-object p3

    invoke-direct {p5, p6, p3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;-><init>(Landroid/content/Context;LB5;)V

    invoke-virtual {p5, p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p1

    invoke-interface {p4}, LEt0;->Q()V

    return-object p1
.end method

.method public final rememberLauncher(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;LEt0;II)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 1

    const-string p5, "publishableKey"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "callback"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p5, 0x1a522dd

    invoke-interface {p4, p5}, LEt0;->F(I)V

    and-int/lit8 p5, p6, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object p5

    invoke-interface {p4, p5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroid/content/Context;

    new-instance p6, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;

    invoke-direct {p6}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;-><init>()V

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion$rememberLauncher$activityResultLauncher$1;

    invoke-direct {v0, p3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion$rememberLauncher$activityResultLauncher$1;-><init>(Ljava/lang/Object;)V

    const/4 p3, 0x0

    invoke-static {p6, v0, p4, p3}, LD5;->a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;

    move-result-object p3

    const p6, -0x384098

    invoke-interface {p4, p6}, LEt0;->F(I)V

    invoke-interface {p4, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p6

    invoke-interface {p4, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p6, v0

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p6, :cond_1

    sget-object p6, LEt0;->a:LEt0$a;

    invoke-virtual {p6}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p6

    if-ne v0, p6, :cond_2

    :cond_1
    new-instance p6, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;

    invoke-direct {p6, p5, p3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;-><init>(Landroid/content/Context;LB5;)V

    invoke-virtual {p6, p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object v0

    invoke-interface {p4, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p4}, LEt0;->Q()V

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    invoke-interface {p4}, LEt0;->Q()V

    return-object v0
.end method

.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;",
        "callback",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;",
        "rememberAddressLauncher",
        "(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;LEt0;I)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAddressLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressLauncher.kt\ncom/stripe/android/paymentsheet/addresselement/AddressLauncherKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,221:1\n25#2:222\n1057#3,6:223\n*S KotlinDebug\n*F\n+ 1 AddressLauncher.kt\ncom/stripe/android/paymentsheet/addresselement/AddressLauncherKt\n*L\n217#1:222\n217#1:223,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final rememberAddressLauncher(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;LEt0;I)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;
    .locals 3

    const-string v0, "callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3322c1ed

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.addresselement.rememberAddressLauncher (AddressLauncher.kt:208)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance p2, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract;-><init>()V

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherKt$rememberAddressLauncher$activityResultLauncher$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherKt$rememberAddressLauncher$activityResultLauncher$1;-><init>(Ljava/lang/Object;)V

    const/4 p0, 0x0

    invoke-static {p2, v0, p1, p0}, LD5;->a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;

    move-result-object p0

    const p2, -0x1d58f75c

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_1

    new-instance p2, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;

    invoke-direct {p2, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;-><init>(LB5;)V

    invoke-interface {p1, p2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    check-cast p2, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method

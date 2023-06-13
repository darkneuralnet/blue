.class public final Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a9\u0010\t\u001a\u00020\u00052\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
        "state",
        "",
        "isEnabled",
        "Lkotlin/Function0;",
        "",
        "onPressed",
        "LgV2;",
        "modifier",
        "GooglePayButton",
        "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V",
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
        "SMAP\nGooglePayButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayButton.kt\ncom/stripe/android/paymentsheet/ui/GooglePayButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,106:1\n67#2,3:107\n66#2:110\n1057#3,6:111\n*S KotlinDebug\n*F\n+ 1 GooglePayButton.kt\ncom/stripe/android/paymentsheet/ui/GooglePayButtonKt\n*L\n24#1:107,3\n24#1:110\n24#1:111,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final GooglePayButton(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const-string v0, "onPressed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x76217a50

    invoke-interface {p4, v0}, LEt0;->u(I)LEt0;

    move-result-object p4

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, p5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p5, 0xe

    if-nez v1, :cond_2

    invoke-interface {p4, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_2
    move v1, p5

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, p5, 0x70

    if-nez v2, :cond_5

    invoke-interface {p4, p1}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v2, p5, 0x380

    if-nez v2, :cond_8

    invoke-interface {p4, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x100

    goto :goto_4

    :cond_7
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_8
    :goto_5
    and-int/lit8 v2, p6, 0x8

    if-eqz v2, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v3, p5, 0x1c00

    if-nez v3, :cond_b

    invoke-interface {p4, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/16 v3, 0x800

    goto :goto_6

    :cond_a
    const/16 v3, 0x400

    :goto_6
    or-int/2addr v1, v3

    :cond_b
    :goto_7
    and-int/lit16 v3, v1, 0x16db

    const/16 v4, 0x492

    if-ne v3, v4, :cond_e

    invoke-interface {p4}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {p4}, LEt0;->k()V

    :cond_d
    :goto_8
    move-object v5, p3

    goto :goto_a

    :cond_e
    :goto_9
    if-eqz v2, :cond_f

    sget-object p3, LgV2;->b0:LgV2$a;

    :cond_f
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_10

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.GooglePayButton (GooglePayButton.kt:15)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_10
    const-string v0, "google-pay-button"

    invoke-static {p3, v0}, Lo06;->a(LgV2;Ljava/lang/String;)LgV2;

    move-result-object v2

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$1;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const v3, 0x607fb4c4

    invoke-interface {p4, v3}, LEt0;->F(I)V

    invoke-interface {p4, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p4, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-interface {p4, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_11

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_12

    :cond_11
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1;

    invoke-direct {v3, p1, p0, p2}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1;-><init>(ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$State;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p4, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_12
    invoke-interface {p4}, LEt0;->Q()V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v4, p4

    invoke-static/range {v1 .. v6}, Lje;->a(Lkotlin/jvm/functions/Function1;LgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LQt0;->Y()V

    goto :goto_8

    :goto_a
    invoke-interface {p4}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_13

    goto :goto_b

    :cond_13
    new-instance p4, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$3;

    move-object v1, p4

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$3;-><init>(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLkotlin/jvm/functions/Function0;LgV2;II)V

    invoke-interface {p3, p4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_b
    return-void
.end method

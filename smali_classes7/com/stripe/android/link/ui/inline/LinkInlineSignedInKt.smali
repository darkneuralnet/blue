.class public final Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "linkPaymentLauncher",
        "Lkotlin/Function0;",
        "",
        "onLogout",
        "LgV2;",
        "modifier",
        "LinkInlineSignedIn",
        "(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V",
        "link_release"
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
        "SMAP\nLinkInlineSignedIn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignedIn.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignedInKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,95:1\n81#2,11:96\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignedIn.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignedInKt\n*L\n39#1:96,11\n*E\n"
    }
.end annotation


# direct methods
.method public static final LinkInlineSignedIn(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const-string v0, "linkPaymentLauncher"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLogout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5b8c0f23

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_0

    sget-object p2, LgV2;->b0:LgV2$a;

    :cond_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.inline.LinkInlineSignedIn (LinkInlineSignedIn.kt:32)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkPaymentLauncher;->getComponent$link_release()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v4, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->getInjector()Lcom/stripe/android/core/injection/NonFallbackInjector;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;-><init>(Lcom/stripe/android/core/injection/NonFallbackInjector;)V

    const v0, 0x671a9c9b

    invoke-interface {p3, v0}, LEt0;->F(I)V

    sget-object v0, Lpv2;->a:Lpv2;

    const/4 v1, 0x6

    invoke-virtual {v0, p3, v1}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v2

    if-eqz v2, :cond_6

    const/4 v3, 0x0

    instance-of v0, v2, Landroidx/lifecycle/e;

    if-eqz v0, :cond_3

    move-object v0, v2

    check-cast v0, Landroidx/lifecycle/e;

    invoke-interface {v0}, Landroidx/lifecycle/e;->getDefaultViewModelCreationExtras()LFE0;

    move-result-object v0

    const-string v1, "{\n        viewModelStore\u2026ModelCreationExtras\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    sget-object v0, LFE0$a;->b:LFE0$a;

    :goto_0
    move-object v5, v0

    const-class v1, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    const v7, 0x9048

    const/4 v8, 0x0

    move-object v6, p3

    invoke-static/range {v1 .. v8}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v0

    invoke-interface {p3}, LEt0;->Q()V

    check-cast v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getAccountEmail()LEu1;

    move-result-object v1

    const-string v2, ""

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, p3

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;

    invoke-direct {v5, p2, v1, v0, p1}, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;-><init>(LgV2;LsP5;Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/jvm/functions/Function0;)V

    const v0, -0x62ff5929

    const/4 v1, 0x1

    invoke-static {p3, v0, v1, v5}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v6, 0xc00

    const/4 v7, 0x7

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v0

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_5

    goto :goto_2

    :cond_5
    new-instance v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$2;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$2;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function0;LgV2;II)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

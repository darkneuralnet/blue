.class public final Lcom/stripe/android/link/ui/verification/VerificationDialogKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007*\\\u0008\u0007\u0010\u0011\"\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0004\u0012\u00020\u00040\u00022\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0004\u0012\u00020\u00040\u0002B\u0018\u0008\u000b\u0012\n\u0008\u000c\u0012\u0006\u0008\n0\r8\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "linkLauncher",
        "Lkotlin/Function1;",
        "",
        "",
        "onResult",
        "LinkVerificationDialog",
        "(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "Lkotlin/ParameterName;",
        "name",
        "success",
        "Lkotlin/Deprecated;",
        "level",
        "Lkotlin/DeprecationLevel;",
        "WARNING",
        "message",
        "This interface isn\'t meant for public consumption.",
        "LinkVerificationCallback",
        "link_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static synthetic LinkVerificationCallback$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->WARNING:Lkotlin/DeprecationLevel;
        message = "This interface isn\'t meant for public consumption."
    .end annotation

    return-void
.end method

.method public static final LinkVerificationDialog(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "linkLauncher"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3bbb723

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.verification.LinkVerificationDialog (VerificationDialog.kt:44)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ld13;

    const/16 v1, 0x8

    invoke-static {v0, p2, v1}, LPY2;->e([Ld13;LEt0;I)LOY2;

    move-result-object v1

    sget-object v0, Lcom/stripe/android/link/LinkScreen$VerificationDialog;->INSTANCE:Lcom/stripe/android/link/LinkScreen$VerificationDialog;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1;

    invoke-direct {v5, p0, v1, p1, p3}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher;LOY2;Lkotlin/jvm/functions/Function1;I)V

    const/16 v7, 0x8

    const/16 v8, 0xc

    move-object v6, p2

    invoke-static/range {v1 .. v8}, LRY2;->b(LOY2;Ljava/lang/String;LgV2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$2;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

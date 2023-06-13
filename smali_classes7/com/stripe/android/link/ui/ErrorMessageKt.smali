.class public final Lcom/stripe/android/link/ui/ErrorMessageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "getErrorMessage",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "",
        "link_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/link/ui/ErrorMessage;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/core/exception/APIConnectionException;

    if-eqz v0, :cond_0

    new-instance p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;

    sget v0, Lcom/stripe/android/link/R$string;->stripe_failure_connection_error:I

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;-><init>(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    new-instance v0, Lcom/stripe/android/link/ui/ErrorMessage$Raw;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/ui/ErrorMessage$Raw;-><init>(Ljava/lang/String;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;

    sget v0, Lcom/stripe/android/link/R$string;->stripe_internal_error:I

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;-><init>(I)V

    :goto_0
    return-object p0
.end method

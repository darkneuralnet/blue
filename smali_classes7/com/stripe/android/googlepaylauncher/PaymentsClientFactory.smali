.class public final Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;",
        "",
        "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
        "environment",
        "LEP3;",
        "create",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final create(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;)LEP3;
    .locals 1

    const-string v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPx6$a$a;

    invoke-direct {v0}, LPx6$a$a;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->getValue$payments_core_release()I

    move-result p1

    invoke-virtual {v0, p1}, LPx6$a$a;->b(I)LPx6$a$a;

    move-result-object p1

    invoke-virtual {p1}, LPx6$a$a;->a()LPx6$a;

    move-result-object p1

    const-string v0, "Builder()\n            .s\u2026lue)\n            .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;->context:Landroid/content/Context;

    invoke-static {v0, p1}, LPx6;->b(Landroid/content/Context;LPx6$a;)LEP3;

    move-result-object p1

    const-string v0, "getPaymentsClient(context, options)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

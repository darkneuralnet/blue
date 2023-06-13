.class public final Lcom/stripe/android/PaymentAuthConfig$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentAuthConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0004H\u0007J\r\u0010\n\u001a\u00020\u0008H\u0000\u00a2\u0006\u0002\u0008\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/PaymentAuthConfig$Companion;",
        "",
        "()V",
        "DEFAULT",
        "Lcom/stripe/android/PaymentAuthConfig;",
        "instance",
        "get",
        "init",
        "",
        "config",
        "reset",
        "reset$payments_core_release",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/PaymentAuthConfig$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Lcom/stripe/android/PaymentAuthConfig;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    invoke-static {}, Lcom/stripe/android/PaymentAuthConfig;->access$getInstance$cp()Lcom/stripe/android/PaymentAuthConfig;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/stripe/android/PaymentAuthConfig;->access$getDEFAULT$cp()Lcom/stripe/android/PaymentAuthConfig;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final init(Lcom/stripe/android/PaymentAuthConfig;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/stripe/android/PaymentAuthConfig;->access$setInstance$cp(Lcom/stripe/android/PaymentAuthConfig;)V

    return-void
.end method

.method public final synthetic reset$payments_core_release()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/stripe/android/PaymentAuthConfig;->access$setInstance$cp(Lcom/stripe/android/PaymentAuthConfig;)V

    return-void
.end method

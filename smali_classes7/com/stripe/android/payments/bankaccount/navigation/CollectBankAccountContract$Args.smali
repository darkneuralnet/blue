.class public abstract Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Args"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;,
        Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;,
        Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00152\u00020\u0001:\u0003\u0015\u0016\u0017B1\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000e\u0082\u0001\u0002\u0018\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "Landroid/os/Parcelable;",
        "publishableKey",
        "",
        "stripeAccountId",
        "clientSecret",
        "configuration",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
        "attachToIntent",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Z)V",
        "getAttachToIntent",
        "()Z",
        "getClientSecret",
        "()Ljava/lang/String;",
        "getConfiguration",
        "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
        "getPublishableKey",
        "getStripeAccountId",
        "toBundle",
        "Landroid/os/Bundle;",
        "Companion",
        "ForPaymentIntent",
        "ForSetupIntent",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;",
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


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;


# instance fields
.field private final attachToIntent:Z

.field private final clientSecret:Ljava/lang/String;

.field private final configuration:Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

.field private final publishableKey:Ljava/lang/String;

.field private final stripeAccountId:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->Companion:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->publishableKey:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->stripeAccountId:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->clientSecret:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->configuration:Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    iput-boolean p5, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->attachToIntent:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Z)V

    return-void
.end method


# virtual methods
.method public getAttachToIntent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->attachToIntent:Z

    return v0
.end method

.method public getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->configuration:Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    return-object v0
.end method

.method public getPublishableKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public getStripeAccountId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->stripeAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final toBundle()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

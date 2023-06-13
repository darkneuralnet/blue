.class public final Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;
.super Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SetAsDefault"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;",
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;",
        "()V",
        "link_release"
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

.field public static final INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    sget v0, Lcom/stripe/android/link/R$string;->wallet_set_as_default:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v3, v1, v2}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

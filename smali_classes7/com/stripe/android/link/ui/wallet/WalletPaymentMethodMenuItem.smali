.class public abstract Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/link/ui/menus/LinkMenuItem;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$RemoveItem;,
        Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$EditCard;,
        Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;,
        Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Cancel;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0004\n\u000b\u000c\rB\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;",
        "Lcom/stripe/android/link/ui/menus/LinkMenuItem;",
        "textResId",
        "",
        "isDestructive",
        "",
        "(IZ)V",
        "()Z",
        "getTextResId",
        "()I",
        "Cancel",
        "EditCard",
        "RemoveItem",
        "SetAsDefault",
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Cancel;",
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$EditCard;",
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$RemoveItem;",
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;",
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


# instance fields
.field private final isDestructive:Z

.field private final textResId:I


# direct methods
.method private constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;->textResId:I

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;->isDestructive:Z

    return-void
.end method

.method public synthetic constructor <init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;-><init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;-><init>(IZ)V

    return-void
.end method


# virtual methods
.method public getTextResId()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;->textResId:I

    return v0
.end method

.method public isDestructive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;->isDestructive:Z

    return v0
.end method

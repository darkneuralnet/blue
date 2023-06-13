.class public final Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;
.super Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SavedPaymentMethod"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\n2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "displayName",
        "",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;)V",
        "getDisplayName",
        "()Ljava/lang/String;",
        "isEnabledDuringEditing",
        "",
        "()Z",
        "getPaymentMethod",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "viewType",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;",
        "getViewType",
        "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "",
        "getDescription",
        "resources",
        "Landroid/content/res/Resources;",
        "getRemoveDescription",
        "hashCode",
        "",
        "toString",
        "paymentsheet_release"
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


# instance fields
.field private final displayName:Ljava/lang/String;

.field private final isEnabledDuringEditing:Z

.field private final paymentMethod:Lcom/stripe/android/model/PaymentMethod;

.field private final viewType:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/stripe/android/model/PaymentMethod;->$stable:I

    sput v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;)V
    .locals 1

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->displayName:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->SavedPaymentMethod:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->viewType:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->isEnabledDuringEditing:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->displayName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->copy(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;
    .locals 1

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;-><init>(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->displayName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->displayName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDescription(Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 7

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const-string p1, ""

    goto :goto_2

    :cond_1
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->bank_account_ending_in:I

    new-array v1, v4, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod;->usBankAccount:Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    if-eqz v4, :cond_2

    iget-object v3, v4, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    :cond_2
    aput-object v3, v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->bank_account_ending_in:I

    new-array v1, v4, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod;->sepaDebit:Lcom/stripe/android/model/PaymentMethod$SepaDebit;

    if-eqz v4, :cond_4

    iget-object v3, v4, Lcom/stripe/android/model/PaymentMethod$SepaDebit;->last4:Ljava/lang/String;

    :cond_4
    aput-object v3, v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->card_ending_in:I

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v5, :cond_6

    iget-object v6, v5, Lcom/stripe/android/model/PaymentMethod$Card;->brand:Lcom/stripe/android/model/CardBrand;

    goto :goto_1

    :cond_6
    move-object v6, v3

    :goto_1
    aput-object v6, v1, v2

    if-eqz v5, :cond_7

    iget-object v3, v5, Lcom/stripe/android/model/PaymentMethod$Card;->last4:Ljava/lang/String;

    :cond_7
    aput-object v3, v1, v4

    invoke-virtual {p1, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    const-string v0, "when (paymentMethod.type\u2026     else -> \"\"\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final getRemoveDescription(Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 4

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_remove_pm:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getDescription(Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "resources.getString(\n   \u2026tion(resources)\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getViewType()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->viewType:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->displayName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethod;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isEnabledDuringEditing()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->isEnabledDuringEditing:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->displayName:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SavedPaymentMethod(displayName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethod="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/stripe/android/uicore/elements/IdentifierSpec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;,
        Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0019\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008!\u0010\"B\t\u0008\u0016\u00a2\u0006\u0004\u0008!\u0010#B-\u0008\u0017\u0012\u0006\u0010$\u001a\u00020\u0011\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0008\u0010&\u001a\u0004\u0018\u00010%\u00a2\u0006\u0004\u0008!\u0010\'J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u000bH\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\r\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\r\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006*"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "component1",
        "",
        "component2",
        "v1",
        "ignoreField",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "Ljava/lang/String;",
        "getV1",
        "()Ljava/lang/String;",
        "Z",
        "getIgnoreField",
        "()Z",
        "<init>",
        "(Ljava/lang/String;Z)V",
        "()V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ZLbt5;)V",
        "Companion",
        "$serializer",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation
.end field

.field private static final CardBrand:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final CardCvc:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final CardExpMonth:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final CardExpYear:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final CardNumber:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final City:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public static final Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

.field private static final Country:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final DependentLocality:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final Email:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final Line1:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final Line2:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final Name:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final OneLineAddress:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final Phone:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final PostalCode:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final SameAsShipping:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final SaveForFutureUse:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final SortingCode:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final State:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final Upi:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private static final Vpa:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# instance fields
.field private final ignoreField:Z

.field private final v1:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec$Creator;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "billing_details[name]"

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Name:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "card[brand]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CardBrand:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "card[number]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CardNumber:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "card[cvc]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CardCvc:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "card[exp_month]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CardExpMonth:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "card[exp_year]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CardExpYear:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "billing_details[email]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Email:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "billing_details[phone]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Phone:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "billing_details[address][line1]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Line1:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "billing_details[address][line2]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Line2:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "billing_details[address][city]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->City:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, ""

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->DependentLocality:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v5, "billing_details[address][postal_code]"

    invoke-direct {v0, v5, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->PostalCode:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->SortingCode:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "billing_details[address][state]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->State:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "billing_details[address][country]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Country:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "save_for_future_use"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->SaveForFutureUse:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "address"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->OneLineAddress:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "same_as_shipping"

    const/4 v5, 0x1

    invoke-direct {v0, v2, v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->SameAsShipping:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "upi"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Upi:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const-string v2, "upi[vpa]"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Vpa:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLbt5;)V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "This synthesized declaration should not be used directly"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = ""
            imports = {}
        .end subannotation
    .end annotation

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    sget-object p4, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    invoke-virtual {p4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->getDescriptor()LMs5;

    move-result-object p4

    invoke-static {p1, v0, p4}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    goto :goto_0

    :cond_1
    iput-boolean p3, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "v1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public static final synthetic access$getCardBrand$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CardBrand:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getCardCvc$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CardCvc:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getCardExpMonth$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CardExpMonth:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getCardExpYear$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CardExpYear:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getCardNumber$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->CardNumber:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->City:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Country:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getDependentLocality$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->DependentLocality:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Email:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Line1:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Line2:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Name:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getOneLineAddress$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->OneLineAddress:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Phone:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->PostalCode:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getSameAsShipping$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->SameAsShipping:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getSaveForFutureUse$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->SaveForFutureUse:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getSortingCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->SortingCode:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->State:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getUpi$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Upi:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static final synthetic access$getVpa$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Vpa:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->copy(Ljava/lang/String;Z)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0
.end method

.method public static final write$Self(Lcom/stripe/android/uicore/elements/IdentifierSpec;LUt0;LMs5;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, LUt0;->w(LMs5;ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    move v1, v0

    goto :goto_1

    :cond_0
    iget-boolean v2, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    iget-boolean p0, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    invoke-interface {p1, p2, v0, p0}, LUt0;->v(LMs5;IZ)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Z)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    const-string v0, "v1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    iget-boolean p1, p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getIgnoreField()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    return v0
.end method

.method public final getV1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IdentifierSpec(v1="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ignoreField="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->v1:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->ignoreField:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

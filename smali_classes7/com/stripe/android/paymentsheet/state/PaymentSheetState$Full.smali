.class public final Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/paymentsheet/state/PaymentSheetState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/state/PaymentSheetState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Full"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BI\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\t\u0010)\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J[\u0010,\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\t\u0010-\u001a\u00020.H\u00d6\u0001J\u0013\u0010/\u001a\u00020\u000c2\u0008\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020.H\u00d6\u0001J\t\u00103\u001a\u000204H\u00d6\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$\u00a8\u0006:"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetState;",
        "config",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "customerPaymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "savedSelection",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "isGooglePayReady",
        "",
        "linkState",
        "Lcom/stripe/android/paymentsheet/state/LinkState;",
        "newPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V",
        "getConfig",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "getCustomerPaymentMethods",
        "()Ljava/util/List;",
        "hasPaymentOptions",
        "getHasPaymentOptions",
        "()Z",
        "initialPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "getInitialPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "getLinkState",
        "()Lcom/stripe/android/paymentsheet/state/LinkState;",
        "getNewPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "getSavedSelection",
        "()Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "getStripeIntent",
        "()Lcom/stripe/android/model/StripeIntent;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentSheetState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetState.kt\ncom/stripe/android/paymentsheet/state/PaymentSheetState$Full\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n288#2,2:48\n*S KotlinDebug\n*F\n+ 1 PaymentSheetState.kt\ncom/stripe/android/paymentsheet/state/PaymentSheetState$Full\n*L\n35#1:48,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

.field private final customerPaymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final isGooglePayReady:Z

.field private final linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

.field private final newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

.field private final savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

.field private final stripeIntent:Lcom/stripe/android/model/StripeIntent;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            "Z",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
            ")V"
        }
    .end annotation

    const-string v0, "stripeIntent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerPaymentMethods"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedSelection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady:Z

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady:Z

    :cond_4
    move v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-object p5, v0

    move-object p6, v1

    move p7, v2

    move-object p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->copy(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/paymentsheet/model/SavedSelection;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady:Z

    return v0
.end method

.method public final component6()Lcom/stripe/android/paymentsheet/state/LinkState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            "Z",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
            ")",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;"
        }
    .end annotation

    const-string v0, "stripeIntent"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerPaymentMethods"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedSelection"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-object v1, v0

    move-object v2, p1

    move v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V

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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    return-object v0
.end method

.method public final getCustomerPaymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getHasPaymentOptions()Z
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public final getInitialPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;

    if-eqz v1, :cond_0

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/SavedSelection$Link;

    if-eqz v1, :cond_1

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    goto :goto_1

    :cond_1
    instance-of v0, v0, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    check-cast v4, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v2, :cond_4

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    move-object v0, v1

    :goto_1
    return-object v0
.end method

.method public final getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    return-object v0
.end method

.method public final getNewPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-object v0
.end method

.method public final getSavedSelection()Lcom/stripe/android/paymentsheet/model/SavedSelection;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    return-object v0
.end method

.method public final getStripeIntent()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/state/LinkState;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final isGooglePayReady()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady:Z

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Full(config="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stripeIntent="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", customerPaymentMethods="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", savedSelection="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isGooglePayReady="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", linkState="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", newPaymentSelection="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->customerPaymentMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/state/LinkState;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Shapes"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0008\u0012\u0006\u0010\u0006\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0008H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0008H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;",
        "Landroid/os/Parcelable;",
        "context",
        "Landroid/content/Context;",
        "cornerRadiusDp",
        "",
        "borderStrokeWidthDp",
        "(Landroid/content/Context;II)V",
        "",
        "(FF)V",
        "getBorderStrokeWidthDp",
        "()F",
        "getCornerRadiusDp",
        "component1",
        "component2",
        "copy",
        "describeContents",
        "equals",
        "",
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
        "Companion",
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;

.field private static final default:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;


# instance fields
.field private final borderStrokeWidthDp:F

.field private final cornerRadiusDp:F


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    sget-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getShapes()Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeShapes;->getCornerRadius()F

    move-result v2

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getShapes()Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v1

    invoke-direct {v0, v2, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;-><init>(FF)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->default:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->cornerRadiusDp:F

    iput p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->borderStrokeWidthDp:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/StripeThemeKt;->getRawValueFromDimenResource(Landroid/content/Context;I)F

    move-result p2

    invoke-static {p1, p3}, Lcom/stripe/android/uicore/StripeThemeKt;->getRawValueFromDimenResource(Landroid/content/Context;I)F

    move-result p1

    invoke-direct {p0, p2, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;-><init>(FF)V

    return-void
.end method

.method public static final synthetic access$getDefault$cp()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->default:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;FFILjava/lang/Object;)Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->cornerRadiusDp:F

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->borderStrokeWidthDp:F

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->copy(FF)Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->cornerRadiusDp:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->borderStrokeWidthDp:F

    return v0
.end method

.method public final copy(FF)Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;-><init>(FF)V

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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->cornerRadiusDp:F

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->cornerRadiusDp:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->borderStrokeWidthDp:F

    iget p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->borderStrokeWidthDp:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBorderStrokeWidthDp()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->borderStrokeWidthDp:F

    return v0
.end method

.method public final getCornerRadiusDp()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->cornerRadiusDp:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->cornerRadiusDp:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->borderStrokeWidthDp:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->cornerRadiusDp:F

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->borderStrokeWidthDp:F

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Shapes(cornerRadiusDp="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", borderStrokeWidthDp="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

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

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->cornerRadiusDp:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->borderStrokeWidthDp:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method

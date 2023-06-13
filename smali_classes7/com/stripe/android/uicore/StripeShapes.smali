.class public final Lcom/stripe/android/uicore/StripeShapes;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/uicore/StripeShapes;",
        "",
        "cornerRadius",
        "",
        "borderStrokeWidth",
        "borderStrokeWidthSelected",
        "(FFF)V",
        "getBorderStrokeWidth",
        "()F",
        "getBorderStrokeWidthSelected",
        "getCornerRadius",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stripe-ui-core_release"
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
.field private final borderStrokeWidth:F

.field private final borderStrokeWidthSelected:F

.field private final cornerRadius:F


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    iput p2, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    iput p3, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidthSelected:F

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/StripeShapes;FFFILjava/lang/Object;)Lcom/stripe/android/uicore/StripeShapes;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidthSelected:F

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/StripeShapes;->copy(FFF)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidthSelected:F

    return v0
.end method

.method public final copy(FFF)Lcom/stripe/android/uicore/StripeShapes;
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/StripeShapes;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/uicore/StripeShapes;-><init>(FFF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/StripeShapes;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/StripeShapes;

    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    iget v3, p1, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    iget v3, p1, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidthSelected:F

    iget p1, p1, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidthSelected:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBorderStrokeWidth()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    return v0
.end method

.method public final getBorderStrokeWidthSelected()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidthSelected:F

    return v0
.end method

.method public final getCornerRadius()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidthSelected:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    iget v2, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidthSelected:F

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "StripeShapes(cornerRadius="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", borderStrokeWidth="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", borderStrokeWidthSelected="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

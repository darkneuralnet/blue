.class public final Lcom/stripe/android/uicore/StripeComposeShapes;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0019\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\t\u0010\t\u001a\u00020\u0008H\u00c6\u0003J4\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0008H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R \u0010\n\u001a\u00020\u00028\u0006\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0004R \u0010\u000b\u001a\u00020\u00028\u0006\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0017\u001a\u0004\u0008\u0019\u0010\u0004R\u0017\u0010\u000c\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/uicore/StripeComposeShapes;",
        "",
        "Lk61;",
        "component1-D9Ej5fM",
        "()F",
        "component1",
        "component2-D9Ej5fM",
        "component2",
        "LDy5;",
        "component3",
        "borderStrokeWidth",
        "borderStrokeWidthSelected",
        "material",
        "copy-Md-fbLM",
        "(FFLDy5;)Lcom/stripe/android/uicore/StripeComposeShapes;",
        "copy",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "F",
        "getBorderStrokeWidth-D9Ej5fM",
        "getBorderStrokeWidthSelected-D9Ej5fM",
        "LDy5;",
        "getMaterial",
        "()LDy5;",
        "<init>",
        "(FFLDy5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
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


# instance fields
.field private final borderStrokeWidth:F

.field private final borderStrokeWidthSelected:F

.field private final material:LDy5;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(FFLDy5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidth:F

    iput p2, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidthSelected:F

    iput-object p3, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->material:LDy5;

    return-void
.end method

.method public synthetic constructor <init>(FFLDy5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/StripeComposeShapes;-><init>(FFLDy5;)V

    return-void
.end method

.method public static synthetic copy-Md-fbLM$default(Lcom/stripe/android/uicore/StripeComposeShapes;FFLDy5;ILjava/lang/Object;)Lcom/stripe/android/uicore/StripeComposeShapes;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidth:F

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidthSelected:F

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->material:LDy5;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/StripeComposeShapes;->copy-Md-fbLM(FFLDy5;)Lcom/stripe/android/uicore/StripeComposeShapes;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidth:F

    return v0
.end method

.method public final component2-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidthSelected:F

    return v0
.end method

.method public final component3()LDy5;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->material:LDy5;

    return-object v0
.end method

.method public final copy-Md-fbLM(FFLDy5;)Lcom/stripe/android/uicore/StripeComposeShapes;
    .locals 2

    const-string v0, "material"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/StripeComposeShapes;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/stripe/android/uicore/StripeComposeShapes;-><init>(FFLDy5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/StripeComposeShapes;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/StripeComposeShapes;

    iget v1, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidth:F

    iget v3, p1, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidth:F

    invoke-static {v1, v3}, Lk61;->i(FF)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidthSelected:F

    iget v3, p1, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidthSelected:F

    invoke-static {v1, v3}, Lk61;->i(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->material:LDy5;

    iget-object p1, p1, Lcom/stripe/android/uicore/StripeComposeShapes;->material:LDy5;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBorderStrokeWidth-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidth:F

    return v0
.end method

.method public final getBorderStrokeWidthSelected-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidthSelected:F

    return v0
.end method

.method public final getMaterial()LDy5;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->material:LDy5;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidth:F

    invoke-static {v0}, Lk61;->j(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidthSelected:F

    invoke-static {v1}, Lk61;->j(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->material:LDy5;

    invoke-virtual {v1}, LDy5;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidth:F

    invoke-static {v0}, Lk61;->k(F)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->borderStrokeWidthSelected:F

    invoke-static {v1}, Lk61;->k(F)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/uicore/StripeComposeShapes;->material:LDy5;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "StripeComposeShapes(borderStrokeWidth="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", borderStrokeWidthSelected="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", material="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

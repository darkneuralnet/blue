.class public final Lcom/stripe/android/uicore/PrimaryButtonStyle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/uicore/PrimaryButtonStyle;",
        "",
        "colorsLight",
        "Lcom/stripe/android/uicore/PrimaryButtonColors;",
        "colorsDark",
        "shape",
        "Lcom/stripe/android/uicore/PrimaryButtonShape;",
        "typography",
        "Lcom/stripe/android/uicore/PrimaryButtonTypography;",
        "(Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonShape;Lcom/stripe/android/uicore/PrimaryButtonTypography;)V",
        "getColorsDark",
        "()Lcom/stripe/android/uicore/PrimaryButtonColors;",
        "getColorsLight",
        "getShape",
        "()Lcom/stripe/android/uicore/PrimaryButtonShape;",
        "getTypography",
        "()Lcom/stripe/android/uicore/PrimaryButtonTypography;",
        "component1",
        "component2",
        "component3",
        "component4",
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
.field private final colorsDark:Lcom/stripe/android/uicore/PrimaryButtonColors;

.field private final colorsLight:Lcom/stripe/android/uicore/PrimaryButtonColors;

.field private final shape:Lcom/stripe/android/uicore/PrimaryButtonShape;

.field private final typography:Lcom/stripe/android/uicore/PrimaryButtonTypography;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonShape;Lcom/stripe/android/uicore/PrimaryButtonTypography;)V
    .locals 1

    const-string v0, "colorsLight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsLight:Lcom/stripe/android/uicore/PrimaryButtonColors;

    iput-object p2, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsDark:Lcom/stripe/android/uicore/PrimaryButtonColors;

    iput-object p3, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->shape:Lcom/stripe/android/uicore/PrimaryButtonShape;

    iput-object p4, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->typography:Lcom/stripe/android/uicore/PrimaryButtonTypography;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/PrimaryButtonStyle;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonShape;Lcom/stripe/android/uicore/PrimaryButtonTypography;ILjava/lang/Object;)Lcom/stripe/android/uicore/PrimaryButtonStyle;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsLight:Lcom/stripe/android/uicore/PrimaryButtonColors;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsDark:Lcom/stripe/android/uicore/PrimaryButtonColors;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->shape:Lcom/stripe/android/uicore/PrimaryButtonShape;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->typography:Lcom/stripe/android/uicore/PrimaryButtonTypography;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->copy(Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonShape;Lcom/stripe/android/uicore/PrimaryButtonTypography;)Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/uicore/PrimaryButtonColors;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsLight:Lcom/stripe/android/uicore/PrimaryButtonColors;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/uicore/PrimaryButtonColors;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsDark:Lcom/stripe/android/uicore/PrimaryButtonColors;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/uicore/PrimaryButtonShape;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->shape:Lcom/stripe/android/uicore/PrimaryButtonShape;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/uicore/PrimaryButtonTypography;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->typography:Lcom/stripe/android/uicore/PrimaryButtonTypography;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonShape;Lcom/stripe/android/uicore/PrimaryButtonTypography;)Lcom/stripe/android/uicore/PrimaryButtonStyle;
    .locals 1

    const-string v0, "colorsLight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/PrimaryButtonStyle;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/PrimaryButtonStyle;-><init>(Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonShape;Lcom/stripe/android/uicore/PrimaryButtonTypography;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/PrimaryButtonStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/PrimaryButtonStyle;

    iget-object v1, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsLight:Lcom/stripe/android/uicore/PrimaryButtonColors;

    iget-object v3, p1, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsLight:Lcom/stripe/android/uicore/PrimaryButtonColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsDark:Lcom/stripe/android/uicore/PrimaryButtonColors;

    iget-object v3, p1, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsDark:Lcom/stripe/android/uicore/PrimaryButtonColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->shape:Lcom/stripe/android/uicore/PrimaryButtonShape;

    iget-object v3, p1, Lcom/stripe/android/uicore/PrimaryButtonStyle;->shape:Lcom/stripe/android/uicore/PrimaryButtonShape;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->typography:Lcom/stripe/android/uicore/PrimaryButtonTypography;

    iget-object p1, p1, Lcom/stripe/android/uicore/PrimaryButtonStyle;->typography:Lcom/stripe/android/uicore/PrimaryButtonTypography;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getColorsDark()Lcom/stripe/android/uicore/PrimaryButtonColors;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsDark:Lcom/stripe/android/uicore/PrimaryButtonColors;

    return-object v0
.end method

.method public final getColorsLight()Lcom/stripe/android/uicore/PrimaryButtonColors;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsLight:Lcom/stripe/android/uicore/PrimaryButtonColors;

    return-object v0
.end method

.method public final getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->shape:Lcom/stripe/android/uicore/PrimaryButtonShape;

    return-object v0
.end method

.method public final getTypography()Lcom/stripe/android/uicore/PrimaryButtonTypography;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->typography:Lcom/stripe/android/uicore/PrimaryButtonTypography;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsLight:Lcom/stripe/android/uicore/PrimaryButtonColors;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/PrimaryButtonColors;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsDark:Lcom/stripe/android/uicore/PrimaryButtonColors;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/PrimaryButtonColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->shape:Lcom/stripe/android/uicore/PrimaryButtonShape;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/PrimaryButtonShape;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->typography:Lcom/stripe/android/uicore/PrimaryButtonTypography;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/PrimaryButtonTypography;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsLight:Lcom/stripe/android/uicore/PrimaryButtonColors;

    iget-object v1, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->colorsDark:Lcom/stripe/android/uicore/PrimaryButtonColors;

    iget-object v2, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->shape:Lcom/stripe/android/uicore/PrimaryButtonShape;

    iget-object v3, p0, Lcom/stripe/android/uicore/PrimaryButtonStyle;->typography:Lcom/stripe/android/uicore/PrimaryButtonTypography;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "PrimaryButtonStyle(colorsLight="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", colorsDark="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shape="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", typography="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

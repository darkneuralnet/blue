.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
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
    name = "Appearance"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001+B7\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\u000e\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001eJ\t\u0010#\u001a\u00020\u001cH\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001J\u0019\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006,"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        "Landroid/os/Parcelable;",
        "colorsLight",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;",
        "colorsDark",
        "shapes",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;",
        "typography",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;",
        "primaryButton",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V",
        "getColorsDark",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;",
        "getColorsLight",
        "getPrimaryButton",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;",
        "getShapes",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;",
        "getTypography",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "getColors",
        "isDark",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "Builder",
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
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

.field private final colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

.field private final primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

.field private final shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

.field private final typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V
    .locals 1

    const-string v0, "colorsLight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shapes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_2

    sget-object v2, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, p3

    :goto_2
    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_3

    sget-object v3, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object v3

    goto :goto_3

    :cond_3
    move-object v3, p4

    :goto_3
    and-int/lit8 v4, p6, 0x10

    if-eqz v4, :cond_4

    new-instance v4, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xf

    const/4 v10, 0x0

    move-object p1, v4

    move-object p2, v5

    move-object p3, v6

    move-object p4, v7

    move-object/from16 p5, v8

    move/from16 p6, v9

    move-object/from16 p7, v10

    invoke-direct/range {p1 .. p7}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_4
    move-object/from16 v4, p5

    :goto_4
    move-object p1, p0

    move-object p2, v0

    move-object p3, v1

    move-object p4, v2

    move-object/from16 p5, v3

    move-object/from16 p6, v4

    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->copy(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
    .locals 7

    const-string v0, "colorsLight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shapes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V

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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getColors(Z)Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    :goto_0
    return-object p1
.end method

.method public final getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object v0
.end method

.method public final getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object v0
.end method

.method public final getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    return-object v0
.end method

.method public final getShapes()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    return-object v0
.end method

.method public final getTypography()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Appearance(colorsLight="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", colorsDark="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shapes="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", typography="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", primaryButton="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

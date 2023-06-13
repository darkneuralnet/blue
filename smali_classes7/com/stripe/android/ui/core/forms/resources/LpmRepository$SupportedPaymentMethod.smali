.class public final Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SupportedPaymentMethod"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u00002\u00020\u0001BY\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\r\u0010 \u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0008H\u00c6\u0003J\t\u0010#\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u000eH\u00c6\u0003J\t\u0010(\u001a\u00020\u0010H\u00c6\u0003Jk\u0010)\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0003\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010*\u001a\u00020\u00062\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u0008H\u00d6\u0001J\u0006\u0010-\u001a\u00020\u0006J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001e\u00a8\u0006/"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
        "",
        "code",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "requiresMandate",
        "",
        "displayNameResource",
        "",
        "iconResource",
        "lightThemeIconUrl",
        "darkThemeIconUrl",
        "tintIconOnSelection",
        "requirement",
        "Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;",
        "formSpec",
        "Lcom/stripe/android/ui/core/elements/LayoutSpec;",
        "(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V",
        "getCode",
        "()Ljava/lang/String;",
        "getDarkThemeIconUrl",
        "getDisplayNameResource",
        "()I",
        "getFormSpec",
        "()Lcom/stripe/android/ui/core/elements/LayoutSpec;",
        "getIconResource",
        "getLightThemeIconUrl",
        "getRequirement",
        "()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;",
        "getRequiresMandate",
        "()Z",
        "getTintIconOnSelection",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "supportsCustomerSavedPM",
        "toString",
        "payments-ui-core_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final code:Ljava/lang/String;

.field private final darkThemeIconUrl:Ljava/lang/String;

.field private final displayNameResource:I

.field private final formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

.field private final iconResource:I

.field private final lightThemeIconUrl:Ljava/lang/String;

.field private final requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private final requiresMandate:Z

.field private final tintIconOnSelection:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requirement"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formSpec"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->code:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requiresMandate:Z

    iput p3, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->displayNameResource:I

    iput p4, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->iconResource:I

    iput-object p5, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->tintIconOnSelection:Z

    iput-object p8, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    iput-object p9, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;ILjava/lang/Object;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->code:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requiresMandate:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->displayNameResource:I

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->iconResource:I

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->tintIconOnSelection:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move-object p1, v2

    move p2, v3

    move p3, v4

    move p4, v5

    move-object p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->copy(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requiresMandate:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->displayNameResource:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->iconResource:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->tintIconOnSelection:Z

    return v0
.end method

.method public final component8()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/ui/core/elements/LayoutSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;
    .locals 11

    const-string v0, "code"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requirement"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formSpec"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    move-object v1, v0

    move v3, p2

    move v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->code:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->code:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requiresMandate:Z

    iget-boolean v3, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requiresMandate:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->displayNameResource:I

    iget v3, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->displayNameResource:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->iconResource:I

    iget v3, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->iconResource:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->tintIconOnSelection:Z

    iget-boolean v3, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->tintIconOnSelection:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    iget-object v3, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    iget-object p1, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getDarkThemeIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayNameResource()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->displayNameResource:I

    return v0
.end method

.method public final getFormSpec()Lcom/stripe/android/ui/core/elements/LayoutSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    return-object v0
.end method

.method public final getIconResource()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->iconResource:I

    return v0
.end method

.method public final getLightThemeIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public final getRequiresMandate()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requiresMandate:Z

    return v0
.end method

.method public final getTintIconOnSelection()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->tintIconOnSelection:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->code:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requiresMandate:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->displayNameResource:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->iconResource:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->tintIconOnSelection:Z

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/LayoutSpec;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final supportsCustomerSavedPM()Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->code:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->getConfirmPMFromCustomer(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->code:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requiresMandate:Z

    iget v2, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->displayNameResource:I

    iget v3, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->iconResource:I

    iget-object v4, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->tintIconOnSelection:Z

    iget-object v7, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    iget-object v8, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->formSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "SupportedPaymentMethod(code="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", requiresMandate="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", displayNameResource="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", iconResource="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", lightThemeIconUrl="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", darkThemeIconUrl="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tintIconOnSelection="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", requirement="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", formSpec="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

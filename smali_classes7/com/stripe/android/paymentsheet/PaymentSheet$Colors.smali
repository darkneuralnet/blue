.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
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
    name = "Colors"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0017\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u00018Bu\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0002\u00a2\u0006\u0004\u00084\u00105Bd\u0008\u0016\u0012\u0006\u0010\u000e\u001a\u000206\u0012\u0006\u0010\u000f\u001a\u000206\u0012\u0006\u0010\u0010\u001a\u000206\u0012\u0006\u0010\u0011\u001a\u000206\u0012\u0006\u0010\u0012\u001a\u000206\u0012\u0006\u0010\u0013\u001a\u000206\u0012\u0006\u0010\u0015\u001a\u000206\u0012\u0006\u0010\u0016\u001a\u000206\u0012\u0006\u0010\u0014\u001a\u000206\u0012\u0006\u0010\u0017\u001a\u000206\u0012\u0006\u0010\u0018\u001a\u000206\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u00107J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0008\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0002H\u00c6\u0003Jw\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0010\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0011\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0012\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0013\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0014\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0015\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0016\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0017\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0018\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010 \u001a\u00020\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010!\u001a\u00020\u0002H\u00d6\u0001J\u0019\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002H\u00d6\u0001R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\'\u001a\u0004\u0008(\u0010)R\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\'\u001a\u0004\u0008*\u0010)R\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\'\u001a\u0004\u0008+\u0010)R\u0017\u0010\u0011\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\'\u001a\u0004\u0008,\u0010)R\u0017\u0010\u0012\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\'\u001a\u0004\u0008-\u0010)R\u0017\u0010\u0013\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\'\u001a\u0004\u0008.\u0010)R\u0017\u0010\u0014\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\'\u001a\u0004\u0008/\u0010)R\u0017\u0010\u0015\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\'\u001a\u0004\u00080\u0010)R\u0017\u0010\u0016\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\'\u001a\u0004\u00081\u0010)R\u0017\u0010\u0017\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\'\u001a\u0004\u00082\u0010)R\u0017\u0010\u0018\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\'\u001a\u0004\u00083\u0010)\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u00069"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;",
        "Landroid/os/Parcelable;",
        "",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "primary",
        "surface",
        "component",
        "componentBorder",
        "componentDivider",
        "onComponent",
        "onSurface",
        "subtitle",
        "placeholderText",
        "appBarIcon",
        "error",
        "copy",
        "",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "",
        "writeToParcel",
        "I",
        "getPrimary",
        "()I",
        "getSurface",
        "getComponent",
        "getComponentBorder",
        "getComponentDivider",
        "getOnComponent",
        "getOnSurface",
        "getSubtitle",
        "getPlaceholderText",
        "getAppBarIcon",
        "getError",
        "<init>",
        "(IIIIIIIIIII)V",
        "Lpm0;",
        "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "Companion",
        "paymentsheet_release"
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
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

.field private static final defaultDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

.field private static final defaultLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;


# instance fields
.field private final appBarIcon:I

.field private final component:I

.field private final componentBorder:I

.field private final componentDivider:I

.field private final error:I

.field private final onComponent:I

.field private final onSurface:I

.field private final placeholderText:I

.field private final primary:I

.field private final subtitle:I

.field private final surface:I


# direct methods
.method public static constructor <clinit>()V
    .locals 50

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-object v1, v0

    sget-object v25, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->j()J

    move-result-wide v2

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v4

    invoke-virtual {v4}, LMm0;->n()J

    move-result-wide v4

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/uicore/StripeColors;->getComponent-0d7_KjU()J

    move-result-wide v6

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/uicore/StripeColors;->getComponentBorder-0d7_KjU()J

    move-result-wide v8

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/uicore/StripeColors;->getComponentDivider-0d7_KjU()J

    move-result-wide v10

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/uicore/StripeColors;->getOnComponent-0d7_KjU()J

    move-result-wide v12

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v14

    invoke-virtual {v14}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v14

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/uicore/StripeColors;->getPlaceholderText-0d7_KjU()J

    move-result-wide v16

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, LMm0;->i()J

    move-result-wide v18

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lcom/stripe/android/uicore/StripeColors;->getAppBarIcon-0d7_KjU()J

    move-result-wide v20

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, LMm0;->d()J

    move-result-wide v22

    const/16 v24, 0x0

    invoke-direct/range {v1 .. v24}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;-><init>(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->defaultLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->j()J

    move-result-wide v27

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->n()J

    move-result-wide v29

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getComponent-0d7_KjU()J

    move-result-wide v31

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getComponentBorder-0d7_KjU()J

    move-result-wide v33

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getComponentDivider-0d7_KjU()J

    move-result-wide v35

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getOnComponent-0d7_KjU()J

    move-result-wide v37

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v39

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getPlaceholderText-0d7_KjU()J

    move-result-wide v41

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->i()J

    move-result-wide v43

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getAppBarIcon-0d7_KjU()J

    move-result-wide v45

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->d()J

    move-result-wide v47

    const/16 v49, 0x0

    invoke-direct/range {v26 .. v49}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;-><init>(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->defaultDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-void
.end method

.method public constructor <init>(IIIIIIIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->primary:I

    iput p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->surface:I

    iput p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->component:I

    iput p4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentBorder:I

    iput p5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentDivider:I

    iput p6, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onComponent:I

    iput p7, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onSurface:I

    iput p8, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->subtitle:I

    iput p9, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->placeholderText:I

    iput p10, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->appBarIcon:I

    iput p11, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->error:I

    return-void
.end method

.method private constructor <init>(JJJJJJJJJJJ)V
    .locals 11

    invoke-static {p1, p2}, Lvm0;->h(J)I

    move-result v0

    invoke-static {p3, p4}, Lvm0;->h(J)I

    move-result v1

    invoke-static/range {p5 .. p6}, Lvm0;->h(J)I

    move-result v2

    invoke-static/range {p7 .. p8}, Lvm0;->h(J)I

    move-result v3

    invoke-static/range {p9 .. p10}, Lvm0;->h(J)I

    move-result v4

    invoke-static/range {p11 .. p12}, Lvm0;->h(J)I

    move-result v5

    invoke-static/range {p13 .. p14}, Lvm0;->h(J)I

    move-result v6

    invoke-static/range {p15 .. p16}, Lvm0;->h(J)I

    move-result v7

    invoke-static/range {p17 .. p18}, Lvm0;->h(J)I

    move-result v8

    invoke-static/range {p19 .. p20}, Lvm0;->h(J)I

    move-result v9

    invoke-static/range {p21 .. p22}, Lvm0;->h(J)I

    move-result v10

    move-object p1, p0

    move p2, v0

    move p3, v1

    move p4, v2

    move/from16 p5, v3

    move/from16 p6, v4

    move/from16 p7, v5

    move/from16 p8, v8

    move/from16 p9, v6

    move/from16 p10, v7

    move/from16 p11, v9

    move/from16 p12, v10

    invoke-direct/range {p1 .. p12}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;-><init>(IIIIIIIIIII)V

    return-void
.end method

.method public synthetic constructor <init>(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p22}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;-><init>(JJJJJJJJJJJ)V

    return-void
.end method

.method public static final synthetic access$getDefaultDark$cp()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->defaultDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object v0
.end method

.method public static final synthetic access$getDefaultLight$cp()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->defaultLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;IIIIIIIIIIIILjava/lang/Object;)Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->primary:I

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->surface:I

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->component:I

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentBorder:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentDivider:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onComponent:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onSurface:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->subtitle:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->placeholderText:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->appBarIcon:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->error:I

    goto :goto_a

    :cond_a
    move/from16 v1, p11

    :goto_a
    move p1, v2

    move p2, v3

    move p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->copy(IIIIIIIIIII)Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->primary:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->appBarIcon:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->error:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->surface:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->component:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentBorder:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentDivider:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onComponent:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onSurface:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->subtitle:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->placeholderText:I

    return v0
.end method

.method public final copy(IIIIIIIIIII)Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 13

    new-instance v12, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-object v0, v12

    move v1, p1

    move v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;-><init>(IIIIIIIIIII)V

    return-object v12
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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->primary:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->primary:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->surface:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->surface:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->component:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->component:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentBorder:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentBorder:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentDivider:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentDivider:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onComponent:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onComponent:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onSurface:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onSurface:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->subtitle:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->subtitle:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->placeholderText:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->placeholderText:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->appBarIcon:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->appBarIcon:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->error:I

    iget p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->error:I

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAppBarIcon()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->appBarIcon:I

    return v0
.end method

.method public final getComponent()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->component:I

    return v0
.end method

.method public final getComponentBorder()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentBorder:I

    return v0
.end method

.method public final getComponentDivider()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentDivider:I

    return v0
.end method

.method public final getError()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->error:I

    return v0
.end method

.method public final getOnComponent()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onComponent:I

    return v0
.end method

.method public final getOnSurface()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onSurface:I

    return v0
.end method

.method public final getPlaceholderText()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->placeholderText:I

    return v0
.end method

.method public final getPrimary()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->primary:I

    return v0
.end method

.method public final getSubtitle()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->subtitle:I

    return v0
.end method

.method public final getSurface()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->surface:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->primary:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->surface:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->component:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentBorder:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentDivider:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onComponent:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onSurface:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->subtitle:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->placeholderText:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->appBarIcon:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->error:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->primary:I

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->surface:I

    iget v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->component:I

    iget v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentBorder:I

    iget v4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentDivider:I

    iget v5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onComponent:I

    iget v6, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onSurface:I

    iget v7, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->subtitle:I

    iget v8, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->placeholderText:I

    iget v9, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->appBarIcon:I

    iget v10, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->error:I

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Colors(primary="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", surface="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", component="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", componentBorder="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", componentDivider="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", onComponent="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", onSurface="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", placeholderText="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", appBarIcon="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->primary:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->surface:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->component:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentBorder:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->componentDivider:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onComponent:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->onSurface:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->subtitle:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->placeholderText:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->appBarIcon:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->error:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

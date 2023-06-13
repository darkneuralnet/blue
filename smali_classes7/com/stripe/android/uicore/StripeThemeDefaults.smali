.class public final Lcom/stripe/android/uicore/StripeThemeDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/uicore/StripeThemeDefaults;",
        "",
        "()V",
        "colorsDark",
        "Lcom/stripe/android/uicore/StripeColors;",
        "getColorsDark",
        "()Lcom/stripe/android/uicore/StripeColors;",
        "colorsLight",
        "getColorsLight",
        "primaryButtonStyle",
        "Lcom/stripe/android/uicore/PrimaryButtonStyle;",
        "getPrimaryButtonStyle",
        "()Lcom/stripe/android/uicore/PrimaryButtonStyle;",
        "shapes",
        "Lcom/stripe/android/uicore/StripeShapes;",
        "getShapes",
        "()Lcom/stripe/android/uicore/StripeShapes;",
        "typography",
        "Lcom/stripe/android/uicore/StripeTypography;",
        "getTypography",
        "()Lcom/stripe/android/uicore/StripeTypography;",
        "colors",
        "isDark",
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

.field public static final INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

.field private static final colorsDark:Lcom/stripe/android/uicore/StripeColors;

.field private static final colorsLight:Lcom/stripe/android/uicore/StripeColors;

.field private static final primaryButtonStyle:Lcom/stripe/android/uicore/PrimaryButtonStyle;

.field private static final shapes:Lcom/stripe/android/uicore/StripeShapes;

.field private static final typography:Lcom/stripe/android/uicore/StripeTypography;


# direct methods
.method public static constructor <clinit>()V
    .locals 65

    new-instance v0, Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-direct {v0}, Lcom/stripe/android/uicore/StripeThemeDefaults;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    new-instance v20, Lcom/stripe/android/uicore/StripeColors;

    move-object/from16 v1, v20

    sget-object v21, Lpm0;->b:Lpm0$a;

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->h()J

    move-result-wide v2

    const v6, 0x33787880

    invoke-static {v6}, Lvm0;->b(I)J

    move-result-wide v4

    invoke-static {v6}, Lvm0;->b(I)J

    move-result-wide v6

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->a()J

    move-result-wide v8

    const-wide v16, 0x99000000L

    invoke-static/range {v16 .. v17}, Lvm0;->c(J)J

    move-result-wide v10

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->a()J

    move-result-wide v12

    const-wide v14, 0x993c3c43L

    invoke-static {v14, v15}, Lvm0;->c(J)J

    move-result-wide v14

    invoke-static/range {v16 .. v17}, Lvm0;->c(J)J

    move-result-wide v16

    const-wide v18, 0xff007affL

    invoke-static/range {v18 .. v19}, Lvm0;->c(J)J

    move-result-wide v22

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->h()J

    move-result-wide v32

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->a()J

    move-result-wide v42

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->e()J

    move-result-wide v34

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const-wide/16 v40, 0x0

    const-wide/16 v44, 0x0

    const/16 v46, 0xb9e

    const/16 v47, 0x0

    invoke-static/range {v22 .. v47}, LNm0;->h(JJJJJJJJJJJJILjava/lang/Object;)LMm0;

    move-result-object v18

    const/16 v19, 0x0

    invoke-direct/range {v1 .. v19}, Lcom/stripe/android/uicore/StripeColors;-><init>(JJJJJJJJLMm0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v20, Lcom/stripe/android/uicore/StripeThemeDefaults;->colorsLight:Lcom/stripe/android/uicore/StripeColors;

    new-instance v1, Lcom/stripe/android/uicore/StripeColors;

    move-object/from16 v22, v1

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->c()J

    move-result-wide v23

    const-wide v2, 0xff787880L

    invoke-static {v2, v3}, Lvm0;->c(J)J

    move-result-wide v25

    invoke-static {v2, v3}, Lvm0;->c(J)J

    move-result-wide v27

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->h()J

    move-result-wide v29

    const-wide v2, 0x99ffffffL

    invoke-static {v2, v3}, Lvm0;->c(J)J

    move-result-wide v31

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->h()J

    move-result-wide v33

    const v2, 0x61ffffff

    invoke-static {v2}, Lvm0;->b(I)J

    move-result-wide v35

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->h()J

    move-result-wide v37

    const-wide v2, 0xff0074d4L

    invoke-static {v2, v3}, Lvm0;->c(J)J

    move-result-wide v39

    const-wide v2, 0xff2e2e2eL

    invoke-static {v2, v3}, Lvm0;->c(J)J

    move-result-wide v49

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->h()J

    move-result-wide v59

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->e()J

    move-result-wide v51

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const-wide/16 v61, 0x0

    const/16 v63, 0xb9e

    const/16 v64, 0x0

    invoke-static/range {v39 .. v64}, LNm0;->d(JJJJJJJJJJJJILjava/lang/Object;)LMm0;

    move-result-object v39

    const/16 v40, 0x0

    invoke-direct/range {v22 .. v40}, Lcom/stripe/android/uicore/StripeColors;-><init>(JJJJJJJJLMm0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->colorsDark:Lcom/stripe/android/uicore/StripeColors;

    new-instance v1, Lcom/stripe/android/uicore/StripeShapes;

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v4, 0x40c00000    # 6.0f

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/StripeShapes;-><init>(FFF)V

    sput-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->shapes:Lcom/stripe/android/uicore/StripeShapes;

    new-instance v2, Lcom/stripe/android/uicore/StripeTypography;

    move-object/from16 v22, v2

    sget-object v3, LJw1;->c:LJw1$a;

    invoke-virtual {v3}, LJw1$a;->d()LJw1;

    move-result-object v4

    invoke-virtual {v4}, LJw1;->k()I

    move-result v23

    invoke-virtual {v3}, LJw1$a;->c()LJw1;

    move-result-object v4

    invoke-virtual {v4}, LJw1;->k()I

    move-result v24

    invoke-virtual {v3}, LJw1$a;->a()LJw1;

    move-result-object v3

    invoke-virtual {v3}, LJw1;->k()I

    move-result v25

    const/high16 v26, 0x3f800000    # 1.0f

    const/16 v3, 0x9

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v27

    const/16 v3, 0xc

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v29

    const/16 v3, 0xd

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v31

    const/16 v3, 0xe

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v33

    const/16 v3, 0x10

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v35

    const/16 v3, 0x14

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v37

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const v47, 0x3f800

    const/16 v48, 0x0

    invoke-direct/range {v22 .. v48}, Lcom/stripe/android/uicore/StripeTypography;-><init>(IIIFJJJJJJLjava/lang/Integer;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lcom/stripe/android/uicore/StripeThemeDefaults;->typography:Lcom/stripe/android/uicore/StripeTypography;

    new-instance v3, Lcom/stripe/android/uicore/PrimaryButtonStyle;

    new-instance v12, Lcom/stripe/android/uicore/PrimaryButtonColors;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lcom/stripe/android/uicore/StripeThemeDefaults;->colors(Z)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v4

    invoke-virtual {v4}, LMm0;->j()J

    move-result-wide v5

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->h()J

    move-result-wide v7

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->f()J

    move-result-wide v9

    const/4 v11, 0x0

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/uicore/PrimaryButtonColors;-><init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/stripe/android/uicore/PrimaryButtonColors;

    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Lcom/stripe/android/uicore/StripeThemeDefaults;->colors(Z)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v0

    invoke-virtual {v0}, LMm0;->j()J

    move-result-wide v14

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->h()J

    move-result-wide v16

    invoke-virtual/range {v21 .. v21}, Lpm0$a;->f()J

    move-result-wide v18

    const/16 v20, 0x0

    move-object v13, v4

    invoke-direct/range {v13 .. v20}, Lcom/stripe/android/uicore/PrimaryButtonColors;-><init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/stripe/android/uicore/PrimaryButtonShape;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeShapes;->getCornerRadius()F

    move-result v1

    const/4 v5, 0x0

    invoke-direct {v0, v1, v5}, Lcom/stripe/android/uicore/PrimaryButtonShape;-><init>(FF)V

    new-instance v1, Lcom/stripe/android/uicore/PrimaryButtonTypography;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeTypography;->getFontFamily()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeTypography;->getLargeFontSize-XSAIIZE()J

    move-result-wide v6

    const/4 v2, 0x0

    invoke-direct {v1, v5, v6, v7, v2}, Lcom/stripe/android/uicore/PrimaryButtonTypography;-><init>(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v12, v4, v0, v1}, Lcom/stripe/android/uicore/PrimaryButtonStyle;-><init>(Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonShape;Lcom/stripe/android/uicore/PrimaryButtonTypography;)V

    sput-object v3, Lcom/stripe/android/uicore/StripeThemeDefaults;->primaryButtonStyle:Lcom/stripe/android/uicore/PrimaryButtonStyle;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final colors(Z)Lcom/stripe/android/uicore/StripeColors;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/stripe/android/uicore/StripeThemeDefaults;->colorsDark:Lcom/stripe/android/uicore/StripeColors;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/stripe/android/uicore/StripeThemeDefaults;->colorsLight:Lcom/stripe/android/uicore/StripeColors;

    :goto_0
    return-object p1
.end method

.method public final getColorsDark()Lcom/stripe/android/uicore/StripeColors;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeDefaults;->colorsDark:Lcom/stripe/android/uicore/StripeColors;

    return-object v0
.end method

.method public final getColorsLight()Lcom/stripe/android/uicore/StripeColors;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeDefaults;->colorsLight:Lcom/stripe/android/uicore/StripeColors;

    return-object v0
.end method

.method public final getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeDefaults;->primaryButtonStyle:Lcom/stripe/android/uicore/PrimaryButtonStyle;

    return-object v0
.end method

.method public final getShapes()Lcom/stripe/android/uicore/StripeShapes;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeDefaults;->shapes:Lcom/stripe/android/uicore/StripeShapes;

    return-object v0
.end method

.method public final getTypography()Lcom/stripe/android/uicore/StripeTypography;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeDefaults;->typography:Lcom/stripe/android/uicore/StripeTypography;

    return-object v0
.end method

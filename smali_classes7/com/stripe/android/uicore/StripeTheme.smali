.class public final Lcom/stripe/android/uicore/StripeTheme;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u0006\"\u0004\u0008\u000b\u0010\u0008R\u000e\u0010\u000c\u001a\u00020\rX\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/uicore/StripeTheme;",
        "",
        "()V",
        "colorsDarkMutable",
        "Lcom/stripe/android/uicore/StripeColors;",
        "getColorsDarkMutable",
        "()Lcom/stripe/android/uicore/StripeColors;",
        "setColorsDarkMutable",
        "(Lcom/stripe/android/uicore/StripeColors;)V",
        "colorsLightMutable",
        "getColorsLightMutable",
        "setColorsLightMutable",
        "minContrastForWhite",
        "",
        "primaryButtonStyle",
        "Lcom/stripe/android/uicore/PrimaryButtonStyle;",
        "getPrimaryButtonStyle",
        "()Lcom/stripe/android/uicore/PrimaryButtonStyle;",
        "setPrimaryButtonStyle",
        "(Lcom/stripe/android/uicore/PrimaryButtonStyle;)V",
        "shapesMutable",
        "Lcom/stripe/android/uicore/StripeShapes;",
        "getShapesMutable",
        "()Lcom/stripe/android/uicore/StripeShapes;",
        "setShapesMutable",
        "(Lcom/stripe/android/uicore/StripeShapes;)V",
        "typographyMutable",
        "Lcom/stripe/android/uicore/StripeTypography;",
        "getTypographyMutable",
        "()Lcom/stripe/android/uicore/StripeTypography;",
        "setTypographyMutable",
        "(Lcom/stripe/android/uicore/StripeTypography;)V",
        "getColors",
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

.field public static final INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

.field private static colorsDarkMutable:Lcom/stripe/android/uicore/StripeColors; = null

.field private static colorsLightMutable:Lcom/stripe/android/uicore/StripeColors; = null

.field public static final minContrastForWhite:D = 2.2

.field private static primaryButtonStyle:Lcom/stripe/android/uicore/PrimaryButtonStyle;

.field private static shapesMutable:Lcom/stripe/android/uicore/StripeShapes;

.field private static typographyMutable:Lcom/stripe/android/uicore/StripeTypography;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/StripeTheme;

    invoke-direct {v0}, Lcom/stripe/android/uicore/StripeTheme;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/uicore/StripeTheme;->colorsDarkMutable:Lcom/stripe/android/uicore/StripeColors;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/uicore/StripeTheme;->colorsLightMutable:Lcom/stripe/android/uicore/StripeColors;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getShapes()Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/uicore/StripeTheme;->shapesMutable:Lcom/stripe/android/uicore/StripeShapes;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTypography()Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/uicore/StripeTheme;->typographyMutable:Lcom/stripe/android/uicore/StripeTypography;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/StripeTheme;->primaryButtonStyle:Lcom/stripe/android/uicore/PrimaryButtonStyle;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/StripeTheme;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getColors(Z)Lcom/stripe/android/uicore/StripeColors;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/stripe/android/uicore/StripeTheme;->colorsDarkMutable:Lcom/stripe/android/uicore/StripeColors;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/stripe/android/uicore/StripeTheme;->colorsLightMutable:Lcom/stripe/android/uicore/StripeColors;

    :goto_0
    return-object p1
.end method

.method public final getColorsDarkMutable()Lcom/stripe/android/uicore/StripeColors;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeTheme;->colorsDarkMutable:Lcom/stripe/android/uicore/StripeColors;

    return-object v0
.end method

.method public final getColorsLightMutable()Lcom/stripe/android/uicore/StripeColors;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeTheme;->colorsLightMutable:Lcom/stripe/android/uicore/StripeColors;

    return-object v0
.end method

.method public final getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeTheme;->primaryButtonStyle:Lcom/stripe/android/uicore/PrimaryButtonStyle;

    return-object v0
.end method

.method public final getShapesMutable()Lcom/stripe/android/uicore/StripeShapes;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeTheme;->shapesMutable:Lcom/stripe/android/uicore/StripeShapes;

    return-object v0
.end method

.method public final getTypographyMutable()Lcom/stripe/android/uicore/StripeTypography;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeTheme;->typographyMutable:Lcom/stripe/android/uicore/StripeTypography;

    return-object v0
.end method

.method public final setColorsDarkMutable(Lcom/stripe/android/uicore/StripeColors;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/stripe/android/uicore/StripeTheme;->colorsDarkMutable:Lcom/stripe/android/uicore/StripeColors;

    return-void
.end method

.method public final setColorsLightMutable(Lcom/stripe/android/uicore/StripeColors;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/stripe/android/uicore/StripeTheme;->colorsLightMutable:Lcom/stripe/android/uicore/StripeColors;

    return-void
.end method

.method public final setPrimaryButtonStyle(Lcom/stripe/android/uicore/PrimaryButtonStyle;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/stripe/android/uicore/StripeTheme;->primaryButtonStyle:Lcom/stripe/android/uicore/PrimaryButtonStyle;

    return-void
.end method

.method public final setShapesMutable(Lcom/stripe/android/uicore/StripeShapes;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/stripe/android/uicore/StripeTheme;->shapesMutable:Lcom/stripe/android/uicore/StripeShapes;

    return-void
.end method

.method public final setTypographyMutable(Lcom/stripe/android/uicore/StripeTypography;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/stripe/android/uicore/StripeTheme;->typographyMutable:Lcom/stripe/android/uicore/StripeTypography;

    return-void
.end method

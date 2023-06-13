.class public Lio/card/payment/ui/Appearance;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACTIONBAR_BACKGROUND:Landroid/graphics/drawable/Drawable;

.field public static final BUTTON_PRIMARY_DISABLED_COLOR:I

.field public static final BUTTON_PRIMARY_FOCUS_COLOR:I

.field public static final BUTTON_PRIMARY_NORMAL_COLOR:I

.field public static final BUTTON_PRIMARY_PRESSED_COLOR:I

.field public static final BUTTON_SECONDARY_DISABLED_COLOR:I

.field public static final BUTTON_SECONDARY_FOCUS_COLOR:I

.field public static final BUTTON_SECONDARY_NORMAL_COLOR:I

.field public static final BUTTON_SECONDARY_PRESSED_COLOR:I

.field public static final BUTTON_STATE_DISABLED:[I

.field public static final BUTTON_STATE_FOCUSED:[I

.field public static final BUTTON_STATE_NORMAL:[I

.field public static final BUTTON_STATE_PRESSED:[I

.field public static final DEFAULT_BACKGROUND_COLOR:I

.field public static final PAL_BLUE_COLOR:I

.field public static final PAL_BLUE_COLOR_OPACITY_66:I

.field public static final PAY_BLUE_COLOR:I

.field public static final TEXT_COLOR_ERROR:I

.field public static final TEXT_COLOR_LABEL:I

.field public static final TEXT_COLOR_LIGHT:I

.field public static final TYPEFACE_BUTTON:Landroid/graphics/Typeface;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lio/card/payment/ui/Appearance;->BUTTON_STATE_PRESSED:[I

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x101009e

    const/4 v3, 0x0

    aput v2, v1, v3

    sput-object v1, Lio/card/payment/ui/Appearance;->BUTTON_STATE_NORMAL:[I

    new-array v1, v0, [I

    const v2, -0x101009e

    aput v2, v1, v3

    sput-object v1, Lio/card/payment/ui/Appearance;->BUTTON_STATE_DISABLED:[I

    new-array v0, v0, [I

    const v1, 0x101009c

    aput v1, v0, v3

    sput-object v0, Lio/card/payment/ui/Appearance;->BUTTON_STATE_FOCUSED:[I

    const-string v0, "#003087"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lio/card/payment/ui/Appearance;->PAY_BLUE_COLOR:I

    const-string v1, "#009CDE"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    sput v1, Lio/card/payment/ui/Appearance;->PAL_BLUE_COLOR:I

    const-string v2, "#aa009CDE"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    sput v2, Lio/card/payment/ui/Appearance;->PAL_BLUE_COLOR_OPACITY_66:I

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    const-string v4, "#717074"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-direct {v3, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    sput-object v3, Lio/card/payment/ui/Appearance;->ACTIONBAR_BACKGROUND:Landroid/graphics/drawable/Drawable;

    const-string v3, "#f5f5f5"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    sput v5, Lio/card/payment/ui/Appearance;->DEFAULT_BACKGROUND_COLOR:I

    sput v1, Lio/card/payment/ui/Appearance;->BUTTON_PRIMARY_NORMAL_COLOR:I

    sput v2, Lio/card/payment/ui/Appearance;->BUTTON_PRIMARY_FOCUS_COLOR:I

    sput v0, Lio/card/payment/ui/Appearance;->BUTTON_PRIMARY_PRESSED_COLOR:I

    const-string v0, "#c5ddeb"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lio/card/payment/ui/Appearance;->BUTTON_PRIMARY_DISABLED_COLOR:I

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lio/card/payment/ui/Appearance;->BUTTON_SECONDARY_NORMAL_COLOR:I

    const-string v0, "#aa717074"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lio/card/payment/ui/Appearance;->BUTTON_SECONDARY_FOCUS_COLOR:I

    const-string v0, "#5a5a5d"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lio/card/payment/ui/Appearance;->BUTTON_SECONDARY_PRESSED_COLOR:I

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lio/card/payment/ui/Appearance;->BUTTON_SECONDARY_DISABLED_COLOR:I

    const-string v0, "#515151"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lio/card/payment/ui/Appearance;->TEXT_COLOR_LIGHT:I

    const-string v1, "#b32317"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    sput v1, Lio/card/payment/ui/Appearance;->TEXT_COLOR_ERROR:I

    sput v0, Lio/card/payment/ui/Appearance;->TEXT_COLOR_LABEL:I

    invoke-static {}, Lio/card/payment/ui/Appearance;->typefaceLight()Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lio/card/payment/ui/Appearance;->TYPEFACE_BUTTON:Landroid/graphics/Typeface;

    return-void

    nop

    :array_0
    .array-data 4
        0x10100a7
        0x101009e
    .end array-data
.end method

.method public static buttonBackgroundPrimary(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 4

    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    sget-object v1, Lio/card/payment/ui/Appearance;->BUTTON_STATE_PRESSED:[I

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lio/card/payment/ui/Appearance;->BUTTON_PRIMARY_PRESSED_COLOR:I

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    sget-object v1, Lio/card/payment/ui/Appearance;->BUTTON_STATE_DISABLED:[I

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lio/card/payment/ui/Appearance;->BUTTON_PRIMARY_DISABLED_COLOR:I

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    sget-object v1, Lio/card/payment/ui/Appearance;->BUTTON_STATE_FOCUSED:[I

    invoke-static {p0}, Lio/card/payment/ui/Appearance;->buttonBackgroundPrimaryFocused(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    sget-object v1, Lio/card/payment/ui/Appearance;->BUTTON_STATE_NORMAL:[I

    invoke-static {p0}, Lio/card/payment/ui/Appearance;->buttonBackgroundPrimaryNormal(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method private static buttonBackgroundPrimaryFocused(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 2

    sget v0, Lio/card/payment/ui/Appearance;->BUTTON_PRIMARY_NORMAL_COLOR:I

    sget v1, Lio/card/payment/ui/Appearance;->BUTTON_PRIMARY_FOCUS_COLOR:I

    invoke-static {p0}, Lio/card/payment/ui/Appearance;->getFocusBorderWidthPixels(Landroid/content/Context;)F

    move-result p0

    invoke-static {v0, v1, p0}, Lio/card/payment/ui/Appearance;->buttonFocused(IIF)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method private static buttonBackgroundPrimaryNormal(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1

    sget v0, Lio/card/payment/ui/Appearance;->BUTTON_PRIMARY_NORMAL_COLOR:I

    invoke-static {p0}, Lio/card/payment/ui/Appearance;->getFocusBorderWidthPixels(Landroid/content/Context;)F

    move-result p0

    invoke-static {v0, p0}, Lio/card/payment/ui/Appearance;->buttonNormal(IF)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static buttonBackgroundSecondary(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 4

    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    sget-object v1, Lio/card/payment/ui/Appearance;->BUTTON_STATE_PRESSED:[I

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lio/card/payment/ui/Appearance;->BUTTON_SECONDARY_PRESSED_COLOR:I

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    sget-object v1, Lio/card/payment/ui/Appearance;->BUTTON_STATE_DISABLED:[I

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lio/card/payment/ui/Appearance;->BUTTON_SECONDARY_DISABLED_COLOR:I

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    sget-object v1, Lio/card/payment/ui/Appearance;->BUTTON_STATE_FOCUSED:[I

    invoke-static {p0}, Lio/card/payment/ui/Appearance;->buttonBackgroundSecondaryFocused(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    sget-object v1, Lio/card/payment/ui/Appearance;->BUTTON_STATE_NORMAL:[I

    invoke-static {p0}, Lio/card/payment/ui/Appearance;->buttonBackgroundSecondaryNormal(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method private static buttonBackgroundSecondaryFocused(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 2

    sget v0, Lio/card/payment/ui/Appearance;->BUTTON_SECONDARY_NORMAL_COLOR:I

    sget v1, Lio/card/payment/ui/Appearance;->BUTTON_SECONDARY_FOCUS_COLOR:I

    invoke-static {p0}, Lio/card/payment/ui/Appearance;->getFocusBorderWidthPixels(Landroid/content/Context;)F

    move-result p0

    invoke-static {v0, v1, p0}, Lio/card/payment/ui/Appearance;->buttonFocused(IIF)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method private static buttonBackgroundSecondaryNormal(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1

    sget v0, Lio/card/payment/ui/Appearance;->BUTTON_SECONDARY_NORMAL_COLOR:I

    invoke-static {p0}, Lio/card/payment/ui/Appearance;->getFocusBorderWidthPixels(Landroid/content/Context;)F

    move-result p0

    invoke-static {v0, p0}, Lio/card/payment/ui/Appearance;->buttonNormal(IF)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method private static buttonFocused(IIF)Landroid/graphics/drawable/Drawable;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    const/4 p0, 0x0

    aput-object v1, v0, p0

    new-instance p0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/RectShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/RectShape;-><init>()V

    invoke-direct {p0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    sget v2, Lio/card/payment/ui/Appearance;->DEFAULT_BACKGROUND_COLOR:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v1, 0x1

    aput-object p0, v0, v1

    new-instance p0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/RectShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/RectShape;-><init>()V

    invoke-direct {p0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p2

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x2

    aput-object p0, v0, p1

    new-instance p0, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {p0, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method private static buttonNormal(IF)Landroid/graphics/drawable/Drawable;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    const/4 p0, 0x0

    aput-object v1, v0, p0

    new-instance p0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/RectShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/RectShape;-><init>()V

    invoke-direct {p0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr p1, v2

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p1

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p1

    sget v1, Lio/card/payment/ui/Appearance;->DEFAULT_BACKGROUND_COLOR:I

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x1

    aput-object p0, v0, p1

    new-instance p0, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {p0, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method private static getFocusBorderWidthPixels(Landroid/content/Context;)F
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const-string v1, "4dip"

    invoke-static {v1, p0}, Lio/card/payment/ui/ViewUtil;->typedDimensionValueToPixels(Ljava/lang/String;Landroid/content/Context;)F

    move-result p0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr p0, v1

    mul-float/2addr p0, v0

    return p0
.end method

.method private static typefaceLight()Landroid/graphics/Typeface;
    .locals 2

    const-string v0, "sans-serif-light"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

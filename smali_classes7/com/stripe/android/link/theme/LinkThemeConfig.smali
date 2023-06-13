.class public final Lcom/stripe/android/link/theme/LinkThemeConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/link/theme/LinkThemeConfig;",
        "",
        "()V",
        "colorsDark",
        "Lcom/stripe/android/link/theme/LinkColors;",
        "colorsLight",
        "colors",
        "isDark",
        "",
        "link_release"
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
.field public static final INSTANCE:Lcom/stripe/android/link/theme/LinkThemeConfig;

.field private static final colorsDark:Lcom/stripe/android/link/theme/LinkColors;

.field private static final colorsLight:Lcom/stripe/android/link/theme/LinkColors;


# direct methods
.method public static constructor <clinit>()V
    .locals 69

    new-instance v0, Lcom/stripe/android/link/theme/LinkThemeConfig;

    invoke-direct {v0}, Lcom/stripe/android/link/theme/LinkThemeConfig;-><init>()V

    sput-object v0, Lcom/stripe/android/link/theme/LinkThemeConfig;->INSTANCE:Lcom/stripe/android/link/theme/LinkThemeConfig;

    new-instance v0, Lcom/stripe/android/link/theme/LinkColors;

    move-object v1, v0

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightComponentBackground$p()J

    move-result-wide v2

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightComponentBorder$p()J

    move-result-wide v4

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightComponentDivider$p()J

    move-result-wide v6

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getButtonLabel$p()J

    move-result-wide v8

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getActionGreen$p()J

    move-result-wide v10

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getActionLightGreen$p()J

    move-result-wide v12

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightTextDisabled$p()J

    move-result-wide v14

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightCloseButton$p()J

    move-result-wide v16

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightLinkLogo$p()J

    move-result-wide v18

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getErrorText$p()J

    move-result-wide v20

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getErrorBackground$p()J

    move-result-wide v22

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightSecondaryButtonLabel$p()J

    move-result-wide v24

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightSheetScrim$p()J

    move-result-wide v26

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightProgressIndicator$p()J

    move-result-wide v28

    new-instance v31, Lcom/stripe/android/uicore/elements/OTPElementColors;

    move-object/from16 v30, v31

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLinkTeal$p()J

    move-result-wide v32

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightOtpPlaceholder$p()J

    move-result-wide v34

    const/16 v36, 0x0

    invoke-direct/range {v31 .. v36}, Lcom/stripe/android/uicore/elements/OTPElementColors;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getInlineLink$p()J

    move-result-wide v31

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLinkTeal$p()J

    move-result-wide v33

    const-wide/16 v35, 0x0

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightFill$p()J

    move-result-wide v37

    const-wide/16 v39, 0x0

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightBackground$p()J

    move-result-wide v41

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightBackground$p()J

    move-result-wide v43

    const-wide/16 v45, 0x0

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightTextPrimary$p()J

    move-result-wide v47

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLightTextSecondary$p()J

    move-result-wide v49

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const/16 v57, 0xe4a

    const/16 v58, 0x0

    invoke-static/range {v33 .. v58}, LNm0;->h(JJJJJJJJJJJJILjava/lang/Object;)LMm0;

    move-result-object v33

    const/16 v34, 0x0

    invoke-direct/range {v1 .. v34}, Lcom/stripe/android/link/theme/LinkColors;-><init>(JJJJJJJJJJJJJJLcom/stripe/android/uicore/elements/OTPElementColors;JLMm0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/theme/LinkThemeConfig;->colorsLight:Lcom/stripe/android/link/theme/LinkColors;

    new-instance v0, Lcom/stripe/android/link/theme/LinkColors;

    move-object/from16 v35, v0

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkComponentBackground$p()J

    move-result-wide v36

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkComponentBorder$p()J

    move-result-wide v38

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkComponentDivider$p()J

    move-result-wide v40

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getButtonLabel$p()J

    move-result-wide v42

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getActionGreen$p()J

    move-result-wide v44

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getActionLightGreen$p()J

    move-result-wide v46

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkTextDisabled$p()J

    move-result-wide v48

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkCloseButton$p()J

    move-result-wide v50

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkLinkLogo$p()J

    move-result-wide v52

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getErrorText$p()J

    move-result-wide v54

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getErrorBackground$p()J

    move-result-wide v56

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkSecondaryButtonLabel$p()J

    move-result-wide v58

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkSheetScrim$p()J

    move-result-wide v60

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkProgressIndicator$p()J

    move-result-wide v62

    new-instance v1, Lcom/stripe/android/uicore/elements/OTPElementColors;

    move-object/from16 v64, v1

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLinkTeal$p()J

    move-result-wide v2

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkOtpPlaceholder$p()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/OTPElementColors;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getInlineLink$p()J

    move-result-wide v65

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getLinkTeal$p()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkFill$p()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkBackground$p()J

    move-result-wide v9

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkBackground$p()J

    move-result-wide v11

    const-wide/16 v13, 0x0

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkTextPrimary$p()J

    move-result-wide v15

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getDarkTextSecondary$p()J

    move-result-wide v17

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0xe4a

    const/16 v26, 0x0

    invoke-static/range {v1 .. v26}, LNm0;->d(JJJJJJJJJJJJILjava/lang/Object;)LMm0;

    move-result-object v67

    const/16 v68, 0x0

    invoke-direct/range {v35 .. v68}, Lcom/stripe/android/link/theme/LinkColors;-><init>(JJJJJJJJJJJJJJLcom/stripe/android/uicore/elements/OTPElementColors;JLMm0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/theme/LinkThemeConfig;->colorsDark:Lcom/stripe/android/link/theme/LinkColors;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final colors(Z)Lcom/stripe/android/link/theme/LinkColors;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/stripe/android/link/theme/LinkThemeConfig;->colorsDark:Lcom/stripe/android/link/theme/LinkColors;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/stripe/android/link/theme/LinkThemeConfig;->colorsLight:Lcom/stripe/android/link/theme/LinkColors;

    :goto_0
    return-object p1
.end method

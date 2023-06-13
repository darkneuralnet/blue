.class public final LWl4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CustomWalletTheme:[I

.field public static final CustomWalletTheme_customThemeStyle:I = 0x0

.field public static final CustomWalletTheme_toolbarTextColorStyle:I = 0x1

.field public static final CustomWalletTheme_windowTransitionStyle:I = 0x2

.field public static final PayButtonAttributes:[I

.field public static final PayButtonAttributes_buttonTheme:I = 0x0

.field public static final PayButtonAttributes_cornerRadius:I = 0x1

.field public static final WalletFragmentOptions:[I

.field public static final WalletFragmentOptions_appTheme:I = 0x0

.field public static final WalletFragmentOptions_environment:I = 0x1

.field public static final WalletFragmentOptions_fragmentMode:I = 0x2

.field public static final WalletFragmentOptions_fragmentStyle:I = 0x3

.field public static final WalletFragmentStyle:[I

.field public static final WalletFragmentStyle_buyButtonAppearance:I = 0x0

.field public static final WalletFragmentStyle_buyButtonHeight:I = 0x1

.field public static final WalletFragmentStyle_buyButtonText:I = 0x2

.field public static final WalletFragmentStyle_buyButtonWidth:I = 0x3

.field public static final WalletFragmentStyle_maskedWalletDetailsBackground:I = 0x4

.field public static final WalletFragmentStyle_maskedWalletDetailsButtonBackground:I = 0x5

.field public static final WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance:I = 0x6

.field public static final WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance:I = 0x7

.field public static final WalletFragmentStyle_maskedWalletDetailsLogoImageType:I = 0x8

.field public static final WalletFragmentStyle_maskedWalletDetailsLogoTextColor:I = 0x9

.field public static final WalletFragmentStyle_maskedWalletDetailsTextAppearance:I = 0xa


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, LWl4;->CustomWalletTheme:[I

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, LWl4;->PayButtonAttributes:[I

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, LWl4;->WalletFragmentOptions:[I

    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, LWl4;->WalletFragmentStyle:[I

    return-void

    :array_0
    .array-data 4
        0x7f0401d2
        0x7f0405f0
        0x7f040644
    .end array-data

    :array_1
    .array-data 4
        0x7f0400b7
        0x7f040197
    .end array-data

    :array_2
    .array-data 4
        0x7f040041
        0x7f040223
        0x7f04029e
        0x7f04029f
    .end array-data

    :array_3
    .array-data 4
        0x7f0400bb
        0x7f0400bc
        0x7f0400bd
        0x7f0400be
        0x7f0403ac
        0x7f0403ad
        0x7f0403ae
        0x7f0403af
        0x7f0403b0
        0x7f0403b1
        0x7f0403b2
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

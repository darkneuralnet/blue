.class public final Lcom/viewpagerindicator/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/viewpagerindicator/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final CirclePageIndicator:[I

.field public static final CirclePageIndicator_android_background:I = 0x1

.field public static final CirclePageIndicator_android_orientation:I = 0x0

.field public static final CirclePageIndicator_centered:I = 0x2

.field public static final CirclePageIndicator_fillColor:I = 0x3

.field public static final CirclePageIndicator_pageColor:I = 0x4

.field public static final CirclePageIndicator_radius:I = 0x5

.field public static final CirclePageIndicator_snap:I = 0x6

.field public static final CirclePageIndicator_strokeColor:I = 0x7

.field public static final CirclePageIndicator_strokeWidth:I = 0x8

.field public static final LinePageIndicator:[I

.field public static final LinePageIndicator_android_background:I = 0x0

.field public static final LinePageIndicator_centered:I = 0x1

.field public static final LinePageIndicator_gapWidth:I = 0x2

.field public static final LinePageIndicator_lineWidth:I = 0x3

.field public static final LinePageIndicator_selectedColor:I = 0x4

.field public static final LinePageIndicator_strokeWidth:I = 0x5

.field public static final LinePageIndicator_unselectedColor:I = 0x6

.field public static final TitlePageIndicator:[I

.field public static final TitlePageIndicator_android_background:I = 0x2

.field public static final TitlePageIndicator_android_textColor:I = 0x1

.field public static final TitlePageIndicator_android_textSize:I = 0x0

.field public static final TitlePageIndicator_clipPadding:I = 0x3

.field public static final TitlePageIndicator_footerColor:I = 0x4

.field public static final TitlePageIndicator_footerIndicatorHeight:I = 0x5

.field public static final TitlePageIndicator_footerIndicatorStyle:I = 0x6

.field public static final TitlePageIndicator_footerIndicatorUnderlinePadding:I = 0x7

.field public static final TitlePageIndicator_footerLineHeight:I = 0x8

.field public static final TitlePageIndicator_footerPadding:I = 0x9

.field public static final TitlePageIndicator_linePosition:I = 0xa

.field public static final TitlePageIndicator_selectedBold:I = 0xb

.field public static final TitlePageIndicator_selectedColor:I = 0xc

.field public static final TitlePageIndicator_titlePadding:I = 0xd

.field public static final TitlePageIndicator_topPadding:I = 0xe

.field public static final UnderlinePageIndicator:[I

.field public static final UnderlinePageIndicator_android_background:I = 0x0

.field public static final UnderlinePageIndicator_fadeDelay:I = 0x1

.field public static final UnderlinePageIndicator_fadeLength:I = 0x2

.field public static final UnderlinePageIndicator_fades:I = 0x3

.field public static final UnderlinePageIndicator_selectedColor:I = 0x4

.field public static final ViewPagerIndicator:[I

.field public static final ViewPagerIndicator_vpiCirclePageIndicatorStyle:I = 0x0

.field public static final ViewPagerIndicator_vpiIconPageIndicatorStyle:I = 0x1

.field public static final ViewPagerIndicator_vpiLinePageIndicatorStyle:I = 0x2

.field public static final ViewPagerIndicator_vpiTabPageIndicatorStyle:I = 0x3

.field public static final ViewPagerIndicator_vpiTitlePageIndicatorStyle:I = 0x4

.field public static final ViewPagerIndicator_vpiUnderlinePageIndicatorStyle:I = 0x5


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/viewpagerindicator/R$styleable;->CirclePageIndicator:[I

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/viewpagerindicator/R$styleable;->LinePageIndicator:[I

    const/16 v0, 0xf

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lcom/viewpagerindicator/R$styleable;->TitlePageIndicator:[I

    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lcom/viewpagerindicator/R$styleable;->UnderlinePageIndicator:[I

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    sput-object v0, Lcom/viewpagerindicator/R$styleable;->ViewPagerIndicator:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100c4
        0x10100d4
        0x7f0400e4
        0x7f04025e
        0x7f040468
        0x7f0404a1
        0x7f040503
        0x7f040530
        0x7f040531
    .end array-data

    :array_1
    .array-data 4
        0x10100d4
        0x7f0400e4
        0x7f0402a2
        0x7f04037a
        0x7f0404ce
        0x7f040531
        0x7f040618
    .end array-data

    :array_2
    .array-data 4
        0x1010095
        0x1010098
        0x10100d4
        0x7f04011e
        0x7f040292
        0x7f040293
        0x7f040294
        0x7f040295
        0x7f040297
        0x7f040298
        0x7f040378
        0x7f0404cd
        0x7f0404ce
        0x7f0405e5
        0x7f0405f6
    .end array-data

    :array_3
    .array-data 4
        0x10100d4
        0x7f04024b
        0x7f04024c
        0x7f04024d
        0x7f0404ce
    .end array-data

    :array_4
    .array-data 4
        0x7f04062d
        0x7f04062e
        0x7f04062f
        0x7f040630
        0x7f040631
        0x7f040632
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

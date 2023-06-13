.class public final Lcom/stripe/android/view/CardInputWidgetPlacement;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CardInputWidgetPlacement$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008Z\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0080\u0008\u0018\u0000 w2\u00020\u0001:\u0001wB\u00a5\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010<\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008=J\u000e\u0010>\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008?J\u000e\u0010@\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008AJ\u000e\u0010B\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008CJ\u000e\u0010D\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008EJ\u000e\u0010F\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008GJ\u000e\u0010H\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008IJ\u000e\u0010J\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008KJ\u000e\u0010L\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008MJ\u000e\u0010N\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008OJ\u000e\u0010P\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008QJ\u000e\u0010R\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008SJ\u000e\u0010T\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008UJ\u000e\u0010V\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008WJ\u000e\u0010X\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008YJ\u000e\u0010Z\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008[J\u00a9\u0001\u0010\\\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010]\u001a\u00020^2\u0008\u0010_\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0015\u0010`\u001a\u00020\u00032\u0006\u0010a\u001a\u00020^H\u0000\u00a2\u0006\u0002\u0008bJ\u0015\u0010c\u001a\u00020\u00032\u0006\u0010a\u001a\u00020^H\u0000\u00a2\u0006\u0002\u0008dJ/\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010g\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u00032\u0006\u0010i\u001a\u00020^2\u0006\u0010j\u001a\u00020^H\u0000\u00a2\u0006\u0002\u0008kJ\u0015\u0010l\u001a\u00020\u00032\u0006\u0010a\u001a\u00020^H\u0000\u00a2\u0006\u0002\u0008mJ\t\u0010n\u001a\u00020\u0003H\u00d6\u0001J\u0010\u0010o\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u0003H\u0002J\u0008\u0010q\u001a\u00020rH\u0016J-\u0010s\u001a\u00020t2\u0006\u0010i\u001a\u00020^2\u0006\u0010j\u001a\u00020^2\u0006\u0010h\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\u0008vR\u001a\u0010\u0007\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u0015\"\u0004\u0008\u001f\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010\u0015\"\u0004\u0008!\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010\u0015\"\u0004\u0008#\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010\u0015\"\u0004\u0008%\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\u0015\"\u0004\u0008\'\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008(\u0010\u0015\"\u0004\u0008)\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010\u0015\"\u0004\u0008+\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010\u0015\"\u0004\u0008-\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010\u0015\"\u0004\u0008/\u0010\u0017R\u001a\u0010\u0008\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00080\u0010\u0015\"\u0004\u00081\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u0010\u0015\"\u0004\u00083\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00084\u0010\u0015\"\u0004\u00085\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00086\u0010\u0015\"\u0004\u00087\u0010\u0017R\u001a\u0010\u000c\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00088\u0010\u0015\"\u0004\u00089\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u0010\u0015\"\u0004\u0008;\u0010\u0017\u00a8\u0006x"
    }
    d2 = {
        "Lcom/stripe/android/view/CardInputWidgetPlacement;",
        "",
        "totalLengthInPixels",
        "",
        "cardWidth",
        "hiddenCardWidth",
        "peekCardWidth",
        "cardDateSeparation",
        "dateWidth",
        "dateCvcSeparation",
        "cvcWidth",
        "cvcPostalCodeSeparation",
        "postalCodeWidth",
        "cardTouchBufferLimit",
        "dateStartPosition",
        "dateEndTouchBufferLimit",
        "cvcStartPosition",
        "cvcEndTouchBufferLimit",
        "postalCodeStartPosition",
        "(IIIIIIIIIIIIIIII)V",
        "getCardDateSeparation$payments_core_release",
        "()I",
        "setCardDateSeparation$payments_core_release",
        "(I)V",
        "cardPeekCvcStartMargin",
        "getCardPeekCvcStartMargin",
        "cardPeekDateStartMargin",
        "getCardPeekDateStartMargin",
        "cardPeekPostalCodeStartMargin",
        "getCardPeekPostalCodeStartMargin",
        "getCardTouchBufferLimit$payments_core_release",
        "setCardTouchBufferLimit$payments_core_release",
        "getCardWidth$payments_core_release",
        "setCardWidth$payments_core_release",
        "getCvcEndTouchBufferLimit$payments_core_release",
        "setCvcEndTouchBufferLimit$payments_core_release",
        "getCvcPostalCodeSeparation$payments_core_release",
        "setCvcPostalCodeSeparation$payments_core_release",
        "getCvcStartPosition$payments_core_release",
        "setCvcStartPosition$payments_core_release",
        "getCvcWidth$payments_core_release",
        "setCvcWidth$payments_core_release",
        "getDateCvcSeparation$payments_core_release",
        "setDateCvcSeparation$payments_core_release",
        "getDateEndTouchBufferLimit$payments_core_release",
        "setDateEndTouchBufferLimit$payments_core_release",
        "getDateStartPosition$payments_core_release",
        "setDateStartPosition$payments_core_release",
        "getDateWidth$payments_core_release",
        "setDateWidth$payments_core_release",
        "getHiddenCardWidth$payments_core_release",
        "setHiddenCardWidth$payments_core_release",
        "getPeekCardWidth$payments_core_release",
        "setPeekCardWidth$payments_core_release",
        "getPostalCodeStartPosition$payments_core_release",
        "setPostalCodeStartPosition$payments_core_release",
        "getPostalCodeWidth$payments_core_release",
        "setPostalCodeWidth$payments_core_release",
        "getTotalLengthInPixels$payments_core_release",
        "setTotalLengthInPixels$payments_core_release",
        "component1",
        "component1$payments_core_release",
        "component10",
        "component10$payments_core_release",
        "component11",
        "component11$payments_core_release",
        "component12",
        "component12$payments_core_release",
        "component13",
        "component13$payments_core_release",
        "component14",
        "component14$payments_core_release",
        "component15",
        "component15$payments_core_release",
        "component16",
        "component16$payments_core_release",
        "component2",
        "component2$payments_core_release",
        "component3",
        "component3$payments_core_release",
        "component4",
        "component4$payments_core_release",
        "component5",
        "component5$payments_core_release",
        "component6",
        "component6$payments_core_release",
        "component7",
        "component7$payments_core_release",
        "component8",
        "component8$payments_core_release",
        "component9",
        "component9$payments_core_release",
        "copy",
        "equals",
        "",
        "other",
        "getCvcStartMargin",
        "isFullCard",
        "getCvcStartMargin$payments_core_release",
        "getDateStartMargin",
        "getDateStartMargin$payments_core_release",
        "getFocusField",
        "Lcom/stripe/android/view/CardInputWidget$Field;",
        "touchX",
        "frameStart",
        "isShowingFullCard",
        "postalCodeEnabled",
        "getFocusField$payments_core_release",
        "getPostalCodeStartMargin",
        "getPostalCodeStartMargin$payments_core_release",
        "hashCode",
        "toMinimalValueIfNegative",
        "value",
        "toString",
        "",
        "updateSpacing",
        "",
        "frameWidth",
        "updateSpacing$payments_core_release",
        "Companion",
        "payments-core_release"
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
.field private static final Companion:Lcom/stripe/android/view/CardInputWidgetPlacement$Companion;

.field public static final MIN_SEPARATION_IN_PX:I = 0xa
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private cardDateSeparation:I

.field private cardTouchBufferLimit:I

.field private cardWidth:I

.field private cvcEndTouchBufferLimit:I

.field private cvcPostalCodeSeparation:I

.field private cvcStartPosition:I

.field private cvcWidth:I

.field private dateCvcSeparation:I

.field private dateEndTouchBufferLimit:I

.field private dateStartPosition:I

.field private dateWidth:I

.field private hiddenCardWidth:I

.field private peekCardWidth:I

.field private postalCodeStartPosition:I

.field private postalCodeWidth:I

.field private totalLengthInPixels:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/view/CardInputWidgetPlacement$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->Companion:Lcom/stripe/android/view/CardInputWidgetPlacement$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 19

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, 0xffff

    const/16 v18, 0x0

    invoke-direct/range {v0 .. v18}, Lcom/stripe/android/view/CardInputWidgetPlacement;-><init>(IIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIIIIII)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    move v1, p2

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    move v1, p3

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->hiddenCardWidth:I

    move v1, p4

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    move v1, p5

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    move v1, p6

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    move v1, p7

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    move v1, p8

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    move v1, p9

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    move v1, p10

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeWidth:I

    move v1, p11

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    move v1, p12

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    move v1, p13

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    move/from16 v1, p14

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    move/from16 v1, p15

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    move/from16 v1, p16

    iput v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v0, v0, v16

    if-eqz v0, :cond_f

    const/4 v0, 0x0

    goto :goto_f

    :cond_f
    move/from16 v0, p16

    :goto_f
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p16, v2

    move/from16 p17, v0

    invoke-direct/range {p1 .. p17}, Lcom/stripe/android/view/CardInputWidgetPlacement;-><init>(IIIIIIIIIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/view/CardInputWidgetPlacement;IIIIIIIIIIIIIIIIILjava/lang/Object;)Lcom/stripe/android/view/CardInputWidgetPlacement;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->hiddenCardWidth:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeWidth:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget v15, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    goto :goto_e

    :cond_e
    move/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget v1, v0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    move/from16 p1, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p15, v15

    move/from16 p16, v1

    invoke-virtual/range {p0 .. p16}, Lcom/stripe/android/view/CardInputWidgetPlacement;->copy(IIIIIIIIIIIIIIII)Lcom/stripe/android/view/CardInputWidgetPlacement;

    move-result-object v0

    return-object v0
.end method

.method private final synthetic getCardPeekCvcStartMargin()I
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCardPeekDateStartMargin()I

    move-result v0

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    add-int/2addr v0, v1

    return v0
.end method

.method private final synthetic getCardPeekDateStartMargin()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    add-int/2addr v0, v1

    return v0
.end method

.method private final synthetic getCardPeekPostalCodeStartMargin()I
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCardPeekCvcStartMargin()I

    move-result v0

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    add-int/2addr v0, v1

    return v0
.end method

.method private final toMinimalValueIfNegative(I)I
    .locals 0

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, 0xa

    :goto_0
    return p1
.end method


# virtual methods
.method public final component1$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    return v0
.end method

.method public final component10$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeWidth:I

    return v0
.end method

.method public final component11$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    return v0
.end method

.method public final component12$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    return v0
.end method

.method public final component13$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    return v0
.end method

.method public final component14$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    return v0
.end method

.method public final component15$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    return v0
.end method

.method public final component16$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    return v0
.end method

.method public final component2$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    return v0
.end method

.method public final component3$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->hiddenCardWidth:I

    return v0
.end method

.method public final component4$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    return v0
.end method

.method public final component5$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    return v0
.end method

.method public final component6$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    return v0
.end method

.method public final component7$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    return v0
.end method

.method public final component8$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    return v0
.end method

.method public final component9$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    return v0
.end method

.method public final copy(IIIIIIIIIIIIIIII)Lcom/stripe/android/view/CardInputWidgetPlacement;
    .locals 18

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    new-instance v17, Lcom/stripe/android/view/CardInputWidgetPlacement;

    move-object/from16 v0, v17

    invoke-direct/range {v0 .. v16}, Lcom/stripe/android/view/CardInputWidgetPlacement;-><init>(IIIIIIIIIIIIIIII)V

    return-object v17
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/view/CardInputWidgetPlacement;

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->hiddenCardWidth:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->hiddenCardWidth:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeWidth:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeWidth:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    iget v3, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    iget p1, p1, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    if-eq v1, p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getCardDateSeparation$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    return v0
.end method

.method public final getCardTouchBufferLimit$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    return v0
.end method

.method public final getCardWidth$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    return v0
.end method

.method public final getCvcEndTouchBufferLimit$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    return v0
.end method

.method public final getCvcPostalCodeSeparation$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    return v0
.end method

.method public final synthetic getCvcStartMargin$payments_core_release(Z)I
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCardPeekCvcStartMargin()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final getCvcStartPosition$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    return v0
.end method

.method public final getCvcWidth$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    return v0
.end method

.method public final getDateCvcSeparation$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    return v0
.end method

.method public final getDateEndTouchBufferLimit$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    return v0
.end method

.method public final synthetic getDateStartMargin$payments_core_release(Z)I
    .locals 1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    add-int/2addr p1, v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCardPeekDateStartMargin()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final getDateStartPosition$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    return v0
.end method

.method public final getDateWidth$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    return v0
.end method

.method public final getFocusField$payments_core_release(IIZZ)Lcom/stripe/android/view/CardInputWidget$Field;
    .locals 1

    const/4 v0, 0x0

    if-eqz p3, :cond_2

    iget p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    add-int/2addr p2, p3

    if-ge p1, p2, :cond_0

    goto/16 :goto_0

    :cond_0
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    if-ge p1, p2, :cond_1

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Number:Lcom/stripe/android/view/CardInputWidget$Field;

    goto/16 :goto_0

    :cond_1
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    if-ge p1, p2, :cond_11

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Expiry:Lcom/stripe/android/view/CardInputWidget$Field;

    goto/16 :goto_0

    :cond_2
    if-eqz p4, :cond_b

    iget p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    add-int/2addr p2, p3

    if-ge p1, p2, :cond_3

    goto/16 :goto_0

    :cond_3
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    if-ge p1, p2, :cond_4

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Number:Lcom/stripe/android/view/CardInputWidget$Field;

    goto :goto_0

    :cond_4
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    if-ge p1, p2, :cond_5

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Expiry:Lcom/stripe/android/view/CardInputWidget$Field;

    goto :goto_0

    :cond_5
    iget p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    add-int/2addr p2, p3

    if-ge p1, p2, :cond_6

    goto :goto_0

    :cond_6
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    if-ge p1, p2, :cond_7

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Expiry:Lcom/stripe/android/view/CardInputWidget$Field;

    goto :goto_0

    :cond_7
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    if-ge p1, p2, :cond_8

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Cvc:Lcom/stripe/android/view/CardInputWidget$Field;

    goto :goto_0

    :cond_8
    iget p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    add-int/2addr p2, p3

    if-ge p1, p2, :cond_9

    goto :goto_0

    :cond_9
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    if-ge p1, p2, :cond_a

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Cvc:Lcom/stripe/android/view/CardInputWidget$Field;

    goto :goto_0

    :cond_a
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    if-ge p1, p2, :cond_11

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->PostalCode:Lcom/stripe/android/view/CardInputWidget$Field;

    goto :goto_0

    :cond_b
    iget p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    add-int/2addr p2, p3

    if-ge p1, p2, :cond_c

    goto :goto_0

    :cond_c
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    if-ge p1, p2, :cond_d

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Number:Lcom/stripe/android/view/CardInputWidget$Field;

    goto :goto_0

    :cond_d
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    if-ge p1, p2, :cond_e

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Expiry:Lcom/stripe/android/view/CardInputWidget$Field;

    goto :goto_0

    :cond_e
    iget p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    add-int/2addr p2, p3

    if-ge p1, p2, :cond_f

    goto :goto_0

    :cond_f
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    if-ge p1, p2, :cond_10

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Expiry:Lcom/stripe/android/view/CardInputWidget$Field;

    goto :goto_0

    :cond_10
    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    if-ge p1, p2, :cond_11

    sget-object v0, Lcom/stripe/android/view/CardInputWidget$Field;->Cvc:Lcom/stripe/android/view/CardInputWidget$Field;

    :cond_11
    :goto_0
    return-object v0
.end method

.method public final getHiddenCardWidth$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->hiddenCardWidth:I

    return v0
.end method

.method public final getPeekCardWidth$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    return v0
.end method

.method public final synthetic getPostalCodeStartMargin$payments_core_release(Z)I
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCardPeekPostalCodeStartMargin()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final getPostalCodeStartPosition$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    return v0
.end method

.method public final getPostalCodeWidth$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeWidth:I

    return v0
.end method

.method public final getTotalLengthInPixels$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->hiddenCardWidth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeWidth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setCardDateSeparation$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    return-void
.end method

.method public final setCardTouchBufferLimit$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    return-void
.end method

.method public final setCardWidth$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    return-void
.end method

.method public final setCvcEndTouchBufferLimit$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    return-void
.end method

.method public final setCvcPostalCodeSeparation$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    return-void
.end method

.method public final setCvcStartPosition$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    return-void
.end method

.method public final setCvcWidth$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    return-void
.end method

.method public final setDateCvcSeparation$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    return-void
.end method

.method public final setDateEndTouchBufferLimit$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    return-void
.end method

.method public final setDateStartPosition$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    return-void
.end method

.method public final setDateWidth$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    return-void
.end method

.method public final setHiddenCardWidth$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->hiddenCardWidth:I

    return-void
.end method

.method public final setPeekCardWidth$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    return-void
.end method

.method public final setPostalCodeStartPosition$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    return-void
.end method

.method public final setPostalCodeWidth$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeWidth:I

    return-void
.end method

.method public final setTotalLengthInPixels$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    iget v1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    iget v2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    iget v3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    iget v4, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    iget v5, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\n            Touch Buffer Data:\n            CardTouchBufferLimit = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n            DateStartPosition = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n            DateEndTouchBufferLimit = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n            CvcStartPosition = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n            CvcEndTouchBufferLimit = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n            PostalCodeStartPosition = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n            "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->totalLengthInPixels:I

    iget v3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    iget v4, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->hiddenCardWidth:I

    iget v5, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    iget v6, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    iget v7, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    iget v8, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    iget v9, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    iget v10, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    iget v11, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeWidth:I

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "\n            TotalLengthInPixels = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n            CardWidth = "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n            HiddenCardWidth = "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n            PeekCardWidth = "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n            CardDateSeparation = "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n            DateWidth = "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n            DateCvcSeparation = "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n            CvcWidth = "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n            CvcPostalCodeSeparation = "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n            PostalCodeWidth: "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic updateSpacing$payments_core_release(ZZII)V
    .locals 2

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    sub-int/2addr p4, p1

    iget p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    sub-int/2addr p4, p1

    invoke-direct {p0, p4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->toMinimalValueIfNegative(I)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardWidth:I

    add-int p4, p3, p2

    div-int/lit8 v0, p1, 0x2

    add-int/2addr p4, v0

    iput p4, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    add-int/2addr p3, p2

    add-int/2addr p3, p1

    iput p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    goto/16 :goto_0

    :cond_0
    if-eqz p2, :cond_1

    mul-int/lit8 p1, p4, 0x3

    div-int/lit8 p2, p1, 0xa

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    sub-int/2addr p2, v0

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    div-int/lit8 v0, v0, 0x4

    sub-int/2addr p2, v0

    invoke-direct {p0, p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->toMinimalValueIfNegative(I)I

    move-result p2

    iput p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    div-int/lit8 p1, p1, 0x5

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    sub-int/2addr p1, v0

    sub-int/2addr p1, p2

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    sub-int/2addr p1, p2

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    sub-int/2addr p1, p2

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->toMinimalValueIfNegative(I)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    sub-int/2addr p4, p2

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    sub-int/2addr p4, p2

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    sub-int/2addr p4, p2

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    sub-int/2addr p4, p2

    sub-int/2addr p4, p1

    iget p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeWidth:I

    sub-int/2addr p4, p1

    invoke-direct {p0, p4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->toMinimalValueIfNegative(I)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcPostalCodeSeparation:I

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    add-int/2addr p3, p2

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    add-int/2addr p3, p2

    div-int/lit8 p2, p3, 0x3

    iput p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    iput p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    add-int/2addr p3, p2

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    add-int/2addr p3, p2

    div-int/lit8 p2, p3, 0x3

    iput p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    iput p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    add-int/2addr p3, p2

    add-int/2addr p3, p1

    div-int/lit8 p1, p3, 0x3

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcEndTouchBufferLimit:I

    iput p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->postalCodeStartPosition:I

    goto :goto_0

    :cond_1
    div-int/lit8 p1, p4, 0x2

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    sub-int/2addr p1, p2

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    div-int/lit8 p2, p2, 0x2

    sub-int/2addr p1, p2

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->toMinimalValueIfNegative(I)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    sub-int/2addr p4, p2

    sub-int/2addr p4, p1

    iget p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    sub-int/2addr p4, p1

    iget p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcWidth:I

    sub-int/2addr p4, p1

    invoke-direct {p0, p4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->toMinimalValueIfNegative(I)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateCvcSeparation:I

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->peekCardWidth:I

    add-int p4, p3, p2

    iget v0, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardDateSeparation:I

    div-int/lit8 v1, v0, 0x2

    add-int/2addr p4, v1

    iput p4, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cardTouchBufferLimit:I

    add-int/2addr p3, p2

    add-int/2addr p3, v0

    iput p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateStartPosition:I

    iget p2, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateWidth:I

    add-int p4, p3, p2

    div-int/lit8 v0, p1, 0x2

    add-int/2addr p4, v0

    iput p4, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->dateEndTouchBufferLimit:I

    add-int/2addr p3, p2

    add-int/2addr p3, p1

    iput p3, p0, Lcom/stripe/android/view/CardInputWidgetPlacement;->cvcStartPosition:I

    :goto_0
    return-void
.end method

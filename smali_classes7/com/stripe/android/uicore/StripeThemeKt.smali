.class public final Lcom/stripe/android/uicore/StripeThemeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a;\u0010\u000f\u001a\u00020\r2\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u001e\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u001e\u0010\u001a\u001a\u00020\u0019*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u000c\u0010 \u001a\u00020\u0014*\u00020\u001fH\u0007\u001a!\u0010%\u001a\u00020\"*\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$\u001aC\u00100\u001a\u00020-2\u0008\u0010\'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00192\n\u0008\u0001\u0010,\u001a\u0004\u0018\u00010+H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008.\u0010/\u001a\u0019\u00103\u001a\u00020\u0014*\u00020\u0019H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00102\u001a\u0014\u00105\u001a\u00020+*\u0002042\u0006\u0010(\u001a\u00020\u001fH\u0007\u001a\u0014\u00106\u001a\u00020+*\u0002042\u0006\u0010(\u001a\u00020\u001fH\u0007\u001a\u0014\u0010\u001a\u001a\u00020+*\u0002042\u0006\u0010(\u001a\u00020\u001fH\u0007\u001a\u0013\u00108\u001a\u000207*\u000204H\u0007\u00a2\u0006\u0004\u00088\u00109\u001a\u0014\u0010;\u001a\u00020\"*\u00020\u001f2\u0006\u0010:\u001a\u00020+H\u0007\u001a!\u0010?\u001a\u00020\u0019*\u00020\u00192\u0006\u0010<\u001a\u00020\"H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008=\u0010>\u001a!\u0010A\u001a\u00020\u0019*\u00020\u00192\u0006\u0010<\u001a\u00020\"H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008@\u0010>\u001a-\u0010F\u001a\u00020\u0019*\u00020\u00192\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0BH\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008D\u0010E\"\u001d\u0010H\u001a\u0008\u0012\u0004\u0012\u00020\u00080G8\u0006\u00a2\u0006\u000c\n\u0004\u0008H\u0010I\u001a\u0004\u0008J\u0010K\"\u001d\u0010L\u001a\u0008\u0012\u0004\u0012\u00020\u00000G8\u0006\u00a2\u0006\u000c\n\u0004\u0008L\u0010I\u001a\u0004\u0008M\u0010K\"\u001d\u0010N\u001a\u0008\u0012\u0004\u0012\u00020\u00040G8\u0006\u00a2\u0006\u000c\n\u0004\u0008N\u0010I\u001a\u0004\u0008O\u0010K\"\u0015\u0010R\u001a\u00020\u0008*\u00020\u00138G\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010Q\"\u0015\u0010U\u001a\u00020\u0000*\u00020\u00138G\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010T\"\u0015\u0010X\u001a\u00020\u0004*\u00020\u00138G\u00a2\u0006\u0006\u001a\u0004\u0008V\u0010W\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006Y"
    }
    d2 = {
        "Lcom/stripe/android/uicore/StripeShapes;",
        "Lcom/stripe/android/uicore/StripeComposeShapes;",
        "toComposeShapes",
        "(Lcom/stripe/android/uicore/StripeShapes;LEt0;I)Lcom/stripe/android/uicore/StripeComposeShapes;",
        "Lcom/stripe/android/uicore/StripeTypography;",
        "LGc6;",
        "toComposeTypography",
        "(Lcom/stripe/android/uicore/StripeTypography;LEt0;I)LGc6;",
        "Lcom/stripe/android/uicore/StripeColors;",
        "colors",
        "shapes",
        "typography",
        "Lkotlin/Function0;",
        "",
        "content",
        "StripeTheme",
        "(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V",
        "DefaultStripeTheme",
        "(Lkotlin/jvm/functions/Function2;LEt0;I)V",
        "LTM2;",
        "",
        "isSelected",
        "Lk61;",
        "getBorderStrokeWidth",
        "(LTM2;ZLEt0;I)F",
        "Lpm0;",
        "getBorderStrokeColor",
        "(LTM2;ZLEt0;I)J",
        "LeZ;",
        "getBorderStroke",
        "(LTM2;ZLEt0;I)LeZ;",
        "Landroid/content/Context;",
        "isSystemDarkTheme",
        "dp",
        "",
        "convertDpToPx-3ABfNKs",
        "(Landroid/content/Context;F)F",
        "convertDpToPx",
        "",
        "text",
        "context",
        "fontSizeDp",
        "color",
        "",
        "fontFamily",
        "Landroid/text/SpannableString;",
        "createTextSpanFromTextStyle-qhTmNto",
        "(Ljava/lang/String;Landroid/content/Context;FJLjava/lang/Integer;)Landroid/text/SpannableString;",
        "createTextSpanFromTextStyle",
        "shouldUseDarkDynamicColor-8_81llA",
        "(J)Z",
        "shouldUseDarkDynamicColor",
        "Lcom/stripe/android/uicore/PrimaryButtonStyle;",
        "getBackgroundColor",
        "getOnBackgroundColor",
        "LG26;",
        "getComposeTextStyle",
        "(Lcom/stripe/android/uicore/PrimaryButtonStyle;LEt0;I)LG26;",
        "resource",
        "getRawValueFromDimenResource",
        "amount",
        "lighten-DxMtmZc",
        "(JF)J",
        "lighten",
        "darken-DxMtmZc",
        "darken",
        "Lkotlin/Function1;",
        "transform",
        "modifyBrightness-DxMtmZc",
        "(JLkotlin/jvm/functions/Function1;)J",
        "modifyBrightness",
        "LU94;",
        "LocalColors",
        "LU94;",
        "getLocalColors",
        "()LU94;",
        "LocalShapes",
        "getLocalShapes",
        "LocalTypography",
        "getLocalTypography",
        "getStripeColors",
        "(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;",
        "stripeColors",
        "getStripeShapes",
        "(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;",
        "stripeShapes",
        "getStripeTypography",
        "(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeTypography;",
        "stripeTypography",
        "stripe-ui-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStripeTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeTheme.kt\ncom/stripe/android/uicore/StripeThemeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,548:1\n174#2:549\n174#2:550\n174#2:551\n174#2:552\n174#2:572\n1#3:553\n141#4,2:554\n141#4,2:556\n141#4,2:558\n141#4,2:560\n141#4,2:562\n141#4,2:564\n141#4,2:566\n76#5:568\n76#5:569\n76#5:570\n76#5:571\n*S KotlinDebug\n*F\n+ 1 StripeTheme.kt\ncom/stripe/android/uicore/StripeThemeKt\n*L\n212#1:549\n213#1:550\n215#1:551\n216#1:552\n382#1:572\n230#1:554,2\n238#1:556,2\n247#1:558,2\n256#1:560,2\n264#1:562,2\n273#1:564,2\n281#1:566,2\n318#1:568\n365#1:569\n370#1:570\n376#1:571\n*E\n"
    }
.end annotation


# static fields
.field private static final LocalColors:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Lcom/stripe/android/uicore/StripeColors;",
            ">;"
        }
    .end annotation
.end field

.field private static final LocalShapes:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Lcom/stripe/android/uicore/StripeShapes;",
            ">;"
        }
    .end annotation
.end field

.field private static final LocalTypography:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Lcom/stripe/android/uicore/StripeTypography;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeKt$LocalColors$1;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeKt$LocalColors$1;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/StripeThemeKt;->LocalColors:LU94;

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeKt$LocalShapes$1;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeKt$LocalShapes$1;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/StripeThemeKt;->LocalShapes:LU94;

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeKt$LocalTypography$1;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeKt$LocalTypography$1;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/StripeThemeKt;->LocalTypography:LU94;

    return-void
.end method

.method public static final DefaultStripeTheme(Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xe23c359

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    move v8, v1

    goto :goto_1

    :cond_1
    move v8, p2

    :goto_1
    and-int/lit8 v1, v8, 0xb

    if-ne v1, v2, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v3, "com.stripe.android.uicore.DefaultStripeTheme (StripeTheme.kt:340)"

    invoke-static {v0, v8, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget-object v0, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    const/4 v1, 0x0

    invoke-static {p1, v1}, LwS0;->a(LEt0;I)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/stripe/android/uicore/StripeThemeDefaults;->colors(Z)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v4

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getShapes()Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v6

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTypography()Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v5

    const/4 v0, 0x3

    new-array v0, v0, [LW94;

    sget-object v3, Lcom/stripe/android/uicore/StripeThemeKt;->LocalColors:LU94;

    invoke-virtual {v3, v4}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v3

    aput-object v3, v0, v1

    sget-object v1, Lcom/stripe/android/uicore/StripeThemeKt;->LocalShapes:LU94;

    invoke-virtual {v1, v6}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    const/4 v9, 0x1

    aput-object v1, v0, v9

    sget-object v1, Lcom/stripe/android/uicore/StripeThemeKt;->LocalTypography:LU94;

    invoke-virtual {v1, v5}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    aput-object v1, v0, v2

    new-instance v1, Lcom/stripe/android/uicore/StripeThemeKt$DefaultStripeTheme$1;

    move-object v3, v1

    move-object v7, p0

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/uicore/StripeThemeKt$DefaultStripeTheme$1;-><init>(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeTypography;Lcom/stripe/android/uicore/StripeShapes;Lkotlin/jvm/functions/Function2;I)V

    const v2, 0x7c066167

    invoke-static {p1, v2, v9, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p1, v2}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Lcom/stripe/android/uicore/StripeThemeKt$DefaultStripeTheme$2;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/uicore/StripeThemeKt$DefaultStripeTheme$2;-><init>(Lkotlin/jvm/functions/Function2;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method public static final StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/StripeColors;",
            "Lcom/stripe/android/uicore/StripeShapes;",
            "Lcom/stripe/android/uicore/StripeTypography;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v7, p3

    move/from16 v8, p5

    const-string v0, "content"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x59f0e7c0

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v9

    and-int/lit8 v1, v8, 0xe

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v1, :cond_2

    and-int/lit8 v1, p6, 0x1

    if-nez v1, :cond_0

    move-object/from16 v1, p0

    invoke-interface {v9, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p0

    :cond_1
    move v4, v3

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v4, v8

    :goto_1
    and-int/lit8 v5, v8, 0x70

    if-nez v5, :cond_5

    and-int/lit8 v5, p6, 0x2

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v9, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v5, p1

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    goto :goto_3

    :cond_5
    move-object/from16 v5, p1

    :goto_3
    and-int/lit16 v6, v8, 0x380

    if-nez v6, :cond_8

    and-int/lit8 v6, p6, 0x4

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-interface {v9, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v6, p2

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v8, 0x1c00

    if-nez v10, :cond_b

    invoke-interface {v9, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v4, v10

    :cond_b
    :goto_7
    and-int/lit16 v10, v4, 0x16db

    const/16 v11, 0x492

    if-ne v10, v11, :cond_d

    invoke-interface {v9}, LEt0;->b()Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v9}, LEt0;->k()V

    move-object v2, v1

    move-object v3, v5

    move-object v4, v6

    goto/16 :goto_e

    :cond_d
    :goto_8
    invoke-interface {v9}, LEt0;->J()V

    and-int/lit8 v10, v8, 0x1

    const/4 v11, 0x0

    if-eqz v10, :cond_11

    invoke-interface {v9}, LEt0;->l()Z

    move-result v10

    if-eqz v10, :cond_e

    goto :goto_9

    :cond_e
    invoke-interface {v9}, LEt0;->k()V

    and-int/lit8 v10, p6, 0x1

    if-eqz v10, :cond_f

    and-int/lit8 v4, v4, -0xf

    :cond_f
    and-int/lit8 v10, p6, 0x2

    if-eqz v10, :cond_10

    and-int/lit8 v4, v4, -0x71

    :cond_10
    and-int/lit8 v10, p6, 0x4

    if-eqz v10, :cond_14

    goto :goto_a

    :cond_11
    :goto_9
    and-int/lit8 v10, p6, 0x1

    if-eqz v10, :cond_12

    sget-object v1, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-static {v9, v11}, LwS0;->a(LEt0;I)Z

    move-result v10

    invoke-virtual {v1, v10}, Lcom/stripe/android/uicore/StripeTheme;->getColors(Z)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    and-int/lit8 v4, v4, -0xf

    :cond_12
    and-int/lit8 v10, p6, 0x2

    if-eqz v10, :cond_13

    sget-object v5, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/StripeTheme;->getShapesMutable()Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v5

    and-int/lit8 v4, v4, -0x71

    :cond_13
    and-int/lit8 v10, p6, 0x4

    if-eqz v10, :cond_14

    sget-object v6, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-virtual {v6}, Lcom/stripe/android/uicore/StripeTheme;->getTypographyMutable()Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v6

    :goto_a
    and-int/lit16 v4, v4, -0x381

    :cond_14
    move-object v10, v1

    move-object v12, v5

    move-object v13, v6

    invoke-interface {v9}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_15

    const/4 v1, -0x1

    const-string v5, "com.stripe.android.uicore.StripeTheme (StripeTheme.kt:307)"

    invoke-static {v0, v4, v1, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_15
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v1, "FINGERPRINT"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "robolectric"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_b

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_b
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_16

    move-object v0, v1

    :cond_16
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {}, LT32;->a()LU94;

    move-result-object v1

    invoke-interface {v9, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v14, 0x1

    if-nez v1, :cond_18

    if-eqz v0, :cond_17

    goto :goto_c

    :cond_17
    move v0, v11

    goto :goto_d

    :cond_18
    :goto_c
    move v0, v14

    :goto_d
    new-array v15, v2, [LW94;

    sget-object v1, Lcom/stripe/android/uicore/StripeThemeKt;->LocalColors:LU94;

    invoke-virtual {v1, v10}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    aput-object v1, v15, v11

    sget-object v1, Lcom/stripe/android/uicore/StripeThemeKt;->LocalShapes:LU94;

    invoke-virtual {v1, v12}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    aput-object v1, v15, v14

    sget-object v1, Lcom/stripe/android/uicore/StripeThemeKt;->LocalTypography:LU94;

    invoke-virtual {v1, v13}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    aput-object v1, v15, v3

    invoke-static {}, LT32;->a()LU94;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v15, v1

    new-instance v0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;

    move-object v1, v0

    move-object v2, v10

    move-object v3, v13

    move-object v5, v12

    move-object/from16 v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;-><init>(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeTypography;ILcom/stripe/android/uicore/StripeShapes;Lkotlin/jvm/functions/Function2;)V

    const v1, -0x11485380

    invoke-static {v9, v1, v14, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v15, v0, v9, v1}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LQt0;->Y()V

    :cond_19
    move-object v2, v10

    move-object v3, v12

    move-object v4, v13

    :goto_e
    invoke-interface {v9}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_1a

    goto :goto_f

    :cond_1a
    new-instance v9, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;

    move-object v1, v9

    move-object/from16 v5, p3

    move/from16 v6, p5

    move/from16 v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;-><init>(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {v0, v9}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_f
    return-void
.end method

.method public static final convertDpToPx-3ABfNKs(Landroid/content/Context;F)F
    .locals 1

    const-string v0, "$this$convertDpToPx"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, p0

    return p1
.end method

.method public static final createTextSpanFromTextStyle-qhTmNto(Ljava/lang/String;Landroid/content/Context;FJLjava/lang/Integer;)Landroid/text/SpannableString;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/text/SpannableString;

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    invoke-direct {v0, p0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/StripeThemeKt;->convertDpToPx-3ABfNKs(Landroid/content/Context;F)F

    move-result p0

    new-instance p2, Landroid/text/style/AbsoluteSizeSpan;

    float-to-int p0, p0

    invoke-direct {p2, p0}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result p0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1, p0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    new-instance p0, Landroid/text/style/ForegroundColorSpan;

    invoke-static {p3, p4}, Lvm0;->h(J)I

    move-result p2

    invoke-direct {p0, p2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result p2

    invoke-virtual {v0, p0, v1, p2, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    if-eqz p5, :cond_1

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p1, p0}, LuM4;->h(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object p0

    goto :goto_0

    :cond_1
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    :goto_0
    if-eqz p0, :cond_2

    new-instance p1, Lcom/stripe/android/uicore/CustomTypefaceSpan;

    invoke-direct {p1, p0}, Lcom/stripe/android/uicore/CustomTypefaceSpan;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result p0

    invoke-virtual {v0, p1, v1, p0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_2
    return-object v0
.end method

.method public static final darken-DxMtmZc(JF)J
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/StripeThemeKt$darken$1;

    invoke-direct {v0, p2}, Lcom/stripe/android/uicore/StripeThemeKt$darken$1;-><init>(F)V

    invoke-static {p0, p1, v0}, Lcom/stripe/android/uicore/StripeThemeKt;->modifyBrightness-DxMtmZc(JLkotlin/jvm/functions/Function1;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final getBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/stripe/android/uicore/StripeThemeKt;->isSystemDarkTheme(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getColorsDark()Lcom/stripe/android/uicore/PrimaryButtonColors;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getColorsLight()Lcom/stripe/android/uicore/PrimaryButtonColors;

    move-result-object p0

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/uicore/PrimaryButtonColors;->getBackground-0d7_KjU()J

    move-result-wide p0

    invoke-static {p0, p1}, Lvm0;->h(J)I

    move-result p0

    return p0
.end method

.method public static final getBorderStroke(LTM2;ZLEt0;I)LeZ;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.uicore.getBorderStroke (StripeTheme.kt:392)"

    const v2, 0x3a9b7660

    invoke-static {v2, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget v0, LTM2;->b:I

    and-int/lit8 v1, p3, 0xe

    or-int v2, v0, v1

    and-int/lit8 p3, p3, 0x70

    or-int/2addr v2, p3

    invoke-static {p0, p1, p2, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStrokeWidth(LTM2;ZLEt0;I)F

    move-result v2

    or-int/2addr v0, v1

    or-int/2addr p3, v0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStrokeColor(LTM2;ZLEt0;I)J

    move-result-wide p0

    invoke-static {v2, p0, p1}, LfZ;->a(FJ)LeZ;

    move-result-object p0

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return-object p0
.end method

.method public static final getBorderStrokeColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/stripe/android/uicore/StripeThemeKt;->isSystemDarkTheme(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getColorsDark()Lcom/stripe/android/uicore/PrimaryButtonColors;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getColorsLight()Lcom/stripe/android/uicore/PrimaryButtonColors;

    move-result-object p0

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/uicore/PrimaryButtonColors;->getBorder-0d7_KjU()J

    move-result-wide p0

    invoke-static {p0, p1}, Lvm0;->h(J)I

    move-result p0

    return p0
.end method

.method public static final getBorderStrokeColor(LTM2;ZLEt0;I)J
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.uicore.getBorderStrokeColor (StripeTheme.kt:386)"

    const v2, -0x2ea92170

    invoke-static {v2, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    const p1, -0x791d6a1

    invoke-interface {p2, p1}, LEt0;->F(I)V

    sget p1, LTM2;->b:I

    and-int/lit8 p3, p3, 0xe

    or-int/2addr p1, p3

    invoke-static {p0, p2, p1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object p0

    invoke-virtual {p0}, LMm0;->j()J

    move-result-wide p0

    goto :goto_0

    :cond_1
    const p1, -0x791d687

    invoke-interface {p2, p1}, LEt0;->F(I)V

    sget p1, LTM2;->b:I

    and-int/lit8 p3, p3, 0xe

    or-int/2addr p1, p3

    invoke-static {p0, p2, p1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/StripeColors;->getComponentBorder-0d7_KjU()J

    move-result-wide p0

    :goto_0
    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    return-wide p0
.end method

.method public static final getBorderStrokeWidth(LTM2;ZLEt0;I)F
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.uicore.getBorderStrokeWidth (StripeTheme.kt:380)"

    const v2, 0x1f2344c2

    invoke-static {v2, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    const p1, 0x1a36f677

    invoke-interface {p2, p1}, LEt0;->F(I)V

    sget p1, LTM2;->b:I

    and-int/lit8 p3, p3, 0xe

    or-int/2addr p1, p3

    invoke-static {p0, p2, p1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidthSelected()F

    move-result p0

    goto :goto_0

    :cond_1
    const p1, 0x1a36f69e

    invoke-interface {p2, p1}, LEt0;->F(I)V

    sget p1, LTM2;->b:I

    and-int/lit8 p3, p3, 0xe

    or-int/2addr p1, p3

    invoke-static {p0, p2, p1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result p0

    :goto_0
    invoke-static {p0}, Lk61;->g(F)F

    move-result p0

    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    return p0
.end method

.method public static final getComposeTextStyle(Lcom/stripe/android/uicore/PrimaryButtonStyle;LEt0;I)LG26;
    .locals 55

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v3, "com.stripe.android.uicore.getComposeTextStyle (StripeTheme.kt:508)"

    const v4, -0x7aa8746f

    move/from16 v5, p2

    invoke-static {v4, v5, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-virtual {v1, v0, v3}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v1

    invoke-virtual {v1}, LGc6;->i()LG26;

    move-result-object v3

    const/4 v1, 0x0

    invoke-static {v0, v1}, LwS0;->a(LEt0;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getColorsDark()Lcom/stripe/android/uicore/PrimaryButtonColors;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getColorsLight()Lcom/stripe/android/uicore/PrimaryButtonColors;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Lcom/stripe/android/uicore/PrimaryButtonColors;->getOnBackground-0d7_KjU()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getTypography()Lcom/stripe/android/uicore/PrimaryButtonTypography;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/PrimaryButtonTypography;->getFontSize-XSAIIZE()J

    move-result-wide v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const v27, 0x3fffc

    const/16 v28, 0x0

    invoke-static/range {v3 .. v28}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v29

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getTypography()Lcom/stripe/android/uicore/PrimaryButtonTypography;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/PrimaryButtonTypography;->getFontFamily()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/4 v0, 0x1

    new-array v0, v0, [Lew1;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getTypography()Lcom/stripe/android/uicore/PrimaryButtonTypography;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonTypography;->getFontFamily()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lqw1;->b(ILJw1;IIILjava/lang/Object;)Lew1;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Llw1;->b([Lew1;)Lkw1;

    move-result-object v37

    const/16 v38, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const-wide/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    const v53, 0x3ffdf

    const/16 v54, 0x0

    invoke-static/range {v29 .. v54}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v29

    :cond_2
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    return-object v29
.end method

.method public static final getLocalColors()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Lcom/stripe/android/uicore/StripeColors;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeKt;->LocalColors:LU94;

    return-object v0
.end method

.method public static final getLocalShapes()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Lcom/stripe/android/uicore/StripeShapes;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeKt;->LocalShapes:LU94;

    return-object v0
.end method

.method public static final getLocalTypography()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Lcom/stripe/android/uicore/StripeTypography;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/StripeThemeKt;->LocalTypography:LU94;

    return-object v0
.end method

.method public static final getOnBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/stripe/android/uicore/StripeThemeKt;->isSystemDarkTheme(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getColorsDark()Lcom/stripe/android/uicore/PrimaryButtonColors;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getColorsLight()Lcom/stripe/android/uicore/PrimaryButtonColors;

    move-result-object p0

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/uicore/PrimaryButtonColors;->getOnBackground-0d7_KjU()J

    move-result-wide p0

    invoke-static {p0, p1}, Lvm0;->h(J)I

    move-result p0

    return p0
.end method

.method public static final getRawValueFromDimenResource(Landroid/content/Context;I)F
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p1, p0

    return p1
.end method

.method public static final getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;
    .locals 2
    .annotation build Lkotlin/jvm/JvmName;
        name = "getStripeColors"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, -0x1

    const-string v0, "com.stripe.android.uicore.<get-stripeColors> (StripeTheme.kt:364)"

    const v1, 0x4dbb0fc0    # 3.92296448E8f

    invoke-static {v1, p2, p0, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p0, Lcom/stripe/android/uicore/StripeThemeKt;->LocalColors:LU94;

    invoke-interface {p1, p0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/StripeColors;

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return-object p0
.end method

.method public static final getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;
    .locals 2
    .annotation build Lkotlin/jvm/JvmName;
        name = "getStripeShapes"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, -0x1

    const-string v0, "com.stripe.android.uicore.<get-stripeShapes> (StripeTheme.kt:369)"

    const v1, 0x68cbcf02

    invoke-static {v1, p2, p0, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p0, Lcom/stripe/android/uicore/StripeThemeKt;->LocalShapes:LU94;

    invoke-interface {p1, p0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/StripeShapes;

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return-object p0
.end method

.method public static final getStripeTypography(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeTypography;
    .locals 2
    .annotation build Lkotlin/jvm/JvmName;
        name = "getStripeTypography"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, -0x1

    const-string v0, "com.stripe.android.uicore.<get-stripeTypography> (StripeTheme.kt:375)"

    const v1, -0x2320cf61

    invoke-static {v1, p2, p0, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p0, Lcom/stripe/android/uicore/StripeThemeKt;->LocalTypography:LU94;

    invoke-interface {p1, p0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/StripeTypography;

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return-object p0
.end method

.method public static final isSystemDarkTheme(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final lighten-DxMtmZc(JF)J
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/StripeThemeKt$lighten$1;

    invoke-direct {v0, p2}, Lcom/stripe/android/uicore/StripeThemeKt$lighten$1;-><init>(F)V

    invoke-static {p0, p1, v0}, Lcom/stripe/android/uicore/StripeThemeKt;->modifyBrightness-DxMtmZc(JLkotlin/jvm/functions/Function1;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final modifyBrightness-DxMtmZc(JLkotlin/jvm/functions/Function1;)J
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)J"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [F

    invoke-static {p0, p1}, Lvm0;->h(J)I

    move-result p0

    invoke-static {p0, v0}, LJm0;->h(I[F)V

    const/4 p0, 0x0

    aget v2, v0, p0

    const/4 p0, 0x1

    aget v3, v0, p0

    const/4 p0, 0x2

    aget p0, v0, p0

    sget-object v1, Lpm0;->b:Lpm0$a;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lpm0$a;->j(Lpm0$a;FFFFLSO4;ILjava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final shouldUseDarkDynamicColor-8_81llA(J)Z
    .locals 4

    invoke-static {p0, p1}, Lvm0;->h(J)I

    move-result v0

    sget-object v1, Lpm0;->b:Lpm0$a;

    invoke-virtual {v1}, Lpm0$a;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Lvm0;->h(J)I

    move-result v2

    invoke-static {v0, v2}, LJm0;->e(II)D

    move-result-wide v2

    invoke-static {p0, p1}, Lvm0;->h(J)I

    move-result p0

    invoke-virtual {v1}, Lpm0$a;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Lvm0;->h(J)I

    move-result p1

    invoke-static {p0, p1}, LJm0;->e(II)D

    move-result-wide p0

    const-wide v0, 0x400199999999999aL    # 2.2

    cmpl-double v0, p0, v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    cmpl-double p0, v2, p0

    if-lez p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method public static final toComposeShapes(Lcom/stripe/android/uicore/StripeShapes;LEt0;I)Lcom/stripe/android/uicore/StripeComposeShapes;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.uicore.toComposeShapes (StripeTheme.kt:209)"

    const v2, -0x1fa3b9ff

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance p2, Lcom/stripe/android/uicore/StripeComposeShapes;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidthSelected()F

    move-result v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    sget-object v2, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-virtual {v2, p1, v3}, LTM2;->b(LEt0;I)LDy5;

    move-result-object v4

    invoke-virtual {p0}, Lcom/stripe/android/uicore/StripeShapes;->getCornerRadius()F

    move-result p1

    invoke-static {p1}, Lk61;->g(F)F

    move-result p1

    invoke-static {p1}, Lcc5;->d(F)Lbc5;

    move-result-object v5

    invoke-virtual {p0}, Lcom/stripe/android/uicore/StripeShapes;->getCornerRadius()F

    move-result p0

    invoke-static {p0}, Lk61;->g(F)F

    move-result p0

    invoke-static {p0}, Lcc5;->d(F)Lbc5;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LDy5;->b(LDy5;LKC0;LKC0;LKC0;ILjava/lang/Object;)LDy5;

    move-result-object p0

    const/4 p1, 0x0

    invoke-direct {p2, v0, v1, p0, p1}, Lcom/stripe/android/uicore/StripeComposeShapes;-><init>(FFLDy5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return-object p2
.end method

.method public static final toComposeTypography(Lcom/stripe/android/uicore/StripeTypography;LEt0;I)LGc6;
    .locals 45

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v2, "com.stripe.android.uicore.toComposeTypography (StripeTheme.kt:223)"

    const v3, 0x5e35ba05

    move/from16 v4, p2

    invoke-static {v3, v4, v0, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontFamily()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v0, 0x1

    new-array v0, v0, [Lew1;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lqw1;->b(ILJw1;IIILjava/lang/Object;)Lew1;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-static {v0}, Llw1;->b([Lew1;)Lkw1;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v2, LG26;->d:LG26$a;

    invoke-virtual {v2}, LG26$a;->a()LG26;

    move-result-object v3

    if-nez v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getH4FontFamily()Lkw1;

    move-result-object v4

    if-nez v4, :cond_2

    sget-object v4, Lkw1;->c:Lkw1$a;

    invoke-virtual {v4}, Lkw1$a;->a()LUX5;

    move-result-object v4

    :cond_2
    move-object v11, v4

    goto :goto_1

    :cond_3
    move-object v11, v0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getXLargeFontSize-XSAIIZE()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontSizeMultiplier()F

    move-result v6

    invoke-static {v4, v5}, LN26;->b(J)V

    invoke-static {v4, v5}, LM26;->f(J)J

    move-result-wide v7

    invoke-static {v4, v5}, LM26;->h(J)F

    move-result v4

    mul-float/2addr v4, v6

    invoke-static {v7, v8, v4}, LN26;->i(JF)J

    move-result-wide v6

    new-instance v4, LJw1;

    move-object v8, v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontWeightBold()I

    move-result v5

    invoke-direct {v4, v5}, LJw1;-><init>(I)V

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const v27, 0x3ffd9

    const/16 v28, 0x0

    invoke-static/range {v3 .. v28}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v33

    invoke-virtual {v2}, LG26$a;->a()LG26;

    move-result-object v3

    if-nez v0, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getH5FontFamily()Lkw1;

    move-result-object v4

    if-nez v4, :cond_4

    sget-object v4, Lkw1;->c:Lkw1$a;

    invoke-virtual {v4}, Lkw1$a;->a()LUX5;

    move-result-object v4

    :cond_4
    move-object v11, v4

    goto :goto_2

    :cond_5
    move-object v11, v0

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getLargeFontSize-XSAIIZE()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontSizeMultiplier()F

    move-result v6

    invoke-static {v4, v5}, LN26;->b(J)V

    invoke-static {v4, v5}, LM26;->f(J)J

    move-result-wide v7

    invoke-static {v4, v5}, LM26;->h(J)F

    move-result v4

    mul-float/2addr v4, v6

    invoke-static {v7, v8, v4}, LN26;->i(JF)J

    move-result-wide v6

    new-instance v4, LJw1;

    move-object v8, v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontWeightMedium()I

    move-result v5

    invoke-direct {v4, v5}, LJw1;-><init>(I)V

    const-wide v4, -0x402b851eb851eb85L    # -0.32

    invoke-static {v4, v5}, LN26;->d(D)J

    move-result-wide v13

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const v27, 0x3ff59

    const/16 v28, 0x0

    invoke-static/range {v3 .. v28}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v34

    invoke-virtual {v2}, LG26$a;->a()LG26;

    move-result-object v3

    if-nez v0, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getH6FontFamily()Lkw1;

    move-result-object v4

    if-nez v4, :cond_6

    sget-object v4, Lkw1;->c:Lkw1$a;

    invoke-virtual {v4}, Lkw1$a;->a()LUX5;

    move-result-object v4

    :cond_6
    move-object v11, v4

    goto :goto_3

    :cond_7
    move-object v11, v0

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getSmallFontSize-XSAIIZE()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontSizeMultiplier()F

    move-result v6

    invoke-static {v4, v5}, LN26;->b(J)V

    invoke-static {v4, v5}, LM26;->f(J)J

    move-result-wide v7

    invoke-static {v4, v5}, LM26;->h(J)F

    move-result v4

    mul-float/2addr v4, v6

    invoke-static {v7, v8, v4}, LN26;->i(JF)J

    move-result-wide v6

    new-instance v4, LJw1;

    move-object v8, v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontWeightMedium()I

    move-result v5

    invoke-direct {v4, v5}, LJw1;-><init>(I)V

    const-wide v29, -0x403ccccccccccccdL    # -0.15

    invoke-static/range {v29 .. v30}, LN26;->d(D)J

    move-result-wide v13

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const v27, 0x3ff59

    const/16 v28, 0x0

    invoke-static/range {v3 .. v28}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v35

    invoke-virtual {v2}, LG26$a;->a()LG26;

    move-result-object v3

    if-nez v0, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getBody1FontFamily()Lkw1;

    move-result-object v4

    if-nez v4, :cond_8

    sget-object v4, Lkw1;->c:Lkw1$a;

    invoke-virtual {v4}, Lkw1$a;->a()LUX5;

    move-result-object v4

    :cond_8
    move-object v11, v4

    goto :goto_4

    :cond_9
    move-object v11, v0

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getMediumFontSize-XSAIIZE()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontSizeMultiplier()F

    move-result v6

    invoke-static {v4, v5}, LN26;->b(J)V

    invoke-static {v4, v5}, LM26;->f(J)J

    move-result-wide v7

    invoke-static {v4, v5}, LM26;->h(J)F

    move-result v4

    mul-float/2addr v4, v6

    invoke-static {v7, v8, v4}, LN26;->i(JF)J

    move-result-wide v6

    new-instance v4, LJw1;

    move-object v8, v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontWeightNormal()I

    move-result v5

    invoke-direct {v4, v5}, LJw1;-><init>(I)V

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const v27, 0x3ffd9

    const/16 v28, 0x0

    invoke-static/range {v3 .. v28}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v38

    invoke-virtual {v2}, LG26$a;->a()LG26;

    move-result-object v3

    if-nez v0, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getSubtitle1FontFamily()Lkw1;

    move-result-object v4

    if-nez v4, :cond_a

    sget-object v4, Lkw1;->c:Lkw1$a;

    invoke-virtual {v4}, Lkw1$a;->a()LUX5;

    move-result-object v4

    :cond_a
    move-object v11, v4

    goto :goto_5

    :cond_b
    move-object v11, v0

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getMediumFontSize-XSAIIZE()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontSizeMultiplier()F

    move-result v6

    invoke-static {v4, v5}, LN26;->b(J)V

    invoke-static {v4, v5}, LM26;->f(J)J

    move-result-wide v7

    invoke-static {v4, v5}, LM26;->h(J)F

    move-result v4

    mul-float/2addr v4, v6

    invoke-static {v7, v8, v4}, LN26;->i(JF)J

    move-result-wide v6

    new-instance v4, LJw1;

    move-object v8, v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontWeightNormal()I

    move-result v5

    invoke-direct {v4, v5}, LJw1;-><init>(I)V

    invoke-static/range {v29 .. v30}, LN26;->d(D)J

    move-result-wide v13

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const v27, 0x3ff59

    const/16 v28, 0x0

    invoke-static/range {v3 .. v28}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v36

    invoke-virtual {v2}, LG26$a;->a()LG26;

    move-result-object v3

    if-nez v0, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getCaptionFontFamily()Lkw1;

    move-result-object v4

    if-nez v4, :cond_c

    sget-object v4, Lkw1;->c:Lkw1$a;

    invoke-virtual {v4}, Lkw1$a;->a()LUX5;

    move-result-object v4

    :cond_c
    move-object v11, v4

    goto :goto_6

    :cond_d
    move-object v11, v0

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getXSmallFontSize-XSAIIZE()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontSizeMultiplier()F

    move-result v6

    invoke-static {v4, v5}, LN26;->b(J)V

    invoke-static {v4, v5}, LM26;->f(J)J

    move-result-wide v7

    invoke-static {v4, v5}, LM26;->h(J)F

    move-result v4

    mul-float/2addr v4, v6

    invoke-static {v7, v8, v4}, LN26;->i(JF)J

    move-result-wide v6

    new-instance v4, LJw1;

    move-object v8, v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontWeightMedium()I

    move-result v5

    invoke-direct {v4, v5}, LJw1;-><init>(I)V

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const v27, 0x3ffd9

    const/16 v28, 0x0

    invoke-static/range {v3 .. v28}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v41

    invoke-virtual {v2}, LG26$a;->a()LG26;

    move-result-object v3

    if-nez v0, :cond_e

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getBody2FontFamily()Lkw1;

    move-result-object v0

    if-nez v0, :cond_e

    sget-object v0, Lkw1;->c:Lkw1$a;

    invoke-virtual {v0}, Lkw1$a;->a()LUX5;

    move-result-object v0

    :cond_e
    move-object v11, v0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getXxSmallFontSize-XSAIIZE()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontSizeMultiplier()F

    move-result v0

    invoke-static {v4, v5}, LN26;->b(J)V

    invoke-static {v4, v5}, LM26;->f(J)J

    move-result-wide v6

    invoke-static {v4, v5}, LM26;->h(J)F

    move-result v2

    mul-float/2addr v2, v0

    invoke-static {v6, v7, v2}, LN26;->i(JF)J

    move-result-wide v6

    new-instance v0, LJw1;

    move-object v8, v0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/uicore/StripeTypography;->getFontWeightNormal()I

    move-result v1

    invoke-direct {v0, v1}, LJw1;-><init>(I)V

    invoke-static/range {v29 .. v30}, LN26;->d(D)J

    move-result-wide v13

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const v27, 0x3ff59

    const/16 v28, 0x0

    invoke-static/range {v3 .. v28}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v39

    sget-object v0, LTM2;->a:LTM2;

    sget v1, LTM2;->b:I

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v1}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v29

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v37, 0x0

    const/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x1487

    const/16 v44, 0x0

    invoke-static/range {v29 .. v44}, LGc6;->b(LGc6;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;ILjava/lang/Object;)LGc6;

    move-result-object v0

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    return-object v0
.end method

.class final Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/text/HtmlKt;->ClickableText-mZk19tU(LDf;JLG26;LgV2;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $color:J

.field final synthetic $inlineContent:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LL22;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $maxLines:I

.field final synthetic $modifier:LgV2;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onTextLayout:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Li26;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $overflow:I

.field final synthetic $softWrap:Z

.field final synthetic $style:LG26;

.field final synthetic $text:LDf;


# direct methods
.method public constructor <init>(LDf;JLG26;LgV2;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDf;",
            "J",
            "LG26;",
            "LgV2;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LL22;",
            ">;ZII",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Li26;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$text:LDf;

    iput-wide p2, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$color:J

    iput-object p4, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$style:LG26;

    iput-object p5, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$modifier:LgV2;

    iput-object p6, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$inlineContent:Ljava/util/Map;

    iput-boolean p7, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$softWrap:Z

    iput p8, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$overflow:I

    iput p9, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$maxLines:I

    iput-object p10, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$onTextLayout:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$onClick:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$$changed:I

    iput p13, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$$default:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$text:LDf;

    iget-wide v2, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$color:J

    iget-object v4, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$style:LG26;

    iget-object v5, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$modifier:LgV2;

    iget-object v6, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$inlineContent:Ljava/util/Map;

    iget-boolean v7, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$softWrap:Z

    iget v8, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$overflow:I

    iget v9, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$maxLines:I

    iget-object v10, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$onTextLayout:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$onClick:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$$changed:I

    or-int/lit8 v13, v12, 0x1

    iget v14, v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;->$$default:I

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, Lcom/stripe/android/uicore/text/HtmlKt;->access$ClickableText-mZk19tU(LDf;JLG26;LgV2;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V

    return-void
.end method

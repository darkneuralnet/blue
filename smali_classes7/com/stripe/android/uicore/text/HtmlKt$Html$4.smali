.class final Lcom/stripe/android/uicore/text/HtmlKt$Html$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/text/HtmlKt;->Html-m4MizFo(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V
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

.field final synthetic $enabled:Z

.field final synthetic $html:Ljava/lang/String;

.field final synthetic $imageAlign:I

.field final synthetic $imageLoader:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/text/EmbeddableImage;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:LgV2;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $style:LG26;

.field final synthetic $urlSpanStyle:LGN5;


# direct methods
.method public constructor <init>(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LgV2;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/stripe/android/uicore/text/EmbeddableImage;",
            ">;J",
            "LG26;",
            "Z",
            "LGN5;",
            "I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$html:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$modifier:LgV2;

    iput-object p3, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$imageLoader:Ljava/util/Map;

    iput-wide p4, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$color:J

    iput-object p6, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$style:LG26;

    iput-boolean p7, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$enabled:Z

    iput-object p8, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$urlSpanStyle:LGN5;

    iput p9, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$imageAlign:I

    iput-object p10, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$onClick:Lkotlin/jvm/functions/Function0;

    iput p11, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$$changed:I

    iput p12, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 13

    iget-object v0, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$html:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$modifier:LgV2;

    iget-object v2, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$imageLoader:Ljava/util/Map;

    iget-wide v3, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$color:J

    iget-object v5, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$style:LG26;

    iget-boolean v6, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$enabled:Z

    iget-object v7, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$urlSpanStyle:LGN5;

    iget v8, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$imageAlign:I

    iget-object v9, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$onClick:Lkotlin/jvm/functions/Function0;

    iget p2, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$$changed:I

    or-int/lit8 v11, p2, 0x1

    iget v12, p0, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;->$$default:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, Lcom/stripe/android/uicore/text/HtmlKt;->Html-m4MizFo(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V

    return-void
.end method

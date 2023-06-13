.class final Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt;->SearchFooterRow-tjc1scY(Ljava/lang/String;JIJJLgV2;LEt0;II)V
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

.field final synthetic $icon:I

.field final synthetic $iconBackgroundColor:J

.field final synthetic $iconColor:J

.field final synthetic $modifier:LgV2;

.field final synthetic $title:Ljava/lang/String;

.field final synthetic $titleColor:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JIJJLgV2;II)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$title:Ljava/lang/String;

    iput-wide p2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$titleColor:J

    iput p4, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$icon:I

    iput-wide p5, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$iconColor:J

    iput-wide p7, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$iconBackgroundColor:J

    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$modifier:LgV2;

    iput p10, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$$changed:I

    iput p11, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 12

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$title:Ljava/lang/String;

    iget-wide v1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$titleColor:J

    iget v3, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$icon:I

    iget-wide v4, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$iconColor:J

    iget-wide v6, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$iconBackgroundColor:J

    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$modifier:LgV2;

    iget p2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$$changed:I

    or-int/lit8 v10, p2, 0x1

    iget v11, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt$SearchFooterRow$2;->$$default:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, Lcom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt;->access$SearchFooterRow-tjc1scY(Ljava/lang/String;JIJJLgV2;LEt0;II)V

    return-void
.end method

.class final Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LCe3;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n288#2,2:434\n*S KotlinDebug\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1\n*L\n402#1:434,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $layoutResult:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Li26;",
            ">;"
        }
    .end annotation
.end field

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


# direct methods
.method public constructor <init>(LEX2;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Li26;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1;->$layoutResult:LEX2;

    iput-object p2, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1;->$onClick:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LCe3;

    invoke-virtual {p1}, LCe3;->x()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1;->invoke-k-4lQ0M(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke-k-4lQ0M(J)V
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1;->$layoutResult:LEX2;

    invoke-interface {v0}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li26;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Li26;->z()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LOs4;

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result v4

    invoke-virtual {v3}, LOs4;->m()J

    move-result-wide v5

    invoke-static {v5, v6}, LCe3;->o(J)F

    move-result v5

    cmpl-float v4, v4, v5

    if-lez v4, :cond_1

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result v4

    invoke-virtual {v3}, LOs4;->n()J

    move-result-wide v5

    invoke-static {v5, v6}, LCe3;->o(J)F

    move-result v3

    cmpg-float v3, v4, v3

    if-gez v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    check-cast v2, LOs4;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LOs4;->n()J

    move-result-wide v3

    invoke-virtual {v2}, LOs4;->n()J

    move-result-wide p1

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result p1

    const p2, 0x3dcccccd    # 0.1f

    add-float v5, p1, p2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LCe3;->i(JFFILjava/lang/Object;)J

    move-result-wide p1

    :cond_3
    iget-object v0, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1;->$layoutResult:LEX2;

    invoke-interface {v0}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li26;

    if-eqz v0, :cond_4

    iget-object v2, p0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1;->$onClick:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, p1, p2}, Li26;->w(J)I

    move-result p1

    sub-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method

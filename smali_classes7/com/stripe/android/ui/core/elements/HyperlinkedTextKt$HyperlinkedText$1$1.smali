.class final Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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


# instance fields
.field final synthetic $annotatedString:LDf;

.field final synthetic $layoutResult:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Li26;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $uriHandler:LDf6;


# direct methods
.method public constructor <init>(LEX2;LDf;LDf6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Li26;",
            ">;",
            "LDf;",
            "LDf6;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1$1;->$layoutResult:LEX2;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1$1;->$annotatedString:LDf;

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1$1;->$uriHandler:LDf6;

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

    invoke-virtual {p0, v0, v1}, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1$1;->invoke-k-4lQ0M(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke-k-4lQ0M(J)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1$1;->$layoutResult:LEX2;

    invoke-interface {v0}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li26;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1$1;->$annotatedString:LDf;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1$1;->$uriHandler:LDf6;

    invoke-virtual {v0, p1, p2}, Li26;->w(J)I

    move-result p1

    invoke-virtual {v1, p1, p1}, LDf;->h(II)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDf$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LDf$b;->g()Ljava/lang/String;

    move-result-object p2

    const-string v0, "URL"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LDf$b;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v2, p1}, LDf6;->openUri(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

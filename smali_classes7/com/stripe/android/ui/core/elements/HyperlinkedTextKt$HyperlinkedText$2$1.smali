.class final Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt;->HyperlinkedText-cf5BqRc(Ljava/lang/String;LgV2;JLG26;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Li26;",
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
.field final synthetic $layoutResult:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Li26;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Li26;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$2$1;->$layoutResult:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li26;

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$2$1;->invoke(Li26;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Li26;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$2$1;->$layoutResult:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

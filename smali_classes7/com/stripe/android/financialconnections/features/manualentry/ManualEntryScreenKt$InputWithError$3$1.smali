.class final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->InputWithError(Lkotlin/Pair;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LF16;",
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
.field final synthetic $onInputChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $textValue$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LF16;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "LEX2<",
            "LF16;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1;->$onInputChanged:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1;->$textValue$delegate:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF16;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1;->invoke(LF16;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LF16;)V
    .locals 2

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1;->$textValue$delegate:LEX2;

    sget-object v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1$1;

    invoke-static {p1, v1}, Lcom/stripe/android/financialconnections/ui/components/TextFieldKt;->filtered(LF16;Lkotlin/jvm/functions/Function1;)LF16;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->access$InputWithError$lambda$13(LEX2;LF16;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1;->$onInputChanged:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1;->$textValue$delegate:LEX2;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->access$InputWithError$lambda$12(LEX2;)LF16;

    move-result-object v0

    invoke-virtual {v0}, LF16;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.class final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1;->invoke(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $error:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1$1;->$error:Ljava/lang/Integer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;
    .locals 12

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1$1;->$error:Ljava/lang/Integer;

    const/4 v9, 0x0

    const/16 v10, 0xbf

    const/4 v11, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v11}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->copy$default(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ldp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ldp;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1$1;->invoke(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    move-result-object p1

    return-object p1
.end method

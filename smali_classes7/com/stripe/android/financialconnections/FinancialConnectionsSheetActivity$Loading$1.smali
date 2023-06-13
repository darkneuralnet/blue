.class final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Loading$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->Loading(LEt0;I)V
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

.field final synthetic $tmp0_rcvr:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;I)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Loading$1;->$tmp0_rcvr:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    iput p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Loading$1;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Loading$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Loading$1;->$tmp0_rcvr:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    iget v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Loading$1;->$$changed:I

    or-int/lit8 v0, v0, 0x1

    invoke-static {p2, p1, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->access$Loading(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;LEt0;I)V

    return-void
.end method

.class final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->onSubmit()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "Ldp<",
        "+",
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        ">;",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "Ldp;",
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        "it",
        "invoke",
        "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ldp;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$2;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$2;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ldp;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;"
        }
    .end annotation

    const-string v0, "$this$execute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v10, 0x7f

    const/4 v11, 0x0

    move-object v1, p1

    move-object v9, p2

    invoke-static/range {v1 .. v11}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->copy$default(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ldp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ldp;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    check-cast p2, Ldp;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$2;->invoke(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ldp;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    move-result-object p1

    return-object p1
.end method

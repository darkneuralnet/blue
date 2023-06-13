.class public final Ln60$k$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln60$k;->j(Ljava/util/List;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/api/response/OperatorBatchStatusResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ln60;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln60;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln60;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ln60$k$i;->g:Ln60;

    iput-object p2, p0, Ln60$k$i;->h:Ljava/lang/String;

    iput-object p3, p0, Ln60$k$i;->i:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/OperatorBatchStatusResponse;)V
    .locals 4

    iget-object p1, p0, Ln60$k$i;->g:Ln60;

    invoke-static {p1}, Ln60;->access$getUi$p(Ln60;)LH60;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LH60;->Rc(Z)V

    iget-object p1, p0, Ln60$k$i;->g:Ln60;

    iget-object v1, p0, Ln60$k$i;->h:Ljava/lang/String;

    invoke-static {p1}, Ln60;->access$getActionKind$p(Ln60;)Lco/bird/api/response/OpsBatchJobActionKind;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "actionKind"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ln60$k$i;->i:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {p1, v1, v2, v3, v0}, Ln60;->access$logBulkScannerActionCompleted(Ln60;Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/OperatorBatchStatusResponse;

    invoke-virtual {p0, p1}, Ln60$k$i;->a(Lco/bird/api/response/OperatorBatchStatusResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

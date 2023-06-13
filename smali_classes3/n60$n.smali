.class public final Ln60$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln60;->L(Landroid/content/Intent;)V
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
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        "response",
        "",
        "LH6;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/OperatorBatchStatusResponse;)Ljava/util/List;"
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


# direct methods
.method public constructor <init>(Ln60;)V
    .locals 0

    iput-object p1, p0, Ln60$n;->g:Ln60;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/OperatorBatchStatusResponse;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/OperatorBatchStatusResponse;",
            ")",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln60$n;->g:Ln60;

    invoke-static {v0}, Ln60;->access$getConverter$p(Ln60;)LH50;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/OperatorBatchStatusResponse;->getSuccessCount()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    invoke-virtual {p1}, Lco/bird/api/response/OperatorBatchStatusResponse;->getSuccessMessage()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {p1}, Lco/bird/api/response/OperatorBatchStatusResponse;->getNotices()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/api/response/OperatorBatchStatusResponse;->getFailedCount()I

    move-result v4

    if-lez v4, :cond_1

    invoke-virtual {p1}, Lco/bird/api/response/OperatorBatchStatusResponse;->getFailMessage()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {p1}, Lco/bird/api/response/OperatorBatchStatusResponse;->getErrors()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, v1, v3, v2, p1}, LH50;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/OperatorBatchStatusResponse;

    invoke-virtual {p0, p1}, Ln60$n;->a(Lco/bird/api/response/OperatorBatchStatusResponse;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

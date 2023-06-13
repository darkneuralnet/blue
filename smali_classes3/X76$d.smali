.class public final LX76$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX76;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "LH6;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "invoke",
        "(Ljava/util/List;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LX76;


# direct methods
.method public constructor <init>(LX76;)V
    .locals 0

    iput-object p1, p0, LX76$d;->g:LX76;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LX76$d;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, LX76$d;->g:LX76;

    invoke-static {p1}, LX76;->access$getTitle$p(LX76;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, LX76$d;->g:LX76;

    invoke-virtual {p1}, LX76;->k()Lco/bird/api/response/ReceiptDetailResponse;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/api/response/ReceiptDetailResponse;->getTitle()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    iget-object p1, p0, LX76$d;->g:LX76;

    invoke-static {p1}, LX76;->access$getUi$p(LX76;)LZ76;

    move-result-object p1

    iget-object v1, p0, LX76$d;->g:LX76;

    invoke-virtual {v1}, LX76;->k()Lco/bird/api/response/ReceiptDetailResponse;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/api/response/ReceiptDetailResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p1, v0}, LZ76;->t(Ljava/lang/String;)V

    :cond_2
    iget-object p1, p0, LX76$d;->g:LX76;

    invoke-static {p1}, LX76;->access$getUi$p(LX76;)LZ76;

    move-result-object p1

    iget-object v0, p0, LX76$d;->g:LX76;

    invoke-virtual {v0}, LX76;->k()Lco/bird/api/response/ReceiptDetailResponse;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lco/bird/api/response/ReceiptDetailResponse;->getShowDownloadInvoiceButton()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1, v0}, LZ76;->Ql(Z)V

    return-void
.end method

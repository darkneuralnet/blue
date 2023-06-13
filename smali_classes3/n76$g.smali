.class public final Ln76$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln76;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lwb4<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/util/Map<",
        "Lco/bird/android/model/AgreementKey;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Agreement;",
        ">;>;>;+",
        "Ljava/lang/Boolean;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u000b\u001a\u00020\n2\u008f\u0001\u0010\t\u001a\u008a\u0001\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001 \u0008*D\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000c"
    }
    d2 = {
        "Lwb4;",
        "Lco/bird/android/buava/Optional;",
        "",
        "Lco/bird/android/model/AgreementKey;",
        "",
        "Lco/bird/android/model/Agreement;",
        "",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lwb4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransactionHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionHistoryPresenterImpl$onCreate$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n766#2:118\n857#2,2:119\n*S KotlinDebug\n*F\n+ 1 TransactionHistoryPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionHistoryPresenterImpl$onCreate$6\n*L\n86#1:118\n86#1:119,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ln76;


# direct methods
.method public constructor <init>(Ln76;)V
    .locals 0

    iput-object p1, p0, Ln76$g;->g:Ln76;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lwb4;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb4<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/Map<",
            "Lco/bird/android/model/AgreementKey;",
            "Ljava/util/List<",
            "Lco/bird/android/model/Agreement;",
            ">;>;>;",
            "Ljava/lang/Boolean;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lwb4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lwb4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1}, Lwb4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lwb4;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    new-instance v10, Lco/bird/android/model/AgreementKey;

    sget-object v5, Lco/bird/android/model/AgreementRole;->MERCHANT:Lco/bird/android/model/AgreementRole;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lco/bird/android/model/AgreementKey;-><init>(Lco/bird/android/model/AgreementRole;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lco/bird/android/model/Agreement;

    invoke-virtual {v5}, Lco/bird/android/model/Agreement;->getNeedsToAccept()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    if-eqz v1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v0

    goto :goto_2

    :cond_3
    :goto_1
    move v1, v4

    :goto_2
    if-nez v1, :cond_6

    if-eqz v3, :cond_5

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move v1, v0

    goto :goto_4

    :cond_5
    :goto_3
    move v1, v4

    :goto_4
    if-nez v1, :cond_6

    move v0, v4

    :cond_6
    iget-object v1, p0, Ln76$g;->g:Ln76;

    invoke-static {v1}, Ln76;->access$getTransactionHistoryUi$p(Ln76;)Lt76;

    move-result-object v1

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_7

    iget-object v2, p0, Ln76$g;->g:Ln76;

    invoke-static {v2}, Ln76;->access$getTransactionHistoryUi$p(Ln76;)Lt76;

    move-result-object v2

    sget v3, Lnl4;->merchant_sign_agreement:I

    invoke-interface {v2, v3}, Lt76;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_7
    invoke-interface {v1, v2}, Lt76;->R0(Ljava/lang/String;)V

    iget-object v1, p0, Ln76$g;->g:Ln76;

    invoke-static {v1}, Ln76;->access$getTransactionHistoryUi$p(Ln76;)Lt76;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_8

    iget-object p1, p0, Ln76$g;->g:Ln76;

    invoke-static {p1}, Ln76;->access$getTransactionHistoryUi$p(Ln76;)Lt76;

    move-result-object p1

    sget v2, Lnl4;->merchant_view_agreement:I

    invoke-interface {p1, v2}, Lt76;->getString(I)Ljava/lang/String;

    move-result-object p1

    :cond_8
    invoke-interface {v1, p1}, Lt76;->P0(Ljava/lang/String;)V

    iget-object p1, p0, Ln76$g;->g:Ln76;

    invoke-static {p1}, Ln76;->access$getTransactionHistoryUi$p(Ln76;)Lt76;

    move-result-object p1

    invoke-interface {p1, v0}, Lt76;->O0(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwb4;

    invoke-virtual {p0, p1}, Ln76$g;->a(Lwb4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

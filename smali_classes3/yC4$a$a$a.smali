.class public final LyC4$a$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyC4$a$a;->a(LHJ6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Ljava/lang/CharSequence;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "text",
        "",
        "<anonymous parameter 1>",
        "<anonymous parameter 2>",
        "<anonymous parameter 3>",
        "",
        "a",
        "(Ljava/lang/CharSequence;III)V"
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
        "SMAP\nRepairSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$CommentsViewHolder$1$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,129:1\n18#2:130\n9#3,4:131\n*S KotlinDebug\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$CommentsViewHolder$1$1\n*L\n104#1:130\n104#1:131,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LyC4$a;

.field public final synthetic h:LyC4;


# direct methods
.method public constructor <init>(LyC4$a;LyC4;)V
    .locals 0

    iput-object p1, p0, LyC4$a$a$a;->g:LyC4$a;

    iput-object p2, p0, LyC4$a$a$a;->h:LyC4;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;III)V
    .locals 1

    iget-object p2, p0, LyC4$a$a$a;->g:LyC4$a;

    invoke-static {p2}, LyC4$a;->a(LyC4$a;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, LyC4$a$a$a;->h:LyC4;

    invoke-static {p2}, LyC4;->access$getAdapterData(LyC4;)LE6;

    move-result-object p2

    invoke-virtual {p2}, LE6;->h()Ljava/util/List;

    move-result-object p2

    iget-object p3, p0, LyC4$a$a$a;->g:LyC4$a;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p3

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LG6;

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of p3, p2, Lco/bird/android/model/RepairType;

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    check-cast p2, Lco/bird/android/model/RepairType;

    if-eqz p2, :cond_1

    iget-object p3, p0, LyC4$a$a$a;->g:LyC4$a;

    iget-object p4, p0, LyC4$a$a$a;->h:LyC4;

    invoke-static {p3}, LyC4$a;->b(LyC4$a;)Lco/bird/android/widget/EditTextBox;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lco/bird/android/widget/EditTextBox;->setError(Z)V

    invoke-static {p4}, LyC4;->access$getRepairsNotesSubject$p(LyC4;)Lio/reactivex/subjects/a;

    move-result-object p3

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p3, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LyC4$a$a$a;->a(Ljava/lang/CharSequence;III)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

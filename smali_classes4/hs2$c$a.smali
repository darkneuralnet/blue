.class public final Lhs2$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhs2$c;-><init>(Lhs2;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "passed",
        "",
        "invoke",
        "(Ljava/lang/Boolean;)V"
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
.field public final synthetic g:Lhs2;

.field public final synthetic h:Lhs2$c;


# direct methods
.method public constructor <init>(Lhs2;Lhs2$c;)V
    .locals 0

    iput-object p1, p0, Lhs2$c$a;->g:Lhs2;

    iput-object p2, p0, Lhs2$c$a;->h:Lhs2$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lhs2$c$a;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 3

    iget-object v0, p0, Lhs2$c$a;->g:Lhs2;

    invoke-static {v0}, Lhs2;->access$getQcUpdatesSubject$p(Lhs2;)Lio/reactivex/subjects/d;

    move-result-object v0

    iget-object v1, p0, Lhs2$c$a;->g:Lhs2;

    invoke-static {v1}, Lhs2;->access$getAdapterData(Lhs2;)LE6;

    move-result-object v1

    iget-object v2, p0, Lhs2$c$a;->h:Lhs2$c;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v2

    invoke-virtual {v1, v2}, LE6;->e(I)LG6;

    move-result-object v1

    invoke-virtual {v1}, LG6;->c()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type co.bird.android.model.QCInspection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lco/bird/android/model/QCInspection;

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

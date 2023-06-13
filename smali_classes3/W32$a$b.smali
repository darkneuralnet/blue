.class public final LW32$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW32$a;-><init>(LW32;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInspectionV3Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,180:1\n18#2:181\n9#3,4:182\n*S KotlinDebug\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder$2\n*L\n126#1:181\n126#1:182,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LW32$a;

.field public final synthetic h:LW32;


# direct methods
.method public constructor <init>(LW32$a;LW32;)V
    .locals 0

    iput-object p1, p0, LW32$a$b;->g:LW32$a;

    iput-object p2, p0, LW32$a$b;->h:LW32;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LW32$a$b;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LW32$a$b;->g:LW32$a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    iget-object v0, p0, LW32$a$b;->g:LW32$a;

    invoke-static {v0}, LW32$a;->a(LW32$a;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LW32$a$b;->h:LW32;

    invoke-static {v0}, LW32;->access$getAdapterData(LW32;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LQ32;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LQ32;

    if-eqz p1, :cond_1

    iget-object v0, p0, LW32$a$b;->h:LW32;

    iget-object v1, p0, LW32$a$b;->g:LW32$a;

    invoke-static {v0}, LW32;->access$getCategoryExpandsSubject$p(LW32;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {p1}, LQ32;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1}, LW32$a;->b(LW32$a;)Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/widget/standardcomponents/InspectionV3CardView;->G()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

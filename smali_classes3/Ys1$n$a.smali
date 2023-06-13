.class public final LYs1$n$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYs1$n;-><init>(LYs1;Landroid/view/View;)V
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
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
        "SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$StatusViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$StatusViewHolder$1\n*L\n374#1:670\n374#1:671,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LYs1;

.field public final synthetic h:LYs1$n;


# direct methods
.method public constructor <init>(LYs1;LYs1$n;)V
    .locals 0

    iput-object p1, p0, LYs1$n$a;->g:LYs1;

    iput-object p2, p0, LYs1$n$a;->h:LYs1$n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LYs1$n$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 13

    iget-object p1, p0, LYs1$n$a;->g:LYs1;

    invoke-static {p1}, LYs1;->access$getAdapterData(LYs1;)LE6;

    move-result-object p1

    iget-object v0, p0, LYs1$n$a;->h:LYs1$n;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LGQ5;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LGQ5;

    if-eqz p1, :cond_3

    iget-object v0, p0, LYs1$n$a;->g:LYs1;

    iget-object v1, p0, LYs1$n$a;->h:LYs1$n;

    invoke-virtual {p1}, LGQ5;->f()Ljava/lang/CharSequence;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0}, LYs1;->access$getExpanded$p(LYs1;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v10, v3, 0x1

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0}, LYs1;->access$getExpanded$p(LYs1;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, LYs1;->access$getAnalyticsManager$p(LYs1;)LEa;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, LGQ5;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, LGQ5;->f()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance p1, LUs1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x7

    const/4 v12, 0x0

    move-object v4, p1

    invoke-direct/range {v4 .. v12}, LUs1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, p1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_2
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    :cond_3
    :goto_1
    return-void
.end method

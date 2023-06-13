.class public final Llc5$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/standardcomponents/CheckableItemView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llc5$b;-><init>(Llc5;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "lc5$b$a",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView;",
        "view",
        "",
        "isChecked",
        "",
        "a",
        "co.bird.android.feature.commandcenter"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRoutingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingAdapter.kt\nco/bird/android/feature/commandcenter/routing/adapters/RoutingAdapter$RouteViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n18#2:71\n9#3,4:72\n1#4:76\n*S KotlinDebug\n*F\n+ 1 RoutingAdapter.kt\nco/bird/android/feature/commandcenter/routing/adapters/RoutingAdapter$RouteViewHolder$1\n*L\n54#1:71\n54#1:72,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Llc5$b;

.field public final synthetic b:Llc5;


# direct methods
.method public constructor <init>(Llc5$b;Llc5;)V
    .locals 0

    iput-object p1, p0, Llc5$b$a;->a:Llc5$b;

    iput-object p2, p0, Llc5$b$a;->b:Llc5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/widget/standardcomponents/CheckableItemView;Z)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Llc5$b$a;->a:Llc5$b;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    iget-object v0, p0, Llc5$b$a;->a:Llc5$b;

    invoke-static {v0}, Llc5$b;->a(Llc5$b;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Llc5$b$a;->b:Llc5;

    invoke-static {v0}, Llc5;->access$getAdapterData(Llc5;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljc5;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljc5;

    if-eqz p1, :cond_2

    iget-object v0, p0, Llc5$b$a;->b:Llc5;

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Ljc5;->f()Lco/bird/android/model/wire/WireRoute;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRoute;->getRoute()Lco/bird/android/model/constant/ServiceCenterRoute;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v0}, Llc5;->access$getRouteSubject$p(Llc5;)Lio/reactivex/subjects/d;

    move-result-object p2

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

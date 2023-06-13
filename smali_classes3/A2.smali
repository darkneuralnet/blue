.class public final LA2;
.super Landroidx/recyclerview/widget/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/o<",
        "Lco/bird/android/model/wire/WireMerchantAction;",
        "LE2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "LA2;",
        "Landroidx/recyclerview/widget/o;",
        "Lco/bird/android/model/wire/WireMerchantAction;",
        "LE2;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "q",
        "holder",
        "position",
        "",
        "p",
        "Lma4;",
        "b",
        "Lma4;",
        "_actionClicks",
        "Lio/reactivex/Observable;",
        "c",
        "Lio/reactivex/Observable;",
        "o",
        "()Lio/reactivex/Observable;",
        "actionClicks",
        "<init>",
        "()V",
        "bird-pay_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/model/wire/WireMerchantAction;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireMerchantAction;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, LD2;->a:LD2;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o;-><init>(Landroidx/recyclerview/widget/h$f;)V

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LA2;->b:Lma4;

    iput-object v0, p0, LA2;->c:Lio/reactivex/Observable;

    return-void
.end method

.method public static final synthetic access$getItem(LA2;I)Lco/bird/android/model/wire/WireMerchantAction;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/o;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireMerchantAction;

    return-object p0
.end method

.method public static final synthetic access$get_actionClicks$p(LA2;)Lma4;
    .locals 0

    iget-object p0, p0, LA2;->b:Lma4;

    return-object p0
.end method


# virtual methods
.method public final o()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireMerchantAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LA2;->c:Lio/reactivex/Observable;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, LE2;

    invoke-virtual {p0, p1, p2}, LA2;->p(LE2;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LA2;->q(Landroid/view/ViewGroup;I)LE2;

    move-result-object p1

    return-object p1
.end method

.method public p(LE2;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/o;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(position)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lco/bird/android/model/wire/WireMerchantAction;

    invoke-virtual {p1, p2}, LE2;->a(Lco/bird/android/model/wire/WireMerchantAction;)V

    return-void
.end method

.method public q(Landroid/view/ViewGroup;I)LE2;
    .locals 1

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LE2;->c:LE2$a;

    invoke-virtual {p2, p1}, LE2$a;->a(Landroid/view/ViewGroup;)LE2;

    move-result-object p1

    invoke-virtual {p1}, LE2;->b()Lod2;

    move-result-object p2

    iget-object p2, p2, Lod2;->c:Landroid/widget/FrameLayout;

    const-string v0, "binding.actionButtonContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LA2$a;

    invoke-direct {v0, p1, p0}, LA2$a;-><init>(LE2;LA2;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-object p1
.end method

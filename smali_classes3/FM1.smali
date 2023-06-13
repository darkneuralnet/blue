.class public final LFM1;
.super LjE;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFM1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000  2\u00020\u0001:\u0001!B!\u0008\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00070\u0006J\u0018\u0010\u000c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\u00070\u0006J\u0014\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0004J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tH\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\""
    }
    d2 = {
        "LFM1;",
        "LjE;",
        "",
        "enabled",
        "",
        "gm",
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/Bird;",
        "",
        "Bm",
        "Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;",
        "Cm",
        "",
        "LH6;",
        "sections",
        "b",
        "Em",
        "message",
        "Dm",
        "LdM1;",
        "q",
        "LdM1;",
        "adapter",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Lf00;",
        "binding",
        "Landroid/content/DialogInterface;",
        "dialog",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lf00;Landroid/content/DialogInterface;)V",
        "r",
        "a",
        "hibernation-scan_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final r:LFM1$a;


# instance fields
.field public final q:LdM1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LFM1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFM1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFM1;->r:LFM1$a;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lf00;Landroid/content/DialogInterface;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dialog"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, LjE;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lf00;Landroid/content/DialogInterface;)V

    new-instance p3, LdM1;

    invoke-direct {p3}, LdM1;-><init>()V

    iput-object p3, p0, LFM1;->q:LdM1;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LFM1;->gm(Z)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LRk5;->sm(Z)V

    invoke-virtual {p0, v0}, LRk5;->tm(Z)V

    iget-object v2, p2, Lf00;->c:Landroid/widget/Button;

    sget v3, Lnl4;->general_done:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p2, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    const-string v2, "_init_$lambda$0"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, v0, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    new-instance p1, Landroidx/recyclerview/widget/g;

    invoke-direct {p1}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method


# virtual methods
.method public final Bm()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Bird;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LFM1;->q:LdM1;

    invoke-virtual {v0}, LdM1;->v()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final Cm()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Bird;",
            "Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LFM1;->q:LdM1;

    invoke-virtual {v0}, LdM1;->g0()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final Dm(Ljava/lang/String;)V
    .locals 8

    sget-object v0, Lzw3;->a:Lzw3$a;

    invoke-virtual {p0}, LRk5;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    const/4 v3, 0x1

    const/16 v4, 0x30

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v7}, Lzw3$a;->makeText$default(Lzw3$a;Landroid/content/Context;Ljava/lang/String;IILzw3$a$a;ILjava/lang/Object;)Lzw3;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final Em()V
    .locals 2

    invoke-virtual {p0}, LRk5;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    sget v1, Lnl4;->hibernation_batch_copied_toast:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "activity.getString(L.str\u2026ation_batch_copied_toast)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LFM1;->Dm(Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LFM1;->q:LdM1;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    return-void
.end method

.method public gm(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const/16 v0, 0x7e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0}, LRk5;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    invoke-static {v0, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    float-to-int v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, LRk5;->qm(I)V

    invoke-super {p0, p1}, LRk5;->gm(Z)V

    return-void
.end method

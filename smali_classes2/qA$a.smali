.class public final LqA$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqA;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LqA$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Landroid/widget/Button;",
        "b",
        "Landroid/widget/Button;",
        "button",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LqA;Landroid/view/View;)V",
        "co.bird.android.commandcenter"
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
        "SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n18#2:215\n18#2:220\n9#3,4:216\n9#3,4:221\n1#4:225\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$ButtonViewHolder\n*L\n88#1:215\n81#1:220\n88#1:216,4\n81#1:221,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/widget/Button;

.field public final synthetic c:LqA;


# direct methods
.method public constructor <init>(LqA;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LqA$a;->c:LqA;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, LqA$a;->b:Landroid/widget/Button;

    new-instance v0, LpA;

    invoke-direct {v0, p0, p1}, LpA;-><init>(LqA$a;LqA;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic a(LqA$a;LqA;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, LqA$a;->b(LqA$a;LqA;Landroid/view/View;)V

    return-void
.end method

.method public static final b(LqA$a;LqA;Landroid/view/View;)V
    .locals 1

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    invoke-static {p1}, LqA;->access$getAdapterData(LqA;)LE6;

    move-result-object p2

    invoke-virtual {p2}, LE6;->h()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p0

    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LG6;

    invoke-virtual {p0}, LG6;->c()Ljava/lang/Object;

    move-result-object p0

    instance-of p2, p0, Lco/bird/android/model/CommandCenterButton;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    check-cast p0, Lco/bird/android/model/CommandCenterButton;

    if-eqz p0, :cond_1

    invoke-virtual {p1}, LqA;->D()Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-virtual {p1, p0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LqA$a;->c:LqA;

    invoke-static {v0}, LqA;->access$getAdapterData(LqA;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/CommandCenterButton;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/CommandCenterButton;

    iget-object v0, p0, LqA$a;->b:Landroid/widget/Button;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getText()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

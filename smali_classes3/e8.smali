.class public final Le8;
.super Landroidx/recyclerview/widget/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/o<",
        "Lco/bird/android/model/AddressGuess;",
        "Lg8;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Le8;",
        "Landroidx/recyclerview/widget/o;",
        "Lco/bird/android/model/AddressGuess;",
        "Lg8;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "r",
        "holder",
        "position",
        "",
        "q",
        "LO11;",
        "b",
        "LO11;",
        "viewModel",
        "Lg46$b;",
        "p",
        "()Lg46$b;",
        "logger",
        "<init>",
        "(LO11;)V",
        "destination-rider_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LO11;


# direct methods
.method public constructor <init>(LO11;)V
    .locals 1

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN31;->a:LN31;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o;-><init>(Landroidx/recyclerview/widget/h$f;)V

    iput-object p1, p0, Le8;->b:LO11;

    return-void
.end method

.method public static synthetic o(Lg8;Le8;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Le8;->t(Lg8;Le8;Landroid/view/View;)V

    return-void
.end method

.method public static final t(Lg8;Le8;Landroid/view/View;)V
    .locals 1

    const-string p2, "$this_apply"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Le8;->p()Lg46$b;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "An address was selected with no adapter position."

    invoke-virtual {p0, p2, p1}, Lg46$b;->x(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p0

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/o;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/AddressGuess;

    if-eqz p0, :cond_1

    iget-object p1, p1, Le8;->b:LO11;

    invoke-virtual {p1, p0}, LO11;->j(Lco/bird/android/model/AddressGuess;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, Lg8;

    invoke-virtual {p0, p1, p2}, Le8;->q(Lg8;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Le8;->r(Landroid/view/ViewGroup;I)Lg8;

    move-result-object p1

    return-object p1
.end method

.method public final p()Lg46$b;
    .locals 2

    const-string v0, "address-adapter"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const-string v1, "tag(\"address-adapter\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public q(Lg8;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/o;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(position)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lco/bird/android/model/AddressGuess;

    invoke-virtual {p1, p2}, Lg8;->a(Lco/bird/android/model/AddressGuess;)V

    return-void
.end method

.method public r(Landroid/view/ViewGroup;I)Lg8;
    .locals 1

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lg8;->c:Lg8$a;

    invoke-virtual {p2, p1}, Lg8$a;->a(Landroid/view/ViewGroup;)Lg8;

    move-result-object p1

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    new-instance v0, Ld8;

    invoke-direct {v0, p1, p0}, Ld8;-><init>(Lg8;Le8;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

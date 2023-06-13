.class public final LS66;
.super LwO4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS66$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LwO4<",
        "Lco/bird/android/model/TransactionSummary;",
        "Lor6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0017"
    }
    d2 = {
        "LS66;",
        "LwO4;",
        "Lco/bird/android/model/TransactionSummary;",
        "Lor6;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "e",
        "holder",
        "model",
        "position",
        "",
        "d",
        "",
        "c",
        "Landroidx/recyclerview/widget/h$f;",
        "a",
        "Z",
        "enableRiderParkingReview",
        "<init>",
        "(Z)V",
        "b",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:LS66$b;

.field public static final c:LS66$a;


# instance fields
.field public final a:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LS66$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS66$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LS66;->b:LS66$b;

    new-instance v0, LS66$a;

    invoke-direct {v0}, LS66$a;-><init>()V

    sput-object v0, LS66;->c:LS66$a;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, LwO4;-><init>()V

    iput-boolean p1, p0, LS66;->a:Z

    return-void
.end method


# virtual methods
.method public a()Landroidx/recyclerview/widget/h$f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/recyclerview/widget/h$f<",
            "Lco/bird/android/model/TransactionSummary;",
            ">;"
        }
    .end annotation

    sget-object v0, LS66;->c:LS66$a;

    return-object v0
.end method

.method public c(Lco/bird/android/model/TransactionSummary;)Z
    .locals 1

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LT66;->access$canViewDetails(Lco/bird/android/model/TransactionSummary;)Z

    move-result p1

    return p1
.end method

.method public d(Lor6;Lco/bird/android/model/TransactionSummary;I)V
    .locals 0

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "model"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lor6;->b(Lco/bird/android/model/TransactionSummary;)V

    return-void
.end method

.method public e(Landroid/view/ViewGroup;I)Lor6;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lor6;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcj4;->item_transaction_history:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "from(parent.context).inf\u2026false /* attachToRoot */)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LS66;->a:Z

    invoke-direct {p2, p1, v0}, Lor6;-><init>(Landroid/view/View;Z)V

    return-object p2
.end method

.method public bridge synthetic isClickable(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lco/bird/android/model/TransactionSummary;

    invoke-virtual {p0, p1}, LS66;->c(Lco/bird/android/model/TransactionSummary;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, Lor6;

    check-cast p2, Lco/bird/android/model/TransactionSummary;

    invoke-virtual {p0, p1, p2, p3}, LS66;->d(Lor6;Lco/bird/android/model/TransactionSummary;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS66;->e(Landroid/view/ViewGroup;I)Lor6;

    move-result-object p1

    return-object p1
.end method

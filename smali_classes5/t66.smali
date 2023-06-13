.class public final Lt66;
.super Landroidx/recyclerview/widget/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt66$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/o<",
        "Lcom/chuckerteam/chucker/internal/data/entity/a;",
        "Lt66$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0008\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001#B%\u0008\u0000\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0004\u0008!\u0010\"J\u001c\u0010\u0008\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\u000c\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0013\u00a8\u0006$"
    }
    d2 = {
        "Lt66;",
        "Landroidx/recyclerview/widget/o;",
        "Lcom/chuckerteam/chucker/internal/data/entity/a;",
        "Lt66$a;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "x",
        "holder",
        "position",
        "",
        "w",
        "Lkotlin/Function1;",
        "",
        "b",
        "Lkotlin/jvm/functions/Function1;",
        "onTransactionClick",
        "c",
        "I",
        "colorDefault",
        "d",
        "colorRequested",
        "e",
        "colorError",
        "f",
        "color500",
        "g",
        "color400",
        "h",
        "color300",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V",
        "a",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Long;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTransactionClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN66;->a:LN66;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o;-><init>(Landroidx/recyclerview/widget/h$f;)V

    iput-object p2, p0, Lt66;->b:Lkotlin/jvm/functions/Function1;

    sget p2, LGf4;->chucker_status_default:I

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p2

    iput p2, p0, Lt66;->c:I

    sget p2, LGf4;->chucker_status_requested:I

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p2

    iput p2, p0, Lt66;->d:I

    sget p2, LGf4;->chucker_status_error:I

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p2

    iput p2, p0, Lt66;->e:I

    sget p2, LGf4;->chucker_status_500:I

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p2

    iput p2, p0, Lt66;->f:I

    sget p2, LGf4;->chucker_status_400:I

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p2

    iput p2, p0, Lt66;->g:I

    sget p2, LGf4;->chucker_status_300:I

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lt66;->h:I

    return-void
.end method

.method public static final synthetic o(Lt66;)I
    .locals 0

    iget p0, p0, Lt66;->h:I

    return p0
.end method

.method public static final synthetic p(Lt66;)I
    .locals 0

    iget p0, p0, Lt66;->g:I

    return p0
.end method

.method public static final synthetic q(Lt66;)I
    .locals 0

    iget p0, p0, Lt66;->f:I

    return p0
.end method

.method public static final synthetic r(Lt66;)I
    .locals 0

    iget p0, p0, Lt66;->c:I

    return p0
.end method

.method public static final synthetic t(Lt66;)I
    .locals 0

    iget p0, p0, Lt66;->e:I

    return p0
.end method

.method public static final synthetic u(Lt66;)I
    .locals 0

    iget p0, p0, Lt66;->d:I

    return p0
.end method

.method public static final synthetic v(Lt66;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lt66;->b:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, Lt66$a;

    invoke-virtual {p0, p1, p2}, Lt66;->w(Lt66$a;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt66;->x(Landroid/view/ViewGroup;I)Lt66$a;

    move-result-object p1

    return-object p1
.end method

.method public w(Lt66$a;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/o;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(position)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/chuckerteam/chucker/internal/data/entity/a;

    invoke-virtual {p1, p2}, Lt66$a;->e(Lcom/chuckerteam/chucker/internal/data/entity/a;)V

    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lt66$a;
    .locals 1

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lrj0;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lrj0;

    move-result-object p1

    const-string p2, "inflate(\n            Lay\u2026          false\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lt66$a;

    invoke-direct {p2, p0, p1}, Lt66$a;-><init>(Lt66;Lrj0;)V

    return-object p2
.end method

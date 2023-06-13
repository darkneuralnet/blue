.class public final La04;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La04$a;,
        La04$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0016R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001c"
    }
    d2 = {
        "La04;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "",
        "LH6;",
        "sections",
        "",
        "u",
        "c",
        "I",
        "positionSelected",
        "Lc04;",
        "<set-?>",
        "d",
        "Lc04;",
        "v",
        "()Lc04;",
        "selectedPreloadAmount",
        "<init>",
        "()V",
        "e",
        "a",
        "b",
        "co.bird.android.feature.payment"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final e:La04$a;

.field public static final f:I

.field public static final g:I


# instance fields
.field public c:I

.field public d:Lc04;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La04$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La04$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, La04;->e:La04$a;

    sget v0, LHg4;->frame_rectangle_primary_border_rounded_gray_background:I

    sput v0, La04;->f:I

    sget v0, LHg4;->frame_rectangle_gray_border_rounded_gray_background:I

    sput v0, La04;->g:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LyS0;-><init>()V

    return-void
.end method

.method public static final synthetic access$getAdapterData(La04;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPositionSelected$p(La04;)I
    .locals 0

    iget p0, p0, La04;->c:I

    return p0
.end method

.method public static final synthetic access$getSelectedBg$cp()I
    .locals 1

    sget v0, La04;->f:I

    return v0
.end method

.method public static final synthetic access$getUnselectedBg$cp()I
    .locals 1

    sget v0, La04;->g:I

    return v0
.end method

.method public static final synthetic access$setPositionSelected$p(La04;I)V
    .locals 0

    iput p1, p0, La04;->c:I

    return-void
.end method

.method public static final synthetic access$setSelectedPreloadAmount$p(La04;Lc04;)V
    .locals 0

    iput-object p1, p0, La04;->d:Lc04;

    return-void
.end method


# virtual methods
.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, La04;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
    .locals 2

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "parent.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, LBj4;->item_preload_amount:I

    if-ne p2, v0, :cond_0

    new-instance p2, La04$b;

    invoke-direct {p2, p0, p1}, La04$b;-><init>(La04;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public u(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LMy;->u(Ljava/util/Collection;)V

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, La04;->c:I

    return-void
.end method

.method public final v()Lc04;
    .locals 1

    iget-object v0, p0, La04;->d:Lc04;

    return-object v0
.end method

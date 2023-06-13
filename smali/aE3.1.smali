.class public abstract LaE3;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "VH:",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "TVH;>;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "PagedListAdapter is deprecated and has been replaced by PagingDataAdapter"
    replaceWith = .subannotation Lkotlin/ReplaceWith;
        expression = "PagingDataAdapter<T, VH>"
        imports = {
            "androidx.paging.PagingDataAdapter"
        }
    .end subannotation
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0004*\u00020\u00032\u0008\u0012\u0004\u0012\u00028\u00010\u0005B\u0017\u0008\u0014\u0012\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00000 \u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010\t\u001a\u00020\u00082\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016J\u0019\u0010\u000c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00082\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0017J(\u0010\u0012\u001a\u00020\u00082\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016R&\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00138\u0000X\u0080\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u0012\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0016\u0010\u0017R<\u0010\u001f\u001a$\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00080\u001b8\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u0012\u0004\u0008\u001e\u0010\u0019\u00a8\u0006$"
    }
    d2 = {
        "LaE3;",
        "",
        "T",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "VH",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "LZD3;",
        "pagedList",
        "",
        "q",
        "",
        "position",
        "getItem",
        "(I)Ljava/lang/Object;",
        "getItemCount",
        "currentList",
        "o",
        "previousList",
        "p",
        "Lip;",
        "b",
        "Lip;",
        "getDiffer$paging_runtime_release",
        "()Lip;",
        "getDiffer$paging_runtime_release$annotations",
        "()V",
        "differ",
        "Lkotlin/Function2;",
        "c",
        "Lkotlin/jvm/functions/Function2;",
        "getListener$annotations",
        "listener",
        "Landroidx/recyclerview/widget/h$f;",
        "diffCallback",
        "<init>",
        "(Landroidx/recyclerview/widget/h$f;)V",
        "paging-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final b:Lip;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lip<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LZD3<",
            "TT;>;",
            "LZD3<",
            "TT;>;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/h$f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/h$f<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "diffCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    new-instance v0, LaE3$a;

    invoke-direct {v0, p0}, LaE3$a;-><init>(LaE3;)V

    iput-object v0, p0, LaE3;->c:Lkotlin/jvm/functions/Function2;

    new-instance v1, Lip;

    invoke-direct {v1, p0, p1}, Lip;-><init>(Landroidx/recyclerview/widget/RecyclerView$h;Landroidx/recyclerview/widget/h$f;)V

    iput-object v1, p0, LaE3;->b:Lip;

    invoke-virtual {v1, v0}, Lip;->c(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static synthetic getCurrentList$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getDiffer$paging_runtime_release$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, LaE3;->b:Lip;

    invoke-virtual {v0, p1}, Lip;->e(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, LaE3;->b:Lip;

    invoke-virtual {v0}, Lip;->f()I

    move-result v0

    return v0
.end method

.method public o(LZD3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZD3<",
            "TT;>;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use the two argument variant instead."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "onCurrentListChanged(previousList, currentList)"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method

.method public p(LZD3;LZD3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZD3<",
            "TT;>;",
            "LZD3<",
            "TT;>;)V"
        }
    .end annotation

    return-void
.end method

.method public q(LZD3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZD3<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LaE3;->b:Lip;

    invoke-virtual {v0, p1}, Lip;->l(LZD3;)V

    return-void
.end method

.class public final Lip$e;
.super LZD3$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lip;-><init>(Landroidx/recyclerview/widget/RecyclerView$h;Landroidx/recyclerview/widget/h$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "ip$e",
        "LZD3$b;",
        "",
        "position",
        "count",
        "",
        "b",
        "c",
        "a",
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
.field public final synthetic a:Lip;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lip<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lip;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lip<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lip$e;->a:Lip;

    invoke-direct {p0}, LZD3$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 2

    iget-object v0, p0, Lip$e;->a:Lip;

    invoke-virtual {v0}, Lip;->h()LBs2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, LBs2;->onChanged(IILjava/lang/Object;)V

    return-void
.end method

.method public b(II)V
    .locals 1

    iget-object v0, p0, Lip$e;->a:Lip;

    invoke-virtual {v0}, Lip;->h()LBs2;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LBs2;->onInserted(II)V

    return-void
.end method

.method public c(II)V
    .locals 1

    iget-object v0, p0, Lip$e;->a:Lip;

    invoke-virtual {v0}, Lip;->h()LBs2;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LBs2;->onRemoved(II)V

    return-void
.end method

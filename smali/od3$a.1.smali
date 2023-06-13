.class public final Lod3$a;
.super Landroidx/recyclerview/widget/h$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lod3;->a(Lnd3;Lnd3;Landroidx/recyclerview/widget/h$f;)Lmd3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0007\u001a\u00020\u0002H\u0016J\u0008\u0010\u0008\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "od3$a",
        "Landroidx/recyclerview/widget/h$b;",
        "",
        "oldItemPosition",
        "newItemPosition",
        "",
        "getChangePayload",
        "getOldListSize",
        "getNewListSize",
        "",
        "areItemsTheSame",
        "areContentsTheSame",
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
.field public final synthetic a:Lnd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnd3<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lnd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnd3<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic c:Landroidx/recyclerview/widget/h$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/h$f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Lnd3;Lnd3;Landroidx/recyclerview/widget/h$f;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnd3<",
            "TT;>;",
            "Lnd3<",
            "TT;>;",
            "Landroidx/recyclerview/widget/h$f<",
            "TT;>;II)V"
        }
    .end annotation

    iput-object p1, p0, Lod3$a;->a:Lnd3;

    iput-object p2, p0, Lod3$a;->b:Lnd3;

    iput-object p3, p0, Lod3$a;->c:Landroidx/recyclerview/widget/h$f;

    iput p4, p0, Lod3$a;->d:I

    iput p5, p0, Lod3$a;->e:I

    invoke-direct {p0}, Landroidx/recyclerview/widget/h$b;-><init>()V

    return-void
.end method


# virtual methods
.method public areContentsTheSame(II)Z
    .locals 1

    iget-object v0, p0, Lod3$a;->a:Lnd3;

    invoke-interface {v0, p1}, Lnd3;->f(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lod3$a;->b:Lnd3;

    invoke-interface {v0, p2}, Lnd3;->f(I)Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lod3$a;->c:Landroidx/recyclerview/widget/h$f;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/h$f;->areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public areItemsTheSame(II)Z
    .locals 1

    iget-object v0, p0, Lod3$a;->a:Lnd3;

    invoke-interface {v0, p1}, Lnd3;->f(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lod3$a;->b:Lnd3;

    invoke-interface {v0, p2}, Lnd3;->f(I)Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lod3$a;->c:Landroidx/recyclerview/widget/h$f;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/h$f;->areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public getChangePayload(II)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lod3$a;->a:Lnd3;

    invoke-interface {v0, p1}, Lnd3;->f(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lod3$a;->b:Lnd3;

    invoke-interface {v0, p2}, Lnd3;->f(I)Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lod3$a;->c:Landroidx/recyclerview/widget/h$f;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/h$f;->getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getNewListSize()I
    .locals 1

    iget v0, p0, Lod3$a;->e:I

    return v0
.end method

.method public getOldListSize()I
    .locals 1

    iget v0, p0, Lod3$a;->d:I

    return v0
.end method

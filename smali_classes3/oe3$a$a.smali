.class public final Loe3$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loe3$a;-><init>(Loe3;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Loe3$a;

.field public final synthetic h:Loe3;


# direct methods
.method public constructor <init>(Loe3$a;Loe3;)V
    .locals 0

    iput-object p1, p0, Loe3$a$a;->g:Loe3$a;

    iput-object p2, p0, Loe3$a$a;->h:Loe3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Loe3$a$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Loe3$a$a;->g:Loe3$a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Loe3$a$a;->h:Loe3;

    invoke-static {v0}, Loe3;->access$get_offerAcceptedClicks$p(Loe3;)Lma4;

    move-result-object v0

    iget-object v1, p0, Loe3$a$a;->h:Loe3;

    invoke-static {v1, p1}, Loe3;->access$getItem(Loe3;I)Lne3;

    move-result-object p1

    invoke-virtual {p1}, Lne3;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

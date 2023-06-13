.class public final LPt0$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPt0;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Object;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "index",
        "",
        "data",
        "",
        "a",
        "(ILjava/lang/Object;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LPt0;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(LPt0;I)V
    .locals 0

    iput-object p1, p0, LPt0$g;->g:LPt0;

    iput p2, p0, LPt0$g;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 6

    instance-of v0, p2, LPv4;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LPt0$g;->g:LPt0;

    invoke-static {v0}, LPt0;->Z(LPt0;)LmE5;

    move-result-object v0

    iget v4, p0, LPt0$g;->h:I

    invoke-virtual {v0, v4}, LmE5;->O(I)V

    iget-object v0, p0, LPt0$g;->g:LPt0;

    new-instance v4, LPt0$g$a;

    iget v5, p0, LPt0$g;->h:I

    invoke-direct {v4, p2, v5, p1}, LPt0$g$a;-><init>(Ljava/lang/Object;II)V

    invoke-static {v0, v2, v4, v3, v1}, LPt0;->u1(LPt0;ZLkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, Los4;

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Los4;

    invoke-virtual {v0}, Los4;->l()Lcu0;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4, v3}, Lcu0;->F(Z)V

    invoke-virtual {v0}, Los4;->x()V

    :cond_1
    iget-object v0, p0, LPt0$g;->g:LPt0;

    invoke-static {v0}, LPt0;->Z(LPt0;)LmE5;

    move-result-object v0

    iget v4, p0, LPt0$g;->h:I

    invoke-virtual {v0, v4}, LmE5;->O(I)V

    iget-object v0, p0, LPt0$g;->g:LPt0;

    new-instance v4, LPt0$g$b;

    iget v5, p0, LPt0$g;->h:I

    invoke-direct {v4, p2, v5, p1}, LPt0$g$b;-><init>(Ljava/lang/Object;II)V

    invoke-static {v0, v2, v4, v3, v1}, LPt0;->u1(LPt0;ZLkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, LPt0$g;->a(ILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

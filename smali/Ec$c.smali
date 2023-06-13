.class public final LEc$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEc;-><init>(Landroid/content/Context;LBA3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LG52;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LG52;",
        "size",
        "",
        "invoke-ozmzZPI",
        "(J)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LEc;


# direct methods
.method public constructor <init>(LEc;)V
    .locals 0

    iput-object p1, p0, LEc$c;->g:LEc;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LG52;

    invoke-virtual {p1}, LG52;->j()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LEc$c;->invoke-ozmzZPI(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke-ozmzZPI(J)V
    .locals 4

    invoke-static {p1, p2}, LH52;->c(J)J

    move-result-wide v0

    iget-object v2, p0, LEc$c;->g:LEc;

    invoke-static {v2}, LEc;->h(LEc;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LxB5;->f(JJ)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LEc$c;->g:LEc;

    invoke-static {p1, p2}, LH52;->c(J)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, LEc;->q(LEc;J)V

    if-eqz v0, :cond_0

    iget-object v1, p0, LEc$c;->g:LEc;

    invoke-static {v1}, LEc;->n(LEc;)Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result v2

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p0, LEc$c;->g:LEc;

    invoke-static {v1}, LEc;->f(LEc;)Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result v2

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p0, LEc$c;->g:LEc;

    invoke-static {v1}, LEc;->i(LEc;)Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result v2

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p0, LEc$c;->g:LEc;

    invoke-static {v1}, LEc;->l(LEc;)Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result v2

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p0, LEc$c;->g:LEc;

    invoke-static {v1}, LEc;->o(LEc;)Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result v2

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p0, LEc$c;->g:LEc;

    invoke-static {v1}, LEc;->g(LEc;)Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result v2

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p0, LEc$c;->g:LEc;

    invoke-static {v1}, LEc;->j(LEc;)Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result v2

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p0, LEc$c;->g:LEc;

    invoke-static {v1}, LEc;->m(LEc;)Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result v2

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result p1

    invoke-virtual {v1, v2, p1}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_0
    if-eqz v0, :cond_1

    iget-object p1, p0, LEc$c;->g:LEc;

    invoke-static {p1}, LEc;->p(LEc;)V

    iget-object p1, p0, LEc$c;->g:LEc;

    invoke-static {p1}, LEc;->e(LEc;)V

    :cond_1
    return-void
.end method

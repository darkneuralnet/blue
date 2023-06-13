.class public final LVl2$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVl2;->i(Landroid/view/View;I)V
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
.field public final synthetic g:LVl2;

.field public final synthetic h:I

.field public final synthetic i:Landroid/view/View;


# direct methods
.method public constructor <init>(LVl2;ILandroid/view/View;)V
    .locals 0

    iput-object p1, p0, LVl2$f;->g:LVl2;

    iput p2, p0, LVl2$f;->h:I

    iput-object p3, p0, LVl2$f;->i:Landroid/view/View;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LVl2$f;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, LVl2$f;->g:LVl2;

    iget v0, p0, LVl2$f;->h:I

    invoke-static {p1, v0}, LVl2;->access$onClick(LVl2;I)V

    iget-object p1, p0, LVl2$f;->g:LVl2;

    iget-object v0, p0, LVl2$f;->i:Landroid/view/View;

    iget v1, p0, LVl2$f;->h:I

    invoke-virtual {p1, v0, v1}, LVl2;->i(Landroid/view/View;I)V

    return-void
.end method

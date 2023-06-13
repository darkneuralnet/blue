.class public final LTd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI26;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJP\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J\u0008\u0010\u000b\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0016@RX\u0096\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "LTd;",
        "LI26;",
        "LOs4;",
        "rect",
        "Lkotlin/Function0;",
        "",
        "onCopyRequested",
        "onPasteRequested",
        "onCutRequested",
        "onSelectAllRequested",
        "a",
        "b",
        "Landroid/view/View;",
        "Landroid/view/View;",
        "view",
        "Landroid/view/ActionMode;",
        "Landroid/view/ActionMode;",
        "actionMode",
        "Lq06;",
        "c",
        "Lq06;",
        "textActionModeCallback",
        "LK26;",
        "<set-?>",
        "d",
        "LK26;",
        "getStatus",
        "()LK26;",
        "status",
        "<init>",
        "(Landroid/view/View;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public b:Landroid/view/ActionMode;

.field public final c:Lq06;

.field public d:LK26;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 10

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTd;->a:Landroid/view/View;

    new-instance p1, Lq06;

    new-instance v2, LTd$a;

    invoke-direct {v2, p0}, LTd$a;-><init>(LTd;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const/4 v9, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lq06;-><init>(Lkotlin/jvm/functions/Function0;LOs4;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LTd;->c:Lq06;

    sget-object p1, LK26;->c:LK26;

    iput-object p1, p0, LTd;->d:LK26;

    return-void
.end method

.method public static final synthetic c(LTd;Landroid/view/ActionMode;)V
    .locals 0

    iput-object p1, p0, LTd;->b:Landroid/view/ActionMode;

    return-void
.end method


# virtual methods
.method public a(LOs4;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOs4;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "rect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LTd;->c:Lq06;

    invoke-virtual {v0, p1}, Lq06;->l(LOs4;)V

    iget-object p1, p0, LTd;->c:Lq06;

    invoke-virtual {p1, p2}, Lq06;->h(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, LTd;->c:Lq06;

    invoke-virtual {p1, p4}, Lq06;->i(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, LTd;->c:Lq06;

    invoke-virtual {p1, p3}, Lq06;->j(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, LTd;->c:Lq06;

    invoke-virtual {p1, p5}, Lq06;->k(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, LTd;->b:Landroid/view/ActionMode;

    if-nez p1, :cond_0

    sget-object p1, LK26;->b:LK26;

    iput-object p1, p0, LTd;->d:LK26;

    sget-object p1, LJ26;->a:LJ26;

    iget-object p2, p0, LTd;->a:Landroid/view/View;

    new-instance p3, Lwu1;

    iget-object p4, p0, LTd;->c:Lq06;

    invoke-direct {p3, p4}, Lwu1;-><init>(Lq06;)V

    const/4 p4, 0x1

    invoke-virtual {p1, p2, p3, p4}, LJ26;->b(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    iput-object p1, p0, LTd;->b:Landroid/view/ActionMode;

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/ActionMode;->invalidate()V

    :cond_1
    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    sget-object v0, LK26;->c:LK26;

    iput-object v0, p0, LTd;->d:LK26;

    iget-object v0, p0, LTd;->b:Landroid/view/ActionMode;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LTd;->b:Landroid/view/ActionMode;

    return-void
.end method

.method public getStatus()LK26;
    .locals 1

    iget-object v0, p0, LTd;->d:LK26;

    return-object v0
.end method

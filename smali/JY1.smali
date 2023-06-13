.class public final LJY1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKY1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u000e\u0010\t\u001a\u0004\u0018\u00010\u0008*\u00020\u0007H\u0002J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0008*\u00020\nH\u0082\u0010R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "LJY1;",
        "LKY1;",
        "Landroid/view/inputmethod/InputMethodManager;",
        "imm",
        "",
        "b",
        "a",
        "Landroid/view/View;",
        "Landroid/view/Window;",
        "d",
        "Landroid/content/Context;",
        "c",
        "Landroid/view/View;",
        "view",
        "LIY1;",
        "LIY1;",
        "_immHelper21",
        "LhC6;",
        "f",
        "()LhC6;",
        "insetsControllerCompat",
        "e",
        "()LIY1;",
        "immHelper21",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInputMethodManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputMethodManager.kt\nandroidx/compose/ui/text/input/ImmHelper30\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public b:LIY1;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJY1;->a:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/inputmethod/InputMethodManager;)V
    .locals 1

    const-string v0, "imm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJY1;->f()LhC6;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, LDB6$m;->c()I

    move-result p1

    invoke-virtual {v0, p1}, LhC6;->a(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LJY1;->e()LIY1;

    move-result-object v0

    invoke-virtual {v0, p1}, LIY1;->a(Landroid/view/inputmethod/InputMethodManager;)V

    :goto_0
    return-void
.end method

.method public b(Landroid/view/inputmethod/InputMethodManager;)V
    .locals 1

    const-string v0, "imm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJY1;->f()LhC6;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, LDB6$m;->c()I

    move-result p1

    invoke-virtual {v0, p1}, LhC6;->e(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LJY1;->e()LIY1;

    move-result-object v0

    invoke-virtual {v0, p1}, LIY1;->b(Landroid/view/inputmethod/InputMethodManager;)V

    :goto_0
    return-void
.end method

.method public final c(Landroid/content/Context;)Landroid/view/Window;
    .locals 1

    :goto_0
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "baseContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public final d(Landroid/view/View;)Landroid/view/Window;
    .locals 4

    :goto_0
    instance-of v0, p1, LI31;

    if-eqz v0, :cond_0

    check-cast p1, LI31;

    invoke-interface {p1}, LI31;->getWindow()Landroid/view/Window;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/View;

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "view.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LJY1;->c(Landroid/content/Context;)Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v3, "windowFromContext.decorView"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne v1, p1, :cond_3

    move-object v2, v0

    :cond_3
    return-object v2

    :cond_4
    move-object p1, v0

    goto :goto_0
.end method

.method public final e()LIY1;
    .locals 2

    iget-object v0, p0, LJY1;->b:LIY1;

    if-nez v0, :cond_0

    new-instance v0, LIY1;

    iget-object v1, p0, LJY1;->a:Landroid/view/View;

    invoke-direct {v0, v1}, LIY1;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LJY1;->b:LIY1;

    :cond_0
    return-object v0
.end method

.method public final f()LhC6;
    .locals 3

    iget-object v0, p0, LJY1;->a:Landroid/view/View;

    invoke-virtual {p0, v0}, LJY1;->d(Landroid/view/View;)Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LhC6;

    iget-object v2, p0, LJY1;->a:Landroid/view/View;

    invoke-direct {v1, v0, v2}, LhC6;-><init>(Landroid/view/Window;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

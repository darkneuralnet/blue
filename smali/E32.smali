.class public final LE32;
.super LqB6$b;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements LUe3;
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0019\u00a2\u0006\u0004\u0008/\u00100J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000cH\u0016J\u0008\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R\u0017\u0010\u001d\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\"\u0010\'\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u001f\u001a\u0004\u0008%\u0010!\"\u0004\u0008&\u0010#R$\u0010.\u001a\u0004\u0018\u00010\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-\u00a8\u00061"
    }
    d2 = {
        "LE32;",
        "LqB6$b;",
        "Ljava/lang/Runnable;",
        "LUe3;",
        "Landroid/view/View$OnAttachStateChangeListener;",
        "LqB6;",
        "animation",
        "",
        "d",
        "LqB6$a;",
        "bounds",
        "f",
        "LDB6;",
        "insets",
        "",
        "runningAnimations",
        "e",
        "c",
        "Landroid/view/View;",
        "view",
        "a",
        "run",
        "onViewAttachedToWindow",
        "v",
        "onViewDetachedFromWindow",
        "LnC6;",
        "LnC6;",
        "getComposeInsets",
        "()LnC6;",
        "composeInsets",
        "",
        "Z",
        "getPrepared",
        "()Z",
        "setPrepared",
        "(Z)V",
        "prepared",
        "getRunningAnimation",
        "setRunningAnimation",
        "runningAnimation",
        "g",
        "LDB6;",
        "getSavedInsets",
        "()LDB6;",
        "setSavedInsets",
        "(LDB6;)V",
        "savedInsets",
        "<init>",
        "(LnC6;)V",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final d:LnC6;

.field public e:Z

.field public f:Z

.field public g:LDB6;


# direct methods
.method public constructor <init>(LnC6;)V
    .locals 1

    const-string v0, "composeInsets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LnC6;->c()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, LqB6$b;-><init>(I)V

    iput-object p1, p0, LE32;->d:LnC6;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;LDB6;)LDB6;
    .locals 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "insets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LE32;->g:LDB6;

    iget-object v0, p0, LE32;->d:LnC6;

    invoke-virtual {v0, p2}, LnC6;->k(LDB6;)V

    iget-boolean v0, p0, LE32;->e:Z

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_1

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, LE32;->f:Z

    if-nez p1, :cond_1

    iget-object p1, p0, LE32;->d:LnC6;

    invoke-virtual {p1, p2}, LnC6;->j(LDB6;)V

    iget-object p1, p0, LE32;->d:LnC6;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, p2, v2, v0, v1}, LnC6;->i(LnC6;LDB6;IILjava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object p1, p0, LE32;->d:LnC6;

    invoke-virtual {p1}, LnC6;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p2, LDB6;->b:LDB6;

    const-string p1, "CONSUMED"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-object p2
.end method

.method public c(LqB6;)V
    .locals 6

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LE32;->e:Z

    iput-boolean v0, p0, LE32;->f:Z

    iget-object v1, p0, LE32;->g:LDB6;

    invoke-virtual {p1}, LqB6;->a()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, LE32;->d:LnC6;

    invoke-virtual {v2, v1}, LnC6;->j(LDB6;)V

    iget-object v2, p0, LE32;->d:LnC6;

    invoke-virtual {v2, v1}, LnC6;->k(LDB6;)V

    iget-object v2, p0, LE32;->d:LnC6;

    const/4 v4, 0x2

    invoke-static {v2, v1, v0, v4, v3}, LnC6;->i(LnC6;LDB6;IILjava/lang/Object;)V

    :cond_0
    iput-object v3, p0, LE32;->g:LDB6;

    invoke-super {p0, p1}, LqB6$b;->c(LqB6;)V

    return-void
.end method

.method public d(LqB6;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LE32;->e:Z

    iput-boolean v0, p0, LE32;->f:Z

    invoke-super {p0, p1}, LqB6$b;->d(LqB6;)V

    return-void
.end method

.method public e(LDB6;Ljava/util/List;)LDB6;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDB6;",
            "Ljava/util/List<",
            "LqB6;",
            ">;)",
            "LDB6;"
        }
    .end annotation

    const-string v0, "insets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "runningAnimations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LE32;->d:LnC6;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, p1, v2, v0, v1}, LnC6;->i(LnC6;LDB6;IILjava/lang/Object;)V

    iget-object p2, p0, LE32;->d:LnC6;

    invoke-virtual {p2}, LnC6;->c()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, LDB6;->b:LDB6;

    const-string p2, "CONSUMED"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public f(LqB6;LqB6$a;)LqB6$a;
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LE32;->e:Z

    invoke-super {p0, p1, p2}, LqB6$b;->f(LqB6;LqB6$a;)LqB6$a;

    move-result-object p1

    const-string p2, "super.onStart(animation, bounds)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public run()V
    .locals 5

    iget-boolean v0, p0, LE32;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LE32;->e:Z

    iput-boolean v0, p0, LE32;->f:Z

    iget-object v1, p0, LE32;->g:LDB6;

    if-eqz v1, :cond_0

    iget-object v2, p0, LE32;->d:LnC6;

    invoke-virtual {v2, v1}, LnC6;->j(LDB6;)V

    iget-object v2, p0, LE32;->d:LnC6;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v1, v0, v3, v4}, LnC6;->i(LnC6;LDB6;IILjava/lang/Object;)V

    iput-object v4, p0, LE32;->g:LDB6;

    :cond_0
    return-void
.end method

.class public final LXk2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYk2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00088\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0010\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "LXk2;",
        "LYk2;",
        "LFY1;",
        "imeAction",
        "",
        "d",
        "(I)V",
        "a",
        "LZk2;",
        "LZk2;",
        "c",
        "()LZk2;",
        "g",
        "(LZk2;)V",
        "keyboardActions",
        "LBv1;",
        "b",
        "LBv1;",
        "()LBv1;",
        "e",
        "(LBv1;)V",
        "focusManager",
        "La26;",
        "La26;",
        "getInputSession",
        "()La26;",
        "f",
        "(La26;)V",
        "inputSession",
        "<init>",
        "()V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:LZk2;

.field public b:LBv1;

.field public c:La26;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    sget-object v0, LFY1;->b:LFY1$a;

    invoke-virtual {v0}, LFY1$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LXk2;->b()LBv1;

    move-result-object p1

    sget-object v0, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->e()I

    move-result v0

    invoke-interface {p1, v0}, LBv1;->i(I)Z

    goto :goto_3

    :cond_0
    invoke-virtual {v0}, LFY1$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LXk2;->b()LBv1;

    move-result-object p1

    sget-object v0, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->f()I

    move-result v0

    invoke-interface {p1, v0}, LBv1;->i(I)Z

    goto :goto_3

    :cond_1
    invoke-virtual {v0}, LFY1$a;->b()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, LXk2;->c:La26;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, La26;->b()Z

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, LFY1$a;->c()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, LFY1$a;->g()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, LFY1$a;->h()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, LFY1$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, LFY1$a;->e()I

    move-result v0

    invoke-static {p1, v0}, LFY1;->l(II)Z

    :cond_7
    :goto_3
    return-void
.end method

.method public final b()LBv1;
    .locals 1

    iget-object v0, p0, LXk2;->b:LBv1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "focusManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()LZk2;
    .locals 1

    iget-object v0, p0, LXk2;->a:LZk2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "keyboardActions"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(I)V
    .locals 3

    sget-object v0, LFY1;->b:LFY1$a;

    invoke-virtual {v0}, LFY1$a;->b()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LXk2;->c()LZk2;

    move-result-object v0

    invoke-virtual {v0}, LZk2;->b()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v0}, LFY1$a;->c()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LXk2;->c()LZk2;

    move-result-object v0

    invoke-virtual {v0}, LZk2;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LFY1$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LXk2;->c()LZk2;

    move-result-object v0

    invoke-virtual {v0}, LZk2;->d()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LFY1$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LXk2;->c()LZk2;

    move-result-object v0

    invoke-virtual {v0}, LZk2;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LFY1$a;->g()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LXk2;->c()LZk2;

    move-result-object v0

    invoke-virtual {v0}, LZk2;->f()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, LFY1$a;->h()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, LXk2;->c()LZk2;

    move-result-object v0

    invoke-virtual {v0}, LZk2;->g()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, LFY1$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LFY1;->l(II)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v0, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, LFY1$a;->e()I

    move-result v0

    invoke-static {p1, v0}, LFY1;->l(II)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_9

    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_7

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_7
    if-nez v2, :cond_8

    invoke-virtual {p0, p1}, LXk2;->a(I)V

    :cond_8
    return-void

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid ImeAction"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(LBv1;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LXk2;->b:LBv1;

    return-void
.end method

.method public final f(La26;)V
    .locals 0

    iput-object p1, p0, LXk2;->c:La26;

    return-void
.end method

.method public final g(LZk2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LXk2;->a:LZk2;

    return-void
.end method

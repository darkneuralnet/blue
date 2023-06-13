.class public final LH26;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH26$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007\u001a\'\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00072\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0015"
    }
    d2 = {
        "LG26;",
        "start",
        "stop",
        "",
        "fraction",
        "c",
        "style",
        "Lpm2;",
        "direction",
        "d",
        "layoutDirection",
        "LW06;",
        "textDirection",
        "e",
        "(Lpm2;LW06;)I",
        "LdW3;",
        "platformSpanStyle",
        "LZV3;",
        "platformParagraphStyle",
        "LlW3;",
        "b",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final synthetic a(LdW3;LZV3;)LlW3;
    .locals 0

    invoke-static {p0, p1}, LH26;->b(LdW3;LZV3;)LlW3;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LdW3;LZV3;)LlW3;
    .locals 0

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LSd;->a(LdW3;LZV3;)LlW3;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final c(LG26;LG26;F)LG26;
    .locals 3

    const-string v0, "start"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stop"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG26;

    invoke-virtual {p0}, LG26;->L()LGN5;

    move-result-object v1

    invoke-virtual {p1}, LG26;->L()LGN5;

    move-result-object v2

    invoke-static {v1, v2, p2}, LHN5;->b(LGN5;LGN5;F)LGN5;

    move-result-object v1

    invoke-virtual {p0}, LG26;->K()LDE3;

    move-result-object p0

    invoke-virtual {p1}, LG26;->K()LDE3;

    move-result-object p1

    invoke-static {p0, p1, p2}, LEE3;->a(LDE3;LDE3;F)LDE3;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LG26;-><init>(LGN5;LDE3;)V

    return-object v0
.end method

.method public static final d(LG26;Lpm2;)LG26;
    .locals 3

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG26;

    invoke-virtual {p0}, LG26;->A()LGN5;

    move-result-object v1

    invoke-static {v1}, LHN5;->f(LGN5;)LGN5;

    move-result-object v1

    invoke-virtual {p0}, LG26;->x()LDE3;

    move-result-object v2

    invoke-static {v2, p1}, LEE3;->c(LDE3;Lpm2;)LDE3;

    move-result-object p1

    invoke-virtual {p0}, LG26;->y()LlW3;

    move-result-object p0

    invoke-direct {v0, v1, p1, p0}, LG26;-><init>(LGN5;LDE3;LlW3;)V

    return-object v0
.end method

.method public static final e(Lpm2;LW06;)I
    .locals 4

    const-string v0, "layoutDirection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LW06;->b:LW06$a;

    invoke-virtual {v0}, LW06$a;->a()I

    move-result v1

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LW06;->l()I

    move-result v2

    invoke-static {v2, v1}, LW06;->i(II)Z

    move-result v1

    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    sget-object p1, LH26$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    if-eq p0, v3, :cond_2

    if-ne p0, v2, :cond_1

    invoke-virtual {v0}, LW06$a;->c()I

    move-result p0

    goto :goto_1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    invoke-virtual {v0}, LW06$a;->b()I

    move-result p0

    goto :goto_1

    :cond_3
    if-nez p1, :cond_6

    sget-object p1, LH26$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    if-eq p0, v3, :cond_5

    if-ne p0, v2, :cond_4

    invoke-virtual {v0}, LW06$a;->e()I

    move-result p0

    goto :goto_1

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    invoke-virtual {v0}, LW06$a;->d()I

    move-result p0

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, LW06;->l()I

    move-result p0

    :goto_1
    return p0
.end method

.class public final LEE3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a&\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000\"\u0017\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\r\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "LDE3;",
        "start",
        "stop",
        "",
        "fraction",
        "a",
        "LZV3;",
        "b",
        "style",
        "Lpm2;",
        "direction",
        "c",
        "LM26;",
        "J",
        "DefaultLineHeight",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, LM26;->b:LM26$a;

    invoke-virtual {v0}, LM26$a;->a()J

    move-result-wide v0

    sput-wide v0, LEE3;->a:J

    return-void
.end method

.method public static final a(LDE3;LDE3;F)LDE3;
    .locals 13

    const-string v0, "start"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stop"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDE3;

    invoke-virtual {p0}, LDE3;->j()Lr06;

    move-result-object v1

    invoke-virtual {p1}, LDE3;->j()Lr06;

    move-result-object v2

    invoke-static {v1, v2, p2}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lr06;

    invoke-virtual {p0}, LDE3;->l()LW06;

    move-result-object v1

    invoke-virtual {p1}, LDE3;->l()LW06;

    move-result-object v3

    invoke-static {v1, v3, p2}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LW06;

    invoke-virtual {p0}, LDE3;->g()J

    move-result-wide v4

    invoke-virtual {p1}, LDE3;->g()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7, p2}, LHN5;->e(JJF)J

    move-result-wide v4

    invoke-virtual {p0}, LDE3;->m()LN16;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, LN16;->c:LN16$a;

    invoke-virtual {v1}, LN16$a;->a()LN16;

    move-result-object v1

    :cond_0
    invoke-virtual {p1}, LDE3;->m()LN16;

    move-result-object v6

    if-nez v6, :cond_1

    sget-object v6, LN16;->c:LN16$a;

    invoke-virtual {v6}, LN16$a;->a()LN16;

    move-result-object v6

    :cond_1
    invoke-static {v1, v6, p2}, LO16;->a(LN16;LN16;F)LN16;

    move-result-object v6

    invoke-virtual {p0}, LDE3;->i()LZV3;

    move-result-object v1

    invoke-virtual {p1}, LDE3;->i()LZV3;

    move-result-object v7

    invoke-static {v1, v7, p2}, LEE3;->b(LZV3;LZV3;F)LZV3;

    move-result-object v7

    invoke-virtual {p0}, LDE3;->h()Lor2;

    move-result-object v1

    invoke-virtual {p1}, LDE3;->h()Lor2;

    move-result-object v8

    invoke-static {v1, v8, p2}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lor2;

    invoke-virtual {p0}, LDE3;->e()Lfr2;

    move-result-object v1

    invoke-virtual {p1}, LDE3;->e()Lfr2;

    move-result-object v9

    invoke-static {v1, v9, p2}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lfr2;

    invoke-virtual {p0}, LDE3;->c()LUN1;

    move-result-object v1

    invoke-virtual {p1}, LDE3;->c()LUN1;

    move-result-object v10

    invoke-static {v1, v10, p2}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, LUN1;

    invoke-virtual {p0}, LDE3;->n()Ll26;

    move-result-object p0

    invoke-virtual {p1}, LDE3;->n()Ll26;

    move-result-object p1

    invoke-static {p0, p1, p2}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object p0

    move-object v11, p0

    check-cast v11, Ll26;

    const/4 v12, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, LDE3;-><init>(Lr06;LW06;JLN16;LZV3;Lor2;Lfr2;LUN1;Ll26;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final b(LZV3;LZV3;F)LZV3;
    .locals 0

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    sget-object p0, LZV3;->c:LZV3$a;

    invoke-virtual {p0}, LZV3$a;->a()LZV3;

    move-result-object p0

    :cond_1
    if-nez p1, :cond_2

    sget-object p1, LZV3;->c:LZV3$a;

    invoke-virtual {p1}, LZV3$a;->a()LZV3;

    move-result-object p1

    :cond_2
    invoke-static {p0, p1, p2}, LSd;->b(LZV3;LZV3;F)LZV3;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LDE3;Lpm2;)LDE3;
    .locals 13

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDE3;

    invoke-virtual {p0}, LDE3;->k()I

    move-result v1

    invoke-static {v1}, Lr06;->g(I)Lr06;

    move-result-object v2

    invoke-virtual {p0}, LDE3;->l()LW06;

    move-result-object v1

    invoke-static {p1, v1}, LH26;->e(Lpm2;LW06;)I

    move-result p1

    invoke-static {p1}, LW06;->f(I)LW06;

    move-result-object v3

    invoke-virtual {p0}, LDE3;->g()J

    move-result-wide v4

    invoke-static {v4, v5}, LN26;->g(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-wide v4, LEE3;->a:J

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LDE3;->g()J

    move-result-wide v4

    :goto_0
    invoke-virtual {p0}, LDE3;->m()LN16;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, LN16;->c:LN16$a;

    invoke-virtual {p1}, LN16$a;->a()LN16;

    move-result-object p1

    :cond_1
    move-object v6, p1

    invoke-virtual {p0}, LDE3;->i()LZV3;

    move-result-object v7

    invoke-virtual {p0}, LDE3;->h()Lor2;

    move-result-object v8

    invoke-virtual {p0}, LDE3;->f()I

    move-result p1

    invoke-static {p1}, Lfr2;->b(I)Lfr2;

    move-result-object v9

    invoke-virtual {p0}, LDE3;->d()I

    move-result p1

    invoke-static {p1}, LUN1;->c(I)LUN1;

    move-result-object v10

    invoke-virtual {p0}, LDE3;->n()Ll26;

    move-result-object p0

    if-nez p0, :cond_2

    sget-object p0, Ll26;->c:Ll26$a;

    invoke-virtual {p0}, Ll26$a;->a()Ll26;

    move-result-object p0

    :cond_2
    move-object v11, p0

    const/4 v12, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, LDE3;-><init>(Lr06;LW06;JLN16;LZV3;Lor2;Lfr2;LUN1;Ll26;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

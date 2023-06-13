.class public final La16;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a!\u0010\u0008\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001a\u0010\u000c\u001a\u00020\u0003*\u00020\u00032\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\nH\u0002\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "LH16;",
        "start",
        "stop",
        "",
        "fraction",
        "b",
        "Lpm0;",
        "alpha",
        "c",
        "(JF)J",
        "Lkotlin/Function0;",
        "block",
        "d",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/JvmName;
    name = "TextDrawStyleKt"
.end annotation


# direct methods
.method public static final synthetic a(FLkotlin/jvm/functions/Function0;)F
    .locals 0

    invoke-static {p0, p1}, La16;->d(FLkotlin/jvm/functions/Function0;)F

    move-result p0

    return p0
.end method

.method public static final b(LH16;LH16;F)LH16;
    .locals 3

    const-string v0, "start"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stop"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lc30;

    if-nez v0, :cond_0

    instance-of v1, p1, Lc30;

    if-nez v1, :cond_0

    sget-object v0, LH16;->a:LH16$a;

    invoke-interface {p0}, LH16;->a()J

    move-result-wide v1

    invoke-interface {p1}, LH16;->a()J

    move-result-wide p0

    invoke-static {v1, v2, p0, p1, p2}, Lvm0;->e(JJF)J

    move-result-wide p0

    invoke-virtual {v0, p0, p1}, LH16$a;->b(J)LH16;

    move-result-object p0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    instance-of v0, p1, Lc30;

    if-eqz v0, :cond_1

    sget-object v0, LH16;->a:LH16$a;

    move-object v1, p0

    check-cast v1, Lc30;

    invoke-virtual {v1}, Lc30;->d()La30;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lc30;

    invoke-virtual {v2}, Lc30;->d()La30;

    move-result-object v2

    invoke-static {v1, v2, p2}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La30;

    invoke-interface {p0}, LH16;->h()F

    move-result p0

    invoke-interface {p1}, LH16;->h()F

    move-result p1

    invoke-static {p0, p1, p2}, LYM2;->a(FFF)F

    move-result p0

    invoke-virtual {v0, v1, p0}, LH16$a;->a(La30;F)LH16;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, p2}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LH16;

    :goto_0
    return-object p0
.end method

.method public static final c(JF)J
    .locals 9

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lpm0;->p(J)F

    move-result v0

    mul-float v3, v0, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    move-wide v1, p0

    invoke-static/range {v1 .. v8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide p0

    :cond_1
    :goto_0
    return-wide p0
.end method

.method public static final d(FLkotlin/jvm/functions/Function0;)F
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    :cond_0
    return p0
.end method

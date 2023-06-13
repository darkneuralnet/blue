.class public final LN26;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a-\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0000H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\"!\u0010\u001a\u001a\u00020\u0016*\u00020\u00048FX\u0087\u0004\u00f8\u0001\u0001\u00a2\u0006\u000c\u0012\u0004\u0008\u0019\u0010\u000e\u001a\u0004\u0008\u0017\u0010\u0018\"!\u0010\u001f\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004\u00f8\u0001\u0001\u00a2\u0006\u000c\u0012\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001b\u0010\u001c\"!\u0010\u001f\u001a\u00020\u0004*\u00020 8FX\u0087\u0004\u00f8\u0001\u0001\u00a2\u0006\u000c\u0012\u0004\u0008\u001d\u0010#\u001a\u0004\u0008!\u0010\"\"!\u0010\u001f\u001a\u00020\u0004*\u00020$8FX\u0087\u0004\u00f8\u0001\u0001\u00a2\u0006\u000c\u0012\u0004\u0008\u001d\u0010\'\u001a\u0004\u0008%\u0010&\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006("
    }
    d2 = {
        "",
        "value",
        "LO26;",
        "type",
        "LM26;",
        "a",
        "(FJ)J",
        "",
        "unitType",
        "v",
        "i",
        "(JF)J",
        "",
        "b",
        "(J)V",
        "c",
        "(JJ)V",
        "start",
        "stop",
        "fraction",
        "h",
        "(JJF)J",
        "",
        "g",
        "(J)Z",
        "isUnspecified--R2X_6o$annotations",
        "isUnspecified",
        "e",
        "(F)J",
        "getSp$annotations",
        "(F)V",
        "sp",
        "",
        "d",
        "(D)J",
        "(D)V",
        "",
        "f",
        "(I)J",
        "(I)V",
        "ui-unit_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,388:1\n250#1:389\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n264#1:389\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(FJ)J
    .locals 0

    invoke-static {p1, p2, p0}, LN26;->i(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final b(J)V
    .locals 0
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    invoke-static {p0, p1}, LN26;->g(J)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot perform operation for Unspecified type."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(JJ)V
    .locals 4
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    invoke-static {p0, p1}, LN26;->g(J)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2, p3}, LN26;->g(J)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-static {p0, p1}, LM26;->g(J)J

    move-result-wide v0

    invoke-static {p2, p3}, LM26;->g(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LO26;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot perform operation for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, LM26;->g(J)J

    move-result-wide p0

    invoke-static {p0, p1}, LO26;->i(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " and "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, LM26;->g(J)J

    move-result-wide p0

    invoke-static {p0, p1}, LO26;->i(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot perform operation for Unspecified type."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(D)J
    .locals 2

    const-wide v0, 0x100000000L

    double-to-float p0, p0

    invoke-static {v0, v1, p0}, LN26;->i(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final e(F)J
    .locals 2

    const-wide v0, 0x100000000L

    invoke-static {v0, v1, p0}, LN26;->i(JF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final f(I)J
    .locals 2

    const-wide v0, 0x100000000L

    int-to-float p0, p0

    invoke-static {v0, v1, p0}, LN26;->i(JF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final g(J)Z
    .locals 2

    invoke-static {p0, p1}, LM26;->f(J)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final h(JJF)J
    .locals 2

    invoke-static {p0, p1, p2, p3}, LN26;->c(JJ)V

    invoke-static {p0, p1}, LM26;->f(J)J

    move-result-wide v0

    invoke-static {p0, p1}, LM26;->h(J)F

    move-result p0

    invoke-static {p2, p3}, LM26;->h(J)F

    move-result p1

    invoke-static {p0, p1, p4}, LYM2;->a(FFF)F

    move-result p0

    invoke-static {v0, v1, p0}, LN26;->i(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final i(JF)J
    .locals 4
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p2

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p0, v0

    invoke-static {p0, p1}, LM26;->c(J)J

    move-result-wide p0

    return-wide p0
.end method

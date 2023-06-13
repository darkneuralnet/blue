.class public final Lcq5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBm2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010\"\u001a\u00020\u0018\u0012\u0006\u0010$\u001a\u00020\u0018\u00a2\u0006\u0004\u0008%\u0010&J)\u0010\u0008\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001c\u0010\u000e\u001a\u00020\u000c*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000cH\u0016J\u001c\u0010\u0010\u001a\u00020\u000c*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000cH\u0016J\u001c\u0010\u0011\u001a\u00020\u000c*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000cH\u0016J\u001c\u0010\u0012\u001a\u00020\u000c*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000cH\u0016J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u000cH\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010 \u001a\u0004\u0008\u001b\u0010!R\u0017\u0010$\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010 \u001a\u0004\u0008#\u0010!\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\'"
    }
    d2 = {
        "Lcq5;",
        "LBm2;",
        "LzO2;",
        "LvO2;",
        "measurable",
        "Lkz0;",
        "constraints",
        "LyO2;",
        "f",
        "(LzO2;LvO2;J)LyO2;",
        "LZ62;",
        "LX62;",
        "",
        "height",
        "c",
        "width",
        "e",
        "i",
        "d",
        "",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "LXp5;",
        "b",
        "LXp5;",
        "a",
        "()LXp5;",
        "scrollerState",
        "Z",
        "()Z",
        "isReversed",
        "g",
        "isVertical",
        "<init>",
        "(LXp5;ZZ)V",
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
.field public final b:LXp5;

.field public final c:Z

.field public final d:Z


# direct methods
.method public constructor <init>(LXp5;ZZ)V
    .locals 1

    const-string v0, "scrollerState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcq5;->b:LXp5;

    iput-boolean p2, p0, Lcq5;->c:Z

    iput-boolean p3, p0, Lcq5;->d:Z

    return-void
.end method


# virtual methods
.method public final a()LXp5;
    .locals 1

    iget-object v0, p0, Lcq5;->b:LXp5;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lcq5;->c:Z

    return v0
.end method

.method public c(LZ62;LX62;I)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "measurable"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcq5;->d:Z

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LX62;->p0(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LX62;->p0(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public d(LZ62;LX62;I)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "measurable"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcq5;->d:Z

    if-eqz p1, :cond_0

    invoke-interface {p2, p3}, LX62;->B(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LX62;->B(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public e(LZ62;LX62;I)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "measurable"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcq5;->d:Z

    if-eqz p1, :cond_0

    invoke-interface {p2, p3}, LX62;->g0(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LX62;->g0(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcq5;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcq5;

    iget-object v1, p0, Lcq5;->b:LXp5;

    iget-object v3, p1, Lcq5;->b:LXp5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcq5;->c:Z

    iget-boolean v3, p1, Lcq5;->c:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcq5;->d:Z

    iget-boolean p1, p1, Lcq5;->d:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public f(LzO2;LvO2;J)LyO2;
    .locals 10

    const-string v0, "$this$measure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcq5;->d:Z

    if-eqz v0, :cond_0

    sget-object v0, LEy3;->b:LEy3;

    goto :goto_0

    :cond_0
    sget-object v0, LEy3;->c:LEy3;

    :goto_0
    invoke-static {p3, p4, v0}, Loi0;->a(JLEy3;)V

    iget-boolean v0, p0, Lcq5;->d:Z

    const v1, 0x7fffffff

    if-eqz v0, :cond_1

    move v7, v1

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, Lkz0;->m(J)I

    move-result v0

    move v7, v0

    :goto_1
    iget-boolean v0, p0, Lcq5;->d:Z

    if-eqz v0, :cond_2

    invoke-static {p3, p4}, Lkz0;->n(J)I

    move-result v1

    :cond_2
    move v5, v1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x5

    const/4 v9, 0x0

    move-wide v2, p3

    invoke-static/range {v2 .. v9}, Lkz0;->e(JIIIIILjava/lang/Object;)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LvO2;->P0(J)LOU3;

    move-result-object p2

    invoke-virtual {p2}, LOU3;->i1()I

    move-result v0

    invoke-static {p3, p4}, Lkz0;->n(J)I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v3

    invoke-virtual {p2}, LOU3;->d1()I

    move-result v0

    invoke-static {p3, p4}, Lkz0;->m(J)I

    move-result p3

    invoke-static {v0, p3}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v4

    invoke-virtual {p2}, LOU3;->d1()I

    move-result p3

    sub-int/2addr p3, v4

    invoke-virtual {p2}, LOU3;->i1()I

    move-result p4

    sub-int/2addr p4, v3

    iget-boolean v0, p0, Lcq5;->d:Z

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move p3, p4

    :goto_2
    iget-object p4, p0, Lcq5;->b:LXp5;

    invoke-virtual {p4, p3}, LXp5;->n(I)V

    iget-object p4, p0, Lcq5;->b:LXp5;

    iget-boolean v0, p0, Lcq5;->d:Z

    if-eqz v0, :cond_4

    move v0, v4

    goto :goto_3

    :cond_4
    move v0, v3

    :goto_3
    invoke-virtual {p4, v0}, LXp5;->p(I)V

    const/4 v5, 0x0

    new-instance v6, Lcq5$a;

    invoke-direct {v6, p0, p3, p2}, Lcq5$a;-><init>(Lcq5;ILOU3;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object p1

    return-object p1
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcq5;->d:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcq5;->b:LXp5;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcq5;->c:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcq5;->d:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public i(LZ62;LX62;I)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "measurable"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcq5;->d:Z

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LX62;->t0(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LX62;->t0(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScrollingLayoutModifier(scrollerState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcq5;->b:LXp5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isReversed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcq5;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isVertical="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcq5;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

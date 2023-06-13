.class public final LJE1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzY3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJE1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\t\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J5\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0016"
    }
    d2 = {
        "LJE1;",
        "LzY3;",
        "LD52;",
        "anchorBounds",
        "LG52;",
        "windowSize",
        "Lpm2;",
        "layoutDirection",
        "popupContentSize",
        "LA52;",
        "calculatePosition-llwVHH4",
        "(LD52;JLpm2;J)J",
        "calculatePosition",
        "LLE1;",
        "a",
        "LLE1;",
        "handleReferencePoint",
        "b",
        "J",
        "offset",
        "<init>",
        "(LLE1;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
.field public final a:LLE1;

.field public final b:J


# direct methods
.method public constructor <init>(LLE1;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJE1;->a:LLE1;

    iput-wide p2, p0, LJE1;->b:J

    return-void
.end method

.method public synthetic constructor <init>(LLE1;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LJE1;-><init>(LLE1;J)V

    return-void
.end method


# virtual methods
.method public calculatePosition-llwVHH4(LD52;JLpm2;J)J
    .locals 2

    const-string p2, "anchorBounds"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "layoutDirection"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LJE1;->a:LLE1;

    sget-object p3, LJE1$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, p3, p2

    const/4 p3, 0x1

    if-eq p2, p3, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_1

    const/4 p4, 0x3

    if-ne p2, p4, :cond_0

    invoke-virtual {p1}, LD52;->c()I

    move-result p2

    iget-wide v0, p0, LJE1;->b:J

    invoke-static {v0, v1}, LA52;->j(J)I

    move-result p4

    add-int/2addr p2, p4

    invoke-static {p5, p6}, LG52;->g(J)I

    move-result p4

    div-int/2addr p4, p3

    sub-int/2addr p2, p4

    invoke-virtual {p1}, LD52;->e()I

    move-result p1

    iget-wide p3, p0, LJE1;->b:J

    invoke-static {p3, p4}, LA52;->k(J)I

    move-result p3

    add-int/2addr p1, p3

    invoke-static {p2, p1}, LB52;->a(II)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, LD52;->c()I

    move-result p2

    iget-wide p3, p0, LJE1;->b:J

    invoke-static {p3, p4}, LA52;->j(J)I

    move-result p3

    add-int/2addr p2, p3

    invoke-static {p5, p6}, LG52;->g(J)I

    move-result p3

    sub-int/2addr p2, p3

    invoke-virtual {p1}, LD52;->e()I

    move-result p1

    iget-wide p3, p0, LJE1;->b:J

    invoke-static {p3, p4}, LA52;->k(J)I

    move-result p3

    add-int/2addr p1, p3

    invoke-static {p2, p1}, LB52;->a(II)J

    move-result-wide p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LD52;->c()I

    move-result p2

    iget-wide p3, p0, LJE1;->b:J

    invoke-static {p3, p4}, LA52;->j(J)I

    move-result p3

    add-int/2addr p2, p3

    invoke-virtual {p1}, LD52;->e()I

    move-result p1

    iget-wide p3, p0, LJE1;->b:J

    invoke-static {p3, p4}, LA52;->k(J)I

    move-result p3

    add-int/2addr p1, p3

    invoke-static {p2, p1}, LB52;->a(II)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

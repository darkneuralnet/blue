.class public final LEO2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LvO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u00a2\u0006\u0004\u0008#\u0010$J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010!\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006%"
    }
    d2 = {
        "LEO2$a;",
        "LvO2;",
        "Lkz0;",
        "constraints",
        "LOU3;",
        "P0",
        "(J)LOU3;",
        "",
        "height",
        "p0",
        "t0",
        "width",
        "g0",
        "B",
        "LX62;",
        "b",
        "LX62;",
        "getMeasurable",
        "()LX62;",
        "measurable",
        "LEO2$c;",
        "c",
        "LEO2$c;",
        "getMinMax",
        "()LEO2$c;",
        "minMax",
        "LEO2$d;",
        "d",
        "LEO2$d;",
        "getWidthHeight",
        "()LEO2$d;",
        "widthHeight",
        "",
        "()Ljava/lang/Object;",
        "parentData",
        "<init>",
        "(LX62;LEO2$c;LEO2$d;)V",
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
.field public final b:LX62;

.field public final c:LEO2$c;

.field public final d:LEO2$d;


# direct methods
.method public constructor <init>(LX62;LEO2$c;LEO2$d;)V
    .locals 1

    const-string v0, "measurable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "minMax"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "widthHeight"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEO2$a;->b:LX62;

    iput-object p2, p0, LEO2$a;->c:LEO2$c;

    iput-object p3, p0, LEO2$a;->d:LEO2$d;

    return-void
.end method


# virtual methods
.method public B(I)I
    .locals 1

    iget-object v0, p0, LEO2$a;->b:LX62;

    invoke-interface {v0, p1}, LX62;->B(I)I

    move-result p1

    return p1
.end method

.method public P0(J)LOU3;
    .locals 2

    iget-object v0, p0, LEO2$a;->d:LEO2$d;

    sget-object v1, LEO2$d;->b:LEO2$d;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LEO2$a;->c:LEO2$c;

    sget-object v1, LEO2$c;->c:LEO2$c;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LEO2$a;->b:LX62;

    invoke-static {p1, p2}, Lkz0;->m(J)I

    move-result v1

    invoke-interface {v0, v1}, LX62;->t0(I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LEO2$a;->b:LX62;

    invoke-static {p1, p2}, Lkz0;->m(J)I

    move-result v1

    invoke-interface {v0, v1}, LX62;->p0(I)I

    move-result v0

    :goto_0
    new-instance v1, LEO2$b;

    invoke-static {p1, p2}, Lkz0;->m(J)I

    move-result p1

    invoke-direct {v1, v0, p1}, LEO2$b;-><init>(II)V

    return-object v1

    :cond_1
    iget-object v0, p0, LEO2$a;->c:LEO2$c;

    sget-object v1, LEO2$c;->c:LEO2$c;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LEO2$a;->b:LX62;

    invoke-static {p1, p2}, Lkz0;->n(J)I

    move-result v1

    invoke-interface {v0, v1}, LX62;->B(I)I

    move-result v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, LEO2$a;->b:LX62;

    invoke-static {p1, p2}, Lkz0;->n(J)I

    move-result v1

    invoke-interface {v0, v1}, LX62;->g0(I)I

    move-result v0

    :goto_1
    new-instance v1, LEO2$b;

    invoke-static {p1, p2}, Lkz0;->n(J)I

    move-result p1

    invoke-direct {v1, p1, v0}, LEO2$b;-><init>(II)V

    return-object v1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LEO2$a;->b:LX62;

    invoke-interface {v0}, LX62;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public g0(I)I
    .locals 1

    iget-object v0, p0, LEO2$a;->b:LX62;

    invoke-interface {v0, p1}, LX62;->g0(I)I

    move-result p1

    return p1
.end method

.method public p0(I)I
    .locals 1

    iget-object v0, p0, LEO2$a;->b:LX62;

    invoke-interface {v0, p1}, LX62;->p0(I)I

    move-result p1

    return p1
.end method

.method public t0(I)I
    .locals 1

    iget-object v0, p0, LEO2$a;->b:LX62;

    invoke-interface {v0, p1}, LX62;->t0(I)I

    move-result p1

    return p1
.end method

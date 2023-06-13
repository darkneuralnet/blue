.class public final Lj26;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u00a2\u0006\u0004\u0008$\u0010%J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\u0004J\u001b\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u0002*\u00020\u0002H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u0002*\u00020\u0002H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R$\u0010#\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001e\"\u0004\u0008\"\u0010 \u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006&"
    }
    d2 = {
        "Lj26;",
        "",
        "LCe3;",
        "position",
        "",
        "coerceInVisibleBounds",
        "",
        "g",
        "(JZ)I",
        "",
        "vertical",
        "f",
        "lineIndex",
        "visibleEnd",
        "d",
        "offset",
        "j",
        "(J)Z",
        "k",
        "(J)J",
        "a",
        "Li26;",
        "Li26;",
        "i",
        "()Li26;",
        "value",
        "Lnm2;",
        "b",
        "Lnm2;",
        "c",
        "()Lnm2;",
        "m",
        "(Lnm2;)V",
        "innerTextFieldCoordinates",
        "l",
        "decorationBoxCoordinates",
        "<init>",
        "(Li26;)V",
        "foundation_release"
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
        "SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Li26;

.field public b:Lnm2;

.field public c:Lnm2;


# direct methods
.method public constructor <init>(Li26;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj26;->a:Li26;

    return-void
.end method

.method public static synthetic e(Lj26;IZILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lj26;->d(IZ)I

    move-result p0

    return p0
.end method

.method public static synthetic h(Lj26;JZILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lj26;->g(JZ)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(J)J
    .locals 5

    iget-object v0, p0, Lj26;->b:Lnm2;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lnm2;->F()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lj26;->c:Lnm2;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v0, v3, v4, v2}, Lnm2;->f(Lnm2;Lnm2;ZILjava/lang/Object;)LOs4;

    move-result-object v2

    goto :goto_0

    :cond_0
    sget-object v0, LOs4;->e:LOs4$a;

    invoke-virtual {v0}, LOs4$a;->a()LOs4;

    move-result-object v2

    :cond_1
    :goto_0
    if-nez v2, :cond_3

    :cond_2
    sget-object v0, LOs4;->e:LOs4$a;

    invoke-virtual {v0}, LOs4$a;->a()LOs4;

    move-result-object v2

    :cond_3
    invoke-static {p1, p2, v2}, Lk26;->a(JLOs4;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b()Lnm2;
    .locals 1

    iget-object v0, p0, Lj26;->c:Lnm2;

    return-object v0
.end method

.method public final c()Lnm2;
    .locals 1

    iget-object v0, p0, Lj26;->b:Lnm2;

    return-object v0
.end method

.method public final d(IZ)I
    .locals 1

    iget-object v0, p0, Lj26;->a:Li26;

    invoke-virtual {v0, p1, p2}, Li26;->n(IZ)I

    move-result p1

    return p1
.end method

.method public final f(F)I
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0, p1}, LGe3;->a(FF)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lj26;->a(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lj26;->k(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->p(J)F

    move-result p1

    iget-object v0, p0, Lj26;->a:Li26;

    invoke-virtual {v0, p1}, Li26;->q(F)I

    move-result p1

    return p1
.end method

.method public final g(JZ)I
    .locals 0

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1, p2}, Lj26;->a(J)J

    move-result-wide p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lj26;->k(J)J

    move-result-wide p1

    iget-object p3, p0, Lj26;->a:Li26;

    invoke-virtual {p3, p1, p2}, Li26;->w(J)I

    move-result p1

    return p1
.end method

.method public final i()Li26;
    .locals 1

    iget-object v0, p0, Lj26;->a:Li26;

    return-object v0
.end method

.method public final j(J)Z
    .locals 3

    invoke-virtual {p0, p1, p2}, Lj26;->a(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lj26;->k(J)J

    move-result-wide p1

    iget-object v0, p0, Lj26;->a:Li26;

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result v1

    invoke-virtual {v0, v1}, Li26;->q(F)I

    move-result v0

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result v1

    iget-object v2, p0, Lj26;->a:Li26;

    invoke-virtual {v2, v0}, Li26;->r(I)F

    move-result v2

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_0

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result p1

    iget-object p2, p0, Lj26;->a:Li26;

    invoke-virtual {p2, v0}, Li26;->s(I)F

    move-result p2

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final k(J)J
    .locals 3

    iget-object v0, p0, Lj26;->b:Lnm2;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lj26;->c:Lnm2;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lnm2;->F()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Lnm2;->F()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, p1, p2}, Lnm2;->X(Lnm2;J)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LCe3;->x()J

    move-result-wide p1

    :cond_2
    return-wide p1
.end method

.method public final l(Lnm2;)V
    .locals 0

    iput-object p1, p0, Lj26;->c:Lnm2;

    return-void
.end method

.method public final m(Lnm2;)V
    .locals 0

    iput-object p1, p0, Lj26;->b:Lnm2;

    return-void
.end method

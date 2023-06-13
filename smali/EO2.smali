.class public final LEO2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEO2$a;,
        LEO2$b;,
        LEO2$c;,
        LEO2$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u00c2\u0002\u0018\u00002\u00020\u0001:\u0004\u000f\u000e\r\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J/\u0010\n\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ/\u0010\r\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000bJ/\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000bJ/\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "LEO2;",
        "",
        "LBm2;",
        "modifier",
        "LZ62;",
        "instrinsicMeasureScope",
        "LX62;",
        "intrinsicMeasurable",
        "",
        "h",
        "d",
        "(LBm2;LZ62;LX62;I)I",
        "w",
        "c",
        "b",
        "a",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LEO2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LEO2;

    invoke-direct {v0}, LEO2;-><init>()V

    sput-object v0, LEO2;->a:LEO2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBm2;LZ62;LX62;I)I
    .locals 9

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instrinsicMeasureScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intrinsicMeasurable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LEO2$a;

    sget-object v1, LEO2$c;->c:LEO2$c;

    sget-object v2, LEO2$d;->c:LEO2$d;

    invoke-direct {v0, p3, v1, v2}, LEO2$a;-><init>(LX62;LEO2$c;LEO2$d;)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v8, 0x0

    move v4, p4

    invoke-static/range {v3 .. v8}, Lnz0;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Le72;

    invoke-interface {p2}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Le72;-><init>(Lg01;Lpm2;)V

    invoke-interface {p1, v1, v0, p3, p4}, LBm2;->f(LzO2;LvO2;J)LyO2;

    move-result-object p1

    invoke-interface {p1}, LyO2;->getHeight()I

    move-result p1

    return p1
.end method

.method public final b(LBm2;LZ62;LX62;I)I
    .locals 9

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instrinsicMeasureScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intrinsicMeasurable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LEO2$a;

    sget-object v1, LEO2$c;->c:LEO2$c;

    sget-object v2, LEO2$d;->b:LEO2$d;

    invoke-direct {v0, p3, v1, v2}, LEO2$a;-><init>(LX62;LEO2$c;LEO2$d;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move v6, p4

    invoke-static/range {v3 .. v8}, Lnz0;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Le72;

    invoke-interface {p2}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Le72;-><init>(Lg01;Lpm2;)V

    invoke-interface {p1, v1, v0, p3, p4}, LBm2;->f(LzO2;LvO2;J)LyO2;

    move-result-object p1

    invoke-interface {p1}, LyO2;->getWidth()I

    move-result p1

    return p1
.end method

.method public final c(LBm2;LZ62;LX62;I)I
    .locals 9

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instrinsicMeasureScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intrinsicMeasurable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LEO2$a;

    sget-object v1, LEO2$c;->b:LEO2$c;

    sget-object v2, LEO2$d;->c:LEO2$d;

    invoke-direct {v0, p3, v1, v2}, LEO2$a;-><init>(LX62;LEO2$c;LEO2$d;)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v8, 0x0

    move v4, p4

    invoke-static/range {v3 .. v8}, Lnz0;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Le72;

    invoke-interface {p2}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Le72;-><init>(Lg01;Lpm2;)V

    invoke-interface {p1, v1, v0, p3, p4}, LBm2;->f(LzO2;LvO2;J)LyO2;

    move-result-object p1

    invoke-interface {p1}, LyO2;->getHeight()I

    move-result p1

    return p1
.end method

.method public final d(LBm2;LZ62;LX62;I)I
    .locals 9

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instrinsicMeasureScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intrinsicMeasurable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LEO2$a;

    sget-object v1, LEO2$c;->b:LEO2$c;

    sget-object v2, LEO2$d;->b:LEO2$d;

    invoke-direct {v0, p3, v1, v2}, LEO2$a;-><init>(LX62;LEO2$c;LEO2$d;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move v6, p4

    invoke-static/range {v3 .. v8}, Lnz0;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Le72;

    invoke-interface {p2}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Le72;-><init>(Lg01;Lpm2;)V

    invoke-interface {p1, v1, v0, p3, p4}, LBm2;->f(LzO2;LvO2;J)LyO2;

    move-result-object p1

    invoke-interface {p1}, LyO2;->getWidth()I

    move-result p1

    return p1
.end method

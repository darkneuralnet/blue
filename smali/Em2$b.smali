.class public final LEm2$b;
.super LTC2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEm2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEm2$b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\n0\u0011R\u00060\u0000R\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "LEm2$b;",
        "LTC2;",
        "Lkz0;",
        "constraints",
        "LOU3;",
        "P0",
        "(J)LOU3;",
        "LL9;",
        "alignmentLine",
        "",
        "n1",
        "Ll62;",
        "o",
        "Ll62;",
        "getIntermediateMeasureNode",
        "()Ll62;",
        "intermediateMeasureNode",
        "LEm2$b$a;",
        "LEm2;",
        "p",
        "LEm2$b$a;",
        "passThroughMeasureResult",
        "LXC2;",
        "scope",
        "<init>",
        "(LEm2;LXC2;Ll62;)V",
        "a",
        "ui_release"
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
        "SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,277:1\n173#2,3:278\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier\n*L\n130#1:278,3\n*E\n"
    }
.end annotation


# instance fields
.field public final o:Ll62;

.field public final p:LEm2$b$a;

.field public final synthetic q:LEm2;


# direct methods
.method public constructor <init>(LEm2;LXC2;Ll62;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXC2;",
            "Ll62;",
            ")V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intermediateMeasureNode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LEm2$b;->q:LEm2;

    invoke-direct {p0, p1, p2}, LTC2;-><init>(LH83;LXC2;)V

    iput-object p3, p0, LEm2$b;->o:Ll62;

    new-instance p1, LEm2$b$a;

    invoke-direct {p1, p0}, LEm2$b$a;-><init>(LEm2$b;)V

    iput-object p1, p0, LEm2$b;->p:LEm2$b$a;

    return-void
.end method


# virtual methods
.method public P0(J)LOU3;
    .locals 2

    iget-object v0, p0, LEm2$b;->o:Ll62;

    iget-object v1, p0, LEm2$b;->q:LEm2;

    invoke-static {p0, p1, p2}, LTC2;->B1(LTC2;J)V

    invoke-virtual {v1}, LEm2;->X2()LH83;

    move-result-object v1

    invoke-virtual {v1}, LH83;->d2()LTC2;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p1, p2}, LvO2;->P0(J)LOU3;

    invoke-virtual {v1}, LTC2;->s1()LyO2;

    move-result-object p1

    invoke-interface {p1}, LyO2;->getWidth()I

    move-result p1

    invoke-virtual {v1}, LTC2;->s1()LyO2;

    move-result-object p2

    invoke-interface {p2}, LyO2;->getHeight()I

    move-result p2

    invoke-static {p1, p2}, LH52;->a(II)J

    move-result-wide p1

    invoke-interface {v0, p1, p2}, Ll62;->v(J)V

    iget-object p1, p0, LEm2$b;->p:LEm2$b$a;

    invoke-static {p0, p1}, LTC2;->C1(LTC2;LyO2;)V

    return-object p0
.end method

.method public n1(LL9;)I
    .locals 3

    const-string v0, "alignmentLine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LFm2;->a(LSC2;LL9;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, LTC2;->F1()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v0
.end method

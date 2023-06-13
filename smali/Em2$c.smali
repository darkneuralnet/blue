.class public final LEm2$c;
.super LTC2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEm2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\u000c\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0015"
    }
    d2 = {
        "LEm2$c;",
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
        "height",
        "p0",
        "t0",
        "width",
        "g0",
        "B",
        "LXC2;",
        "scope",
        "<init>",
        "(LEm2;LXC2;)V",
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
        "SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,277:1\n173#2,3:278\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n65#1:278,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic o:LEm2;


# direct methods
.method public constructor <init>(LEm2;LXC2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXC2;",
            ")V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LEm2$c;->o:LEm2;

    invoke-direct {p0, p1, p2}, LTC2;-><init>(LH83;LXC2;)V

    return-void
.end method


# virtual methods
.method public B(I)I
    .locals 2

    iget-object v0, p0, LEm2$c;->o:LEm2;

    invoke-virtual {v0}, LEm2;->W2()LDm2;

    move-result-object v0

    iget-object v1, p0, LEm2$c;->o:LEm2;

    invoke-virtual {v1}, LEm2;->X2()LH83;

    move-result-object v1

    invoke-virtual {v1}, LH83;->d2()LTC2;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LDm2;->d(LZ62;LX62;I)I

    move-result p1

    return p1
.end method

.method public P0(J)LOU3;
    .locals 2

    iget-object v0, p0, LEm2$c;->o:LEm2;

    invoke-static {p0, p1, p2}, LTC2;->B1(LTC2;J)V

    invoke-virtual {v0}, LEm2;->W2()LDm2;

    move-result-object v1

    invoke-virtual {v0}, LEm2;->X2()LH83;

    move-result-object v0

    invoke-virtual {v0}, LH83;->d2()LTC2;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p0, v0, p1, p2}, LDm2;->f(LzO2;LvO2;J)LyO2;

    move-result-object p1

    invoke-static {p0, p1}, LTC2;->C1(LTC2;LyO2;)V

    return-object p0
.end method

.method public g0(I)I
    .locals 2

    iget-object v0, p0, LEm2$c;->o:LEm2;

    invoke-virtual {v0}, LEm2;->W2()LDm2;

    move-result-object v0

    iget-object v1, p0, LEm2$c;->o:LEm2;

    invoke-virtual {v1}, LEm2;->X2()LH83;

    move-result-object v1

    invoke-virtual {v1}, LH83;->d2()LTC2;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LDm2;->e(LZ62;LX62;I)I

    move-result p1

    return p1
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

.method public p0(I)I
    .locals 2

    iget-object v0, p0, LEm2$c;->o:LEm2;

    invoke-virtual {v0}, LEm2;->W2()LDm2;

    move-result-object v0

    iget-object v1, p0, LEm2$c;->o:LEm2;

    invoke-virtual {v1}, LEm2;->X2()LH83;

    move-result-object v1

    invoke-virtual {v1}, LH83;->d2()LTC2;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LDm2;->c(LZ62;LX62;I)I

    move-result p1

    return p1
.end method

.method public t0(I)I
    .locals 2

    iget-object v0, p0, LEm2$c;->o:LEm2;

    invoke-virtual {v0}, LEm2;->W2()LDm2;

    move-result-object v0

    iget-object v1, p0, LEm2$c;->o:LEm2;

    invoke-virtual {v1}, LEm2;->X2()LH83;

    move-result-object v1

    invoke-virtual {v1}, LH83;->d2()LTC2;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LDm2;->i(LZ62;LX62;I)I

    move-result p1

    return p1
.end method

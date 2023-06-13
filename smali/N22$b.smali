.class public final LN22$b;
.super LTC2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN22;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\u000c\u001a\u00020\u000bH\u0014J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "LN22$b;",
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
        "",
        "J1",
        "height",
        "p0",
        "width",
        "g0",
        "t0",
        "B",
        "LXC2;",
        "scope",
        "<init>",
        "(LN22;LXC2;)V",
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
        "SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,223:1\n173#2,2:224\n175#2:238\n163#3:226\n460#4,11:227\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n53#1:224,2\n53#1:238\n55#1:226\n55#1:227,11\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic o:LN22;


# direct methods
.method public constructor <init>(LN22;LXC2;)V
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

    iput-object p1, p0, LN22$b;->o:LN22;

    invoke-direct {p0, p1, p2}, LTC2;-><init>(LH83;LXC2;)V

    return-void
.end method


# virtual methods
.method public B(I)I
    .locals 1

    invoke-virtual {p0}, LTC2;->r1()LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->V()Lf72;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf72;->d(I)I

    move-result p1

    return p1
.end method

.method public J1()V
    .locals 1

    invoke-virtual {p0}, LTC2;->r1()LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->X()LOm2;

    move-result-object v0

    invoke-virtual {v0}, LOm2;->w()LOm2$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, LOm2$a;->x1()V

    invoke-virtual {p0}, LTC2;->D1()LQ9;

    move-result-object v0

    invoke-interface {v0}, LQ9;->S()V

    return-void
.end method

.method public P0(J)LOU3;
    .locals 5

    invoke-static {p0, p1, p2}, LTC2;->B1(LTC2;J)V

    invoke-virtual {p0}, LTC2;->r1()LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->w0()LLX2;

    move-result-object v0

    invoke-virtual {v0}, LLX2;->u()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LJm2;

    sget-object v4, LJm2$g;->d:LJm2$g;

    invoke-virtual {v3, v4}, LJm2;->x1(LJm2$g;)V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    invoke-virtual {p0}, LTC2;->r1()LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->h0()LxO2;

    move-result-object v0

    invoke-virtual {p0}, LTC2;->r1()LJm2;

    move-result-object v1

    invoke-virtual {v1}, LJm2;->J()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1, p2}, LxO2;->a(LzO2;Ljava/util/List;J)LyO2;

    move-result-object p1

    invoke-static {p0, p1}, LTC2;->C1(LTC2;LyO2;)V

    return-object p0
.end method

.method public g0(I)I
    .locals 1

    invoke-virtual {p0}, LTC2;->r1()LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->V()Lf72;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf72;->i(I)I

    move-result p1

    return p1
.end method

.method public n1(LL9;)I
    .locals 3

    const-string v0, "alignmentLine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LTC2;->D1()LQ9;

    move-result-object v0

    invoke-interface {v0}, LQ9;->o()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x80000000

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, LTC2;->F1()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v0
.end method

.method public p0(I)I
    .locals 1

    invoke-virtual {p0}, LTC2;->r1()LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->V()Lf72;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf72;->j(I)I

    move-result p1

    return p1
.end method

.method public t0(I)I
    .locals 1

    invoke-virtual {p0}, LTC2;->r1()LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->V()Lf72;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf72;->e(I)I

    move-result p1

    return p1
.end method

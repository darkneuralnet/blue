.class public final Lf72;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf72$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u0008\u0010\u0011\u001a\u00020\u0002H\u0002R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R/\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0019\u001a\u0004\u0008\u0013\u0010\u001a\"\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lf72;",
        "",
        "LxO2;",
        "measurePolicy",
        "",
        "l",
        "",
        "height",
        "h",
        "width",
        "g",
        "c",
        "b",
        "j",
        "i",
        "e",
        "d",
        "f",
        "LJm2;",
        "a",
        "LJm2;",
        "getLayoutNode",
        "()LJm2;",
        "layoutNode",
        "<set-?>",
        "LEX2;",
        "()LxO2;",
        "k",
        "(LxO2;)V",
        "measurePolicyState",
        "<init>",
        "(LJm2;)V",
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
        "SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n76#2:90\n102#2,2:91\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:90\n30#1:91,2\n*E\n"
    }
.end annotation


# static fields
.field public static final c:Lf72$a;


# instance fields
.field public final a:LJm2;

.field public final b:LEX2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf72$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf72$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf72;->c:Lf72$a;

    return-void
.end method

.method public constructor <init>(LJm2;)V
    .locals 1

    const-string v0, "layoutNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf72;->a:LJm2;

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p1, v0, p1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, Lf72;->b:LEX2;

    return-void
.end method


# virtual methods
.method public final a()LxO2;
    .locals 1

    iget-object v0, p0, Lf72;->b:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LxO2;

    return-object v0
.end method

.method public final b(I)I
    .locals 3

    invoke-virtual {p0}, Lf72;->f()LxO2;

    move-result-object v0

    iget-object v1, p0, Lf72;->a:LJm2;

    invoke-virtual {v1}, LJm2;->n0()LH83;

    move-result-object v1

    iget-object v2, p0, Lf72;->a:LJm2;

    invoke-virtual {v2}, LJm2;->K()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LxO2;->d(LZ62;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final c(I)I
    .locals 3

    invoke-virtual {p0}, Lf72;->f()LxO2;

    move-result-object v0

    iget-object v1, p0, Lf72;->a:LJm2;

    invoke-virtual {v1}, LJm2;->n0()LH83;

    move-result-object v1

    iget-object v2, p0, Lf72;->a:LJm2;

    invoke-virtual {v2}, LJm2;->K()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LxO2;->b(LZ62;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final d(I)I
    .locals 3

    invoke-virtual {p0}, Lf72;->f()LxO2;

    move-result-object v0

    iget-object v1, p0, Lf72;->a:LJm2;

    invoke-virtual {v1}, LJm2;->n0()LH83;

    move-result-object v1

    iget-object v2, p0, Lf72;->a:LJm2;

    invoke-virtual {v2}, LJm2;->J()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LxO2;->d(LZ62;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final e(I)I
    .locals 3

    invoke-virtual {p0}, Lf72;->f()LxO2;

    move-result-object v0

    iget-object v1, p0, Lf72;->a:LJm2;

    invoke-virtual {v1}, LJm2;->n0()LH83;

    move-result-object v1

    iget-object v2, p0, Lf72;->a:LJm2;

    invoke-virtual {v2}, LJm2;->J()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LxO2;->b(LZ62;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final f()LxO2;
    .locals 2

    invoke-virtual {p0}, Lf72;->a()LxO2;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Intrinsic size is queried but there is no measure policy in place."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(I)I
    .locals 3

    invoke-virtual {p0}, Lf72;->f()LxO2;

    move-result-object v0

    iget-object v1, p0, Lf72;->a:LJm2;

    invoke-virtual {v1}, LJm2;->n0()LH83;

    move-result-object v1

    iget-object v2, p0, Lf72;->a:LJm2;

    invoke-virtual {v2}, LJm2;->K()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LxO2;->e(LZ62;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final h(I)I
    .locals 3

    invoke-virtual {p0}, Lf72;->f()LxO2;

    move-result-object v0

    iget-object v1, p0, Lf72;->a:LJm2;

    invoke-virtual {v1}, LJm2;->n0()LH83;

    move-result-object v1

    iget-object v2, p0, Lf72;->a:LJm2;

    invoke-virtual {v2}, LJm2;->K()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LxO2;->c(LZ62;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final i(I)I
    .locals 3

    invoke-virtual {p0}, Lf72;->f()LxO2;

    move-result-object v0

    iget-object v1, p0, Lf72;->a:LJm2;

    invoke-virtual {v1}, LJm2;->n0()LH83;

    move-result-object v1

    iget-object v2, p0, Lf72;->a:LJm2;

    invoke-virtual {v2}, LJm2;->J()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LxO2;->e(LZ62;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final j(I)I
    .locals 3

    invoke-virtual {p0}, Lf72;->f()LxO2;

    move-result-object v0

    iget-object v1, p0, Lf72;->a:LJm2;

    invoke-virtual {v1}, LJm2;->n0()LH83;

    move-result-object v1

    iget-object v2, p0, Lf72;->a:LJm2;

    invoke-virtual {v2}, LJm2;->J()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LxO2;->c(LZ62;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final k(LxO2;)V
    .locals 1

    iget-object v0, p0, Lf72;->b:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final l(LxO2;)V
    .locals 1

    const-string v0, "measurePolicy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lf72;->k(LxO2;)V

    return-void
.end method

.class public final LnE5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lau0;
.implements Ljava/lang/Iterable;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lau0;",
        "Ljava/lang/Iterable<",
        "Lbu0;",
        ">;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010(\n\u0002\u0008 \u0008\u0000\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B\u0007\u00a2\u0006\u0004\u0008D\u0010EJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008J\u000e\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\nJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015JW\u0010!\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00082\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\u00082\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\u0008\u0012\u0004\u0012\u00020\n`\u001fH\u0000\u00a2\u0006\u0004\u0008!\u0010\"JO\u0010#\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00082\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\u00082\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\u0008\u0012\u0004\u0012\u00020\n`\u001fH\u0000\u00a2\u0006\u0004\u0008#\u0010$J\u0006\u0010%\u001a\u00020\u000eJ\u000f\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00030&H\u0096\u0002R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00178\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\r\u0010)\u001a\u0004\u0008*\u0010+R$\u0010\u0019\u001a\u00020\u00082\u0006\u0010(\u001a\u00020\u00088\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010,\u001a\u0004\u0008-\u0010.R4\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R$\u0010\u001d\u001a\u00020\u00082\u0006\u0010(\u001a\u00020\u00088\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008!\u0010,\u001a\u0004\u00083\u0010.R\u0016\u00104\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010,R$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108R\"\u0010=\u001a\u00020\u00088\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00089\u0010,\u001a\u0004\u0008:\u0010.\"\u0004\u0008;\u0010<R2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\u0008\u0012\u0004\u0012\u00020\n`\u001f8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008>\u0010?\u001a\u0004\u00089\u0010@\"\u0004\u0008A\u0010BR\u0014\u0010C\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008C\u00108\u00a8\u0006F"
    }
    d2 = {
        "LnE5;",
        "Lau0;",
        "",
        "Lbu0;",
        "LmE5;",
        "y",
        "LqE5;",
        "z",
        "",
        "index",
        "Ldb;",
        "a",
        "anchor",
        "b",
        "",
        "A",
        "groupIndex",
        "x",
        "reader",
        "",
        "c",
        "(LmE5;)V",
        "writer",
        "",
        "groups",
        "groupsSize",
        "",
        "",
        "slots",
        "slotsSize",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "anchors",
        "e",
        "(LqE5;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V",
        "C",
        "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V",
        "f",
        "",
        "iterator",
        "<set-?>",
        "[I",
        "j",
        "()[I",
        "I",
        "o",
        "()I",
        "d",
        "[Ljava/lang/Object;",
        "s",
        "()[Ljava/lang/Object;",
        "u",
        "readers",
        "g",
        "Z",
        "w",
        "()Z",
        "h",
        "v",
        "setVersion$runtime_release",
        "(I)V",
        "version",
        "i",
        "Ljava/util/ArrayList;",
        "()Ljava/util/ArrayList;",
        "setAnchors$runtime_release",
        "(Ljava/util/ArrayList;)V",
        "isEmpty",
        "<init>",
        "()V",
        "runtime_release"
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
        "SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3443:1\n146#1,8:3486\n162#1,4:3494\n167#1,3:3504\n4513#2,5:3444\n4513#2,5:3449\n4513#2,5:3454\n4513#2,5:3466\n4513#2,5:3471\n4513#2,5:3476\n4513#2,5:3481\n1#3:3459\n3323#4,6:3460\n33#5,6:3498\n33#5,6:3507\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n310#1:3486,8\n338#1:3494,4\n338#1:3504,3\n190#1:3444,5\n191#1:3449,5\n207#1:3454,5\n221#1:3466,5\n241#1:3471,5\n242#1:3476,5\n251#1:3481,5\n209#1:3460,6\n340#1:3498,6\n477#1:3507,6\n*E\n"
    }
.end annotation


# instance fields
.field public b:[I

.field public c:I

.field public d:[Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:Z

.field public h:I

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [I

    iput-object v1, p0, LnE5;->b:[I

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, LnE5;->d:[Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LnE5;->i:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final A(Ldb;)Z
    .locals 4

    const-string v0, "anchor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ldb;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LnE5;->i:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ldb;->a()I

    move-result v2

    iget v3, p0, LnE5;->c:I

    invoke-static {v0, v2, v3}, LpE5;->s(Ljava/util/ArrayList;II)I

    move-result v0

    const/4 v2, 0x1

    if-ltz v0, :cond_0

    iget-object v3, p0, LnE5;->i:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_1

    move v1, v2

    :cond_1
    return v1
.end method

.method public final C([II[Ljava/lang/Object;ILjava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([II[",
            "Ljava/lang/Object;",
            "I",
            "Ljava/util/ArrayList<",
            "Ldb;",
            ">;)V"
        }
    .end annotation

    const-string v0, "groups"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "slots"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anchors"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LnE5;->b:[I

    iput p2, p0, LnE5;->c:I

    iput-object p3, p0, LnE5;->d:[Ljava/lang/Object;

    iput p4, p0, LnE5;->e:I

    iput-object p5, p0, LnE5;->i:Ljava/util/ArrayList;

    return-void
.end method

.method public final a(I)Ldb;
    .locals 4

    iget-boolean v0, p0, LnE5;->g:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    if-ltz p1, :cond_0

    iget v2, p0, LnE5;->c:I

    if-ge p1, v2, :cond_0

    move v0, v1

    :cond_0
    if-eqz v0, :cond_2

    iget-object v0, p0, LnE5;->i:Ljava/util/ArrayList;

    iget v2, p0, LnE5;->c:I

    invoke-static {v0, p1, v2}, LpE5;->s(Ljava/util/ArrayList;II)I

    move-result v2

    if-gez v2, :cond_1

    new-instance v3, Ldb;

    invoke-direct {v3, p1}, Ldb;-><init>(I)V

    add-int/2addr v2, v1

    neg-int p1, v2

    invoke-virtual {v0, p1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(location)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    check-cast v3, Ldb;

    :goto_0
    return-object v3

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Parameter index is out of range"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const-string p1, "use active SlotWriter to create an anchor location instead "

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LQt0;->x(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final b(Ldb;)I
    .locals 1

    const-string v0, "anchor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LnE5;->g:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ldb;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ldb;->a()I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Anchor refers to a group that was removed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string p1, "Use active SlotWriter to determine anchor location instead"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LQt0;->x(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final c(LmE5;)V
    .locals 1

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LmE5;->w()LnE5;

    move-result-object p1

    if-ne p1, p0, :cond_0

    iget p1, p0, LnE5;->f:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget p1, p0, LnE5;->f:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LnE5;->f:I

    return-void

    :cond_1
    const-string p1, "Unexpected reader close()"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LQt0;->x(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final e(LqE5;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LqE5;",
            "[II[",
            "Ljava/lang/Object;",
            "I",
            "Ljava/util/ArrayList<",
            "Ldb;",
            ">;)V"
        }
    .end annotation

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groups"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "slots"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anchors"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LqE5;->X()LnE5;

    move-result-object p1

    const/4 v0, 0x0

    if-ne p1, p0, :cond_0

    iget-boolean p1, p0, LnE5;->g:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_1

    iput-boolean v0, p0, LnE5;->g:Z

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, LnE5;->C([II[Ljava/lang/Object;ILjava/util/ArrayList;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unexpected writer close()"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()Z
    .locals 2

    iget v0, p0, LnE5;->c:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    iget-object v0, p0, LnE5;->b:[I

    invoke-static {v0, v1}, LpE5;->c([II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final h()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldb;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LnE5;->i:Ljava/util/ArrayList;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    iget v0, p0, LnE5;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lbu0;",
            ">;"
        }
    .end annotation

    new-instance v0, LiE1;

    const/4 v1, 0x0

    iget v2, p0, LnE5;->c:I

    invoke-direct {v0, p0, v1, v2}, LiE1;-><init>(LnE5;II)V

    return-object v0
.end method

.method public final j()[I
    .locals 1

    iget-object v0, p0, LnE5;->b:[I

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, LnE5;->c:I

    return v0
.end method

.method public final s()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LnE5;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public final u()I
    .locals 1

    iget v0, p0, LnE5;->e:I

    return v0
.end method

.method public final v()I
    .locals 1

    iget v0, p0, LnE5;->h:I

    return v0
.end method

.method public final w()Z
    .locals 1

    iget-boolean v0, p0, LnE5;->g:Z

    return v0
.end method

.method public final x(ILdb;)Z
    .locals 3

    const-string v0, "anchor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LnE5;->g:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    if-ltz p1, :cond_0

    iget v2, p0, LnE5;->c:I

    if-ge p1, v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz v2, :cond_3

    invoke-virtual {p0, p2}, LnE5;->A(Ldb;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, LnE5;->b:[I

    invoke-static {v2, p1}, LpE5;->g([II)I

    move-result v2

    add-int/2addr v2, p1

    invoke-virtual {p2}, Ldb;->a()I

    move-result p2

    if-gt p1, p2, :cond_1

    if-ge p2, v2, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v1, v0

    :goto_2
    return v1

    :cond_3
    const-string p1, "Invalid group index"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LQt0;->x(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_4
    const-string p1, "Writer is active"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LQt0;->x(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final y()LmE5;
    .locals 2

    iget-boolean v0, p0, LnE5;->g:Z

    if-nez v0, :cond_0

    iget v0, p0, LnE5;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LnE5;->f:I

    new-instance v0, LmE5;

    invoke-direct {v0, p0}, LmE5;-><init>(LnE5;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read while a writer is pending"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final z()LqE5;
    .locals 2

    iget-boolean v0, p0, LnE5;->g:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    iget v0, p0, LnE5;->f:I

    if-gtz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iput-boolean v1, p0, LnE5;->g:Z

    iget v0, p0, LnE5;->h:I

    add-int/2addr v0, v1

    iput v0, p0, LnE5;->h:I

    new-instance v0, LqE5;

    invoke-direct {v0, p0}, LqE5;-><init>(LnE5;)V

    return-object v0

    :cond_1
    const-string v0, "Cannot start a writer when a reader is pending"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LQt0;->x(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_2
    const-string v0, "Cannot start a writer when another writer is pending"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LQt0;->x(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

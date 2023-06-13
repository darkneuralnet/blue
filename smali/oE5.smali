.class public final LoE5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbu0;
.implements Ljava/lang/Iterable;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbu0;",
        "Ljava/lang/Iterable<",
        "Lbu0;",
        ">;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u000c\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003H\u0096\u0002J\u0008\u0010\u0006\u001a\u00020\u0005H\u0002R\u0017\u0010\u000c\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000f\u001a\u0004\u0008\u0014\u0010\u0011\u00a8\u0006\u0018"
    }
    d2 = {
        "LoE5;",
        "Lbu0;",
        "",
        "",
        "iterator",
        "",
        "a",
        "LnE5;",
        "b",
        "LnE5;",
        "getTable",
        "()LnE5;",
        "table",
        "",
        "c",
        "I",
        "getGroup",
        "()I",
        "group",
        "d",
        "getVersion",
        "version",
        "<init>",
        "(LnE5;II)V",
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
        "SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,3443:1\n146#2,8:3444\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3016#1:3444,8\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LnE5;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(LnE5;II)V
    .locals 1

    const-string v0, "table"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoE5;->b:LnE5;

    iput p2, p0, LoE5;->c:I

    iput p3, p0, LoE5;->d:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LoE5;->b:LnE5;

    invoke-virtual {v0}, LnE5;->v()I

    move-result v0

    iget v1, p0, LoE5;->d:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lbu0;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LoE5;->a()V

    new-instance v0, LiE1;

    iget-object v1, p0, LoE5;->b:LnE5;

    iget v2, p0, LoE5;->c:I

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {v1}, LnE5;->j()[I

    move-result-object v4

    iget v5, p0, LoE5;->c:I

    invoke-static {v4, v5}, LpE5;->g([II)I

    move-result v4

    add-int/2addr v2, v4

    invoke-direct {v0, v1, v3, v2}, LiE1;-><init>(LnE5;II)V

    return-object v0
.end method

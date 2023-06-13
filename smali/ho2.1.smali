.class public final Lho2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lho2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\rR\u0011\u0010\u0003\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lho2;",
        "",
        "",
        "start",
        "end",
        "Lho2$a;",
        "a",
        "interval",
        "",
        "e",
        "",
        "d",
        "LLX2;",
        "LLX2;",
        "beyondBoundsItems",
        "c",
        "()I",
        "b",
        "<init>",
        "()V",
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
        "SMAP\nLazyListBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,126:1\n1182#2:127\n1161#2,2:128\n460#3,11:130\n460#3,11:141\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:141,11\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LLX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLX2<",
            "Lho2$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LLX2;

    const/16 v1, 0x10

    new-array v1, v1, [Lho2$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LLX2;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, Lho2;->a:LLX2;

    return-void
.end method


# virtual methods
.method public final a(II)Lho2$a;
    .locals 1

    new-instance v0, Lho2$a;

    invoke-direct {v0, p1, p2}, Lho2$a;-><init>(II)V

    iget-object p1, p0, Lho2;->a:LLX2;

    invoke-virtual {p1, v0}, LLX2;->b(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final b()I
    .locals 6

    iget-object v0, p0, Lho2;->a:LLX2;

    invoke-virtual {v0}, LLX2;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lho2$a;

    invoke-virtual {v0}, Lho2$a;->a()I

    move-result v0

    iget-object v1, p0, Lho2;->a:LLX2;

    invoke-virtual {v1}, LLX2;->u()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v1}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, Lho2$a;

    invoke-virtual {v4}, Lho2$a;->a()I

    move-result v5

    if-le v5, v0, :cond_1

    invoke-virtual {v4}, Lho2$a;->a()I

    move-result v0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    return v0
.end method

.method public final c()I
    .locals 7

    iget-object v0, p0, Lho2;->a:LLX2;

    invoke-virtual {v0}, LLX2;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lho2$a;

    invoke-virtual {v0}, Lho2$a;->b()I

    move-result v0

    iget-object v1, p0, Lho2;->a:LLX2;

    invoke-virtual {v1}, LLX2;->u()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_2

    invoke-virtual {v1}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v1

    move v4, v3

    :cond_0
    aget-object v5, v1, v4

    check-cast v5, Lho2$a;

    invoke-virtual {v5}, Lho2$a;->b()I

    move-result v6

    if-ge v6, v0, :cond_1

    invoke-virtual {v5}, Lho2$a;->b()I

    move-result v0

    :cond_1
    add-int/lit8 v4, v4, 0x1

    if-lt v4, v2, :cond_0

    :cond_2
    if-ltz v0, :cond_3

    const/4 v3, 0x1

    :cond_3
    if-eqz v3, :cond_4

    return v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lho2;->a:LLX2;

    invoke-virtual {v0}, LLX2;->x()Z

    move-result v0

    return v0
.end method

.method public final e(Lho2$a;)V
    .locals 1

    const-string v0, "interval"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lho2;->a:LLX2;

    invoke-virtual {v0, p1}, LLX2;->A(Ljava/lang/Object;)Z

    return-void
.end method

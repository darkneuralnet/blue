.class public final LVc5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u0015\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0004\u001a\u0004\u0008\u0008\u0010\u0006R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0004\u001a\u0004\u0008\u000b\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0004\u001a\u0004\u0008\n\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0011\u001a\u0004\u0008\r\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "LVc5;",
        "",
        "",
        "a",
        "I",
        "b",
        "()I",
        "crossAxisSize",
        "e",
        "mainAxisSize",
        "c",
        "f",
        "startIndex",
        "d",
        "endIndex",
        "beforeCrossAxisAlignmentLine",
        "",
        "[I",
        "()[I",
        "mainAxisPositions",
        "<init>",
        "(IIIII[I)V",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:[I


# direct methods
.method public constructor <init>(IIIII[I)V
    .locals 1

    const-string v0, "mainAxisPositions"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LVc5;->a:I

    iput p2, p0, LVc5;->b:I

    iput p3, p0, LVc5;->c:I

    iput p4, p0, LVc5;->d:I

    iput p5, p0, LVc5;->e:I

    iput-object p6, p0, LVc5;->f:[I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LVc5;->e:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LVc5;->a:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LVc5;->d:I

    return v0
.end method

.method public final d()[I
    .locals 1

    iget-object v0, p0, LVc5;->f:[I

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LVc5;->b:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, LVc5;->c:I

    return v0
.end method

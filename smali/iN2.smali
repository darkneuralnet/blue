.class public final LiN2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "LiN2;",
        "",
        "",
        "row",
        "col",
        "",
        "a",
        "value",
        "",
        "c",
        "LRj6;",
        "b",
        "",
        "[LRj6;",
        "elements",
        "rows",
        "cols",
        "<init>",
        "(II)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:[LRj6;


# direct methods
.method public constructor <init>(II)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array v0, p1, [LRj6;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    new-instance v2, LRj6;

    invoke-direct {v2, p2}, LRj6;-><init>(I)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, LiN2;->a:[LRj6;

    return-void
.end method


# virtual methods
.method public final a(II)F
    .locals 1

    iget-object v0, p0, LiN2;->a:[LRj6;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2}, LRj6;->a(I)F

    move-result p1

    return p1
.end method

.method public final b(I)LRj6;
    .locals 1

    iget-object v0, p0, LiN2;->a:[LRj6;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final c(IIF)V
    .locals 1

    iget-object v0, p0, LiN2;->a:[LRj6;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2, p3}, LRj6;->c(IF)V

    return-void
.end method

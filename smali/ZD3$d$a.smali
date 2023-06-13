.class public final LZD3$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZD3$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZD3$d$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0008\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\t\u00a8\u0006\u0014"
    }
    d2 = {
        "LZD3$d$a;",
        "",
        "",
        "pageSize",
        "c",
        "initialLoadSizeHint",
        "b",
        "LZD3$d;",
        "a",
        "I",
        "prefetchDistance",
        "",
        "d",
        "Z",
        "enablePlaceholders",
        "e",
        "maxSize",
        "<init>",
        "()V",
        "f",
        "paging-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final f:LZD3$d$a$a;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Z

.field public e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LZD3$d$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZD3$d$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LZD3$d$a;->f:LZD3$d$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LZD3$d$a;->a:I

    iput v0, p0, LZD3$d$a;->b:I

    iput v0, p0, LZD3$d$a;->c:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LZD3$d$a;->d:Z

    const v0, 0x7fffffff

    iput v0, p0, LZD3$d$a;->e:I

    return-void
.end method


# virtual methods
.method public final a()LZD3$d;
    .locals 8

    iget v0, p0, LZD3$d$a;->b:I

    if-gez v0, :cond_0

    iget v0, p0, LZD3$d$a;->a:I

    iput v0, p0, LZD3$d$a;->b:I

    :cond_0
    iget v0, p0, LZD3$d$a;->c:I

    if-gez v0, :cond_1

    iget v0, p0, LZD3$d$a;->a:I

    mul-int/lit8 v0, v0, 0x3

    iput v0, p0, LZD3$d$a;->c:I

    :cond_1
    iget-boolean v0, p0, LZD3$d$a;->d:Z

    if-nez v0, :cond_3

    iget v0, p0, LZD3$d$a;->b:I

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget v0, p0, LZD3$d$a;->e:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_5

    iget v1, p0, LZD3$d$a;->a:I

    iget v2, p0, LZD3$d$a;->b:I

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    if-lt v0, v1, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Maximum size must be at least pageSize + 2*prefetchDist, pageSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LZD3$d$a;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", prefetchDist="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LZD3$d$a;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", maxSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LZD3$d$a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_1
    new-instance v0, LZD3$d;

    iget v3, p0, LZD3$d$a;->a:I

    iget v4, p0, LZD3$d$a;->b:I

    iget-boolean v5, p0, LZD3$d$a;->d:Z

    iget v6, p0, LZD3$d$a;->c:I

    iget v7, p0, LZD3$d$a;->e:I

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, LZD3$d;-><init>(IIZII)V

    return-object v0
.end method

.method public final b(I)LZD3$d$a;
    .locals 0

    iput p1, p0, LZD3$d$a;->c:I

    return-object p0
.end method

.method public final c(I)LZD3$d$a;
    .locals 1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    iput p1, p0, LZD3$d$a;->a:I

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Page size must be a positive number"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

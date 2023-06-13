.class public abstract LHP5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H&J\u0008\u0010\u0005\u001a\u00020\u0000H&R\"\u0010\u000c\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "LHP5;",
        "",
        "value",
        "",
        "a",
        "b",
        "",
        "I",
        "d",
        "()I",
        "f",
        "(I)V",
        "snapshotId",
        "LHP5;",
        "c",
        "()LHP5;",
        "e",
        "(LHP5;)V",
        "next",
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


# instance fields
.field public a:I

.field public b:LHP5;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LxM5;->D()LsM5;

    move-result-object v0

    invoke-virtual {v0}, LsM5;->f()I

    move-result v0

    iput v0, p0, LHP5;->a:I

    return-void
.end method


# virtual methods
.method public abstract a(LHP5;)V
.end method

.method public abstract b()LHP5;
.end method

.method public final c()LHP5;
    .locals 1

    iget-object v0, p0, LHP5;->b:LHP5;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LHP5;->a:I

    return v0
.end method

.method public final e(LHP5;)V
    .locals 0

    iput-object p1, p0, LHP5;->b:LHP5;

    return-void
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, LHP5;->a:I

    return-void
.end method

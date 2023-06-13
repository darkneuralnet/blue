.class public final Lvc2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0006\"\u0004\u0008\n\u0010\u0008R+\u0010\u0012\u001a\u00020\u000c8\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\r\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u001b"
    }
    d2 = {
        "Lvc2;",
        "",
        "",
        "a",
        "I",
        "b",
        "()I",
        "f",
        "(I)V",
        "crossAxisSize",
        "e",
        "crossAxisOffset",
        "LA52;",
        "c",
        "J",
        "()J",
        "g",
        "(J)V",
        "notAnimatableDelta",
        "",
        "LPU3;",
        "d",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "placeables",
        "<init>",
        "(II)V",
        "foundation_release"
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

.field public b:I

.field public c:J

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LPU3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lvc2;->a:I

    iput p2, p0, Lvc2;->b:I

    sget-object p1, LA52;->b:LA52$a;

    invoke-virtual {p1}, LA52$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lvc2;->c:J

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lvc2;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lvc2;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lvc2;->a:I

    return v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lvc2;->c:J

    return-wide v0
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LPU3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvc2;->d:Ljava/util/List;

    return-object v0
.end method

.method public final e(I)V
    .locals 0

    iput p1, p0, Lvc2;->b:I

    return-void
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, Lvc2;->a:I

    return-void
.end method

.method public final g(J)V
    .locals 0

    iput-wide p1, p0, Lvc2;->c:J

    return-void
.end method

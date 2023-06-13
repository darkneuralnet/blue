.class public final LUe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTe;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0008\u0000\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\tR(\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0000X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u0004\u0010\u000f\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0012"
    }
    d2 = {
        "LUe;",
        "LTe;",
        "LF96;",
        "LXe1;",
        "a",
        "LF96;",
        "getTransition",
        "()LF96;",
        "setTransition",
        "(LF96;)V",
        "transition",
        "LEX2;",
        "LG52;",
        "b",
        "LEX2;",
        "()LEX2;",
        "targetSize",
        "<init>",
        "animation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:LF96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF96<",
            "LXe1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LG52;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LF96;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96<",
            "LXe1;",
            ">;)V"
        }
    .end annotation

    const-string v0, "transition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUe;->a:LF96;

    sget-object p1, LG52;->b:LG52$a;

    invoke-virtual {p1}, LG52$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LG52;->b(J)LG52;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, LUe;->b:LEX2;

    return-void
.end method


# virtual methods
.method public final a()LEX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEX2<",
            "LG52;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LUe;->b:LEX2;

    return-object v0
.end method

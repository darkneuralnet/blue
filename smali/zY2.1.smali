.class public final LzY2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0005R\u001c\u0010\n\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR,\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\u0008\u00030\u00078F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u0008\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "LzY2;",
        "",
        "LyY2;",
        "a",
        "LyY2$a;",
        "LyY2$a;",
        "builder",
        "LWY2;",
        "b",
        "LWY2;",
        "_type",
        "value",
        "getType",
        "()LWY2;",
        "(LWY2;)V",
        "type",
        "<init>",
        "()V",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final a:LyY2$a;

.field public b:LWY2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWY2<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LyY2$a;

    invoke-direct {v0}, LyY2$a;-><init>()V

    iput-object v0, p0, LzY2;->a:LyY2$a;

    return-void
.end method


# virtual methods
.method public final a()LyY2;
    .locals 1

    iget-object v0, p0, LzY2;->a:LyY2$a;

    invoke-virtual {v0}, LyY2$a;->a()LyY2;

    move-result-object v0

    return-object v0
.end method

.method public final b(LWY2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWY2<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LzY2;->b:LWY2;

    iget-object v0, p0, LzY2;->a:LyY2$a;

    invoke-virtual {v0, p1}, LyY2$a;->b(LWY2;)LyY2$a;

    return-void
.end method

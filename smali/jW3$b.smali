.class public final LjW3$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LfW3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LjW3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "LjW3$b;",
        "LfW3;",
        "",
        "b",
        "a",
        "LhW3;",
        "LhW3;",
        "plugin",
        "<init>",
        "(LjW3;LhW3;)V",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LhW3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhW3<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic b:LjW3;


# direct methods
.method public constructor <init>(LjW3;LhW3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhW3<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "plugin"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LjW3$b;->b:LjW3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LjW3$b;->a:LhW3;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LjW3$b;->b:LjW3;

    invoke-static {v0}, LjW3;->a(LjW3;)LhW3;

    move-result-object v0

    iget-object v1, p0, LjW3$b;->a:LhW3;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LjW3$b;->b:LjW3;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LjW3;->c(LjW3;LhW3;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, LjW3$b;->b:LjW3;

    iget-object v1, p0, LjW3$b;->a:LhW3;

    invoke-static {v0, v1}, LjW3;->c(LjW3;LhW3;)V

    return-void
.end method

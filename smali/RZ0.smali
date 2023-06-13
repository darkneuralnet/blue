.class public final LRZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnN5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "LRZ0;",
        "LnN5;",
        "",
        "a",
        "b",
        "LU16;",
        "LU16;",
        "getTextInputService",
        "()LU16;",
        "textInputService",
        "<init>",
        "(LU16;)V",
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
.field public final a:LU16;


# direct methods
.method public constructor <init>(LU16;)V
    .locals 1

    const-string v0, "textInputService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRZ0;->a:LU16;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LRZ0;->a:LU16;

    invoke-virtual {v0}, LU16;->c()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LRZ0;->a:LU16;

    invoke-virtual {v0}, LU16;->b()V

    return-void
.end method

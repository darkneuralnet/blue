.class public final Lmd3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lmd3;",
        "",
        "Landroidx/recyclerview/widget/h$e;",
        "a",
        "Landroidx/recyclerview/widget/h$e;",
        "()Landroidx/recyclerview/widget/h$e;",
        "diff",
        "",
        "b",
        "Z",
        "()Z",
        "hasOverlap",
        "<init>",
        "(Landroidx/recyclerview/widget/h$e;Z)V",
        "paging-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:Landroidx/recyclerview/widget/h$e;

.field public final b:Z


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/h$e;Z)V
    .locals 1

    const-string v0, "diff"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd3;->a:Landroidx/recyclerview/widget/h$e;

    iput-boolean p2, p0, Lmd3;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Landroidx/recyclerview/widget/h$e;
    .locals 1

    iget-object v0, p0, Lmd3;->a:Landroidx/recyclerview/widget/h$e;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lmd3;->b:Z

    return v0
.end method

.class public final Lo4$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld13$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\t\u001a\u0004\u0008\u0003\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lo4$c;",
        "Ld13$a;",
        "",
        "a",
        "I",
        "b",
        "()I",
        "flags",
        "LE4;",
        "LE4;",
        "()LE4;",
        "activityOptions",
        "navigation-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:LE4;


# virtual methods
.method public final a()LE4;
    .locals 1

    iget-object v0, p0, Lo4$c;->b:LE4;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lo4$c;->a:I

    return v0
.end method

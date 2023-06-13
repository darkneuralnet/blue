.class public final synthetic LJW1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJW1;->b:Ljava/util/List;

    iput p2, p0, LJW1;->c:I

    iput-boolean p3, p0, LJW1;->d:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LJW1;->b:Ljava/util/List;

    iget v1, p0, LJW1;->c:I

    iget-boolean v2, p0, LJW1;->d:Z

    invoke-static {v0, v1, v2}, LKW1;->a(Ljava/util/List;IZ)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

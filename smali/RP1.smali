.class public final synthetic LRP1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LSP1;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LSP1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRP1;->b:LSP1;

    iput p2, p0, LRP1;->c:I

    iput p3, p0, LRP1;->d:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LRP1;->b:LSP1;

    iget v1, p0, LRP1;->c:I

    iget v2, p0, LRP1;->d:I

    invoke-static {v0, v1, v2}, LSP1;->a(LSP1;II)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

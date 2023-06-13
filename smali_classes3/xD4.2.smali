.class public final synthetic LxD4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LzD4;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LzD4;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxD4;->b:LzD4;

    iput p2, p0, LxD4;->c:I

    iput-object p3, p0, LxD4;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LxD4;->b:LzD4;

    iget v1, p0, LxD4;->c:I

    iget-object v2, p0, LxD4;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, LzD4;->n(LzD4;ILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

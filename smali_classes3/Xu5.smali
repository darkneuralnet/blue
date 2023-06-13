.class public final synthetic LXu5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LZu5;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LZu5;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXu5;->b:LZu5;

    iput-object p2, p0, LXu5;->c:Ljava/lang/String;

    iput p3, p0, LXu5;->d:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LXu5;->b:LZu5;

    iget-object v1, p0, LXu5;->c:Ljava/lang/String;

    iget v2, p0, LXu5;->d:I

    invoke-static {v0, v1, v2}, LZu5;->n(LZu5;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

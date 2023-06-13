.class public final synthetic LyD4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LzD4;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LzD4;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyD4;->b:LzD4;

    iput-object p2, p0, LyD4;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LyD4;->b:LzD4;

    iget-object v1, p0, LyD4;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LzD4;->m(LzD4;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

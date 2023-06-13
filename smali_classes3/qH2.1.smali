.class public final synthetic LqH2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LrH2;

.field public final synthetic c:LvH2;


# direct methods
.method public synthetic constructor <init>(LrH2;LvH2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqH2;->b:LrH2;

    iput-object p2, p0, LqH2;->c:LvH2;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LqH2;->b:LrH2;

    iget-object v1, p0, LqH2;->c:LvH2;

    invoke-static {v0, v1}, LrH2;->r(LrH2;LvH2;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

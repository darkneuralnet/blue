.class public final synthetic LW65;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LX65;

.field public final synthetic c:La75;


# direct methods
.method public synthetic constructor <init>(LX65;La75;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW65;->b:LX65;

    iput-object p2, p0, LW65;->c:La75;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LW65;->b:LX65;

    iget-object v1, p0, LW65;->c:La75;

    invoke-static {v0, v1}, LX65;->r(LX65;La75;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

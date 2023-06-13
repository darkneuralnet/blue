.class public final synthetic LUB5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LVB5;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;LVB5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUB5;->b:Ljava/util/List;

    iput-object p2, p0, LUB5;->c:LVB5;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LUB5;->b:Ljava/util/List;

    iget-object v1, p0, LUB5;->c:LVB5;

    invoke-static {v0, v1}, LVB5;->a(Ljava/util/List;LVB5;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.class public final synthetic LKX4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LLX4;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(LLX4;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKX4;->b:LLX4;

    iput-object p2, p0, LKX4;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LKX4;->b:LLX4;

    iget-object v1, p0, LKX4;->c:Ljava/util/List;

    invoke-static {v0, v1}, LLX4$a;->a(LLX4;Ljava/util/List;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method

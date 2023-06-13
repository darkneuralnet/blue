.class public final synthetic LlD1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LrD1;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LrD1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlD1;->b:LrD1;

    iput-object p2, p0, LlD1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LlD1;->b:LrD1;

    iget-object v1, p0, LlD1;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LrD1;->m(LrD1;Ljava/lang/String;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method

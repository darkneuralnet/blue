.class public final synthetic LXV0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LWV0;

.field public final synthetic c:LWV0$b;


# direct methods
.method public synthetic constructor <init>(LWV0;LWV0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXV0;->b:LWV0;

    iput-object p2, p0, LXV0;->c:LWV0$b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LXV0;->b:LWV0;

    iget-object v1, p0, LXV0;->c:LWV0$b;

    invoke-static {v0, v1}, LWV0$b;->b(LWV0;LWV0$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

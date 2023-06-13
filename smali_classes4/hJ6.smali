.class public final synthetic LhJ6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LgJ6;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(LgJ6;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LhJ6;->b:LgJ6;

    iput-object p2, p0, LhJ6;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LhJ6;->b:LgJ6;

    iget-object v1, p0, LhJ6;->c:Ljava/util/List;

    invoke-static {v0, v1}, LgJ6$f;->a(LgJ6;Ljava/util/List;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

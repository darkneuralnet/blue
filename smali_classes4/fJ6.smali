.class public final synthetic LfJ6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LgJ6;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(LgJ6;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfJ6;->b:LgJ6;

    iput-object p2, p0, LfJ6;->c:Ljava/util/List;

    iput-object p3, p0, LfJ6;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LfJ6;->b:LgJ6;

    iget-object v1, p0, LfJ6;->c:Ljava/util/List;

    iget-object v2, p0, LfJ6;->d:Ljava/util/List;

    invoke-static {v0, v1, v2}, LgJ6$a;->a(LgJ6;Ljava/util/List;Ljava/util/List;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

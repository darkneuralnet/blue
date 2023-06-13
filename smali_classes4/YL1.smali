.class public final synthetic LYL1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/api/response/HibernationStatusResponse;

.field public final synthetic c:LZL1;


# direct methods
.method public synthetic constructor <init>(Lco/bird/api/response/HibernationStatusResponse;LZL1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYL1;->b:Lco/bird/api/response/HibernationStatusResponse;

    iput-object p2, p0, LYL1;->c:LZL1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LYL1;->b:Lco/bird/api/response/HibernationStatusResponse;

    iget-object v1, p0, LYL1;->c:LZL1;

    invoke-static {v0, v1}, LZL1$a;->a(Lco/bird/api/response/HibernationStatusResponse;LZL1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

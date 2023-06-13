.class public final synthetic LaM1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/api/response/HibernationResultResponse;

.field public final synthetic c:LZL1;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lco/bird/api/response/HibernationResultResponse;LZL1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LaM1;->b:Lco/bird/api/response/HibernationResultResponse;

    iput-object p2, p0, LaM1;->c:LZL1;

    iput-object p3, p0, LaM1;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LaM1;->b:Lco/bird/api/response/HibernationResultResponse;

    iget-object v1, p0, LaM1;->c:LZL1;

    iget-object v2, p0, LaM1;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, LZL1$b;->a(Lco/bird/api/response/HibernationResultResponse;LZL1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

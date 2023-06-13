.class public final synthetic LtR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LuR;

.field public final synthetic c:Lco/bird/api/response/BirdPlusViewResponse;


# direct methods
.method public synthetic constructor <init>(LuR;Lco/bird/api/response/BirdPlusViewResponse;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtR;->b:LuR;

    iput-object p2, p0, LtR;->c:Lco/bird/api/response/BirdPlusViewResponse;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LtR;->b:LuR;

    iget-object v1, p0, LtR;->c:Lco/bird/api/response/BirdPlusViewResponse;

    invoke-static {v0, v1}, LuR$a;->a(LuR;Lco/bird/api/response/BirdPlusViewResponse;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method

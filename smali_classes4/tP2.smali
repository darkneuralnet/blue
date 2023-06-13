.class public final synthetic LtP2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lokhttp3/ResponseBody;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lokhttp3/ResponseBody;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtP2;->b:Ljava/lang/String;

    iput-object p2, p0, LtP2;->c:Lokhttp3/ResponseBody;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LtP2;->b:Ljava/lang/String;

    iget-object v1, p0, LtP2;->c:Lokhttp3/ResponseBody;

    invoke-static {v0, v1}, LwP2;->c(Ljava/lang/String;Lokhttp3/ResponseBody;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

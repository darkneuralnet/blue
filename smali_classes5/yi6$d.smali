.class public final Lyi6$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyi6;->y(Ljava/lang/String;Lyi6$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LWD1;",
        "response",
        "",
        "a",
        "(LWD1;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lyi6$a;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lyi6$a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lyi6$d;->a:Lyi6$a;

    iput-object p2, p0, Lyi6$d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWD1;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LWD1;->b()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lyi6$d;->a:Lyi6$a;

    invoke-virtual {p1}, LWD1;->b()Lcom/facebook/FacebookRequestError;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/FacebookRequestError;->e()Lcom/facebook/FacebookException;

    move-result-object p1

    invoke-interface {v0, p1}, Lyi6$a;->b(Lcom/facebook/FacebookException;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lyi6$d;->b:Ljava/lang/String;

    invoke-virtual {p1}, LWD1;->d()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0, v1}, Lt74;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    iget-object v0, p0, Lyi6$d;->a:Lyi6$a;

    invoke-virtual {p1}, LWD1;->d()Lorg/json/JSONObject;

    move-result-object p1

    invoke-interface {v0, p1}, Lyi6$a;->a(Lorg/json/JSONObject;)V

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.class final Lbo/app/u$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbo/app/u;->a(Lorg/json/JSONArray;Lcom/appboy/enums/CardKey$Provider;Lbo/app/y1;LkO1;Lbo/app/a2;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Object;",
        "Lcom/appboy/models/cards/Card;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Lcom/appboy/models/cards/Card;",
        "a",
        "(Ljava/lang/Object;)Lcom/appboy/models/cards/Card;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/appboy/enums/CardKey$Provider;

.field final synthetic c:Lbo/app/y1;

.field final synthetic d:LkO1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LkO1<",
            "*>;"
        }
    .end annotation
.end field

.field final synthetic e:Lbo/app/a2;

.field final synthetic f:Lorg/json/JSONArray;


# direct methods
.method public constructor <init>(Lcom/appboy/enums/CardKey$Provider;Lbo/app/y1;LkO1;Lbo/app/a2;Lorg/json/JSONArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appboy/enums/CardKey$Provider;",
            "Lbo/app/y1;",
            "LkO1<",
            "*>;",
            "Lbo/app/a2;",
            "Lorg/json/JSONArray;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lbo/app/u$d;->b:Lcom/appboy/enums/CardKey$Provider;

    iput-object p2, p0, Lbo/app/u$d;->c:Lbo/app/y1;

    iput-object p3, p0, Lbo/app/u$d;->d:LkO1;

    iput-object p4, p0, Lbo/app/u$d;->e:Lbo/app/a2;

    iput-object p5, p0, Lbo/app/u$d;->f:Lorg/json/JSONArray;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/appboy/models/cards/Card;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v1, Lbo/app/u;->a:Lbo/app/u;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lbo/app/u$d;->b:Lcom/appboy/enums/CardKey$Provider;

    iget-object v4, p0, Lbo/app/u$d;->c:Lbo/app/y1;

    iget-object v5, p0, Lbo/app/u$d;->d:LkO1;

    iget-object v6, p0, Lbo/app/u$d;->e:Lbo/app/a2;

    invoke-static/range {v1 .. v6}, Lbo/app/u;->a(Lbo/app/u;Ljava/lang/String;Lcom/appboy/enums/CardKey$Provider;Lbo/app/y1;LkO1;Lbo/app/a2;)Lcom/appboy/models/cards/Card;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v4, v0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v2, Lbo/app/u;->a:Lbo/app/u;

    sget-object v3, Lk20$a;->e:Lk20$a;

    new-instance v6, Lbo/app/u$d$a;

    iget-object v0, p0, Lbo/app/u$d;->f:Lorg/json/JSONArray;

    invoke-direct {v6, p1, v0}, Lbo/app/u$d$a;-><init>(Ljava/lang/Object;Lorg/json/JSONArray;)V

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lbo/app/u$d;->a(Ljava/lang/Object;)Lcom/appboy/models/cards/Card;

    move-result-object p1

    return-object p1
.end method

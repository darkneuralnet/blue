.class public final Lbo/app/g0;
.super Lbo/app/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/g0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001d\u0008\u0007\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\"\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0008j\u0002`\nH\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u0015R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006!"
    }
    d2 = {
        "Lbo/app/g0;",
        "Lbo/app/r;",
        "Lbo/app/g2;",
        "externalPublisher",
        "Lbo/app/d;",
        "apiResponse",
        "",
        "a",
        "",
        "",
        "Lcom/braze/communication/MutableHttpHeaders;",
        "existingHeaders",
        "Lbo/app/v3;",
        "outboundRespondWith",
        "Lbo/app/v3;",
        "c",
        "()Lbo/app/v3;",
        "setOutboundRespondWith",
        "(Lbo/app/v3;)V",
        "",
        "b",
        "()Z",
        "containsNoNewData",
        "doesSendOptionalData",
        "Z",
        "g",
        "Lorg/json/JSONObject;",
        "l",
        "()Lorg/json/JSONObject;",
        "payload",
        "urlBase",
        "<init>",
        "(Ljava/lang/String;Lbo/app/v3;)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final t:Lbo/app/g0$a;


# instance fields
.field private r:Lbo/app/v3;

.field private final s:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbo/app/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo/app/g0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo/app/g0;->t:Lbo/app/g0$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbo/app/v3;)V
    .locals 2

    const-string v0, "urlBase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbo/app/r4;

    const-string v1, "data"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lbo/app/r4;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lbo/app/r;-><init>(Lbo/app/r4;)V

    iput-object p2, p0, Lbo/app/g0;->r:Lbo/app/v3;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lbo/app/g0;->s:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lbo/app/v3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lbo/app/v3$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Lbo/app/v3$a;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lbo/app/u3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2}, Lbo/app/v3$a;->a()Lbo/app/v3;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, Lbo/app/g0;-><init>(Ljava/lang/String;Lbo/app/v3;)V

    return-void
.end method


# virtual methods
.method public a(Lbo/app/g2;Lbo/app/d;)V
    .locals 8

    const-string p2, "externalPublisher"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk20;->a:Lk20;

    sget-object v5, Lbo/app/g0$b;->b:Lbo/app/g0$b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "existingHeaders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lbo/app/r;->a(Ljava/util/Map;)V

    invoke-virtual {p0}, Lbo/app/g0;->c()Lbo/app/v3;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lbo/app/v3;->e()Z

    move-result v0

    if-ne v0, v2, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lbo/app/g0;->c()Lbo/app/v3;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lbo/app/v3;->w()Z

    move-result v0

    if-ne v0, v2, :cond_4

    move v0, v2

    goto :goto_3

    :cond_4
    :goto_2
    move v0, v1

    :goto_3
    const-string v3, "true"

    if-eqz v0, :cond_5

    const-string v0, "X-Braze-FeedRequest"

    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v2

    goto :goto_4

    :cond_5
    move v0, v1

    :goto_4
    invoke-virtual {p0}, Lbo/app/g0;->c()Lbo/app/v3;

    move-result-object v4

    if-nez v4, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Lbo/app/v3;->x()Z

    move-result v4

    if-ne v4, v2, :cond_7

    move v1, v2

    :cond_7
    :goto_5
    if-eqz v1, :cond_8

    const-string v0, "X-Braze-TriggersRequest"

    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_8
    move v2, v0

    :goto_6
    if-eqz v2, :cond_9

    const-string v0, "X-Braze-DataRequest"

    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-void
.end method

.method public b()Z
    .locals 3

    invoke-virtual {p0}, Lbo/app/g0;->c()Lbo/app/v3;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lbo/app/v3;->e()Z

    move-result v0

    if-ne v0, v2, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-super {p0}, Lbo/app/r;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public c()Lbo/app/v3;
    .locals 1

    iget-object v0, p0, Lbo/app/g0;->r:Lbo/app/v3;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lbo/app/g0;->s:Z

    return v0
.end method

.method public l()Lorg/json/JSONObject;
    .locals 10

    invoke-super {p0}, Lbo/app/r;->l()Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    const-string v2, "respond_with"

    invoke-virtual {p0}, Lbo/app/g0;->c()Lbo/app/v3;

    move-result-object v3

    if-nez v3, :cond_1

    move-object v3, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lbo/app/v3;->v()Lorg/json/JSONObject;

    move-result-object v3

    :goto_0
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v5, v0

    sget-object v2, Lk20;->a:Lk20;

    sget-object v4, Lk20$a;->g:Lk20$a;

    sget-object v7, Lbo/app/g0$c;->b:Lbo/app/g0$c;

    const/4 v6, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v3, p0

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-object v1
.end method

.class public final Lco/bird/api/json/NokelockResponseTypeAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/api/json/NokelockResponseTypeAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvi2<",
        "Lco/bird/api/response/NokelockResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/api/json/NokelockResponseTypeAdapter;",
        "Lvi2;",
        "Lco/bird/api/response/NokelockResponse;",
        "Lyi2;",
        "json",
        "Ljava/lang/reflect/Type;",
        "typeOfT",
        "Lui2;",
        "context",
        "a",
        "<init>",
        "()V",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lyi2;Ljava/lang/reflect/Type;Lui2;)Lco/bird/api/response/NokelockResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonParseException;
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeOfT"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p2

    const-string v0, "type"

    invoke-virtual {p2, v0}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p2

    const-class v0, Lco/bird/android/model/constant/NokelockResponseType;

    invoke-interface {p3, p2, v0}, Lui2;->a(Lyi2;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p2, Lco/bird/android/model/constant/NokelockResponseType;

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    const-string p3, "data"

    invoke-virtual {p1, p3}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    sget-object p3, Lco/bird/api/json/NokelockResponseTypeAdapter$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p3, p3, v0

    const-string v0, "success"

    packed-switch p3, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lco/bird/android/model/wire/WireNokelockUnknownData;->INSTANCE:Lco/bird/android/model/wire/WireNokelockUnknownData;

    goto/16 :goto_1

    :pswitch_1
    new-instance p3, Lco/bird/android/model/wire/WireNokelockInsertedData;

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    invoke-virtual {p1, v0}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->a()Z

    move-result p1

    invoke-direct {p3, p1}, Lco/bird/android/model/wire/WireNokelockInsertedData;-><init>(Z)V

    goto/16 :goto_0

    :pswitch_2
    new-instance p3, Lco/bird/android/model/wire/WireNokelockStateData;

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    const-string v0, "is_locked"

    invoke-virtual {p1, v0}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->a()Z

    move-result p1

    invoke-direct {p3, p1}, Lco/bird/android/model/wire/WireNokelockStateData;-><init>(Z)V

    goto :goto_0

    :pswitch_3
    new-instance p3, Lco/bird/android/model/wire/WireNokelockLockingData;

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    invoke-virtual {p1, v0}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->a()Z

    move-result p1

    invoke-direct {p3, p1}, Lco/bird/android/model/wire/WireNokelockLockingData;-><init>(Z)V

    goto :goto_0

    :pswitch_4
    new-instance p3, Lco/bird/android/model/wire/WireNokelockUnlockData;

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    invoke-virtual {p1, v0}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->a()Z

    move-result p1

    invoke-direct {p3, p1}, Lco/bird/android/model/wire/WireNokelockUnlockData;-><init>(Z)V

    goto :goto_0

    :pswitch_5
    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    const-string p3, "requests"

    invoke-virtual {p1, p3}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    new-instance p3, Lco/bird/android/model/wire/WireNokelockTokenResponseData;

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object v0

    const-string v1, "unlock"

    invoke-virtual {v0, v1}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object v0

    invoke-virtual {v0}, Lyi2;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "requestsJson.asJsonObject[\"unlock\"].asString"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object v1

    const-string v2, "state"

    invoke-virtual {v1, v2}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object v1

    invoke-virtual {v1}, Lyi2;->j()Ljava/lang/String;

    move-result-object v1

    const-string v2, "requestsJson.asJsonObject[\"state\"].asString"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    const-string v2, "locking"

    invoke-virtual {p1, v2}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->j()Ljava/lang/String;

    move-result-object p1

    const-string v2, "requestsJson.asJsonObject[\"locking\"].asString"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v0, v1, p1}, Lco/bird/android/model/wire/WireNokelockTokenResponseData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    move-object p1, p3

    :goto_1
    new-instance p3, Lco/bird/api/response/NokelockResponse;

    invoke-direct {p3, p2, p1}, Lco/bird/api/response/NokelockResponse;-><init>(Lco/bird/android/model/constant/NokelockResponseType;Lco/bird/android/model/wire/WireNokelockResponseData;)V

    return-object p3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic deserialize(Lyi2;Ljava/lang/reflect/Type;Lui2;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/json/NokelockResponseTypeAdapter;->a(Lyi2;Ljava/lang/reflect/Type;Lui2;)Lco/bird/api/response/NokelockResponse;

    move-result-object p1

    return-object p1
.end method

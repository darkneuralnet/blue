.class public final Lcom/appboy/enums/CardKey$Provider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appboy/enums/CardKey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Provider"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appboy/enums/CardKey$Provider$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/appboy/enums/CardKey$Provider;",
        "",
        "Lcom/appboy/enums/CardKey;",
        "key",
        "",
        "getKey",
        "Lorg/json/JSONObject;",
        "jsonObject",
        "Lcom/appboy/enums/CardType;",
        "getCardTypeFromJson",
        "",
        "isContentCardProvider",
        "Z",
        "()Z",
        "<init>",
        "(Z)V",
        "Companion",
        "a",
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
.field public static final CONTENT_CARDS:Lcom/appboy/enums/CardKey$Provider;

.field public static final Companion:Lcom/appboy/enums/CardKey$Provider$a;

.field public static final NEWS_FEED:Lcom/appboy/enums/CardKey$Provider;


# instance fields
.field private final isContentCardProvider:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/appboy/enums/CardKey$Provider$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appboy/enums/CardKey$Provider$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/appboy/enums/CardKey$Provider;->Companion:Lcom/appboy/enums/CardKey$Provider$a;

    new-instance v0, Lcom/appboy/enums/CardKey$Provider;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/appboy/enums/CardKey$Provider;-><init>(Z)V

    sput-object v0, Lcom/appboy/enums/CardKey$Provider;->CONTENT_CARDS:Lcom/appboy/enums/CardKey$Provider;

    new-instance v0, Lcom/appboy/enums/CardKey$Provider;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appboy/enums/CardKey$Provider;-><init>(Z)V

    sput-object v0, Lcom/appboy/enums/CardKey$Provider;->NEWS_FEED:Lcom/appboy/enums/CardKey$Provider;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/appboy/enums/CardKey$Provider;->isContentCardProvider:Z

    return-void
.end method


# virtual methods
.method public final getCardTypeFromJson(Lorg/json/JSONObject;)Lcom/appboy/enums/CardType;
    .locals 10

    const-string v0, "jsonObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appboy/enums/CardKey;->TYPE:Lcom/appboy/enums/CardKey;

    invoke-virtual {p0, v0}, Lcom/appboy/enums/CardKey$Provider;->getKey(Lcom/appboy/enums/CardKey;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LAj2;->h(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v2

    :goto_1
    if-nez v3, :cond_4

    iget-boolean v3, p0, Lcom/appboy/enums/CardKey$Provider;->isContentCardProvider:Z

    if-eqz v3, :cond_4

    const-string v3, "short_news"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lcom/appboy/enums/CardKey;->SHORT_NEWS_IMAGE:Lcom/appboy/enums/CardKey;

    invoke-virtual {p0, v3}, Lcom/appboy/enums/CardKey$Provider;->getKey(Lcom/appboy/enums/CardKey;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, LAj2;->h(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    move v1, v2

    :cond_3
    if-eqz v1, :cond_4

    sget-object v2, Lk20;->a:Lk20;

    sget-object v4, Lk20$a;->f:Lk20$a;

    new-instance v7, Lcom/appboy/enums/CardKey$Provider$b;

    invoke-direct {v7, p1}, Lcom/appboy/enums/CardKey$Provider$b;-><init>(Lorg/json/JSONObject;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v3, p0

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const-string v0, "text_announcement"

    :cond_4
    invoke-static {}, Lcom/appboy/enums/CardKey;->access$getCardTypeMap$cp()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lcom/appboy/enums/CardKey;->access$getCardTypeMap$cp()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/appboy/enums/CardType;

    goto :goto_2

    :cond_5
    sget-object p1, Lcom/appboy/enums/CardType;->DEFAULT:Lcom/appboy/enums/CardType;

    :goto_2
    return-object p1
.end method

.method public final getKey(Lcom/appboy/enums/CardKey;)Ljava/lang/String;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/appboy/enums/CardKey$Provider;->isContentCardProvider:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/appboy/enums/CardKey;->getContentCardsKey()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/appboy/enums/CardKey;->getFeedKey()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final isContentCardProvider()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appboy/enums/CardKey$Provider;->isContentCardProvider:Z

    return v0
.end method

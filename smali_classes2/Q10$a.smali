.class public final enum LQ10$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ10;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ10$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LQ10$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0080\u0001\u0018\u0000 \u00052\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u000c\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\t\u0010\u000bj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "LQ10$a;",
        "",
        "",
        "b",
        "Ljava/lang/String;",
        "d",
        "()Ljava/lang/String;",
        "key",
        "LcO1;",
        "c",
        "LcO1;",
        "()LcO1;",
        "impl",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;LcO1;)V",
        "a",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final d:LQ10$a$a;

.field public static final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LQ10$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum f:LQ10$a;

.field public static final enum g:LQ10$a;

.field public static final enum h:LQ10$a;

.field public static final enum i:LQ10$a;

.field public static final enum j:LQ10$a;

.field public static final enum k:LQ10$a;

.field public static final enum l:LQ10$a;

.field public static final enum m:LQ10$a;

.field public static final enum n:LQ10$a;

.field public static final enum o:LQ10$a;

.field public static final enum p:LQ10$a;

.field public static final enum q:LQ10$a;

.field public static final enum r:LQ10$a;

.field public static final synthetic s:[LQ10$a;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:LcO1;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, LQ10$a;

    const-string v1, "container"

    sget-object v2, LTz0;->b:LTz0;

    const-string v3, "CONTAINER"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->f:LQ10$a;

    new-instance v0, LQ10$a;

    const-string v1, "logCustomEvent"

    sget-object v2, Lmx2;->b:Lmx2;

    const-string v3, "LOG_CUSTOM_EVENT"

    const/4 v5, 0x1

    invoke-direct {v0, v3, v5, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->g:LQ10$a;

    new-instance v0, LQ10$a;

    const-string v1, "setCustomUserAttribute"

    sget-object v2, LQv5;->b:LQv5;

    const-string v3, "SET_CUSTOM_ATTRIBUTE"

    const/4 v5, 0x2

    invoke-direct {v0, v3, v5, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->h:LQ10$a;

    new-instance v0, LQ10$a;

    const-string v1, "requestPushPermission"

    sget-object v2, LeJ4;->b:LeJ4;

    const-string v3, "REQUEST_PUSH_PERMISSION"

    const/4 v5, 0x3

    invoke-direct {v0, v3, v5, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->i:LQ10$a;

    new-instance v0, LQ10$a;

    sget-object v1, Lb8;->b:Lb8;

    const-string v2, "ADD_TO_SUBSCRIPTION_GROUP"

    const/4 v3, 0x4

    const-string v5, "addToSubscriptionGroup"

    invoke-direct {v0, v2, v3, v5, v1}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->j:LQ10$a;

    new-instance v0, LQ10$a;

    const/4 v2, 0x5

    const-string v3, "removeFromSubscriptionGroup"

    const-string v5, "REMOVE_FROM_SUBSCRIPTION_GROUP"

    invoke-direct {v0, v5, v2, v3, v1}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->k:LQ10$a;

    new-instance v0, LQ10$a;

    const-string v1, "addToCustomAttributeArray"

    sget-object v2, La8;->b:La8;

    const-string v3, "ADD_TO_CUSTOM_ATTRIBUTE_ARRAY"

    const/4 v5, 0x6

    invoke-direct {v0, v3, v5, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->l:LQ10$a;

    new-instance v0, LQ10$a;

    const-string v1, "removeFromCustomAttributeArray"

    sget-object v2, Lkw4;->b:Lkw4;

    const-string v3, "REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY"

    const/4 v5, 0x7

    invoke-direct {v0, v3, v5, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->m:LQ10$a;

    new-instance v0, LQ10$a;

    const-string v1, "setEmailNotificationSubscriptionType"

    sget-object v2, LSv5;->b:LSv5;

    const-string v3, "SET_EMAIL_SUBSCRIPTION"

    const/16 v5, 0x8

    invoke-direct {v0, v3, v5, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->n:LQ10$a;

    new-instance v0, LQ10$a;

    const-string v1, "setPushNotificationSubscriptionType"

    sget-object v2, LZv5;->b:LZv5;

    const-string v3, "SET_PUSH_NOTIFICATION_SUBSCRIPTION"

    const/16 v5, 0x9

    invoke-direct {v0, v3, v5, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->o:LQ10$a;

    new-instance v0, LQ10$a;

    const-string v1, "openLinkInWebview"

    sget-object v2, LWh3;->b:LWh3;

    const-string v3, "OPEN_LINK_IN_WEBVIEW"

    const/16 v5, 0xa

    invoke-direct {v0, v3, v5, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->p:LQ10$a;

    new-instance v0, LQ10$a;

    const-string v1, "openLink"

    sget-object v2, LVh3;->b:LVh3;

    const-string v3, "OPEN_LINK_EXTERNALLY"

    const/16 v5, 0xb

    invoke-direct {v0, v3, v5, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->q:LQ10$a;

    new-instance v0, LQ10$a;

    const-string v1, ""

    sget-object v2, Lx83;->a:Lx83;

    const-string v3, "INVALID"

    const/16 v5, 0xc

    invoke-direct {v0, v3, v5, v1, v2}, LQ10$a;-><init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V

    sput-object v0, LQ10$a;->r:LQ10$a;

    invoke-static {}, LQ10$a;->a()[LQ10$a;

    move-result-object v0

    sput-object v0, LQ10$a;->s:[LQ10$a;

    new-instance v0, LQ10$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ10$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQ10$a;->d:LQ10$a$a;

    invoke-static {}, LQ10$a;->values()[LQ10$a;

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v1, v0

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v3, v0, v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3}, LQ10$a;->d()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sput-object v2, LQ10$a;->e:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;LcO1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LcO1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LQ10$a;->b:Ljava/lang/String;

    iput-object p4, p0, LQ10$a;->c:LcO1;

    return-void
.end method

.method public static final synthetic a()[LQ10$a;
    .locals 3

    const/16 v0, 0xd

    new-array v0, v0, [LQ10$a;

    const/4 v1, 0x0

    sget-object v2, LQ10$a;->f:LQ10$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LQ10$a;->g:LQ10$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LQ10$a;->h:LQ10$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LQ10$a;->i:LQ10$a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LQ10$a;->j:LQ10$a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LQ10$a;->k:LQ10$a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LQ10$a;->l:LQ10$a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LQ10$a;->m:LQ10$a;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, LQ10$a;->n:LQ10$a;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, LQ10$a;->o:LQ10$a;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, LQ10$a;->p:LQ10$a;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, LQ10$a;->q:LQ10$a;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, LQ10$a;->r:LQ10$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/Map;
    .locals 1

    sget-object v0, LQ10$a;->e:Ljava/util/Map;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LQ10$a;
    .locals 1

    const-class v0, LQ10$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LQ10$a;

    return-object p0
.end method

.method public static values()[LQ10$a;
    .locals 1

    sget-object v0, LQ10$a;->s:[LQ10$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQ10$a;

    return-object v0
.end method


# virtual methods
.method public final c()LcO1;
    .locals 1

    iget-object v0, p0, LQ10$a;->c:LcO1;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LQ10$a;->b:Ljava/lang/String;

    return-object v0
.end method

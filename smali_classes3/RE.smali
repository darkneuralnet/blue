.class public final enum LRE;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRE$a;,
        LRE$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LRE;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "LRE;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "a",
        "d",
        "e",
        "rx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:LRE$a;

.field public static final c:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum d:LRE;

.field public static final enum e:LRE;

.field public static final synthetic f:[LRE;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LRE;

    const-string v1, "ATTACH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LRE;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRE;->d:LRE;

    new-instance v0, LRE;

    const-string v1, "DETACH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LRE;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRE;->e:LRE;

    invoke-static {}, LRE;->b()[LRE;

    move-result-object v0

    sput-object v0, LRE;->f:[LRE;

    new-instance v0, LRE$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LRE$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LRE;->b:LRE$a;

    new-instance v0, LQE;

    invoke-direct {v0}, LQE;-><init>()V

    sput-object v0, LRE;->c:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a(LRE;)LRE;
    .locals 0

    invoke-static {p0}, LRE;->c(LRE;)LRE;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCORRESPONDING_EVENTS$cp()Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .locals 1

    sget-object v0, LRE;->c:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    return-object v0
.end method

.method public static final synthetic b()[LRE;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LRE;

    const/4 v1, 0x0

    sget-object v2, LRE;->d:LRE;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LRE;->e:LRE;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static final c(LRE;)LRE;
    .locals 1

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LRE$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, LRE;->e:LRE;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Cannot bind to Activity lifecycle after destroy."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)LRE;
    .locals 1

    const-class v0, LRE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LRE;

    return-object p0
.end method

.method public static values()[LRE;
    .locals 1

    sget-object v0, LRE;->f:[LRE;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRE;

    return-object v0
.end method

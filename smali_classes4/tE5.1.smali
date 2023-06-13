.class public final enum LtE5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LtE5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LtE5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\u0008\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "LtE5;",
        "",
        "",
        "b",
        "<init>",
        "(Ljava/lang/String;I)V",
        "c",
        "d",
        "e",
        "f",
        "g",
        "interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LtE5;

.field public static final enum c:LtE5;

.field public static final enum d:LtE5;

.field public static final enum e:LtE5;

.field public static final enum f:LtE5;

.field public static final enum g:LtE5;

.field public static final synthetic h:[LtE5;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LtE5;

    const-string v1, "PRIVATE_BIRD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LtE5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtE5;->b:LtE5;

    new-instance v0, LtE5;

    const-string v1, "PENDING_ITEM_LEASE_BIRD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LtE5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtE5;->c:LtE5;

    new-instance v0, LtE5;

    const-string v1, "RETURNING_ITEM_LEASE_BIRD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LtE5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtE5;->d:LtE5;

    new-instance v0, LtE5;

    const-string v1, "ACTIVE_ITEM_LEASE_BIRD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LtE5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtE5;->e:LtE5;

    new-instance v0, LtE5;

    const-string v1, "RIDDEN_BIRD"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LtE5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtE5;->f:LtE5;

    new-instance v0, LtE5;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LtE5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtE5;->g:LtE5;

    invoke-static {}, LtE5;->a()[LtE5;

    move-result-object v0

    sput-object v0, LtE5;->h:[LtE5;

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

.method public static final synthetic a()[LtE5;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LtE5;

    const/4 v1, 0x0

    sget-object v2, LtE5;->b:LtE5;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LtE5;->c:LtE5;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LtE5;->d:LtE5;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LtE5;->e:LtE5;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LtE5;->f:LtE5;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LtE5;->g:LtE5;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LtE5;
    .locals 1

    const-class v0, LtE5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LtE5;

    return-object p0
.end method

.method public static values()[LtE5;
    .locals 1

    sget-object v0, LtE5;->h:[LtE5;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LtE5;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 2

    sget-object v0, LtE5$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "ride"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.class public final enum LkE5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LkE5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002j\u0002\u0008\u0004j\u0002\u0008\u0003j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "LkE5;",
        "",
        "",
        "c",
        "b",
        "<init>",
        "(Ljava/lang/String;I)V",
        "d",
        "e",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LkE5;

.field public static final enum c:LkE5;

.field public static final enum d:LkE5;

.field public static final enum e:LkE5;

.field public static final synthetic f:[LkE5;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LkE5;

    const-string v1, "LOCKED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LkE5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LkE5;->b:LkE5;

    new-instance v0, LkE5;

    const-string v1, "REQUESTED_UNLOCK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LkE5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LkE5;->c:LkE5;

    new-instance v0, LkE5;

    const-string v1, "UNLOCKED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LkE5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LkE5;->d:LkE5;

    new-instance v0, LkE5;

    const-string v1, "REQUESTED_LOCK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LkE5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LkE5;->e:LkE5;

    invoke-static {}, LkE5;->a()[LkE5;

    move-result-object v0

    sput-object v0, LkE5;->f:[LkE5;

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

.method public static final synthetic a()[LkE5;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LkE5;

    const/4 v1, 0x0

    sget-object v2, LkE5;->b:LkE5;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LkE5;->c:LkE5;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LkE5;->d:LkE5;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LkE5;->e:LkE5;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LkE5;
    .locals 1

    const-class v0, LkE5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LkE5;

    return-object p0
.end method

.method public static values()[LkE5;
    .locals 1

    sget-object v0, LkE5;->f:[LkE5;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LkE5;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    sget-object v0, LkE5;->b:LkE5;

    if-eq p0, v0, :cond_1

    sget-object v0, LkE5;->e:LkE5;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final c()Z
    .locals 1

    sget-object v0, LkE5;->b:LkE5;

    if-eq p0, v0, :cond_1

    sget-object v0, LkE5;->d:LkE5;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

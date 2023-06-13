.class public final enum LKN4$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKN4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LKN4$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "LKN4$b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LKN4$b;

.field public static final enum c:LKN4$b;

.field public static final enum d:LKN4$b;

.field public static final enum e:LKN4$b;

.field public static final synthetic f:[LKN4$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LKN4$b;

    const-string v1, "ONE_HOUR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LKN4$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LKN4$b;->b:LKN4$b;

    new-instance v0, LKN4$b;

    const-string v1, "ONE_DAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LKN4$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LKN4$b;->c:LKN4$b;

    new-instance v0, LKN4$b;

    const-string v1, "ONE_WEEK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LKN4$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LKN4$b;->d:LKN4$b;

    new-instance v0, LKN4$b;

    const-string v1, "FOREVER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LKN4$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LKN4$b;->e:LKN4$b;

    invoke-static {}, LKN4$b;->a()[LKN4$b;

    move-result-object v0

    sput-object v0, LKN4$b;->f:[LKN4$b;

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

.method public static final synthetic a()[LKN4$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LKN4$b;

    const/4 v1, 0x0

    sget-object v2, LKN4$b;->b:LKN4$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LKN4$b;->c:LKN4$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LKN4$b;->d:LKN4$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LKN4$b;->e:LKN4$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LKN4$b;
    .locals 1

    const-class v0, LKN4$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LKN4$b;

    return-object p0
.end method

.method public static values()[LKN4$b;
    .locals 1

    sget-object v0, LKN4$b;->f:[LKN4$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LKN4$b;

    return-object v0
.end method

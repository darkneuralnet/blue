.class public final enum LUy1$c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUy1$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LUy1$c$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "LUy1$c$b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "sqlite-framework_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum b:LUy1$c$b;

.field public static final enum c:LUy1$c$b;

.field public static final enum d:LUy1$c$b;

.field public static final enum e:LUy1$c$b;

.field public static final enum f:LUy1$c$b;

.field public static final synthetic g:[LUy1$c$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LUy1$c$b;

    const-string v1, "ON_CONFIGURE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LUy1$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUy1$c$b;->b:LUy1$c$b;

    new-instance v0, LUy1$c$b;

    const-string v1, "ON_CREATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LUy1$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUy1$c$b;->c:LUy1$c$b;

    new-instance v0, LUy1$c$b;

    const-string v1, "ON_UPGRADE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LUy1$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUy1$c$b;->d:LUy1$c$b;

    new-instance v0, LUy1$c$b;

    const-string v1, "ON_DOWNGRADE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LUy1$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUy1$c$b;->e:LUy1$c$b;

    new-instance v0, LUy1$c$b;

    const-string v1, "ON_OPEN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LUy1$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUy1$c$b;->f:LUy1$c$b;

    invoke-static {}, LUy1$c$b;->a()[LUy1$c$b;

    move-result-object v0

    sput-object v0, LUy1$c$b;->g:[LUy1$c$b;

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

.method public static final synthetic a()[LUy1$c$b;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [LUy1$c$b;

    const/4 v1, 0x0

    sget-object v2, LUy1$c$b;->b:LUy1$c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LUy1$c$b;->c:LUy1$c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LUy1$c$b;->d:LUy1$c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LUy1$c$b;->e:LUy1$c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LUy1$c$b;->f:LUy1$c$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LUy1$c$b;
    .locals 1

    const-class v0, LUy1$c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUy1$c$b;

    return-object p0
.end method

.method public static values()[LUy1$c$b;
    .locals 1

    sget-object v0, LUy1$c$b;->g:[LUy1$c$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUy1$c$b;

    return-object v0
.end method

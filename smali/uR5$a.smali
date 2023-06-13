.class public final enum LuR5$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LuR5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LuR5$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LuR5$a;

.field public static final enum c:LuR5$a;

.field public static final synthetic d:[LuR5$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LuR5$a;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LuR5$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LuR5$a;->b:LuR5$a;

    new-instance v0, LuR5$a;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LuR5$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LuR5$a;->c:LuR5$a;

    invoke-static {}, LuR5$a;->a()[LuR5$a;

    move-result-object v0

    sput-object v0, LuR5$a;->d:[LuR5$a;

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

.method public static synthetic a()[LuR5$a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LuR5$a;

    const/4 v1, 0x0

    sget-object v2, LuR5$a;->b:LuR5$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LuR5$a;->c:LuR5$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LuR5$a;
    .locals 1

    const-class v0, LuR5$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LuR5$a;

    return-object p0
.end method

.method public static values()[LuR5$a;
    .locals 1

    sget-object v0, LuR5$a;->d:[LuR5$a;

    invoke-virtual {v0}, [LuR5$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LuR5$a;

    return-object v0
.end method

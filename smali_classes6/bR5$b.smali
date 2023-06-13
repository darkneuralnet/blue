.class public final enum LbR5$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LbR5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LbR5$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LbR5$b;

.field public static final enum c:LbR5$b;

.field public static final synthetic d:[LbR5$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LbR5$b;

    const-string v1, "DEFAULT_APP_CHECK_TOKEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LbR5$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LbR5$b;->b:LbR5$b;

    new-instance v1, LbR5$b;

    const-string v3, "UNKNOWN_APP_CHECK_TOKEN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LbR5$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, LbR5$b;->c:LbR5$b;

    const/4 v3, 0x2

    new-array v3, v3, [LbR5$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LbR5$b;->d:[LbR5$b;

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

.method public static valueOf(Ljava/lang/String;)LbR5$b;
    .locals 1

    const-class v0, LbR5$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LbR5$b;

    return-object p0
.end method

.method public static values()[LbR5$b;
    .locals 1

    sget-object v0, LbR5$b;->d:[LbR5$b;

    invoke-virtual {v0}, [LbR5$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LbR5$b;

    return-object v0
.end method

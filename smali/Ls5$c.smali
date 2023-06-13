.class public final enum LLs5$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLs5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LLs5$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LLs5$c;

.field public static final enum c:LLs5$c;

.field public static final enum d:LLs5$c;

.field public static final enum e:LLs5$c;

.field public static final synthetic f:[LLs5$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LLs5$c;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LLs5$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLs5$c;->b:LLs5$c;

    new-instance v0, LLs5$c;

    const-string v1, "QUEUING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LLs5$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLs5$c;->c:LLs5$c;

    new-instance v0, LLs5$c;

    const-string v1, "QUEUED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LLs5$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLs5$c;->d:LLs5$c;

    new-instance v0, LLs5$c;

    const-string v1, "RUNNING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LLs5$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLs5$c;->e:LLs5$c;

    invoke-static {}, LLs5$c;->a()[LLs5$c;

    move-result-object v0

    sput-object v0, LLs5$c;->f:[LLs5$c;

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

.method public static synthetic a()[LLs5$c;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LLs5$c;

    const/4 v1, 0x0

    sget-object v2, LLs5$c;->b:LLs5$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LLs5$c;->c:LLs5$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LLs5$c;->d:LLs5$c;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LLs5$c;->e:LLs5$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LLs5$c;
    .locals 1

    const-class v0, LLs5$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLs5$c;

    return-object p0
.end method

.method public static values()[LLs5$c;
    .locals 1

    sget-object v0, LLs5$c;->f:[LLs5$c;

    invoke-virtual {v0}, [LLs5$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLs5$c;

    return-object v0
.end method

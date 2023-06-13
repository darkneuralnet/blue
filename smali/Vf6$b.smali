.class public final enum LVf6$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVf6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LVf6$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LVf6$b;

.field public static final enum c:LVf6$b;

.field public static final enum d:LVf6$b;

.field public static final enum e:LVf6$b;

.field public static final synthetic f:[LVf6$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LVf6$b;

    const-string v1, "IMAGE_CAPTURE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LVf6$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVf6$b;->b:LVf6$b;

    new-instance v0, LVf6$b;

    const-string v1, "PREVIEW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LVf6$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVf6$b;->c:LVf6$b;

    new-instance v0, LVf6$b;

    const-string v1, "IMAGE_ANALYSIS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LVf6$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVf6$b;->d:LVf6$b;

    new-instance v0, LVf6$b;

    const-string v1, "VIDEO_CAPTURE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LVf6$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVf6$b;->e:LVf6$b;

    invoke-static {}, LVf6$b;->a()[LVf6$b;

    move-result-object v0

    sput-object v0, LVf6$b;->f:[LVf6$b;

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

.method public static synthetic a()[LVf6$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LVf6$b;

    const/4 v1, 0x0

    sget-object v2, LVf6$b;->b:LVf6$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LVf6$b;->c:LVf6$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LVf6$b;->d:LVf6$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LVf6$b;->e:LVf6$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LVf6$b;
    .locals 1

    const-class v0, LVf6$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LVf6$b;

    return-object p0
.end method

.method public static values()[LVf6$b;
    .locals 1

    sget-object v0, LVf6$b;->f:[LVf6$b;

    invoke-virtual {v0}, [LVf6$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LVf6$b;

    return-object v0
.end method

.class public final enum LI94;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LI94;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LI94;

.field public static final enum c:LI94;

.field public static final synthetic d:[LI94;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LI94;

    const-string v1, "PROTO2"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LI94;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI94;->b:LI94;

    new-instance v0, LI94;

    const-string v1, "PROTO3"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LI94;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI94;->c:LI94;

    invoke-static {}, LI94;->a()[LI94;

    move-result-object v0

    sput-object v0, LI94;->d:[LI94;

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

.method public static synthetic a()[LI94;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LI94;

    const/4 v1, 0x0

    sget-object v2, LI94;->b:LI94;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LI94;->c:LI94;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LI94;
    .locals 1

    const-class v0, LI94;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LI94;

    return-object p0
.end method

.method public static values()[LI94;
    .locals 1

    sget-object v0, LI94;->d:[LI94;

    invoke-virtual {v0}, [LI94;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LI94;

    return-object v0
.end method

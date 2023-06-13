.class public final enum LJ94;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LJ94;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LJ94;

.field public static final enum c:LJ94;

.field public static final synthetic d:[LJ94;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LJ94;

    const-string v1, "PROTO2"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LJ94;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJ94;->b:LJ94;

    new-instance v1, LJ94;

    const-string v3, "PROTO3"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LJ94;-><init>(Ljava/lang/String;I)V

    sput-object v1, LJ94;->c:LJ94;

    const/4 v3, 0x2

    new-array v3, v3, [LJ94;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LJ94;->d:[LJ94;

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

.method public static valueOf(Ljava/lang/String;)LJ94;
    .locals 1

    const-class v0, LJ94;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJ94;

    return-object p0
.end method

.method public static values()[LJ94;
    .locals 1

    sget-object v0, LJ94;->d:[LJ94;

    invoke-virtual {v0}, [LJ94;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJ94;

    return-object v0
.end method

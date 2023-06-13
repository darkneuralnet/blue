.class public final enum LZ42$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ42;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LZ42$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LZ42$b;

.field public static final enum c:LZ42$b;

.field public static final synthetic d:[LZ42$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LZ42$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LZ42$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZ42$b;->b:LZ42$b;

    new-instance v1, LZ42$b;

    const-string v3, "BAD_CONFIG"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LZ42$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, LZ42$b;->c:LZ42$b;

    const/4 v3, 0x2

    new-array v3, v3, [LZ42$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LZ42$b;->d:[LZ42$b;

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

.method public static valueOf(Ljava/lang/String;)LZ42$b;
    .locals 1

    const-class v0, LZ42$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LZ42$b;

    return-object p0
.end method

.method public static values()[LZ42$b;
    .locals 1

    sget-object v0, LZ42$b;->d:[LZ42$b;

    invoke-virtual {v0}, [LZ42$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LZ42$b;

    return-object v0
.end method

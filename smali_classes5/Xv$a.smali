.class public final enum LXv$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LXv$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LXv$a;

.field public static final enum c:LXv$a;

.field public static final enum d:LXv$a;

.field public static final enum e:LXv$a;

.field public static final synthetic f:[LXv$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, LXv$a;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LXv$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXv$a;->b:LXv$a;

    new-instance v1, LXv$a;

    const-string v3, "TRANSIENT_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LXv$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, LXv$a;->c:LXv$a;

    new-instance v3, LXv$a;

    const-string v5, "FATAL_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LXv$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, LXv$a;->d:LXv$a;

    new-instance v5, LXv$a;

    const-string v7, "INVALID_PAYLOAD"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LXv$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, LXv$a;->e:LXv$a;

    const/4 v7, 0x4

    new-array v7, v7, [LXv$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, LXv$a;->f:[LXv$a;

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

.method public static valueOf(Ljava/lang/String;)LXv$a;
    .locals 1

    const-class v0, LXv$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LXv$a;

    return-object p0
.end method

.method public static values()[LXv$a;
    .locals 1

    sget-object v0, LXv$a;->f:[LXv$a;

    invoke-virtual {v0}, [LXv$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LXv$a;

    return-object v0
.end method

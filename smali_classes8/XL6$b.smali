.class public final enum LXL6$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXL6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LXL6$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LXL6$b;

.field public static final enum d:LXL6$b;

.field public static final enum e:LXL6$b;

.field public static final synthetic f:[LXL6$b;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, LXL6$b;

    const-string v1, "free_sd"

    const-string v2, "FREE_SD"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LXL6$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LXL6$b;->c:LXL6$b;

    new-instance v1, LXL6$b;

    const-string v2, "free_ud"

    const-string v4, "FREE_UD"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LXL6$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LXL6$b;->d:LXL6$b;

    new-instance v2, LXL6$b;

    const-string v4, "mounted"

    const-string v6, "MOUNTED"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LXL6$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LXL6$b;->e:LXL6$b;

    const/4 v4, 0x3

    new-array v4, v4, [LXL6$b;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    sput-object v4, LXL6$b;->f:[LXL6$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LXL6$b;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LXL6$b;
    .locals 1

    const-class v0, LXL6$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LXL6$b;

    return-object p0
.end method

.method public static values()[LXL6$b;
    .locals 1

    sget-object v0, LXL6$b;->f:[LXL6$b;

    invoke-virtual {v0}, [LXL6$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LXL6$b;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LXL6$b;->b:Ljava/lang/String;

    return-object v0
.end method

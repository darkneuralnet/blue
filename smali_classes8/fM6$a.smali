.class public final enum LfM6$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LfM6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LfM6$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LfM6$a;

.field public static final enum d:LfM6$a;

.field public static final enum e:LfM6$a;

.field public static final synthetic f:[LfM6$a;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, LfM6$a;

    const-string v1, "su"

    const-string v2, "SU"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LfM6$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LfM6$a;->c:LfM6$a;

    new-instance v1, LfM6$a;

    const-string v2, "busybox"

    const-string v4, "BUSYBOX"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LfM6$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LfM6$a;->d:LfM6$a;

    new-instance v2, LfM6$a;

    const-string v4, "magisk"

    const-string v6, "MAGISK"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LfM6$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LfM6$a;->e:LfM6$a;

    const/4 v4, 0x3

    new-array v4, v4, [LfM6$a;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    sput-object v4, LfM6$a;->f:[LfM6$a;

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

    iput-object p3, p0, LfM6$a;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LfM6$a;
    .locals 1

    const-class v0, LfM6$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LfM6$a;

    return-object p0
.end method

.method public static values()[LfM6$a;
    .locals 1

    sget-object v0, LfM6$a;->f:[LfM6$a;

    invoke-virtual {v0}, [LfM6$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LfM6$a;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LfM6$a;->b:Ljava/lang/String;

    return-object v0
.end method

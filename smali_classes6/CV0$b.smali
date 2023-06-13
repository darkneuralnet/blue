.class public final enum LCV0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCV0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LCV0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LCV0$b;

.field public static final enum c:LCV0$b;

.field public static final enum d:LCV0$b;

.field public static final enum e:LCV0$b;

.field public static final enum f:LCV0$b;

.field public static final enum g:LCV0$b;

.field public static final synthetic h:[LCV0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, LCV0$b;

    const-string v1, "UPPER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LCV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LCV0$b;->b:LCV0$b;

    new-instance v1, LCV0$b;

    const-string v3, "LOWER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LCV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, LCV0$b;->c:LCV0$b;

    new-instance v3, LCV0$b;

    const-string v5, "MIXED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LCV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, LCV0$b;->d:LCV0$b;

    new-instance v5, LCV0$b;

    const-string v7, "DIGIT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LCV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, LCV0$b;->e:LCV0$b;

    new-instance v7, LCV0$b;

    const-string v9, "PUNCT"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, LCV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, LCV0$b;->f:LCV0$b;

    new-instance v9, LCV0$b;

    const-string v11, "BINARY"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, LCV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v9, LCV0$b;->g:LCV0$b;

    const/4 v11, 0x6

    new-array v11, v11, [LCV0$b;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, LCV0$b;->h:[LCV0$b;

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

.method public static valueOf(Ljava/lang/String;)LCV0$b;
    .locals 1

    const-class v0, LCV0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LCV0$b;

    return-object p0
.end method

.method public static values()[LCV0$b;
    .locals 1

    sget-object v0, LCV0$b;->h:[LCV0$b;

    invoke-virtual {v0}, [LCV0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LCV0$b;

    return-object v0
.end method

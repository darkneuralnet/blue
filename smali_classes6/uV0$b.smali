.class public final enum LuV0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LuV0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LuV0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LuV0$b;

.field public static final enum c:LuV0$b;

.field public static final enum d:LuV0$b;

.field public static final enum e:LuV0$b;

.field public static final enum f:LuV0$b;

.field public static final enum g:LuV0$b;

.field public static final enum h:LuV0$b;

.field public static final synthetic i:[LuV0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, LuV0$b;

    const-string v1, "PAD_ENCODE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LuV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LuV0$b;->b:LuV0$b;

    new-instance v1, LuV0$b;

    const-string v3, "ASCII_ENCODE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LuV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, LuV0$b;->c:LuV0$b;

    new-instance v3, LuV0$b;

    const-string v5, "C40_ENCODE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LuV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, LuV0$b;->d:LuV0$b;

    new-instance v5, LuV0$b;

    const-string v7, "TEXT_ENCODE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LuV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, LuV0$b;->e:LuV0$b;

    new-instance v7, LuV0$b;

    const-string v9, "ANSIX12_ENCODE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, LuV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, LuV0$b;->f:LuV0$b;

    new-instance v9, LuV0$b;

    const-string v11, "EDIFACT_ENCODE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, LuV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v9, LuV0$b;->g:LuV0$b;

    new-instance v11, LuV0$b;

    const-string v13, "BASE256_ENCODE"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, LuV0$b;-><init>(Ljava/lang/String;I)V

    sput-object v11, LuV0$b;->h:LuV0$b;

    const/4 v13, 0x7

    new-array v13, v13, [LuV0$b;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, LuV0$b;->i:[LuV0$b;

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

.method public static valueOf(Ljava/lang/String;)LuV0$b;
    .locals 1

    const-class v0, LuV0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LuV0$b;

    return-object p0
.end method

.method public static values()[LuV0$b;
    .locals 1

    sget-object v0, LuV0$b;->i:[LuV0$b;

    invoke-virtual {v0}, [LuV0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LuV0$b;

    return-object v0
.end method

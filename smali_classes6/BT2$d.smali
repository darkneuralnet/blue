.class public final enum LBT2$d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LF94;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBT2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LBT2$d;",
        ">;",
        "LF94;"
    }
.end annotation


# static fields
.field public static final enum c:LBT2$d;

.field public static final enum d:LBT2$d;

.field public static final enum e:LBT2$d;

.field public static final enum f:LBT2$d;

.field public static final synthetic g:[LBT2$d;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, LBT2$d;

    const-string v1, "UNKNOWN_OS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LBT2$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LBT2$d;->c:LBT2$d;

    new-instance v1, LBT2$d;

    const-string v3, "ANDROID"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LBT2$d;-><init>(Ljava/lang/String;II)V

    sput-object v1, LBT2$d;->d:LBT2$d;

    new-instance v3, LBT2$d;

    const-string v5, "IOS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LBT2$d;-><init>(Ljava/lang/String;II)V

    sput-object v3, LBT2$d;->e:LBT2$d;

    new-instance v5, LBT2$d;

    const-string v7, "WEB"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LBT2$d;-><init>(Ljava/lang/String;II)V

    sput-object v5, LBT2$d;->f:LBT2$d;

    const/4 v7, 0x4

    new-array v7, v7, [LBT2$d;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, LBT2$d;->g:[LBT2$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LBT2$d;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LBT2$d;
    .locals 1

    const-class v0, LBT2$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LBT2$d;

    return-object p0
.end method

.method public static values()[LBT2$d;
    .locals 1

    sget-object v0, LBT2$d;->g:[LBT2$d;

    invoke-virtual {v0}, [LBT2$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LBT2$d;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, LBT2$d;->b:I

    return v0
.end method

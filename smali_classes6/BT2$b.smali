.class public final enum LBT2$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LBT2$b;",
        ">;",
        "LF94;"
    }
.end annotation


# static fields
.field public static final enum c:LBT2$b;

.field public static final enum d:LBT2$b;

.field public static final enum e:LBT2$b;

.field public static final synthetic f:[LBT2$b;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LBT2$b;

    const-string v1, "UNKNOWN_EVENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LBT2$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LBT2$b;->c:LBT2$b;

    new-instance v1, LBT2$b;

    const-string v3, "MESSAGE_DELIVERED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LBT2$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, LBT2$b;->d:LBT2$b;

    new-instance v3, LBT2$b;

    const-string v5, "MESSAGE_OPEN"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LBT2$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, LBT2$b;->e:LBT2$b;

    const/4 v5, 0x3

    new-array v5, v5, [LBT2$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LBT2$b;->f:[LBT2$b;

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

    iput p3, p0, LBT2$b;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LBT2$b;
    .locals 1

    const-class v0, LBT2$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LBT2$b;

    return-object p0
.end method

.method public static values()[LBT2$b;
    .locals 1

    sget-object v0, LBT2$b;->f:[LBT2$b;

    invoke-virtual {v0}, [LBT2$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LBT2$b;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, LBT2$b;->b:I

    return v0
.end method

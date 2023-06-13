.class public final enum LIk0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIk0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LIk0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LIk0$b;

.field public static final enum d:LIk0$b;

.field public static final synthetic e:[LIk0$b;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, LIk0$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LIk0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LIk0$b;->c:LIk0$b;

    new-instance v1, LIk0$b;

    const/16 v3, 0x17

    const-string v4, "ANDROID_FIREBASE"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v3}, LIk0$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, LIk0$b;->d:LIk0$b;

    const/4 v3, 0x2

    new-array v3, v3, [LIk0$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v5

    sput-object v3, LIk0$b;->e:[LIk0$b;

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

    iput p3, p0, LIk0$b;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LIk0$b;
    .locals 1

    const-class v0, LIk0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LIk0$b;

    return-object p0
.end method

.method public static values()[LIk0$b;
    .locals 1

    sget-object v0, LIk0$b;->e:[LIk0$b;

    invoke-virtual {v0}, [LIk0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LIk0$b;

    return-object v0
.end method

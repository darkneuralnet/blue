.class public final enum LB0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LB0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LB0$b;

.field public static final enum c:LB0$b;

.field public static final enum d:LB0$b;

.field public static final enum e:LB0$b;

.field public static final synthetic f:[LB0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LB0$b;

    const-string v1, "READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LB0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LB0$b;->b:LB0$b;

    new-instance v0, LB0$b;

    const-string v1, "NOT_READY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LB0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LB0$b;->c:LB0$b;

    new-instance v0, LB0$b;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LB0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LB0$b;->d:LB0$b;

    new-instance v0, LB0$b;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LB0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LB0$b;->e:LB0$b;

    invoke-static {}, LB0$b;->a()[LB0$b;

    move-result-object v0

    sput-object v0, LB0$b;->f:[LB0$b;

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

.method public static synthetic a()[LB0$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LB0$b;

    const/4 v1, 0x0

    sget-object v2, LB0$b;->b:LB0$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LB0$b;->c:LB0$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LB0$b;->d:LB0$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LB0$b;->e:LB0$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LB0$b;
    .locals 1

    const-class v0, LB0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LB0$b;

    return-object p0
.end method

.method public static values()[LB0$b;
    .locals 1

    sget-object v0, LB0$b;->f:[LB0$b;

    invoke-virtual {v0}, [LB0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LB0$b;

    return-object v0
.end method

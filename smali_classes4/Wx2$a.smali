.class public final enum LWx2$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWx2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LWx2$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LWx2$a;

.field public static final enum c:LWx2$a;

.field public static final enum d:LWx2$a;

.field public static final enum e:LWx2$a;

.field public static final synthetic f:[LWx2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LWx2$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LWx2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWx2$a;->b:LWx2$a;

    new-instance v0, LWx2$a;

    const-string v1, "BASIC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LWx2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWx2$a;->c:LWx2$a;

    new-instance v0, LWx2$a;

    const-string v1, "HEADERS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LWx2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWx2$a;->d:LWx2$a;

    new-instance v0, LWx2$a;

    const-string v1, "BODY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LWx2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWx2$a;->e:LWx2$a;

    invoke-static {}, LWx2$a;->a()[LWx2$a;

    move-result-object v0

    sput-object v0, LWx2$a;->f:[LWx2$a;

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

.method public static synthetic a()[LWx2$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LWx2$a;

    const/4 v1, 0x0

    sget-object v2, LWx2$a;->b:LWx2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LWx2$a;->c:LWx2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LWx2$a;->d:LWx2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LWx2$a;->e:LWx2$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LWx2$a;
    .locals 1

    const-class v0, LWx2$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWx2$a;

    return-object p0
.end method

.method public static values()[LWx2$a;
    .locals 1

    sget-object v0, LWx2$a;->f:[LWx2$a;

    invoke-virtual {v0}, [LWx2$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWx2$a;

    return-object v0
.end method

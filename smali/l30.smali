.class public final enum Ll30;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll30;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ll30;

.field public static final enum c:Ll30;

.field public static final synthetic d:[Ll30;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll30;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll30;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll30;->b:Ll30;

    new-instance v0, Ll30;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll30;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll30;->c:Ll30;

    invoke-static {}, Ll30;->a()[Ll30;

    move-result-object v0

    sput-object v0, Ll30;->d:[Ll30;

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

.method public static synthetic a()[Ll30;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll30;

    const/4 v1, 0x0

    sget-object v2, Ll30;->b:Ll30;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ll30;->c:Ll30;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ll30;
    .locals 1

    const-class v0, Ll30;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll30;

    return-object p0
.end method

.method public static values()[Ll30;
    .locals 1

    sget-object v0, Ll30;->d:[Ll30;

    invoke-virtual {v0}, [Ll30;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll30;

    return-object v0
.end method

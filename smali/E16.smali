.class public final enum LE16;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LE16;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "LE16;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LE16;

.field public static final enum c:LE16;

.field public static final synthetic d:[LE16;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LE16;

    const-string v1, "Filled"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LE16;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE16;->b:LE16;

    new-instance v0, LE16;

    const-string v1, "Outlined"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LE16;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE16;->c:LE16;

    invoke-static {}, LE16;->a()[LE16;

    move-result-object v0

    sput-object v0, LE16;->d:[LE16;

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

.method public static final synthetic a()[LE16;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LE16;

    const/4 v1, 0x0

    sget-object v2, LE16;->b:LE16;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LE16;->c:LE16;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LE16;
    .locals 1

    const-class v0, LE16;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LE16;

    return-object p0
.end method

.method public static values()[LE16;
    .locals 1

    sget-object v0, LE16;->d:[LE16;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LE16;

    return-object v0
.end method

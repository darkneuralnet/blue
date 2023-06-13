.class public final enum LWw;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWw$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LWw;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "LWw;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "a",
        "c",
        "d",
        "e",
        "f",
        "balloon_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final b:LWw$a;

.field public static final enum c:LWw;

.field public static final enum d:LWw;

.field public static final enum e:LWw;

.field public static final enum f:LWw;

.field public static final synthetic g:[LWw;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LWw;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LWw;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWw;->c:LWw;

    new-instance v0, LWw;

    const-string v1, "END"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LWw;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWw;->d:LWw;

    new-instance v0, LWw;

    const-string v1, "TOP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LWw;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWw;->e:LWw;

    new-instance v0, LWw;

    const-string v1, "BOTTOM"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LWw;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWw;->f:LWw;

    invoke-static {}, LWw;->a()[LWw;

    move-result-object v0

    sput-object v0, LWw;->g:[LWw;

    new-instance v0, LWw$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LWw$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LWw;->b:LWw$a;

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

.method public static final synthetic a()[LWw;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LWw;

    const/4 v1, 0x0

    sget-object v2, LWw;->c:LWw;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LWw;->d:LWw;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LWw;->e:LWw;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LWw;->f:LWw;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LWw;
    .locals 1

    const-class v0, LWw;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWw;

    return-object p0
.end method

.method public static values()[LWw;
    .locals 1

    sget-object v0, LWw;->g:[LWw;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWw;

    return-object v0
.end method

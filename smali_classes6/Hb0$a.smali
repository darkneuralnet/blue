.class public final enum LHb0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHb0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LHb0$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0082\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "LHb0$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum b:LHb0$a;

.field public static final enum c:LHb0$a;

.field public static final enum d:LHb0$a;

.field public static final enum e:LHb0$a;

.field public static final synthetic f:[LHb0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LHb0$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LHb0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHb0$a;->b:LHb0$a;

    new-instance v0, LHb0$a;

    const-string v1, "ORBIT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LHb0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHb0$a;->c:LHb0$a;

    new-instance v0, LHb0$a;

    const-string v1, "PAN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LHb0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHb0$a;->d:LHb0$a;

    new-instance v0, LHb0$a;

    const-string v1, "ZOOM"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LHb0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHb0$a;->e:LHb0$a;

    invoke-static {}, LHb0$a;->a()[LHb0$a;

    move-result-object v0

    sput-object v0, LHb0$a;->f:[LHb0$a;

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

.method public static final synthetic a()[LHb0$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LHb0$a;

    const/4 v1, 0x0

    sget-object v2, LHb0$a;->b:LHb0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LHb0$a;->c:LHb0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LHb0$a;->d:LHb0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LHb0$a;->e:LHb0$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LHb0$a;
    .locals 1

    const-class v0, LHb0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LHb0$a;

    return-object p0
.end method

.method public static values()[LHb0$a;
    .locals 1

    sget-object v0, LHb0$a;->f:[LHb0$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LHb0$a;

    return-object v0
.end method

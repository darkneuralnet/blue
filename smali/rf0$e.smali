.class public final enum Lrf0$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrf0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrf0$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lrf0$e;

.field public static final enum c:Lrf0$e;

.field public static final enum d:Lrf0$e;

.field public static final enum e:Lrf0$e;

.field public static final enum f:Lrf0$e;

.field public static final enum g:Lrf0$e;

.field public static final enum h:Lrf0$e;

.field public static final enum i:Lrf0$e;

.field public static final synthetic j:[Lrf0$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrf0$e;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrf0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf0$e;->b:Lrf0$e;

    new-instance v0, Lrf0$e;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrf0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf0$e;->c:Lrf0$e;

    new-instance v0, Lrf0$e;

    const-string v1, "GET_SURFACE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrf0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf0$e;->d:Lrf0$e;

    new-instance v0, Lrf0$e;

    const-string v1, "OPENING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lrf0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf0$e;->e:Lrf0$e;

    new-instance v0, Lrf0$e;

    const-string v1, "OPENED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lrf0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf0$e;->f:Lrf0$e;

    new-instance v0, Lrf0$e;

    const-string v1, "CLOSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lrf0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf0$e;->g:Lrf0$e;

    new-instance v0, Lrf0$e;

    const-string v1, "RELEASING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lrf0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf0$e;->h:Lrf0$e;

    new-instance v0, Lrf0$e;

    const-string v1, "RELEASED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lrf0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf0$e;->i:Lrf0$e;

    invoke-static {}, Lrf0$e;->a()[Lrf0$e;

    move-result-object v0

    sput-object v0, Lrf0$e;->j:[Lrf0$e;

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

.method public static synthetic a()[Lrf0$e;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lrf0$e;

    const/4 v1, 0x0

    sget-object v2, Lrf0$e;->b:Lrf0$e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lrf0$e;->c:Lrf0$e;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lrf0$e;->d:Lrf0$e;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lrf0$e;->e:Lrf0$e;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lrf0$e;->f:Lrf0$e;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lrf0$e;->g:Lrf0$e;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lrf0$e;->h:Lrf0$e;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lrf0$e;->i:Lrf0$e;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrf0$e;
    .locals 1

    const-class v0, Lrf0$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrf0$e;

    return-object p0
.end method

.method public static values()[Lrf0$e;
    .locals 1

    sget-object v0, Lrf0$e;->j:[Lrf0$e;

    invoke-virtual {v0}, [Lrf0$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrf0$e;

    return-object v0
.end method

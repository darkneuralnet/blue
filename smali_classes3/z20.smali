.class public final enum Lz20;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz20;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lz20;",
        "",
        "",
        "toString",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "bridge_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Lz20;

.field public static final enum c:Lz20;

.field public static final enum d:Lz20;

.field public static final enum e:Lz20;

.field public static final enum f:Lz20;

.field public static final enum g:Lz20;

.field public static final synthetic h:[Lz20;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz20;

    const-string v1, "REQUEST_CONTEXT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz20;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz20;->b:Lz20;

    new-instance v0, Lz20;

    const-string v1, "CLOSE_VIEW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz20;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz20;->c:Lz20;

    new-instance v0, Lz20;

    const-string v1, "SHOW_ALERT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz20;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz20;->d:Lz20;

    new-instance v0, Lz20;

    const-string v1, "NAVIGATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lz20;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz20;->e:Lz20;

    new-instance v0, Lz20;

    const-string v1, "SET_TITLE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lz20;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz20;->f:Lz20;

    new-instance v0, Lz20;

    const-string v1, "INCOMPATIBLE_CLIENT_VERSION"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lz20;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz20;->g:Lz20;

    invoke-static {}, Lz20;->a()[Lz20;

    move-result-object v0

    sput-object v0, Lz20;->h:[Lz20;

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

.method public static final synthetic a()[Lz20;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lz20;

    const/4 v1, 0x0

    sget-object v2, Lz20;->b:Lz20;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lz20;->c:Lz20;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lz20;->d:Lz20;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lz20;->e:Lz20;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lz20;->f:Lz20;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lz20;->g:Lz20;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz20;
    .locals 1

    const-class v0, Lz20;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz20;

    return-object p0
.end method

.method public static values()[Lz20;
    .locals 1

    sget-object v0, Lz20;->h:[Lz20;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz20;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LmS5;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

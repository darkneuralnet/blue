.class public final enum LF90$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LF90$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LF90$g;

.field public static final enum c:LF90$g;

.field public static final enum d:LF90$g;

.field public static final enum e:LF90$g;

.field public static final enum f:LF90$g;

.field public static final enum g:LF90$g;

.field public static final enum h:LF90$g;

.field public static final enum i:LF90$g;

.field public static final enum j:LF90$g;

.field public static final synthetic k:[LF90$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LF90$g;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF90$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF90$g;->b:LF90$g;

    new-instance v0, LF90$g;

    const-string v1, "PENDING_OPEN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF90$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF90$g;->c:LF90$g;

    new-instance v0, LF90$g;

    const-string v1, "OPENING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LF90$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF90$g;->d:LF90$g;

    new-instance v0, LF90$g;

    const-string v1, "OPENED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LF90$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF90$g;->e:LF90$g;

    new-instance v0, LF90$g;

    const-string v1, "CONFIGURED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LF90$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF90$g;->f:LF90$g;

    new-instance v0, LF90$g;

    const-string v1, "CLOSING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LF90$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF90$g;->g:LF90$g;

    new-instance v0, LF90$g;

    const-string v1, "REOPENING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LF90$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF90$g;->h:LF90$g;

    new-instance v0, LF90$g;

    const-string v1, "RELEASING"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LF90$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF90$g;->i:LF90$g;

    new-instance v0, LF90$g;

    const-string v1, "RELEASED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LF90$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF90$g;->j:LF90$g;

    invoke-static {}, LF90$g;->a()[LF90$g;

    move-result-object v0

    sput-object v0, LF90$g;->k:[LF90$g;

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

.method public static synthetic a()[LF90$g;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [LF90$g;

    const/4 v1, 0x0

    sget-object v2, LF90$g;->b:LF90$g;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LF90$g;->c:LF90$g;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LF90$g;->d:LF90$g;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LF90$g;->e:LF90$g;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LF90$g;->f:LF90$g;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LF90$g;->g:LF90$g;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LF90$g;->h:LF90$g;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LF90$g;->i:LF90$g;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, LF90$g;->j:LF90$g;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF90$g;
    .locals 1

    const-class v0, LF90$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF90$g;

    return-object p0
.end method

.method public static values()[LF90$g;
    .locals 1

    sget-object v0, LF90$g;->k:[LF90$g;

    invoke-virtual {v0}, [LF90$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF90$g;

    return-object v0
.end method

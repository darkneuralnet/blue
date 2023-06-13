.class public final enum Lfm2$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfm2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfm2$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lfm2$a;

.field public static final enum c:Lfm2$a;

.field public static final enum d:Lfm2$a;

.field public static final enum e:Lfm2$a;

.field public static final enum f:Lfm2$a;

.field public static final enum g:Lfm2$a;

.field public static final enum h:Lfm2$a;

.field public static final synthetic i:[Lfm2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfm2$a;

    const-string v1, "PRE_COMP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfm2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$a;->b:Lfm2$a;

    new-instance v0, Lfm2$a;

    const-string v1, "SOLID"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfm2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$a;->c:Lfm2$a;

    new-instance v0, Lfm2$a;

    const-string v1, "IMAGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfm2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$a;->d:Lfm2$a;

    new-instance v0, Lfm2$a;

    const-string v1, "NULL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lfm2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$a;->e:Lfm2$a;

    new-instance v0, Lfm2$a;

    const-string v1, "SHAPE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lfm2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$a;->f:Lfm2$a;

    new-instance v0, Lfm2$a;

    const-string v1, "TEXT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lfm2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$a;->g:Lfm2$a;

    new-instance v0, Lfm2$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lfm2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$a;->h:Lfm2$a;

    invoke-static {}, Lfm2$a;->a()[Lfm2$a;

    move-result-object v0

    sput-object v0, Lfm2$a;->i:[Lfm2$a;

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

.method public static synthetic a()[Lfm2$a;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lfm2$a;

    const/4 v1, 0x0

    sget-object v2, Lfm2$a;->b:Lfm2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lfm2$a;->c:Lfm2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lfm2$a;->d:Lfm2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lfm2$a;->e:Lfm2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lfm2$a;->f:Lfm2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lfm2$a;->g:Lfm2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lfm2$a;->h:Lfm2$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfm2$a;
    .locals 1

    const-class v0, Lfm2$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfm2$a;

    return-object p0
.end method

.method public static values()[Lfm2$a;
    .locals 1

    sget-object v0, Lfm2$a;->i:[Lfm2$a;

    invoke-virtual {v0}, [Lfm2$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfm2$a;

    return-object v0
.end method

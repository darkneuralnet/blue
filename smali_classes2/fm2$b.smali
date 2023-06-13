.class public final enum Lfm2$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfm2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfm2$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lfm2$b;

.field public static final enum c:Lfm2$b;

.field public static final enum d:Lfm2$b;

.field public static final enum e:Lfm2$b;

.field public static final enum f:Lfm2$b;

.field public static final enum g:Lfm2$b;

.field public static final synthetic h:[Lfm2$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfm2$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfm2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$b;->b:Lfm2$b;

    new-instance v0, Lfm2$b;

    const-string v1, "ADD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfm2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$b;->c:Lfm2$b;

    new-instance v0, Lfm2$b;

    const-string v1, "INVERT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfm2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$b;->d:Lfm2$b;

    new-instance v0, Lfm2$b;

    const-string v1, "LUMA"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lfm2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$b;->e:Lfm2$b;

    new-instance v0, Lfm2$b;

    const-string v1, "LUMA_INVERTED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lfm2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$b;->f:Lfm2$b;

    new-instance v0, Lfm2$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lfm2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm2$b;->g:Lfm2$b;

    invoke-static {}, Lfm2$b;->a()[Lfm2$b;

    move-result-object v0

    sput-object v0, Lfm2$b;->h:[Lfm2$b;

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

.method public static synthetic a()[Lfm2$b;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lfm2$b;

    const/4 v1, 0x0

    sget-object v2, Lfm2$b;->b:Lfm2$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lfm2$b;->c:Lfm2$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lfm2$b;->d:Lfm2$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lfm2$b;->e:Lfm2$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lfm2$b;->f:Lfm2$b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lfm2$b;->g:Lfm2$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfm2$b;
    .locals 1

    const-class v0, Lfm2$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfm2$b;

    return-object p0
.end method

.method public static values()[Lfm2$b;
    .locals 1

    sget-object v0, Lfm2$b;->h:[Lfm2$b;

    invoke-virtual {v0}, [Lfm2$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfm2$b;

    return-object v0
.end method

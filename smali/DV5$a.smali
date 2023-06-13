.class public final enum LDV5$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LDV5$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LDV5$a;

.field public static final enum d:LDV5$a;

.field public static final enum e:LDV5$a;

.field public static final enum f:LDV5$a;

.field public static final enum g:LDV5$a;

.field public static final enum h:LDV5$a;

.field public static final enum i:LDV5$a;

.field public static final synthetic j:[LDV5$a;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LDV5$a;

    const-string v1, "VGA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LDV5$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LDV5$a;->c:LDV5$a;

    new-instance v0, LDV5$a;

    const-string v1, "s720p"

    const/4 v2, 0x1

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, LDV5$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LDV5$a;->d:LDV5$a;

    new-instance v0, LDV5$a;

    const-string v1, "PREVIEW"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v2}, LDV5$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LDV5$a;->e:LDV5$a;

    new-instance v0, LDV5$a;

    const-string v1, "s1440p"

    const/4 v2, 0x3

    const/4 v5, 0x6

    invoke-direct {v0, v1, v2, v5}, LDV5$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LDV5$a;->f:LDV5$a;

    new-instance v0, LDV5$a;

    const-string v1, "RECORD"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6, v4}, LDV5$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LDV5$a;->g:LDV5$a;

    new-instance v0, LDV5$a;

    const-string v1, "MAXIMUM"

    invoke-direct {v0, v1, v3, v2}, LDV5$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LDV5$a;->h:LDV5$a;

    new-instance v0, LDV5$a;

    const-string v1, "NOT_SUPPORT"

    invoke-direct {v0, v1, v5, v6}, LDV5$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LDV5$a;->i:LDV5$a;

    invoke-static {}, LDV5$a;->a()[LDV5$a;

    move-result-object v0

    sput-object v0, LDV5$a;->j:[LDV5$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LDV5$a;->b:I

    return-void
.end method

.method public static synthetic a()[LDV5$a;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [LDV5$a;

    const/4 v1, 0x0

    sget-object v2, LDV5$a;->c:LDV5$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LDV5$a;->d:LDV5$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LDV5$a;->e:LDV5$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LDV5$a;->f:LDV5$a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LDV5$a;->g:LDV5$a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LDV5$a;->h:LDV5$a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LDV5$a;->i:LDV5$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LDV5$a;
    .locals 1

    const-class v0, LDV5$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LDV5$a;

    return-object p0
.end method

.method public static values()[LDV5$a;
    .locals 1

    sget-object v0, LDV5$a;->j:[LDV5$a;

    invoke-virtual {v0}, [LDV5$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LDV5$a;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, LDV5$a;->b:I

    return v0
.end method

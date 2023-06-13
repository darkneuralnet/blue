.class public final enum LUC6$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUC6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LUC6$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LUC6$a;

.field public static final enum c:LUC6$a;

.field public static final enum d:LUC6$a;

.field public static final enum e:LUC6$a;

.field public static final enum f:LUC6$a;

.field public static final enum g:LUC6$a;

.field public static final synthetic h:[LUC6$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LUC6$a;

    const-string v1, "ENQUEUED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LUC6$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUC6$a;->b:LUC6$a;

    new-instance v0, LUC6$a;

    const-string v1, "RUNNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LUC6$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUC6$a;->c:LUC6$a;

    new-instance v0, LUC6$a;

    const-string v1, "SUCCEEDED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LUC6$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUC6$a;->d:LUC6$a;

    new-instance v0, LUC6$a;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LUC6$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUC6$a;->e:LUC6$a;

    new-instance v0, LUC6$a;

    const-string v1, "BLOCKED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LUC6$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUC6$a;->f:LUC6$a;

    new-instance v0, LUC6$a;

    const-string v1, "CANCELLED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LUC6$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUC6$a;->g:LUC6$a;

    invoke-static {}, LUC6$a;->a()[LUC6$a;

    move-result-object v0

    sput-object v0, LUC6$a;->h:[LUC6$a;

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

.method public static synthetic a()[LUC6$a;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LUC6$a;

    const/4 v1, 0x0

    sget-object v2, LUC6$a;->b:LUC6$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LUC6$a;->c:LUC6$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LUC6$a;->d:LUC6$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LUC6$a;->e:LUC6$a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LUC6$a;->f:LUC6$a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LUC6$a;->g:LUC6$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LUC6$a;
    .locals 1

    const-class v0, LUC6$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUC6$a;

    return-object p0
.end method

.method public static values()[LUC6$a;
    .locals 1

    sget-object v0, LUC6$a;->h:[LUC6$a;

    invoke-virtual {v0}, [LUC6$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUC6$a;

    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 1

    sget-object v0, LUC6$a;->d:LUC6$a;

    if-eq p0, v0, :cond_1

    sget-object v0, LUC6$a;->e:LUC6$a;

    if-eq p0, v0, :cond_1

    sget-object v0, LUC6$a;->g:LUC6$a;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

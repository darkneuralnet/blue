.class public abstract enum LT81;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LT81;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LT81;

.field public static final enum c:LT81;

.field public static final enum d:LT81;

.field public static final enum e:LT81;

.field public static final enum f:LT81;

.field public static final enum g:LT81;

.field public static final synthetic h:[LT81;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LT81$a;

    const-string v1, "LINEAR"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LT81$a;-><init>(Ljava/lang/String;ILS81;)V

    sput-object v0, LT81;->b:LT81;

    new-instance v0, LT81$b;

    const-string v1, "CUBIC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, LT81$b;-><init>(Ljava/lang/String;ILU81;)V

    sput-object v0, LT81;->c:LT81;

    new-instance v0, LT81$c;

    const-string v1, "QUART"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v3}, LT81$c;-><init>(Ljava/lang/String;ILV81;)V

    sput-object v0, LT81;->d:LT81;

    new-instance v0, LT81$d;

    const-string v1, "QUAD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, LT81$d;-><init>(Ljava/lang/String;ILW81;)V

    sput-object v0, LT81;->e:LT81;

    new-instance v0, LT81$e;

    const-string v1, "QUINT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v3}, LT81$e;-><init>(Ljava/lang/String;ILX81;)V

    sput-object v0, LT81;->f:LT81;

    new-instance v0, LT81$f;

    const-string v1, "SINE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v3}, LT81$f;-><init>(Ljava/lang/String;ILY81;)V

    sput-object v0, LT81;->g:LT81;

    invoke-static {}, LT81;->a()[LT81;

    move-result-object v0

    sput-object v0, LT81;->h:[LT81;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILZ81;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LT81;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[LT81;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LT81;

    const/4 v1, 0x0

    sget-object v2, LT81;->b:LT81;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LT81;->c:LT81;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LT81;->d:LT81;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LT81;->e:LT81;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LT81;->f:LT81;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LT81;->g:LT81;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LT81;
    .locals 1

    const-class v0, LT81;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LT81;

    return-object p0
.end method

.method public static values()[LT81;
    .locals 1

    sget-object v0, LT81;->h:[LT81;

    invoke-virtual {v0}, [LT81;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LT81;

    return-object v0
.end method


# virtual methods
.method public abstract b()Landroid/animation/TimeInterpolator;
.end method

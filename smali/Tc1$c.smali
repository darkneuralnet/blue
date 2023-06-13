.class public final enum LTc1$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTc1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LTc1$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LTc1$c;

.field public static final enum d:LTc1$c;

.field public static final enum e:LTc1$c;

.field public static final enum f:LTc1$c;

.field public static final enum g:LTc1$c;

.field public static final enum h:LTc1$c;

.field public static final synthetic i:[LTc1$c;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LTc1$c;

    const-string v1, "STRING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LTc1$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTc1$c;->c:LTc1$c;

    new-instance v0, LTc1$c;

    const-string v1, "STRING_SET"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LTc1$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTc1$c;->d:LTc1$c;

    new-instance v0, LTc1$c;

    const-string v1, "INT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, LTc1$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTc1$c;->e:LTc1$c;

    new-instance v0, LTc1$c;

    const-string v1, "LONG"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, LTc1$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTc1$c;->f:LTc1$c;

    new-instance v0, LTc1$c;

    const-string v1, "FLOAT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, LTc1$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTc1$c;->g:LTc1$c;

    new-instance v0, LTc1$c;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, LTc1$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTc1$c;->h:LTc1$c;

    invoke-static {}, LTc1$c;->a()[LTc1$c;

    move-result-object v0

    sput-object v0, LTc1$c;->i:[LTc1$c;

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

    iput p3, p0, LTc1$c;->b:I

    return-void
.end method

.method public static synthetic a()[LTc1$c;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LTc1$c;

    const/4 v1, 0x0

    sget-object v2, LTc1$c;->c:LTc1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LTc1$c;->d:LTc1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LTc1$c;->e:LTc1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LTc1$c;->f:LTc1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LTc1$c;->g:LTc1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LTc1$c;->h:LTc1$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static b(I)LTc1$c;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LTc1$c;->h:LTc1$c;

    return-object p0

    :cond_1
    sget-object p0, LTc1$c;->g:LTc1$c;

    return-object p0

    :cond_2
    sget-object p0, LTc1$c;->f:LTc1$c;

    return-object p0

    :cond_3
    sget-object p0, LTc1$c;->e:LTc1$c;

    return-object p0

    :cond_4
    sget-object p0, LTc1$c;->d:LTc1$c;

    return-object p0

    :cond_5
    sget-object p0, LTc1$c;->c:LTc1$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LTc1$c;
    .locals 1

    const-class v0, LTc1$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LTc1$c;

    return-object p0
.end method

.method public static values()[LTc1$c;
    .locals 1

    sget-object v0, LTc1$c;->i:[LTc1$c;

    invoke-virtual {v0}, [LTc1$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTc1$c;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, LTc1$c;->b:I

    return v0
.end method

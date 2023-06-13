.class public final enum LWF2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LWF2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LWF2;

.field public static final enum d:LWF2;

.field public static final enum e:LWF2;

.field public static final enum f:LWF2;

.field public static final enum g:LWF2;

.field public static final enum h:LWF2;

.field public static final synthetic i:[LWF2;


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, LWF2;

    const/4 v1, -0x1

    const-string v2, "DEFAULT"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LWF2;-><init>(Ljava/lang/String;II)V

    sput-object v0, LWF2;->c:LWF2;

    new-instance v1, LWF2;

    const/16 v2, 0xa

    const-string v4, "PAYPAL"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LWF2;-><init>(Ljava/lang/String;II)V

    sput-object v1, LWF2;->d:LWF2;

    new-instance v2, LWF2;

    const/16 v4, 0xb

    const-string v6, "EBAY"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LWF2;-><init>(Ljava/lang/String;II)V

    sput-object v2, LWF2;->e:LWF2;

    new-instance v4, LWF2;

    const/16 v6, 0xc

    const-string v8, "BRAINTREE"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, LWF2;-><init>(Ljava/lang/String;II)V

    sput-object v4, LWF2;->f:LWF2;

    new-instance v6, LWF2;

    const/16 v8, 0x11

    const-string v10, "SIMILITY"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, LWF2;-><init>(Ljava/lang/String;II)V

    sput-object v6, LWF2;->g:LWF2;

    new-instance v8, LWF2;

    const/16 v10, 0x12

    const-string v12, "VENMO"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, LWF2;-><init>(Ljava/lang/String;II)V

    sput-object v8, LWF2;->h:LWF2;

    const/4 v10, 0x6

    new-array v10, v10, [LWF2;

    aput-object v0, v10, v3

    aput-object v1, v10, v5

    aput-object v2, v10, v7

    aput-object v4, v10, v9

    aput-object v6, v10, v11

    aput-object v8, v10, v13

    sput-object v10, LWF2;->i:[LWF2;

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

    iput p3, p0, LWF2;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LWF2;
    .locals 1

    const-class v0, LWF2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWF2;

    return-object p0
.end method

.method public static values()[LWF2;
    .locals 1

    sget-object v0, LWF2;->i:[LWF2;

    invoke-virtual {v0}, [LWF2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWF2;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LWF2;->b:I

    return v0
.end method

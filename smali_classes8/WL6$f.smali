.class public final enum LWL6$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWL6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LWL6$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LWL6$f;

.field public static final enum d:LWL6$f;

.field public static final enum e:LWL6$f;

.field public static final enum f:LWL6$f;

.field public static final enum g:LWL6$f;

.field public static final enum h:LWL6$f;

.field public static final enum i:LWL6$f;

.field public static final enum j:LWL6$f;

.field public static final enum k:LWL6$f;

.field public static final enum l:LWL6$f;

.field public static final enum m:LWL6$f;

.field public static final enum n:LWL6$f;

.field public static final synthetic o:[LWL6$f;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LWL6$f;

    const-string v1, "version"

    const-string v2, "VERSION"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LWL6$f;->c:LWL6$f;

    new-instance v1, LWL6$f;

    const-string v2, "board"

    const-string v4, "BOARD"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWL6$f;->d:LWL6$f;

    new-instance v2, LWL6$f;

    const-string v4, "bootloader"

    const-string v6, "BOOTLOADER"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LWL6$f;->e:LWL6$f;

    new-instance v4, LWL6$f;

    const-string v6, "cpu_abi1"

    const-string v8, "CPU_ABI1"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, LWL6$f;->f:LWL6$f;

    new-instance v6, LWL6$f;

    const-string v8, "display"

    const-string v10, "DISPLAY"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, LWL6$f;->g:LWL6$f;

    new-instance v8, LWL6$f;

    const-string v10, "radio"

    const-string v12, "RADIO"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, LWL6$f;->h:LWL6$f;

    new-instance v10, LWL6$f;

    const-string v12, "fingerprint"

    const-string v14, "FINGERPRINT"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, LWL6$f;->i:LWL6$f;

    new-instance v12, LWL6$f;

    const-string v14, "hardware"

    const-string v15, "HARDWARE"

    const/4 v13, 0x7

    invoke-direct {v12, v15, v13, v14}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, LWL6$f;->j:LWL6$f;

    new-instance v14, LWL6$f;

    const-string v15, "manufacturer"

    const-string v13, "MANUFACTURER"

    const/16 v11, 0x8

    invoke-direct {v14, v13, v11, v15}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, LWL6$f;->k:LWL6$f;

    new-instance v13, LWL6$f;

    const-string v15, "product"

    const-string v11, "PRODUCT"

    const/16 v9, 0x9

    invoke-direct {v13, v11, v9, v15}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, LWL6$f;->l:LWL6$f;

    new-instance v11, LWL6$f;

    const-string v15, "time"

    const-string v9, "TIME"

    const/16 v7, 0xa

    invoke-direct {v11, v9, v7, v15}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, LWL6$f;->m:LWL6$f;

    new-instance v9, LWL6$f;

    const-string v15, "system_type"

    const-string v7, "SYSTEM_TYPE"

    const/16 v5, 0xb

    invoke-direct {v9, v7, v5, v15}, LWL6$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, LWL6$f;->n:LWL6$f;

    const/16 v7, 0xc

    new-array v7, v7, [LWL6$f;

    aput-object v0, v7, v3

    const/4 v0, 0x1

    aput-object v1, v7, v0

    const/4 v0, 0x2

    aput-object v2, v7, v0

    const/4 v0, 0x3

    aput-object v4, v7, v0

    const/4 v0, 0x4

    aput-object v6, v7, v0

    const/4 v0, 0x5

    aput-object v8, v7, v0

    const/4 v0, 0x6

    aput-object v10, v7, v0

    const/4 v0, 0x7

    aput-object v12, v7, v0

    const/16 v0, 0x8

    aput-object v14, v7, v0

    const/16 v0, 0x9

    aput-object v13, v7, v0

    const/16 v0, 0xa

    aput-object v11, v7, v0

    aput-object v9, v7, v5

    sput-object v7, LWL6$f;->o:[LWL6$f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LWL6$f;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LWL6$f;
    .locals 1

    const-class v0, LWL6$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWL6$f;

    return-object p0
.end method

.method public static values()[LWL6$f;
    .locals 1

    sget-object v0, LWL6$f;->o:[LWL6$f;

    invoke-virtual {v0}, [LWL6$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWL6$f;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LWL6$f;->b:Ljava/lang/String;

    return-object v0
.end method

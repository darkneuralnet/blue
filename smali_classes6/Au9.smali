.class public final enum LAu9;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LQm9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LAu9;",
        ">;",
        "LQm9;"
    }
.end annotation


# static fields
.field public static final enum c:LAu9;

.field public static final enum d:LAu9;

.field public static final enum e:LAu9;

.field public static final enum f:LAu9;

.field public static final enum g:LAu9;

.field public static final enum h:LAu9;

.field public static final enum i:LAu9;

.field public static final enum j:LAu9;

.field public static final enum k:LAu9;

.field public static final l:LWm9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWm9<",
            "LAu9;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic m:[LAu9;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LAu9;

    const-string v1, "MOBILE_SIGNALS_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LAu9;-><init>(Ljava/lang/String;II)V

    sput-object v0, LAu9;->c:LAu9;

    new-instance v1, LAu9;

    const-string v3, "BATTERY_LEVEL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LAu9;-><init>(Ljava/lang/String;II)V

    sput-object v1, LAu9;->d:LAu9;

    new-instance v3, LAu9;

    const-string v5, "FOREGROUND_VOLUME_PERCENTAGE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LAu9;-><init>(Ljava/lang/String;II)V

    sput-object v3, LAu9;->e:LAu9;

    new-instance v5, LAu9;

    const-string v7, "AVAILABLE_RAM_PERCENTAGE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LAu9;-><init>(Ljava/lang/String;II)V

    sput-object v5, LAu9;->f:LAu9;

    new-instance v7, LAu9;

    const-string v9, "APP_VERSION"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, LAu9;-><init>(Ljava/lang/String;II)V

    sput-object v7, LAu9;->g:LAu9;

    new-instance v9, LAu9;

    const-string v11, "APP_PERMISSIONS"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, LAu9;-><init>(Ljava/lang/String;II)V

    sput-object v9, LAu9;->h:LAu9;

    new-instance v11, LAu9;

    const-string v13, "SCREEN_BRIGHTNESS"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, LAu9;-><init>(Ljava/lang/String;II)V

    sput-object v11, LAu9;->i:LAu9;

    new-instance v13, LAu9;

    const-string v15, "ACTIVITY_NAME"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v14}, LAu9;-><init>(Ljava/lang/String;II)V

    sput-object v13, LAu9;->j:LAu9;

    new-instance v15, LAu9;

    const/4 v14, -0x1

    const-string v12, "UNRECOGNIZED"

    const/16 v10, 0x8

    invoke-direct {v15, v12, v10, v14}, LAu9;-><init>(Ljava/lang/String;II)V

    sput-object v15, LAu9;->k:LAu9;

    const/16 v12, 0x9

    new-array v12, v12, [LAu9;

    aput-object v0, v12, v2

    aput-object v1, v12, v4

    aput-object v3, v12, v6

    aput-object v5, v12, v8

    const/4 v0, 0x4

    aput-object v7, v12, v0

    const/4 v0, 0x5

    aput-object v9, v12, v0

    const/4 v0, 0x6

    aput-object v11, v12, v0

    const/4 v0, 0x7

    aput-object v13, v12, v0

    aput-object v15, v12, v10

    sput-object v12, LAu9;->m:[LAu9;

    new-instance v0, Lyu9;

    invoke-direct {v0}, Lyu9;-><init>()V

    sput-object v0, LAu9;->l:LWm9;

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

    iput p3, p0, LAu9;->b:I

    return-void
.end method

.method public static a(I)LAu9;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LAu9;->j:LAu9;

    return-object p0

    :pswitch_1
    sget-object p0, LAu9;->i:LAu9;

    return-object p0

    :pswitch_2
    sget-object p0, LAu9;->h:LAu9;

    return-object p0

    :pswitch_3
    sget-object p0, LAu9;->g:LAu9;

    return-object p0

    :pswitch_4
    sget-object p0, LAu9;->f:LAu9;

    return-object p0

    :pswitch_5
    sget-object p0, LAu9;->e:LAu9;

    return-object p0

    :pswitch_6
    sget-object p0, LAu9;->d:LAu9;

    return-object p0

    :pswitch_7
    sget-object p0, LAu9;->c:LAu9;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static values()[LAu9;
    .locals 1

    sget-object v0, LAu9;->m:[LAu9;

    invoke-virtual {v0}, [LAu9;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LAu9;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, LAu9;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, LAu9;->k:LAu9;

    if-eq p0, v1, :cond_0

    const-string v1, " number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LAu9;->zza()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, " name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 2

    sget-object v0, LAu9;->k:LAu9;

    if-eq p0, v0, :cond_0

    iget v0, p0, LAu9;->b:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

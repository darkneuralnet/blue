.class public final enum LS94;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LS94;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LS94;

.field public static final enum d:LS94;

.field public static final enum e:LS94;

.field public static final enum f:LS94;

.field public static final synthetic g:[LS94;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, LS94;

    const-string v1, "0.0"

    const-string v2, "v0"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LS94;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LS94;->c:LS94;

    new-instance v1, LS94;

    const-string v2, "1.0"

    const-string v4, "v1"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LS94;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LS94;->d:LS94;

    new-instance v2, LS94;

    const-string v4, "2.0"

    const-string v6, "v2"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LS94;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LS94;->e:LS94;

    new-instance v4, LS94;

    const-string v6, "3.0"

    const-string v8, "v3"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, LS94;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, LS94;->f:LS94;

    const/4 v6, 0x4

    new-array v6, v6, [LS94;

    aput-object v0, v6, v3

    aput-object v1, v6, v5

    aput-object v2, v6, v7

    aput-object v4, v6, v9

    sput-object v6, LS94;->g:[LS94;

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

    iput-object p3, p0, LS94;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)LS94;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v0, "3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    goto :goto_0

    :pswitch_1
    const-string v0, "2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    :pswitch_2
    const-string v0, "1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :pswitch_3
    const-string v0, "0"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_1

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid protocol"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_4
    sget-object p0, LS94;->f:LS94;

    return-object p0

    :pswitch_5
    sget-object p0, LS94;->e:LS94;

    return-object p0

    :pswitch_6
    sget-object p0, LS94;->d:LS94;

    return-object p0

    :pswitch_7
    sget-object p0, LS94;->c:LS94;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)LS94;
    .locals 1

    const-class v0, LS94;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS94;

    return-object p0
.end method

.method public static values()[LS94;
    .locals 1

    sget-object v0, LS94;->g:[LS94;

    invoke-virtual {v0}, [LS94;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS94;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LS94;->b:Ljava/lang/String;

    return-object v0
.end method

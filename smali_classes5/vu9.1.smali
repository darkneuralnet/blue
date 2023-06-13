.class public final Lvu9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liu7;


# static fields
.field public static final a:Liu7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvu9;

    invoke-direct {v0}, Lvu9;-><init>()V

    sput-object v0, Lvu9;->a:Liu7;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I)Z
    .locals 1

    const/16 v0, 0x190

    if-eq p1, v0, :cond_0

    const/16 v0, 0x191

    if-eq p1, v0, :cond_0

    const/16 v0, 0x193

    if-eq p1, v0, :cond_0

    const/16 v0, 0x194

    if-eq p1, v0, :cond_0

    const/16 v0, 0x198

    if-eq p1, v0, :cond_0

    const/16 v0, 0x199

    if-eq p1, v0, :cond_0

    const/16 v0, 0x1ad

    if-eq p1, v0, :cond_0

    const/16 v0, 0x1ff

    if-eq p1, v0, :cond_0

    const/16 v0, 0x1f7

    if-eq p1, v0, :cond_0

    const/16 v0, 0x1f8

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    const/4 p1, 0x0

    return p1

    :cond_0
    :pswitch_0
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1f3
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

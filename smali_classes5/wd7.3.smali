.class public final Lwd7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb7;


# static fields
.field public static final a:Ljb7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwd7;

    invoke-direct {v0}, Lwd7;-><init>()V

    sput-object v0, Lwd7;->a:Ljb7;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    const/4 p1, 0x1

    return p1

    nop

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
    .end packed-switch
.end method

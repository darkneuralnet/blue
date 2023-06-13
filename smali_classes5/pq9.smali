.class public final Lpq9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liu7;


# static fields
.field public static final a:Liu7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpq9;

    invoke-direct {v0}, Lpq9;-><init>()V

    sput-object v0, Lpq9;->a:Liu7;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    if-eq p1, v0, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    sparse-switch p1, :sswitch_data_0

    const/4 p1, 0x0

    return p1

    :cond_0
    :sswitch_0
    return v0

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x8 -> :sswitch_0
        0x10 -> :sswitch_0
        0x20 -> :sswitch_0
        0x40 -> :sswitch_0
        0x80 -> :sswitch_0
        0x100 -> :sswitch_0
        0x200 -> :sswitch_0
        0x400 -> :sswitch_0
        0x800 -> :sswitch_0
        0x1000 -> :sswitch_0
    .end sparse-switch
.end method

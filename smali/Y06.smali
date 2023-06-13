.class public final LY06;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY06$f;,
        LY06$a;,
        LY06$b;,
        LY06$c;,
        LY06$e;,
        LY06$d;
    }
.end annotation


# static fields
.field public static final a:LX06;

.field public static final b:LX06;

.field public static final c:LX06;

.field public static final d:LX06;

.field public static final e:LX06;

.field public static final f:LX06;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LY06$e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LY06$e;-><init>(LY06$c;Z)V

    sput-object v0, LY06;->a:LX06;

    new-instance v0, LY06$e;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, LY06$e;-><init>(LY06$c;Z)V

    sput-object v0, LY06;->b:LX06;

    new-instance v0, LY06$e;

    sget-object v1, LY06$b;->a:LY06$b;

    invoke-direct {v0, v1, v2}, LY06$e;-><init>(LY06$c;Z)V

    sput-object v0, LY06;->c:LX06;

    new-instance v0, LY06$e;

    invoke-direct {v0, v1, v3}, LY06$e;-><init>(LY06$c;Z)V

    sput-object v0, LY06;->d:LX06;

    new-instance v0, LY06$e;

    sget-object v1, LY06$a;->b:LY06$a;

    invoke-direct {v0, v1, v2}, LY06$e;-><init>(LY06$c;Z)V

    sput-object v0, LY06;->e:LX06;

    sget-object v0, LY06$f;->b:LY06$f;

    sput-object v0, LY06;->f:LX06;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v0
.end method

.method public static b(I)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    packed-switch p0, :pswitch_data_0

    return v1

    :cond_0
    :pswitch_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :pswitch_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

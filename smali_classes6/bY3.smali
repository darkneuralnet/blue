.class public LbY3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LbY3$b;
    }
.end annotation


# static fields
.field public static final a:LHh1;

.field public static volatile b:LHh1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LbY3$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LbY3$b;-><init>(LbY3$a;)V

    sput-object v0, LbY3;->a:LHh1;

    sput-object v0, LbY3;->b:LHh1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LHh1;
    .locals 1

    sget-object v0, LbY3;->b:LHh1;

    return-object v0
.end method

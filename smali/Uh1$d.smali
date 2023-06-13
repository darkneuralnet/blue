.class public final LUh1$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUh1$d$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(D)LUh1$d$a;
    .locals 3

    new-instance v0, LUh1$d$a;

    const-wide v1, 0x3fe3e2456f75d9a1L    # 0.621371

    mul-double/2addr p0, v1

    invoke-direct {v0, p0, p1}, LUh1$d$a;-><init>(D)V

    return-object v0
.end method

.method public static b(D)LUh1$d$a;
    .locals 3

    new-instance v0, LUh1$d$a;

    const-wide v1, 0x3ff269984a0e410bL    # 1.15078

    mul-double/2addr p0, v1

    invoke-direct {v0, p0, p1}, LUh1$d$a;-><init>(D)V

    return-object v0
.end method

.method public static c(D)LUh1$d$a;
    .locals 1

    new-instance v0, LUh1$d$a;

    invoke-direct {v0, p0, p1}, LUh1$d$a;-><init>(D)V

    return-object v0
.end method
